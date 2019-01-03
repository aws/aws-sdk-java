/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing DataSync asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS DataSync</fullname>
 * <p>
 * AWS DataSync is a managed data transfer service that makes it simpler for you to automate moving data between
 * on-premises storage and Amazon Simple Storage Service (Amazon S3) or Amazon Elastic File System (Amazon EFS).
 * </p>
 * <p>
 * This API interface reference for AWS DataSync contains documentation for a programming interface that you can use to
 * manage AWS DataSync.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDataSyncAsyncClient extends AWSDataSyncClient implements AWSDataSyncAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSDataSyncAsyncClientBuilder asyncBuilder() {
        return AWSDataSyncAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DataSync using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDataSyncAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelTaskExecutionResult> cancelTaskExecutionAsync(CancelTaskExecutionRequest request) {

        return cancelTaskExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelTaskExecutionResult> cancelTaskExecutionAsync(final CancelTaskExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelTaskExecutionRequest, CancelTaskExecutionResult> asyncHandler) {
        final CancelTaskExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelTaskExecutionResult>() {
            @Override
            public CancelTaskExecutionResult call() throws Exception {
                CancelTaskExecutionResult result = null;

                try {
                    result = executeCancelTaskExecution(finalRequest);
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
    public java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest request) {

        return createAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResult> createAgentAsync(final CreateAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAgentRequest, CreateAgentResult> asyncHandler) {
        final CreateAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAgentResult>() {
            @Override
            public CreateAgentResult call() throws Exception {
                CreateAgentResult result = null;

                try {
                    result = executeCreateAgent(finalRequest);
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
    public java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(CreateLocationEfsRequest request) {

        return createLocationEfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLocationEfsResult> createLocationEfsAsync(final CreateLocationEfsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLocationEfsRequest, CreateLocationEfsResult> asyncHandler) {
        final CreateLocationEfsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLocationEfsResult>() {
            @Override
            public CreateLocationEfsResult call() throws Exception {
                CreateLocationEfsResult result = null;

                try {
                    result = executeCreateLocationEfs(finalRequest);
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
    public java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(CreateLocationNfsRequest request) {

        return createLocationNfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLocationNfsResult> createLocationNfsAsync(final CreateLocationNfsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLocationNfsRequest, CreateLocationNfsResult> asyncHandler) {
        final CreateLocationNfsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLocationNfsResult>() {
            @Override
            public CreateLocationNfsResult call() throws Exception {
                CreateLocationNfsResult result = null;

                try {
                    result = executeCreateLocationNfs(finalRequest);
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
    public java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(CreateLocationS3Request request) {

        return createLocationS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLocationS3Result> createLocationS3Async(final CreateLocationS3Request request,
            final com.amazonaws.handlers.AsyncHandler<CreateLocationS3Request, CreateLocationS3Result> asyncHandler) {
        final CreateLocationS3Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLocationS3Result>() {
            @Override
            public CreateLocationS3Result call() throws Exception {
                CreateLocationS3Result result = null;

                try {
                    result = executeCreateLocationS3(finalRequest);
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
    public java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest request) {

        return deleteAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(final DeleteAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAgentRequest, DeleteAgentResult> asyncHandler) {
        final DeleteAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAgentResult>() {
            @Override
            public DeleteAgentResult call() throws Exception {
                DeleteAgentResult result = null;

                try {
                    result = executeDeleteAgent(finalRequest);
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
    public java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest request) {

        return deleteLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(final DeleteLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLocationRequest, DeleteLocationResult> asyncHandler) {
        final DeleteLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLocationResult>() {
            @Override
            public DeleteLocationResult call() throws Exception {
                DeleteLocationResult result = null;

                try {
                    result = executeDeleteLocation(finalRequest);
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
    public java.util.concurrent.Future<DeleteTaskResult> deleteTaskAsync(DeleteTaskRequest request) {

        return deleteTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskResult> deleteTaskAsync(final DeleteTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTaskRequest, DeleteTaskResult> asyncHandler) {
        final DeleteTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTaskResult>() {
            @Override
            public DeleteTaskResult call() throws Exception {
                DeleteTaskResult result = null;

                try {
                    result = executeDeleteTask(finalRequest);
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
    public java.util.concurrent.Future<DescribeAgentResult> describeAgentAsync(DescribeAgentRequest request) {

        return describeAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentResult> describeAgentAsync(final DescribeAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentRequest, DescribeAgentResult> asyncHandler) {
        final DescribeAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgentResult>() {
            @Override
            public DescribeAgentResult call() throws Exception {
                DescribeAgentResult result = null;

                try {
                    result = executeDescribeAgent(finalRequest);
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
    public java.util.concurrent.Future<DescribeLocationEfsResult> describeLocationEfsAsync(DescribeLocationEfsRequest request) {

        return describeLocationEfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationEfsResult> describeLocationEfsAsync(final DescribeLocationEfsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLocationEfsRequest, DescribeLocationEfsResult> asyncHandler) {
        final DescribeLocationEfsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLocationEfsResult>() {
            @Override
            public DescribeLocationEfsResult call() throws Exception {
                DescribeLocationEfsResult result = null;

                try {
                    result = executeDescribeLocationEfs(finalRequest);
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
    public java.util.concurrent.Future<DescribeLocationNfsResult> describeLocationNfsAsync(DescribeLocationNfsRequest request) {

        return describeLocationNfsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationNfsResult> describeLocationNfsAsync(final DescribeLocationNfsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLocationNfsRequest, DescribeLocationNfsResult> asyncHandler) {
        final DescribeLocationNfsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLocationNfsResult>() {
            @Override
            public DescribeLocationNfsResult call() throws Exception {
                DescribeLocationNfsResult result = null;

                try {
                    result = executeDescribeLocationNfs(finalRequest);
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
    public java.util.concurrent.Future<DescribeLocationS3Result> describeLocationS3Async(DescribeLocationS3Request request) {

        return describeLocationS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationS3Result> describeLocationS3Async(final DescribeLocationS3Request request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLocationS3Request, DescribeLocationS3Result> asyncHandler) {
        final DescribeLocationS3Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLocationS3Result>() {
            @Override
            public DescribeLocationS3Result call() throws Exception {
                DescribeLocationS3Result result = null;

                try {
                    result = executeDescribeLocationS3(finalRequest);
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
    public java.util.concurrent.Future<DescribeTaskExecutionResult> describeTaskExecutionAsync(DescribeTaskExecutionRequest request) {

        return describeTaskExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskExecutionResult> describeTaskExecutionAsync(final DescribeTaskExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTaskExecutionRequest, DescribeTaskExecutionResult> asyncHandler) {
        final DescribeTaskExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTaskExecutionResult>() {
            @Override
            public DescribeTaskExecutionResult call() throws Exception {
                DescribeTaskExecutionResult result = null;

                try {
                    result = executeDescribeTaskExecution(finalRequest);
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
    public java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest request) {

        return listAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(final ListAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentsRequest, ListAgentsResult> asyncHandler) {
        final ListAgentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentsResult>() {
            @Override
            public ListAgentsResult call() throws Exception {
                ListAgentsResult result = null;

                try {
                    result = executeListAgents(finalRequest);
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
    public java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest request) {

        return listLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(final ListLocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLocationsRequest, ListLocationsResult> asyncHandler) {
        final ListLocationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLocationsResult>() {
            @Override
            public ListLocationsResult call() throws Exception {
                ListLocationsResult result = null;

                try {
                    result = executeListLocations(finalRequest);
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
    public java.util.concurrent.Future<ListTaskExecutionsResult> listTaskExecutionsAsync(ListTaskExecutionsRequest request) {

        return listTaskExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskExecutionsResult> listTaskExecutionsAsync(final ListTaskExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTaskExecutionsRequest, ListTaskExecutionsResult> asyncHandler) {
        final ListTaskExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTaskExecutionsResult>() {
            @Override
            public ListTaskExecutionsResult call() throws Exception {
                ListTaskExecutionsResult result = null;

                try {
                    result = executeListTaskExecutions(finalRequest);
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
    public java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(StartTaskExecutionRequest request) {

        return startTaskExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTaskExecutionResult> startTaskExecutionAsync(final StartTaskExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTaskExecutionRequest, StartTaskExecutionResult> asyncHandler) {
        final StartTaskExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTaskExecutionResult>() {
            @Override
            public StartTaskExecutionResult call() throws Exception {
                StartTaskExecutionResult result = null;

                try {
                    result = executeStartTaskExecution(finalRequest);
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
    public java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest request) {

        return updateAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(final UpdateAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgentRequest, UpdateAgentResult> asyncHandler) {
        final UpdateAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgentResult>() {
            @Override
            public UpdateAgentResult call() throws Exception {
                UpdateAgentResult result = null;

                try {
                    result = executeUpdateAgent(finalRequest);
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
    public java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest request) {

        return updateTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(final UpdateTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTaskRequest, UpdateTaskResult> asyncHandler) {
        final UpdateTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTaskResult>() {
            @Override
            public UpdateTaskResult call() throws Exception {
                UpdateTaskResult result = null;

                try {
                    result = executeUpdateTask(finalRequest);
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
