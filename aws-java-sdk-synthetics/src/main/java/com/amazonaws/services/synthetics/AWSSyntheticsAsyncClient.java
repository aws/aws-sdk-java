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
package com.amazonaws.services.synthetics;

import javax.annotation.Generated;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Synthetics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudWatch Synthetics</fullname>
 * <p>
 * You can use Amazon CloudWatch Synthetics to continually monitor your services. You can create and manage
 * <i>canaries</i>, which are modular, lightweight scripts that monitor your endpoints and APIs from the outside-in. You
 * can set up your canaries to run 24 hours a day, once per minute. The canaries help you check the availability and
 * latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs,
 * and metrics. The canaries seamlessly integrate with CloudWatch ServiceLens to help you trace the causes of impacted
 * nodes in your applications. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ServiceLens.html">Using ServiceLens to Monitor
 * the Health of Your Applications</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * <p>
 * Before you create and manage canaries, be aware of the security considerations. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
 * Considerations for Synthetics Canaries</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSyntheticsAsyncClient extends AWSSyntheticsClient implements AWSSyntheticsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSyntheticsAsyncClientBuilder asyncBuilder() {
        return AWSSyntheticsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Synthetics using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSyntheticsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Synthetics using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSyntheticsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateCanaryResult> createCanaryAsync(CreateCanaryRequest request) {

        return createCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCanaryResult> createCanaryAsync(final CreateCanaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCanaryRequest, CreateCanaryResult> asyncHandler) {
        final CreateCanaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCanaryResult>() {
            @Override
            public CreateCanaryResult call() throws Exception {
                CreateCanaryResult result = null;

                try {
                    result = executeCreateCanary(finalRequest);
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
    public java.util.concurrent.Future<DeleteCanaryResult> deleteCanaryAsync(DeleteCanaryRequest request) {

        return deleteCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCanaryResult> deleteCanaryAsync(final DeleteCanaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCanaryRequest, DeleteCanaryResult> asyncHandler) {
        final DeleteCanaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCanaryResult>() {
            @Override
            public DeleteCanaryResult call() throws Exception {
                DeleteCanaryResult result = null;

                try {
                    result = executeDeleteCanary(finalRequest);
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
    public java.util.concurrent.Future<DescribeCanariesResult> describeCanariesAsync(DescribeCanariesRequest request) {

        return describeCanariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCanariesResult> describeCanariesAsync(final DescribeCanariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCanariesRequest, DescribeCanariesResult> asyncHandler) {
        final DescribeCanariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCanariesResult>() {
            @Override
            public DescribeCanariesResult call() throws Exception {
                DescribeCanariesResult result = null;

                try {
                    result = executeDescribeCanaries(finalRequest);
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
    public java.util.concurrent.Future<DescribeCanariesLastRunResult> describeCanariesLastRunAsync(DescribeCanariesLastRunRequest request) {

        return describeCanariesLastRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCanariesLastRunResult> describeCanariesLastRunAsync(final DescribeCanariesLastRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCanariesLastRunRequest, DescribeCanariesLastRunResult> asyncHandler) {
        final DescribeCanariesLastRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCanariesLastRunResult>() {
            @Override
            public DescribeCanariesLastRunResult call() throws Exception {
                DescribeCanariesLastRunResult result = null;

                try {
                    result = executeDescribeCanariesLastRun(finalRequest);
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
    public java.util.concurrent.Future<DescribeRuntimeVersionsResult> describeRuntimeVersionsAsync(DescribeRuntimeVersionsRequest request) {

        return describeRuntimeVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuntimeVersionsResult> describeRuntimeVersionsAsync(final DescribeRuntimeVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuntimeVersionsRequest, DescribeRuntimeVersionsResult> asyncHandler) {
        final DescribeRuntimeVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuntimeVersionsResult>() {
            @Override
            public DescribeRuntimeVersionsResult call() throws Exception {
                DescribeRuntimeVersionsResult result = null;

                try {
                    result = executeDescribeRuntimeVersions(finalRequest);
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
    public java.util.concurrent.Future<GetCanaryResult> getCanaryAsync(GetCanaryRequest request) {

        return getCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCanaryResult> getCanaryAsync(final GetCanaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCanaryRequest, GetCanaryResult> asyncHandler) {
        final GetCanaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCanaryResult>() {
            @Override
            public GetCanaryResult call() throws Exception {
                GetCanaryResult result = null;

                try {
                    result = executeGetCanary(finalRequest);
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
    public java.util.concurrent.Future<GetCanaryRunsResult> getCanaryRunsAsync(GetCanaryRunsRequest request) {

        return getCanaryRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCanaryRunsResult> getCanaryRunsAsync(final GetCanaryRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCanaryRunsRequest, GetCanaryRunsResult> asyncHandler) {
        final GetCanaryRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCanaryRunsResult>() {
            @Override
            public GetCanaryRunsResult call() throws Exception {
                GetCanaryRunsResult result = null;

                try {
                    result = executeGetCanaryRuns(finalRequest);
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
    public java.util.concurrent.Future<StartCanaryResult> startCanaryAsync(StartCanaryRequest request) {

        return startCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCanaryResult> startCanaryAsync(final StartCanaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCanaryRequest, StartCanaryResult> asyncHandler) {
        final StartCanaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCanaryResult>() {
            @Override
            public StartCanaryResult call() throws Exception {
                StartCanaryResult result = null;

                try {
                    result = executeStartCanary(finalRequest);
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
    public java.util.concurrent.Future<StopCanaryResult> stopCanaryAsync(StopCanaryRequest request) {

        return stopCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCanaryResult> stopCanaryAsync(final StopCanaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCanaryRequest, StopCanaryResult> asyncHandler) {
        final StopCanaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCanaryResult>() {
            @Override
            public StopCanaryResult call() throws Exception {
                StopCanaryResult result = null;

                try {
                    result = executeStopCanary(finalRequest);
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
    public java.util.concurrent.Future<UpdateCanaryResult> updateCanaryAsync(UpdateCanaryRequest request) {

        return updateCanaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCanaryResult> updateCanaryAsync(final UpdateCanaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCanaryRequest, UpdateCanaryResult> asyncHandler) {
        final UpdateCanaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCanaryResult>() {
            @Override
            public UpdateCanaryResult call() throws Exception {
                UpdateCanaryResult result = null;

                try {
                    result = executeUpdateCanary(finalRequest);
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
