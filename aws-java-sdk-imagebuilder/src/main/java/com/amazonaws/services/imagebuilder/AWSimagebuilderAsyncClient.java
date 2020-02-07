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
package com.amazonaws.services.imagebuilder;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing imagebuilder asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * EC2 Image Builder is a fully managed AWS service that makes it easier to automate the creation, management, and
 * deployment of customized, secure, and up-to-date “golden” server images that are pre-installed and pre-configured
 * with software and settings to meet specific IT standards.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSimagebuilderAsyncClient extends AWSimagebuilderClient implements AWSimagebuilderAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSimagebuilderAsyncClientBuilder asyncBuilder() {
        return AWSimagebuilderAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on imagebuilder using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSimagebuilderAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelImageCreationResult> cancelImageCreationAsync(CancelImageCreationRequest request) {

        return cancelImageCreationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelImageCreationResult> cancelImageCreationAsync(final CancelImageCreationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelImageCreationRequest, CancelImageCreationResult> asyncHandler) {
        final CancelImageCreationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelImageCreationResult>() {
            @Override
            public CancelImageCreationResult call() throws Exception {
                CancelImageCreationResult result = null;

                try {
                    result = executeCancelImageCreation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request) {

        return createComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(final CreateComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler) {
        final CreateComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateComponentResult>() {
            @Override
            public CreateComponentResult call() throws Exception {
                CreateComponentResult result = null;

                try {
                    result = executeCreateComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionConfigurationResult> createDistributionConfigurationAsync(
            CreateDistributionConfigurationRequest request) {

        return createDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionConfigurationResult> createDistributionConfigurationAsync(
            final CreateDistributionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDistributionConfigurationRequest, CreateDistributionConfigurationResult> asyncHandler) {
        final CreateDistributionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDistributionConfigurationResult>() {
            @Override
            public CreateDistributionConfigurationResult call() throws Exception {
                CreateDistributionConfigurationResult result = null;

                try {
                    result = executeCreateDistributionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request) {

        return createImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(final CreateImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler) {
        final CreateImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageResult>() {
            @Override
            public CreateImageResult call() throws Exception {
                CreateImageResult result = null;

                try {
                    result = executeCreateImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImagePipelineResult> createImagePipelineAsync(CreateImagePipelineRequest request) {

        return createImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImagePipelineResult> createImagePipelineAsync(final CreateImagePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImagePipelineRequest, CreateImagePipelineResult> asyncHandler) {
        final CreateImagePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImagePipelineResult>() {
            @Override
            public CreateImagePipelineResult call() throws Exception {
                CreateImagePipelineResult result = null;

                try {
                    result = executeCreateImagePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImageRecipeResult> createImageRecipeAsync(CreateImageRecipeRequest request) {

        return createImageRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageRecipeResult> createImageRecipeAsync(final CreateImageRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageRecipeRequest, CreateImageRecipeResult> asyncHandler) {
        final CreateImageRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageRecipeResult>() {
            @Override
            public CreateImageRecipeResult call() throws Exception {
                CreateImageRecipeResult result = null;

                try {
                    result = executeCreateImageRecipe(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateInfrastructureConfigurationResult> createInfrastructureConfigurationAsync(
            CreateInfrastructureConfigurationRequest request) {

        return createInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInfrastructureConfigurationResult> createInfrastructureConfigurationAsync(
            final CreateInfrastructureConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInfrastructureConfigurationRequest, CreateInfrastructureConfigurationResult> asyncHandler) {
        final CreateInfrastructureConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInfrastructureConfigurationResult>() {
            @Override
            public CreateInfrastructureConfigurationResult call() throws Exception {
                CreateInfrastructureConfigurationResult result = null;

                try {
                    result = executeCreateInfrastructureConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(final DeleteComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {
        final DeleteComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteComponentResult>() {
            @Override
            public DeleteComponentResult call() throws Exception {
                DeleteComponentResult result = null;

                try {
                    result = executeDeleteComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionConfigurationResult> deleteDistributionConfigurationAsync(
            DeleteDistributionConfigurationRequest request) {

        return deleteDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionConfigurationResult> deleteDistributionConfigurationAsync(
            final DeleteDistributionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDistributionConfigurationRequest, DeleteDistributionConfigurationResult> asyncHandler) {
        final DeleteDistributionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDistributionConfigurationResult>() {
            @Override
            public DeleteDistributionConfigurationResult call() throws Exception {
                DeleteDistributionConfigurationResult result = null;

                try {
                    result = executeDeleteDistributionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest request) {

        return deleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(final DeleteImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler) {
        final DeleteImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageResult>() {
            @Override
            public DeleteImageResult call() throws Exception {
                DeleteImageResult result = null;

                try {
                    result = executeDeleteImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImagePipelineResult> deleteImagePipelineAsync(DeleteImagePipelineRequest request) {

        return deleteImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImagePipelineResult> deleteImagePipelineAsync(final DeleteImagePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImagePipelineRequest, DeleteImagePipelineResult> asyncHandler) {
        final DeleteImagePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImagePipelineResult>() {
            @Override
            public DeleteImagePipelineResult call() throws Exception {
                DeleteImagePipelineResult result = null;

                try {
                    result = executeDeleteImagePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageRecipeResult> deleteImageRecipeAsync(DeleteImageRecipeRequest request) {

        return deleteImageRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageRecipeResult> deleteImageRecipeAsync(final DeleteImageRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageRecipeRequest, DeleteImageRecipeResult> asyncHandler) {
        final DeleteImageRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageRecipeResult>() {
            @Override
            public DeleteImageRecipeResult call() throws Exception {
                DeleteImageRecipeResult result = null;

                try {
                    result = executeDeleteImageRecipe(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteInfrastructureConfigurationResult> deleteInfrastructureConfigurationAsync(
            DeleteInfrastructureConfigurationRequest request) {

        return deleteInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInfrastructureConfigurationResult> deleteInfrastructureConfigurationAsync(
            final DeleteInfrastructureConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInfrastructureConfigurationRequest, DeleteInfrastructureConfigurationResult> asyncHandler) {
        final DeleteInfrastructureConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInfrastructureConfigurationResult>() {
            @Override
            public DeleteInfrastructureConfigurationResult call() throws Exception {
                DeleteInfrastructureConfigurationResult result = null;

                try {
                    result = executeDeleteInfrastructureConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(final GetComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {
        final GetComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentResult>() {
            @Override
            public GetComponentResult call() throws Exception {
                GetComponentResult result = null;

                try {
                    result = executeGetComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComponentPolicyResult> getComponentPolicyAsync(GetComponentPolicyRequest request) {

        return getComponentPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentPolicyResult> getComponentPolicyAsync(final GetComponentPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentPolicyRequest, GetComponentPolicyResult> asyncHandler) {
        final GetComponentPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentPolicyResult>() {
            @Override
            public GetComponentPolicyResult call() throws Exception {
                GetComponentPolicyResult result = null;

                try {
                    result = executeGetComponentPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigurationResult> getDistributionConfigurationAsync(GetDistributionConfigurationRequest request) {

        return getDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigurationResult> getDistributionConfigurationAsync(final GetDistributionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDistributionConfigurationRequest, GetDistributionConfigurationResult> asyncHandler) {
        final GetDistributionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDistributionConfigurationResult>() {
            @Override
            public GetDistributionConfigurationResult call() throws Exception {
                GetDistributionConfigurationResult result = null;

                try {
                    result = executeGetDistributionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImageResult> getImageAsync(GetImageRequest request) {

        return getImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageResult> getImageAsync(final GetImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImageRequest, GetImageResult> asyncHandler) {
        final GetImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImageResult>() {
            @Override
            public GetImageResult call() throws Exception {
                GetImageResult result = null;

                try {
                    result = executeGetImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImagePipelineResult> getImagePipelineAsync(GetImagePipelineRequest request) {

        return getImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImagePipelineResult> getImagePipelineAsync(final GetImagePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImagePipelineRequest, GetImagePipelineResult> asyncHandler) {
        final GetImagePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImagePipelineResult>() {
            @Override
            public GetImagePipelineResult call() throws Exception {
                GetImagePipelineResult result = null;

                try {
                    result = executeGetImagePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImagePolicyResult> getImagePolicyAsync(GetImagePolicyRequest request) {

        return getImagePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImagePolicyResult> getImagePolicyAsync(final GetImagePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImagePolicyRequest, GetImagePolicyResult> asyncHandler) {
        final GetImagePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImagePolicyResult>() {
            @Override
            public GetImagePolicyResult call() throws Exception {
                GetImagePolicyResult result = null;

                try {
                    result = executeGetImagePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipeResult> getImageRecipeAsync(GetImageRecipeRequest request) {

        return getImageRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipeResult> getImageRecipeAsync(final GetImageRecipeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImageRecipeRequest, GetImageRecipeResult> asyncHandler) {
        final GetImageRecipeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImageRecipeResult>() {
            @Override
            public GetImageRecipeResult call() throws Exception {
                GetImageRecipeResult result = null;

                try {
                    result = executeGetImageRecipe(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipePolicyResult> getImageRecipePolicyAsync(GetImageRecipePolicyRequest request) {

        return getImageRecipePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipePolicyResult> getImageRecipePolicyAsync(final GetImageRecipePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImageRecipePolicyRequest, GetImageRecipePolicyResult> asyncHandler) {
        final GetImageRecipePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImageRecipePolicyResult>() {
            @Override
            public GetImageRecipePolicyResult call() throws Exception {
                GetImageRecipePolicyResult result = null;

                try {
                    result = executeGetImageRecipePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInfrastructureConfigurationResult> getInfrastructureConfigurationAsync(GetInfrastructureConfigurationRequest request) {

        return getInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInfrastructureConfigurationResult> getInfrastructureConfigurationAsync(
            final GetInfrastructureConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInfrastructureConfigurationRequest, GetInfrastructureConfigurationResult> asyncHandler) {
        final GetInfrastructureConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInfrastructureConfigurationResult>() {
            @Override
            public GetInfrastructureConfigurationResult call() throws Exception {
                GetInfrastructureConfigurationResult result = null;

                try {
                    result = executeGetInfrastructureConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportComponentResult> importComponentAsync(ImportComponentRequest request) {

        return importComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportComponentResult> importComponentAsync(final ImportComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportComponentRequest, ImportComponentResult> asyncHandler) {
        final ImportComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportComponentResult>() {
            @Override
            public ImportComponentResult call() throws Exception {
                ImportComponentResult result = null;

                try {
                    result = executeImportComponent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListComponentBuildVersionsResult> listComponentBuildVersionsAsync(ListComponentBuildVersionsRequest request) {

        return listComponentBuildVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentBuildVersionsResult> listComponentBuildVersionsAsync(final ListComponentBuildVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentBuildVersionsRequest, ListComponentBuildVersionsResult> asyncHandler) {
        final ListComponentBuildVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentBuildVersionsResult>() {
            @Override
            public ListComponentBuildVersionsResult call() throws Exception {
                ListComponentBuildVersionsResult result = null;

                try {
                    result = executeListComponentBuildVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(final ListComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {
        final ListComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentsResult>() {
            @Override
            public ListComponentsResult call() throws Exception {
                ListComponentsResult result = null;

                try {
                    result = executeListComponents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDistributionConfigurationsResult> listDistributionConfigurationsAsync(ListDistributionConfigurationsRequest request) {

        return listDistributionConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionConfigurationsResult> listDistributionConfigurationsAsync(
            final ListDistributionConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionConfigurationsRequest, ListDistributionConfigurationsResult> asyncHandler) {
        final ListDistributionConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionConfigurationsResult>() {
            @Override
            public ListDistributionConfigurationsResult call() throws Exception {
                ListDistributionConfigurationsResult result = null;

                try {
                    result = executeListDistributionConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImageBuildVersionsResult> listImageBuildVersionsAsync(ListImageBuildVersionsRequest request) {

        return listImageBuildVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageBuildVersionsResult> listImageBuildVersionsAsync(final ListImageBuildVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImageBuildVersionsRequest, ListImageBuildVersionsResult> asyncHandler) {
        final ListImageBuildVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImageBuildVersionsResult>() {
            @Override
            public ListImageBuildVersionsResult call() throws Exception {
                ListImageBuildVersionsResult result = null;

                try {
                    result = executeListImageBuildVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelineImagesResult> listImagePipelineImagesAsync(ListImagePipelineImagesRequest request) {

        return listImagePipelineImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelineImagesResult> listImagePipelineImagesAsync(final ListImagePipelineImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImagePipelineImagesRequest, ListImagePipelineImagesResult> asyncHandler) {
        final ListImagePipelineImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImagePipelineImagesResult>() {
            @Override
            public ListImagePipelineImagesResult call() throws Exception {
                ListImagePipelineImagesResult result = null;

                try {
                    result = executeListImagePipelineImages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelinesResult> listImagePipelinesAsync(ListImagePipelinesRequest request) {

        return listImagePipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelinesResult> listImagePipelinesAsync(final ListImagePipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImagePipelinesRequest, ListImagePipelinesResult> asyncHandler) {
        final ListImagePipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImagePipelinesResult>() {
            @Override
            public ListImagePipelinesResult call() throws Exception {
                ListImagePipelinesResult result = null;

                try {
                    result = executeListImagePipelines(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImageRecipesResult> listImageRecipesAsync(ListImageRecipesRequest request) {

        return listImageRecipesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageRecipesResult> listImageRecipesAsync(final ListImageRecipesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImageRecipesRequest, ListImageRecipesResult> asyncHandler) {
        final ListImageRecipesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImageRecipesResult>() {
            @Override
            public ListImageRecipesResult call() throws Exception {
                ListImageRecipesResult result = null;

                try {
                    result = executeListImageRecipes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest request) {

        return listImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(final ListImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler) {
        final ListImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImagesResult>() {
            @Override
            public ListImagesResult call() throws Exception {
                ListImagesResult result = null;

                try {
                    result = executeListImages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInfrastructureConfigurationsResult> listInfrastructureConfigurationsAsync(
            ListInfrastructureConfigurationsRequest request) {

        return listInfrastructureConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInfrastructureConfigurationsResult> listInfrastructureConfigurationsAsync(
            final ListInfrastructureConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInfrastructureConfigurationsRequest, ListInfrastructureConfigurationsResult> asyncHandler) {
        final ListInfrastructureConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInfrastructureConfigurationsResult>() {
            @Override
            public ListInfrastructureConfigurationsResult call() throws Exception {
                ListInfrastructureConfigurationsResult result = null;

                try {
                    result = executeListInfrastructureConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutComponentPolicyResult> putComponentPolicyAsync(PutComponentPolicyRequest request) {

        return putComponentPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutComponentPolicyResult> putComponentPolicyAsync(final PutComponentPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutComponentPolicyRequest, PutComponentPolicyResult> asyncHandler) {
        final PutComponentPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutComponentPolicyResult>() {
            @Override
            public PutComponentPolicyResult call() throws Exception {
                PutComponentPolicyResult result = null;

                try {
                    result = executePutComponentPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutImagePolicyResult> putImagePolicyAsync(PutImagePolicyRequest request) {

        return putImagePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImagePolicyResult> putImagePolicyAsync(final PutImagePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutImagePolicyRequest, PutImagePolicyResult> asyncHandler) {
        final PutImagePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutImagePolicyResult>() {
            @Override
            public PutImagePolicyResult call() throws Exception {
                PutImagePolicyResult result = null;

                try {
                    result = executePutImagePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutImageRecipePolicyResult> putImageRecipePolicyAsync(PutImageRecipePolicyRequest request) {

        return putImageRecipePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImageRecipePolicyResult> putImageRecipePolicyAsync(final PutImageRecipePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutImageRecipePolicyRequest, PutImageRecipePolicyResult> asyncHandler) {
        final PutImageRecipePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutImageRecipePolicyResult>() {
            @Override
            public PutImageRecipePolicyResult call() throws Exception {
                PutImageRecipePolicyResult result = null;

                try {
                    result = executePutImageRecipePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartImagePipelineExecutionResult> startImagePipelineExecutionAsync(StartImagePipelineExecutionRequest request) {

        return startImagePipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImagePipelineExecutionResult> startImagePipelineExecutionAsync(final StartImagePipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImagePipelineExecutionRequest, StartImagePipelineExecutionResult> asyncHandler) {
        final StartImagePipelineExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImagePipelineExecutionResult>() {
            @Override
            public StartImagePipelineExecutionResult call() throws Exception {
                StartImagePipelineExecutionResult result = null;

                try {
                    result = executeStartImagePipelineExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDistributionConfigurationResult> updateDistributionConfigurationAsync(
            UpdateDistributionConfigurationRequest request) {

        return updateDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributionConfigurationResult> updateDistributionConfigurationAsync(
            final UpdateDistributionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDistributionConfigurationRequest, UpdateDistributionConfigurationResult> asyncHandler) {
        final UpdateDistributionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDistributionConfigurationResult>() {
            @Override
            public UpdateDistributionConfigurationResult call() throws Exception {
                UpdateDistributionConfigurationResult result = null;

                try {
                    result = executeUpdateDistributionConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateImagePipelineResult> updateImagePipelineAsync(UpdateImagePipelineRequest request) {

        return updateImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateImagePipelineResult> updateImagePipelineAsync(final UpdateImagePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateImagePipelineRequest, UpdateImagePipelineResult> asyncHandler) {
        final UpdateImagePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateImagePipelineResult>() {
            @Override
            public UpdateImagePipelineResult call() throws Exception {
                UpdateImagePipelineResult result = null;

                try {
                    result = executeUpdateImagePipeline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateInfrastructureConfigurationResult> updateInfrastructureConfigurationAsync(
            UpdateInfrastructureConfigurationRequest request) {

        return updateInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInfrastructureConfigurationResult> updateInfrastructureConfigurationAsync(
            final UpdateInfrastructureConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInfrastructureConfigurationRequest, UpdateInfrastructureConfigurationResult> asyncHandler) {
        final UpdateInfrastructureConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInfrastructureConfigurationResult>() {
            @Override
            public UpdateInfrastructureConfigurationResult call() throws Exception {
                UpdateInfrastructureConfigurationResult result = null;

                try {
                    result = executeUpdateInfrastructureConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
