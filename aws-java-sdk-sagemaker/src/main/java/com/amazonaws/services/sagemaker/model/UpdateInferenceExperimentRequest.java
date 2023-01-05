/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateInferenceExperiment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInferenceExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the inference experiment to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The duration for which the inference experiment will run. If the status of the inference experiment is
     * <code>Created</code>, then you can update both the start and end dates. If the status of the inference experiment
     * is <code>Running</code>, then you can update only the end date.
     * </p>
     */
    private InferenceExperimentSchedule schedule;
    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     * configuration you want to update.
     * </p>
     */
    private java.util.List<ModelVariantConfig> modelVariants;
    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     */
    private InferenceExperimentDataStorageConfig dataStorageConfig;
    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     */
    private ShadowModeConfig shadowModeConfig;

    /**
     * <p>
     * The name of the inference experiment to be updated.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the inference experiment to be updated.
     * </p>
     * 
     * @return The name of the inference experiment to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the inference experiment to be updated.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The duration for which the inference experiment will run. If the status of the inference experiment is
     * <code>Created</code>, then you can update both the start and end dates. If the status of the inference experiment
     * is <code>Running</code>, then you can update only the end date.
     * </p>
     * 
     * @param schedule
     *        The duration for which the inference experiment will run. If the status of the inference experiment is
     *        <code>Created</code>, then you can update both the start and end dates. If the status of the inference
     *        experiment is <code>Running</code>, then you can update only the end date.
     */

    public void setSchedule(InferenceExperimentSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The duration for which the inference experiment will run. If the status of the inference experiment is
     * <code>Created</code>, then you can update both the start and end dates. If the status of the inference experiment
     * is <code>Running</code>, then you can update only the end date.
     * </p>
     * 
     * @return The duration for which the inference experiment will run. If the status of the inference experiment is
     *         <code>Created</code>, then you can update both the start and end dates. If the status of the inference
     *         experiment is <code>Running</code>, then you can update only the end date.
     */

    public InferenceExperimentSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The duration for which the inference experiment will run. If the status of the inference experiment is
     * <code>Created</code>, then you can update both the start and end dates. If the status of the inference experiment
     * is <code>Running</code>, then you can update only the end date.
     * </p>
     * 
     * @param schedule
     *        The duration for which the inference experiment will run. If the status of the inference experiment is
     *        <code>Created</code>, then you can update both the start and end dates. If the status of the inference
     *        experiment is <code>Running</code>, then you can update only the end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withSchedule(InferenceExperimentSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @param description
     *        The description of the inference experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @return The description of the inference experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @param description
     *        The description of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     * configuration you want to update.
     * </p>
     * 
     * @return An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     *         configuration you want to update.
     */

    public java.util.List<ModelVariantConfig> getModelVariants() {
        return modelVariants;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     * configuration you want to update.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     *        configuration you want to update.
     */

    public void setModelVariants(java.util.Collection<ModelVariantConfig> modelVariants) {
        if (modelVariants == null) {
            this.modelVariants = null;
            return;
        }

        this.modelVariants = new java.util.ArrayList<ModelVariantConfig>(modelVariants);
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     * configuration you want to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVariants(java.util.Collection)} or {@link #withModelVariants(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     *        configuration you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withModelVariants(ModelVariantConfig... modelVariants) {
        if (this.modelVariants == null) {
            setModelVariants(new java.util.ArrayList<ModelVariantConfig>(modelVariants.length));
        }
        for (ModelVariantConfig ele : modelVariants) {
            this.modelVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     * configuration you want to update.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant, whose infrastructure
     *        configuration you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withModelVariants(java.util.Collection<ModelVariantConfig> modelVariants) {
        setModelVariants(modelVariants);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * 
     * @param dataStorageConfig
     *        The Amazon S3 location and configuration for storing inference request and response data.
     */

    public void setDataStorageConfig(InferenceExperimentDataStorageConfig dataStorageConfig) {
        this.dataStorageConfig = dataStorageConfig;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * 
     * @return The Amazon S3 location and configuration for storing inference request and response data.
     */

    public InferenceExperimentDataStorageConfig getDataStorageConfig() {
        return this.dataStorageConfig;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * 
     * @param dataStorageConfig
     *        The Amazon S3 location and configuration for storing inference request and response data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withDataStorageConfig(InferenceExperimentDataStorageConfig dataStorageConfig) {
        setDataStorageConfig(dataStorageConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     * 
     * @param shadowModeConfig
     *        The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a
     *        production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker
     *        replicates a percentage of the inference requests. For the shadow variant also specify the percentage of
     *        requests that Amazon SageMaker replicates.
     */

    public void setShadowModeConfig(ShadowModeConfig shadowModeConfig) {
        this.shadowModeConfig = shadowModeConfig;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     * 
     * @return The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a
     *         production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker
     *         replicates a percentage of the inference requests. For the shadow variant also specify the percentage of
     *         requests that Amazon SageMaker replicates.
     */

    public ShadowModeConfig getShadowModeConfig() {
        return this.shadowModeConfig;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     * 
     * @param shadowModeConfig
     *        The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a
     *        production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker
     *        replicates a percentage of the inference requests. For the shadow variant also specify the percentage of
     *        requests that Amazon SageMaker replicates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceExperimentRequest withShadowModeConfig(ShadowModeConfig shadowModeConfig) {
        setShadowModeConfig(shadowModeConfig);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getModelVariants() != null)
            sb.append("ModelVariants: ").append(getModelVariants()).append(",");
        if (getDataStorageConfig() != null)
            sb.append("DataStorageConfig: ").append(getDataStorageConfig()).append(",");
        if (getShadowModeConfig() != null)
            sb.append("ShadowModeConfig: ").append(getShadowModeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInferenceExperimentRequest == false)
            return false;
        UpdateInferenceExperimentRequest other = (UpdateInferenceExperimentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getModelVariants() == null ^ this.getModelVariants() == null)
            return false;
        if (other.getModelVariants() != null && other.getModelVariants().equals(this.getModelVariants()) == false)
            return false;
        if (other.getDataStorageConfig() == null ^ this.getDataStorageConfig() == null)
            return false;
        if (other.getDataStorageConfig() != null && other.getDataStorageConfig().equals(this.getDataStorageConfig()) == false)
            return false;
        if (other.getShadowModeConfig() == null ^ this.getShadowModeConfig() == null)
            return false;
        if (other.getShadowModeConfig() != null && other.getShadowModeConfig().equals(this.getShadowModeConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getModelVariants() == null) ? 0 : getModelVariants().hashCode());
        hashCode = prime * hashCode + ((getDataStorageConfig() == null) ? 0 : getDataStorageConfig().hashCode());
        hashCode = prime * hashCode + ((getShadowModeConfig() == null) ? 0 : getShadowModeConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInferenceExperimentRequest clone() {
        return (UpdateInferenceExperimentRequest) super.clone();
    }

}
