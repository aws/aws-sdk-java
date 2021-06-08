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
package com.amazonaws.services.lookoutmetrics;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutmetrics.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing LookoutMetrics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>Amazon Lookout for Metrics API Reference</i>. For an introduction to the service with tutorials for
 * getting started, visit <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev">Amazon Lookout for Metrics
 * Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLookoutMetricsAsyncClient extends AmazonLookoutMetricsClient implements AmazonLookoutMetricsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLookoutMetricsAsyncClientBuilder asyncBuilder() {
        return AmazonLookoutMetricsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on LookoutMetrics using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLookoutMetricsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on LookoutMetrics using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonLookoutMetricsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ActivateAnomalyDetectorResult> activateAnomalyDetectorAsync(ActivateAnomalyDetectorRequest request) {

        return activateAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateAnomalyDetectorResult> activateAnomalyDetectorAsync(final ActivateAnomalyDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateAnomalyDetectorRequest, ActivateAnomalyDetectorResult> asyncHandler) {
        final ActivateAnomalyDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateAnomalyDetectorResult>() {
            @Override
            public ActivateAnomalyDetectorResult call() throws Exception {
                ActivateAnomalyDetectorResult result = null;

                try {
                    result = executeActivateAnomalyDetector(finalRequest);
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
    public java.util.concurrent.Future<BackTestAnomalyDetectorResult> backTestAnomalyDetectorAsync(BackTestAnomalyDetectorRequest request) {

        return backTestAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BackTestAnomalyDetectorResult> backTestAnomalyDetectorAsync(final BackTestAnomalyDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<BackTestAnomalyDetectorRequest, BackTestAnomalyDetectorResult> asyncHandler) {
        final BackTestAnomalyDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BackTestAnomalyDetectorResult>() {
            @Override
            public BackTestAnomalyDetectorResult call() throws Exception {
                BackTestAnomalyDetectorResult result = null;

                try {
                    result = executeBackTestAnomalyDetector(finalRequest);
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
    public java.util.concurrent.Future<CreateAlertResult> createAlertAsync(CreateAlertRequest request) {

        return createAlertAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAlertResult> createAlertAsync(final CreateAlertRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAlertRequest, CreateAlertResult> asyncHandler) {
        final CreateAlertRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAlertResult>() {
            @Override
            public CreateAlertResult call() throws Exception {
                CreateAlertResult result = null;

                try {
                    result = executeCreateAlert(finalRequest);
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
    public java.util.concurrent.Future<CreateAnomalyDetectorResult> createAnomalyDetectorAsync(CreateAnomalyDetectorRequest request) {

        return createAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnomalyDetectorResult> createAnomalyDetectorAsync(final CreateAnomalyDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnomalyDetectorRequest, CreateAnomalyDetectorResult> asyncHandler) {
        final CreateAnomalyDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnomalyDetectorResult>() {
            @Override
            public CreateAnomalyDetectorResult call() throws Exception {
                CreateAnomalyDetectorResult result = null;

                try {
                    result = executeCreateAnomalyDetector(finalRequest);
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
    public java.util.concurrent.Future<CreateMetricSetResult> createMetricSetAsync(CreateMetricSetRequest request) {

        return createMetricSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMetricSetResult> createMetricSetAsync(final CreateMetricSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMetricSetRequest, CreateMetricSetResult> asyncHandler) {
        final CreateMetricSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMetricSetResult>() {
            @Override
            public CreateMetricSetResult call() throws Exception {
                CreateMetricSetResult result = null;

                try {
                    result = executeCreateMetricSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteAlertResult> deleteAlertAsync(DeleteAlertRequest request) {

        return deleteAlertAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertResult> deleteAlertAsync(final DeleteAlertRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAlertRequest, DeleteAlertResult> asyncHandler) {
        final DeleteAlertRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAlertResult>() {
            @Override
            public DeleteAlertResult call() throws Exception {
                DeleteAlertResult result = null;

                try {
                    result = executeDeleteAlert(finalRequest);
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
    public java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest request) {

        return deleteAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(final DeleteAnomalyDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnomalyDetectorRequest, DeleteAnomalyDetectorResult> asyncHandler) {
        final DeleteAnomalyDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnomalyDetectorResult>() {
            @Override
            public DeleteAnomalyDetectorResult call() throws Exception {
                DeleteAnomalyDetectorResult result = null;

                try {
                    result = executeDeleteAnomalyDetector(finalRequest);
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
    public java.util.concurrent.Future<DescribeAlertResult> describeAlertAsync(DescribeAlertRequest request) {

        return describeAlertAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlertResult> describeAlertAsync(final DescribeAlertRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlertRequest, DescribeAlertResult> asyncHandler) {
        final DescribeAlertRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlertResult>() {
            @Override
            public DescribeAlertResult call() throws Exception {
                DescribeAlertResult result = null;

                try {
                    result = executeDescribeAlert(finalRequest);
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
    public java.util.concurrent.Future<DescribeAnomalyDetectionExecutionsResult> describeAnomalyDetectionExecutionsAsync(
            DescribeAnomalyDetectionExecutionsRequest request) {

        return describeAnomalyDetectionExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyDetectionExecutionsResult> describeAnomalyDetectionExecutionsAsync(
            final DescribeAnomalyDetectionExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectionExecutionsRequest, DescribeAnomalyDetectionExecutionsResult> asyncHandler) {
        final DescribeAnomalyDetectionExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAnomalyDetectionExecutionsResult>() {
            @Override
            public DescribeAnomalyDetectionExecutionsResult call() throws Exception {
                DescribeAnomalyDetectionExecutionsResult result = null;

                try {
                    result = executeDescribeAnomalyDetectionExecutions(finalRequest);
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
    public java.util.concurrent.Future<DescribeAnomalyDetectorResult> describeAnomalyDetectorAsync(DescribeAnomalyDetectorRequest request) {

        return describeAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnomalyDetectorResult> describeAnomalyDetectorAsync(final DescribeAnomalyDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectorRequest, DescribeAnomalyDetectorResult> asyncHandler) {
        final DescribeAnomalyDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAnomalyDetectorResult>() {
            @Override
            public DescribeAnomalyDetectorResult call() throws Exception {
                DescribeAnomalyDetectorResult result = null;

                try {
                    result = executeDescribeAnomalyDetector(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetricSetResult> describeMetricSetAsync(DescribeMetricSetRequest request) {

        return describeMetricSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricSetResult> describeMetricSetAsync(final DescribeMetricSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetricSetRequest, DescribeMetricSetResult> asyncHandler) {
        final DescribeMetricSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetricSetResult>() {
            @Override
            public DescribeMetricSetResult call() throws Exception {
                DescribeMetricSetResult result = null;

                try {
                    result = executeDescribeMetricSet(finalRequest);
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
    public java.util.concurrent.Future<GetAnomalyGroupResult> getAnomalyGroupAsync(GetAnomalyGroupRequest request) {

        return getAnomalyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnomalyGroupResult> getAnomalyGroupAsync(final GetAnomalyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnomalyGroupRequest, GetAnomalyGroupResult> asyncHandler) {
        final GetAnomalyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnomalyGroupResult>() {
            @Override
            public GetAnomalyGroupResult call() throws Exception {
                GetAnomalyGroupResult result = null;

                try {
                    result = executeGetAnomalyGroup(finalRequest);
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
    public java.util.concurrent.Future<GetFeedbackResult> getFeedbackAsync(GetFeedbackRequest request) {

        return getFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFeedbackResult> getFeedbackAsync(final GetFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFeedbackRequest, GetFeedbackResult> asyncHandler) {
        final GetFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFeedbackResult>() {
            @Override
            public GetFeedbackResult call() throws Exception {
                GetFeedbackResult result = null;

                try {
                    result = executeGetFeedback(finalRequest);
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
    public java.util.concurrent.Future<GetSampleDataResult> getSampleDataAsync(GetSampleDataRequest request) {

        return getSampleDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSampleDataResult> getSampleDataAsync(final GetSampleDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSampleDataRequest, GetSampleDataResult> asyncHandler) {
        final GetSampleDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSampleDataResult>() {
            @Override
            public GetSampleDataResult call() throws Exception {
                GetSampleDataResult result = null;

                try {
                    result = executeGetSampleData(finalRequest);
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
    public java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest request) {

        return listAlertsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(final ListAlertsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAlertsRequest, ListAlertsResult> asyncHandler) {
        final ListAlertsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAlertsResult>() {
            @Override
            public ListAlertsResult call() throws Exception {
                ListAlertsResult result = null;

                try {
                    result = executeListAlerts(finalRequest);
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
    public java.util.concurrent.Future<ListAnomalyDetectorsResult> listAnomalyDetectorsAsync(ListAnomalyDetectorsRequest request) {

        return listAnomalyDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyDetectorsResult> listAnomalyDetectorsAsync(final ListAnomalyDetectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnomalyDetectorsRequest, ListAnomalyDetectorsResult> asyncHandler) {
        final ListAnomalyDetectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnomalyDetectorsResult>() {
            @Override
            public ListAnomalyDetectorsResult call() throws Exception {
                ListAnomalyDetectorsResult result = null;

                try {
                    result = executeListAnomalyDetectors(finalRequest);
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
    public java.util.concurrent.Future<ListAnomalyGroupSummariesResult> listAnomalyGroupSummariesAsync(ListAnomalyGroupSummariesRequest request) {

        return listAnomalyGroupSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyGroupSummariesResult> listAnomalyGroupSummariesAsync(final ListAnomalyGroupSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnomalyGroupSummariesRequest, ListAnomalyGroupSummariesResult> asyncHandler) {
        final ListAnomalyGroupSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnomalyGroupSummariesResult>() {
            @Override
            public ListAnomalyGroupSummariesResult call() throws Exception {
                ListAnomalyGroupSummariesResult result = null;

                try {
                    result = executeListAnomalyGroupSummaries(finalRequest);
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
    public java.util.concurrent.Future<ListAnomalyGroupTimeSeriesResult> listAnomalyGroupTimeSeriesAsync(ListAnomalyGroupTimeSeriesRequest request) {

        return listAnomalyGroupTimeSeriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnomalyGroupTimeSeriesResult> listAnomalyGroupTimeSeriesAsync(final ListAnomalyGroupTimeSeriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnomalyGroupTimeSeriesRequest, ListAnomalyGroupTimeSeriesResult> asyncHandler) {
        final ListAnomalyGroupTimeSeriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnomalyGroupTimeSeriesResult>() {
            @Override
            public ListAnomalyGroupTimeSeriesResult call() throws Exception {
                ListAnomalyGroupTimeSeriesResult result = null;

                try {
                    result = executeListAnomalyGroupTimeSeries(finalRequest);
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
    public java.util.concurrent.Future<ListMetricSetsResult> listMetricSetsAsync(ListMetricSetsRequest request) {

        return listMetricSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricSetsResult> listMetricSetsAsync(final ListMetricSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMetricSetsRequest, ListMetricSetsResult> asyncHandler) {
        final ListMetricSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMetricSetsResult>() {
            @Override
            public ListMetricSetsResult call() throws Exception {
                ListMetricSetsResult result = null;

                try {
                    result = executeListMetricSets(finalRequest);
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
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest request) {

        return putFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(final PutFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler) {
        final PutFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFeedbackResult>() {
            @Override
            public PutFeedbackResult call() throws Exception {
                PutFeedbackResult result = null;

                try {
                    result = executePutFeedback(finalRequest);
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
    public java.util.concurrent.Future<UpdateAnomalyDetectorResult> updateAnomalyDetectorAsync(UpdateAnomalyDetectorRequest request) {

        return updateAnomalyDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnomalyDetectorResult> updateAnomalyDetectorAsync(final UpdateAnomalyDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnomalyDetectorRequest, UpdateAnomalyDetectorResult> asyncHandler) {
        final UpdateAnomalyDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnomalyDetectorResult>() {
            @Override
            public UpdateAnomalyDetectorResult call() throws Exception {
                UpdateAnomalyDetectorResult result = null;

                try {
                    result = executeUpdateAnomalyDetector(finalRequest);
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
    public java.util.concurrent.Future<UpdateMetricSetResult> updateMetricSetAsync(UpdateMetricSetRequest request) {

        return updateMetricSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricSetResult> updateMetricSetAsync(final UpdateMetricSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMetricSetRequest, UpdateMetricSetResult> asyncHandler) {
        final UpdateMetricSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMetricSetResult>() {
            @Override
            public UpdateMetricSetResult call() throws Exception {
                UpdateMetricSetResult result = null;

                try {
                    result = executeUpdateMetricSet(finalRequest);
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
