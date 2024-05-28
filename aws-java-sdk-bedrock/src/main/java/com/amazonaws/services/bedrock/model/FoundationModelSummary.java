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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a foundation model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/FoundationModelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FoundationModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the foundation model.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The model ID of the foundation model.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The model's provider name.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The input modalities that the model supports.
     * </p>
     */
    private java.util.List<String> inputModalities;
    /**
     * <p>
     * The output modalities that the model supports.
     * </p>
     */
    private java.util.List<String> outputModalities;
    /**
     * <p>
     * Indicates whether the model supports streaming.
     * </p>
     */
    private Boolean responseStreamingSupported;
    /**
     * <p>
     * Whether the model supports fine-tuning or continual pre-training.
     * </p>
     */
    private java.util.List<String> customizationsSupported;
    /**
     * <p>
     * The inference types that the model supports.
     * </p>
     */
    private java.util.List<String> inferenceTypesSupported;
    /**
     * <p>
     * Contains details about whether a model version is available or deprecated.
     * </p>
     */
    private FoundationModelLifecycle modelLifecycle;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the foundation model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the foundation model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the foundation model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the foundation model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the foundation model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the foundation model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FoundationModelSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The model ID of the foundation model.
     * </p>
     * 
     * @param modelId
     *        The model ID of the foundation model.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID of the foundation model.
     * </p>
     * 
     * @return The model ID of the foundation model.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model ID of the foundation model.
     * </p>
     * 
     * @param modelId
     *        The model ID of the foundation model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FoundationModelSummary withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FoundationModelSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The model's provider name.
     * </p>
     * 
     * @param providerName
     *        The model's provider name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The model's provider name.
     * </p>
     * 
     * @return The model's provider name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The model's provider name.
     * </p>
     * 
     * @param providerName
     *        The model's provider name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FoundationModelSummary withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The input modalities that the model supports.
     * </p>
     * 
     * @return The input modalities that the model supports.
     * @see ModelModality
     */

    public java.util.List<String> getInputModalities() {
        return inputModalities;
    }

    /**
     * <p>
     * The input modalities that the model supports.
     * </p>
     * 
     * @param inputModalities
     *        The input modalities that the model supports.
     * @see ModelModality
     */

    public void setInputModalities(java.util.Collection<String> inputModalities) {
        if (inputModalities == null) {
            this.inputModalities = null;
            return;
        }

        this.inputModalities = new java.util.ArrayList<String>(inputModalities);
    }

    /**
     * <p>
     * The input modalities that the model supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputModalities(java.util.Collection)} or {@link #withInputModalities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputModalities
     *        The input modalities that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public FoundationModelSummary withInputModalities(String... inputModalities) {
        if (this.inputModalities == null) {
            setInputModalities(new java.util.ArrayList<String>(inputModalities.length));
        }
        for (String ele : inputModalities) {
            this.inputModalities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The input modalities that the model supports.
     * </p>
     * 
     * @param inputModalities
     *        The input modalities that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public FoundationModelSummary withInputModalities(java.util.Collection<String> inputModalities) {
        setInputModalities(inputModalities);
        return this;
    }

    /**
     * <p>
     * The input modalities that the model supports.
     * </p>
     * 
     * @param inputModalities
     *        The input modalities that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public FoundationModelSummary withInputModalities(ModelModality... inputModalities) {
        java.util.ArrayList<String> inputModalitiesCopy = new java.util.ArrayList<String>(inputModalities.length);
        for (ModelModality value : inputModalities) {
            inputModalitiesCopy.add(value.toString());
        }
        if (getInputModalities() == null) {
            setInputModalities(inputModalitiesCopy);
        } else {
            getInputModalities().addAll(inputModalitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The output modalities that the model supports.
     * </p>
     * 
     * @return The output modalities that the model supports.
     * @see ModelModality
     */

    public java.util.List<String> getOutputModalities() {
        return outputModalities;
    }

    /**
     * <p>
     * The output modalities that the model supports.
     * </p>
     * 
     * @param outputModalities
     *        The output modalities that the model supports.
     * @see ModelModality
     */

    public void setOutputModalities(java.util.Collection<String> outputModalities) {
        if (outputModalities == null) {
            this.outputModalities = null;
            return;
        }

        this.outputModalities = new java.util.ArrayList<String>(outputModalities);
    }

    /**
     * <p>
     * The output modalities that the model supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputModalities(java.util.Collection)} or {@link #withOutputModalities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputModalities
     *        The output modalities that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public FoundationModelSummary withOutputModalities(String... outputModalities) {
        if (this.outputModalities == null) {
            setOutputModalities(new java.util.ArrayList<String>(outputModalities.length));
        }
        for (String ele : outputModalities) {
            this.outputModalities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output modalities that the model supports.
     * </p>
     * 
     * @param outputModalities
     *        The output modalities that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public FoundationModelSummary withOutputModalities(java.util.Collection<String> outputModalities) {
        setOutputModalities(outputModalities);
        return this;
    }

    /**
     * <p>
     * The output modalities that the model supports.
     * </p>
     * 
     * @param outputModalities
     *        The output modalities that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public FoundationModelSummary withOutputModalities(ModelModality... outputModalities) {
        java.util.ArrayList<String> outputModalitiesCopy = new java.util.ArrayList<String>(outputModalities.length);
        for (ModelModality value : outputModalities) {
            outputModalitiesCopy.add(value.toString());
        }
        if (getOutputModalities() == null) {
            setOutputModalities(outputModalitiesCopy);
        } else {
            getOutputModalities().addAll(outputModalitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the model supports streaming.
     * </p>
     * 
     * @param responseStreamingSupported
     *        Indicates whether the model supports streaming.
     */

    public void setResponseStreamingSupported(Boolean responseStreamingSupported) {
        this.responseStreamingSupported = responseStreamingSupported;
    }

    /**
     * <p>
     * Indicates whether the model supports streaming.
     * </p>
     * 
     * @return Indicates whether the model supports streaming.
     */

    public Boolean getResponseStreamingSupported() {
        return this.responseStreamingSupported;
    }

    /**
     * <p>
     * Indicates whether the model supports streaming.
     * </p>
     * 
     * @param responseStreamingSupported
     *        Indicates whether the model supports streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FoundationModelSummary withResponseStreamingSupported(Boolean responseStreamingSupported) {
        setResponseStreamingSupported(responseStreamingSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether the model supports streaming.
     * </p>
     * 
     * @return Indicates whether the model supports streaming.
     */

    public Boolean isResponseStreamingSupported() {
        return this.responseStreamingSupported;
    }

    /**
     * <p>
     * Whether the model supports fine-tuning or continual pre-training.
     * </p>
     * 
     * @return Whether the model supports fine-tuning or continual pre-training.
     * @see ModelCustomization
     */

    public java.util.List<String> getCustomizationsSupported() {
        return customizationsSupported;
    }

    /**
     * <p>
     * Whether the model supports fine-tuning or continual pre-training.
     * </p>
     * 
     * @param customizationsSupported
     *        Whether the model supports fine-tuning or continual pre-training.
     * @see ModelCustomization
     */

    public void setCustomizationsSupported(java.util.Collection<String> customizationsSupported) {
        if (customizationsSupported == null) {
            this.customizationsSupported = null;
            return;
        }

        this.customizationsSupported = new java.util.ArrayList<String>(customizationsSupported);
    }

    /**
     * <p>
     * Whether the model supports fine-tuning or continual pre-training.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomizationsSupported(java.util.Collection)} or
     * {@link #withCustomizationsSupported(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customizationsSupported
     *        Whether the model supports fine-tuning or continual pre-training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public FoundationModelSummary withCustomizationsSupported(String... customizationsSupported) {
        if (this.customizationsSupported == null) {
            setCustomizationsSupported(new java.util.ArrayList<String>(customizationsSupported.length));
        }
        for (String ele : customizationsSupported) {
            this.customizationsSupported.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Whether the model supports fine-tuning or continual pre-training.
     * </p>
     * 
     * @param customizationsSupported
     *        Whether the model supports fine-tuning or continual pre-training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public FoundationModelSummary withCustomizationsSupported(java.util.Collection<String> customizationsSupported) {
        setCustomizationsSupported(customizationsSupported);
        return this;
    }

    /**
     * <p>
     * Whether the model supports fine-tuning or continual pre-training.
     * </p>
     * 
     * @param customizationsSupported
     *        Whether the model supports fine-tuning or continual pre-training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public FoundationModelSummary withCustomizationsSupported(ModelCustomization... customizationsSupported) {
        java.util.ArrayList<String> customizationsSupportedCopy = new java.util.ArrayList<String>(customizationsSupported.length);
        for (ModelCustomization value : customizationsSupported) {
            customizationsSupportedCopy.add(value.toString());
        }
        if (getCustomizationsSupported() == null) {
            setCustomizationsSupported(customizationsSupportedCopy);
        } else {
            getCustomizationsSupported().addAll(customizationsSupportedCopy);
        }
        return this;
    }

    /**
     * <p>
     * The inference types that the model supports.
     * </p>
     * 
     * @return The inference types that the model supports.
     * @see InferenceType
     */

    public java.util.List<String> getInferenceTypesSupported() {
        return inferenceTypesSupported;
    }

    /**
     * <p>
     * The inference types that the model supports.
     * </p>
     * 
     * @param inferenceTypesSupported
     *        The inference types that the model supports.
     * @see InferenceType
     */

    public void setInferenceTypesSupported(java.util.Collection<String> inferenceTypesSupported) {
        if (inferenceTypesSupported == null) {
            this.inferenceTypesSupported = null;
            return;
        }

        this.inferenceTypesSupported = new java.util.ArrayList<String>(inferenceTypesSupported);
    }

    /**
     * <p>
     * The inference types that the model supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceTypesSupported(java.util.Collection)} or
     * {@link #withInferenceTypesSupported(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceTypesSupported
     *        The inference types that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public FoundationModelSummary withInferenceTypesSupported(String... inferenceTypesSupported) {
        if (this.inferenceTypesSupported == null) {
            setInferenceTypesSupported(new java.util.ArrayList<String>(inferenceTypesSupported.length));
        }
        for (String ele : inferenceTypesSupported) {
            this.inferenceTypesSupported.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inference types that the model supports.
     * </p>
     * 
     * @param inferenceTypesSupported
     *        The inference types that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public FoundationModelSummary withInferenceTypesSupported(java.util.Collection<String> inferenceTypesSupported) {
        setInferenceTypesSupported(inferenceTypesSupported);
        return this;
    }

    /**
     * <p>
     * The inference types that the model supports.
     * </p>
     * 
     * @param inferenceTypesSupported
     *        The inference types that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public FoundationModelSummary withInferenceTypesSupported(InferenceType... inferenceTypesSupported) {
        java.util.ArrayList<String> inferenceTypesSupportedCopy = new java.util.ArrayList<String>(inferenceTypesSupported.length);
        for (InferenceType value : inferenceTypesSupported) {
            inferenceTypesSupportedCopy.add(value.toString());
        }
        if (getInferenceTypesSupported() == null) {
            setInferenceTypesSupported(inferenceTypesSupportedCopy);
        } else {
            getInferenceTypesSupported().addAll(inferenceTypesSupportedCopy);
        }
        return this;
    }

    /**
     * <p>
     * Contains details about whether a model version is available or deprecated.
     * </p>
     * 
     * @param modelLifecycle
     *        Contains details about whether a model version is available or deprecated.
     */

    public void setModelLifecycle(FoundationModelLifecycle modelLifecycle) {
        this.modelLifecycle = modelLifecycle;
    }

    /**
     * <p>
     * Contains details about whether a model version is available or deprecated.
     * </p>
     * 
     * @return Contains details about whether a model version is available or deprecated.
     */

    public FoundationModelLifecycle getModelLifecycle() {
        return this.modelLifecycle;
    }

    /**
     * <p>
     * Contains details about whether a model version is available or deprecated.
     * </p>
     * 
     * @param modelLifecycle
     *        Contains details about whether a model version is available or deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FoundationModelSummary withModelLifecycle(FoundationModelLifecycle modelLifecycle) {
        setModelLifecycle(modelLifecycle);
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
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getInputModalities() != null)
            sb.append("InputModalities: ").append(getInputModalities()).append(",");
        if (getOutputModalities() != null)
            sb.append("OutputModalities: ").append(getOutputModalities()).append(",");
        if (getResponseStreamingSupported() != null)
            sb.append("ResponseStreamingSupported: ").append(getResponseStreamingSupported()).append(",");
        if (getCustomizationsSupported() != null)
            sb.append("CustomizationsSupported: ").append(getCustomizationsSupported()).append(",");
        if (getInferenceTypesSupported() != null)
            sb.append("InferenceTypesSupported: ").append(getInferenceTypesSupported()).append(",");
        if (getModelLifecycle() != null)
            sb.append("ModelLifecycle: ").append(getModelLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FoundationModelSummary == false)
            return false;
        FoundationModelSummary other = (FoundationModelSummary) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getInputModalities() == null ^ this.getInputModalities() == null)
            return false;
        if (other.getInputModalities() != null && other.getInputModalities().equals(this.getInputModalities()) == false)
            return false;
        if (other.getOutputModalities() == null ^ this.getOutputModalities() == null)
            return false;
        if (other.getOutputModalities() != null && other.getOutputModalities().equals(this.getOutputModalities()) == false)
            return false;
        if (other.getResponseStreamingSupported() == null ^ this.getResponseStreamingSupported() == null)
            return false;
        if (other.getResponseStreamingSupported() != null && other.getResponseStreamingSupported().equals(this.getResponseStreamingSupported()) == false)
            return false;
        if (other.getCustomizationsSupported() == null ^ this.getCustomizationsSupported() == null)
            return false;
        if (other.getCustomizationsSupported() != null && other.getCustomizationsSupported().equals(this.getCustomizationsSupported()) == false)
            return false;
        if (other.getInferenceTypesSupported() == null ^ this.getInferenceTypesSupported() == null)
            return false;
        if (other.getInferenceTypesSupported() != null && other.getInferenceTypesSupported().equals(this.getInferenceTypesSupported()) == false)
            return false;
        if (other.getModelLifecycle() == null ^ this.getModelLifecycle() == null)
            return false;
        if (other.getModelLifecycle() != null && other.getModelLifecycle().equals(this.getModelLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getInputModalities() == null) ? 0 : getInputModalities().hashCode());
        hashCode = prime * hashCode + ((getOutputModalities() == null) ? 0 : getOutputModalities().hashCode());
        hashCode = prime * hashCode + ((getResponseStreamingSupported() == null) ? 0 : getResponseStreamingSupported().hashCode());
        hashCode = prime * hashCode + ((getCustomizationsSupported() == null) ? 0 : getCustomizationsSupported().hashCode());
        hashCode = prime * hashCode + ((getInferenceTypesSupported() == null) ? 0 : getInferenceTypesSupported().hashCode());
        hashCode = prime * hashCode + ((getModelLifecycle() == null) ? 0 : getModelLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public FoundationModelSummary clone() {
        try {
            return (FoundationModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.FoundationModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
