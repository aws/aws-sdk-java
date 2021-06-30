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
package com.amazonaws.services.gluedatabrew;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Glue DataBrew asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Glue DataBrew is a visual, cloud-scale data-preparation service. DataBrew simplifies data preparation tasks,
 * targeting data issues that are hard to spot and time-consuming to fix. DataBrew empowers users of all technical
 * levels to visualize the data and perform one-click data transformations, with no coding required.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGlueDataBrewAsyncClient extends AWSGlueDataBrewClient implements AWSGlueDataBrewAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGlueDataBrewAsyncClientBuilder asyncBuilder() {
        return AWSGlueDataBrewAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Glue DataBrew using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGlueDataBrewAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Glue DataBrew using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSGlueDataBrewAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchDeleteRecipeVersionResult> batchDeleteRecipeVersionAsync(BatchDeleteRecipeVersionRequest request) {

        return batchDeleteRecipeVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteRecipeVersionResult> batchDeleteRecipeVersionAsync(final BatchDeleteRecipeVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteRecipeVersionRequest, BatchDeleteRecipeVersionResult> asyncHandler) {
        final BatchDeleteRecipeVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteRecipeVersionResult>() {
            @Override
            public BatchDeleteRecipeVersionResult call() throws Exception {
                BatchDeleteRecipeVersionResult result = null;

                try {
                    result = executeBatchDeleteRecipeVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest request) {

        return createDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(final CreateDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler) {
        final CreateDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetResult>() {
            @Override
            public CreateDatasetResult call() throws Exception {
                CreateDatasetResult result = null;

                try {
                    result = executeCreateDataset(finalRequest);
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
    public java.util.concurrent.Future<CreateProfileJobResult> createProfileJobAsync(CreateProfileJobRequest request) {

        return createProfileJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileJobResult> createProfileJobAsync(final CreateProfileJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileJobRequest, CreateProfileJobResult> asyncHandler) {
        final CreateProfileJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileJobResult>() {
            @Override
            public CreateProfileJobResult call() throws Exception {
                CreateProfileJobResult result = null;

                try {
                    result = executeCreateProfileJob(finalRequest);
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
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(final CreateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {
        final CreateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectResult>() {
            @Override
            public CreateProjectResult call() throws Exception {
                CreateProjectResult result = null;

                try {
                    result = executeCreateProject(finalRequest);
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
    public java.util.concurrent.Future<CreateRecipeResult> createRecipeAsync(CreateRecipeRequest request) {

        return createRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecipeResult> createRecipeAsync(final CreateRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRecipeRequest, CreateRecipeResult> asyncHandler) {
        final CreateRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRecipeResult>() {
            @Override
            public CreateRecipeResult call() throws Exception {
                CreateRecipeResult result = null;

                try {
                    result = executeCreateRecipe(finalRequest);
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
    public java.util.concurrent.Future<CreateRecipeJobResult> createRecipeJobAsync(CreateRecipeJobRequest request) {

        return createRecipeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecipeJobResult> createRecipeJobAsync(final CreateRecipeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRecipeJobRequest, CreateRecipeJobResult> asyncHandler) {
        final CreateRecipeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRecipeJobResult>() {
            @Override
            public CreateRecipeJobResult call() throws Exception {
                CreateRecipeJobResult result = null;

                try {
                    result = executeCreateRecipeJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(final DeleteDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {
        final DeleteDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetResult>() {
            @Override
            public DeleteDatasetResult call() throws Exception {
                DeleteDatasetResult result = null;

                try {
                    result = executeDeleteDataset(finalRequest);
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
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest request) {

        return deleteJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(final DeleteJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler) {
        final DeleteJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobResult>() {
            @Override
            public DeleteJobResult call() throws Exception {
                DeleteJobResult result = null;

                try {
                    result = executeDeleteJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(final DeleteProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {
        final DeleteProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectResult>() {
            @Override
            public DeleteProjectResult call() throws Exception {
                DeleteProjectResult result = null;

                try {
                    result = executeDeleteProject(finalRequest);
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
    public java.util.concurrent.Future<DeleteRecipeVersionResult> deleteRecipeVersionAsync(DeleteRecipeVersionRequest request) {

        return deleteRecipeVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecipeVersionResult> deleteRecipeVersionAsync(final DeleteRecipeVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecipeVersionRequest, DeleteRecipeVersionResult> asyncHandler) {
        final DeleteRecipeVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecipeVersionResult>() {
            @Override
            public DeleteRecipeVersionResult call() throws Exception {
                DeleteRecipeVersionResult result = null;

                try {
                    result = executeDeleteRecipeVersion(finalRequest);
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
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request) {

        return describeDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(final DescribeDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler) {
        final DescribeDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetResult>() {
            @Override
            public DescribeDatasetResult call() throws Exception {
                DescribeDatasetResult result = null;

                try {
                    result = executeDescribeDataset(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(final DescribeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {
        final DescribeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobResult>() {
            @Override
            public DescribeJobResult call() throws Exception {
                DescribeJobResult result = null;

                try {
                    result = executeDescribeJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(DescribeJobRunRequest request) {

        return describeJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(final DescribeJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobRunRequest, DescribeJobRunResult> asyncHandler) {
        final DescribeJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobRunResult>() {
            @Override
            public DescribeJobRunResult call() throws Exception {
                DescribeJobRunResult result = null;

                try {
                    result = executeDescribeJobRun(finalRequest);
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
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request) {

        return describeProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(final DescribeProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler) {
        final DescribeProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProjectResult>() {
            @Override
            public DescribeProjectResult call() throws Exception {
                DescribeProjectResult result = null;

                try {
                    result = executeDescribeProject(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest request) {

        return describeRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(final DescribeRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecipeRequest, DescribeRecipeResult> asyncHandler) {
        final DescribeRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecipeResult>() {
            @Override
            public DescribeRecipeResult call() throws Exception {
                DescribeRecipeResult result = null;

                try {
                    result = executeDescribeRecipe(finalRequest);
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
    public java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(DescribeScheduleRequest request) {

        return describeScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(final DescribeScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduleRequest, DescribeScheduleResult> asyncHandler) {
        final DescribeScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduleResult>() {
            @Override
            public DescribeScheduleResult call() throws Exception {
                DescribeScheduleResult result = null;

                try {
                    result = executeDescribeSchedule(finalRequest);
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
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(final ListDatasetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {
        final ListDatasetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetsResult>() {
            @Override
            public ListDatasetsResult call() throws Exception {
                ListDatasetsResult result = null;

                try {
                    result = executeListDatasets(finalRequest);
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
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request) {

        return listJobRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(final ListJobRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler) {
        final ListJobRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobRunsResult>() {
            @Override
            public ListJobRunsResult call() throws Exception {
                ListJobRunsResult result = null;

                try {
                    result = executeListJobRuns(finalRequest);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {
        final ListJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result = null;

                try {
                    result = executeListJobs(finalRequest);
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
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(final ListProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {
        final ListProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectsResult>() {
            @Override
            public ListProjectsResult call() throws Exception {
                ListProjectsResult result = null;

                try {
                    result = executeListProjects(finalRequest);
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
    public java.util.concurrent.Future<ListRecipeVersionsResult> listRecipeVersionsAsync(ListRecipeVersionsRequest request) {

        return listRecipeVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecipeVersionsResult> listRecipeVersionsAsync(final ListRecipeVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecipeVersionsRequest, ListRecipeVersionsResult> asyncHandler) {
        final ListRecipeVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecipeVersionsResult>() {
            @Override
            public ListRecipeVersionsResult call() throws Exception {
                ListRecipeVersionsResult result = null;

                try {
                    result = executeListRecipeVersions(finalRequest);
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
    public java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest request) {

        return listRecipesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(final ListRecipesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecipesRequest, ListRecipesResult> asyncHandler) {
        final ListRecipesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecipesResult>() {
            @Override
            public ListRecipesResult call() throws Exception {
                ListRecipesResult result = null;

                try {
                    result = executeListRecipes(finalRequest);
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
    public java.util.concurrent.Future<PublishRecipeResult> publishRecipeAsync(PublishRecipeRequest request) {

        return publishRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishRecipeResult> publishRecipeAsync(final PublishRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishRecipeRequest, PublishRecipeResult> asyncHandler) {
        final PublishRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishRecipeResult>() {
            @Override
            public PublishRecipeResult call() throws Exception {
                PublishRecipeResult result = null;

                try {
                    result = executePublishRecipe(finalRequest);
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
    public java.util.concurrent.Future<SendProjectSessionActionResult> sendProjectSessionActionAsync(SendProjectSessionActionRequest request) {

        return sendProjectSessionActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendProjectSessionActionResult> sendProjectSessionActionAsync(final SendProjectSessionActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendProjectSessionActionRequest, SendProjectSessionActionResult> asyncHandler) {
        final SendProjectSessionActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendProjectSessionActionResult>() {
            @Override
            public SendProjectSessionActionResult call() throws Exception {
                SendProjectSessionActionResult result = null;

                try {
                    result = executeSendProjectSessionAction(finalRequest);
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
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request) {

        return startJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(final StartJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler) {
        final StartJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartJobRunResult>() {
            @Override
            public StartJobRunResult call() throws Exception {
                StartJobRunResult result = null;

                try {
                    result = executeStartJobRun(finalRequest);
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
    public java.util.concurrent.Future<StartProjectSessionResult> startProjectSessionAsync(StartProjectSessionRequest request) {

        return startProjectSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartProjectSessionResult> startProjectSessionAsync(final StartProjectSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartProjectSessionRequest, StartProjectSessionResult> asyncHandler) {
        final StartProjectSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartProjectSessionResult>() {
            @Override
            public StartProjectSessionResult call() throws Exception {
                StartProjectSessionResult result = null;

                try {
                    result = executeStartProjectSession(finalRequest);
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
    public java.util.concurrent.Future<StopJobRunResult> stopJobRunAsync(StopJobRunRequest request) {

        return stopJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopJobRunResult> stopJobRunAsync(final StopJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopJobRunRequest, StopJobRunResult> asyncHandler) {
        final StopJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopJobRunResult>() {
            @Override
            public StopJobRunResult call() throws Exception {
                StopJobRunResult result = null;

                try {
                    result = executeStopJobRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest request) {

        return updateDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(final UpdateDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler) {
        final UpdateDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDatasetResult>() {
            @Override
            public UpdateDatasetResult call() throws Exception {
                UpdateDatasetResult result = null;

                try {
                    result = executeUpdateDataset(finalRequest);
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
    public java.util.concurrent.Future<UpdateProfileJobResult> updateProfileJobAsync(UpdateProfileJobRequest request) {

        return updateProfileJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileJobResult> updateProfileJobAsync(final UpdateProfileJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileJobRequest, UpdateProfileJobResult> asyncHandler) {
        final UpdateProfileJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileJobResult>() {
            @Override
            public UpdateProfileJobResult call() throws Exception {
                UpdateProfileJobResult result = null;

                try {
                    result = executeUpdateProfileJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(final UpdateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {
        final UpdateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProjectResult>() {
            @Override
            public UpdateProjectResult call() throws Exception {
                UpdateProjectResult result = null;

                try {
                    result = executeUpdateProject(finalRequest);
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
    public java.util.concurrent.Future<UpdateRecipeResult> updateRecipeAsync(UpdateRecipeRequest request) {

        return updateRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecipeResult> updateRecipeAsync(final UpdateRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRecipeRequest, UpdateRecipeResult> asyncHandler) {
        final UpdateRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRecipeResult>() {
            @Override
            public UpdateRecipeResult call() throws Exception {
                UpdateRecipeResult result = null;

                try {
                    result = executeUpdateRecipe(finalRequest);
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
    public java.util.concurrent.Future<UpdateRecipeJobResult> updateRecipeJobAsync(UpdateRecipeJobRequest request) {

        return updateRecipeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecipeJobResult> updateRecipeJobAsync(final UpdateRecipeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRecipeJobRequest, UpdateRecipeJobResult> asyncHandler) {
        final UpdateRecipeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRecipeJobResult>() {
            @Override
            public UpdateRecipeJobResult call() throws Exception {
                UpdateRecipeJobResult result = null;

                try {
                    result = executeUpdateRecipeJob(finalRequest);
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
