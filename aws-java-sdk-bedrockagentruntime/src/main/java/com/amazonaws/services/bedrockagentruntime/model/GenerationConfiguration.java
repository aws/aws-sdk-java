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
 * Contains configurations for response generation based on the knowledge base query results.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_RequestSyntax"
 * >RetrieveAndGenerate request</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/GenerationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration details for the guardrail.
     * </p>
     */
    private GuardrailConfiguration guardrailConfiguration;
    /**
     * <p>
     * Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a knowledge
     * base as a source.
     * </p>
     */
    private InferenceConfig inferenceConfig;
    /**
     * <p>
     * Contains the template for the prompt that's sent to the model for response generation.
     * </p>
     */
    private PromptTemplate promptTemplate;

    /**
     * <p>
     * The configuration details for the guardrail.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The configuration details for the guardrail.
     */

    public void setGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        this.guardrailConfiguration = guardrailConfiguration;
    }

    /**
     * <p>
     * The configuration details for the guardrail.
     * </p>
     * 
     * @return The configuration details for the guardrail.
     */

    public GuardrailConfiguration getGuardrailConfiguration() {
        return this.guardrailConfiguration;
    }

    /**
     * <p>
     * The configuration details for the guardrail.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The configuration details for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationConfiguration withGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        setGuardrailConfiguration(guardrailConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a knowledge
     * base as a source.
     * </p>
     * 
     * @param inferenceConfig
     *        Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a
     *        knowledge base as a source.
     */

    public void setInferenceConfig(InferenceConfig inferenceConfig) {
        this.inferenceConfig = inferenceConfig;
    }

    /**
     * <p>
     * Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a knowledge
     * base as a source.
     * </p>
     * 
     * @return Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a
     *         knowledge base as a source.
     */

    public InferenceConfig getInferenceConfig() {
        return this.inferenceConfig;
    }

    /**
     * <p>
     * Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a knowledge
     * base as a source.
     * </p>
     * 
     * @param inferenceConfig
     *        Configuration settings for inference when using RetrieveAndGenerate to generate responses while using a
     *        knowledge base as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationConfiguration withInferenceConfig(InferenceConfig inferenceConfig) {
        setInferenceConfig(inferenceConfig);
        return this;
    }

    /**
     * <p>
     * Contains the template for the prompt that's sent to the model for response generation.
     * </p>
     * 
     * @param promptTemplate
     *        Contains the template for the prompt that's sent to the model for response generation.
     */

    public void setPromptTemplate(PromptTemplate promptTemplate) {
        this.promptTemplate = promptTemplate;
    }

    /**
     * <p>
     * Contains the template for the prompt that's sent to the model for response generation.
     * </p>
     * 
     * @return Contains the template for the prompt that's sent to the model for response generation.
     */

    public PromptTemplate getPromptTemplate() {
        return this.promptTemplate;
    }

    /**
     * <p>
     * Contains the template for the prompt that's sent to the model for response generation.
     * </p>
     * 
     * @param promptTemplate
     *        Contains the template for the prompt that's sent to the model for response generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerationConfiguration withPromptTemplate(PromptTemplate promptTemplate) {
        setPromptTemplate(promptTemplate);
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
        if (getGuardrailConfiguration() != null)
            sb.append("GuardrailConfiguration: ").append(getGuardrailConfiguration()).append(",");
        if (getInferenceConfig() != null)
            sb.append("InferenceConfig: ").append(getInferenceConfig()).append(",");
        if (getPromptTemplate() != null)
            sb.append("PromptTemplate: ").append(getPromptTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerationConfiguration == false)
            return false;
        GenerationConfiguration other = (GenerationConfiguration) obj;
        if (other.getGuardrailConfiguration() == null ^ this.getGuardrailConfiguration() == null)
            return false;
        if (other.getGuardrailConfiguration() != null && other.getGuardrailConfiguration().equals(this.getGuardrailConfiguration()) == false)
            return false;
        if (other.getInferenceConfig() == null ^ this.getInferenceConfig() == null)
            return false;
        if (other.getInferenceConfig() != null && other.getInferenceConfig().equals(this.getInferenceConfig()) == false)
            return false;
        if (other.getPromptTemplate() == null ^ this.getPromptTemplate() == null)
            return false;
        if (other.getPromptTemplate() != null && other.getPromptTemplate().equals(this.getPromptTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailConfiguration() == null) ? 0 : getGuardrailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfig() == null) ? 0 : getInferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getPromptTemplate() == null) ? 0 : getPromptTemplate().hashCode());
        return hashCode;
    }

    @Override
    public GenerationConfiguration clone() {
        try {
            return (GenerationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.GenerationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
