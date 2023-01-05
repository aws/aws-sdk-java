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
package com.amazonaws.services.migrationhuborchestrator;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhuborchestrator.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Migration Hub Orchestrator asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Migration Hub Orchestrator. he topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubOrchestratorAsyncClient extends AWSMigrationHubOrchestratorClient implements AWSMigrationHubOrchestratorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMigrationHubOrchestratorAsyncClientBuilder asyncBuilder() {
        return AWSMigrationHubOrchestratorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Migration Hub Orchestrator using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubOrchestratorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Migration Hub Orchestrator using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMigrationHubOrchestratorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request) {

        return createWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(final CreateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler) {
        final CreateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkflowResult>() {
            @Override
            public CreateWorkflowResult call() throws Exception {
                CreateWorkflowResult result = null;

                try {
                    result = executeCreateWorkflow(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkflowStepResult> createWorkflowStepAsync(CreateWorkflowStepRequest request) {

        return createWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowStepResult> createWorkflowStepAsync(final CreateWorkflowStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkflowStepRequest, CreateWorkflowStepResult> asyncHandler) {
        final CreateWorkflowStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkflowStepResult>() {
            @Override
            public CreateWorkflowStepResult call() throws Exception {
                CreateWorkflowStepResult result = null;

                try {
                    result = executeCreateWorkflowStep(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkflowStepGroupResult> createWorkflowStepGroupAsync(CreateWorkflowStepGroupRequest request) {

        return createWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowStepGroupResult> createWorkflowStepGroupAsync(final CreateWorkflowStepGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkflowStepGroupRequest, CreateWorkflowStepGroupResult> asyncHandler) {
        final CreateWorkflowStepGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkflowStepGroupResult>() {
            @Override
            public CreateWorkflowStepGroupResult call() throws Exception {
                CreateWorkflowStepGroupResult result = null;

                try {
                    result = executeCreateWorkflowStepGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(final DeleteWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {
        final DeleteWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowResult>() {
            @Override
            public DeleteWorkflowResult call() throws Exception {
                DeleteWorkflowResult result = null;

                try {
                    result = executeDeleteWorkflow(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowStepResult> deleteWorkflowStepAsync(DeleteWorkflowStepRequest request) {

        return deleteWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowStepResult> deleteWorkflowStepAsync(final DeleteWorkflowStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowStepRequest, DeleteWorkflowStepResult> asyncHandler) {
        final DeleteWorkflowStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowStepResult>() {
            @Override
            public DeleteWorkflowStepResult call() throws Exception {
                DeleteWorkflowStepResult result = null;

                try {
                    result = executeDeleteWorkflowStep(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkflowStepGroupResult> deleteWorkflowStepGroupAsync(DeleteWorkflowStepGroupRequest request) {

        return deleteWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowStepGroupResult> deleteWorkflowStepGroupAsync(final DeleteWorkflowStepGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkflowStepGroupRequest, DeleteWorkflowStepGroupResult> asyncHandler) {
        final DeleteWorkflowStepGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkflowStepGroupResult>() {
            @Override
            public DeleteWorkflowStepGroupResult call() throws Exception {
                DeleteWorkflowStepGroupResult result = null;

                try {
                    result = executeDeleteWorkflowStepGroup(finalRequest);
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
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {
        final GetTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateResult>() {
            @Override
            public GetTemplateResult call() throws Exception {
                GetTemplateResult result = null;

                try {
                    result = executeGetTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetTemplateStepResult> getTemplateStepAsync(GetTemplateStepRequest request) {

        return getTemplateStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateStepResult> getTemplateStepAsync(final GetTemplateStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateStepRequest, GetTemplateStepResult> asyncHandler) {
        final GetTemplateStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateStepResult>() {
            @Override
            public GetTemplateStepResult call() throws Exception {
                GetTemplateStepResult result = null;

                try {
                    result = executeGetTemplateStep(finalRequest);
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
    public java.util.concurrent.Future<GetTemplateStepGroupResult> getTemplateStepGroupAsync(GetTemplateStepGroupRequest request) {

        return getTemplateStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateStepGroupResult> getTemplateStepGroupAsync(final GetTemplateStepGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateStepGroupRequest, GetTemplateStepGroupResult> asyncHandler) {
        final GetTemplateStepGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateStepGroupResult>() {
            @Override
            public GetTemplateStepGroupResult call() throws Exception {
                GetTemplateStepGroupResult result = null;

                try {
                    result = executeGetTemplateStepGroup(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request) {

        return getWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(final GetWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler) {
        final GetWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowResult>() {
            @Override
            public GetWorkflowResult call() throws Exception {
                GetWorkflowResult result = null;

                try {
                    result = executeGetWorkflow(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowStepResult> getWorkflowStepAsync(GetWorkflowStepRequest request) {

        return getWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepResult> getWorkflowStepAsync(final GetWorkflowStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowStepRequest, GetWorkflowStepResult> asyncHandler) {
        final GetWorkflowStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowStepResult>() {
            @Override
            public GetWorkflowStepResult call() throws Exception {
                GetWorkflowStepResult result = null;

                try {
                    result = executeGetWorkflowStep(finalRequest);
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
    public java.util.concurrent.Future<GetWorkflowStepGroupResult> getWorkflowStepGroupAsync(GetWorkflowStepGroupRequest request) {

        return getWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepGroupResult> getWorkflowStepGroupAsync(final GetWorkflowStepGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowStepGroupRequest, GetWorkflowStepGroupResult> asyncHandler) {
        final GetWorkflowStepGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkflowStepGroupResult>() {
            @Override
            public GetWorkflowStepGroupResult call() throws Exception {
                GetWorkflowStepGroupResult result = null;

                try {
                    result = executeGetWorkflowStepGroup(finalRequest);
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
    public java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest request) {

        return listPluginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(final ListPluginsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPluginsRequest, ListPluginsResult> asyncHandler) {
        final ListPluginsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPluginsResult>() {
            @Override
            public ListPluginsResult call() throws Exception {
                ListPluginsResult result = null;

                try {
                    result = executeListPlugins(finalRequest);
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
    public java.util.concurrent.Future<ListTemplateStepGroupsResult> listTemplateStepGroupsAsync(ListTemplateStepGroupsRequest request) {

        return listTemplateStepGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateStepGroupsResult> listTemplateStepGroupsAsync(final ListTemplateStepGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateStepGroupsRequest, ListTemplateStepGroupsResult> asyncHandler) {
        final ListTemplateStepGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateStepGroupsResult>() {
            @Override
            public ListTemplateStepGroupsResult call() throws Exception {
                ListTemplateStepGroupsResult result = null;

                try {
                    result = executeListTemplateStepGroups(finalRequest);
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
    public java.util.concurrent.Future<ListTemplateStepsResult> listTemplateStepsAsync(ListTemplateStepsRequest request) {

        return listTemplateStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateStepsResult> listTemplateStepsAsync(final ListTemplateStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateStepsRequest, ListTemplateStepsResult> asyncHandler) {
        final ListTemplateStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateStepsResult>() {
            @Override
            public ListTemplateStepsResult call() throws Exception {
                ListTemplateStepsResult result = null;

                try {
                    result = executeListTemplateSteps(finalRequest);
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
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest request) {

        return listTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(final ListTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler) {
        final ListTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplatesResult>() {
            @Override
            public ListTemplatesResult call() throws Exception {
                ListTemplatesResult result = null;

                try {
                    result = executeListTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowStepGroupsResult> listWorkflowStepGroupsAsync(ListWorkflowStepGroupsRequest request) {

        return listWorkflowStepGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowStepGroupsResult> listWorkflowStepGroupsAsync(final ListWorkflowStepGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowStepGroupsRequest, ListWorkflowStepGroupsResult> asyncHandler) {
        final ListWorkflowStepGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowStepGroupsResult>() {
            @Override
            public ListWorkflowStepGroupsResult call() throws Exception {
                ListWorkflowStepGroupsResult result = null;

                try {
                    result = executeListWorkflowStepGroups(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowStepsResult> listWorkflowStepsAsync(ListWorkflowStepsRequest request) {

        return listWorkflowStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowStepsResult> listWorkflowStepsAsync(final ListWorkflowStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowStepsRequest, ListWorkflowStepsResult> asyncHandler) {
        final ListWorkflowStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowStepsResult>() {
            @Override
            public ListWorkflowStepsResult call() throws Exception {
                ListWorkflowStepsResult result = null;

                try {
                    result = executeListWorkflowSteps(finalRequest);
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
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(final ListWorkflowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {
        final ListWorkflowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkflowsResult>() {
            @Override
            public ListWorkflowsResult call() throws Exception {
                ListWorkflowsResult result = null;

                try {
                    result = executeListWorkflows(finalRequest);
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
    public java.util.concurrent.Future<RetryWorkflowStepResult> retryWorkflowStepAsync(RetryWorkflowStepRequest request) {

        return retryWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryWorkflowStepResult> retryWorkflowStepAsync(final RetryWorkflowStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetryWorkflowStepRequest, RetryWorkflowStepResult> asyncHandler) {
        final RetryWorkflowStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetryWorkflowStepResult>() {
            @Override
            public RetryWorkflowStepResult call() throws Exception {
                RetryWorkflowStepResult result = null;

                try {
                    result = executeRetryWorkflowStep(finalRequest);
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
    public java.util.concurrent.Future<StartWorkflowResult> startWorkflowAsync(StartWorkflowRequest request) {

        return startWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWorkflowResult> startWorkflowAsync(final StartWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartWorkflowRequest, StartWorkflowResult> asyncHandler) {
        final StartWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartWorkflowResult>() {
            @Override
            public StartWorkflowResult call() throws Exception {
                StartWorkflowResult result = null;

                try {
                    result = executeStartWorkflow(finalRequest);
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
    public java.util.concurrent.Future<StopWorkflowResult> stopWorkflowAsync(StopWorkflowRequest request) {

        return stopWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopWorkflowResult> stopWorkflowAsync(final StopWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopWorkflowRequest, StopWorkflowResult> asyncHandler) {
        final StopWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopWorkflowResult>() {
            @Override
            public StopWorkflowResult call() throws Exception {
                StopWorkflowResult result = null;

                try {
                    result = executeStopWorkflow(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request) {

        return updateWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(final UpdateWorkflowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler) {
        final UpdateWorkflowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkflowResult>() {
            @Override
            public UpdateWorkflowResult call() throws Exception {
                UpdateWorkflowResult result = null;

                try {
                    result = executeUpdateWorkflow(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkflowStepResult> updateWorkflowStepAsync(UpdateWorkflowStepRequest request) {

        return updateWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowStepResult> updateWorkflowStepAsync(final UpdateWorkflowStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkflowStepRequest, UpdateWorkflowStepResult> asyncHandler) {
        final UpdateWorkflowStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkflowStepResult>() {
            @Override
            public UpdateWorkflowStepResult call() throws Exception {
                UpdateWorkflowStepResult result = null;

                try {
                    result = executeUpdateWorkflowStep(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkflowStepGroupResult> updateWorkflowStepGroupAsync(UpdateWorkflowStepGroupRequest request) {

        return updateWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowStepGroupResult> updateWorkflowStepGroupAsync(final UpdateWorkflowStepGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkflowStepGroupRequest, UpdateWorkflowStepGroupResult> asyncHandler) {
        final UpdateWorkflowStepGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkflowStepGroupResult>() {
            @Override
            public UpdateWorkflowStepGroupResult call() throws Exception {
                UpdateWorkflowStepGroupResult result = null;

                try {
                    result = executeUpdateWorkflowStepGroup(finalRequest);
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
