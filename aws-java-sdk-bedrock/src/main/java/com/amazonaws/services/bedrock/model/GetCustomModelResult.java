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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetCustomModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) associated with this model.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * Model name associated with this model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Job name associated with this model.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Job Amazon Resource Name (ARN) associated with this model.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     */
    private String baseModelArn;
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
    private String modelKmsKeyArn;
    /**
     * <p>
     * Hyperparameter values associated with this model. For details on the format for different models, see <a
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
     * Output data configuration associated with this custom model.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * Contains training metrics from the job creation.
     * </p>
     */
    private TrainingMetrics trainingMetrics;
    /**
     * <p>
     * The validation metrics from the job creation.
     * </p>
     */
    private java.util.List<ValidatorMetric> validationMetrics;
    /**
     * <p>
     * Creation time of the model.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Amazon Resource Name (ARN) associated with this model.
     * </p>
     * 
     * @param modelArn
     *        Amazon Resource Name (ARN) associated with this model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) associated with this model.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) associated with this model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) associated with this model.
     * </p>
     * 
     * @param modelArn
     *        Amazon Resource Name (ARN) associated with this model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * Model name associated with this model.
     * </p>
     * 
     * @param modelName
     *        Model name associated with this model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * Model name associated with this model.
     * </p>
     * 
     * @return Model name associated with this model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * Model name associated with this model.
     * </p>
     * 
     * @param modelName
     *        Model name associated with this model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Job name associated with this model.
     * </p>
     * 
     * @param jobName
     *        Job name associated with this model.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Job name associated with this model.
     * </p>
     * 
     * @return Job name associated with this model.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * Job name associated with this model.
     * </p>
     * 
     * @param jobName
     *        Job name associated with this model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Job Amazon Resource Name (ARN) associated with this model.
     * </p>
     * 
     * @param jobArn
     *        Job Amazon Resource Name (ARN) associated with this model.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * Job Amazon Resource Name (ARN) associated with this model.
     * </p>
     * 
     * @return Job Amazon Resource Name (ARN) associated with this model.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * Job Amazon Resource Name (ARN) associated with this model.
     * </p>
     * 
     * @param jobArn
     *        Job Amazon Resource Name (ARN) associated with this model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withJobArn(String jobArn) {
        setJobArn(jobArn);
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

    public GetCustomModelResult withBaseModelArn(String baseModelArn) {
        setBaseModelArn(baseModelArn);
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

    public GetCustomModelResult withCustomizationType(String customizationType) {
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

    public GetCustomModelResult withCustomizationType(CustomizationType customizationType) {
        this.customizationType = customizationType.toString();
        return this;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @param modelKmsKeyArn
     *        The custom model is encrypted at rest using this key.
     */

    public void setModelKmsKeyArn(String modelKmsKeyArn) {
        this.modelKmsKeyArn = modelKmsKeyArn;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @return The custom model is encrypted at rest using this key.
     */

    public String getModelKmsKeyArn() {
        return this.modelKmsKeyArn;
    }

    /**
     * <p>
     * The custom model is encrypted at rest using this key.
     * </p>
     * 
     * @param modelKmsKeyArn
     *        The custom model is encrypted at rest using this key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withModelKmsKeyArn(String modelKmsKeyArn) {
        setModelKmsKeyArn(modelKmsKeyArn);
        return this;
    }

    /**
     * <p>
     * Hyperparameter values associated with this model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @return Hyperparameter values associated with this model. For details on the format for different models, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *         hyperparameters</a>.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Hyperparameter values associated with this model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @param hyperParameters
     *        Hyperparameter values associated with this model. For details on the format for different models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *        hyperparameters</a>.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Hyperparameter values associated with this model. For details on the format for different models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     * hyperparameters</a>.
     * </p>
     * 
     * @param hyperParameters
     *        Hyperparameter values associated with this model. For details on the format for different models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html">Custom model
     *        hyperparameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    /**
     * Add a single HyperParameters entry
     *
     * @see GetCustomModelResult#withHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult addHyperParametersEntry(String key, String value) {
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

    public GetCustomModelResult clearHyperParametersEntries() {
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

    public GetCustomModelResult withTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
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

    public GetCustomModelResult withValidationDataConfig(ValidationDataConfig validationDataConfig) {
        setValidationDataConfig(validationDataConfig);
        return this;
    }

    /**
     * <p>
     * Output data configuration associated with this custom model.
     * </p>
     * 
     * @param outputDataConfig
     *        Output data configuration associated with this custom model.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Output data configuration associated with this custom model.
     * </p>
     * 
     * @return Output data configuration associated with this custom model.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Output data configuration associated with this custom model.
     * </p>
     * 
     * @param outputDataConfig
     *        Output data configuration associated with this custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
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

    public GetCustomModelResult withTrainingMetrics(TrainingMetrics trainingMetrics) {
        setTrainingMetrics(trainingMetrics);
        return this;
    }

    /**
     * <p>
     * The validation metrics from the job creation.
     * </p>
     * 
     * @return The validation metrics from the job creation.
     */

    public java.util.List<ValidatorMetric> getValidationMetrics() {
        return validationMetrics;
    }

    /**
     * <p>
     * The validation metrics from the job creation.
     * </p>
     * 
     * @param validationMetrics
     *        The validation metrics from the job creation.
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
     * The validation metrics from the job creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationMetrics(java.util.Collection)} or {@link #withValidationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationMetrics
     *        The validation metrics from the job creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withValidationMetrics(ValidatorMetric... validationMetrics) {
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
     * The validation metrics from the job creation.
     * </p>
     * 
     * @param validationMetrics
     *        The validation metrics from the job creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withValidationMetrics(java.util.Collection<ValidatorMetric> validationMetrics) {
        setValidationMetrics(validationMetrics);
        return this;
    }

    /**
     * <p>
     * Creation time of the model.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the model.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the model.
     * </p>
     * 
     * @return Creation time of the model.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the model.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomModelResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getBaseModelArn() != null)
            sb.append("BaseModelArn: ").append(getBaseModelArn()).append(",");
        if (getCustomizationType() != null)
            sb.append("CustomizationType: ").append(getCustomizationType()).append(",");
        if (getModelKmsKeyArn() != null)
            sb.append("ModelKmsKeyArn: ").append(getModelKmsKeyArn()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getTrainingDataConfig() != null)
            sb.append("TrainingDataConfig: ").append(getTrainingDataConfig()).append(",");
        if (getValidationDataConfig() != null)
            sb.append("ValidationDataConfig: ").append(getValidationDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getTrainingMetrics() != null)
            sb.append("TrainingMetrics: ").append(getTrainingMetrics()).append(",");
        if (getValidationMetrics() != null)
            sb.append("ValidationMetrics: ").append(getValidationMetrics()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCustomModelResult == false)
            return false;
        GetCustomModelResult other = (GetCustomModelResult) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getBaseModelArn() == null ^ this.getBaseModelArn() == null)
            return false;
        if (other.getBaseModelArn() != null && other.getBaseModelArn().equals(this.getBaseModelArn()) == false)
            return false;
        if (other.getCustomizationType() == null ^ this.getCustomizationType() == null)
            return false;
        if (other.getCustomizationType() != null && other.getCustomizationType().equals(this.getCustomizationType()) == false)
            return false;
        if (other.getModelKmsKeyArn() == null ^ this.getModelKmsKeyArn() == null)
            return false;
        if (other.getModelKmsKeyArn() != null && other.getModelKmsKeyArn().equals(this.getModelKmsKeyArn()) == false)
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
        if (other.getTrainingMetrics() == null ^ this.getTrainingMetrics() == null)
            return false;
        if (other.getTrainingMetrics() != null && other.getTrainingMetrics().equals(this.getTrainingMetrics()) == false)
            return false;
        if (other.getValidationMetrics() == null ^ this.getValidationMetrics() == null)
            return false;
        if (other.getValidationMetrics() != null && other.getValidationMetrics().equals(this.getValidationMetrics()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getBaseModelArn() == null) ? 0 : getBaseModelArn().hashCode());
        hashCode = prime * hashCode + ((getCustomizationType() == null) ? 0 : getCustomizationType().hashCode());
        hashCode = prime * hashCode + ((getModelKmsKeyArn() == null) ? 0 : getModelKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataConfig() == null) ? 0 : getTrainingDataConfig().hashCode());
        hashCode = prime * hashCode + ((getValidationDataConfig() == null) ? 0 : getValidationDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingMetrics() == null) ? 0 : getTrainingMetrics().hashCode());
        hashCode = prime * hashCode + ((getValidationMetrics() == null) ? 0 : getValidationMetrics().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCustomModelResult clone() {
        try {
            return (GetCustomModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
