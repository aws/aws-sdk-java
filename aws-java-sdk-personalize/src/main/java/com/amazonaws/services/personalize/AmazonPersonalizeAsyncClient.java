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
package com.amazonaws.services.personalize;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Personalize asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to
 * customers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPersonalizeAsyncClient extends AmazonPersonalizeClient implements AmazonPersonalizeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPersonalizeAsyncClientBuilder asyncBuilder() {
        return AmazonPersonalizeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Personalize using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPersonalizeAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateBatchInferenceJobResult> createBatchInferenceJobAsync(CreateBatchInferenceJobRequest request) {

        return createBatchInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchInferenceJobResult> createBatchInferenceJobAsync(final CreateBatchInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBatchInferenceJobRequest, CreateBatchInferenceJobResult> asyncHandler) {
        final CreateBatchInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBatchInferenceJobResult>() {
            @Override
            public CreateBatchInferenceJobResult call() throws Exception {
                CreateBatchInferenceJobResult result = null;

                try {
                    result = executeCreateBatchInferenceJob(finalRequest);
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
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(final CreateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {
        final CreateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCampaignResult>() {
            @Override
            public CreateCampaignResult call() throws Exception {
                CreateCampaignResult result = null;

                try {
                    result = executeCreateCampaign(finalRequest);
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
    public java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest request) {

        return createDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(final CreateDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetGroupRequest, CreateDatasetGroupResult> asyncHandler) {
        final CreateDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetGroupResult>() {
            @Override
            public CreateDatasetGroupResult call() throws Exception {
                CreateDatasetGroupResult result = null;

                try {
                    result = executeCreateDatasetGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest request) {

        return createDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(final CreateDatasetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatasetImportJobRequest, CreateDatasetImportJobResult> asyncHandler) {
        final CreateDatasetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatasetImportJobResult>() {
            @Override
            public CreateDatasetImportJobResult call() throws Exception {
                CreateDatasetImportJobResult result = null;

                try {
                    result = executeCreateDatasetImportJob(finalRequest);
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
    public java.util.concurrent.Future<CreateEventTrackerResult> createEventTrackerAsync(CreateEventTrackerRequest request) {

        return createEventTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventTrackerResult> createEventTrackerAsync(final CreateEventTrackerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventTrackerRequest, CreateEventTrackerResult> asyncHandler) {
        final CreateEventTrackerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventTrackerResult>() {
            @Override
            public CreateEventTrackerResult call() throws Exception {
                CreateEventTrackerResult result = null;

                try {
                    result = executeCreateEventTracker(finalRequest);
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
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request) {

        return createSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(final CreateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler) {
        final CreateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSchemaResult>() {
            @Override
            public CreateSchemaResult call() throws Exception {
                CreateSchemaResult result = null;

                try {
                    result = executeCreateSchema(finalRequest);
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
    public java.util.concurrent.Future<CreateSolutionResult> createSolutionAsync(CreateSolutionRequest request) {

        return createSolutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolutionResult> createSolutionAsync(final CreateSolutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSolutionRequest, CreateSolutionResult> asyncHandler) {
        final CreateSolutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSolutionResult>() {
            @Override
            public CreateSolutionResult call() throws Exception {
                CreateSolutionResult result = null;

                try {
                    result = executeCreateSolution(finalRequest);
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
    public java.util.concurrent.Future<CreateSolutionVersionResult> createSolutionVersionAsync(CreateSolutionVersionRequest request) {

        return createSolutionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSolutionVersionResult> createSolutionVersionAsync(final CreateSolutionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSolutionVersionRequest, CreateSolutionVersionResult> asyncHandler) {
        final CreateSolutionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSolutionVersionResult>() {
            @Override
            public CreateSolutionVersionResult call() throws Exception {
                CreateSolutionVersionResult result = null;

                try {
                    result = executeCreateSolutionVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(final DeleteCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {
        final DeleteCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCampaignResult>() {
            @Override
            public DeleteCampaignResult call() throws Exception {
                DeleteCampaignResult result = null;

                try {
                    result = executeDeleteCampaign(finalRequest);
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
    public java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest request) {

        return deleteDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(final DeleteDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetGroupRequest, DeleteDatasetGroupResult> asyncHandler) {
        final DeleteDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetGroupResult>() {
            @Override
            public DeleteDatasetGroupResult call() throws Exception {
                DeleteDatasetGroupResult result = null;

                try {
                    result = executeDeleteDatasetGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventTrackerResult> deleteEventTrackerAsync(DeleteEventTrackerRequest request) {

        return deleteEventTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventTrackerResult> deleteEventTrackerAsync(final DeleteEventTrackerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventTrackerRequest, DeleteEventTrackerResult> asyncHandler) {
        final DeleteEventTrackerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventTrackerResult>() {
            @Override
            public DeleteEventTrackerResult call() throws Exception {
                DeleteEventTrackerResult result = null;

                try {
                    result = executeDeleteEventTracker(finalRequest);
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
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request) {

        return deleteSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(final DeleteSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler) {
        final DeleteSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaResult>() {
            @Override
            public DeleteSchemaResult call() throws Exception {
                DeleteSchemaResult result = null;

                try {
                    result = executeDeleteSchema(finalRequest);
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
    public java.util.concurrent.Future<DeleteSolutionResult> deleteSolutionAsync(DeleteSolutionRequest request) {

        return deleteSolutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSolutionResult> deleteSolutionAsync(final DeleteSolutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSolutionRequest, DeleteSolutionResult> asyncHandler) {
        final DeleteSolutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSolutionResult>() {
            @Override
            public DeleteSolutionResult call() throws Exception {
                DeleteSolutionResult result = null;

                try {
                    result = executeDeleteSolution(finalRequest);
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
    public java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest request) {

        return describeAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(final DescribeAlgorithmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlgorithmRequest, DescribeAlgorithmResult> asyncHandler) {
        final DescribeAlgorithmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlgorithmResult>() {
            @Override
            public DescribeAlgorithmResult call() throws Exception {
                DescribeAlgorithmResult result = null;

                try {
                    result = executeDescribeAlgorithm(finalRequest);
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
    public java.util.concurrent.Future<DescribeBatchInferenceJobResult> describeBatchInferenceJobAsync(DescribeBatchInferenceJobRequest request) {

        return describeBatchInferenceJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchInferenceJobResult> describeBatchInferenceJobAsync(final DescribeBatchInferenceJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBatchInferenceJobRequest, DescribeBatchInferenceJobResult> asyncHandler) {
        final DescribeBatchInferenceJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBatchInferenceJobResult>() {
            @Override
            public DescribeBatchInferenceJobResult call() throws Exception {
                DescribeBatchInferenceJobResult result = null;

                try {
                    result = executeDescribeBatchInferenceJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest request) {

        return describeCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(final DescribeCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCampaignRequest, DescribeCampaignResult> asyncHandler) {
        final DescribeCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCampaignResult>() {
            @Override
            public DescribeCampaignResult call() throws Exception {
                DescribeCampaignResult result = null;

                try {
                    result = executeDescribeCampaign(finalRequest);
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
    public java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest request) {

        return describeDatasetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(final DescribeDatasetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetGroupRequest, DescribeDatasetGroupResult> asyncHandler) {
        final DescribeDatasetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetGroupResult>() {
            @Override
            public DescribeDatasetGroupResult call() throws Exception {
                DescribeDatasetGroupResult result = null;

                try {
                    result = executeDescribeDatasetGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest request) {

        return describeDatasetImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(final DescribeDatasetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetImportJobRequest, DescribeDatasetImportJobResult> asyncHandler) {
        final DescribeDatasetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetImportJobResult>() {
            @Override
            public DescribeDatasetImportJobResult call() throws Exception {
                DescribeDatasetImportJobResult result = null;

                try {
                    result = executeDescribeDatasetImportJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventTrackerResult> describeEventTrackerAsync(DescribeEventTrackerRequest request) {

        return describeEventTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTrackerResult> describeEventTrackerAsync(final DescribeEventTrackerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventTrackerRequest, DescribeEventTrackerResult> asyncHandler) {
        final DescribeEventTrackerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventTrackerResult>() {
            @Override
            public DescribeEventTrackerResult call() throws Exception {
                DescribeEventTrackerResult result = null;

                try {
                    result = executeDescribeEventTracker(finalRequest);
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
    public java.util.concurrent.Future<DescribeFeatureTransformationResult> describeFeatureTransformationAsync(DescribeFeatureTransformationRequest request) {

        return describeFeatureTransformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFeatureTransformationResult> describeFeatureTransformationAsync(
            final DescribeFeatureTransformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFeatureTransformationRequest, DescribeFeatureTransformationResult> asyncHandler) {
        final DescribeFeatureTransformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFeatureTransformationResult>() {
            @Override
            public DescribeFeatureTransformationResult call() throws Exception {
                DescribeFeatureTransformationResult result = null;

                try {
                    result = executeDescribeFeatureTransformation(finalRequest);
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
    public java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest request) {

        return describeSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(final DescribeSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSchemaRequest, DescribeSchemaResult> asyncHandler) {
        final DescribeSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSchemaResult>() {
            @Override
            public DescribeSchemaResult call() throws Exception {
                DescribeSchemaResult result = null;

                try {
                    result = executeDescribeSchema(finalRequest);
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
    public java.util.concurrent.Future<DescribeSolutionResult> describeSolutionAsync(DescribeSolutionRequest request) {

        return describeSolutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSolutionResult> describeSolutionAsync(final DescribeSolutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSolutionRequest, DescribeSolutionResult> asyncHandler) {
        final DescribeSolutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSolutionResult>() {
            @Override
            public DescribeSolutionResult call() throws Exception {
                DescribeSolutionResult result = null;

                try {
                    result = executeDescribeSolution(finalRequest);
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
    public java.util.concurrent.Future<DescribeSolutionVersionResult> describeSolutionVersionAsync(DescribeSolutionVersionRequest request) {

        return describeSolutionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSolutionVersionResult> describeSolutionVersionAsync(final DescribeSolutionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSolutionVersionRequest, DescribeSolutionVersionResult> asyncHandler) {
        final DescribeSolutionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSolutionVersionResult>() {
            @Override
            public DescribeSolutionVersionResult call() throws Exception {
                DescribeSolutionVersionResult result = null;

                try {
                    result = executeDescribeSolutionVersion(finalRequest);
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
    public java.util.concurrent.Future<GetSolutionMetricsResult> getSolutionMetricsAsync(GetSolutionMetricsRequest request) {

        return getSolutionMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSolutionMetricsResult> getSolutionMetricsAsync(final GetSolutionMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSolutionMetricsRequest, GetSolutionMetricsResult> asyncHandler) {
        final GetSolutionMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSolutionMetricsResult>() {
            @Override
            public GetSolutionMetricsResult call() throws Exception {
                GetSolutionMetricsResult result = null;

                try {
                    result = executeGetSolutionMetrics(finalRequest);
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
    public java.util.concurrent.Future<ListBatchInferenceJobsResult> listBatchInferenceJobsAsync(ListBatchInferenceJobsRequest request) {

        return listBatchInferenceJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBatchInferenceJobsResult> listBatchInferenceJobsAsync(final ListBatchInferenceJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBatchInferenceJobsRequest, ListBatchInferenceJobsResult> asyncHandler) {
        final ListBatchInferenceJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBatchInferenceJobsResult>() {
            @Override
            public ListBatchInferenceJobsResult call() throws Exception {
                ListBatchInferenceJobsResult result = null;

                try {
                    result = executeListBatchInferenceJobs(finalRequest);
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
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request) {

        return listCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(final ListCampaignsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler) {
        final ListCampaignsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCampaignsResult>() {
            @Override
            public ListCampaignsResult call() throws Exception {
                ListCampaignsResult result = null;

                try {
                    result = executeListCampaigns(finalRequest);
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
    public java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest request) {

        return listDatasetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(final ListDatasetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetGroupsRequest, ListDatasetGroupsResult> asyncHandler) {
        final ListDatasetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetGroupsResult>() {
            @Override
            public ListDatasetGroupsResult call() throws Exception {
                ListDatasetGroupsResult result = null;

                try {
                    result = executeListDatasetGroups(finalRequest);
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
    public java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest request) {

        return listDatasetImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(final ListDatasetImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetImportJobsRequest, ListDatasetImportJobsResult> asyncHandler) {
        final ListDatasetImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetImportJobsResult>() {
            @Override
            public ListDatasetImportJobsResult call() throws Exception {
                ListDatasetImportJobsResult result = null;

                try {
                    result = executeListDatasetImportJobs(finalRequest);
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
    public java.util.concurrent.Future<ListEventTrackersResult> listEventTrackersAsync(ListEventTrackersRequest request) {

        return listEventTrackersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventTrackersResult> listEventTrackersAsync(final ListEventTrackersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventTrackersRequest, ListEventTrackersResult> asyncHandler) {
        final ListEventTrackersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventTrackersResult>() {
            @Override
            public ListEventTrackersResult call() throws Exception {
                ListEventTrackersResult result = null;

                try {
                    result = executeListEventTrackers(finalRequest);
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
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request) {

        return listSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(final ListSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler) {
        final ListSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemasResult>() {
            @Override
            public ListSchemasResult call() throws Exception {
                ListSchemasResult result = null;

                try {
                    result = executeListSchemas(finalRequest);
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
    public java.util.concurrent.Future<ListSolutionVersionsResult> listSolutionVersionsAsync(ListSolutionVersionsRequest request) {

        return listSolutionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolutionVersionsResult> listSolutionVersionsAsync(final ListSolutionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolutionVersionsRequest, ListSolutionVersionsResult> asyncHandler) {
        final ListSolutionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolutionVersionsResult>() {
            @Override
            public ListSolutionVersionsResult call() throws Exception {
                ListSolutionVersionsResult result = null;

                try {
                    result = executeListSolutionVersions(finalRequest);
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
    public java.util.concurrent.Future<ListSolutionsResult> listSolutionsAsync(ListSolutionsRequest request) {

        return listSolutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSolutionsResult> listSolutionsAsync(final ListSolutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSolutionsRequest, ListSolutionsResult> asyncHandler) {
        final ListSolutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSolutionsResult>() {
            @Override
            public ListSolutionsResult call() throws Exception {
                ListSolutionsResult result = null;

                try {
                    result = executeListSolutions(finalRequest);
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
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest request) {

        return updateCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(final UpdateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler) {
        final UpdateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignResult>() {
            @Override
            public UpdateCampaignResult call() throws Exception {
                UpdateCampaignResult result = null;

                try {
                    result = executeUpdateCampaign(finalRequest);
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
