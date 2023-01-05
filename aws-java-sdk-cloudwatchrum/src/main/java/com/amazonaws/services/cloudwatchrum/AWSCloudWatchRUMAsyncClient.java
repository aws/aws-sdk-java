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
package com.amazonaws.services.cloudwatchrum;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchrum.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing CloudWatch RUM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * With Amazon CloudWatch RUM, you can perform real-user monitoring to collect client-side data about your web
 * application performance from actual user sessions in real time. The data collected includes page load times,
 * client-side errors, and user behavior. When you view this data, you can see it all aggregated together and also see
 * breakdowns by the browsers and devices that your customers use.
 * </p>
 * <p>
 * You can use the collected data to quickly identify and debug client-side performance issues. CloudWatch RUM helps you
 * visualize anomalies in your application performance and find relevant debugging data such as error messages, stack
 * traces, and user sessions. You can also use RUM to understand the range of end-user impact including the number of
 * users, geolocations, and browsers used.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudWatchRUMAsyncClient extends AWSCloudWatchRUMClient implements AWSCloudWatchRUMAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCloudWatchRUMAsyncClientBuilder asyncBuilder() {
        return AWSCloudWatchRUMAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch RUM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCloudWatchRUMAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch RUM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCloudWatchRUMAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchCreateRumMetricDefinitionsResult> batchCreateRumMetricDefinitionsAsync(
            BatchCreateRumMetricDefinitionsRequest request) {

        return batchCreateRumMetricDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateRumMetricDefinitionsResult> batchCreateRumMetricDefinitionsAsync(
            final BatchCreateRumMetricDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateRumMetricDefinitionsRequest, BatchCreateRumMetricDefinitionsResult> asyncHandler) {
        final BatchCreateRumMetricDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateRumMetricDefinitionsResult>() {
            @Override
            public BatchCreateRumMetricDefinitionsResult call() throws Exception {
                BatchCreateRumMetricDefinitionsResult result = null;

                try {
                    result = executeBatchCreateRumMetricDefinitions(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteRumMetricDefinitionsResult> batchDeleteRumMetricDefinitionsAsync(
            BatchDeleteRumMetricDefinitionsRequest request) {

        return batchDeleteRumMetricDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteRumMetricDefinitionsResult> batchDeleteRumMetricDefinitionsAsync(
            final BatchDeleteRumMetricDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteRumMetricDefinitionsRequest, BatchDeleteRumMetricDefinitionsResult> asyncHandler) {
        final BatchDeleteRumMetricDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteRumMetricDefinitionsResult>() {
            @Override
            public BatchDeleteRumMetricDefinitionsResult call() throws Exception {
                BatchDeleteRumMetricDefinitionsResult result = null;

                try {
                    result = executeBatchDeleteRumMetricDefinitions(finalRequest);
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
    public java.util.concurrent.Future<BatchGetRumMetricDefinitionsResult> batchGetRumMetricDefinitionsAsync(BatchGetRumMetricDefinitionsRequest request) {

        return batchGetRumMetricDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetRumMetricDefinitionsResult> batchGetRumMetricDefinitionsAsync(final BatchGetRumMetricDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetRumMetricDefinitionsRequest, BatchGetRumMetricDefinitionsResult> asyncHandler) {
        final BatchGetRumMetricDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetRumMetricDefinitionsResult>() {
            @Override
            public BatchGetRumMetricDefinitionsResult call() throws Exception {
                BatchGetRumMetricDefinitionsResult result = null;

                try {
                    result = executeBatchGetRumMetricDefinitions(finalRequest);
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
    public java.util.concurrent.Future<CreateAppMonitorResult> createAppMonitorAsync(CreateAppMonitorRequest request) {

        return createAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppMonitorResult> createAppMonitorAsync(final CreateAppMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppMonitorRequest, CreateAppMonitorResult> asyncHandler) {
        final CreateAppMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppMonitorResult>() {
            @Override
            public CreateAppMonitorResult call() throws Exception {
                CreateAppMonitorResult result = null;

                try {
                    result = executeCreateAppMonitor(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppMonitorResult> deleteAppMonitorAsync(DeleteAppMonitorRequest request) {

        return deleteAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppMonitorResult> deleteAppMonitorAsync(final DeleteAppMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppMonitorRequest, DeleteAppMonitorResult> asyncHandler) {
        final DeleteAppMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppMonitorResult>() {
            @Override
            public DeleteAppMonitorResult call() throws Exception {
                DeleteAppMonitorResult result = null;

                try {
                    result = executeDeleteAppMonitor(finalRequest);
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
    public java.util.concurrent.Future<DeleteRumMetricsDestinationResult> deleteRumMetricsDestinationAsync(DeleteRumMetricsDestinationRequest request) {

        return deleteRumMetricsDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRumMetricsDestinationResult> deleteRumMetricsDestinationAsync(final DeleteRumMetricsDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRumMetricsDestinationRequest, DeleteRumMetricsDestinationResult> asyncHandler) {
        final DeleteRumMetricsDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRumMetricsDestinationResult>() {
            @Override
            public DeleteRumMetricsDestinationResult call() throws Exception {
                DeleteRumMetricsDestinationResult result = null;

                try {
                    result = executeDeleteRumMetricsDestination(finalRequest);
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
    public java.util.concurrent.Future<GetAppMonitorResult> getAppMonitorAsync(GetAppMonitorRequest request) {

        return getAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppMonitorResult> getAppMonitorAsync(final GetAppMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppMonitorRequest, GetAppMonitorResult> asyncHandler) {
        final GetAppMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppMonitorResult>() {
            @Override
            public GetAppMonitorResult call() throws Exception {
                GetAppMonitorResult result = null;

                try {
                    result = executeGetAppMonitor(finalRequest);
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
    public java.util.concurrent.Future<GetAppMonitorDataResult> getAppMonitorDataAsync(GetAppMonitorDataRequest request) {

        return getAppMonitorDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppMonitorDataResult> getAppMonitorDataAsync(final GetAppMonitorDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppMonitorDataRequest, GetAppMonitorDataResult> asyncHandler) {
        final GetAppMonitorDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppMonitorDataResult>() {
            @Override
            public GetAppMonitorDataResult call() throws Exception {
                GetAppMonitorDataResult result = null;

                try {
                    result = executeGetAppMonitorData(finalRequest);
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
    public java.util.concurrent.Future<ListAppMonitorsResult> listAppMonitorsAsync(ListAppMonitorsRequest request) {

        return listAppMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppMonitorsResult> listAppMonitorsAsync(final ListAppMonitorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppMonitorsRequest, ListAppMonitorsResult> asyncHandler) {
        final ListAppMonitorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppMonitorsResult>() {
            @Override
            public ListAppMonitorsResult call() throws Exception {
                ListAppMonitorsResult result = null;

                try {
                    result = executeListAppMonitors(finalRequest);
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
    public java.util.concurrent.Future<ListRumMetricsDestinationsResult> listRumMetricsDestinationsAsync(ListRumMetricsDestinationsRequest request) {

        return listRumMetricsDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRumMetricsDestinationsResult> listRumMetricsDestinationsAsync(final ListRumMetricsDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRumMetricsDestinationsRequest, ListRumMetricsDestinationsResult> asyncHandler) {
        final ListRumMetricsDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRumMetricsDestinationsResult>() {
            @Override
            public ListRumMetricsDestinationsResult call() throws Exception {
                ListRumMetricsDestinationsResult result = null;

                try {
                    result = executeListRumMetricsDestinations(finalRequest);
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
    public java.util.concurrent.Future<PutRumEventsResult> putRumEventsAsync(PutRumEventsRequest request) {

        return putRumEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRumEventsResult> putRumEventsAsync(final PutRumEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRumEventsRequest, PutRumEventsResult> asyncHandler) {
        final PutRumEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRumEventsResult>() {
            @Override
            public PutRumEventsResult call() throws Exception {
                PutRumEventsResult result = null;

                try {
                    result = executePutRumEvents(finalRequest);
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
    public java.util.concurrent.Future<PutRumMetricsDestinationResult> putRumMetricsDestinationAsync(PutRumMetricsDestinationRequest request) {

        return putRumMetricsDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRumMetricsDestinationResult> putRumMetricsDestinationAsync(final PutRumMetricsDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRumMetricsDestinationRequest, PutRumMetricsDestinationResult> asyncHandler) {
        final PutRumMetricsDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRumMetricsDestinationResult>() {
            @Override
            public PutRumMetricsDestinationResult call() throws Exception {
                PutRumMetricsDestinationResult result = null;

                try {
                    result = executePutRumMetricsDestination(finalRequest);
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
    public java.util.concurrent.Future<UpdateAppMonitorResult> updateAppMonitorAsync(UpdateAppMonitorRequest request) {

        return updateAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppMonitorResult> updateAppMonitorAsync(final UpdateAppMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppMonitorRequest, UpdateAppMonitorResult> asyncHandler) {
        final UpdateAppMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppMonitorResult>() {
            @Override
            public UpdateAppMonitorResult call() throws Exception {
                UpdateAppMonitorResult result = null;

                try {
                    result = executeUpdateAppMonitor(finalRequest);
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
    public java.util.concurrent.Future<UpdateRumMetricDefinitionResult> updateRumMetricDefinitionAsync(UpdateRumMetricDefinitionRequest request) {

        return updateRumMetricDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRumMetricDefinitionResult> updateRumMetricDefinitionAsync(final UpdateRumMetricDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRumMetricDefinitionRequest, UpdateRumMetricDefinitionResult> asyncHandler) {
        final UpdateRumMetricDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRumMetricDefinitionResult>() {
            @Override
            public UpdateRumMetricDefinitionResult call() throws Exception {
                UpdateRumMetricDefinitionResult result = null;

                try {
                    result = executeUpdateRumMetricDefinition(finalRequest);
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
