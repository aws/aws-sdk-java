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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateModelCustomizationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelCustomizationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the fine-tuning job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * A name for the resulting custom model.
     * </p>
     */
    private String customModelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. For example, during model training, Amazon Bedrock needs your permission to read input data from an S3
     * bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller of this API must
     * have the <code>iam:PassRole</code> permission.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Name of the base model.
     * </p>
     */
    private String baseModelIdentifier;
    /**
     * <p>
     * The customization type.
     * </p>
     */
    private String customizationType;
    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     */
    private String customModelKmsKeyId;
    /**
     * <p>
     * Tags to attach to the job.
     * </p>
     */
    private java.util.List<Tag> jobTags;
    /**
     * <p>
     * Tags to attach to the resulting custom model.
     * </p>
     */
    private java.util.List<Tag> customModelTags;
    /**
     * <p>
     * Information about the training dataset.
     * </p>
     */
    private TrainingDataConfig trainingDataConfig;
    /**
     * <p>
     * Information about the validation dataset.
     * </p>
     */
    private ValidationDataConfig validationDataConfig;
    /**
     * <p>
     * S3 location for the output data.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * Parameters related to tuning the model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that contains
     * the resources you are using for this job.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * A name for the fine-tuning job.
     * </p>
     * 
     * @param jobName
     *        A name for the fine-tuning job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * A name for the fine-tuning job.
     * </p>
     * 
     * @return A name for the fine-tuning job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * A name for the fine-tuning job.
     * </p>
     * 
     * @param jobName
     *        A name for the fine-tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * A name for the resulting custom model.
     * </p>
     * 
     * @param customModelName
     *        A name for the resulting custom model.
     */

    public void setCustomModelName(String customModelName) {
        this.customModelName = customModelName;
    }

    /**
     * <p>
     * A name for the resulting custom model.
     * </p>
     * 
     * @return A name for the resulting custom model.
     */

    public String getCustomModelName() {
        return this.customModelName;
    }

    /**
     * <p>
     * A name for the resulting custom model.
     * </p>
     * 
     * @param customModelName
     *        A name for the resulting custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withCustomModelName(String customModelName) {
        setCustomModelName(customModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. For example, during model training, Amazon Bedrock needs your permission to read input data from an S3
     * bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller of this API must
     * have the <code>iam:PassRole</code> permission.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on
     *        your behalf. For example, during model training, Amazon Bedrock needs your permission to read input data
     *        from an S3 bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller
     *        of this API must have the <code>iam:PassRole</code> permission.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. For example, during model training, Amazon Bedrock needs your permission to read input data from an S3
     * bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller of this API must
     * have the <code>iam:PassRole</code> permission.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on
     *         your behalf. For example, during model training, Amazon Bedrock needs your permission to read input data
     *         from an S3 bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller
     *         of this API must have the <code>iam:PassRole</code> permission.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. For example, during model training, Amazon Bedrock needs your permission to read input data from an S3
     * bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller of this API must
     * have the <code>iam:PassRole</code> permission.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on
     *        your behalf. For example, during model training, Amazon Bedrock needs your permission to read input data
     *        from an S3 bucket, write model artifacts to an S3 bucket. To pass this role to Amazon Bedrock, the caller
     *        of this API must have the <code>iam:PassRole</code> permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Name of the base model.
     * </p>
     * 
     * @param baseModelIdentifier
     *        Name of the base model.
     */

    public void setBaseModelIdentifier(String baseModelIdentifier) {
        this.baseModelIdentifier = baseModelIdentifier;
    }

    /**
     * <p>
     * Name of the base model.
     * </p>
     * 
     * @return Name of the base model.
     */

    public String getBaseModelIdentifier() {
        return this.baseModelIdentifier;
    }

    /**
     * <p>
     * Name of the base model.
     * </p>
     * 
     * @param baseModelIdentifier
     *        Name of the base model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withBaseModelIdentifier(String baseModelIdentifier) {
        setBaseModelIdentifier(baseModelIdentifier);
        return this;
    }

    /**
     * <p>
     * The customization type.
     * </p>
     * 
     * @param customizationType
     *        The customization type.
     * @see CustomizationType
     */

    public void setCustomizationType(String customizationType) {
        this.customizationType = customizationType;
    }

    /**
     * <p>
     * The customization type.
     * </p>
     * 
     * @return The customization type.
     * @see CustomizationType
     */

    public String getCustomizationType() {
        return this.customizationType;
    }

    /**
     * <p>
     * The customization type.
     * </p>
     * 
     * @param customizationType
     *        The customization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public CreateModelCustomizationJobRequest withCustomizationType(String customizationType) {
        setCustomizationType(customizationType);
        return this;
    }

    /**
     * <p>
     * The customization type.
     * </p>
     * 
     * @param customizationType
     *        The customization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public CreateModelCustomizationJobRequest withCustomizationType(CustomizationType customizationType) {
        this.customizationType = customizationType.toString();
        return this;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @param customModelKmsKeyId
     *        The custom model is encrypted at rest using this key.
     */

    public void setCustomModelKmsKeyId(String customModelKmsKeyId) {
        this.customModelKmsKeyId = customModelKmsKeyId;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @return The custom model is encrypted at rest using this key.
     */

    public String getCustomModelKmsKeyId() {
        return this.customModelKmsKeyId;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @param customModelKmsKeyId
     *        The custom model is encrypted at rest using this key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withCustomModelKmsKeyId(String customModelKmsKeyId) {
        setCustomModelKmsKeyId(customModelKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Tags to attach to the job.
     * </p>
     * 
     * @return Tags to attach to the job.
     */

    public java.util.List<Tag> getJobTags() {
        return jobTags;
    }

    /**
     * <p>
     * Tags to attach to the job.
     * </p>
     * 
     * @param jobTags
     *        Tags to attach to the job.
     */

    public void setJobTags(java.util.Collection<Tag> jobTags) {
        if (jobTags == null) {
            this.jobTags = null;
            return;
        }

        this.jobTags = new java.util.ArrayList<Tag>(jobTags);
    }

    /**
     * <p>
     * Tags to attach to the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTags(java.util.Collection)} or {@link #withJobTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobTags
     *        Tags to attach to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withJobTags(Tag... jobTags) {
        if (this.jobTags == null) {
            setJobTags(new java.util.ArrayList<Tag>(jobTags.length));
        }
        for (Tag ele : jobTags) {
            this.jobTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to attach to the job.
     * </p>
     * 
     * @param jobTags
     *        Tags to attach to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withJobTags(java.util.Collection<Tag> jobTags) {
        setJobTags(jobTags);
        return this;
    }

    /**
     * <p>
     * Tags to attach to the resulting custom model.
     * </p>
     * 
     * @return Tags to attach to the resulting custom model.
     */

    public java.util.List<Tag> getCustomModelTags() {
        return customModelTags;
    }

    /**
     * <p>
     * Tags to attach to the resulting custom model.
     * </p>
     * 
     * @param customModelTags
     *        Tags to attach to the resulting custom model.
     */

    public void setCustomModelTags(java.util.Collection<Tag> customModelTags) {
        if (customModelTags == null) {
            this.customModelTags = null;
            return;
        }

        this.customModelTags = new java.util.ArrayList<Tag>(customModelTags);
    }

    /**
     * <p>
     * Tags to attach to the resulting custom model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomModelTags(java.util.Collection)} or {@link #withCustomModelTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customModelTags
     *        Tags to attach to the resulting custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withCustomModelTags(Tag... customModelTags) {
        if (this.customModelTags == null) {
            setCustomModelTags(new java.util.ArrayList<Tag>(customModelTags.length));
        }
        for (Tag ele : customModelTags) {
            this.customModelTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to attach to the resulting custom model.
     * </p>
     * 
     * @param customModelTags
     *        Tags to attach to the resulting custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withCustomModelTags(java.util.Collection<Tag> customModelTags) {
        setCustomModelTags(customModelTags);
        return this;
    }

    /**
     * <p>
     * Information about the training dataset.
     * </p>
     * 
     * @param trainingDataConfig
     *        Information about the training dataset.
     */

    public void setTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
        this.trainingDataConfig = trainingDataConfig;
    }

    /**
     * <p>
     * Information about the training dataset.
     * </p>
     * 
     * @return Information about the training dataset.
     */

    public TrainingDataConfig getTrainingDataConfig() {
        return this.trainingDataConfig;
    }

    /**
     * <p>
     * Information about the training dataset.
     * </p>
     * 
     * @param trainingDataConfig
     *        Information about the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
        setTrainingDataConfig(trainingDataConfig);
        return this;
    }

    /**
     * <p>
     * Information about the validation dataset.
     * </p>
     * 
     * @param validationDataConfig
     *        Information about the validation dataset.
     */

    public void setValidationDataConfig(ValidationDataConfig validationDataConfig) {
        this.validationDataConfig = validationDataConfig;
    }

    /**
     * <p>
     * Information about the validation dataset.
     * </p>
     * 
     * @return Information about the validation dataset.
     */

    public ValidationDataConfig getValidationDataConfig() {
        return this.validationDataConfig;
    }

    /**
     * <p>
     * Information about the validation dataset.
     * </p>
     * 
     * @param validationDataConfig
     *        Information about the validation dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withValidationDataConfig(ValidationDataConfig validationDataConfig) {
        setValidationDataConfig(validationDataConfig);
        return this;
    }

    /**
     * <p>
     * S3 location for the output data.
     * </p>
     * 
     * @param outputDataConfig
     *        S3 location for the output data.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * S3 location for the output data.
     * </p>
     * 
     * @return S3 location for the output data.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * S3 location for the output data.
     * </p>
     * 
     * @param outputDataConfig
     *        S3 location for the output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Parameters related to tuning the model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @return Parameters related to tuning the model. For details on the format for different models, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *         hyperparameters</a>.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Parameters related to tuning the model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @param hyperParameters
     *        Parameters related to tuning the model. For details on the format for different models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *        hyperparameters</a>.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Parameters related to tuning the model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @param hyperParameters
     *        Parameters related to tuning the model. For details on the format for different models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *        hyperparameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    /**
     * Add a single HyperParameters entry
     *
     * @see CreateModelCustomizationJobRequest#withHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest addHyperParametersEntry(String key, String value) {
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

    public CreateModelCustomizationJobRequest clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that contains
     * the resources you are using for this job.
     * </p>
     * 
     * @param vpcConfig
     *        VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that
     *        contains the resources you are using for this job.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that contains
     * the resources you are using for this job.
     * </p>
     * 
     * @return VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that
     *         contains the resources you are using for this job.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that contains
     * the resources you are using for this job.
     * </p>
     * 
     * @param vpcConfig
     *        VPC configuration (optional). Configuration parameters for the private Virtual Private Cloud (VPC) that
     *        contains the resources you are using for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCustomizationJobRequest withVpcConfig(VpcConfig vpcConfig) {
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getCustomModelName() != null)
            sb.append("CustomModelName: ").append(getCustomModelName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getBaseModelIdentifier() != null)
            sb.append("BaseModelIdentifier: ").append(getBaseModelIdentifier()).append(",");
        if (getCustomizationType() != null)
            sb.append("CustomizationType: ").append(getCustomizationType()).append(",");
        if (getCustomModelKmsKeyId() != null)
            sb.append("CustomModelKmsKeyId: ").append(getCustomModelKmsKeyId()).append(",");
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags()).append(",");
        if (getCustomModelTags() != null)
            sb.append("CustomModelTags: ").append(getCustomModelTags()).append(",");
        if (getTrainingDataConfig() != null)
            sb.append("TrainingDataConfig: ").append(getTrainingDataConfig()).append(",");
        if (getValidationDataConfig() != null)
            sb.append("ValidationDataConfig: ").append(getValidationDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
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

        if (obj instanceof CreateModelCustomizationJobRequest == false)
            return false;
        CreateModelCustomizationJobRequest other = (CreateModelCustomizationJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getCustomModelName() == null ^ this.getCustomModelName() == null)
            return false;
        if (other.getCustomModelName() != null && other.getCustomModelName().equals(this.getCustomModelName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getBaseModelIdentifier() == null ^ this.getBaseModelIdentifier() == null)
            return false;
        if (other.getBaseModelIdentifier() != null && other.getBaseModelIdentifier().equals(this.getBaseModelIdentifier()) == false)
            return false;
        if (other.getCustomizationType() == null ^ this.getCustomizationType() == null)
            return false;
        if (other.getCustomizationType() != null && other.getCustomizationType().equals(this.getCustomizationType()) == false)
            return false;
        if (other.getCustomModelKmsKeyId() == null ^ this.getCustomModelKmsKeyId() == null)
            return false;
        if (other.getCustomModelKmsKeyId() != null && other.getCustomModelKmsKeyId().equals(this.getCustomModelKmsKeyId()) == false)
            return false;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
            return false;
        if (other.getCustomModelTags() == null ^ this.getCustomModelTags() == null)
            return false;
        if (other.getCustomModelTags() != null && other.getCustomModelTags().equals(this.getCustomModelTags()) == false)
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
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getCustomModelName() == null) ? 0 : getCustomModelName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getBaseModelIdentifier() == null) ? 0 : getBaseModelIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCustomizationType() == null) ? 0 : getCustomizationType().hashCode());
        hashCode = prime * hashCode + ((getCustomModelKmsKeyId() == null) ? 0 : getCustomModelKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        hashCode = prime * hashCode + ((getCustomModelTags() == null) ? 0 : getCustomModelTags().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataConfig() == null) ? 0 : getTrainingDataConfig().hashCode());
        hashCode = prime * hashCode + ((getValidationDataConfig() == null) ? 0 : getValidationDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelCustomizationJobRequest clone() {
        return (CreateModelCustomizationJobRequest) super.clone();
    }

}
