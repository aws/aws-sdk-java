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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for inference settings when generating responses using RetrieveAndGenerate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/InferenceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     * </p>
     */
    private TextInferenceConfig textInferenceConfig;

    /**
     * <p>
     * Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     * </p>
     * 
     * @param textInferenceConfig
     *        Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     */

    public void setTextInferenceConfig(TextInferenceConfig textInferenceConfig) {
        this.textInferenceConfig = textInferenceConfig;
    }

    /**
     * <p>
     * Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     * </p>
     * 
     * @return Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     */

    public TextInferenceConfig getTextInferenceConfig() {
        return this.textInferenceConfig;
    }

    /**
     * <p>
     * Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     * </p>
     * 
     * @param textInferenceConfig
     *        Configuration settings specific to text generation while generating responses using RetrieveAndGenerate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfig withTextInferenceConfig(TextInferenceConfig textInferenceConfig) {
        setTextInferenceConfig(textInferenceConfig);
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
        if (getTextInferenceConfig() != null)
            sb.append("TextInferenceConfig: ").append(getTextInferenceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceConfig == false)
            return false;
        InferenceConfig other = (InferenceConfig) obj;
        if (other.getTextInferenceConfig() == null ^ this.getTextInferenceConfig() == null)
            return false;
        if (other.getTextInferenceConfig() != null && other.getTextInferenceConfig().equals(this.getTextInferenceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextInferenceConfig() == null) ? 0 : getTextInferenceConfig().hashCode());
        return hashCode;
    }

    @Override
    public InferenceConfig clone() {
        try {
            return (InferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.InferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
