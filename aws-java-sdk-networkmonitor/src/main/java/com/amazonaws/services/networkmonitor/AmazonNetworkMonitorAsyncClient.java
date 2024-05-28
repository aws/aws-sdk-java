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
package com.amazonaws.services.networkmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.networkmonitor.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CloudWatch Network Monitor asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon CloudWatch Network Monitor is an Amazon Web Services active network monitoring service that identifies if a
 * network issues exists within the Amazon Web Services network or your own company network. Within Network Monitor
 * you'll choose the source VPCs and subnets from the Amazon Web Services network in which you operate and then you'll
 * choose the destination IP addresses from your on-premises network. From these sources and destinations, Network
 * Monitor creates a monitor containing all the possible source and destination combinations, each of which is called a
 * probe, within a single monitor. These probes then monitor network traffic to help you identify where network issues
 * might be affecting your traffic.
 * </p>
 * <p>
 * Before you begin, ensure the Amazon Web Services CLI is configured in the Amazon Web Services Account where you will
 * create the Network Monitor resource. Network Monitor doesn’t support creation on cross-account resources, but you can
 * create a Network Monitor in any subnet belonging to a VPC owned by your Account.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/what-is-network-monitor.html">Using Amazon
 * CloudWatch Network Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNetworkMonitorAsyncClient extends AmazonNetworkMonitorClient implements AmazonNetworkMonitorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonNetworkMonitorAsyncClientBuilder asyncBuilder() {
        return AmazonNetworkMonitorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Network Monitor using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonNetworkMonitorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Network Monitor using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonNetworkMonitorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateProbeResult> createProbeAsync(CreateProbeRequest request) {

        return createProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProbeResult> createProbeAsync(final CreateProbeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProbeRequest, CreateProbeResult> asyncHandler) {
        final CreateProbeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProbeResult>() {
            @Override
            public CreateProbeResult call() throws Exception {
                CreateProbeResult result = null;

                try {
                    result = executeCreateProbe(finalRequest);
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
    public java.util.concurrent.Future<DeleteProbeResult> deleteProbeAsync(DeleteProbeRequest request) {

        return deleteProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProbeResult> deleteProbeAsync(final DeleteProbeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProbeRequest, DeleteProbeResult> asyncHandler) {
        final DeleteProbeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProbeResult>() {
            @Override
            public DeleteProbeResult call() throws Exception {
                DeleteProbeResult result = null;

                try {
                    result = executeDeleteProbe(finalRequest);
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
    public java.util.concurrent.Future<GetProbeResult> getProbeAsync(GetProbeRequest request) {

        return getProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProbeResult> getProbeAsync(final GetProbeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProbeRequest, GetProbeResult> asyncHandler) {
        final GetProbeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProbeResult>() {
            @Override
            public GetProbeResult call() throws Exception {
                GetProbeResult result = null;

                try {
                    result = executeGetProbe(finalRequest);
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

    @Override
    public java.util.concurrent.Future<UpdateProbeResult> updateProbeAsync(UpdateProbeRequest request) {

        return updateProbeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProbeResult> updateProbeAsync(final UpdateProbeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProbeRequest, UpdateProbeResult> asyncHandler) {
        final UpdateProbeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProbeResult>() {
            @Override
            public UpdateProbeResult call() throws Exception {
                UpdateProbeResult result = null;

                try {
                    result = executeUpdateProbe(finalRequest);
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
