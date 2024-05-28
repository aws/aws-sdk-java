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
package com.amazonaws.services.kendraranking;

import javax.annotation.Generated;

import com.amazonaws.services.kendraranking.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Kendra Ranking asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Kendra Intelligent Ranking uses Amazon Kendra semantic search capabilities to intelligently re-rank a search
 * service's results.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKendraRankingAsyncClient extends AmazonKendraRankingClient implements AmazonKendraRankingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonKendraRankingAsyncClientBuilder asyncBuilder() {
        return AmazonKendraRankingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kendra Ranking using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKendraRankingAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kendra Ranking using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonKendraRankingAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateRescoreExecutionPlanResult> createRescoreExecutionPlanAsync(CreateRescoreExecutionPlanRequest request) {

        return createRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRescoreExecutionPlanResult> createRescoreExecutionPlanAsync(final CreateRescoreExecutionPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRescoreExecutionPlanRequest, CreateRescoreExecutionPlanResult> asyncHandler) {
        final CreateRescoreExecutionPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRescoreExecutionPlanResult>() {
            @Override
            public CreateRescoreExecutionPlanResult call() throws Exception {
                CreateRescoreExecutionPlanResult result = null;

                try {
                    result = executeCreateRescoreExecutionPlan(finalRequest);
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
    public java.util.concurrent.Future<DeleteRescoreExecutionPlanResult> deleteRescoreExecutionPlanAsync(DeleteRescoreExecutionPlanRequest request) {

        return deleteRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRescoreExecutionPlanResult> deleteRescoreExecutionPlanAsync(final DeleteRescoreExecutionPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRescoreExecutionPlanRequest, DeleteRescoreExecutionPlanResult> asyncHandler) {
        final DeleteRescoreExecutionPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRescoreExecutionPlanResult>() {
            @Override
            public DeleteRescoreExecutionPlanResult call() throws Exception {
                DeleteRescoreExecutionPlanResult result = null;

                try {
                    result = executeDeleteRescoreExecutionPlan(finalRequest);
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
    public java.util.concurrent.Future<DescribeRescoreExecutionPlanResult> describeRescoreExecutionPlanAsync(DescribeRescoreExecutionPlanRequest request) {

        return describeRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRescoreExecutionPlanResult> describeRescoreExecutionPlanAsync(final DescribeRescoreExecutionPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRescoreExecutionPlanRequest, DescribeRescoreExecutionPlanResult> asyncHandler) {
        final DescribeRescoreExecutionPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRescoreExecutionPlanResult>() {
            @Override
            public DescribeRescoreExecutionPlanResult call() throws Exception {
                DescribeRescoreExecutionPlanResult result = null;

                try {
                    result = executeDescribeRescoreExecutionPlan(finalRequest);
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
    public java.util.concurrent.Future<ListRescoreExecutionPlansResult> listRescoreExecutionPlansAsync(ListRescoreExecutionPlansRequest request) {

        return listRescoreExecutionPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRescoreExecutionPlansResult> listRescoreExecutionPlansAsync(final ListRescoreExecutionPlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRescoreExecutionPlansRequest, ListRescoreExecutionPlansResult> asyncHandler) {
        final ListRescoreExecutionPlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRescoreExecutionPlansResult>() {
            @Override
            public ListRescoreExecutionPlansResult call() throws Exception {
                ListRescoreExecutionPlansResult result = null;

                try {
                    result = executeListRescoreExecutionPlans(finalRequest);
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
    public java.util.concurrent.Future<RescoreResult> rescoreAsync(RescoreRequest request) {

        return rescoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RescoreResult> rescoreAsync(final RescoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<RescoreRequest, RescoreResult> asyncHandler) {
        final RescoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RescoreResult>() {
            @Override
            public RescoreResult call() throws Exception {
                RescoreResult result = null;

                try {
                    result = executeRescore(finalRequest);
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
    public java.util.concurrent.Future<UpdateRescoreExecutionPlanResult> updateRescoreExecutionPlanAsync(UpdateRescoreExecutionPlanRequest request) {

        return updateRescoreExecutionPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRescoreExecutionPlanResult> updateRescoreExecutionPlanAsync(final UpdateRescoreExecutionPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRescoreExecutionPlanRequest, UpdateRescoreExecutionPlanResult> asyncHandler) {
        final UpdateRescoreExecutionPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRescoreExecutionPlanResult>() {
            @Override
            public UpdateRescoreExecutionPlanResult call() throws Exception {
                UpdateRescoreExecutionPlanResult result = null;

                try {
                    result = executeUpdateRescoreExecutionPlan(finalRequest);
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
