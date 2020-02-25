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
package com.amazonaws.services.applicationinsights;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Application Insights asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudWatch Application Insights for .NET and SQL Server</fullname>
 * <p>
 * Amazon CloudWatch Application Insights for .NET and SQL Server is a service that helps you detect common problems
 * with your .NET and SQL Server-based applications. It enables you to pinpoint the source of issues in your
 * applications (built with technologies such as Microsoft IIS, .NET, and Microsoft SQL Server), by providing key
 * insights into detected problems.
 * </p>
 * <p>
 * After you onboard your application, CloudWatch Application Insights for .NET and SQL Server identifies, recommends,
 * and sets up metrics and logs. It continuously analyzes and correlates your metrics and logs for unusual behavior to
 * surface actionable problems with your application. For example, if your application is slow and unresponsive and
 * leading to HTTP 500 errors in your Application Load Balancer (ALB), Application Insights informs you that a memory
 * pressure problem with your SQL Server database is occurring. It bases this analysis on impactful metrics and log
 * errors.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApplicationInsightsAsyncClient extends AmazonApplicationInsightsClient implements AmazonApplicationInsightsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonApplicationInsightsAsyncClientBuilder asyncBuilder() {
        return AmazonApplicationInsightsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Application Insights using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonApplicationInsightsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request) {

        return createComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(final CreateComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler) {
        final CreateComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateComponentResult>() {
            @Override
            public CreateComponentResult call() throws Exception {
                CreateComponentResult result = null;

                try {
                    result = executeCreateComponent(finalRequest);
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
    public java.util.concurrent.Future<CreateLogPatternResult> createLogPatternAsync(CreateLogPatternRequest request) {

        return createLogPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogPatternResult> createLogPatternAsync(final CreateLogPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLogPatternRequest, CreateLogPatternResult> asyncHandler) {
        final CreateLogPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLogPatternResult>() {
            @Override
            public CreateLogPatternResult call() throws Exception {
                CreateLogPatternResult result = null;

                try {
                    result = executeCreateLogPattern(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(final DeleteComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {
        final DeleteComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteComponentResult>() {
            @Override
            public DeleteComponentResult call() throws Exception {
                DeleteComponentResult result = null;

                try {
                    result = executeDeleteComponent(finalRequest);
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
    public java.util.concurrent.Future<DeleteLogPatternResult> deleteLogPatternAsync(DeleteLogPatternRequest request) {

        return deleteLogPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogPatternResult> deleteLogPatternAsync(final DeleteLogPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLogPatternRequest, DeleteLogPatternResult> asyncHandler) {
        final DeleteLogPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLogPatternResult>() {
            @Override
            public DeleteLogPatternResult call() throws Exception {
                DeleteLogPatternResult result = null;

                try {
                    result = executeDeleteLogPattern(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(final DescribeApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {
        final DescribeApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationResult>() {
            @Override
            public DescribeApplicationResult call() throws Exception {
                DescribeApplicationResult result = null;

                try {
                    result = executeDescribeApplication(finalRequest);
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
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest request) {

        return describeComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(final DescribeComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComponentRequest, DescribeComponentResult> asyncHandler) {
        final DescribeComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeComponentResult>() {
            @Override
            public DescribeComponentResult call() throws Exception {
                DescribeComponentResult result = null;

                try {
                    result = executeDescribeComponent(finalRequest);
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
    public java.util.concurrent.Future<DescribeComponentConfigurationResult> describeComponentConfigurationAsync(DescribeComponentConfigurationRequest request) {

        return describeComponentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentConfigurationResult> describeComponentConfigurationAsync(
            final DescribeComponentConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComponentConfigurationRequest, DescribeComponentConfigurationResult> asyncHandler) {
        final DescribeComponentConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeComponentConfigurationResult>() {
            @Override
            public DescribeComponentConfigurationResult call() throws Exception {
                DescribeComponentConfigurationResult result = null;

                try {
                    result = executeDescribeComponentConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeComponentConfigurationRecommendationResult> describeComponentConfigurationRecommendationAsync(
            DescribeComponentConfigurationRecommendationRequest request) {

        return describeComponentConfigurationRecommendationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComponentConfigurationRecommendationResult> describeComponentConfigurationRecommendationAsync(
            final DescribeComponentConfigurationRecommendationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComponentConfigurationRecommendationRequest, DescribeComponentConfigurationRecommendationResult> asyncHandler) {
        final DescribeComponentConfigurationRecommendationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeComponentConfigurationRecommendationResult>() {
            @Override
            public DescribeComponentConfigurationRecommendationResult call() throws Exception {
                DescribeComponentConfigurationRecommendationResult result = null;

                try {
                    result = executeDescribeComponentConfigurationRecommendation(finalRequest);
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
    public java.util.concurrent.Future<DescribeLogPatternResult> describeLogPatternAsync(DescribeLogPatternRequest request) {

        return describeLogPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogPatternResult> describeLogPatternAsync(final DescribeLogPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLogPatternRequest, DescribeLogPatternResult> asyncHandler) {
        final DescribeLogPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLogPatternResult>() {
            @Override
            public DescribeLogPatternResult call() throws Exception {
                DescribeLogPatternResult result = null;

                try {
                    result = executeDescribeLogPattern(finalRequest);
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
    public java.util.concurrent.Future<DescribeObservationResult> describeObservationAsync(DescribeObservationRequest request) {

        return describeObservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeObservationResult> describeObservationAsync(final DescribeObservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeObservationRequest, DescribeObservationResult> asyncHandler) {
        final DescribeObservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeObservationResult>() {
            @Override
            public DescribeObservationResult call() throws Exception {
                DescribeObservationResult result = null;

                try {
                    result = executeDescribeObservation(finalRequest);
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
    public java.util.concurrent.Future<DescribeProblemResult> describeProblemAsync(DescribeProblemRequest request) {

        return describeProblemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProblemResult> describeProblemAsync(final DescribeProblemRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProblemRequest, DescribeProblemResult> asyncHandler) {
        final DescribeProblemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProblemResult>() {
            @Override
            public DescribeProblemResult call() throws Exception {
                DescribeProblemResult result = null;

                try {
                    result = executeDescribeProblem(finalRequest);
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
    public java.util.concurrent.Future<DescribeProblemObservationsResult> describeProblemObservationsAsync(DescribeProblemObservationsRequest request) {

        return describeProblemObservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProblemObservationsResult> describeProblemObservationsAsync(final DescribeProblemObservationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProblemObservationsRequest, DescribeProblemObservationsResult> asyncHandler) {
        final DescribeProblemObservationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProblemObservationsResult>() {
            @Override
            public DescribeProblemObservationsResult call() throws Exception {
                DescribeProblemObservationsResult result = null;

                try {
                    result = executeDescribeProblemObservations(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(final ListComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {
        final ListComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentsResult>() {
            @Override
            public ListComponentsResult call() throws Exception {
                ListComponentsResult result = null;

                try {
                    result = executeListComponents(finalRequest);
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
    public java.util.concurrent.Future<ListConfigurationHistoryResult> listConfigurationHistoryAsync(ListConfigurationHistoryRequest request) {

        return listConfigurationHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationHistoryResult> listConfigurationHistoryAsync(final ListConfigurationHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationHistoryRequest, ListConfigurationHistoryResult> asyncHandler) {
        final ListConfigurationHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationHistoryResult>() {
            @Override
            public ListConfigurationHistoryResult call() throws Exception {
                ListConfigurationHistoryResult result = null;

                try {
                    result = executeListConfigurationHistory(finalRequest);
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
    public java.util.concurrent.Future<ListLogPatternSetsResult> listLogPatternSetsAsync(ListLogPatternSetsRequest request) {

        return listLogPatternSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLogPatternSetsResult> listLogPatternSetsAsync(final ListLogPatternSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLogPatternSetsRequest, ListLogPatternSetsResult> asyncHandler) {
        final ListLogPatternSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLogPatternSetsResult>() {
            @Override
            public ListLogPatternSetsResult call() throws Exception {
                ListLogPatternSetsResult result = null;

                try {
                    result = executeListLogPatternSets(finalRequest);
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
    public java.util.concurrent.Future<ListLogPatternsResult> listLogPatternsAsync(ListLogPatternsRequest request) {

        return listLogPatternsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLogPatternsResult> listLogPatternsAsync(final ListLogPatternsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLogPatternsRequest, ListLogPatternsResult> asyncHandler) {
        final ListLogPatternsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLogPatternsResult>() {
            @Override
            public ListLogPatternsResult call() throws Exception {
                ListLogPatternsResult result = null;

                try {
                    result = executeListLogPatterns(finalRequest);
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
    public java.util.concurrent.Future<ListProblemsResult> listProblemsAsync(ListProblemsRequest request) {

        return listProblemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProblemsResult> listProblemsAsync(final ListProblemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProblemsRequest, ListProblemsResult> asyncHandler) {
        final ListProblemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProblemsResult>() {
            @Override
            public ListProblemsResult call() throws Exception {
                ListProblemsResult result = null;

                try {
                    result = executeListProblems(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest request) {

        return updateComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(final UpdateComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateComponentRequest, UpdateComponentResult> asyncHandler) {
        final UpdateComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateComponentResult>() {
            @Override
            public UpdateComponentResult call() throws Exception {
                UpdateComponentResult result = null;

                try {
                    result = executeUpdateComponent(finalRequest);
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
    public java.util.concurrent.Future<UpdateComponentConfigurationResult> updateComponentConfigurationAsync(UpdateComponentConfigurationRequest request) {

        return updateComponentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentConfigurationResult> updateComponentConfigurationAsync(final UpdateComponentConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResult> asyncHandler) {
        final UpdateComponentConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateComponentConfigurationResult>() {
            @Override
            public UpdateComponentConfigurationResult call() throws Exception {
                UpdateComponentConfigurationResult result = null;

                try {
                    result = executeUpdateComponentConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateLogPatternResult> updateLogPatternAsync(UpdateLogPatternRequest request) {

        return updateLogPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogPatternResult> updateLogPatternAsync(final UpdateLogPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLogPatternRequest, UpdateLogPatternResult> asyncHandler) {
        final UpdateLogPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLogPatternResult>() {
            @Override
            public UpdateLogPatternResult call() throws Exception {
                UpdateLogPatternResult result = null;

                try {
                    result = executeUpdateLogPattern(finalRequest);
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
