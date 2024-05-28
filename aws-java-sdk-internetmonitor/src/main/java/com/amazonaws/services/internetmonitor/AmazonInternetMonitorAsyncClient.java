/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.internetmonitor.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CloudWatch Internet Monitor asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon CloudWatch Internet Monitor provides visibility into how internet issues impact the performance and
 * availability between your applications hosted on Amazon Web Services and your end users. It can reduce the time it
 * takes for you to diagnose internet issues from days to minutes. Internet Monitor uses the connectivity data that
 * Amazon Web Services captures from its global networking footprint to calculate a baseline of performance and
 * availability for internet traffic. This is the same data that Amazon Web Services uses to monitor internet uptime and
 * availability. With those measurements as a baseline, Internet Monitor raises awareness for you when there are
 * significant problems for your end users in the different geographic locations where your application runs.
 * </p>
 * <p>
 * Internet Monitor publishes internet measurements to CloudWatch Logs and CloudWatch Metrics, to easily support using
 * CloudWatch tools with health information for geographies and networks specific to your application. Internet Monitor
 * sends health events to Amazon EventBridge so that you can set up notifications. If an issue is caused by the Amazon
 * Web Services network, you also automatically receive an Amazon Web Services Health Dashboard notification with the
 * steps that Amazon Web Services is taking to mitigate the problem.
 * </p>
 * <p>
 * To use Internet Monitor, you create a <i>monitor</i> and associate your application's resources with it - VPCs, NLBs,
 * CloudFront distributions, or WorkSpaces directories - so Internet Monitor can determine where your application's
 * internet traffic is. Internet Monitor then provides internet measurements from Amazon Web Services that are specific
 * to the locations and ASNs (typically, internet service providers or ISPs) that communicate with your application.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using Amazon
 * CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonInternetMonitorAsyncClient extends AmazonInternetMonitorClient implements AmazonInternetMonitorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonInternetMonitorAsyncClientBuilder asyncBuilder() {
        return AmazonInternetMonitorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Internet Monitor using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonInternetMonitorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Internet Monitor using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonInternetMonitorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request) {

        return createMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(final CreateMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler) {
        final CreateMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMonitorResult>() {
            @Override
            public CreateMonitorResult call() throws Exception {
                CreateMonitorResult result = null;

                try {
                    result = executeCreateMonitor(finalRequest);
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
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request) {

        return deleteMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(final DeleteMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler) {
        final DeleteMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMonitorResult>() {
            @Override
            public DeleteMonitorResult call() throws Exception {
                DeleteMonitorResult result = null;

                try {
                    result = executeDeleteMonitor(finalRequest);
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
    public java.util.concurrent.Future<GetHealthEventResult> getHealthEventAsync(GetHealthEventRequest request) {

        return getHealthEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHealthEventResult> getHealthEventAsync(final GetHealthEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHealthEventRequest, GetHealthEventResult> asyncHandler) {
        final GetHealthEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHealthEventResult>() {
            @Override
            public GetHealthEventResult call() throws Exception {
                GetHealthEventResult result = null;

                try {
                    result = executeGetHealthEvent(finalRequest);
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
    public java.util.concurrent.Future<GetInternetEventResult> getInternetEventAsync(GetInternetEventRequest request) {

        return getInternetEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInternetEventResult> getInternetEventAsync(final GetInternetEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInternetEventRequest, GetInternetEventResult> asyncHandler) {
        final GetInternetEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInternetEventResult>() {
            @Override
            public GetInternetEventResult call() throws Exception {
                GetInternetEventResult result = null;

                try {
                    result = executeGetInternetEvent(finalRequest);
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
    public java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest request) {

        return getMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(final GetMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMonitorRequest, GetMonitorResult> asyncHandler) {
        final GetMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMonitorResult>() {
            @Override
            public GetMonitorResult call() throws Exception {
                GetMonitorResult result = null;

                try {
                    result = executeGetMonitor(finalRequest);
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
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(final GetQueryResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {
        final GetQueryResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryResultsResult>() {
            @Override
            public GetQueryResultsResult call() throws Exception {
                GetQueryResultsResult result = null;

                try {
                    result = executeGetQueryResults(finalRequest);
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
    public java.util.concurrent.Future<GetQueryStatusResult> getQueryStatusAsync(GetQueryStatusRequest request) {

        return getQueryStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryStatusResult> getQueryStatusAsync(final GetQueryStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryStatusRequest, GetQueryStatusResult> asyncHandler) {
        final GetQueryStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryStatusResult>() {
            @Override
            public GetQueryStatusResult call() throws Exception {
                GetQueryStatusResult result = null;

                try {
                    result = executeGetQueryStatus(finalRequest);
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
    public java.util.concurrent.Future<ListHealthEventsResult> listHealthEventsAsync(ListHealthEventsRequest request) {

        return listHealthEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHealthEventsResult> listHealthEventsAsync(final ListHealthEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHealthEventsRequest, ListHealthEventsResult> asyncHandler) {
        final ListHealthEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHealthEventsResult>() {
            @Override
            public ListHealthEventsResult call() throws Exception {
                ListHealthEventsResult result = null;

                try {
                    result = executeListHealthEvents(finalRequest);
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
    public java.util.concurrent.Future<ListInternetEventsResult> listInternetEventsAsync(ListInternetEventsRequest request) {

        return listInternetEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInternetEventsResult> listInternetEventsAsync(final ListInternetEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInternetEventsRequest, ListInternetEventsResult> asyncHandler) {
        final ListInternetEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInternetEventsResult>() {
            @Override
            public ListInternetEventsResult call() throws Exception {
                ListInternetEventsResult result = null;

                try {
                    result = executeListInternetEvents(finalRequest);
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
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request) {

        return listMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(final ListMonitorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler) {
        final ListMonitorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitorsResult>() {
            @Override
            public ListMonitorsResult call() throws Exception {
                ListMonitorsResult result = null;

                try {
                    result = executeListMonitors(finalRequest);
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
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request) {

        return startQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(final StartQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler) {
        final StartQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartQueryResult>() {
            @Override
            public StartQueryResult call() throws Exception {
                StartQueryResult result = null;

                try {
                    result = executeStartQuery(finalRequest);
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
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest request) {

        return stopQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(final StopQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopQueryRequest, StopQueryResult> asyncHandler) {
        final StopQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopQueryResult>() {
            @Override
            public StopQueryResult call() throws Exception {
                StopQueryResult result = null;

                try {
                    result = executeStopQuery(finalRequest);
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
    public java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest request) {

        return updateMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(final UpdateMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResult> asyncHandler) {
        final UpdateMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMonitorResult>() {
            @Override
            public UpdateMonitorResult call() throws Exception {
                UpdateMonitorResult result = null;

                try {
                    result = executeUpdateMonitor(finalRequest);
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
