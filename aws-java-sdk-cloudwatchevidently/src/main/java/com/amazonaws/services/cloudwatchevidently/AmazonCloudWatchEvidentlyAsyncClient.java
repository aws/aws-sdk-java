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
package com.amazonaws.services.cloudwatchevidently;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CloudWatch Evidently asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * You can use Amazon CloudWatch Evidently to safely validate new features by serving them to a specified percentage of
 * your users while you roll out the feature. You can monitor the performance of the new feature to help you decide when
 * to ramp up traffic to your users. This helps you reduce risk and identify unintended consequences before you fully
 * launch the feature.
 * </p>
 * <p>
 * You can also conduct A/B experiments to make feature design decisions based on evidence and data. An experiment can
 * test as many as five variations at once. Evidently collects experiment data and analyzes it using statistical
 * methods. It also provides clear recommendations about which variations perform better. You can test both user-facing
 * features and backend features.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchEvidentlyAsyncClient extends AmazonCloudWatchEvidentlyClient implements AmazonCloudWatchEvidentlyAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonCloudWatchEvidentlyAsyncClientBuilder asyncBuilder() {
        return AmazonCloudWatchEvidentlyAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Evidently using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEvidentlyAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Evidently using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonCloudWatchEvidentlyAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchEvaluateFeatureResult> batchEvaluateFeatureAsync(BatchEvaluateFeatureRequest request) {

        return batchEvaluateFeatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchEvaluateFeatureResult> batchEvaluateFeatureAsync(final BatchEvaluateFeatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchEvaluateFeatureRequest, BatchEvaluateFeatureResult> asyncHandler) {
        final BatchEvaluateFeatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchEvaluateFeatureResult>() {
            @Override
            public BatchEvaluateFeatureResult call() throws Exception {
                BatchEvaluateFeatureResult result = null;

                try {
                    result = executeBatchEvaluateFeature(finalRequest);
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
    public java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(CreateExperimentRequest request) {

        return createExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(final CreateExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExperimentRequest, CreateExperimentResult> asyncHandler) {
        final CreateExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExperimentResult>() {
            @Override
            public CreateExperimentResult call() throws Exception {
                CreateExperimentResult result = null;

                try {
                    result = executeCreateExperiment(finalRequest);
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
    public java.util.concurrent.Future<CreateFeatureResult> createFeatureAsync(CreateFeatureRequest request) {

        return createFeatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFeatureResult> createFeatureAsync(final CreateFeatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFeatureRequest, CreateFeatureResult> asyncHandler) {
        final CreateFeatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFeatureResult>() {
            @Override
            public CreateFeatureResult call() throws Exception {
                CreateFeatureResult result = null;

                try {
                    result = executeCreateFeature(finalRequest);
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
    public java.util.concurrent.Future<CreateLaunchResult> createLaunchAsync(CreateLaunchRequest request) {

        return createLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchResult> createLaunchAsync(final CreateLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLaunchRequest, CreateLaunchResult> asyncHandler) {
        final CreateLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLaunchResult>() {
            @Override
            public CreateLaunchResult call() throws Exception {
                CreateLaunchResult result = null;

                try {
                    result = executeCreateLaunch(finalRequest);
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
    public java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest request) {

        return createSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(final CreateSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler) {
        final CreateSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSegmentResult>() {
            @Override
            public CreateSegmentResult call() throws Exception {
                CreateSegmentResult result = null;

                try {
                    result = executeCreateSegment(finalRequest);
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
    public java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(DeleteExperimentRequest request) {

        return deleteExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(final DeleteExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResult> asyncHandler) {
        final DeleteExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExperimentResult>() {
            @Override
            public DeleteExperimentResult call() throws Exception {
                DeleteExperimentResult result = null;

                try {
                    result = executeDeleteExperiment(finalRequest);
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
    public java.util.concurrent.Future<DeleteFeatureResult> deleteFeatureAsync(DeleteFeatureRequest request) {

        return deleteFeatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFeatureResult> deleteFeatureAsync(final DeleteFeatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFeatureRequest, DeleteFeatureResult> asyncHandler) {
        final DeleteFeatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFeatureResult>() {
            @Override
            public DeleteFeatureResult call() throws Exception {
                DeleteFeatureResult result = null;

                try {
                    result = executeDeleteFeature(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchResult> deleteLaunchAsync(DeleteLaunchRequest request) {

        return deleteLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchResult> deleteLaunchAsync(final DeleteLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchRequest, DeleteLaunchResult> asyncHandler) {
        final DeleteLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchResult>() {
            @Override
            public DeleteLaunchResult call() throws Exception {
                DeleteLaunchResult result = null;

                try {
                    result = executeDeleteLaunch(finalRequest);
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
    public java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest request) {

        return deleteSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(final DeleteSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler) {
        final DeleteSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSegmentResult>() {
            @Override
            public DeleteSegmentResult call() throws Exception {
                DeleteSegmentResult result = null;

                try {
                    result = executeDeleteSegment(finalRequest);
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
    public java.util.concurrent.Future<EvaluateFeatureResult> evaluateFeatureAsync(EvaluateFeatureRequest request) {

        return evaluateFeatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluateFeatureResult> evaluateFeatureAsync(final EvaluateFeatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<EvaluateFeatureRequest, EvaluateFeatureResult> asyncHandler) {
        final EvaluateFeatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EvaluateFeatureResult>() {
            @Override
            public EvaluateFeatureResult call() throws Exception {
                EvaluateFeatureResult result = null;

                try {
                    result = executeEvaluateFeature(finalRequest);
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
    public java.util.concurrent.Future<GetExperimentResultsResult> getExperimentResultsAsync(GetExperimentResultsRequest request) {

        return getExperimentResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExperimentResultsResult> getExperimentResultsAsync(final GetExperimentResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExperimentResultsRequest, GetExperimentResultsResult> asyncHandler) {
        final GetExperimentResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExperimentResultsResult>() {
            @Override
            public GetExperimentResultsResult call() throws Exception {
                GetExperimentResultsResult result = null;

                try {
                    result = executeGetExperimentResults(finalRequest);
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
    public java.util.concurrent.Future<GetFeatureResult> getFeatureAsync(GetFeatureRequest request) {

        return getFeatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFeatureResult> getFeatureAsync(final GetFeatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFeatureRequest, GetFeatureResult> asyncHandler) {
        final GetFeatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFeatureResult>() {
            @Override
            public GetFeatureResult call() throws Exception {
                GetFeatureResult result = null;

                try {
                    result = executeGetFeature(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchResult> getLaunchAsync(GetLaunchRequest request) {

        return getLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchResult> getLaunchAsync(final GetLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchRequest, GetLaunchResult> asyncHandler) {
        final GetLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchResult>() {
            @Override
            public GetLaunchResult call() throws Exception {
                GetLaunchResult result = null;

                try {
                    result = executeGetLaunch(finalRequest);
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
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest request) {

        return getProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(final GetProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler) {
        final GetProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProjectResult>() {
            @Override
            public GetProjectResult call() throws Exception {
                GetProjectResult result = null;

                try {
                    result = executeGetProject(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest request) {

        return getSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(final GetSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler) {
        final GetSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentResult>() {
            @Override
            public GetSegmentResult call() throws Exception {
                GetSegmentResult result = null;

                try {
                    result = executeGetSegment(finalRequest);
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
    public java.util.concurrent.Future<ListFeaturesResult> listFeaturesAsync(ListFeaturesRequest request) {

        return listFeaturesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFeaturesResult> listFeaturesAsync(final ListFeaturesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFeaturesRequest, ListFeaturesResult> asyncHandler) {
        final ListFeaturesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFeaturesResult>() {
            @Override
            public ListFeaturesResult call() throws Exception {
                ListFeaturesResult result = null;

                try {
                    result = executeListFeatures(finalRequest);
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
    public java.util.concurrent.Future<ListLaunchesResult> listLaunchesAsync(ListLaunchesRequest request) {

        return listLaunchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchesResult> listLaunchesAsync(final ListLaunchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLaunchesRequest, ListLaunchesResult> asyncHandler) {
        final ListLaunchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLaunchesResult>() {
            @Override
            public ListLaunchesResult call() throws Exception {
                ListLaunchesResult result = null;

                try {
                    result = executeListLaunches(finalRequest);
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
    public java.util.concurrent.Future<ListSegmentReferencesResult> listSegmentReferencesAsync(ListSegmentReferencesRequest request) {

        return listSegmentReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSegmentReferencesResult> listSegmentReferencesAsync(final ListSegmentReferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSegmentReferencesRequest, ListSegmentReferencesResult> asyncHandler) {
        final ListSegmentReferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSegmentReferencesResult>() {
            @Override
            public ListSegmentReferencesResult call() throws Exception {
                ListSegmentReferencesResult result = null;

                try {
                    result = executeListSegmentReferences(finalRequest);
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
    public java.util.concurrent.Future<ListSegmentsResult> listSegmentsAsync(ListSegmentsRequest request) {

        return listSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSegmentsResult> listSegmentsAsync(final ListSegmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSegmentsRequest, ListSegmentsResult> asyncHandler) {
        final ListSegmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSegmentsResult>() {
            @Override
            public ListSegmentsResult call() throws Exception {
                ListSegmentsResult result = null;

                try {
                    result = executeListSegments(finalRequest);
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
    public java.util.concurrent.Future<PutProjectEventsResult> putProjectEventsAsync(PutProjectEventsRequest request) {

        return putProjectEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutProjectEventsResult> putProjectEventsAsync(final PutProjectEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutProjectEventsRequest, PutProjectEventsResult> asyncHandler) {
        final PutProjectEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutProjectEventsResult>() {
            @Override
            public PutProjectEventsResult call() throws Exception {
                PutProjectEventsResult result = null;

                try {
                    result = executePutProjectEvents(finalRequest);
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
    public java.util.concurrent.Future<StartLaunchResult> startLaunchAsync(StartLaunchRequest request) {

        return startLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLaunchResult> startLaunchAsync(final StartLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartLaunchRequest, StartLaunchResult> asyncHandler) {
        final StartLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartLaunchResult>() {
            @Override
            public StartLaunchResult call() throws Exception {
                StartLaunchResult result = null;

                try {
                    result = executeStartLaunch(finalRequest);
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
    public java.util.concurrent.Future<StopLaunchResult> stopLaunchAsync(StopLaunchRequest request) {

        return stopLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopLaunchResult> stopLaunchAsync(final StopLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopLaunchRequest, StopLaunchResult> asyncHandler) {
        final StopLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopLaunchResult>() {
            @Override
            public StopLaunchResult call() throws Exception {
                StopLaunchResult result = null;

                try {
                    result = executeStopLaunch(finalRequest);
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
    public java.util.concurrent.Future<TestSegmentPatternResult> testSegmentPatternAsync(TestSegmentPatternRequest request) {

        return testSegmentPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestSegmentPatternResult> testSegmentPatternAsync(final TestSegmentPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestSegmentPatternRequest, TestSegmentPatternResult> asyncHandler) {
        final TestSegmentPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestSegmentPatternResult>() {
            @Override
            public TestSegmentPatternResult call() throws Exception {
                TestSegmentPatternResult result = null;

                try {
                    result = executeTestSegmentPattern(finalRequest);
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
    public java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(UpdateExperimentRequest request) {

        return updateExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(final UpdateExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResult> asyncHandler) {
        final UpdateExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExperimentResult>() {
            @Override
            public UpdateExperimentResult call() throws Exception {
                UpdateExperimentResult result = null;

                try {
                    result = executeUpdateExperiment(finalRequest);
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
    public java.util.concurrent.Future<UpdateFeatureResult> updateFeatureAsync(UpdateFeatureRequest request) {

        return updateFeatureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFeatureResult> updateFeatureAsync(final UpdateFeatureRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFeatureRequest, UpdateFeatureResult> asyncHandler) {
        final UpdateFeatureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFeatureResult>() {
            @Override
            public UpdateFeatureResult call() throws Exception {
                UpdateFeatureResult result = null;

                try {
                    result = executeUpdateFeature(finalRequest);
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
    public java.util.concurrent.Future<UpdateLaunchResult> updateLaunchAsync(UpdateLaunchRequest request) {

        return updateLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchResult> updateLaunchAsync(final UpdateLaunchRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLaunchRequest, UpdateLaunchResult> asyncHandler) {
        final UpdateLaunchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLaunchResult>() {
            @Override
            public UpdateLaunchResult call() throws Exception {
                UpdateLaunchResult result = null;

                try {
                    result = executeUpdateLaunch(finalRequest);
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
    public java.util.concurrent.Future<UpdateProjectDataDeliveryResult> updateProjectDataDeliveryAsync(UpdateProjectDataDeliveryRequest request) {

        return updateProjectDataDeliveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectDataDeliveryResult> updateProjectDataDeliveryAsync(final UpdateProjectDataDeliveryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProjectDataDeliveryRequest, UpdateProjectDataDeliveryResult> asyncHandler) {
        final UpdateProjectDataDeliveryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProjectDataDeliveryResult>() {
            @Override
            public UpdateProjectDataDeliveryResult call() throws Exception {
                UpdateProjectDataDeliveryResult result = null;

                try {
                    result = executeUpdateProjectDataDelivery(finalRequest);
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
