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
package com.amazonaws.services.fis;

import javax.annotation.Generated;

import com.amazonaws.services.fis.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing FIS asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * AWS Fault Injection Simulator is a managed service that enables you to perform fault injection experiments on your
 * AWS workloads. For more information, see the <a href="https://docs.aws.amazon.com/fis/latest/userguide/">AWS Fault
 * Injection Simulator User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSFISAsyncClient extends AWSFISClient implements AWSFISAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSFISAsyncClientBuilder asyncBuilder() {
        return AWSFISAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on FIS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSFISAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on FIS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSFISAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateExperimentTemplateResult> createExperimentTemplateAsync(CreateExperimentTemplateRequest request) {

        return createExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExperimentTemplateResult> createExperimentTemplateAsync(final CreateExperimentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExperimentTemplateRequest, CreateExperimentTemplateResult> asyncHandler) {
        final CreateExperimentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExperimentTemplateResult>() {
            @Override
            public CreateExperimentTemplateResult call() throws Exception {
                CreateExperimentTemplateResult result = null;

                try {
                    result = executeCreateExperimentTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteExperimentTemplateResult> deleteExperimentTemplateAsync(DeleteExperimentTemplateRequest request) {

        return deleteExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExperimentTemplateResult> deleteExperimentTemplateAsync(final DeleteExperimentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExperimentTemplateRequest, DeleteExperimentTemplateResult> asyncHandler) {
        final DeleteExperimentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExperimentTemplateResult>() {
            @Override
            public DeleteExperimentTemplateResult call() throws Exception {
                DeleteExperimentTemplateResult result = null;

                try {
                    result = executeDeleteExperimentTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetActionResult> getActionAsync(GetActionRequest request) {

        return getActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActionResult> getActionAsync(final GetActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetActionRequest, GetActionResult> asyncHandler) {
        final GetActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetActionResult>() {
            @Override
            public GetActionResult call() throws Exception {
                GetActionResult result = null;

                try {
                    result = executeGetAction(finalRequest);
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
    public java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest request) {

        return getExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(final GetExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExperimentRequest, GetExperimentResult> asyncHandler) {
        final GetExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExperimentResult>() {
            @Override
            public GetExperimentResult call() throws Exception {
                GetExperimentResult result = null;

                try {
                    result = executeGetExperiment(finalRequest);
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
    public java.util.concurrent.Future<GetExperimentTemplateResult> getExperimentTemplateAsync(GetExperimentTemplateRequest request) {

        return getExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExperimentTemplateResult> getExperimentTemplateAsync(final GetExperimentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExperimentTemplateRequest, GetExperimentTemplateResult> asyncHandler) {
        final GetExperimentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExperimentTemplateResult>() {
            @Override
            public GetExperimentTemplateResult call() throws Exception {
                GetExperimentTemplateResult result = null;

                try {
                    result = executeGetExperimentTemplate(finalRequest);
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
    public java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest request) {

        return listActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActionsResult> listActionsAsync(final ListActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActionsRequest, ListActionsResult> asyncHandler) {
        final ListActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListActionsResult>() {
            @Override
            public ListActionsResult call() throws Exception {
                ListActionsResult result = null;

                try {
                    result = executeListActions(finalRequest);
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
    public java.util.concurrent.Future<ListExperimentTemplatesResult> listExperimentTemplatesAsync(ListExperimentTemplatesRequest request) {

        return listExperimentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExperimentTemplatesResult> listExperimentTemplatesAsync(final ListExperimentTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExperimentTemplatesRequest, ListExperimentTemplatesResult> asyncHandler) {
        final ListExperimentTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExperimentTemplatesResult>() {
            @Override
            public ListExperimentTemplatesResult call() throws Exception {
                ListExperimentTemplatesResult result = null;

                try {
                    result = executeListExperimentTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest request) {

        return listExperimentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(final ListExperimentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExperimentsRequest, ListExperimentsResult> asyncHandler) {
        final ListExperimentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExperimentsResult>() {
            @Override
            public ListExperimentsResult call() throws Exception {
                ListExperimentsResult result = null;

                try {
                    result = executeListExperiments(finalRequest);
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
    public java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest request) {

        return startExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(final StartExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExperimentRequest, StartExperimentResult> asyncHandler) {
        final StartExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartExperimentResult>() {
            @Override
            public StartExperimentResult call() throws Exception {
                StartExperimentResult result = null;

                try {
                    result = executeStartExperiment(finalRequest);
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
    public java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest request) {

        return stopExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(final StopExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopExperimentRequest, StopExperimentResult> asyncHandler) {
        final StopExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopExperimentResult>() {
            @Override
            public StopExperimentResult call() throws Exception {
                StopExperimentResult result = null;

                try {
                    result = executeStopExperiment(finalRequest);
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
    public java.util.concurrent.Future<UpdateExperimentTemplateResult> updateExperimentTemplateAsync(UpdateExperimentTemplateRequest request) {

        return updateExperimentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExperimentTemplateResult> updateExperimentTemplateAsync(final UpdateExperimentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExperimentTemplateRequest, UpdateExperimentTemplateResult> asyncHandler) {
        final UpdateExperimentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExperimentTemplateResult>() {
            @Override
            public UpdateExperimentTemplateResult call() throws Exception {
                UpdateExperimentTemplateResult result = null;

                try {
                    result = executeUpdateExperimentTemplate(finalRequest);
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
