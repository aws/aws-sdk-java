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
package com.amazonaws.services.bedrock;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Bedrock asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Describes the API operations for creating, managing, fine-turning, and evaluating Amazon Bedrock models.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonBedrockAsyncClient extends AmazonBedrockClient implements AmazonBedrockAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonBedrockAsyncClientBuilder asyncBuilder() {
        return AmazonBedrockAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Bedrock using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonBedrockAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Bedrock using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonBedrockAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateEvaluationJobResult> createEvaluationJobAsync(CreateEvaluationJobRequest request) {

        return createEvaluationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEvaluationJobResult> createEvaluationJobAsync(final CreateEvaluationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEvaluationJobRequest, CreateEvaluationJobResult> asyncHandler) {
        final CreateEvaluationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEvaluationJobResult>() {
            @Override
            public CreateEvaluationJobResult call() throws Exception {
                CreateEvaluationJobResult result = null;

                try {
                    result = executeCreateEvaluationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGuardrailResult> createGuardrailAsync(CreateGuardrailRequest request) {

        return createGuardrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGuardrailResult> createGuardrailAsync(final CreateGuardrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGuardrailRequest, CreateGuardrailResult> asyncHandler) {
        final CreateGuardrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGuardrailResult>() {
            @Override
            public CreateGuardrailResult call() throws Exception {
                CreateGuardrailResult result = null;

                try {
                    result = executeCreateGuardrail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGuardrailVersionResult> createGuardrailVersionAsync(CreateGuardrailVersionRequest request) {

        return createGuardrailVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGuardrailVersionResult> createGuardrailVersionAsync(final CreateGuardrailVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGuardrailVersionRequest, CreateGuardrailVersionResult> asyncHandler) {
        final CreateGuardrailVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGuardrailVersionResult>() {
            @Override
            public CreateGuardrailVersionResult call() throws Exception {
                CreateGuardrailVersionResult result = null;

                try {
                    result = executeCreateGuardrailVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelCustomizationJobResult> createModelCustomizationJobAsync(CreateModelCustomizationJobRequest request) {

        return createModelCustomizationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelCustomizationJobResult> createModelCustomizationJobAsync(final CreateModelCustomizationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelCustomizationJobRequest, CreateModelCustomizationJobResult> asyncHandler) {
        final CreateModelCustomizationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelCustomizationJobResult>() {
            @Override
            public CreateModelCustomizationJobResult call() throws Exception {
                CreateModelCustomizationJobResult result = null;

                try {
                    result = executeCreateModelCustomizationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProvisionedModelThroughputResult> createProvisionedModelThroughputAsync(
            CreateProvisionedModelThroughputRequest request) {

        return createProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProvisionedModelThroughputResult> createProvisionedModelThroughputAsync(
            final CreateProvisionedModelThroughputRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProvisionedModelThroughputRequest, CreateProvisionedModelThroughputResult> asyncHandler) {
        final CreateProvisionedModelThroughputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProvisionedModelThroughputResult>() {
            @Override
            public CreateProvisionedModelThroughputResult call() throws Exception {
                CreateProvisionedModelThroughputResult result = null;

                try {
                    result = executeCreateProvisionedModelThroughput(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomModelResult> deleteCustomModelAsync(DeleteCustomModelRequest request) {

        return deleteCustomModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomModelResult> deleteCustomModelAsync(final DeleteCustomModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomModelRequest, DeleteCustomModelResult> asyncHandler) {
        final DeleteCustomModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomModelResult>() {
            @Override
            public DeleteCustomModelResult call() throws Exception {
                DeleteCustomModelResult result = null;

                try {
                    result = executeDeleteCustomModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGuardrailResult> deleteGuardrailAsync(DeleteGuardrailRequest request) {

        return deleteGuardrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGuardrailResult> deleteGuardrailAsync(final DeleteGuardrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGuardrailRequest, DeleteGuardrailResult> asyncHandler) {
        final DeleteGuardrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGuardrailResult>() {
            @Override
            public DeleteGuardrailResult call() throws Exception {
                DeleteGuardrailResult result = null;

                try {
                    result = executeDeleteGuardrail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelInvocationLoggingConfigurationResult> deleteModelInvocationLoggingConfigurationAsync(
            DeleteModelInvocationLoggingConfigurationRequest request) {

        return deleteModelInvocationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelInvocationLoggingConfigurationResult> deleteModelInvocationLoggingConfigurationAsync(
            final DeleteModelInvocationLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelInvocationLoggingConfigurationRequest, DeleteModelInvocationLoggingConfigurationResult> asyncHandler) {
        final DeleteModelInvocationLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelInvocationLoggingConfigurationResult>() {
            @Override
            public DeleteModelInvocationLoggingConfigurationResult call() throws Exception {
                DeleteModelInvocationLoggingConfigurationResult result = null;

                try {
                    result = executeDeleteModelInvocationLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedModelThroughputResult> deleteProvisionedModelThroughputAsync(
            DeleteProvisionedModelThroughputRequest request) {

        return deleteProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedModelThroughputResult> deleteProvisionedModelThroughputAsync(
            final DeleteProvisionedModelThroughputRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProvisionedModelThroughputRequest, DeleteProvisionedModelThroughputResult> asyncHandler) {
        final DeleteProvisionedModelThroughputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProvisionedModelThroughputResult>() {
            @Override
            public DeleteProvisionedModelThroughputResult call() throws Exception {
                DeleteProvisionedModelThroughputResult result = null;

                try {
                    result = executeDeleteProvisionedModelThroughput(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCustomModelResult> getCustomModelAsync(GetCustomModelRequest request) {

        return getCustomModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomModelResult> getCustomModelAsync(final GetCustomModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCustomModelRequest, GetCustomModelResult> asyncHandler) {
        final GetCustomModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCustomModelResult>() {
            @Override
            public GetCustomModelResult call() throws Exception {
                GetCustomModelResult result = null;

                try {
                    result = executeGetCustomModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEvaluationJobResult> getEvaluationJobAsync(GetEvaluationJobRequest request) {

        return getEvaluationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvaluationJobResult> getEvaluationJobAsync(final GetEvaluationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvaluationJobRequest, GetEvaluationJobResult> asyncHandler) {
        final GetEvaluationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvaluationJobResult>() {
            @Override
            public GetEvaluationJobResult call() throws Exception {
                GetEvaluationJobResult result = null;

                try {
                    result = executeGetEvaluationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFoundationModelResult> getFoundationModelAsync(GetFoundationModelRequest request) {

        return getFoundationModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFoundationModelResult> getFoundationModelAsync(final GetFoundationModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFoundationModelRequest, GetFoundationModelResult> asyncHandler) {
        final GetFoundationModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFoundationModelResult>() {
            @Override
            public GetFoundationModelResult call() throws Exception {
                GetFoundationModelResult result = null;

                try {
                    result = executeGetFoundationModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGuardrailResult> getGuardrailAsync(GetGuardrailRequest request) {

        return getGuardrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGuardrailResult> getGuardrailAsync(final GetGuardrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGuardrailRequest, GetGuardrailResult> asyncHandler) {
        final GetGuardrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGuardrailResult>() {
            @Override
            public GetGuardrailResult call() throws Exception {
                GetGuardrailResult result = null;

                try {
                    result = executeGetGuardrail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelCustomizationJobResult> getModelCustomizationJobAsync(GetModelCustomizationJobRequest request) {

        return getModelCustomizationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelCustomizationJobResult> getModelCustomizationJobAsync(final GetModelCustomizationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelCustomizationJobRequest, GetModelCustomizationJobResult> asyncHandler) {
        final GetModelCustomizationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelCustomizationJobResult>() {
            @Override
            public GetModelCustomizationJobResult call() throws Exception {
                GetModelCustomizationJobResult result = null;

                try {
                    result = executeGetModelCustomizationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelInvocationLoggingConfigurationResult> getModelInvocationLoggingConfigurationAsync(
            GetModelInvocationLoggingConfigurationRequest request) {

        return getModelInvocationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelInvocationLoggingConfigurationResult> getModelInvocationLoggingConfigurationAsync(
            final GetModelInvocationLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelInvocationLoggingConfigurationRequest, GetModelInvocationLoggingConfigurationResult> asyncHandler) {
        final GetModelInvocationLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelInvocationLoggingConfigurationResult>() {
            @Override
            public GetModelInvocationLoggingConfigurationResult call() throws Exception {
                GetModelInvocationLoggingConfigurationResult result = null;

                try {
                    result = executeGetModelInvocationLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedModelThroughputResult> getProvisionedModelThroughputAsync(GetProvisionedModelThroughputRequest request) {

        return getProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedModelThroughputResult> getProvisionedModelThroughputAsync(
            final GetProvisionedModelThroughputRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProvisionedModelThroughputRequest, GetProvisionedModelThroughputResult> asyncHandler) {
        final GetProvisionedModelThroughputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProvisionedModelThroughputResult>() {
            @Override
            public GetProvisionedModelThroughputResult call() throws Exception {
                GetProvisionedModelThroughputResult result = null;

                try {
                    result = executeGetProvisionedModelThroughput(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCustomModelsResult> listCustomModelsAsync(ListCustomModelsRequest request) {

        return listCustomModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomModelsResult> listCustomModelsAsync(final ListCustomModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomModelsRequest, ListCustomModelsResult> asyncHandler) {
        final ListCustomModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomModelsResult>() {
            @Override
            public ListCustomModelsResult call() throws Exception {
                ListCustomModelsResult result = null;

                try {
                    result = executeListCustomModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEvaluationJobsResult> listEvaluationJobsAsync(ListEvaluationJobsRequest request) {

        return listEvaluationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEvaluationJobsResult> listEvaluationJobsAsync(final ListEvaluationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEvaluationJobsRequest, ListEvaluationJobsResult> asyncHandler) {
        final ListEvaluationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEvaluationJobsResult>() {
            @Override
            public ListEvaluationJobsResult call() throws Exception {
                ListEvaluationJobsResult result = null;

                try {
                    result = executeListEvaluationJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFoundationModelsResult> listFoundationModelsAsync(ListFoundationModelsRequest request) {

        return listFoundationModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFoundationModelsResult> listFoundationModelsAsync(final ListFoundationModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFoundationModelsRequest, ListFoundationModelsResult> asyncHandler) {
        final ListFoundationModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFoundationModelsResult>() {
            @Override
            public ListFoundationModelsResult call() throws Exception {
                ListFoundationModelsResult result = null;

                try {
                    result = executeListFoundationModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGuardrailsResult> listGuardrailsAsync(ListGuardrailsRequest request) {

        return listGuardrailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGuardrailsResult> listGuardrailsAsync(final ListGuardrailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGuardrailsRequest, ListGuardrailsResult> asyncHandler) {
        final ListGuardrailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGuardrailsResult>() {
            @Override
            public ListGuardrailsResult call() throws Exception {
                ListGuardrailsResult result = null;

                try {
                    result = executeListGuardrails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListModelCustomizationJobsResult> listModelCustomizationJobsAsync(ListModelCustomizationJobsRequest request) {

        return listModelCustomizationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelCustomizationJobsResult> listModelCustomizationJobsAsync(final ListModelCustomizationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelCustomizationJobsRequest, ListModelCustomizationJobsResult> asyncHandler) {
        final ListModelCustomizationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelCustomizationJobsResult>() {
            @Override
            public ListModelCustomizationJobsResult call() throws Exception {
                ListModelCustomizationJobsResult result = null;

                try {
                    result = executeListModelCustomizationJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedModelThroughputsResult> listProvisionedModelThroughputsAsync(
            ListProvisionedModelThroughputsRequest request) {

        return listProvisionedModelThroughputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedModelThroughputsResult> listProvisionedModelThroughputsAsync(
            final ListProvisionedModelThroughputsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProvisionedModelThroughputsRequest, ListProvisionedModelThroughputsResult> asyncHandler) {
        final ListProvisionedModelThroughputsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProvisionedModelThroughputsResult>() {
            @Override
            public ListProvisionedModelThroughputsResult call() throws Exception {
                ListProvisionedModelThroughputsResult result = null;

                try {
                    result = executeListProvisionedModelThroughputs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutModelInvocationLoggingConfigurationResult> putModelInvocationLoggingConfigurationAsync(
            PutModelInvocationLoggingConfigurationRequest request) {

        return putModelInvocationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutModelInvocationLoggingConfigurationResult> putModelInvocationLoggingConfigurationAsync(
            final PutModelInvocationLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutModelInvocationLoggingConfigurationRequest, PutModelInvocationLoggingConfigurationResult> asyncHandler) {
        final PutModelInvocationLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutModelInvocationLoggingConfigurationResult>() {
            @Override
            public PutModelInvocationLoggingConfigurationResult call() throws Exception {
                PutModelInvocationLoggingConfigurationResult result = null;

                try {
                    result = executePutModelInvocationLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopEvaluationJobResult> stopEvaluationJobAsync(StopEvaluationJobRequest request) {

        return stopEvaluationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEvaluationJobResult> stopEvaluationJobAsync(final StopEvaluationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopEvaluationJobRequest, StopEvaluationJobResult> asyncHandler) {
        final StopEvaluationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopEvaluationJobResult>() {
            @Override
            public StopEvaluationJobResult call() throws Exception {
                StopEvaluationJobResult result = null;

                try {
                    result = executeStopEvaluationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopModelCustomizationJobResult> stopModelCustomizationJobAsync(StopModelCustomizationJobRequest request) {

        return stopModelCustomizationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopModelCustomizationJobResult> stopModelCustomizationJobAsync(final StopModelCustomizationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopModelCustomizationJobRequest, StopModelCustomizationJobResult> asyncHandler) {
        final StopModelCustomizationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopModelCustomizationJobResult>() {
            @Override
            public StopModelCustomizationJobResult call() throws Exception {
                StopModelCustomizationJobResult result = null;

                try {
                    result = executeStopModelCustomizationJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateGuardrailResult> updateGuardrailAsync(UpdateGuardrailRequest request) {

        return updateGuardrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGuardrailResult> updateGuardrailAsync(final UpdateGuardrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGuardrailRequest, UpdateGuardrailResult> asyncHandler) {
        final UpdateGuardrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGuardrailResult>() {
            @Override
            public UpdateGuardrailResult call() throws Exception {
                UpdateGuardrailResult result = null;

                try {
                    result = executeUpdateGuardrail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedModelThroughputResult> updateProvisionedModelThroughputAsync(
            UpdateProvisionedModelThroughputRequest request) {

        return updateProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedModelThroughputResult> updateProvisionedModelThroughputAsync(
            final UpdateProvisionedModelThroughputRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProvisionedModelThroughputRequest, UpdateProvisionedModelThroughputResult> asyncHandler) {
        final UpdateProvisionedModelThroughputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProvisionedModelThroughputResult>() {
            @Override
            public UpdateProvisionedModelThroughputResult call() throws Exception {
                UpdateProvisionedModelThroughputResult result = null;

                try {
                    result = executeUpdateProvisionedModelThroughput(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
