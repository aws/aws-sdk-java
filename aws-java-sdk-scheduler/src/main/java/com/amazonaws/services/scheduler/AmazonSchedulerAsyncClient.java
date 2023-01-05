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
package com.amazonaws.services.scheduler;

import javax.annotation.Generated;

import com.amazonaws.services.scheduler.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon EventBridge Scheduler asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EventBridge Scheduler is a serverless scheduler that allows you to create, run, and manage tasks from one
 * central, managed service. EventBridge Scheduler delivers your tasks reliably, with built-in mechanisms that adjust
 * your schedules based on the availability of downstream targets. The following reference lists the available API
 * actions, and data types for EventBridge Scheduler.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSchedulerAsyncClient extends AmazonSchedulerClient implements AmazonSchedulerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSchedulerAsyncClientBuilder asyncBuilder() {
        return AmazonSchedulerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EventBridge Scheduler using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSchedulerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EventBridge Scheduler using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonSchedulerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest request) {

        return createScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(final CreateScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScheduleRequest, CreateScheduleResult> asyncHandler) {
        final CreateScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScheduleResult>() {
            @Override
            public CreateScheduleResult call() throws Exception {
                CreateScheduleResult result = null;

                try {
                    result = executeCreateSchedule(finalRequest);
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
    public java.util.concurrent.Future<CreateScheduleGroupResult> createScheduleGroupAsync(CreateScheduleGroupRequest request) {

        return createScheduleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleGroupResult> createScheduleGroupAsync(final CreateScheduleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScheduleGroupRequest, CreateScheduleGroupResult> asyncHandler) {
        final CreateScheduleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScheduleGroupResult>() {
            @Override
            public CreateScheduleGroupResult call() throws Exception {
                CreateScheduleGroupResult result = null;

                try {
                    result = executeCreateScheduleGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest request) {

        return deleteScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(final DeleteScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResult> asyncHandler) {
        final DeleteScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScheduleResult>() {
            @Override
            public DeleteScheduleResult call() throws Exception {
                DeleteScheduleResult result = null;

                try {
                    result = executeDeleteSchedule(finalRequest);
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
    public java.util.concurrent.Future<DeleteScheduleGroupResult> deleteScheduleGroupAsync(DeleteScheduleGroupRequest request) {

        return deleteScheduleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleGroupResult> deleteScheduleGroupAsync(final DeleteScheduleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScheduleGroupRequest, DeleteScheduleGroupResult> asyncHandler) {
        final DeleteScheduleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScheduleGroupResult>() {
            @Override
            public DeleteScheduleGroupResult call() throws Exception {
                DeleteScheduleGroupResult result = null;

                try {
                    result = executeDeleteScheduleGroup(finalRequest);
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
    public java.util.concurrent.Future<GetScheduleResult> getScheduleAsync(GetScheduleRequest request) {

        return getScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScheduleResult> getScheduleAsync(final GetScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetScheduleRequest, GetScheduleResult> asyncHandler) {
        final GetScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetScheduleResult>() {
            @Override
            public GetScheduleResult call() throws Exception {
                GetScheduleResult result = null;

                try {
                    result = executeGetSchedule(finalRequest);
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
    public java.util.concurrent.Future<GetScheduleGroupResult> getScheduleGroupAsync(GetScheduleGroupRequest request) {

        return getScheduleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScheduleGroupResult> getScheduleGroupAsync(final GetScheduleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetScheduleGroupRequest, GetScheduleGroupResult> asyncHandler) {
        final GetScheduleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetScheduleGroupResult>() {
            @Override
            public GetScheduleGroupResult call() throws Exception {
                GetScheduleGroupResult result = null;

                try {
                    result = executeGetScheduleGroup(finalRequest);
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
    public java.util.concurrent.Future<ListScheduleGroupsResult> listScheduleGroupsAsync(ListScheduleGroupsRequest request) {

        return listScheduleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListScheduleGroupsResult> listScheduleGroupsAsync(final ListScheduleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListScheduleGroupsRequest, ListScheduleGroupsResult> asyncHandler) {
        final ListScheduleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListScheduleGroupsResult>() {
            @Override
            public ListScheduleGroupsResult call() throws Exception {
                ListScheduleGroupsResult result = null;

                try {
                    result = executeListScheduleGroups(finalRequest);
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
    public java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest request) {

        return listSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(final ListSchedulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchedulesRequest, ListSchedulesResult> asyncHandler) {
        final ListSchedulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchedulesResult>() {
            @Override
            public ListSchedulesResult call() throws Exception {
                ListSchedulesResult result = null;

                try {
                    result = executeListSchedules(finalRequest);
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
    public java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest request) {

        return updateScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(final UpdateScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResult> asyncHandler) {
        final UpdateScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateScheduleResult>() {
            @Override
            public UpdateScheduleResult call() throws Exception {
                UpdateScheduleResult result = null;

                try {
                    result = executeUpdateSchedule(finalRequest);
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
