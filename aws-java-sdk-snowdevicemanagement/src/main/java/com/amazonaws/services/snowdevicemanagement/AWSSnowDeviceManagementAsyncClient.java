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
package com.amazonaws.services.snowdevicemanagement;

import javax.annotation.Generated;

import com.amazonaws.services.snowdevicemanagement.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Snow Device Management asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Snow Device Management documentation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSnowDeviceManagementAsyncClient extends AWSSnowDeviceManagementClient implements AWSSnowDeviceManagementAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSnowDeviceManagementAsyncClientBuilder asyncBuilder() {
        return AWSSnowDeviceManagementAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Snow Device Management using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSnowDeviceManagementAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Snow Device Management using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSnowDeviceManagementAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelTaskResult> cancelTaskAsync(CancelTaskRequest request) {

        return cancelTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelTaskResult> cancelTaskAsync(final CancelTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelTaskRequest, CancelTaskResult> asyncHandler) {
        final CancelTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelTaskResult>() {
            @Override
            public CancelTaskResult call() throws Exception {
                CancelTaskResult result = null;

                try {
                    result = executeCancelTask(finalRequest);
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
    public java.util.concurrent.Future<CreateTaskResult> createTaskAsync(CreateTaskRequest request) {

        return createTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResult> createTaskAsync(final CreateTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTaskRequest, CreateTaskResult> asyncHandler) {
        final CreateTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTaskResult>() {
            @Override
            public CreateTaskResult call() throws Exception {
                CreateTaskResult result = null;

                try {
                    result = executeCreateTask(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest request) {

        return describeDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(final DescribeDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler) {
        final DescribeDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceResult>() {
            @Override
            public DescribeDeviceResult call() throws Exception {
                DescribeDeviceResult result = null;

                try {
                    result = executeDescribeDevice(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeviceEc2InstancesResult> describeDeviceEc2InstancesAsync(DescribeDeviceEc2InstancesRequest request) {

        return describeDeviceEc2InstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeviceEc2InstancesResult> describeDeviceEc2InstancesAsync(final DescribeDeviceEc2InstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeviceEc2InstancesRequest, DescribeDeviceEc2InstancesResult> asyncHandler) {
        final DescribeDeviceEc2InstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeviceEc2InstancesResult>() {
            @Override
            public DescribeDeviceEc2InstancesResult call() throws Exception {
                DescribeDeviceEc2InstancesResult result = null;

                try {
                    result = executeDescribeDeviceEc2Instances(finalRequest);
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
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request) {

        return describeExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(final DescribeExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler) {
        final DescribeExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExecutionResult>() {
            @Override
            public DescribeExecutionResult call() throws Exception {
                DescribeExecutionResult result = null;

                try {
                    result = executeDescribeExecution(finalRequest);
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
    public java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(DescribeTaskRequest request) {

        return describeTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskResult> describeTaskAsync(final DescribeTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTaskRequest, DescribeTaskResult> asyncHandler) {
        final DescribeTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTaskResult>() {
            @Override
            public DescribeTaskResult call() throws Exception {
                DescribeTaskResult result = null;

                try {
                    result = executeDescribeTask(finalRequest);
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
    public java.util.concurrent.Future<ListDeviceResourcesResult> listDeviceResourcesAsync(ListDeviceResourcesRequest request) {

        return listDeviceResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceResourcesResult> listDeviceResourcesAsync(final ListDeviceResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceResourcesRequest, ListDeviceResourcesResult> asyncHandler) {
        final ListDeviceResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceResourcesResult>() {
            @Override
            public ListDeviceResourcesResult call() throws Exception {
                ListDeviceResourcesResult result = null;

                try {
                    result = executeListDeviceResources(finalRequest);
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
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {
        final ListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result = null;

                try {
                    result = executeListDevices(finalRequest);
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
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(final ListExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {
        final ListExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExecutionsResult>() {
            @Override
            public ListExecutionsResult call() throws Exception {
                ListExecutionsResult result = null;

                try {
                    result = executeListExecutions(finalRequest);
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
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request) {

        return listTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(final ListTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {
        final ListTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTasksResult>() {
            @Override
            public ListTasksResult call() throws Exception {
                ListTasksResult result = null;

                try {
                    result = executeListTasks(finalRequest);
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
