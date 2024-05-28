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

/**
 * Interface for accessing Amazon Bedrock asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrock.AbstractAmazonBedrockAsync} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for creating, managing, fine-turning, and evaluating Amazon Bedrock models.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonBedrockAsync extends AmazonBedrock {

    /**
     * <p>
     * API operation for creating and managing Amazon Bedrock automatic model evaluation jobs and model evaluation jobs
     * that use human workers. To learn more about the requirements for creating a model evaluation job see, <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation.html">Model evaluations</a>.
     * </p>
     * 
     * @param createEvaluationJobRequest
     * @return A Java Future containing the result of the CreateEvaluationJob operation returned by the service.
     * @sample AmazonBedrockAsync.CreateEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateEvaluationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEvaluationJobResult> createEvaluationJobAsync(CreateEvaluationJobRequest createEvaluationJobRequest);

    /**
     * <p>
     * API operation for creating and managing Amazon Bedrock automatic model evaluation jobs and model evaluation jobs
     * that use human workers. To learn more about the requirements for creating a model evaluation job see, <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation.html">Model evaluations</a>.
     * </p>
     * 
     * @param createEvaluationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEvaluationJob operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.CreateEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateEvaluationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEvaluationJobResult> createEvaluationJobAsync(CreateEvaluationJobRequest createEvaluationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEvaluationJobRequest, CreateEvaluationJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateGuardrail operation returned by the service.
     * @sample AmazonBedrockAsync.CreateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGuardrailResult> createGuardrailAsync(CreateGuardrailRequest createGuardrailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGuardrail operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.CreateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGuardrailResult> createGuardrailAsync(CreateGuardrailRequest createGuardrailRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGuardrailRequest, CreateGuardrailResult> asyncHandler);

    /**
     * <p>
     * Creates a version of the guardrail. Use this API to create a snapshot of the guardrail when you are satisfied
     * with a configuration, or to compare the configuration with another version.
     * </p>
     * 
     * @param createGuardrailVersionRequest
     * @return A Java Future containing the result of the CreateGuardrailVersion operation returned by the service.
     * @sample AmazonBedrockAsync.CreateGuardrailVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrailVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGuardrailVersionResult> createGuardrailVersionAsync(CreateGuardrailVersionRequest createGuardrailVersionRequest);

    /**
     * <p>
     * Creates a version of the guardrail. Use this API to create a snapshot of the guardrail when you are satisfied
     * with a configuration, or to compare the configuration with another version.
     * </p>
     * 
     * @param createGuardrailVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGuardrailVersion operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.CreateGuardrailVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateGuardrailVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGuardrailVersionResult> createGuardrailVersionAsync(CreateGuardrailVersionRequest createGuardrailVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGuardrailVersionRequest, CreateGuardrailVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateModelCustomizationJob operation returned by the service.
     * @sample AmazonBedrockAsync.CreateModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelCustomizationJobResult> createModelCustomizationJobAsync(
            CreateModelCustomizationJobRequest createModelCustomizationJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelCustomizationJob operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.CreateModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelCustomizationJobResult> createModelCustomizationJobAsync(
            CreateModelCustomizationJobRequest createModelCustomizationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelCustomizationJobRequest, CreateModelCustomizationJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsync.CreateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProvisionedModelThroughputResult> createProvisionedModelThroughputAsync(
            CreateProvisionedModelThroughputRequest createProvisionedModelThroughputRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsyncHandler.CreateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProvisionedModelThroughputResult> createProvisionedModelThroughputAsync(
            CreateProvisionedModelThroughputRequest createProvisionedModelThroughputRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProvisionedModelThroughputRequest, CreateProvisionedModelThroughputResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom model that you created earlier. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param deleteCustomModelRequest
     * @return A Java Future containing the result of the DeleteCustomModel operation returned by the service.
     * @sample AmazonBedrockAsync.DeleteCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomModelResult> deleteCustomModelAsync(DeleteCustomModelRequest deleteCustomModelRequest);

    /**
     * <p>
     * Deletes a custom model that you created earlier. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param deleteCustomModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomModel operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.DeleteCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomModelResult> deleteCustomModelAsync(DeleteCustomModelRequest deleteCustomModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomModelRequest, DeleteCustomModelResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteGuardrail operation returned by the service.
     * @sample AmazonBedrockAsync.DeleteGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGuardrailResult> deleteGuardrailAsync(DeleteGuardrailRequest deleteGuardrailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGuardrail operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.DeleteGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGuardrailResult> deleteGuardrailAsync(DeleteGuardrailRequest deleteGuardrailRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGuardrailRequest, DeleteGuardrailResult> asyncHandler);

    /**
     * <p>
     * Delete the invocation logging.
     * </p>
     * 
     * @param deleteModelInvocationLoggingConfigurationRequest
     * @return A Java Future containing the result of the DeleteModelInvocationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonBedrockAsync.DeleteModelInvocationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelInvocationLoggingConfigurationResult> deleteModelInvocationLoggingConfigurationAsync(
            DeleteModelInvocationLoggingConfigurationRequest deleteModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Delete the invocation logging.
     * </p>
     * 
     * @param deleteModelInvocationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelInvocationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonBedrockAsyncHandler.DeleteModelInvocationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelInvocationLoggingConfigurationResult> deleteModelInvocationLoggingConfigurationAsync(
            DeleteModelInvocationLoggingConfigurationRequest deleteModelInvocationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelInvocationLoggingConfigurationRequest, DeleteModelInvocationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a Provisioned Throughput. You can't delete a Provisioned Throughput before the commitment term is over.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param deleteProvisionedModelThroughputRequest
     * @return A Java Future containing the result of the DeleteProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsync.DeleteProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisionedModelThroughputResult> deleteProvisionedModelThroughputAsync(
            DeleteProvisionedModelThroughputRequest deleteProvisionedModelThroughputRequest);

    /**
     * <p>
     * Deletes a Provisioned Throughput. You can't delete a Provisioned Throughput before the commitment term is over.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param deleteProvisionedModelThroughputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsyncHandler.DeleteProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisionedModelThroughputResult> deleteProvisionedModelThroughputAsync(
            DeleteProvisionedModelThroughputRequest deleteProvisionedModelThroughputRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisionedModelThroughputRequest, DeleteProvisionedModelThroughputResult> asyncHandler);

    /**
     * <p>
     * Get the properties associated with a Amazon Bedrock custom model that you have created.For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param getCustomModelRequest
     * @return A Java Future containing the result of the GetCustomModel operation returned by the service.
     * @sample AmazonBedrockAsync.GetCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCustomModelResult> getCustomModelAsync(GetCustomModelRequest getCustomModelRequest);

    /**
     * <p>
     * Get the properties associated with a Amazon Bedrock custom model that you have created.For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param getCustomModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCustomModel operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.GetCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCustomModelResult> getCustomModelAsync(GetCustomModelRequest getCustomModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetCustomModelRequest, GetCustomModelResult> asyncHandler);

    /**
     * <p>
     * Retrieves the properties associated with a model evaluation job, including the status of the job. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/latest/userguide/model-evaluation.html">Model
     * evaluations</a>.
     * </p>
     * 
     * @param getEvaluationJobRequest
     * @return A Java Future containing the result of the GetEvaluationJob operation returned by the service.
     * @sample AmazonBedrockAsync.GetEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEvaluationJobResult> getEvaluationJobAsync(GetEvaluationJobRequest getEvaluationJobRequest);

    /**
     * <p>
     * Retrieves the properties associated with a model evaluation job, including the status of the job. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/latest/userguide/model-evaluation.html">Model
     * evaluations</a>.
     * </p>
     * 
     * @param getEvaluationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvaluationJob operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.GetEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEvaluationJobResult> getEvaluationJobAsync(GetEvaluationJobRequest getEvaluationJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvaluationJobRequest, GetEvaluationJobResult> asyncHandler);

    /**
     * <p>
     * Get details about a Amazon Bedrock foundation model.
     * </p>
     * 
     * @param getFoundationModelRequest
     * @return A Java Future containing the result of the GetFoundationModel operation returned by the service.
     * @sample AmazonBedrockAsync.GetFoundationModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetFoundationModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFoundationModelResult> getFoundationModelAsync(GetFoundationModelRequest getFoundationModelRequest);

    /**
     * <p>
     * Get details about a Amazon Bedrock foundation model.
     * </p>
     * 
     * @param getFoundationModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFoundationModel operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.GetFoundationModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetFoundationModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFoundationModelResult> getFoundationModelAsync(GetFoundationModelRequest getFoundationModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetFoundationModelRequest, GetFoundationModelResult> asyncHandler);

    /**
     * <p>
     * Gets details about a guardrail. If you don't specify a version, the response returns details for the
     * <code>DRAFT</code> version.
     * </p>
     * 
     * @param getGuardrailRequest
     * @return A Java Future containing the result of the GetGuardrail operation returned by the service.
     * @sample AmazonBedrockAsync.GetGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGuardrailResult> getGuardrailAsync(GetGuardrailRequest getGuardrailRequest);

    /**
     * <p>
     * Gets details about a guardrail. If you don't specify a version, the response returns details for the
     * <code>DRAFT</code> version.
     * </p>
     * 
     * @param getGuardrailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGuardrail operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.GetGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGuardrailResult> getGuardrailAsync(GetGuardrailRequest getGuardrailRequest,
            com.amazonaws.handlers.AsyncHandler<GetGuardrailRequest, GetGuardrailResult> asyncHandler);

    /**
     * <p>
     * Retrieves the properties associated with a model-customization job, including the status of the job. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getModelCustomizationJobRequest
     * @return A Java Future containing the result of the GetModelCustomizationJob operation returned by the service.
     * @sample AmazonBedrockAsync.GetModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetModelCustomizationJobResult> getModelCustomizationJobAsync(GetModelCustomizationJobRequest getModelCustomizationJobRequest);

    /**
     * <p>
     * Retrieves the properties associated with a model-customization job, including the status of the job. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getModelCustomizationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelCustomizationJob operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.GetModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetModelCustomizationJobResult> getModelCustomizationJobAsync(GetModelCustomizationJobRequest getModelCustomizationJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelCustomizationJobRequest, GetModelCustomizationJobResult> asyncHandler);

    /**
     * <p>
     * Get the current configuration values for model invocation logging.
     * </p>
     * 
     * @param getModelInvocationLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetModelInvocationLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonBedrockAsync.GetModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetModelInvocationLoggingConfigurationResult> getModelInvocationLoggingConfigurationAsync(
            GetModelInvocationLoggingConfigurationRequest getModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Get the current configuration values for model invocation logging.
     * </p>
     * 
     * @param getModelInvocationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelInvocationLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonBedrockAsyncHandler.GetModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetModelInvocationLoggingConfigurationResult> getModelInvocationLoggingConfigurationAsync(
            GetModelInvocationLoggingConfigurationRequest getModelInvocationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelInvocationLoggingConfigurationRequest, GetModelInvocationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns details for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getProvisionedModelThroughputRequest
     * @return A Java Future containing the result of the GetProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsync.GetProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProvisionedModelThroughputResult> getProvisionedModelThroughputAsync(
            GetProvisionedModelThroughputRequest getProvisionedModelThroughputRequest);

    /**
     * <p>
     * Returns details for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getProvisionedModelThroughputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsyncHandler.GetProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProvisionedModelThroughputResult> getProvisionedModelThroughputAsync(
            GetProvisionedModelThroughputRequest getProvisionedModelThroughputRequest,
            com.amazonaws.handlers.AsyncHandler<GetProvisionedModelThroughputRequest, GetProvisionedModelThroughputResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListCustomModels operation returned by the service.
     * @sample AmazonBedrockAsync.ListCustomModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListCustomModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCustomModelsResult> listCustomModelsAsync(ListCustomModelsRequest listCustomModelsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomModels operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.ListCustomModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListCustomModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCustomModelsResult> listCustomModelsAsync(ListCustomModelsRequest listCustomModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomModelsRequest, ListCustomModelsResult> asyncHandler);

    /**
     * <p>
     * Lists model evaluation jobs.
     * </p>
     * 
     * @param listEvaluationJobsRequest
     * @return A Java Future containing the result of the ListEvaluationJobs operation returned by the service.
     * @sample AmazonBedrockAsync.ListEvaluationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListEvaluationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEvaluationJobsResult> listEvaluationJobsAsync(ListEvaluationJobsRequest listEvaluationJobsRequest);

    /**
     * <p>
     * Lists model evaluation jobs.
     * </p>
     * 
     * @param listEvaluationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEvaluationJobs operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.ListEvaluationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListEvaluationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEvaluationJobsResult> listEvaluationJobsAsync(ListEvaluationJobsRequest listEvaluationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEvaluationJobsRequest, ListEvaluationJobsResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon Bedrock foundation models that you can use. You can filter the results with the request parameters.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/foundation-models.html">Foundation models</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFoundationModelsRequest
     * @return A Java Future containing the result of the ListFoundationModels operation returned by the service.
     * @sample AmazonBedrockAsync.ListFoundationModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFoundationModelsResult> listFoundationModelsAsync(ListFoundationModelsRequest listFoundationModelsRequest);

    /**
     * <p>
     * Lists Amazon Bedrock foundation models that you can use. You can filter the results with the request parameters.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/foundation-models.html">Foundation models</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFoundationModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFoundationModels operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.ListFoundationModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFoundationModelsResult> listFoundationModelsAsync(ListFoundationModelsRequest listFoundationModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFoundationModelsRequest, ListFoundationModelsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListGuardrails operation returned by the service.
     * @sample AmazonBedrockAsync.ListGuardrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListGuardrails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGuardrailsResult> listGuardrailsAsync(ListGuardrailsRequest listGuardrailsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGuardrails operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.ListGuardrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListGuardrails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGuardrailsResult> listGuardrailsAsync(ListGuardrailsRequest listGuardrailsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGuardrailsRequest, ListGuardrailsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListModelCustomizationJobs operation returned by the service.
     * @sample AmazonBedrockAsync.ListModelCustomizationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListModelCustomizationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelCustomizationJobsResult> listModelCustomizationJobsAsync(
            ListModelCustomizationJobsRequest listModelCustomizationJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelCustomizationJobs operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.ListModelCustomizationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListModelCustomizationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelCustomizationJobsResult> listModelCustomizationJobsAsync(
            ListModelCustomizationJobsRequest listModelCustomizationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelCustomizationJobsRequest, ListModelCustomizationJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the Provisioned Throughputs in the account. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listProvisionedModelThroughputsRequest
     * @return A Java Future containing the result of the ListProvisionedModelThroughputs operation returned by the
     *         service.
     * @sample AmazonBedrockAsync.ListProvisionedModelThroughputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisionedModelThroughputsResult> listProvisionedModelThroughputsAsync(
            ListProvisionedModelThroughputsRequest listProvisionedModelThroughputsRequest);

    /**
     * <p>
     * Lists the Provisioned Throughputs in the account. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listProvisionedModelThroughputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisionedModelThroughputs operation returned by the
     *         service.
     * @sample AmazonBedrockAsyncHandler.ListProvisionedModelThroughputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisionedModelThroughputsResult> listProvisionedModelThroughputsAsync(
            ListProvisionedModelThroughputsRequest listProvisionedModelThroughputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedModelThroughputsRequest, ListProvisionedModelThroughputsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonBedrockAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Set the configuration values for model invocation logging.
     * </p>
     * 
     * @param putModelInvocationLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutModelInvocationLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonBedrockAsync.PutModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/PutModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutModelInvocationLoggingConfigurationResult> putModelInvocationLoggingConfigurationAsync(
            PutModelInvocationLoggingConfigurationRequest putModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Set the configuration values for model invocation logging.
     * </p>
     * 
     * @param putModelInvocationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutModelInvocationLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonBedrockAsyncHandler.PutModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/PutModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutModelInvocationLoggingConfigurationResult> putModelInvocationLoggingConfigurationAsync(
            PutModelInvocationLoggingConfigurationRequest putModelInvocationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutModelInvocationLoggingConfigurationRequest, PutModelInvocationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Stops an in progress model evaluation job.
     * </p>
     * 
     * @param stopEvaluationJobRequest
     * @return A Java Future containing the result of the StopEvaluationJob operation returned by the service.
     * @sample AmazonBedrockAsync.StopEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopEvaluationJobResult> stopEvaluationJobAsync(StopEvaluationJobRequest stopEvaluationJobRequest);

    /**
     * <p>
     * Stops an in progress model evaluation job.
     * </p>
     * 
     * @param stopEvaluationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopEvaluationJob operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.StopEvaluationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopEvaluationJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopEvaluationJobResult> stopEvaluationJobAsync(StopEvaluationJobRequest stopEvaluationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopEvaluationJobRequest, StopEvaluationJobResult> asyncHandler);

    /**
     * <p>
     * Stops an active model customization job. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param stopModelCustomizationJobRequest
     * @return A Java Future containing the result of the StopModelCustomizationJob operation returned by the service.
     * @sample AmazonBedrockAsync.StopModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopModelCustomizationJobResult> stopModelCustomizationJobAsync(
            StopModelCustomizationJobRequest stopModelCustomizationJobRequest);

    /**
     * <p>
     * Stops an active model customization job. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param stopModelCustomizationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopModelCustomizationJob operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.StopModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopModelCustomizationJobResult> stopModelCustomizationJobAsync(
            StopModelCustomizationJobRequest stopModelCustomizationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopModelCustomizationJobRequest, StopModelCustomizationJobResult> asyncHandler);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonBedrockAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags from a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonBedrockAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove one or more tags from a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateGuardrail operation returned by the service.
     * @sample AmazonBedrockAsync.UpdateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGuardrailResult> updateGuardrailAsync(UpdateGuardrailRequest updateGuardrailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGuardrail operation returned by the service.
     * @sample AmazonBedrockAsyncHandler.UpdateGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateGuardrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGuardrailResult> updateGuardrailAsync(UpdateGuardrailRequest updateGuardrailRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGuardrailRequest, UpdateGuardrailResult> asyncHandler);

    /**
     * <p>
     * Updates the name or associated model for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateProvisionedModelThroughputRequest
     * @return A Java Future containing the result of the UpdateProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsync.UpdateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProvisionedModelThroughputResult> updateProvisionedModelThroughputAsync(
            UpdateProvisionedModelThroughputRequest updateProvisionedModelThroughputRequest);

    /**
     * <p>
     * Updates the name or associated model for a Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateProvisionedModelThroughputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProvisionedModelThroughput operation returned by the
     *         service.
     * @sample AmazonBedrockAsyncHandler.UpdateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProvisionedModelThroughputResult> updateProvisionedModelThroughputAsync(
            UpdateProvisionedModelThroughputRequest updateProvisionedModelThroughputRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisionedModelThroughputRequest, UpdateProvisionedModelThroughputResult> asyncHandler);

}
