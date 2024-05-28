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
 * Used to define the models you want used in your model evaluation job. Automated model evaluation jobs support only a
 * single model. In a human-based model evaluation job, your annotator can compare the responses for up to two different
 * models.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationInferenceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationInferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to specify the models.
     * </p>
     */
    private java.util.List<EvaluationModelConfig> models;

    /**
     * <p>
     * Used to specify the models.
     * </p>
     * 
     * @return Used to specify the models.
     */

    public java.util.List<EvaluationModelConfig> getModels() {
        return models;
    }

    /**
     * <p>
     * Used to specify the models.
     * </p>
     * 
     * @param models
     *        Used to specify the models.
     */

    public void setModels(java.util.Collection<EvaluationModelConfig> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<EvaluationModelConfig>(models);
    }

    /**
     * <p>
     * Used to specify the models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        Used to specify the models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationInferenceConfig withModels(EvaluationModelConfig... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<EvaluationModelConfig>(models.length));
        }
        for (EvaluationModelConfig ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Used to specify the models.
     * </p>
     * 
     * @param models
     *        Used to specify the models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationInferenceConfig withModels(java.util.Collection<EvaluationModelConfig> models) {
        setModels(models);
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
        if (getModels() != null)
            sb.append("Models: ").append(getModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationInferenceConfig == false)
            return false;
        EvaluationInferenceConfig other = (EvaluationInferenceConfig) obj;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationInferenceConfig clone() {
        try {
            return (EvaluationInferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationInferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
