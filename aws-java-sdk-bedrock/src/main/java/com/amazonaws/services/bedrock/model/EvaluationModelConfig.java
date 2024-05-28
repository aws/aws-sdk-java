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
 * Defines the models used in the model evaluation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationModelConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationModelConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the Amazon Bedrock model and inference parameters you want used.
     * </p>
     */
    private EvaluationBedrockModel bedrockModel;

    /**
     * <p>
     * Defines the Amazon Bedrock model and inference parameters you want used.
     * </p>
     * 
     * @param bedrockModel
     *        Defines the Amazon Bedrock model and inference parameters you want used.
     */

    public void setBedrockModel(EvaluationBedrockModel bedrockModel) {
        this.bedrockModel = bedrockModel;
    }

    /**
     * <p>
     * Defines the Amazon Bedrock model and inference parameters you want used.
     * </p>
     * 
     * @return Defines the Amazon Bedrock model and inference parameters you want used.
     */

    public EvaluationBedrockModel getBedrockModel() {
        return this.bedrockModel;
    }

    /**
     * <p>
     * Defines the Amazon Bedrock model and inference parameters you want used.
     * </p>
     * 
     * @param bedrockModel
     *        Defines the Amazon Bedrock model and inference parameters you want used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationModelConfig withBedrockModel(EvaluationBedrockModel bedrockModel) {
        setBedrockModel(bedrockModel);
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
        if (getBedrockModel() != null)
            sb.append("BedrockModel: ").append(getBedrockModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationModelConfig == false)
            return false;
        EvaluationModelConfig other = (EvaluationModelConfig) obj;
        if (other.getBedrockModel() == null ^ this.getBedrockModel() == null)
            return false;
        if (other.getBedrockModel() != null && other.getBedrockModel().equals(this.getBedrockModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBedrockModel() == null) ? 0 : getBedrockModel().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationModelConfig clone() {
        try {
            return (EvaluationModelConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationModelConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
