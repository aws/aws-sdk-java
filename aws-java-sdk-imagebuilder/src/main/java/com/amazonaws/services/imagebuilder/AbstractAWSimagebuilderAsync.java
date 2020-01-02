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

/**
 * Abstract implementation of {@code AWSimagebuilderAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSimagebuilderAsync extends AbstractAWSimagebuilder implements AWSimagebuilderAsync {

    protected AbstractAWSimagebuilderAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelImageCreationResult> cancelImageCreationAsync(CancelImageCreationRequest request) {

        return cancelImageCreationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelImageCreationResult> cancelImageCreationAsync(CancelImageCreationRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelImageCreationRequest, CancelImageCreationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request) {

        return createComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionConfigurationResult> createDistributionConfigurationAsync(
            CreateDistributionConfigurationRequest request) {

        return createDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionConfigurationResult> createDistributionConfigurationAsync(
            CreateDistributionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionConfigurationRequest, CreateDistributionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request) {

        return createImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateImagePipelineResult> createImagePipelineAsync(CreateImagePipelineRequest request) {

        return createImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImagePipelineResult> createImagePipelineAsync(CreateImagePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateImagePipelineRequest, CreateImagePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateImageRecipeResult> createImageRecipeAsync(CreateImageRecipeRequest request) {

        return createImageRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageRecipeResult> createImageRecipeAsync(CreateImageRecipeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateImageRecipeRequest, CreateImageRecipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInfrastructureConfigurationResult> createInfrastructureConfigurationAsync(
            CreateInfrastructureConfigurationRequest request) {

        return createInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInfrastructureConfigurationResult> createInfrastructureConfigurationAsync(
            CreateInfrastructureConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInfrastructureConfigurationRequest, CreateInfrastructureConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionConfigurationResult> deleteDistributionConfigurationAsync(
            DeleteDistributionConfigurationRequest request) {

        return deleteDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionConfigurationResult> deleteDistributionConfigurationAsync(
            DeleteDistributionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionConfigurationRequest, DeleteDistributionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest request) {

        return deleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteImagePipelineResult> deleteImagePipelineAsync(DeleteImagePipelineRequest request) {

        return deleteImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImagePipelineResult> deleteImagePipelineAsync(DeleteImagePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteImagePipelineRequest, DeleteImagePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteImageRecipeResult> deleteImageRecipeAsync(DeleteImageRecipeRequest request) {

        return deleteImageRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageRecipeResult> deleteImageRecipeAsync(DeleteImageRecipeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteImageRecipeRequest, DeleteImageRecipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInfrastructureConfigurationResult> deleteInfrastructureConfigurationAsync(
            DeleteInfrastructureConfigurationRequest request) {

        return deleteInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInfrastructureConfigurationResult> deleteInfrastructureConfigurationAsync(
            DeleteInfrastructureConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInfrastructureConfigurationRequest, DeleteInfrastructureConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComponentPolicyResult> getComponentPolicyAsync(GetComponentPolicyRequest request) {

        return getComponentPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentPolicyResult> getComponentPolicyAsync(GetComponentPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComponentPolicyRequest, GetComponentPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigurationResult> getDistributionConfigurationAsync(GetDistributionConfigurationRequest request) {

        return getDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigurationResult> getDistributionConfigurationAsync(GetDistributionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDistributionConfigurationRequest, GetDistributionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImageResult> getImageAsync(GetImageRequest request) {

        return getImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageResult> getImageAsync(GetImageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImageRequest, GetImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImagePipelineResult> getImagePipelineAsync(GetImagePipelineRequest request) {

        return getImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImagePipelineResult> getImagePipelineAsync(GetImagePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImagePipelineRequest, GetImagePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImagePolicyResult> getImagePolicyAsync(GetImagePolicyRequest request) {

        return getImagePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImagePolicyResult> getImagePolicyAsync(GetImagePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImagePolicyRequest, GetImagePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipeResult> getImageRecipeAsync(GetImageRecipeRequest request) {

        return getImageRecipeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipeResult> getImageRecipeAsync(GetImageRecipeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImageRecipeRequest, GetImageRecipeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipePolicyResult> getImageRecipePolicyAsync(GetImageRecipePolicyRequest request) {

        return getImageRecipePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageRecipePolicyResult> getImageRecipePolicyAsync(GetImageRecipePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImageRecipePolicyRequest, GetImageRecipePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInfrastructureConfigurationResult> getInfrastructureConfigurationAsync(GetInfrastructureConfigurationRequest request) {

        return getInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInfrastructureConfigurationResult> getInfrastructureConfigurationAsync(GetInfrastructureConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInfrastructureConfigurationRequest, GetInfrastructureConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportComponentResult> importComponentAsync(ImportComponentRequest request) {

        return importComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportComponentResult> importComponentAsync(ImportComponentRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportComponentRequest, ImportComponentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComponentBuildVersionsResult> listComponentBuildVersionsAsync(ListComponentBuildVersionsRequest request) {

        return listComponentBuildVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentBuildVersionsResult> listComponentBuildVersionsAsync(ListComponentBuildVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComponentBuildVersionsRequest, ListComponentBuildVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDistributionConfigurationsResult> listDistributionConfigurationsAsync(ListDistributionConfigurationsRequest request) {

        return listDistributionConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionConfigurationsResult> listDistributionConfigurationsAsync(ListDistributionConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDistributionConfigurationsRequest, ListDistributionConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImageBuildVersionsResult> listImageBuildVersionsAsync(ListImageBuildVersionsRequest request) {

        return listImageBuildVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageBuildVersionsResult> listImageBuildVersionsAsync(ListImageBuildVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImageBuildVersionsRequest, ListImageBuildVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelineImagesResult> listImagePipelineImagesAsync(ListImagePipelineImagesRequest request) {

        return listImagePipelineImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelineImagesResult> listImagePipelineImagesAsync(ListImagePipelineImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImagePipelineImagesRequest, ListImagePipelineImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelinesResult> listImagePipelinesAsync(ListImagePipelinesRequest request) {

        return listImagePipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagePipelinesResult> listImagePipelinesAsync(ListImagePipelinesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImagePipelinesRequest, ListImagePipelinesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImageRecipesResult> listImageRecipesAsync(ListImageRecipesRequest request) {

        return listImageRecipesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageRecipesResult> listImageRecipesAsync(ListImageRecipesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImageRecipesRequest, ListImageRecipesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest request) {

        return listImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInfrastructureConfigurationsResult> listInfrastructureConfigurationsAsync(
            ListInfrastructureConfigurationsRequest request) {

        return listInfrastructureConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInfrastructureConfigurationsResult> listInfrastructureConfigurationsAsync(
            ListInfrastructureConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInfrastructureConfigurationsRequest, ListInfrastructureConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutComponentPolicyResult> putComponentPolicyAsync(PutComponentPolicyRequest request) {

        return putComponentPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutComponentPolicyResult> putComponentPolicyAsync(PutComponentPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutComponentPolicyRequest, PutComponentPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutImagePolicyResult> putImagePolicyAsync(PutImagePolicyRequest request) {

        return putImagePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImagePolicyResult> putImagePolicyAsync(PutImagePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutImagePolicyRequest, PutImagePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutImageRecipePolicyResult> putImageRecipePolicyAsync(PutImageRecipePolicyRequest request) {

        return putImageRecipePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImageRecipePolicyResult> putImageRecipePolicyAsync(PutImageRecipePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutImageRecipePolicyRequest, PutImageRecipePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartImagePipelineExecutionResult> startImagePipelineExecutionAsync(StartImagePipelineExecutionRequest request) {

        return startImagePipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImagePipelineExecutionResult> startImagePipelineExecutionAsync(StartImagePipelineExecutionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartImagePipelineExecutionRequest, StartImagePipelineExecutionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributionConfigurationResult> updateDistributionConfigurationAsync(
            UpdateDistributionConfigurationRequest request) {

        return updateDistributionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributionConfigurationResult> updateDistributionConfigurationAsync(
            UpdateDistributionConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionConfigurationRequest, UpdateDistributionConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateImagePipelineResult> updateImagePipelineAsync(UpdateImagePipelineRequest request) {

        return updateImagePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateImagePipelineResult> updateImagePipelineAsync(UpdateImagePipelineRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateImagePipelineRequest, UpdateImagePipelineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateInfrastructureConfigurationResult> updateInfrastructureConfigurationAsync(
            UpdateInfrastructureConfigurationRequest request) {

        return updateInfrastructureConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInfrastructureConfigurationResult> updateInfrastructureConfigurationAsync(
            UpdateInfrastructureConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateInfrastructureConfigurationRequest, UpdateInfrastructureConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
