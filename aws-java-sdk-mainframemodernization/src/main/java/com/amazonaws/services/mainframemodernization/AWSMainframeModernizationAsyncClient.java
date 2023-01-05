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
package com.amazonaws.services.mainframemodernization;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSMainframeModernization asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Mainframe Modernization provides tools and resources to help you plan and implement migration and
 * modernization from mainframes to Amazon Web Services managed runtime environments. It provides tools for analyzing
 * existing mainframe applications, developing or updating mainframe applications using COBOL or PL/I, and implementing
 * an automated pipeline for continuous integration and continuous delivery (CI/CD) of the applications.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMainframeModernizationAsyncClient extends AWSMainframeModernizationClient implements AWSMainframeModernizationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMainframeModernizationAsyncClientBuilder asyncBuilder() {
        return AWSMainframeModernizationAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSMainframeModernization using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMainframeModernizationAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSMainframeModernization using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMainframeModernizationAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelBatchJobExecutionResult> cancelBatchJobExecutionAsync(CancelBatchJobExecutionRequest request) {

        return cancelBatchJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelBatchJobExecutionResult> cancelBatchJobExecutionAsync(final CancelBatchJobExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelBatchJobExecutionRequest, CancelBatchJobExecutionResult> asyncHandler) {
        final CancelBatchJobExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelBatchJobExecutionResult>() {
            @Override
            public CancelBatchJobExecutionResult call() throws Exception {
                CancelBatchJobExecutionResult result = null;

                try {
                    result = executeCancelBatchJobExecution(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateDataSetImportTaskResult> createDataSetImportTaskAsync(CreateDataSetImportTaskRequest request) {

        return createDataSetImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSetImportTaskResult> createDataSetImportTaskAsync(final CreateDataSetImportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSetImportTaskRequest, CreateDataSetImportTaskResult> asyncHandler) {
        final CreateDataSetImportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSetImportTaskResult>() {
            @Override
            public CreateDataSetImportTaskResult call() throws Exception {
                CreateDataSetImportTaskResult result = null;

                try {
                    result = executeCreateDataSetImportTask(finalRequest);
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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {
        final CreateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentResult>() {
            @Override
            public CreateEnvironmentResult call() throws Exception {
                CreateEnvironmentResult result = null;

                try {
                    result = executeCreateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationFromEnvironmentResult> deleteApplicationFromEnvironmentAsync(
            DeleteApplicationFromEnvironmentRequest request) {

        return deleteApplicationFromEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationFromEnvironmentResult> deleteApplicationFromEnvironmentAsync(
            final DeleteApplicationFromEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationFromEnvironmentRequest, DeleteApplicationFromEnvironmentResult> asyncHandler) {
        final DeleteApplicationFromEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationFromEnvironmentResult>() {
            @Override
            public DeleteApplicationFromEnvironmentResult call() throws Exception {
                DeleteApplicationFromEnvironmentResult result = null;

                try {
                    result = executeDeleteApplicationFromEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(final DeleteEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {
        final DeleteEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentResult>() {
            @Override
            public DeleteEnvironmentResult call() throws Exception {
                DeleteEnvironmentResult result = null;

                try {
                    result = executeDeleteEnvironment(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationVersionResult> getApplicationVersionAsync(GetApplicationVersionRequest request) {

        return getApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationVersionResult> getApplicationVersionAsync(final GetApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationVersionRequest, GetApplicationVersionResult> asyncHandler) {
        final GetApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationVersionResult>() {
            @Override
            public GetApplicationVersionResult call() throws Exception {
                GetApplicationVersionResult result = null;

                try {
                    result = executeGetApplicationVersion(finalRequest);
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
    public java.util.concurrent.Future<GetBatchJobExecutionResult> getBatchJobExecutionAsync(GetBatchJobExecutionRequest request) {

        return getBatchJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBatchJobExecutionResult> getBatchJobExecutionAsync(final GetBatchJobExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBatchJobExecutionRequest, GetBatchJobExecutionResult> asyncHandler) {
        final GetBatchJobExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBatchJobExecutionResult>() {
            @Override
            public GetBatchJobExecutionResult call() throws Exception {
                GetBatchJobExecutionResult result = null;

                try {
                    result = executeGetBatchJobExecution(finalRequest);
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
    public java.util.concurrent.Future<GetDataSetDetailsResult> getDataSetDetailsAsync(GetDataSetDetailsRequest request) {

        return getDataSetDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSetDetailsResult> getDataSetDetailsAsync(final GetDataSetDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSetDetailsRequest, GetDataSetDetailsResult> asyncHandler) {
        final GetDataSetDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSetDetailsResult>() {
            @Override
            public GetDataSetDetailsResult call() throws Exception {
                GetDataSetDetailsResult result = null;

                try {
                    result = executeGetDataSetDetails(finalRequest);
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
    public java.util.concurrent.Future<GetDataSetImportTaskResult> getDataSetImportTaskAsync(GetDataSetImportTaskRequest request) {

        return getDataSetImportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSetImportTaskResult> getDataSetImportTaskAsync(final GetDataSetImportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSetImportTaskRequest, GetDataSetImportTaskResult> asyncHandler) {
        final GetDataSetImportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSetImportTaskResult>() {
            @Override
            public GetDataSetImportTaskResult call() throws Exception {
                GetDataSetImportTaskResult result = null;

                try {
                    result = executeGetDataSetImportTask(finalRequest);
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
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request) {

        return getEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(final GetEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler) {
        final GetEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentResult>() {
            @Override
            public GetEnvironmentResult call() throws Exception {
                GetEnvironmentResult result = null;

                try {
                    result = executeGetEnvironment(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest request) {

        return listApplicationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(final ListApplicationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationVersionsRequest, ListApplicationVersionsResult> asyncHandler) {
        final ListApplicationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationVersionsResult>() {
            @Override
            public ListApplicationVersionsResult call() throws Exception {
                ListApplicationVersionsResult result = null;

                try {
                    result = executeListApplicationVersions(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<ListBatchJobDefinitionsResult> listBatchJobDefinitionsAsync(ListBatchJobDefinitionsRequest request) {

        return listBatchJobDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobDefinitionsResult> listBatchJobDefinitionsAsync(final ListBatchJobDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBatchJobDefinitionsRequest, ListBatchJobDefinitionsResult> asyncHandler) {
        final ListBatchJobDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBatchJobDefinitionsResult>() {
            @Override
            public ListBatchJobDefinitionsResult call() throws Exception {
                ListBatchJobDefinitionsResult result = null;

                try {
                    result = executeListBatchJobDefinitions(finalRequest);
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
    public java.util.concurrent.Future<ListBatchJobExecutionsResult> listBatchJobExecutionsAsync(ListBatchJobExecutionsRequest request) {

        return listBatchJobExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBatchJobExecutionsResult> listBatchJobExecutionsAsync(final ListBatchJobExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBatchJobExecutionsRequest, ListBatchJobExecutionsResult> asyncHandler) {
        final ListBatchJobExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBatchJobExecutionsResult>() {
            @Override
            public ListBatchJobExecutionsResult call() throws Exception {
                ListBatchJobExecutionsResult result = null;

                try {
                    result = executeListBatchJobExecutions(finalRequest);
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
    public java.util.concurrent.Future<ListDataSetImportHistoryResult> listDataSetImportHistoryAsync(ListDataSetImportHistoryRequest request) {

        return listDataSetImportHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetImportHistoryResult> listDataSetImportHistoryAsync(final ListDataSetImportHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSetImportHistoryRequest, ListDataSetImportHistoryResult> asyncHandler) {
        final ListDataSetImportHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSetImportHistoryResult>() {
            @Override
            public ListDataSetImportHistoryResult call() throws Exception {
                ListDataSetImportHistoryResult result = null;

                try {
                    result = executeListDataSetImportHistory(finalRequest);
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
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest request) {

        return listDataSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(final ListDataSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler) {
        final ListDataSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSetsResult>() {
            @Override
            public ListDataSetsResult call() throws Exception {
                ListDataSetsResult result = null;

                try {
                    result = executeListDataSets(finalRequest);
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
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {
        final ListDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result = null;

                try {
                    result = executeListDeployments(finalRequest);
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
    public java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest request) {

        return listEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(final ListEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEngineVersionsRequest, ListEngineVersionsResult> asyncHandler) {
        final ListEngineVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEngineVersionsResult>() {
            @Override
            public ListEngineVersionsResult call() throws Exception {
                ListEngineVersionsResult result = null;

                try {
                    result = executeListEngineVersions(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(final ListEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {
        final ListEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentsResult>() {
            @Override
            public ListEnvironmentsResult call() throws Exception {
                ListEnvironmentsResult result = null;

                try {
                    result = executeListEnvironments(finalRequest);
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
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest request) {

        return startApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(final StartApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler) {
        final StartApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartApplicationResult>() {
            @Override
            public StartApplicationResult call() throws Exception {
                StartApplicationResult result = null;

                try {
                    result = executeStartApplication(finalRequest);
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
    public java.util.concurrent.Future<StartBatchJobResult> startBatchJobAsync(StartBatchJobRequest request) {

        return startBatchJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBatchJobResult> startBatchJobAsync(final StartBatchJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBatchJobRequest, StartBatchJobResult> asyncHandler) {
        final StartBatchJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBatchJobResult>() {
            @Override
            public StartBatchJobResult call() throws Exception {
                StartBatchJobResult result = null;

                try {
                    result = executeStartBatchJob(finalRequest);
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
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest request) {

        return stopApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(final StopApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler) {
        final StopApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopApplicationResult>() {
            @Override
            public StopApplicationResult call() throws Exception {
                StopApplicationResult result = null;

                try {
                    result = executeStopApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
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
