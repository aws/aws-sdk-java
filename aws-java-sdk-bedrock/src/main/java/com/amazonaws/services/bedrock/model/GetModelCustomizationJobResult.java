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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelCustomizationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetModelCustomizationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customization job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The name of the customization job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The name of the output model.
     * </p>
     */
    private String outputModelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the output model.
     * </p>
     */
    private String outputModelArn;
    /**
     * <p>
     * The token that you specified in the <code>CreateCustomizationJob</code> request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the job. A successful job transitions from in-progress to completed when the output model is ready
     * to use. If the job failed, the failure message contains information about why the job failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about why the job failed.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * Time that the resource was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time that the resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Time that the resource transitioned to terminal state.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     */
    private String baseModelArn;
    /**
     * <p>
     * The hyperparameter values for the job. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * Contains information about the training dataset.
     * </p>
     */
    private TrainingDataConfig trainingDataConfig;
    /**
     * <p>
     * Contains information about the validation dataset.
     * </p>
     */
    private ValidationDataConfig validationDataConfig;
    /**
     * <p>
     * Output data configuration
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The type of model customization.
     * </p>
     */
    private String customizationType;
    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     */
    private String outputModelKmsKeyArn;
    /**
     * <p>
     * Contains training metrics from the job creation.
     * </p>
     */
    private TrainingMetrics trainingMetrics;
    /**
     * <p>
     * The loss metric for each validator that you provided in the createjob request.
     * </p>
     */
    private java.util.List<ValidatorMetric> validationMetrics;
    /**
     * <p>
     * VPC configuration for the custom model job.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customization job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the customization job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customization job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customization job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customization job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the customization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The name of the customization job.
     * </p>
     * 
     * @param jobName
     *        The name of the customization job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the customization job.
     * </p>
     * 
     * @return The name of the customization job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the customization job.
     * </p>
     * 
     * @param jobName
     *        The name of the customization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The name of the output model.
     * </p>
     * 
     * @param outputModelName
     *        The name of the output model.
     */

    public void setOutputModelName(String outputModelName) {
        this.outputModelName = outputModelName;
    }

    /**
     * <p>
     * The name of the output model.
     * </p>
     * 
     * @return The name of the output model.
     */

    public String getOutputModelName() {
        return this.outputModelName;
    }

    /**
     * <p>
     * The name of the output model.
     * </p>
     * 
     * @param outputModelName
     *        The name of the output model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withOutputModelName(String outputModelName) {
        setOutputModelName(outputModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the output model.
     * </p>
     * 
     * @param outputModelArn
     *        The Amazon Resource Name (ARN) of the output model.
     */

    public void setOutputModelArn(String outputModelArn) {
        this.outputModelArn = outputModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the output model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the output model.
     */

    public String getOutputModelArn() {
        return this.outputModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the output model.
     * </p>
     * 
     * @param outputModelArn
     *        The Amazon Resource Name (ARN) of the output model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withOutputModelArn(String outputModelArn) {
        setOutputModelArn(outputModelArn);
        return this;
    }

    /**
     * <p>
     * The token that you specified in the <code>CreateCustomizationJob</code> request.
     * </p>
     * 
     * @param clientRequestToken
     *        The token that you specified in the <code>CreateCustomizationJob</code> request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The token that you specified in the <code>CreateCustomizationJob</code> request.
     * </p>
     * 
     * @return The token that you specified in the <code>CreateCustomizationJob</code> request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The token that you specified in the <code>CreateCustomizationJob</code> request.
     * </p>
     * 
     * @param clientRequestToken
     *        The token that you specified in the <code>CreateCustomizationJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the job. A successful job transitions from in-progress to completed when the output model is ready
     * to use. If the job failed, the failure message contains information about why the job failed.
     * </p>
     * 
     * @param status
     *        The status of the job. A successful job transitions from in-progress to completed when the output model is
     *        ready to use. If the job failed, the failure message contains information about why the job failed.
     * @see ModelCustomizationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job. A successful job transitions from in-progress to completed when the output model is ready
     * to use. If the job failed, the failure message contains information about why the job failed.
     * </p>
     * 
     * @return The status of the job. A successful job transitions from in-progress to completed when the output model
     *         is ready to use. If the job failed, the failure message contains information about why the job failed.
     * @see ModelCustomizationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job. A successful job transitions from in-progress to completed when the output model is ready
     * to use. If the job failed, the failure message contains information about why the job failed.
     * </p>
     * 
     * @param status
     *        The status of the job. A successful job transitions from in-progress to completed when the output model is
     *        ready to use. If the job failed, the failure message contains information about why the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomizationJobStatus
     */

    public GetModelCustomizationJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job. A successful job transitions from in-progress to completed when the output model is ready
     * to use. If the job failed, the failure message contains information about why the job failed.
     * </p>
     * 
     * @param status
     *        The status of the job. A successful job transitions from in-progress to completed when the output model is
     *        ready to use. If the job failed, the failure message contains information about why the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomizationJobStatus
     */

    public GetModelCustomizationJobResult withStatus(ModelCustomizationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about why the job failed.
     * </p>
     * 
     * @param failureMessage
     *        Information about why the job failed.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * Information about why the job failed.
     * </p>
     * 
     * @return Information about why the job failed.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * Information about why the job failed.
     * </p>
     * 
     * @param failureMessage
     *        Information about why the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Time that the resource was created.
     * </p>
     * 
     * @param creationTime
     *        Time that the resource was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time that the resource was created.
     * </p>
     * 
     * @return Time that the resource was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time that the resource was created.
     * </p>
     * 
     * @param creationTime
     *        Time that the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time that the resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Time that the resource was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Time that the resource was last modified.
     * </p>
     * 
     * @return Time that the resource was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Time that the resource was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Time that the resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Time that the resource transitioned to terminal state.
     * </p>
     * 
     * @param endTime
     *        Time that the resource transitioned to terminal state.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time that the resource transitioned to terminal state.
     * </p>
     * 
     * @return Time that the resource transitioned to terminal state.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time that the resource transitioned to terminal state.
     * </p>
     * 
     * @param endTime
     *        Time that the resource transitioned to terminal state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     * 
     * @param baseModelArn
     *        Amazon Resource Name (ARN) of the base model.
     */

    public void setBaseModelArn(String baseModelArn) {
        this.baseModelArn = baseModelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the base model.
     */

    public String getBaseModelArn() {
        return this.baseModelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     * 
     * @param baseModelArn
     *        Amazon Resource Name (ARN) of the base model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withBaseModelArn(String baseModelArn) {
        setBaseModelArn(baseModelArn);
        return this;
    }

    /**
     * <p>
     * The hyperparameter values for the job. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @return The hyperparameter values for the job. For details on the format for different models, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *         hyperparameters</a>.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * The hyperparameter values for the job. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @param hyperParameters
     *        The hyperparameter values for the job. For details on the format for different models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *        hyperparameters</a>.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * The hyperparameter values for the job. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @param hyperParameters
     *        The hyperparameter values for the job. For details on the format for different models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *        hyperparameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    /**
     * Add a single HyperParameters entry
     *
     * @see GetModelCustomizationJobResult#withHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Contains information about the training dataset.
     * </p>
     * 
     * @param trainingDataConfig
     *        Contains information about the training dataset.
     */

    public void setTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
        this.trainingDataConfig = trainingDataConfig;
    }

    /**
     * <p>
     * Contains information about the training dataset.
     * </p>
     * 
     * @return Contains information about the training dataset.
     */

    public TrainingDataConfig getTrainingDataConfig() {
        return this.trainingDataConfig;
    }

    /**
     * <p>
     * Contains information about the training dataset.
     * </p>
     * 
     * @param trainingDataConfig
     *        Contains information about the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
        setTrainingDataConfig(trainingDataConfig);
        return this;
    }

    /**
     * <p>
     * Contains information about the validation dataset.
     * </p>
     * 
     * @param validationDataConfig
     *        Contains information about the validation dataset.
     */

    public void setValidationDataConfig(ValidationDataConfig validationDataConfig) {
        this.validationDataConfig = validationDataConfig;
    }

    /**
     * <p>
     * Contains information about the validation dataset.
     * </p>
     * 
     * @return Contains information about the validation dataset.
     */

    public ValidationDataConfig getValidationDataConfig() {
        return this.validationDataConfig;
    }

    /**
     * <p>
     * Contains information about the validation dataset.
     * </p>
     * 
     * @param validationDataConfig
     *        Contains information about the validation dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withValidationDataConfig(ValidationDataConfig validationDataConfig) {
        setValidationDataConfig(validationDataConfig);
        return this;
    }

    /**
     * <p>
     * Output data configuration
     * </p>
     * 
     * @param outputDataConfig
     *        Output data configuration
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Output data configuration
     * </p>
     * 
     * @return Output data configuration
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Output data configuration
     * </p>
     * 
     * @param outputDataConfig
     *        Output data configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The type of model customization.
     * </p>
     * 
     * @param customizationType
     *        The type of model customization.
     * @see CustomizationType
     */

    public void setCustomizationType(String customizationType) {
        this.customizationType = customizationType;
    }

    /**
     * <p>
     * The type of model customization.
     * </p>
     * 
     * @return The type of model customization.
     * @see CustomizationType
     */

    public String getCustomizationType() {
        return this.customizationType;
    }

    /**
     * <p>
     * The type of model customization.
     * </p>
     * 
     * @param customizationType
     *        The type of model customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public GetModelCustomizationJobResult withCustomizationType(String customizationType) {
        setCustomizationType(customizationType);
        return this;
    }

    /**
     * <p>
     * The type of model customization.
     * </p>
     * 
     * @param customizationType
     *        The type of model customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public GetModelCustomizationJobResult withCustomizationType(CustomizationType customizationType) {
        this.customizationType = customizationType.toString();
        return this;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @param outputModelKmsKeyArn
     *        The custom model is encrypted at rest using this key.
     */

    public void setOutputModelKmsKeyArn(String outputModelKmsKeyArn) {
        this.outputModelKmsKeyArn = outputModelKmsKeyArn;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @return The custom model is encrypted at rest using this key.
     */

    public String getOutputModelKmsKeyArn() {
        return this.outputModelKmsKeyArn;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @param outputModelKmsKeyArn
     *        The custom model is encrypted at rest using this key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withOutputModelKmsKeyArn(String outputModelKmsKeyArn) {
        setOutputModelKmsKeyArn(outputModelKmsKeyArn);
        return this;
    }

    /**
     * <p>
     * Contains training metrics from the job creation.
     * </p>
     * 
     * @param trainingMetrics
     *        Contains training metrics from the job creation.
     */

    public void setTrainingMetrics(TrainingMetrics trainingMetrics) {
        this.trainingMetrics = trainingMetrics;
    }

    /**
     * <p>
     * Contains training metrics from the job creation.
     * </p>
     * 
     * @return Contains training metrics from the job creation.
     */

    public TrainingMetrics getTrainingMetrics() {
        return this.trainingMetrics;
    }

    /**
     * <p>
     * Contains training metrics from the job creation.
     * </p>
     * 
     * @param trainingMetrics
     *        Contains training metrics from the job creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withTrainingMetrics(TrainingMetrics trainingMetrics) {
        setTrainingMetrics(trainingMetrics);
        return this;
    }

    /**
     * <p>
     * The loss metric for each validator that you provided in the createjob request.
     * </p>
     * 
     * @return The loss metric for each validator that you provided in the createjob request.
     */

    public java.util.List<ValidatorMetric> getValidationMetrics() {
        return validationMetrics;
    }

    /**
     * <p>
     * The loss metric for each validator that you provided in the createjob request.
     * </p>
     * 
     * @param validationMetrics
     *        The loss metric for each validator that you provided in the createjob request.
     */

    public void setValidationMetrics(java.util.Collection<ValidatorMetric> validationMetrics) {
        if (validationMetrics == null) {
            this.validationMetrics = null;
            return;
        }

        this.validationMetrics = new java.util.ArrayList<ValidatorMetric>(validationMetrics);
    }

    /**
     * <p>
     * The loss metric for each validator that you provided in the createjob request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationMetrics(java.util.Collection)} or {@link #withValidationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationMetrics
     *        The loss metric for each validator that you provided in the createjob request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withValidationMetrics(ValidatorMetric... validationMetrics) {
        if (this.validationMetrics == null) {
            setValidationMetrics(new java.util.ArrayList<ValidatorMetric>(validationMetrics.length));
        }
        for (ValidatorMetric ele : validationMetrics) {
            this.validationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The loss metric for each validator that you provided in the createjob request.
     * </p>
     * 
     * @param validationMetrics
     *        The loss metric for each validator that you provided in the createjob request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withValidationMetrics(java.util.Collection<ValidatorMetric> validationMetrics) {
        setValidationMetrics(validationMetrics);
        return this;
    }

    /**
     * <p>
     * VPC configuration for the custom model job.
     * </p>
     * 
     * @param vpcConfig
     *        VPC configuration for the custom model job.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * VPC configuration for the custom model job.
     * </p>
     * 
     * @return VPC configuration for the custom model job.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * VPC configuration for the custom model job.
     * </p>
     * 
     * @param vpcConfig
     *        VPC configuration for the custom model job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelCustomizationJobResult withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getOutputModelName() != null)
            sb.append("OutputModelName: ").append(getOutputModelName()).append(",");
        if (getOutputModelArn() != null)
            sb.append("OutputModelArn: ").append(getOutputModelArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getBaseModelArn() != null)
            sb.append("BaseModelArn: ").append(getBaseModelArn()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getTrainingDataConfig() != null)
            sb.append("TrainingDataConfig: ").append(getTrainingDataConfig()).append(",");
        if (getValidationDataConfig() != null)
            sb.append("ValidationDataConfig: ").append(getValidationDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getCustomizationType() != null)
            sb.append("CustomizationType: ").append(getCustomizationType()).append(",");
        if (getOutputModelKmsKeyArn() != null)
            sb.append("OutputModelKmsKeyArn: ").append(getOutputModelKmsKeyArn()).append(",");
        if (getTrainingMetrics() != null)
            sb.append("TrainingMetrics: ").append(getTrainingMetrics()).append(",");
        if (getValidationMetrics() != null)
            sb.append("ValidationMetrics: ").append(getValidationMetrics()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelCustomizationJobResult == false)
            return false;
        GetModelCustomizationJobResult other = (GetModelCustomizationJobResult) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOutputModelName() == null ^ this.getOutputModelName() == null)
            return false;
        if (other.getOutputModelName() != null && other.getOutputModelName().equals(this.getOutputModelName()) == false)
            return false;
        if (other.getOutputModelArn() == null ^ this.getOutputModelArn() == null)
            return false;
        if (other.getOutputModelArn() != null && other.getOutputModelArn().equals(this.getOutputModelArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getBaseModelArn() == null ^ this.getBaseModelArn() == null)
            return false;
        if (other.getBaseModelArn() != null && other.getBaseModelArn().equals(this.getBaseModelArn()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getTrainingDataConfig() == null ^ this.getTrainingDataConfig() == null)
            return false;
        if (other.getTrainingDataConfig() != null && other.getTrainingDataConfig().equals(this.getTrainingDataConfig()) == false)
            return false;
        if (other.getValidationDataConfig() == null ^ this.getValidationDataConfig() == null)
            return false;
        if (other.getValidationDataConfig() != null && other.getValidationDataConfig().equals(this.getValidationDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getCustomizationType() == null ^ this.getCustomizationType() == null)
            return false;
        if (other.getCustomizationType() != null && other.getCustomizationType().equals(this.getCustomizationType()) == false)
            return false;
        if (other.getOutputModelKmsKeyArn() == null ^ this.getOutputModelKmsKeyArn() == null)
            return false;
        if (other.getOutputModelKmsKeyArn() != null && other.getOutputModelKmsKeyArn().equals(this.getOutputModelKmsKeyArn()) == false)
            return false;
        if (other.getTrainingMetrics() == null ^ this.getTrainingMetrics() == null)
            return false;
        if (other.getTrainingMetrics() != null && other.getTrainingMetrics().equals(this.getTrainingMetrics()) == false)
            return false;
        if (other.getValidationMetrics() == null ^ this.getValidationMetrics() == null)
            return false;
        if (other.getValidationMetrics() != null && other.getValidationMetrics().equals(this.getValidationMetrics()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputModelName() == null) ? 0 : getOutputModelName().hashCode());
        hashCode = prime * hashCode + ((getOutputModelArn() == null) ? 0 : getOutputModelArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getBaseModelArn() == null) ? 0 : getBaseModelArn().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataConfig() == null) ? 0 : getTrainingDataConfig().hashCode());
        hashCode = prime * hashCode + ((getValidationDataConfig() == null) ? 0 : getValidationDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getCustomizationType() == null) ? 0 : getCustomizationType().hashCode());
        hashCode = prime * hashCode + ((getOutputModelKmsKeyArn() == null) ? 0 : getOutputModelKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTrainingMetrics() == null) ? 0 : getTrainingMetrics().hashCode());
        hashCode = prime * hashCode + ((getValidationMetrics() == null) ? 0 : getValidationMetrics().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetModelCustomizationJobResult clone() {
        try {
            return (GetModelCustomizationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
