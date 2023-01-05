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
package com.amazonaws.services.simspaceweaver;

import javax.annotation.Generated;

import com.amazonaws.services.simspaceweaver.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS SimSpace Weaver asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services SimSpace Weaver (SimSpace Weaver) is a managed service that you can use to build and operate
 * large-scale spatial simulations in the Amazon Web Services Cloud. For example, you can create a digital twin of a
 * city, crowd simulations with millions of people and objects, and massilvely-multiplayer games with hundreds of
 * thousands of connected players. For more information about SimSpace Weaver, see the <i> <a
 * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/">Amazon Web Services SimSpace Weaver User
 * Guide</a> </i>.
 * </p>
 * <p>
 * This API reference describes the API operations and data types that you can use to communicate directly with SimSpace
 * Weaver.
 * </p>
 * <p>
 * SimSpace Weaver also provides the SimSpace Weaver app SDK, which you use for app development. The SimSpace Weaver app
 * SDK API reference is included in the SimSpace Weaver app SDK documentation, which is part of the SimSpace Weaver app
 * SDK distributable package.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSimSpaceWeaverAsyncClient extends AWSSimSpaceWeaverClient implements AWSSimSpaceWeaverAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSimSpaceWeaverAsyncClientBuilder asyncBuilder() {
        return AWSSimSpaceWeaverAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SimSpace Weaver using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSimSpaceWeaverAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SimSpace Weaver using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSimSpaceWeaverAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
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
    public java.util.concurrent.Future<DeleteSimulationResult> deleteSimulationAsync(DeleteSimulationRequest request) {

        return deleteSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSimulationResult> deleteSimulationAsync(final DeleteSimulationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSimulationRequest, DeleteSimulationResult> asyncHandler) {
        final DeleteSimulationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSimulationResult>() {
            @Override
            public DeleteSimulationResult call() throws Exception {
                DeleteSimulationResult result = null;

                try {
                    result = executeDeleteSimulation(finalRequest);
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
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request) {

        return describeAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(final DescribeAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler) {
        final DescribeAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppResult>() {
            @Override
            public DescribeAppResult call() throws Exception {
                DescribeAppResult result = null;

                try {
                    result = executeDescribeApp(finalRequest);
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
    public java.util.concurrent.Future<DescribeSimulationResult> describeSimulationAsync(DescribeSimulationRequest request) {

        return describeSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSimulationResult> describeSimulationAsync(final DescribeSimulationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSimulationRequest, DescribeSimulationResult> asyncHandler) {
        final DescribeSimulationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSimulationResult>() {
            @Override
            public DescribeSimulationResult call() throws Exception {
                DescribeSimulationResult result = null;

                try {
                    result = executeDescribeSimulation(finalRequest);
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
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(final ListAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {
        final ListAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppsResult>() {
            @Override
            public ListAppsResult call() throws Exception {
                ListAppsResult result = null;

                try {
                    result = executeListApps(finalRequest);
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
    public java.util.concurrent.Future<ListSimulationsResult> listSimulationsAsync(ListSimulationsRequest request) {

        return listSimulationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSimulationsResult> listSimulationsAsync(final ListSimulationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSimulationsRequest, ListSimulationsResult> asyncHandler) {
        final ListSimulationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSimulationsResult>() {
            @Override
            public ListSimulationsResult call() throws Exception {
                ListSimulationsResult result = null;

                try {
                    result = executeListSimulations(finalRequest);
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
    public java.util.concurrent.Future<StartAppResult> startAppAsync(StartAppRequest request) {

        return startAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAppResult> startAppAsync(final StartAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAppRequest, StartAppResult> asyncHandler) {
        final StartAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAppResult>() {
            @Override
            public StartAppResult call() throws Exception {
                StartAppResult result = null;

                try {
                    result = executeStartApp(finalRequest);
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
    public java.util.concurrent.Future<StartClockResult> startClockAsync(StartClockRequest request) {

        return startClockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartClockResult> startClockAsync(final StartClockRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartClockRequest, StartClockResult> asyncHandler) {
        final StartClockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartClockResult>() {
            @Override
            public StartClockResult call() throws Exception {
                StartClockResult result = null;

                try {
                    result = executeStartClock(finalRequest);
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
    public java.util.concurrent.Future<StartSimulationResult> startSimulationAsync(StartSimulationRequest request) {

        return startSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSimulationResult> startSimulationAsync(final StartSimulationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSimulationRequest, StartSimulationResult> asyncHandler) {
        final StartSimulationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSimulationResult>() {
            @Override
            public StartSimulationResult call() throws Exception {
                StartSimulationResult result = null;

                try {
                    result = executeStartSimulation(finalRequest);
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
    public java.util.concurrent.Future<StopAppResult> stopAppAsync(StopAppRequest request) {

        return stopAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAppResult> stopAppAsync(final StopAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAppRequest, StopAppResult> asyncHandler) {
        final StopAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAppResult>() {
            @Override
            public StopAppResult call() throws Exception {
                StopAppResult result = null;

                try {
                    result = executeStopApp(finalRequest);
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
    public java.util.concurrent.Future<StopClockResult> stopClockAsync(StopClockRequest request) {

        return stopClockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopClockResult> stopClockAsync(final StopClockRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopClockRequest, StopClockResult> asyncHandler) {
        final StopClockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopClockResult>() {
            @Override
            public StopClockResult call() throws Exception {
                StopClockResult result = null;

                try {
                    result = executeStopClock(finalRequest);
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
    public java.util.concurrent.Future<StopSimulationResult> stopSimulationAsync(StopSimulationRequest request) {

        return stopSimulationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSimulationResult> stopSimulationAsync(final StopSimulationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopSimulationRequest, StopSimulationResult> asyncHandler) {
        final StopSimulationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopSimulationResult>() {
            @Override
            public StopSimulationResult call() throws Exception {
                StopSimulationResult result = null;

                try {
                    result = executeStopSimulation(finalRequest);
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
