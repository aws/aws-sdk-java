/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler;

import javax.annotation.Generated;

import com.amazonaws.services.codeguruprofiler.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CodeGuru Profiler asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Profiler API operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeGuruProfilerAsyncClient extends AmazonCodeGuruProfilerClient implements AmazonCodeGuruProfilerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonCodeGuruProfilerAsyncClientBuilder asyncBuilder() {
        return AmazonCodeGuruProfilerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CodeGuru Profiler using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruProfilerAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ConfigureAgentResult> configureAgentAsync(ConfigureAgentRequest request) {

        return configureAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfigureAgentResult> configureAgentAsync(final ConfigureAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfigureAgentRequest, ConfigureAgentResult> asyncHandler) {
        final ConfigureAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfigureAgentResult>() {
            @Override
            public ConfigureAgentResult call() throws Exception {
                ConfigureAgentResult result = null;

                try {
                    result = executeConfigureAgent(finalRequest);
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
    public java.util.concurrent.Future<CreateProfilingGroupResult> createProfilingGroupAsync(CreateProfilingGroupRequest request) {

        return createProfilingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfilingGroupResult> createProfilingGroupAsync(final CreateProfilingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfilingGroupRequest, CreateProfilingGroupResult> asyncHandler) {
        final CreateProfilingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfilingGroupResult>() {
            @Override
            public CreateProfilingGroupResult call() throws Exception {
                CreateProfilingGroupResult result = null;

                try {
                    result = executeCreateProfilingGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfilingGroupResult> deleteProfilingGroupAsync(DeleteProfilingGroupRequest request) {

        return deleteProfilingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfilingGroupResult> deleteProfilingGroupAsync(final DeleteProfilingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfilingGroupRequest, DeleteProfilingGroupResult> asyncHandler) {
        final DeleteProfilingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfilingGroupResult>() {
            @Override
            public DeleteProfilingGroupResult call() throws Exception {
                DeleteProfilingGroupResult result = null;

                try {
                    result = executeDeleteProfilingGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeProfilingGroupResult> describeProfilingGroupAsync(DescribeProfilingGroupRequest request) {

        return describeProfilingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProfilingGroupResult> describeProfilingGroupAsync(final DescribeProfilingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProfilingGroupRequest, DescribeProfilingGroupResult> asyncHandler) {
        final DescribeProfilingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProfilingGroupResult>() {
            @Override
            public DescribeProfilingGroupResult call() throws Exception {
                DescribeProfilingGroupResult result = null;

                try {
                    result = executeDescribeProfilingGroup(finalRequest);
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
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request) {

        return getProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(final GetProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler) {
        final GetProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileResult>() {
            @Override
            public GetProfileResult call() throws Exception {
                GetProfileResult result = null;

                try {
                    result = executeGetProfile(finalRequest);
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
    public java.util.concurrent.Future<ListProfileTimesResult> listProfileTimesAsync(ListProfileTimesRequest request) {

        return listProfileTimesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileTimesResult> listProfileTimesAsync(final ListProfileTimesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileTimesRequest, ListProfileTimesResult> asyncHandler) {
        final ListProfileTimesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileTimesResult>() {
            @Override
            public ListProfileTimesResult call() throws Exception {
                ListProfileTimesResult result = null;

                try {
                    result = executeListProfileTimes(finalRequest);
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
    public java.util.concurrent.Future<ListProfilingGroupsResult> listProfilingGroupsAsync(ListProfilingGroupsRequest request) {

        return listProfilingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilingGroupsResult> listProfilingGroupsAsync(final ListProfilingGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilingGroupsRequest, ListProfilingGroupsResult> asyncHandler) {
        final ListProfilingGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilingGroupsResult>() {
            @Override
            public ListProfilingGroupsResult call() throws Exception {
                ListProfilingGroupsResult result = null;

                try {
                    result = executeListProfilingGroups(finalRequest);
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
    public java.util.concurrent.Future<PostAgentProfileResult> postAgentProfileAsync(PostAgentProfileRequest request) {

        return postAgentProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostAgentProfileResult> postAgentProfileAsync(final PostAgentProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<PostAgentProfileRequest, PostAgentProfileResult> asyncHandler) {
        final PostAgentProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PostAgentProfileResult>() {
            @Override
            public PostAgentProfileResult call() throws Exception {
                PostAgentProfileResult result = null;

                try {
                    result = executePostAgentProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateProfilingGroupResult> updateProfilingGroupAsync(UpdateProfilingGroupRequest request) {

        return updateProfilingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfilingGroupResult> updateProfilingGroupAsync(final UpdateProfilingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfilingGroupRequest, UpdateProfilingGroupResult> asyncHandler) {
        final UpdateProfilingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfilingGroupResult>() {
            @Override
            public UpdateProfilingGroupResult call() throws Exception {
                UpdateProfilingGroupResult result = null;

                try {
                    result = executeUpdateProfilingGroup(finalRequest);
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
