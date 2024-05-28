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
 * Contains the ARN of the Amazon Bedrock models specified in your model evaluation job. Each Amazon Bedrock model
 * supports different <code>inferenceParams</code>. To learn more about supported inference parameters for Amazon
 * Bedrock models, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-prompt-datasets-custom.html">Inference
 * parameters for foundation models</a>.
 * </p>
 * <p>
 * The <code>inferenceParams</code> are specified using JSON. To successfully insert JSON as string make sure that all
 * quotations are properly escaped. For example, <code>"temperature":"0.25"</code> key value pair would need to be
 * formatted as <code>\"temperature\":\"0.25\"</code> to successfully accepted in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationBedrockModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationBedrockModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Amazon Bedrock model specified.
     * </p>
     */
    private String modelIdentifier;
    /**
     * <p>
     * Each Amazon Bedrock support different inference parameters that change how the model behaves during inference.
     * </p>
     */
    private String inferenceParams;

    /**
     * <p>
     * The ARN of the Amazon Bedrock model specified.
     * </p>
     * 
     * @param modelIdentifier
     *        The ARN of the Amazon Bedrock model specified.
     */

    public void setModelIdentifier(String modelIdentifier) {
        this.modelIdentifier = modelIdentifier;
    }

    /**
     * <p>
     * The ARN of the Amazon Bedrock model specified.
     * </p>
     * 
     * @return The ARN of the Amazon Bedrock model specified.
     */

    public String getModelIdentifier() {
        return this.modelIdentifier;
    }

    /**
     * <p>
     * The ARN of the Amazon Bedrock model specified.
     * </p>
     * 
     * @param modelIdentifier
     *        The ARN of the Amazon Bedrock model specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationBedrockModel withModelIdentifier(String modelIdentifier) {
        setModelIdentifier(modelIdentifier);
        return this;
    }

    /**
     * <p>
     * Each Amazon Bedrock support different inference parameters that change how the model behaves during inference.
     * </p>
     * 
     * @param inferenceParams
     *        Each Amazon Bedrock support different inference parameters that change how the model behaves during
     *        inference.
     */

    public void setInferenceParams(String inferenceParams) {
        this.inferenceParams = inferenceParams;
    }

    /**
     * <p>
     * Each Amazon Bedrock support different inference parameters that change how the model behaves during inference.
     * </p>
     * 
     * @return Each Amazon Bedrock support different inference parameters that change how the model behaves during
     *         inference.
     */

    public String getInferenceParams() {
        return this.inferenceParams;
    }

    /**
     * <p>
     * Each Amazon Bedrock support different inference parameters that change how the model behaves during inference.
     * </p>
     * 
     * @param inferenceParams
     *        Each Amazon Bedrock support different inference parameters that change how the model behaves during
     *        inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationBedrockModel withInferenceParams(String inferenceParams) {
        setInferenceParams(inferenceParams);
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
        if (getModelIdentifier() != null)
            sb.append("ModelIdentifier: ").append(getModelIdentifier()).append(",");
        if (getInferenceParams() != null)
            sb.append("InferenceParams: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationBedrockModel == false)
            return false;
        EvaluationBedrockModel other = (EvaluationBedrockModel) obj;
        if (other.getModelIdentifier() == null ^ this.getModelIdentifier() == null)
            return false;
        if (other.getModelIdentifier() != null && other.getModelIdentifier().equals(this.getModelIdentifier()) == false)
            return false;
        if (other.getInferenceParams() == null ^ this.getInferenceParams() == null)
            return false;
        if (other.getInferenceParams() != null && other.getInferenceParams().equals(this.getInferenceParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelIdentifier() == null) ? 0 : getModelIdentifier().hashCode());
        hashCode = prime * hashCode + ((getInferenceParams() == null) ? 0 : getInferenceParams().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationBedrockModel clone() {
        try {
            return (EvaluationBedrockModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationBedrockModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
