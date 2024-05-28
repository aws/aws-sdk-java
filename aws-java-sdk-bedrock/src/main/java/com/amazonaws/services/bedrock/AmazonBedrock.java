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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrock.model.*;

/**
 * Interface for accessing Amazon Bedrock.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrock.AbstractAmazonBedrock} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for creating, managing, fine-turning, and evaluating Amazon Bedrock models.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonBedrock {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock";

    /**
     * <p>
     * API operation for creating and managing Amazon Bedrock automatic model evaluation jobs and model evaluation jobs
     * that use human workers. To learn more about the requirements for creating a model evaluation job see, <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation.html">Model evaluations</a>.
     * </p>
     * 
     * @param createEvaluationJobRequest
     * @return Result of the CreateEvaluationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateEvaluationJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEvaluationJobResult createEvaluationJob(CreateEvaluationJobRequest createEvaluationJobRequest);

    /**
     * <p>
     * Creates a guardrail to block topics and to filter out harmful content.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a <code>name</code> and optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify messages for when the guardrail successfully blocks a prompt or a model response in the
     * <code>blockedInputMessaging</code> and <code>blockedOutputsMessaging</code> fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify topics for the guardrail to deny in the <code>topicPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailTopicConfig.html"
     * >GuardrailTopicConfig</a> object in the <code>topicsConfig</code> list pertains to one topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Give a <code>name</code> and <code>description</code> so that the guardrail can properly identify the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>DENY</code> in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Provide up to five prompts that you would categorize as belonging to the topic in the
     * <code>examples</code> list.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Specify filter strengths for the harmful categories defined in Amazon Bedrock in the
     * <code>contentPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a> object in the <code>filtersConfig</code> list pertains to a harmful category.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails-filters">Content filters</a>. For more
     * information about the fields in a content filter, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the category in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the strength of the filter for prompts in the <code>inputStrength</code> field and for model responses in
     * the <code>strength</code> field of the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * (Optional) For security, include the ARN of a KMS key in the <code>kmsKeyId</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Attach any tags to the guardrail in the <code>tags</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging">Tag resources</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGuardrailRequest
     * @return Result of the CreateGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGuardrailResult createGuardrail(CreateGuardrailRequest createGuardrailRequest);

    /**
     * <p>
     * Creates a version of the guardrail. Use this API to create a snapshot of the guardrail when you are satisfied
     * with a configuration, or to compare the configuration with another version.
     * </p>
     * 
     * @param createGuardrailVersionRequest
     * @return Result of the CreateGuardrailVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateGuardrailVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrailVersion" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGuardrailVersionResult createGuardrailVersion(CreateGuardrailVersionRequest createGuardrailVersionRequest);

    /**
     * <p>
     * Creates a fine-tuning job to customize a base model.
     * </p>
     * <p>
     * You specify the base foundation model and the location of the training data. After the model-customization job
     * completes successfully, your custom model resource will be ready to use. Amazon Bedrock returns validation loss
     * metrics and output generations after the job completes.
     * </p>
     * <p>
     * For information on the format of training and validation data, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-prepare.html">Prepare the
     * datasets</a>.
     * </p>
     * <p>
     * Model-customization jobs are asynchronous and the completion time depends on the base model and the
     * training/validation data size. To monitor a job, use the <code>GetModelCustomizationJob</code> operation to
     * retrieve the job status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param createModelCustomizationJobRequest
     * @return Result of the CreateModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateModelCustomizationJobResult createModelCustomizationJob(CreateModelCustomizationJobRequest createModelCustomizationJobRequest);

    /**
     * <p>
     * Creates dedicated throughput for a base or custom model with the model units and for the duration that you
     * specify. For pricing details, see <a href="http://aws.amazon.com/bedrock/pricing/">Amazon Bedrock Pricing</a>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createProvisionedModelThroughputRequest
     * @return Result of the CreateProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProvisionedModelThroughputResult createProvisionedModelThroughput(CreateProvisionedModelThroughputRequest createProvisionedModelThroughputRequest);

    /**
     * <p>
     * Deletes a custom model that you created earlier. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param deleteCustomModelRequest
     * @return Result of the DeleteCustomModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCustomModelResult deleteCustomModel(DeleteCustomModelRequest deleteCustomModelRequest);

    /**
     * <p>
     * Deletes a guardrail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a guardrail, only specify the ARN of the guardrail in the <code>guardrailIdentifier</code> field. If
     * you delete a guardrail, all of its versions will be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a version of a guardrail, specify the ARN of the guardrail in the <code>guardrailIdentifier</code>
     * field and the version in the <code>guardrailVersion</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteGuardrailRequest
     * @return Result of the DeleteGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGuardrailResult deleteGuardrail(DeleteGuardrailRequest deleteGuardrailRequest);

    /**
     * <p>
     * Delete the invocation logging.
     * </p>
     * 
     * @param deleteModelInvocationLoggingConfigurationRequest
     * @return Result of the DeleteModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteModelInvocationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteModelInvocationLoggingConfigurationResult deleteModelInvocationLoggingConfiguration(
            DeleteModelInvocationLoggingConfigurationRequest deleteModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Deletes a Provisioned Throughput. You can't delete a Provisioned Throughput before the commitment term is over.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param deleteProvisionedModelThroughputRequest
     * @return Result of the DeleteProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProvisionedModelThroughputResult deleteProvisionedModelThroughput(DeleteProvisionedModelThroughputRequest deleteProvisionedModelThroughputRequest);

    /**
     * <p>
     * Get the properties associated with a Amazon Bedrock custom model that you have created.For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param getCustomModelRequest
     * @return Result of the GetCustomModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    GetCustomModelResult getCustomModel(GetCustomModelRequest getCustomModelRequest);

    /**
     * <p>
     * Retrieves the properties associated with a model evaluation job, including the status of the job. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/latest/userguide/model-evaluation.html">Model
     * evaluations</a>.
     * </p>
     * 
     * @param getEvaluationJobRequest
     * @return Result of the GetEvaluationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetEvaluationJobResult getEvaluationJob(GetEvaluationJobRequest getEvaluationJobRequest);

    /**
     * <p>
     * Get details about a Amazon Bedrock foundation model.
     * </p>
     * 
     * @param getFoundationModelRequest
     * @return Result of the GetFoundationModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetFoundationModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetFoundationModel" target="_top">AWS API
     *      Documentation</a>
     */
    GetFoundationModelResult getFoundationModel(GetFoundationModelRequest getFoundationModelRequest);

    /**
     * <p>
     * Gets details about a guardrail. If you don't specify a version, the response returns details for the
     * <code>DRAFT</code> version.
     * </p>
     * 
     * @param getGuardrailRequest
     * @return Result of the GetGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    GetGuardrailResult getGuardrail(GetGuardrailRequest getGuardrailRequest);

    /**
     * <p>
     * Retrieves the properties associated with a model-customization job, including the status of the job. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getModelCustomizationJobRequest
     * @return Result of the GetModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetModelCustomizationJobResult getModelCustomizationJob(GetModelCustomizationJobRequest getModelCustomizationJobRequest);

    /**
     * <p>
     * Get the current configuration values for model invocation logging.
     * </p>
     * 
     * @param getModelInvocationLoggingConfigurationRequest
     * @return Result of the GetModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetModelInvocationLoggingConfigurationResult getModelInvocationLoggingConfiguration(
            GetModelInvocationLoggingConfigurationRequest getModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Returns details for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getProvisionedModelThroughputRequest
     * @return Result of the GetProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    GetProvisionedModelThroughputResult getProvisionedModelThroughput(GetProvisionedModelThroughputRequest getProvisionedModelThroughputRequest);

    /**
     * <p>
     * Returns a list of the custom models that you have created with the <code>CreateModelCustomizationJob</code>
     * operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param listCustomModelsRequest
     * @return Result of the ListCustomModels operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListCustomModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListCustomModels" target="_top">AWS API
     *      Documentation</a>
     */
    ListCustomModelsResult listCustomModels(ListCustomModelsRequest listCustomModelsRequest);

    /**
     * <p>
     * Lists model evaluation jobs.
     * </p>
     * 
     * @param listEvaluationJobsRequest
     * @return Result of the ListEvaluationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListEvaluationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListEvaluationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListEvaluationJobsResult listEvaluationJobs(ListEvaluationJobsRequest listEvaluationJobsRequest);

    /**
     * <p>
     * Lists Amazon Bedrock foundation models that you can use. You can filter the results with the request parameters.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/foundation-models.html">Foundation models</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFoundationModelsRequest
     * @return Result of the ListFoundationModels operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListFoundationModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListFoundationModelsResult listFoundationModels(ListFoundationModelsRequest listFoundationModelsRequest);

    /**
     * <p>
     * Lists details about all the guardrails in an account. To list the <code>DRAFT</code> version of all your
     * guardrails, don't specify the <code>guardrailIdentifier</code> field. To list all versions of a guardrail,
     * specify the ARN of the guardrail in the <code>guardrailIdentifier</code> field.
     * </p>
     * <p>
     * You can set the maximum number of results to return in a response in the <code>maxResults</code> field. If there
     * are more results than the number you set, the response returns a <code>nextToken</code> that you can send in
     * another <code>ListGuardrails</code> request to see the next batch of results.
     * </p>
     * 
     * @param listGuardrailsRequest
     * @return Result of the ListGuardrails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListGuardrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListGuardrails" target="_top">AWS API
     *      Documentation</a>
     */
    ListGuardrailsResult listGuardrails(ListGuardrailsRequest listGuardrailsRequest);

    /**
     * <p>
     * Returns a list of model customization jobs that you have submitted. You can filter the jobs to return based on
     * one or more criteria.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param listModelCustomizationJobsRequest
     * @return Result of the ListModelCustomizationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListModelCustomizationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListModelCustomizationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListModelCustomizationJobsResult listModelCustomizationJobs(ListModelCustomizationJobsRequest listModelCustomizationJobsRequest);

    /**
     * <p>
     * Lists the Provisioned Throughputs in the account. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listProvisionedModelThroughputsRequest
     * @return Result of the ListProvisionedModelThroughputs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListProvisionedModelThroughputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
     *      target="_top">AWS API Documentation</a>
     */
    ListProvisionedModelThroughputsResult listProvisionedModelThroughputs(ListProvisionedModelThroughputsRequest listProvisionedModelThroughputsRequest);

    /**
     * <p>
     * List the tags associated with the specified resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging
     * resources</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Set the configuration values for model invocation logging.
     * </p>
     * 
     * @param putModelInvocationLoggingConfigurationRequest
     * @return Result of the PutModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.PutModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/PutModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutModelInvocationLoggingConfigurationResult putModelInvocationLoggingConfiguration(
            PutModelInvocationLoggingConfigurationRequest putModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Stops an in progress model evaluation job.
     * </p>
     * 
     * @param stopEvaluationJobRequest
     * @return Result of the StopEvaluationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.StopEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopEvaluationJobResult stopEvaluationJob(StopEvaluationJobRequest stopEvaluationJobRequest);

    /**
     * <p>
     * Stops an active model customization job. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param stopModelCustomizationJobRequest
     * @return Result of the StopModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.StopModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopModelCustomizationJobResult stopModelCustomizationJob(StopModelCustomizationJobRequest stopModelCustomizationJobRequest);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove one or more tags from a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a guardrail with the values you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a <code>name</code> and optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify messages for when the guardrail successfully blocks a prompt or a model response in the
     * <code>blockedInputMessaging</code> and <code>blockedOutputsMessaging</code> fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify topics for the guardrail to deny in the <code>topicPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailTopicConfig.html"
     * >GuardrailTopicConfig</a> object in the <code>topicsConfig</code> list pertains to one topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Give a <code>name</code> and <code>description</code> so that the guardrail can properly identify the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>DENY</code> in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Provide up to five prompts that you would categorize as belonging to the topic in the
     * <code>examples</code> list.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Specify filter strengths for the harmful categories defined in Amazon Bedrock in the
     * <code>contentPolicyConfig</code> object. Each <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a> object in the <code>filtersConfig</code> list pertains to a harmful category.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails-filters">Content filters</a>. For more
     * information about the fields in a content filter, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the category in the <code>type</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the strength of the filter for prompts in the <code>inputStrength</code> field and for model responses in
     * the <code>strength</code> field of the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GuardrailContentFilterConfig.html"
     * >GuardrailContentFilterConfig</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * (Optional) For security, include the ARN of a KMS key in the <code>kmsKeyId</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Attach any tags to the guardrail in the <code>tags</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging">Tag resources</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGuardrailRequest
     * @return Result of the UpdateGuardrail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UpdateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGuardrailResult updateGuardrail(UpdateGuardrailRequest updateGuardrailRequest);

    /**
     * <p>
     * Updates the name or associated model for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateProvisionedModelThroughputRequest
     * @return Result of the UpdateProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UpdateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProvisionedModelThroughputResult updateProvisionedModelThroughput(UpdateProvisionedModelThroughputRequest updateProvisionedModelThroughputRequest);

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
