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
package com.amazonaws.services.sagemaker;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerAsyncClient extends AmazonSageMakerClient implements AmazonSageMakerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSageMakerAsyncClientBuilder asyncBuilder() {
        return AmazonSageMakerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SageMaker using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
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
    public java.util.concurrent.Future<AssociateTrialComponentResult> associateTrialComponentAsync(AssociateTrialComponentRequest request) {

        return associateTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTrialComponentResult> associateTrialComponentAsync(final AssociateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTrialComponentRequest, AssociateTrialComponentResult> asyncHandler) {
        final AssociateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTrialComponentResult>() {
            @Override
            public AssociateTrialComponentResult call() throws Exception {
                AssociateTrialComponentResult result = null;

                try {
                    result = executeAssociateTrialComponent(finalRequest);
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
    public java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(CreateAlgorithmRequest request) {

        return createAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(final CreateAlgorithmRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAlgorithmRequest, CreateAlgorithmResult> asyncHandler) {
        final CreateAlgorithmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAlgorithmResult>() {
            @Override
            public CreateAlgorithmResult call() throws Exception {
                CreateAlgorithmResult result = null;

                try {
                    result = executeCreateAlgorithm(finalRequest);
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
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {
        final CreateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppResult>() {
            @Override
            public CreateAppResult call() throws Exception {
                CreateAppResult result = null;

                try {
                    result = executeCreateApp(finalRequest);
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
    public java.util.concurrent.Future<CreateAutoMLJobResult> createAutoMLJobAsync(CreateAutoMLJobRequest request) {

        return createAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAutoMLJobResult> createAutoMLJobAsync(final CreateAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAutoMLJobRequest, CreateAutoMLJobResult> asyncHandler) {
        final CreateAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAutoMLJobResult>() {
            @Override
            public CreateAutoMLJobResult call() throws Exception {
                CreateAutoMLJobResult result = null;

                try {
                    result = executeCreateAutoMLJob(finalRequest);
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
    public java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(CreateCodeRepositoryRequest request) {

        return createCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(final CreateCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCodeRepositoryRequest, CreateCodeRepositoryResult> asyncHandler) {
        final CreateCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCodeRepositoryResult>() {
            @Override
            public CreateCodeRepositoryResult call() throws Exception {
                CreateCodeRepositoryResult result = null;

                try {
                    result = executeCreateCodeRepository(finalRequest);
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
    public java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(CreateCompilationJobRequest request) {

        return createCompilationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(final CreateCompilationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCompilationJobRequest, CreateCompilationJobResult> asyncHandler) {
        final CreateCompilationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCompilationJobResult>() {
            @Override
            public CreateCompilationJobResult call() throws Exception {
                CreateCompilationJobResult result = null;

                try {
                    result = executeCreateCompilationJob(finalRequest);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
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
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(final CreateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {
        final CreateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointResult>() {
            @Override
            public CreateEndpointResult call() throws Exception {
                CreateEndpointResult result = null;

                try {
                    result = executeCreateEndpoint(finalRequest);
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
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest request) {

        return createEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(final CreateEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointConfigRequest, CreateEndpointConfigResult> asyncHandler) {
        final CreateEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointConfigResult>() {
            @Override
            public CreateEndpointConfigResult call() throws Exception {
                CreateEndpointConfigResult result = null;

                try {
                    result = executeCreateEndpointConfig(finalRequest);
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
    public java.util.concurrent.Future<CreateFlowDefinitionResult> createFlowDefinitionAsync(CreateFlowDefinitionRequest request) {

        return createFlowDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowDefinitionResult> createFlowDefinitionAsync(final CreateFlowDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowDefinitionRequest, CreateFlowDefinitionResult> asyncHandler) {
        final CreateFlowDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowDefinitionResult>() {
            @Override
            public CreateFlowDefinitionResult call() throws Exception {
                CreateFlowDefinitionResult result = null;

                try {
                    result = executeCreateFlowDefinition(finalRequest);
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
    public java.util.concurrent.Future<CreateHumanTaskUiResult> createHumanTaskUiAsync(CreateHumanTaskUiRequest request) {

        return createHumanTaskUiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHumanTaskUiResult> createHumanTaskUiAsync(final CreateHumanTaskUiRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHumanTaskUiRequest, CreateHumanTaskUiResult> asyncHandler) {
        final CreateHumanTaskUiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHumanTaskUiResult>() {
            @Override
            public CreateHumanTaskUiResult call() throws Exception {
                CreateHumanTaskUiResult result = null;

                try {
                    result = executeCreateHumanTaskUi(finalRequest);
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
    public java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(CreateHyperParameterTuningJobRequest request) {

        return createHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(
            final CreateHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHyperParameterTuningJobRequest, CreateHyperParameterTuningJobResult> asyncHandler) {
        final CreateHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHyperParameterTuningJobResult>() {
            @Override
            public CreateHyperParameterTuningJobResult call() throws Exception {
                CreateHyperParameterTuningJobResult result = null;

                try {
                    result = executeCreateHyperParameterTuningJob(finalRequest);
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
    public java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(CreateLabelingJobRequest request) {

        return createLabelingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(final CreateLabelingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLabelingJobRequest, CreateLabelingJobResult> asyncHandler) {
        final CreateLabelingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLabelingJobResult>() {
            @Override
            public CreateLabelingJobResult call() throws Exception {
                CreateLabelingJobResult result = null;

                try {
                    result = executeCreateLabelingJob(finalRequest);
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
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {
        final CreateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelResult>() {
            @Override
            public CreateModelResult call() throws Exception {
                CreateModelResult result = null;

                try {
                    result = executeCreateModel(finalRequest);
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
    public java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(CreateModelPackageRequest request) {

        return createModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(final CreateModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelPackageRequest, CreateModelPackageResult> asyncHandler) {
        final CreateModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelPackageResult>() {
            @Override
            public CreateModelPackageResult call() throws Exception {
                CreateModelPackageResult result = null;

                try {
                    result = executeCreateModelPackage(finalRequest);
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
    public java.util.concurrent.Future<CreateMonitoringScheduleResult> createMonitoringScheduleAsync(CreateMonitoringScheduleRequest request) {

        return createMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoringScheduleResult> createMonitoringScheduleAsync(final CreateMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMonitoringScheduleRequest, CreateMonitoringScheduleResult> asyncHandler) {
        final CreateMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMonitoringScheduleResult>() {
            @Override
            public CreateMonitoringScheduleResult call() throws Exception {
                CreateMonitoringScheduleResult result = null;

                try {
                    result = executeCreateMonitoringSchedule(finalRequest);
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
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest request) {

        return createNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(final CreateNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceRequest, CreateNotebookInstanceResult> asyncHandler) {
        final CreateNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotebookInstanceResult>() {
            @Override
            public CreateNotebookInstanceResult call() throws Exception {
                CreateNotebookInstanceResult result = null;

                try {
                    result = executeCreateNotebookInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            CreateNotebookInstanceLifecycleConfigRequest request) {

        return createNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            final CreateNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceLifecycleConfigRequest, CreateNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final CreateNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotebookInstanceLifecycleConfigResult>() {
            @Override
            public CreateNotebookInstanceLifecycleConfigResult call() throws Exception {
                CreateNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeCreateNotebookInstanceLifecycleConfig(finalRequest);
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
    public java.util.concurrent.Future<CreatePresignedDomainUrlResult> createPresignedDomainUrlAsync(CreatePresignedDomainUrlRequest request) {

        return createPresignedDomainUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedDomainUrlResult> createPresignedDomainUrlAsync(final CreatePresignedDomainUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresignedDomainUrlRequest, CreatePresignedDomainUrlResult> asyncHandler) {
        final CreatePresignedDomainUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresignedDomainUrlResult>() {
            @Override
            public CreatePresignedDomainUrlResult call() throws Exception {
                CreatePresignedDomainUrlResult result = null;

                try {
                    result = executeCreatePresignedDomainUrl(finalRequest);
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
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest request) {

        return createPresignedNotebookInstanceUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            final CreatePresignedNotebookInstanceUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookInstanceUrlRequest, CreatePresignedNotebookInstanceUrlResult> asyncHandler) {
        final CreatePresignedNotebookInstanceUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresignedNotebookInstanceUrlResult>() {
            @Override
            public CreatePresignedNotebookInstanceUrlResult call() throws Exception {
                CreatePresignedNotebookInstanceUrlResult result = null;

                try {
                    result = executeCreatePresignedNotebookInstanceUrl(finalRequest);
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
    public java.util.concurrent.Future<CreateProcessingJobResult> createProcessingJobAsync(CreateProcessingJobRequest request) {

        return createProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProcessingJobResult> createProcessingJobAsync(final CreateProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProcessingJobRequest, CreateProcessingJobResult> asyncHandler) {
        final CreateProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProcessingJobResult>() {
            @Override
            public CreateProcessingJobResult call() throws Exception {
                CreateProcessingJobResult result = null;

                try {
                    result = executeCreateProcessingJob(finalRequest);
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
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest request) {

        return createTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(final CreateTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrainingJobRequest, CreateTrainingJobResult> asyncHandler) {
        final CreateTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrainingJobResult>() {
            @Override
            public CreateTrainingJobResult call() throws Exception {
                CreateTrainingJobResult result = null;

                try {
                    result = executeCreateTrainingJob(finalRequest);
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
    public java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(CreateTransformJobRequest request) {

        return createTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(final CreateTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransformJobRequest, CreateTransformJobResult> asyncHandler) {
        final CreateTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransformJobResult>() {
            @Override
            public CreateTransformJobResult call() throws Exception {
                CreateTransformJobResult result = null;

                try {
                    result = executeCreateTransformJob(finalRequest);
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
    public java.util.concurrent.Future<CreateTrialResult> createTrialAsync(CreateTrialRequest request) {

        return createTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrialResult> createTrialAsync(final CreateTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrialRequest, CreateTrialResult> asyncHandler) {
        final CreateTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrialResult>() {
            @Override
            public CreateTrialResult call() throws Exception {
                CreateTrialResult result = null;

                try {
                    result = executeCreateTrial(finalRequest);
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
    public java.util.concurrent.Future<CreateTrialComponentResult> createTrialComponentAsync(CreateTrialComponentRequest request) {

        return createTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrialComponentResult> createTrialComponentAsync(final CreateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrialComponentRequest, CreateTrialComponentResult> asyncHandler) {
        final CreateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrialComponentResult>() {
            @Override
            public CreateTrialComponentResult call() throws Exception {
                CreateTrialComponentResult result = null;

                try {
                    result = executeCreateTrialComponent(finalRequest);
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
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {
        final CreateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserProfileResult>() {
            @Override
            public CreateUserProfileResult call() throws Exception {
                CreateUserProfileResult result = null;

                try {
                    result = executeCreateUserProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(CreateWorkteamRequest request) {

        return createWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(final CreateWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkteamRequest, CreateWorkteamResult> asyncHandler) {
        final CreateWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkteamResult>() {
            @Override
            public CreateWorkteamResult call() throws Exception {
                CreateWorkteamResult result = null;

                try {
                    result = executeCreateWorkteam(finalRequest);
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
    public java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(DeleteAlgorithmRequest request) {

        return deleteAlgorithmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(final DeleteAlgorithmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAlgorithmRequest, DeleteAlgorithmResult> asyncHandler) {
        final DeleteAlgorithmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAlgorithmResult>() {
            @Override
            public DeleteAlgorithmResult call() throws Exception {
                DeleteAlgorithmResult result = null;

                try {
                    result = executeDeleteAlgorithm(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
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
    public java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(DeleteCodeRepositoryRequest request) {

        return deleteCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(final DeleteCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCodeRepositoryRequest, DeleteCodeRepositoryResult> asyncHandler) {
        final DeleteCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCodeRepositoryResult>() {
            @Override
            public DeleteCodeRepositoryResult call() throws Exception {
                DeleteCodeRepositoryResult result = null;

                try {
                    result = executeDeleteCodeRepository(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {
        final DeleteEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result = null;

                try {
                    result = executeDeleteEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest request) {

        return deleteEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(final DeleteEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointConfigRequest, DeleteEndpointConfigResult> asyncHandler) {
        final DeleteEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointConfigResult>() {
            @Override
            public DeleteEndpointConfigResult call() throws Exception {
                DeleteEndpointConfigResult result = null;

                try {
                    result = executeDeleteEndpointConfig(finalRequest);
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
    public java.util.concurrent.Future<DeleteFlowDefinitionResult> deleteFlowDefinitionAsync(DeleteFlowDefinitionRequest request) {

        return deleteFlowDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowDefinitionResult> deleteFlowDefinitionAsync(final DeleteFlowDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowDefinitionRequest, DeleteFlowDefinitionResult> asyncHandler) {
        final DeleteFlowDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowDefinitionResult>() {
            @Override
            public DeleteFlowDefinitionResult call() throws Exception {
                DeleteFlowDefinitionResult result = null;

                try {
                    result = executeDeleteFlowDefinition(finalRequest);
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
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(final DeleteModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {
        final DeleteModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelResult>() {
            @Override
            public DeleteModelResult call() throws Exception {
                DeleteModelResult result = null;

                try {
                    result = executeDeleteModel(finalRequest);
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
    public java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(DeleteModelPackageRequest request) {

        return deleteModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(final DeleteModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelPackageRequest, DeleteModelPackageResult> asyncHandler) {
        final DeleteModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelPackageResult>() {
            @Override
            public DeleteModelPackageResult call() throws Exception {
                DeleteModelPackageResult result = null;

                try {
                    result = executeDeleteModelPackage(finalRequest);
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
    public java.util.concurrent.Future<DeleteMonitoringScheduleResult> deleteMonitoringScheduleAsync(DeleteMonitoringScheduleRequest request) {

        return deleteMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoringScheduleResult> deleteMonitoringScheduleAsync(final DeleteMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMonitoringScheduleRequest, DeleteMonitoringScheduleResult> asyncHandler) {
        final DeleteMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMonitoringScheduleResult>() {
            @Override
            public DeleteMonitoringScheduleResult call() throws Exception {
                DeleteMonitoringScheduleResult result = null;

                try {
                    result = executeDeleteMonitoringSchedule(finalRequest);
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
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest request) {

        return deleteNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(final DeleteNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceRequest, DeleteNotebookInstanceResult> asyncHandler) {
        final DeleteNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotebookInstanceResult>() {
            @Override
            public DeleteNotebookInstanceResult call() throws Exception {
                DeleteNotebookInstanceResult result = null;

                try {
                    result = executeDeleteNotebookInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            DeleteNotebookInstanceLifecycleConfigRequest request) {

        return deleteNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            final DeleteNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceLifecycleConfigRequest, DeleteNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final DeleteNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotebookInstanceLifecycleConfigResult>() {
            @Override
            public DeleteNotebookInstanceLifecycleConfigResult call() throws Exception {
                DeleteNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeDeleteNotebookInstanceLifecycleConfig(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrialResult> deleteTrialAsync(DeleteTrialRequest request) {

        return deleteTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrialResult> deleteTrialAsync(final DeleteTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrialRequest, DeleteTrialResult> asyncHandler) {
        final DeleteTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrialResult>() {
            @Override
            public DeleteTrialResult call() throws Exception {
                DeleteTrialResult result = null;

                try {
                    result = executeDeleteTrial(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrialComponentResult> deleteTrialComponentAsync(DeleteTrialComponentRequest request) {

        return deleteTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrialComponentResult> deleteTrialComponentAsync(final DeleteTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrialComponentRequest, DeleteTrialComponentResult> asyncHandler) {
        final DeleteTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrialComponentResult>() {
            @Override
            public DeleteTrialComponentResult call() throws Exception {
                DeleteTrialComponentResult result = null;

                try {
                    result = executeDeleteTrialComponent(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest request) {

        return deleteUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(final DeleteUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler) {
        final DeleteUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserProfileResult>() {
            @Override
            public DeleteUserProfileResult call() throws Exception {
                DeleteUserProfileResult result = null;

                try {
                    result = executeDeleteUserProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(DeleteWorkteamRequest request) {

        return deleteWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(final DeleteWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkteamRequest, DeleteWorkteamResult> asyncHandler) {
        final DeleteWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkteamResult>() {
            @Override
            public DeleteWorkteamResult call() throws Exception {
                DeleteWorkteamResult result = null;

                try {
                    result = executeDeleteWorkteam(finalRequest);
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
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest request) {

        return describeAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppResult> describeAppAsync(final DescribeAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler) {
        final DescribeAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppResult>() {
            @Override
            public DescribeAppResult call() throws Exception {
                DescribeAppResult result = null;

                try {
                    result = executeDescribeApp(finalRequest);
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
    public java.util.concurrent.Future<DescribeAutoMLJobResult> describeAutoMLJobAsync(DescribeAutoMLJobRequest request) {

        return describeAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoMLJobResult> describeAutoMLJobAsync(final DescribeAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutoMLJobRequest, DescribeAutoMLJobResult> asyncHandler) {
        final DescribeAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAutoMLJobResult>() {
            @Override
            public DescribeAutoMLJobResult call() throws Exception {
                DescribeAutoMLJobResult result = null;

                try {
                    result = executeDescribeAutoMLJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(DescribeCodeRepositoryRequest request) {

        return describeCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(final DescribeCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCodeRepositoryRequest, DescribeCodeRepositoryResult> asyncHandler) {
        final DescribeCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCodeRepositoryResult>() {
            @Override
            public DescribeCodeRepositoryResult call() throws Exception {
                DescribeCodeRepositoryResult result = null;

                try {
                    result = executeDescribeCodeRepository(finalRequest);
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
    public java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(DescribeCompilationJobRequest request) {

        return describeCompilationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(final DescribeCompilationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCompilationJobRequest, DescribeCompilationJobResult> asyncHandler) {
        final DescribeCompilationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCompilationJobResult>() {
            @Override
            public DescribeCompilationJobResult call() throws Exception {
                DescribeCompilationJobResult result = null;

                try {
                    result = executeDescribeCompilationJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {
        final DescribeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainResult>() {
            @Override
            public DescribeDomainResult call() throws Exception {
                DescribeDomainResult result = null;

                try {
                    result = executeDescribeDomain(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(final DescribeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {
        final DescribeEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointResult>() {
            @Override
            public DescribeEndpointResult call() throws Exception {
                DescribeEndpointResult result = null;

                try {
                    result = executeDescribeEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest request) {

        return describeEndpointConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(final DescribeEndpointConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointConfigRequest, DescribeEndpointConfigResult> asyncHandler) {
        final DescribeEndpointConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointConfigResult>() {
            @Override
            public DescribeEndpointConfigResult call() throws Exception {
                DescribeEndpointConfigResult result = null;

                try {
                    result = executeDescribeEndpointConfig(finalRequest);
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
    public java.util.concurrent.Future<DescribeExperimentResult> describeExperimentAsync(DescribeExperimentRequest request) {

        return describeExperimentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExperimentResult> describeExperimentAsync(final DescribeExperimentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExperimentRequest, DescribeExperimentResult> asyncHandler) {
        final DescribeExperimentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExperimentResult>() {
            @Override
            public DescribeExperimentResult call() throws Exception {
                DescribeExperimentResult result = null;

                try {
                    result = executeDescribeExperiment(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowDefinitionResult> describeFlowDefinitionAsync(DescribeFlowDefinitionRequest request) {

        return describeFlowDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowDefinitionResult> describeFlowDefinitionAsync(final DescribeFlowDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowDefinitionRequest, DescribeFlowDefinitionResult> asyncHandler) {
        final DescribeFlowDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowDefinitionResult>() {
            @Override
            public DescribeFlowDefinitionResult call() throws Exception {
                DescribeFlowDefinitionResult result = null;

                try {
                    result = executeDescribeFlowDefinition(finalRequest);
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
    public java.util.concurrent.Future<DescribeHumanTaskUiResult> describeHumanTaskUiAsync(DescribeHumanTaskUiRequest request) {

        return describeHumanTaskUiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanTaskUiResult> describeHumanTaskUiAsync(final DescribeHumanTaskUiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHumanTaskUiRequest, DescribeHumanTaskUiResult> asyncHandler) {
        final DescribeHumanTaskUiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHumanTaskUiResult>() {
            @Override
            public DescribeHumanTaskUiResult call() throws Exception {
                DescribeHumanTaskUiResult result = null;

                try {
                    result = executeDescribeHumanTaskUi(finalRequest);
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
    public java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            DescribeHyperParameterTuningJobRequest request) {

        return describeHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            final DescribeHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHyperParameterTuningJobRequest, DescribeHyperParameterTuningJobResult> asyncHandler) {
        final DescribeHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHyperParameterTuningJobResult>() {
            @Override
            public DescribeHyperParameterTuningJobResult call() throws Exception {
                DescribeHyperParameterTuningJobResult result = null;

                try {
                    result = executeDescribeHyperParameterTuningJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(DescribeLabelingJobRequest request) {

        return describeLabelingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(final DescribeLabelingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLabelingJobRequest, DescribeLabelingJobResult> asyncHandler) {
        final DescribeLabelingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLabelingJobResult>() {
            @Override
            public DescribeLabelingJobResult call() throws Exception {
                DescribeLabelingJobResult result = null;

                try {
                    result = executeDescribeLabelingJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest request) {

        return describeModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelResult> describeModelAsync(final DescribeModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler) {
        final DescribeModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelResult>() {
            @Override
            public DescribeModelResult call() throws Exception {
                DescribeModelResult result = null;

                try {
                    result = executeDescribeModel(finalRequest);
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
    public java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(DescribeModelPackageRequest request) {

        return describeModelPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(final DescribeModelPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeModelPackageRequest, DescribeModelPackageResult> asyncHandler) {
        final DescribeModelPackageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeModelPackageResult>() {
            @Override
            public DescribeModelPackageResult call() throws Exception {
                DescribeModelPackageResult result = null;

                try {
                    result = executeDescribeModelPackage(finalRequest);
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
    public java.util.concurrent.Future<DescribeMonitoringScheduleResult> describeMonitoringScheduleAsync(DescribeMonitoringScheduleRequest request) {

        return describeMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMonitoringScheduleResult> describeMonitoringScheduleAsync(final DescribeMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMonitoringScheduleRequest, DescribeMonitoringScheduleResult> asyncHandler) {
        final DescribeMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMonitoringScheduleResult>() {
            @Override
            public DescribeMonitoringScheduleResult call() throws Exception {
                DescribeMonitoringScheduleResult result = null;

                try {
                    result = executeDescribeMonitoringSchedule(finalRequest);
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
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest request) {

        return describeNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(final DescribeNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult> asyncHandler) {
        final DescribeNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotebookInstanceResult>() {
            @Override
            public DescribeNotebookInstanceResult call() throws Exception {
                DescribeNotebookInstanceResult result = null;

                try {
                    result = executeDescribeNotebookInstance(finalRequest);
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
    public java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            DescribeNotebookInstanceLifecycleConfigRequest request) {

        return describeNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            final DescribeNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceLifecycleConfigRequest, DescribeNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final DescribeNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotebookInstanceLifecycleConfigResult>() {
            @Override
            public DescribeNotebookInstanceLifecycleConfigResult call() throws Exception {
                DescribeNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeDescribeNotebookInstanceLifecycleConfig(finalRequest);
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
    public java.util.concurrent.Future<DescribeProcessingJobResult> describeProcessingJobAsync(DescribeProcessingJobRequest request) {

        return describeProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProcessingJobResult> describeProcessingJobAsync(final DescribeProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProcessingJobRequest, DescribeProcessingJobResult> asyncHandler) {
        final DescribeProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProcessingJobResult>() {
            @Override
            public DescribeProcessingJobResult call() throws Exception {
                DescribeProcessingJobResult result = null;

                try {
                    result = executeDescribeProcessingJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(DescribeSubscribedWorkteamRequest request) {

        return describeSubscribedWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(final DescribeSubscribedWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubscribedWorkteamRequest, DescribeSubscribedWorkteamResult> asyncHandler) {
        final DescribeSubscribedWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubscribedWorkteamResult>() {
            @Override
            public DescribeSubscribedWorkteamResult call() throws Exception {
                DescribeSubscribedWorkteamResult result = null;

                try {
                    result = executeDescribeSubscribedWorkteam(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest request) {

        return describeTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(final DescribeTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrainingJobRequest, DescribeTrainingJobResult> asyncHandler) {
        final DescribeTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrainingJobResult>() {
            @Override
            public DescribeTrainingJobResult call() throws Exception {
                DescribeTrainingJobResult result = null;

                try {
                    result = executeDescribeTrainingJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(DescribeTransformJobRequest request) {

        return describeTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(final DescribeTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTransformJobRequest, DescribeTransformJobResult> asyncHandler) {
        final DescribeTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTransformJobResult>() {
            @Override
            public DescribeTransformJobResult call() throws Exception {
                DescribeTransformJobResult result = null;

                try {
                    result = executeDescribeTransformJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrialResult> describeTrialAsync(DescribeTrialRequest request) {

        return describeTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrialResult> describeTrialAsync(final DescribeTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrialRequest, DescribeTrialResult> asyncHandler) {
        final DescribeTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrialResult>() {
            @Override
            public DescribeTrialResult call() throws Exception {
                DescribeTrialResult result = null;

                try {
                    result = executeDescribeTrial(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrialComponentResult> describeTrialComponentAsync(DescribeTrialComponentRequest request) {

        return describeTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrialComponentResult> describeTrialComponentAsync(final DescribeTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrialComponentRequest, DescribeTrialComponentResult> asyncHandler) {
        final DescribeTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrialComponentResult>() {
            @Override
            public DescribeTrialComponentResult call() throws Exception {
                DescribeTrialComponentResult result = null;

                try {
                    result = executeDescribeTrialComponent(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest request) {

        return describeUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(final DescribeUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserProfileRequest, DescribeUserProfileResult> asyncHandler) {
        final DescribeUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserProfileResult>() {
            @Override
            public DescribeUserProfileResult call() throws Exception {
                DescribeUserProfileResult result = null;

                try {
                    result = executeDescribeUserProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkforceResult> describeWorkforceAsync(DescribeWorkforceRequest request) {

        return describeWorkforceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkforceResult> describeWorkforceAsync(final DescribeWorkforceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkforceRequest, DescribeWorkforceResult> asyncHandler) {
        final DescribeWorkforceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkforceResult>() {
            @Override
            public DescribeWorkforceResult call() throws Exception {
                DescribeWorkforceResult result = null;

                try {
                    result = executeDescribeWorkforce(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(DescribeWorkteamRequest request) {

        return describeWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(final DescribeWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkteamRequest, DescribeWorkteamResult> asyncHandler) {
        final DescribeWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkteamResult>() {
            @Override
            public DescribeWorkteamResult call() throws Exception {
                DescribeWorkteamResult result = null;

                try {
                    result = executeDescribeWorkteam(finalRequest);
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
    public java.util.concurrent.Future<DisassociateTrialComponentResult> disassociateTrialComponentAsync(DisassociateTrialComponentRequest request) {

        return disassociateTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrialComponentResult> disassociateTrialComponentAsync(final DisassociateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTrialComponentRequest, DisassociateTrialComponentResult> asyncHandler) {
        final DisassociateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTrialComponentResult>() {
            @Override
            public DisassociateTrialComponentResult call() throws Exception {
                DisassociateTrialComponentResult result = null;

                try {
                    result = executeDisassociateTrialComponent(finalRequest);
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
    public java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(GetSearchSuggestionsRequest request) {

        return getSearchSuggestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(final GetSearchSuggestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSearchSuggestionsRequest, GetSearchSuggestionsResult> asyncHandler) {
        final GetSearchSuggestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSearchSuggestionsResult>() {
            @Override
            public GetSearchSuggestionsResult call() throws Exception {
                GetSearchSuggestionsResult result = null;

                try {
                    result = executeGetSearchSuggestions(finalRequest);
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
    public java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(ListAlgorithmsRequest request) {

        return listAlgorithmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(final ListAlgorithmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAlgorithmsRequest, ListAlgorithmsResult> asyncHandler) {
        final ListAlgorithmsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAlgorithmsResult>() {
            @Override
            public ListAlgorithmsResult call() throws Exception {
                ListAlgorithmsResult result = null;

                try {
                    result = executeListAlgorithms(finalRequest);
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
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(final ListAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {
        final ListAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppsResult>() {
            @Override
            public ListAppsResult call() throws Exception {
                ListAppsResult result = null;

                try {
                    result = executeListApps(finalRequest);
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
    public java.util.concurrent.Future<ListAutoMLJobsResult> listAutoMLJobsAsync(ListAutoMLJobsRequest request) {

        return listAutoMLJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAutoMLJobsResult> listAutoMLJobsAsync(final ListAutoMLJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAutoMLJobsRequest, ListAutoMLJobsResult> asyncHandler) {
        final ListAutoMLJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAutoMLJobsResult>() {
            @Override
            public ListAutoMLJobsResult call() throws Exception {
                ListAutoMLJobsResult result = null;

                try {
                    result = executeListAutoMLJobs(finalRequest);
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
    public java.util.concurrent.Future<ListCandidatesForAutoMLJobResult> listCandidatesForAutoMLJobAsync(ListCandidatesForAutoMLJobRequest request) {

        return listCandidatesForAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCandidatesForAutoMLJobResult> listCandidatesForAutoMLJobAsync(final ListCandidatesForAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCandidatesForAutoMLJobRequest, ListCandidatesForAutoMLJobResult> asyncHandler) {
        final ListCandidatesForAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCandidatesForAutoMLJobResult>() {
            @Override
            public ListCandidatesForAutoMLJobResult call() throws Exception {
                ListCandidatesForAutoMLJobResult result = null;

                try {
                    result = executeListCandidatesForAutoMLJob(finalRequest);
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
    public java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(ListCodeRepositoriesRequest request) {

        return listCodeRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(final ListCodeRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCodeRepositoriesRequest, ListCodeRepositoriesResult> asyncHandler) {
        final ListCodeRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCodeRepositoriesResult>() {
            @Override
            public ListCodeRepositoriesResult call() throws Exception {
                ListCodeRepositoriesResult result = null;

                try {
                    result = executeListCodeRepositories(finalRequest);
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
    public java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(ListCompilationJobsRequest request) {

        return listCompilationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(final ListCompilationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCompilationJobsRequest, ListCompilationJobsResult> asyncHandler) {
        final ListCompilationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCompilationJobsResult>() {
            @Override
            public ListCompilationJobsResult call() throws Exception {
                ListCompilationJobsResult result = null;

                try {
                    result = executeListCompilationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
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
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest request) {

        return listEndpointConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(final ListEndpointConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointConfigsRequest, ListEndpointConfigsResult> asyncHandler) {
        final ListEndpointConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointConfigsResult>() {
            @Override
            public ListEndpointConfigsResult call() throws Exception {
                ListEndpointConfigsResult result = null;

                try {
                    result = executeListEndpointConfigs(finalRequest);
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
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest request) {

        return listEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(final ListEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler) {
        final ListEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointsResult>() {
            @Override
            public ListEndpointsResult call() throws Exception {
                ListEndpointsResult result = null;

                try {
                    result = executeListEndpoints(finalRequest);
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
    public java.util.concurrent.Future<ListFlowDefinitionsResult> listFlowDefinitionsAsync(ListFlowDefinitionsRequest request) {

        return listFlowDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowDefinitionsResult> listFlowDefinitionsAsync(final ListFlowDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowDefinitionsRequest, ListFlowDefinitionsResult> asyncHandler) {
        final ListFlowDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowDefinitionsResult>() {
            @Override
            public ListFlowDefinitionsResult call() throws Exception {
                ListFlowDefinitionsResult result = null;

                try {
                    result = executeListFlowDefinitions(finalRequest);
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
    public java.util.concurrent.Future<ListHumanTaskUisResult> listHumanTaskUisAsync(ListHumanTaskUisRequest request) {

        return listHumanTaskUisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHumanTaskUisResult> listHumanTaskUisAsync(final ListHumanTaskUisRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHumanTaskUisRequest, ListHumanTaskUisResult> asyncHandler) {
        final ListHumanTaskUisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHumanTaskUisResult>() {
            @Override
            public ListHumanTaskUisResult call() throws Exception {
                ListHumanTaskUisResult result = null;

                try {
                    result = executeListHumanTaskUis(finalRequest);
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
    public java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(ListHyperParameterTuningJobsRequest request) {

        return listHyperParameterTuningJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(final ListHyperParameterTuningJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHyperParameterTuningJobsRequest, ListHyperParameterTuningJobsResult> asyncHandler) {
        final ListHyperParameterTuningJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHyperParameterTuningJobsResult>() {
            @Override
            public ListHyperParameterTuningJobsResult call() throws Exception {
                ListHyperParameterTuningJobsResult result = null;

                try {
                    result = executeListHyperParameterTuningJobs(finalRequest);
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
    public java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(ListLabelingJobsRequest request) {

        return listLabelingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(final ListLabelingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLabelingJobsRequest, ListLabelingJobsResult> asyncHandler) {
        final ListLabelingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLabelingJobsResult>() {
            @Override
            public ListLabelingJobsResult call() throws Exception {
                ListLabelingJobsResult result = null;

                try {
                    result = executeListLabelingJobs(finalRequest);
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
    public java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(ListLabelingJobsForWorkteamRequest request) {

        return listLabelingJobsForWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(final ListLabelingJobsForWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLabelingJobsForWorkteamRequest, ListLabelingJobsForWorkteamResult> asyncHandler) {
        final ListLabelingJobsForWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLabelingJobsForWorkteamResult>() {
            @Override
            public ListLabelingJobsForWorkteamResult call() throws Exception {
                ListLabelingJobsForWorkteamResult result = null;

                try {
                    result = executeListLabelingJobsForWorkteam(finalRequest);
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
    public java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(ListModelPackagesRequest request) {

        return listModelPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(final ListModelPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelPackagesRequest, ListModelPackagesResult> asyncHandler) {
        final ListModelPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelPackagesResult>() {
            @Override
            public ListModelPackagesResult call() throws Exception {
                ListModelPackagesResult result = null;

                try {
                    result = executeListModelPackages(finalRequest);
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
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest request) {

        return listModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelsResult> listModelsAsync(final ListModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler) {
        final ListModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelsResult>() {
            @Override
            public ListModelsResult call() throws Exception {
                ListModelsResult result = null;

                try {
                    result = executeListModels(finalRequest);
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
    public java.util.concurrent.Future<ListMonitoringExecutionsResult> listMonitoringExecutionsAsync(ListMonitoringExecutionsRequest request) {

        return listMonitoringExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringExecutionsResult> listMonitoringExecutionsAsync(final ListMonitoringExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitoringExecutionsRequest, ListMonitoringExecutionsResult> asyncHandler) {
        final ListMonitoringExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitoringExecutionsResult>() {
            @Override
            public ListMonitoringExecutionsResult call() throws Exception {
                ListMonitoringExecutionsResult result = null;

                try {
                    result = executeListMonitoringExecutions(finalRequest);
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
    public java.util.concurrent.Future<ListMonitoringSchedulesResult> listMonitoringSchedulesAsync(ListMonitoringSchedulesRequest request) {

        return listMonitoringSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoringSchedulesResult> listMonitoringSchedulesAsync(final ListMonitoringSchedulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitoringSchedulesRequest, ListMonitoringSchedulesResult> asyncHandler) {
        final ListMonitoringSchedulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitoringSchedulesResult>() {
            @Override
            public ListMonitoringSchedulesResult call() throws Exception {
                ListMonitoringSchedulesResult result = null;

                try {
                    result = executeListMonitoringSchedules(finalRequest);
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
    public java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            ListNotebookInstanceLifecycleConfigsRequest request) {

        return listNotebookInstanceLifecycleConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            final ListNotebookInstanceLifecycleConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotebookInstanceLifecycleConfigsRequest, ListNotebookInstanceLifecycleConfigsResult> asyncHandler) {
        final ListNotebookInstanceLifecycleConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotebookInstanceLifecycleConfigsResult>() {
            @Override
            public ListNotebookInstanceLifecycleConfigsResult call() throws Exception {
                ListNotebookInstanceLifecycleConfigsResult result = null;

                try {
                    result = executeListNotebookInstanceLifecycleConfigs(finalRequest);
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
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest request) {

        return listNotebookInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(final ListNotebookInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotebookInstancesRequest, ListNotebookInstancesResult> asyncHandler) {
        final ListNotebookInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotebookInstancesResult>() {
            @Override
            public ListNotebookInstancesResult call() throws Exception {
                ListNotebookInstancesResult result = null;

                try {
                    result = executeListNotebookInstances(finalRequest);
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
    public java.util.concurrent.Future<ListProcessingJobsResult> listProcessingJobsAsync(ListProcessingJobsRequest request) {

        return listProcessingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProcessingJobsResult> listProcessingJobsAsync(final ListProcessingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProcessingJobsRequest, ListProcessingJobsResult> asyncHandler) {
        final ListProcessingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProcessingJobsResult>() {
            @Override
            public ListProcessingJobsResult call() throws Exception {
                ListProcessingJobsResult result = null;

                try {
                    result = executeListProcessingJobs(finalRequest);
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
    public java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(ListSubscribedWorkteamsRequest request) {

        return listSubscribedWorkteamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(final ListSubscribedWorkteamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscribedWorkteamsRequest, ListSubscribedWorkteamsResult> asyncHandler) {
        final ListSubscribedWorkteamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscribedWorkteamsResult>() {
            @Override
            public ListSubscribedWorkteamsResult call() throws Exception {
                ListSubscribedWorkteamsResult result = null;

                try {
                    result = executeListSubscribedWorkteams(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest request) {

        return listTrainingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(final ListTrainingJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrainingJobsRequest, ListTrainingJobsResult> asyncHandler) {
        final ListTrainingJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrainingJobsResult>() {
            @Override
            public ListTrainingJobsResult call() throws Exception {
                ListTrainingJobsResult result = null;

                try {
                    result = executeListTrainingJobs(finalRequest);
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
    public java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            ListTrainingJobsForHyperParameterTuningJobRequest request) {

        return listTrainingJobsForHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            final ListTrainingJobsForHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrainingJobsForHyperParameterTuningJobRequest, ListTrainingJobsForHyperParameterTuningJobResult> asyncHandler) {
        final ListTrainingJobsForHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrainingJobsForHyperParameterTuningJobResult>() {
            @Override
            public ListTrainingJobsForHyperParameterTuningJobResult call() throws Exception {
                ListTrainingJobsForHyperParameterTuningJobResult result = null;

                try {
                    result = executeListTrainingJobsForHyperParameterTuningJob(finalRequest);
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
    public java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(ListTransformJobsRequest request) {

        return listTransformJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(final ListTransformJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTransformJobsRequest, ListTransformJobsResult> asyncHandler) {
        final ListTransformJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTransformJobsResult>() {
            @Override
            public ListTransformJobsResult call() throws Exception {
                ListTransformJobsResult result = null;

                try {
                    result = executeListTransformJobs(finalRequest);
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
    public java.util.concurrent.Future<ListTrialComponentsResult> listTrialComponentsAsync(ListTrialComponentsRequest request) {

        return listTrialComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrialComponentsResult> listTrialComponentsAsync(final ListTrialComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrialComponentsRequest, ListTrialComponentsResult> asyncHandler) {
        final ListTrialComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrialComponentsResult>() {
            @Override
            public ListTrialComponentsResult call() throws Exception {
                ListTrialComponentsResult result = null;

                try {
                    result = executeListTrialComponents(finalRequest);
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
    public java.util.concurrent.Future<ListTrialsResult> listTrialsAsync(ListTrialsRequest request) {

        return listTrialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrialsResult> listTrialsAsync(final ListTrialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrialsRequest, ListTrialsResult> asyncHandler) {
        final ListTrialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrialsResult>() {
            @Override
            public ListTrialsResult call() throws Exception {
                ListTrialsResult result = null;

                try {
                    result = executeListTrials(finalRequest);
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
    public java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest request) {

        return listUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(final ListUserProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserProfilesRequest, ListUserProfilesResult> asyncHandler) {
        final ListUserProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserProfilesResult>() {
            @Override
            public ListUserProfilesResult call() throws Exception {
                ListUserProfilesResult result = null;

                try {
                    result = executeListUserProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(ListWorkteamsRequest request) {

        return listWorkteamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(final ListWorkteamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkteamsRequest, ListWorkteamsResult> asyncHandler) {
        final ListWorkteamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkteamsResult>() {
            @Override
            public ListWorkteamsResult call() throws Exception {
                ListWorkteamsResult result = null;

                try {
                    result = executeListWorkteams(finalRequest);
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
    public java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(RenderUiTemplateRequest request) {

        return renderUiTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(final RenderUiTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<RenderUiTemplateRequest, RenderUiTemplateResult> asyncHandler) {
        final RenderUiTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RenderUiTemplateResult>() {
            @Override
            public RenderUiTemplateResult call() throws Exception {
                RenderUiTemplateResult result = null;

                try {
                    result = executeRenderUiTemplate(finalRequest);
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
    public java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest request) {

        return searchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(final SearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler) {
        final SearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResult>() {
            @Override
            public SearchResult call() throws Exception {
                SearchResult result = null;

                try {
                    result = executeSearch(finalRequest);
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
    public java.util.concurrent.Future<StartMonitoringScheduleResult> startMonitoringScheduleAsync(StartMonitoringScheduleRequest request) {

        return startMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringScheduleResult> startMonitoringScheduleAsync(final StartMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMonitoringScheduleRequest, StartMonitoringScheduleResult> asyncHandler) {
        final StartMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMonitoringScheduleResult>() {
            @Override
            public StartMonitoringScheduleResult call() throws Exception {
                StartMonitoringScheduleResult result = null;

                try {
                    result = executeStartMonitoringSchedule(finalRequest);
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
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest request) {

        return startNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(final StartNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartNotebookInstanceRequest, StartNotebookInstanceResult> asyncHandler) {
        final StartNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartNotebookInstanceResult>() {
            @Override
            public StartNotebookInstanceResult call() throws Exception {
                StartNotebookInstanceResult result = null;

                try {
                    result = executeStartNotebookInstance(finalRequest);
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
    public java.util.concurrent.Future<StopAutoMLJobResult> stopAutoMLJobAsync(StopAutoMLJobRequest request) {

        return stopAutoMLJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAutoMLJobResult> stopAutoMLJobAsync(final StopAutoMLJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAutoMLJobRequest, StopAutoMLJobResult> asyncHandler) {
        final StopAutoMLJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAutoMLJobResult>() {
            @Override
            public StopAutoMLJobResult call() throws Exception {
                StopAutoMLJobResult result = null;

                try {
                    result = executeStopAutoMLJob(finalRequest);
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
    public java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(StopCompilationJobRequest request) {

        return stopCompilationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(final StopCompilationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCompilationJobRequest, StopCompilationJobResult> asyncHandler) {
        final StopCompilationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCompilationJobResult>() {
            @Override
            public StopCompilationJobResult call() throws Exception {
                StopCompilationJobResult result = null;

                try {
                    result = executeStopCompilationJob(finalRequest);
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
    public java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(StopHyperParameterTuningJobRequest request) {

        return stopHyperParameterTuningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(final StopHyperParameterTuningJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopHyperParameterTuningJobRequest, StopHyperParameterTuningJobResult> asyncHandler) {
        final StopHyperParameterTuningJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopHyperParameterTuningJobResult>() {
            @Override
            public StopHyperParameterTuningJobResult call() throws Exception {
                StopHyperParameterTuningJobResult result = null;

                try {
                    result = executeStopHyperParameterTuningJob(finalRequest);
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
    public java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(StopLabelingJobRequest request) {

        return stopLabelingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(final StopLabelingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopLabelingJobRequest, StopLabelingJobResult> asyncHandler) {
        final StopLabelingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopLabelingJobResult>() {
            @Override
            public StopLabelingJobResult call() throws Exception {
                StopLabelingJobResult result = null;

                try {
                    result = executeStopLabelingJob(finalRequest);
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
    public java.util.concurrent.Future<StopMonitoringScheduleResult> stopMonitoringScheduleAsync(StopMonitoringScheduleRequest request) {

        return stopMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMonitoringScheduleResult> stopMonitoringScheduleAsync(final StopMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopMonitoringScheduleRequest, StopMonitoringScheduleResult> asyncHandler) {
        final StopMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopMonitoringScheduleResult>() {
            @Override
            public StopMonitoringScheduleResult call() throws Exception {
                StopMonitoringScheduleResult result = null;

                try {
                    result = executeStopMonitoringSchedule(finalRequest);
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
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest request) {

        return stopNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(final StopNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopNotebookInstanceRequest, StopNotebookInstanceResult> asyncHandler) {
        final StopNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopNotebookInstanceResult>() {
            @Override
            public StopNotebookInstanceResult call() throws Exception {
                StopNotebookInstanceResult result = null;

                try {
                    result = executeStopNotebookInstance(finalRequest);
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
    public java.util.concurrent.Future<StopProcessingJobResult> stopProcessingJobAsync(StopProcessingJobRequest request) {

        return stopProcessingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopProcessingJobResult> stopProcessingJobAsync(final StopProcessingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopProcessingJobRequest, StopProcessingJobResult> asyncHandler) {
        final StopProcessingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopProcessingJobResult>() {
            @Override
            public StopProcessingJobResult call() throws Exception {
                StopProcessingJobResult result = null;

                try {
                    result = executeStopProcessingJob(finalRequest);
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
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest request) {

        return stopTrainingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(final StopTrainingJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTrainingJobRequest, StopTrainingJobResult> asyncHandler) {
        final StopTrainingJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTrainingJobResult>() {
            @Override
            public StopTrainingJobResult call() throws Exception {
                StopTrainingJobResult result = null;

                try {
                    result = executeStopTrainingJob(finalRequest);
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
    public java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(StopTransformJobRequest request) {

        return stopTransformJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(final StopTransformJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTransformJobRequest, StopTransformJobResult> asyncHandler) {
        final StopTransformJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTransformJobResult>() {
            @Override
            public StopTransformJobResult call() throws Exception {
                StopTransformJobResult result = null;

                try {
                    result = executeStopTransformJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(UpdateCodeRepositoryRequest request) {

        return updateCodeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(final UpdateCodeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCodeRepositoryRequest, UpdateCodeRepositoryResult> asyncHandler) {
        final UpdateCodeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCodeRepositoryResult>() {
            @Override
            public UpdateCodeRepositoryResult call() throws Exception {
                UpdateCodeRepositoryResult result = null;

                try {
                    result = executeUpdateCodeRepository(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest request) {

        return updateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(final UpdateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler) {
        final UpdateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainResult>() {
            @Override
            public UpdateDomainResult call() throws Exception {
                UpdateDomainResult result = null;

                try {
                    result = executeUpdateDomain(finalRequest);
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
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request) {

        return updateEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(final UpdateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler) {
        final UpdateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointResult>() {
            @Override
            public UpdateEndpointResult call() throws Exception {
                UpdateEndpointResult result = null;

                try {
                    result = executeUpdateEndpoint(finalRequest);
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
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest request) {

        return updateEndpointWeightsAndCapacitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            final UpdateEndpointWeightsAndCapacitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointWeightsAndCapacitiesRequest, UpdateEndpointWeightsAndCapacitiesResult> asyncHandler) {
        final UpdateEndpointWeightsAndCapacitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointWeightsAndCapacitiesResult>() {
            @Override
            public UpdateEndpointWeightsAndCapacitiesResult call() throws Exception {
                UpdateEndpointWeightsAndCapacitiesResult result = null;

                try {
                    result = executeUpdateEndpointWeightsAndCapacities(finalRequest);
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
    public java.util.concurrent.Future<UpdateMonitoringScheduleResult> updateMonitoringScheduleAsync(UpdateMonitoringScheduleRequest request) {

        return updateMonitoringScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoringScheduleResult> updateMonitoringScheduleAsync(final UpdateMonitoringScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMonitoringScheduleRequest, UpdateMonitoringScheduleResult> asyncHandler) {
        final UpdateMonitoringScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMonitoringScheduleResult>() {
            @Override
            public UpdateMonitoringScheduleResult call() throws Exception {
                UpdateMonitoringScheduleResult result = null;

                try {
                    result = executeUpdateMonitoringSchedule(finalRequest);
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
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest request) {

        return updateNotebookInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(final UpdateNotebookInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceRequest, UpdateNotebookInstanceResult> asyncHandler) {
        final UpdateNotebookInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotebookInstanceResult>() {
            @Override
            public UpdateNotebookInstanceResult call() throws Exception {
                UpdateNotebookInstanceResult result = null;

                try {
                    result = executeUpdateNotebookInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            UpdateNotebookInstanceLifecycleConfigRequest request) {

        return updateNotebookInstanceLifecycleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            final UpdateNotebookInstanceLifecycleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceLifecycleConfigRequest, UpdateNotebookInstanceLifecycleConfigResult> asyncHandler) {
        final UpdateNotebookInstanceLifecycleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotebookInstanceLifecycleConfigResult>() {
            @Override
            public UpdateNotebookInstanceLifecycleConfigResult call() throws Exception {
                UpdateNotebookInstanceLifecycleConfigResult result = null;

                try {
                    result = executeUpdateNotebookInstanceLifecycleConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrialResult> updateTrialAsync(UpdateTrialRequest request) {

        return updateTrialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrialResult> updateTrialAsync(final UpdateTrialRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrialRequest, UpdateTrialResult> asyncHandler) {
        final UpdateTrialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrialResult>() {
            @Override
            public UpdateTrialResult call() throws Exception {
                UpdateTrialResult result = null;

                try {
                    result = executeUpdateTrial(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrialComponentResult> updateTrialComponentAsync(UpdateTrialComponentRequest request) {

        return updateTrialComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrialComponentResult> updateTrialComponentAsync(final UpdateTrialComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrialComponentRequest, UpdateTrialComponentResult> asyncHandler) {
        final UpdateTrialComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrialComponentResult>() {
            @Override
            public UpdateTrialComponentResult call() throws Exception {
                UpdateTrialComponentResult result = null;

                try {
                    result = executeUpdateTrialComponent(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(final UpdateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler) {
        final UpdateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserProfileResult>() {
            @Override
            public UpdateUserProfileResult call() throws Exception {
                UpdateUserProfileResult result = null;

                try {
                    result = executeUpdateUserProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkforceResult> updateWorkforceAsync(UpdateWorkforceRequest request) {

        return updateWorkforceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkforceResult> updateWorkforceAsync(final UpdateWorkforceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkforceRequest, UpdateWorkforceResult> asyncHandler) {
        final UpdateWorkforceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkforceResult>() {
            @Override
            public UpdateWorkforceResult call() throws Exception {
                UpdateWorkforceResult result = null;

                try {
                    result = executeUpdateWorkforce(finalRequest);
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
    public java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(UpdateWorkteamRequest request) {

        return updateWorkteamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(final UpdateWorkteamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkteamRequest, UpdateWorkteamResult> asyncHandler) {
        final UpdateWorkteamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkteamResult>() {
            @Override
            public UpdateWorkteamResult call() throws Exception {
                UpdateWorkteamResult result = null;

                try {
                    result = executeUpdateWorkteam(finalRequest);
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
