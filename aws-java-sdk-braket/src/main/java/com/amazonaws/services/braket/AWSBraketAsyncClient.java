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
package com.amazonaws.services.braket;

import javax.annotation.Generated;

import com.amazonaws.services.braket.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Braket asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Braket API Reference provides information about the operations and structures supported in Amazon Braket.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBraketAsyncClient extends AWSBraketClient implements AWSBraketAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBraketAsyncClientBuilder asyncBuilder() {
        return AWSBraketAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Braket using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBraketAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Braket using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSBraketAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelQuantumTaskResult> cancelQuantumTaskAsync(CancelQuantumTaskRequest request) {

        return cancelQuantumTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQuantumTaskResult> cancelQuantumTaskAsync(final CancelQuantumTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelQuantumTaskRequest, CancelQuantumTaskResult> asyncHandler) {
        final CancelQuantumTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelQuantumTaskResult>() {
            @Override
            public CancelQuantumTaskResult call() throws Exception {
                CancelQuantumTaskResult result = null;

                try {
                    result = executeCancelQuantumTask(finalRequest);
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
    public java.util.concurrent.Future<CreateQuantumTaskResult> createQuantumTaskAsync(CreateQuantumTaskRequest request) {

        return createQuantumTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQuantumTaskResult> createQuantumTaskAsync(final CreateQuantumTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQuantumTaskRequest, CreateQuantumTaskResult> asyncHandler) {
        final CreateQuantumTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQuantumTaskResult>() {
            @Override
            public CreateQuantumTaskResult call() throws Exception {
                CreateQuantumTaskResult result = null;

                try {
                    result = executeCreateQuantumTask(finalRequest);
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
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request) {

        return getDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(final GetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {
        final GetDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceResult>() {
            @Override
            public GetDeviceResult call() throws Exception {
                GetDeviceResult result = null;

                try {
                    result = executeGetDevice(finalRequest);
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
    public java.util.concurrent.Future<GetQuantumTaskResult> getQuantumTaskAsync(GetQuantumTaskRequest request) {

        return getQuantumTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQuantumTaskResult> getQuantumTaskAsync(final GetQuantumTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQuantumTaskRequest, GetQuantumTaskResult> asyncHandler) {
        final GetQuantumTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQuantumTaskResult>() {
            @Override
            public GetQuantumTaskResult call() throws Exception {
                GetQuantumTaskResult result = null;

                try {
                    result = executeGetQuantumTask(finalRequest);
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
    public java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest request) {

        return searchDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(final SearchDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchDevicesRequest, SearchDevicesResult> asyncHandler) {
        final SearchDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchDevicesResult>() {
            @Override
            public SearchDevicesResult call() throws Exception {
                SearchDevicesResult result = null;

                try {
                    result = executeSearchDevices(finalRequest);
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
    public java.util.concurrent.Future<SearchQuantumTasksResult> searchQuantumTasksAsync(SearchQuantumTasksRequest request) {

        return searchQuantumTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchQuantumTasksResult> searchQuantumTasksAsync(final SearchQuantumTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchQuantumTasksRequest, SearchQuantumTasksResult> asyncHandler) {
        final SearchQuantumTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchQuantumTasksResult>() {
            @Override
            public SearchQuantumTasksResult call() throws Exception {
                SearchQuantumTasksResult result = null;

                try {
                    result = executeSearchQuantumTasks(finalRequest);
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
