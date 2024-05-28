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
package com.amazonaws.services.appfabric;

import javax.annotation.Generated;

import com.amazonaws.services.appfabric.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AppFabric asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services AppFabric quickly connects software as a service (SaaS) applications across your organization.
 * This allows IT and security teams to easily manage and secure applications using a standard schema, and employees can
 * complete everyday tasks faster using generative artificial intelligence (AI). You can use these APIs to complete
 * AppFabric tasks, such as setting up audit log ingestions or viewing user access. For more information about
 * AppFabric, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/appfabric/latest/adminguide/">Amazon Web Services AppFabric Administration
 * Guide</a>. For more information about using the Command Line Interface (CLI) to manage your AppFabric resources, see
 * the <a href="https://docs.aws.amazon.com/cli/latest/reference/appfabric/index.html">AppFabric section of the CLI
 * Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppFabricAsyncClient extends AWSAppFabricClient implements AWSAppFabricAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAppFabricAsyncClientBuilder asyncBuilder() {
        return AWSAppFabricAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AppFabric using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAppFabricAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AppFabric using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAppFabricAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetUserAccessTasksResult> batchGetUserAccessTasksAsync(BatchGetUserAccessTasksRequest request) {

        return batchGetUserAccessTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetUserAccessTasksResult> batchGetUserAccessTasksAsync(final BatchGetUserAccessTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetUserAccessTasksRequest, BatchGetUserAccessTasksResult> asyncHandler) {
        final BatchGetUserAccessTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetUserAccessTasksResult>() {
            @Override
            public BatchGetUserAccessTasksResult call() throws Exception {
                BatchGetUserAccessTasksResult result = null;

                try {
                    result = executeBatchGetUserAccessTasks(finalRequest);
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
    public java.util.concurrent.Future<ConnectAppAuthorizationResult> connectAppAuthorizationAsync(ConnectAppAuthorizationRequest request) {

        return connectAppAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConnectAppAuthorizationResult> connectAppAuthorizationAsync(final ConnectAppAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConnectAppAuthorizationRequest, ConnectAppAuthorizationResult> asyncHandler) {
        final ConnectAppAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConnectAppAuthorizationResult>() {
            @Override
            public ConnectAppAuthorizationResult call() throws Exception {
                ConnectAppAuthorizationResult result = null;

                try {
                    result = executeConnectAppAuthorization(finalRequest);
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
    public java.util.concurrent.Future<CreateAppAuthorizationResult> createAppAuthorizationAsync(CreateAppAuthorizationRequest request) {

        return createAppAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppAuthorizationResult> createAppAuthorizationAsync(final CreateAppAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppAuthorizationRequest, CreateAppAuthorizationResult> asyncHandler) {
        final CreateAppAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppAuthorizationResult>() {
            @Override
            public CreateAppAuthorizationResult call() throws Exception {
                CreateAppAuthorizationResult result = null;

                try {
                    result = executeCreateAppAuthorization(finalRequest);
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
    public java.util.concurrent.Future<CreateAppBundleResult> createAppBundleAsync(CreateAppBundleRequest request) {

        return createAppBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppBundleResult> createAppBundleAsync(final CreateAppBundleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppBundleRequest, CreateAppBundleResult> asyncHandler) {
        final CreateAppBundleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppBundleResult>() {
            @Override
            public CreateAppBundleResult call() throws Exception {
                CreateAppBundleResult result = null;

                try {
                    result = executeCreateAppBundle(finalRequest);
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
    public java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(CreateIngestionRequest request) {

        return createIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(final CreateIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIngestionRequest, CreateIngestionResult> asyncHandler) {
        final CreateIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIngestionResult>() {
            @Override
            public CreateIngestionResult call() throws Exception {
                CreateIngestionResult result = null;

                try {
                    result = executeCreateIngestion(finalRequest);
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
    public java.util.concurrent.Future<CreateIngestionDestinationResult> createIngestionDestinationAsync(CreateIngestionDestinationRequest request) {

        return createIngestionDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIngestionDestinationResult> createIngestionDestinationAsync(final CreateIngestionDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIngestionDestinationRequest, CreateIngestionDestinationResult> asyncHandler) {
        final CreateIngestionDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIngestionDestinationResult>() {
            @Override
            public CreateIngestionDestinationResult call() throws Exception {
                CreateIngestionDestinationResult result = null;

                try {
                    result = executeCreateIngestionDestination(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppAuthorizationResult> deleteAppAuthorizationAsync(DeleteAppAuthorizationRequest request) {

        return deleteAppAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppAuthorizationResult> deleteAppAuthorizationAsync(final DeleteAppAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppAuthorizationRequest, DeleteAppAuthorizationResult> asyncHandler) {
        final DeleteAppAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppAuthorizationResult>() {
            @Override
            public DeleteAppAuthorizationResult call() throws Exception {
                DeleteAppAuthorizationResult result = null;

                try {
                    result = executeDeleteAppAuthorization(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppBundleResult> deleteAppBundleAsync(DeleteAppBundleRequest request) {

        return deleteAppBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppBundleResult> deleteAppBundleAsync(final DeleteAppBundleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppBundleRequest, DeleteAppBundleResult> asyncHandler) {
        final DeleteAppBundleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppBundleResult>() {
            @Override
            public DeleteAppBundleResult call() throws Exception {
                DeleteAppBundleResult result = null;

                try {
                    result = executeDeleteAppBundle(finalRequest);
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
    public java.util.concurrent.Future<DeleteIngestionResult> deleteIngestionAsync(DeleteIngestionRequest request) {

        return deleteIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIngestionResult> deleteIngestionAsync(final DeleteIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIngestionRequest, DeleteIngestionResult> asyncHandler) {
        final DeleteIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIngestionResult>() {
            @Override
            public DeleteIngestionResult call() throws Exception {
                DeleteIngestionResult result = null;

                try {
                    result = executeDeleteIngestion(finalRequest);
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
    public java.util.concurrent.Future<DeleteIngestionDestinationResult> deleteIngestionDestinationAsync(DeleteIngestionDestinationRequest request) {

        return deleteIngestionDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIngestionDestinationResult> deleteIngestionDestinationAsync(final DeleteIngestionDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIngestionDestinationRequest, DeleteIngestionDestinationResult> asyncHandler) {
        final DeleteIngestionDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIngestionDestinationResult>() {
            @Override
            public DeleteIngestionDestinationResult call() throws Exception {
                DeleteIngestionDestinationResult result = null;

                try {
                    result = executeDeleteIngestionDestination(finalRequest);
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
    public java.util.concurrent.Future<GetAppAuthorizationResult> getAppAuthorizationAsync(GetAppAuthorizationRequest request) {

        return getAppAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppAuthorizationResult> getAppAuthorizationAsync(final GetAppAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppAuthorizationRequest, GetAppAuthorizationResult> asyncHandler) {
        final GetAppAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppAuthorizationResult>() {
            @Override
            public GetAppAuthorizationResult call() throws Exception {
                GetAppAuthorizationResult result = null;

                try {
                    result = executeGetAppAuthorization(finalRequest);
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
    public java.util.concurrent.Future<GetAppBundleResult> getAppBundleAsync(GetAppBundleRequest request) {

        return getAppBundleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppBundleResult> getAppBundleAsync(final GetAppBundleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppBundleRequest, GetAppBundleResult> asyncHandler) {
        final GetAppBundleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppBundleResult>() {
            @Override
            public GetAppBundleResult call() throws Exception {
                GetAppBundleResult result = null;

                try {
                    result = executeGetAppBundle(finalRequest);
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
    public java.util.concurrent.Future<GetIngestionResult> getIngestionAsync(GetIngestionRequest request) {

        return getIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIngestionResult> getIngestionAsync(final GetIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIngestionRequest, GetIngestionResult> asyncHandler) {
        final GetIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIngestionResult>() {
            @Override
            public GetIngestionResult call() throws Exception {
                GetIngestionResult result = null;

                try {
                    result = executeGetIngestion(finalRequest);
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
    public java.util.concurrent.Future<GetIngestionDestinationResult> getIngestionDestinationAsync(GetIngestionDestinationRequest request) {

        return getIngestionDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIngestionDestinationResult> getIngestionDestinationAsync(final GetIngestionDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIngestionDestinationRequest, GetIngestionDestinationResult> asyncHandler) {
        final GetIngestionDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIngestionDestinationResult>() {
            @Override
            public GetIngestionDestinationResult call() throws Exception {
                GetIngestionDestinationResult result = null;

                try {
                    result = executeGetIngestionDestination(finalRequest);
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
    public java.util.concurrent.Future<ListAppAuthorizationsResult> listAppAuthorizationsAsync(ListAppAuthorizationsRequest request) {

        return listAppAuthorizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppAuthorizationsResult> listAppAuthorizationsAsync(final ListAppAuthorizationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppAuthorizationsRequest, ListAppAuthorizationsResult> asyncHandler) {
        final ListAppAuthorizationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppAuthorizationsResult>() {
            @Override
            public ListAppAuthorizationsResult call() throws Exception {
                ListAppAuthorizationsResult result = null;

                try {
                    result = executeListAppAuthorizations(finalRequest);
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
    public java.util.concurrent.Future<ListAppBundlesResult> listAppBundlesAsync(ListAppBundlesRequest request) {

        return listAppBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppBundlesResult> listAppBundlesAsync(final ListAppBundlesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppBundlesRequest, ListAppBundlesResult> asyncHandler) {
        final ListAppBundlesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppBundlesResult>() {
            @Override
            public ListAppBundlesResult call() throws Exception {
                ListAppBundlesResult result = null;

                try {
                    result = executeListAppBundles(finalRequest);
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
    public java.util.concurrent.Future<ListIngestionDestinationsResult> listIngestionDestinationsAsync(ListIngestionDestinationsRequest request) {

        return listIngestionDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIngestionDestinationsResult> listIngestionDestinationsAsync(final ListIngestionDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIngestionDestinationsRequest, ListIngestionDestinationsResult> asyncHandler) {
        final ListIngestionDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIngestionDestinationsResult>() {
            @Override
            public ListIngestionDestinationsResult call() throws Exception {
                ListIngestionDestinationsResult result = null;

                try {
                    result = executeListIngestionDestinations(finalRequest);
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
    public java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(ListIngestionsRequest request) {

        return listIngestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(final ListIngestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIngestionsRequest, ListIngestionsResult> asyncHandler) {
        final ListIngestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIngestionsResult>() {
            @Override
            public ListIngestionsResult call() throws Exception {
                ListIngestionsResult result = null;

                try {
                    result = executeListIngestions(finalRequest);
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
    public java.util.concurrent.Future<StartIngestionResult> startIngestionAsync(StartIngestionRequest request) {

        return startIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartIngestionResult> startIngestionAsync(final StartIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartIngestionRequest, StartIngestionResult> asyncHandler) {
        final StartIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartIngestionResult>() {
            @Override
            public StartIngestionResult call() throws Exception {
                StartIngestionResult result = null;

                try {
                    result = executeStartIngestion(finalRequest);
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
    public java.util.concurrent.Future<StartUserAccessTasksResult> startUserAccessTasksAsync(StartUserAccessTasksRequest request) {

        return startUserAccessTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartUserAccessTasksResult> startUserAccessTasksAsync(final StartUserAccessTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartUserAccessTasksRequest, StartUserAccessTasksResult> asyncHandler) {
        final StartUserAccessTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartUserAccessTasksResult>() {
            @Override
            public StartUserAccessTasksResult call() throws Exception {
                StartUserAccessTasksResult result = null;

                try {
                    result = executeStartUserAccessTasks(finalRequest);
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
    public java.util.concurrent.Future<StopIngestionResult> stopIngestionAsync(StopIngestionRequest request) {

        return stopIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopIngestionResult> stopIngestionAsync(final StopIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopIngestionRequest, StopIngestionResult> asyncHandler) {
        final StopIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopIngestionResult>() {
            @Override
            public StopIngestionResult call() throws Exception {
                StopIngestionResult result = null;

                try {
                    result = executeStopIngestion(finalRequest);
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
    public java.util.concurrent.Future<UpdateAppAuthorizationResult> updateAppAuthorizationAsync(UpdateAppAuthorizationRequest request) {

        return updateAppAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppAuthorizationResult> updateAppAuthorizationAsync(final UpdateAppAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppAuthorizationRequest, UpdateAppAuthorizationResult> asyncHandler) {
        final UpdateAppAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppAuthorizationResult>() {
            @Override
            public UpdateAppAuthorizationResult call() throws Exception {
                UpdateAppAuthorizationResult result = null;

                try {
                    result = executeUpdateAppAuthorization(finalRequest);
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
    public java.util.concurrent.Future<UpdateIngestionDestinationResult> updateIngestionDestinationAsync(UpdateIngestionDestinationRequest request) {

        return updateIngestionDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIngestionDestinationResult> updateIngestionDestinationAsync(final UpdateIngestionDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIngestionDestinationRequest, UpdateIngestionDestinationResult> asyncHandler) {
        final UpdateIngestionDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIngestionDestinationResult>() {
            @Override
            public UpdateIngestionDestinationResult call() throws Exception {
                UpdateIngestionDestinationResult result = null;

                try {
                    result = executeUpdateIngestionDestination(finalRequest);
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
