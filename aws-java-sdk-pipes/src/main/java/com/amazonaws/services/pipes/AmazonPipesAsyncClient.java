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
package com.amazonaws.services.pipes;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon EventBridge Pipes asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EventBridge Pipes connects event sources to targets. Pipes reduces the need for specialized knowledge and
 * integration code when developing event driven architectures. This helps ensures consistency across your company’s
 * applications. With Pipes, the target can be any available EventBridge target. To set up a pipe, you select the event
 * source, add optional event filtering, define optional enrichment, and select the target for the event data.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPipesAsyncClient extends AmazonPipesClient implements AmazonPipesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPipesAsyncClientBuilder asyncBuilder() {
        return AmazonPipesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EventBridge Pipes using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPipesAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EventBridge Pipes using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonPipesAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreatePipeResult> createPipeAsync(CreatePipeRequest request) {

        return createPipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipeResult> createPipeAsync(final CreatePipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePipeRequest, CreatePipeResult> asyncHandler) {
        final CreatePipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePipeResult>() {
            @Override
            public CreatePipeResult call() throws Exception {
                CreatePipeResult result = null;

                try {
                    result = executeCreatePipe(finalRequest);
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
    public java.util.concurrent.Future<DeletePipeResult> deletePipeAsync(DeletePipeRequest request) {

        return deletePipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipeResult> deletePipeAsync(final DeletePipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePipeRequest, DeletePipeResult> asyncHandler) {
        final DeletePipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePipeResult>() {
            @Override
            public DeletePipeResult call() throws Exception {
                DeletePipeResult result = null;

                try {
                    result = executeDeletePipe(finalRequest);
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
    public java.util.concurrent.Future<DescribePipeResult> describePipeAsync(DescribePipeRequest request) {

        return describePipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipeResult> describePipeAsync(final DescribePipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePipeRequest, DescribePipeResult> asyncHandler) {
        final DescribePipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePipeResult>() {
            @Override
            public DescribePipeResult call() throws Exception {
                DescribePipeResult result = null;

                try {
                    result = executeDescribePipe(finalRequest);
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
    public java.util.concurrent.Future<ListPipesResult> listPipesAsync(ListPipesRequest request) {

        return listPipesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipesResult> listPipesAsync(final ListPipesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipesRequest, ListPipesResult> asyncHandler) {
        final ListPipesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipesResult>() {
            @Override
            public ListPipesResult call() throws Exception {
                ListPipesResult result = null;

                try {
                    result = executeListPipes(finalRequest);
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
    public java.util.concurrent.Future<StartPipeResult> startPipeAsync(StartPipeRequest request) {

        return startPipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipeResult> startPipeAsync(final StartPipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPipeRequest, StartPipeResult> asyncHandler) {
        final StartPipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartPipeResult>() {
            @Override
            public StartPipeResult call() throws Exception {
                StartPipeResult result = null;

                try {
                    result = executeStartPipe(finalRequest);
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
    public java.util.concurrent.Future<StopPipeResult> stopPipeAsync(StopPipeRequest request) {

        return stopPipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPipeResult> stopPipeAsync(final StopPipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopPipeRequest, StopPipeResult> asyncHandler) {
        final StopPipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopPipeResult>() {
            @Override
            public StopPipeResult call() throws Exception {
                StopPipeResult result = null;

                try {
                    result = executeStopPipe(finalRequest);
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
    public java.util.concurrent.Future<UpdatePipeResult> updatePipeAsync(UpdatePipeRequest request) {

        return updatePipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipeResult> updatePipeAsync(final UpdatePipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipeRequest, UpdatePipeResult> asyncHandler) {
        final UpdatePipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipeResult>() {
            @Override
            public UpdatePipeResult call() throws Exception {
                UpdatePipeResult result = null;

                try {
                    result = executeUpdatePipe(finalRequest);
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
