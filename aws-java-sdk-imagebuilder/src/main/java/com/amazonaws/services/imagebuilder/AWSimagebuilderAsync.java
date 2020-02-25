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
 * Interface for accessing imagebuilder asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.imagebuilder.AbstractAWSimagebuilderAsync} instead.
 * </p>
 * <p>
 * <p>
 * EC2 Image Builder is a fully managed AWS service that makes it easier to automate the creation, management, and
 * deployment of customized, secure, and up-to-date “golden” server images that are pre-installed and pre-configured
 * with software and settings to meet specific IT standards.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSimagebuilderAsync extends AWSimagebuilder {

    /**
     * <p>
     * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal
     * state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @return A Java Future containing the result of the CancelImageCreation operation returned by the service.
     * @sample AWSimagebuilderAsync.CancelImageCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelImageCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelImageCreationResult> cancelImageCreationAsync(CancelImageCreationRequest cancelImageCreationRequest);

    /**
     * <p>
     * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal
     * state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelImageCreation operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.CancelImageCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelImageCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelImageCreationResult> cancelImageCreationAsync(CancelImageCreationRequest cancelImageCreationRequest,
            com.amazonaws.handlers.AsyncHandler<CancelImageCreationRequest, CancelImageCreationResult> asyncHandler);

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and assess your image.
     * </p>
     * 
     * @param createComponentRequest
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AWSimagebuilderAsync.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and assess your image.
     * </p>
     * 
     * @param createComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler);

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @return A Java Future containing the result of the CreateDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.CreateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionConfigurationResult> createDistributionConfigurationAsync(
            CreateDistributionConfigurationRequest createDistributionConfigurationRequest);

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.CreateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionConfigurationResult> createDistributionConfigurationAsync(
            CreateDistributionConfigurationRequest createDistributionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionConfigurationRequest, CreateDistributionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all of the configured output resources
     * defined in the distribution configuration.
     * </p>
     * 
     * @param createImageRequest
     * @return A Java Future containing the result of the CreateImage operation returned by the service.
     * @sample AWSimagebuilderAsync.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest);

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all of the configured output resources
     * defined in the distribution configuration.
     * </p>
     * 
     * @param createImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImage operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler);

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @return A Java Future containing the result of the CreateImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsync.CreateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateImagePipelineResult> createImagePipelineAsync(CreateImagePipelineRequest createImagePipelineRequest);

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.CreateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateImagePipelineResult> createImagePipelineAsync(CreateImagePipelineRequest createImagePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImagePipelineRequest, CreateImagePipelineResult> asyncHandler);

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @return A Java Future containing the result of the CreateImageRecipe operation returned by the service.
     * @sample AWSimagebuilderAsync.CreateImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageRecipeResult> createImageRecipeAsync(CreateImageRecipeRequest createImageRecipeRequest);

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImageRecipe operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.CreateImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageRecipeResult> createImageRecipeAsync(CreateImageRecipeRequest createImageRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageRecipeRequest, CreateImageRecipeResult> asyncHandler);

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @return A Java Future containing the result of the CreateInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.CreateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInfrastructureConfigurationResult> createInfrastructureConfigurationAsync(
            CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest);

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.CreateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInfrastructureConfigurationResult> createInfrastructureConfigurationAsync(
            CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInfrastructureConfigurationRequest, CreateInfrastructureConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSimagebuilderAsync.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler);

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @return A Java Future containing the result of the DeleteDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.DeleteDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDistributionConfigurationResult> deleteDistributionConfigurationAsync(
            DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest);

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.DeleteDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDistributionConfigurationResult> deleteDistributionConfigurationAsync(
            DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionConfigurationRequest, DeleteDistributionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return A Java Future containing the result of the DeleteImage operation returned by the service.
     * @sample AWSimagebuilderAsync.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes an image.
     * </p>
     * 
     * @param deleteImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImage operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest deleteImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler);

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @return A Java Future containing the result of the DeleteImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsync.DeleteImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImagePipelineResult> deleteImagePipelineAsync(DeleteImagePipelineRequest deleteImagePipelineRequest);

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.DeleteImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImagePipelineResult> deleteImagePipelineAsync(DeleteImagePipelineRequest deleteImagePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImagePipelineRequest, DeleteImagePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @return A Java Future containing the result of the DeleteImageRecipe operation returned by the service.
     * @sample AWSimagebuilderAsync.DeleteImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageRecipeResult> deleteImageRecipeAsync(DeleteImageRecipeRequest deleteImageRecipeRequest);

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImageRecipe operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.DeleteImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageRecipeResult> deleteImageRecipeAsync(DeleteImageRecipeRequest deleteImageRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageRecipeRequest, DeleteImageRecipeResult> asyncHandler);

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @return A Java Future containing the result of the DeleteInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.DeleteInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInfrastructureConfigurationResult> deleteInfrastructureConfigurationAsync(
            DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest);

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.DeleteInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInfrastructureConfigurationResult> deleteInfrastructureConfigurationAsync(
            DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInfrastructureConfigurationRequest, DeleteInfrastructureConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSimagebuilderAsync.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler);

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @return A Java Future containing the result of the GetComponentPolicy operation returned by the service.
     * @sample AWSimagebuilderAsync.GetComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentPolicyResult> getComponentPolicyAsync(GetComponentPolicyRequest getComponentPolicyRequest);

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponentPolicy operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentPolicyResult> getComponentPolicyAsync(GetComponentPolicyRequest getComponentPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentPolicyRequest, GetComponentPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @return A Java Future containing the result of the GetDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.GetDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionConfigurationResult> getDistributionConfigurationAsync(
            GetDistributionConfigurationRequest getDistributionConfigurationRequest);

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.GetDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionConfigurationResult> getDistributionConfigurationAsync(
            GetDistributionConfigurationRequest getDistributionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionConfigurationRequest, GetDistributionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @return A Java Future containing the result of the GetImage operation returned by the service.
     * @sample AWSimagebuilderAsync.GetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImageResult> getImageAsync(GetImageRequest getImageRequest);

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImage operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImageResult> getImageAsync(GetImageRequest getImageRequest,
            com.amazonaws.handlers.AsyncHandler<GetImageRequest, GetImageResult> asyncHandler);

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @return A Java Future containing the result of the GetImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsync.GetImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImagePipelineResult> getImagePipelineAsync(GetImagePipelineRequest getImagePipelineRequest);

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImagePipelineResult> getImagePipelineAsync(GetImagePipelineRequest getImagePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetImagePipelineRequest, GetImagePipelineResult> asyncHandler);

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @return A Java Future containing the result of the GetImagePolicy operation returned by the service.
     * @sample AWSimagebuilderAsync.GetImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImagePolicyResult> getImagePolicyAsync(GetImagePolicyRequest getImagePolicyRequest);

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImagePolicy operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImagePolicyResult> getImagePolicyAsync(GetImagePolicyRequest getImagePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetImagePolicyRequest, GetImagePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @return A Java Future containing the result of the GetImageRecipe operation returned by the service.
     * @sample AWSimagebuilderAsync.GetImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImageRecipeResult> getImageRecipeAsync(GetImageRecipeRequest getImageRecipeRequest);

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImageRecipe operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImageRecipeResult> getImageRecipeAsync(GetImageRecipeRequest getImageRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<GetImageRecipeRequest, GetImageRecipeResult> asyncHandler);

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @return A Java Future containing the result of the GetImageRecipePolicy operation returned by the service.
     * @sample AWSimagebuilderAsync.GetImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImageRecipePolicyResult> getImageRecipePolicyAsync(GetImageRecipePolicyRequest getImageRecipePolicyRequest);

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImageRecipePolicy operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.GetImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImageRecipePolicyResult> getImageRecipePolicyAsync(GetImageRecipePolicyRequest getImageRecipePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetImageRecipePolicyRequest, GetImageRecipePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest
     *        GetInfrastructureConfiguration request object.
     * @return A Java Future containing the result of the GetInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.GetInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInfrastructureConfigurationResult> getInfrastructureConfigurationAsync(
            GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest);

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest
     *        GetInfrastructureConfiguration request object.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.GetInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInfrastructureConfigurationResult> getInfrastructureConfigurationAsync(
            GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetInfrastructureConfigurationRequest, GetInfrastructureConfigurationResult> asyncHandler);

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @return A Java Future containing the result of the ImportComponent operation returned by the service.
     * @sample AWSimagebuilderAsync.ImportComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportComponentResult> importComponentAsync(ImportComponentRequest importComponentRequest);

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportComponent operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ImportComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportComponentResult> importComponentAsync(ImportComponentRequest importComponentRequest,
            com.amazonaws.handlers.AsyncHandler<ImportComponentRequest, ImportComponentResult> asyncHandler);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentBuildVersionsRequest
     * @return A Java Future containing the result of the ListComponentBuildVersions operation returned by the service.
     * @sample AWSimagebuilderAsync.ListComponentBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponentBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentBuildVersionsResult> listComponentBuildVersionsAsync(
            ListComponentBuildVersionsRequest listComponentBuildVersionsRequest);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentBuildVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponentBuildVersions operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListComponentBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponentBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentBuildVersionsResult> listComponentBuildVersionsAsync(
            ListComponentBuildVersionsRequest listComponentBuildVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentBuildVersionsRequest, ListComponentBuildVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentsRequest
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSimagebuilderAsync.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @return A Java Future containing the result of the ListDistributionConfigurations operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.ListDistributionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListDistributionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionConfigurationsResult> listDistributionConfigurationsAsync(
            ListDistributionConfigurationsRequest listDistributionConfigurationsRequest);

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionConfigurations operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.ListDistributionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListDistributionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionConfigurationsResult> listDistributionConfigurationsAsync(
            ListDistributionConfigurationsRequest listDistributionConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionConfigurationsRequest, ListDistributionConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @return A Java Future containing the result of the ListImageBuildVersions operation returned by the service.
     * @sample AWSimagebuilderAsync.ListImageBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImageBuildVersionsResult> listImageBuildVersionsAsync(ListImageBuildVersionsRequest listImageBuildVersionsRequest);

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImageBuildVersions operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListImageBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImageBuildVersionsResult> listImageBuildVersionsAsync(ListImageBuildVersionsRequest listImageBuildVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImageBuildVersionsRequest, ListImageBuildVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @return A Java Future containing the result of the ListImagePipelineImages operation returned by the service.
     * @sample AWSimagebuilderAsync.ListImagePipelineImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelineImages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImagePipelineImagesResult> listImagePipelineImagesAsync(ListImagePipelineImagesRequest listImagePipelineImagesRequest);

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImagePipelineImages operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListImagePipelineImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelineImages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImagePipelineImagesResult> listImagePipelineImagesAsync(ListImagePipelineImagesRequest listImagePipelineImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImagePipelineImagesRequest, ListImagePipelineImagesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @return A Java Future containing the result of the ListImagePipelines operation returned by the service.
     * @sample AWSimagebuilderAsync.ListImagePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImagePipelinesResult> listImagePipelinesAsync(ListImagePipelinesRequest listImagePipelinesRequest);

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImagePipelines operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListImagePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImagePipelinesResult> listImagePipelinesAsync(ListImagePipelinesRequest listImagePipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImagePipelinesRequest, ListImagePipelinesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @return A Java Future containing the result of the ListImageRecipes operation returned by the service.
     * @sample AWSimagebuilderAsync.ListImageRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageRecipes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListImageRecipesResult> listImageRecipesAsync(ListImageRecipesRequest listImageRecipesRequest);

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImageRecipes operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListImageRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageRecipes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListImageRecipesResult> listImageRecipesAsync(ListImageRecipesRequest listImageRecipesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImageRecipesRequest, ListImageRecipesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of image build versions for the specified semantic version.
     * </p>
     * 
     * @param listImagesRequest
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AWSimagebuilderAsync.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * Returns the list of image build versions for the specified semantic version.
     * </p>
     * 
     * @param listImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @return A Java Future containing the result of the ListInfrastructureConfigurations operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.ListInfrastructureConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListInfrastructureConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInfrastructureConfigurationsResult> listInfrastructureConfigurationsAsync(
            ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest);

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInfrastructureConfigurations operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.ListInfrastructureConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListInfrastructureConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInfrastructureConfigurationsResult> listInfrastructureConfigurationsAsync(
            ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInfrastructureConfigurationsRequest, ListInfrastructureConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSimagebuilderAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Applies a policy to a component.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @return A Java Future containing the result of the PutComponentPolicy operation returned by the service.
     * @sample AWSimagebuilderAsync.PutComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutComponentPolicyResult> putComponentPolicyAsync(PutComponentPolicyRequest putComponentPolicyRequest);

    /**
     * <p>
     * Applies a policy to a component.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutComponentPolicy operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.PutComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutComponentPolicyResult> putComponentPolicyAsync(PutComponentPolicyRequest putComponentPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutComponentPolicyRequest, PutComponentPolicyResult> asyncHandler);

    /**
     * <p>
     * Applies a policy to an image.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @return A Java Future containing the result of the PutImagePolicy operation returned by the service.
     * @sample AWSimagebuilderAsync.PutImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutImagePolicyResult> putImagePolicyAsync(PutImagePolicyRequest putImagePolicyRequest);

    /**
     * <p>
     * Applies a policy to an image.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImagePolicy operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.PutImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutImagePolicyResult> putImagePolicyAsync(PutImagePolicyRequest putImagePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutImagePolicyRequest, PutImagePolicyResult> asyncHandler);

    /**
     * <p>
     * Applies a policy to an image recipe.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @return A Java Future containing the result of the PutImageRecipePolicy operation returned by the service.
     * @sample AWSimagebuilderAsync.PutImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutImageRecipePolicyResult> putImageRecipePolicyAsync(PutImageRecipePolicyRequest putImageRecipePolicyRequest);

    /**
     * <p>
     * Applies a policy to an image recipe.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImageRecipePolicy operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.PutImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutImageRecipePolicyResult> putImageRecipePolicyAsync(PutImageRecipePolicyRequest putImageRecipePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutImageRecipePolicyRequest, PutImageRecipePolicyResult> asyncHandler);

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @return A Java Future containing the result of the StartImagePipelineExecution operation returned by the service.
     * @sample AWSimagebuilderAsync.StartImagePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartImagePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartImagePipelineExecutionResult> startImagePipelineExecutionAsync(
            StartImagePipelineExecutionRequest startImagePipelineExecutionRequest);

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImagePipelineExecution operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.StartImagePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartImagePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartImagePipelineExecutionResult> startImagePipelineExecutionAsync(
            StartImagePipelineExecutionRequest startImagePipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartImagePipelineExecutionRequest, StartImagePipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSimagebuilderAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSimagebuilderAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @return A Java Future containing the result of the UpdateDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.UpdateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionConfigurationResult> updateDistributionConfigurationAsync(
            UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest);

    /**
     * <p>
     * Updates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistributionConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.UpdateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionConfigurationResult> updateDistributionConfigurationAsync(
            UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionConfigurationRequest, UpdateDistributionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param updateImagePipelineRequest
     * @return A Java Future containing the result of the UpdateImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsync.UpdateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImagePipelineResult> updateImagePipelineAsync(UpdateImagePipelineRequest updateImagePipelineRequest);

    /**
     * <p>
     * Updates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param updateImagePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateImagePipeline operation returned by the service.
     * @sample AWSimagebuilderAsyncHandler.UpdateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImagePipelineResult> updateImagePipelineAsync(UpdateImagePipelineRequest updateImagePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateImagePipelineRequest, UpdateImagePipelineResult> asyncHandler);

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @return A Java Future containing the result of the UpdateInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsync.UpdateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInfrastructureConfigurationResult> updateInfrastructureConfigurationAsync(
            UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest);

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInfrastructureConfiguration operation returned by the
     *         service.
     * @sample AWSimagebuilderAsyncHandler.UpdateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInfrastructureConfigurationResult> updateInfrastructureConfigurationAsync(
            UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInfrastructureConfigurationRequest, UpdateInfrastructureConfigurationResult> asyncHandler);

}
