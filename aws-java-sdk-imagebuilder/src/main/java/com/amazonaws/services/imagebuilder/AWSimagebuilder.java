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
package com.amazonaws.services.imagebuilder;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.imagebuilder.model.*;

/**
 * Interface for accessing imagebuilder.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.imagebuilder.AbstractAWSimagebuilder} instead.
 * </p>
 * <p>
 * <p>
 * EC2 Image Builder is a fully managed Amazon Web Services service that makes it easier to automate the creation,
 * management, and deployment of customized, secure, and up-to-date "golden" server images that are pre-installed and
 * pre-configured with software and settings to meet specific IT standards.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSimagebuilder {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "imagebuilder";

    /**
     * <p>
     * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal
     * state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @return Result of the CancelImageCreation operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.CancelImageCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelImageCreation"
     *      target="_top">AWS API Documentation</a>
     */
    CancelImageCreationResult cancelImageCreation(CancelImageCreationRequest cancelImageCreationRequest);

    /**
     * <p>
     * Cancel a specific image lifecycle policy runtime instance.
     * </p>
     * 
     * @param cancelLifecycleExecutionRequest
     * @return Result of the CancelLifecycleExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.CancelLifecycleExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelLifecycleExecution"
     *      target="_top">AWS API Documentation</a>
     */
    CancelLifecycleExecutionResult cancelLifecycleExecution(CancelLifecycleExecutionRequest cancelLifecycleExecutionRequest);

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and assess your image. The component is based
     * on a YAML document that you specify using exactly one of the following methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Inline, using the <code>data</code> property in the request body.
     * </p>
     * </li>
     * <li>
     * <p>
     * A URL that points to a YAML document file stored in Amazon S3, using the <code>uri</code> property in the request
     * body.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateComponent" target="_top">AWS
     *      API Documentation</a>
     */
    CreateComponentResult createComponent(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Creates a new container recipe. Container recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createContainerRecipeRequest
     * @return Result of the CreateContainerRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateContainerRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateContainerRecipe"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContainerRecipeResult createContainerRecipe(CreateContainerRecipeRequest createContainerRecipeRequest);

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @return Result of the CreateDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDistributionConfigurationResult createDistributionConfiguration(CreateDistributionConfigurationRequest createDistributionConfigurationRequest);

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all of the configured output resources
     * defined in the distribution configuration. You must specify exactly one recipe for your image, using either a
     * ContainerRecipeArn or an ImageRecipeArn.
     * </p>
     * 
     * @param createImageRequest
     * @return Result of the CreateImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImageResult createImage(CreateImageRequest createImageRequest);

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @return Result of the CreateImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateImagePipelineResult createImagePipeline(CreateImagePipelineRequest createImagePipelineRequest);

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @return Result of the CreateImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    CreateImageRecipeResult createImageRecipe(CreateImageRecipeRequest createImageRecipeRequest);

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @return Result of the CreateInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInfrastructureConfigurationResult createInfrastructureConfiguration(CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest);

    /**
     * <p>
     * Create a lifecycle policy resource.
     * </p>
     * 
     * @param createLifecyclePolicyRequest
     * @return Result of the CreateLifecyclePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLifecyclePolicyResult createLifecyclePolicy(CreateLifecyclePolicyRequest createLifecyclePolicyRequest);

    /**
     * <p>
     * Create a new workflow or a new version of an existing workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the number of permitted resources or operations for this service. For service quotas,
     *         see <a href="https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder">EC2
     *         Image Builder endpoints and quotas</a>.
     * @sample AWSimagebuilder.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateWorkflow" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a container recipe.
     * </p>
     * 
     * @param deleteContainerRecipeRequest
     * @return Result of the DeleteContainerRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteContainerRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteContainerRecipe"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContainerRecipeResult deleteContainerRecipe(DeleteContainerRecipeRequest deleteContainerRecipeRequest);

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @return Result of the DeleteDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDistributionConfigurationResult deleteDistributionConfiguration(DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest);

    /**
     * <p>
     * Deletes an Image Builder image resource. This does not delete any EC2 AMIs or ECR container images that are
     * created during the image build process. You must clean those up separately, using the appropriate Amazon EC2 or
     * Amazon ECR console actions, or API or CLI commands.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To deregister an EC2 Linux AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/deregister-ami.html">Deregister your Linux AMI</a> in
     * the <i> <i>Amazon EC2 User Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To deregister an EC2 Windows AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/deregister-ami.html">Deregister your Windows AMI</a>
     * in the <i> <i>Amazon EC2 Windows Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a container image from Amazon ECR, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/delete_image.html">Deleting an image</a> in the
     * <i>Amazon ECR User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteImageRequest
     * @return Result of the DeleteImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @return Result of the DeleteImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteImagePipelineResult deleteImagePipeline(DeleteImagePipelineRequest deleteImagePipelineRequest);

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @return Result of the DeleteImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteImageRecipeResult deleteImageRecipe(DeleteImageRecipeRequest deleteImageRecipeRequest);

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @return Result of the DeleteInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInfrastructureConfigurationResult deleteInfrastructureConfiguration(DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest);

    /**
     * <p>
     * Delete the specified lifecycle policy resource.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return Result of the DeleteLifecyclePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Deletes a specific workflow resource.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteWorkflow" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    GetComponentResult getComponent(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @return Result of the GetComponentPolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetComponentPolicyResult getComponentPolicy(GetComponentPolicyRequest getComponentPolicyRequest);

    /**
     * <p>
     * Retrieves a container recipe.
     * </p>
     * 
     * @param getContainerRecipeRequest
     * @return Result of the GetContainerRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetContainerRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetContainerRecipe"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerRecipeResult getContainerRecipe(GetContainerRecipeRequest getContainerRecipeRequest);

    /**
     * <p>
     * Retrieves the policy for a container recipe.
     * </p>
     * 
     * @param getContainerRecipePolicyRequest
     * @return Result of the GetContainerRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetContainerRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetContainerRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerRecipePolicyResult getContainerRecipePolicy(GetContainerRecipePolicyRequest getContainerRecipePolicyRequest);

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @return Result of the GetDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetDistributionConfigurationResult getDistributionConfiguration(GetDistributionConfigurationRequest getDistributionConfigurationRequest);

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @return Result of the GetImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImage" target="_top">AWS API
     *      Documentation</a>
     */
    GetImageResult getImage(GetImageRequest getImageRequest);

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @return Result of the GetImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    GetImagePipelineResult getImagePipeline(GetImagePipelineRequest getImagePipelineRequest);

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @return Result of the GetImagePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetImagePolicyResult getImagePolicy(GetImagePolicyRequest getImagePolicyRequest);

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @return Result of the GetImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    GetImageRecipeResult getImageRecipe(GetImageRecipeRequest getImageRecipeRequest);

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @return Result of the GetImageRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetImageRecipePolicyResult getImageRecipePolicy(GetImageRecipePolicyRequest getImageRecipePolicyRequest);

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest
     *        GetInfrastructureConfiguration request object.
     * @return Result of the GetInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetInfrastructureConfigurationResult getInfrastructureConfiguration(GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest);

    /**
     * <p>
     * Get the runtime information that was logged for a specific runtime instance of the lifecycle policy.
     * </p>
     * 
     * @param getLifecycleExecutionRequest
     * @return Result of the GetLifecycleExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetLifecycleExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetLifecycleExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetLifecycleExecutionResult getLifecycleExecution(GetLifecycleExecutionRequest getLifecycleExecutionRequest);

    /**
     * <p>
     * Get details for the specified image lifecycle policy.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return Result of the GetLifecyclePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

    /**
     * <p>
     * Get a workflow resource object.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return Result of the GetWorkflow operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkflowResult getWorkflow(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Get the runtime information that was logged for a specific runtime instance of the workflow.
     * </p>
     * 
     * @param getWorkflowExecutionRequest
     * @return Result of the GetWorkflowExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetWorkflowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkflowExecutionResult getWorkflowExecution(GetWorkflowExecutionRequest getWorkflowExecutionRequest);

    /**
     * <p>
     * Get the runtime information that was logged for a specific runtime instance of the workflow step.
     * </p>
     * 
     * @param getWorkflowStepExecutionRequest
     * @return Result of the GetWorkflowStepExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetWorkflowStepExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetWorkflowStepExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkflowStepExecutionResult getWorkflowStepExecution(GetWorkflowStepExecutionRequest getWorkflowStepExecutionRequest);

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @return Result of the ImportComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.ImportComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportComponent" target="_top">AWS
     *      API Documentation</a>
     */
    ImportComponentResult importComponent(ImportComponentRequest importComponentRequest);

    /**
     * <p>
     * When you export your virtual machine (VM) from its virtualization environment, that process creates a set of one
     * or more disk container files that act as snapshots of your VM’s environment, settings, and data. The Amazon EC2
     * API <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportImage.html">ImportImage</a> action
     * uses those files to import your VM and create an AMI. To import using the CLI command, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/import-image.html">import-image</a>
     * </p>
     * <p>
     * You can reference the task ID from the VM import to pull in the AMI that the import created as the base image for
     * your Image Builder recipe.
     * </p>
     * 
     * @param importVmImageRequest
     * @return Result of the ImportVmImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @sample AWSimagebuilder.ImportVmImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportVmImage" target="_top">AWS API
     *      Documentation</a>
     */
    ImportVmImageResult importVmImage(ImportVmImageRequest importVmImageRequest);

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the most
     * recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in
     * any node, all nodes to the right of the first wildcard must also be wildcards.
     * </p>
     * </note>
     * 
     * @param listComponentBuildVersionsRequest
     * @return Result of the ListComponentBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListComponentBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponentBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListComponentBuildVersionsResult listComponentBuildVersions(ListComponentBuildVersionsRequest listComponentBuildVersionsRequest);

    /**
     * <p>
     * Returns the list of components that can be filtered by name, or by using the listed <code>filters</code> to
     * streamline results. Newly created components can take up to two minutes to appear in the ListComponents API
     * Results.
     * </p>
     * <note>
     * <p>
     * The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign
     * values for the first three, and can filter on all of them.
     * </p>
     * <p>
     * <b>Filtering:</b> With semantic versioning, you have the flexibility to use wildcards (x) to specify the most
     * recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in
     * any node, all nodes to the right of the first wildcard must also be wildcards.
     * </p>
     * </note>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Returns a list of container recipes.
     * </p>
     * 
     * @param listContainerRecipesRequest
     * @return Result of the ListContainerRecipes operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListContainerRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListContainerRecipes"
     *      target="_top">AWS API Documentation</a>
     */
    ListContainerRecipesResult listContainerRecipes(ListContainerRecipesRequest listContainerRecipesRequest);

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @return Result of the ListDistributionConfigurations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListDistributionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListDistributionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributionConfigurationsResult listDistributionConfigurations(ListDistributionConfigurationsRequest listDistributionConfigurationsRequest);

    /**
     * <p>
     * Returns a list of image build versions.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @return Result of the ListImageBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListImageBuildVersionsResult listImageBuildVersions(ListImageBuildVersionsRequest listImageBuildVersionsRequest);

    /**
     * <p>
     * List the Packages that are associated with an Image Build Version, as determined by Amazon Web Services Systems
     * Manager Inventory at build time.
     * </p>
     * 
     * @param listImagePackagesRequest
     * @return Result of the ListImagePackages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePackages" target="_top">AWS
     *      API Documentation</a>
     */
    ListImagePackagesResult listImagePackages(ListImagePackagesRequest listImagePackagesRequest);

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @return Result of the ListImagePipelineImages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePipelineImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelineImages"
     *      target="_top">AWS API Documentation</a>
     */
    ListImagePipelineImagesResult listImagePipelineImages(ListImagePipelineImagesRequest listImagePipelineImagesRequest);

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @return Result of the ListImagePipelines operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    ListImagePipelinesResult listImagePipelines(ListImagePipelinesRequest listImagePipelinesRequest);

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @return Result of the ListImageRecipes operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageRecipes" target="_top">AWS
     *      API Documentation</a>
     */
    ListImageRecipesResult listImageRecipes(ListImageRecipesRequest listImageRecipesRequest);

    /**
     * <p>
     * Returns a list of image scan aggregations for your account. You can filter by the type of key that Image Builder
     * uses to group results. For example, if you want to get a list of findings by severity level for one of your
     * pipelines, you might specify your pipeline with the <code>imagePipelineArn</code> filter. If you don't specify a
     * filter, Image Builder returns an aggregation for your account.
     * </p>
     * <p>
     * To streamline results, you can use the following filters in your request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accountId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imageBuildVersionArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>imagePipelineArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vulnerabilityId</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listImageScanFindingAggregationsRequest
     * @return Result of the ListImageScanFindingAggregations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageScanFindingAggregations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageScanFindingAggregations"
     *      target="_top">AWS API Documentation</a>
     */
    ListImageScanFindingAggregationsResult listImageScanFindingAggregations(ListImageScanFindingAggregationsRequest listImageScanFindingAggregationsRequest);

    /**
     * <p>
     * Returns a list of image scan findings for your account.
     * </p>
     * 
     * @param listImageScanFindingsRequest
     * @return Result of the ListImageScanFindings operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageScanFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageScanFindings"
     *      target="_top">AWS API Documentation</a>
     */
    ListImageScanFindingsResult listImageScanFindings(ListImageScanFindingsRequest listImageScanFindingsRequest);

    /**
     * <p>
     * Returns the list of images that you have access to. Newly created images can take up to two minutes to appear in
     * the ListImages API Results.
     * </p>
     * 
     * @param listImagesRequest
     * @return Result of the ListImages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    ListImagesResult listImages(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @return Result of the ListInfrastructureConfigurations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListInfrastructureConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListInfrastructureConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListInfrastructureConfigurationsResult listInfrastructureConfigurations(ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest);

    /**
     * <p>
     * List resources that the runtime instance of the image lifecycle identified for lifecycle actions.
     * </p>
     * 
     * @param listLifecycleExecutionResourcesRequest
     * @return Result of the ListLifecycleExecutionResources operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListLifecycleExecutionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecycleExecutionResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListLifecycleExecutionResourcesResult listLifecycleExecutionResources(ListLifecycleExecutionResourcesRequest listLifecycleExecutionResourcesRequest);

    /**
     * <p>
     * Get the lifecycle runtime history for the specified resource.
     * </p>
     * 
     * @param listLifecycleExecutionsRequest
     * @return Result of the ListLifecycleExecutions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListLifecycleExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecycleExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListLifecycleExecutionsResult listLifecycleExecutions(ListLifecycleExecutionsRequest listLifecycleExecutionsRequest);

    /**
     * <p>
     * Get a list of lifecycle policies in your Amazon Web Services account.
     * </p>
     * 
     * @param listLifecyclePoliciesRequest
     * @return Result of the ListLifecyclePolicies operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListLifecyclePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecyclePolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListLifecyclePoliciesResult listLifecyclePolicies(ListLifecyclePoliciesRequest listLifecyclePoliciesRequest);

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Get a list of workflow steps that are waiting for action for workflows in your Amazon Web Services account.
     * </p>
     * 
     * @param listWaitingWorkflowStepsRequest
     * @return Result of the ListWaitingWorkflowSteps operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListWaitingWorkflowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWaitingWorkflowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    ListWaitingWorkflowStepsResult listWaitingWorkflowSteps(ListWaitingWorkflowStepsRequest listWaitingWorkflowStepsRequest);

    /**
     * <p>
     * Returns a list of build versions for a specific workflow resource.
     * </p>
     * 
     * @param listWorkflowBuildVersionsRequest
     * @return Result of the ListWorkflowBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListWorkflowBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflowBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkflowBuildVersionsResult listWorkflowBuildVersions(ListWorkflowBuildVersionsRequest listWorkflowBuildVersionsRequest);

    /**
     * <p>
     * Returns a list of workflow runtime instance metadata objects for a specific image build version.
     * </p>
     * 
     * @param listWorkflowExecutionsRequest
     * @return Result of the ListWorkflowExecutions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkflowExecutionsResult listWorkflowExecutions(ListWorkflowExecutionsRequest listWorkflowExecutionsRequest);

    /**
     * <p>
     * Returns runtime data for each step in a runtime instance of the workflow that you specify in the request.
     * </p>
     * 
     * @param listWorkflowStepExecutionsRequest
     * @return Result of the ListWorkflowStepExecutions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListWorkflowStepExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflowStepExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkflowStepExecutionsResult listWorkflowStepExecutions(ListWorkflowStepExecutionsRequest listWorkflowStepExecutionsRequest);

    /**
     * <p>
     * Lists workflow build versions based on filtering parameters.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Applies a policy to a component. We recommend that you call the RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a>
     * to share resources. If you call the Image Builder API <code>PutComponentPolicy</code>, you must also call the RAM
     * API <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html">
     * PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be visible to all principals with whom the
     * resource is shared.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @return Result of the PutComponentPolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutComponentPolicyResult putComponentPolicy(PutComponentPolicyRequest putComponentPolicyRequest);

    /**
     * <p>
     * Applies a policy to a container image. We recommend that you call the RAM API CreateResourceShare
     * (https://docs.aws.amazon.com//ram/latest/APIReference/API_CreateResourceShare.html) to share resources. If you
     * call the Image Builder API <code>PutContainerImagePolicy</code>, you must also call the RAM API
     * PromoteResourceShareCreatedFromPolicy
     * (https://docs.aws.amazon.com//ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html) in order
     * for the resource to be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putContainerRecipePolicyRequest
     * @return Result of the PutContainerRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutContainerRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutContainerRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutContainerRecipePolicyResult putContainerRecipePolicy(PutContainerRecipePolicyRequest putContainerRecipePolicyRequest);

    /**
     * <p>
     * Applies a policy to an image. We recommend that you call the RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a>
     * to share resources. If you call the Image Builder API <code>PutImagePolicy</code>, you must also call the RAM API
     * <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html">
     * PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be visible to all principals with whom the
     * resource is shared.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @return Result of the PutImagePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutImagePolicyResult putImagePolicy(PutImagePolicyRequest putImagePolicyRequest);

    /**
     * <p>
     * Applies a policy to an image recipe. We recommend that you call the RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a>
     * to share resources. If you call the Image Builder API <code>PutImageRecipePolicy</code>, you must also call the
     * RAM API <a
     * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be visible to all principals with whom
     * the resource is shared.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @return Result of the PutImageRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutImageRecipePolicyResult putImageRecipePolicy(PutImageRecipePolicyRequest putImageRecipePolicyRequest);

    /**
     * <p>
     * Pauses or resumes image creation when the associated workflow runs a <code>WaitForAction</code> step.
     * </p>
     * 
     * @param sendWorkflowStepActionRequest
     * @return Result of the SendWorkflowStepAction operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.SendWorkflowStepAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/SendWorkflowStepAction"
     *      target="_top">AWS API Documentation</a>
     */
    SendWorkflowStepActionResult sendWorkflowStepAction(SendWorkflowStepActionRequest sendWorkflowStepActionRequest);

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @return Result of the StartImagePipelineExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.StartImagePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartImagePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StartImagePipelineExecutionResult startImagePipelineExecution(StartImagePipelineExecutionRequest startImagePipelineExecutionRequest);

    /**
     * <p>
     * Begin asynchronous resource state update for lifecycle changes to the specified image resources.
     * </p>
     * 
     * @param startResourceStateUpdateRequest
     * @return Result of the StartResourceStateUpdate operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.StartResourceStateUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartResourceStateUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    StartResourceStateUpdateResult startResourceStateUpdate(StartResourceStateUpdateRequest startResourceStateUpdateRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @return Result of the UpdateDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.UpdateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDistributionConfigurationResult updateDistributionConfiguration(UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest);

    /**
     * <p>
     * Updates an image pipeline. Image pipelines enable you to automate the creation and distribution of images. You
     * must specify exactly one recipe for your image, using either a <code>containerRecipeArn</code> or an
     * <code>imageRecipeArn</code>.
     * </p>
     * <note>
     * <p>
     * UpdateImagePipeline does not support selective updates for the pipeline. You must specify all of the required
     * properties in the update request, not just the properties that have changed.
     * </p>
     * </note>
     * 
     * @param updateImagePipelineRequest
     * @return Result of the UpdateImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.UpdateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateImagePipelineResult updateImagePipeline(UpdateImagePipelineRequest updateImagePipelineRequest);

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @return Result of the UpdateInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.UpdateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInfrastructureConfigurationResult updateInfrastructureConfiguration(UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest);

    /**
     * <p>
     * Update the specified lifecycle policy.
     * </p>
     * 
     * @param updateLifecyclePolicyRequest
     * @return Result of the UpdateLifecyclePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have requested an action that that the service doesn't support.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.UpdateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLifecyclePolicyResult updateLifecyclePolicy(UpdateLifecyclePolicyRequest updateLifecyclePolicyRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
