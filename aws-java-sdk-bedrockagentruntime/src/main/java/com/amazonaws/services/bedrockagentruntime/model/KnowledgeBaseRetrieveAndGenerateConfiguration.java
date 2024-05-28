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
 * Contains details about the resource being queried.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Retrieve.html#API_agent-runtime_Retrieve_RequestSyntax"
 * >Retrieve request</a> – in the <code>knowledgeBaseConfiguration</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_RequestSyntax"
 * >RetrieveAndGenerate request</a> – in the <code>knowledgeBaseConfiguration</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/KnowledgeBaseRetrieveAndGenerateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseRetrieveAndGenerateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configurations for response generation based on the knowwledge base query results.
     * </p>
     */
    private GenerationConfiguration generationConfiguration;
    /**
     * <p>
     * The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The ARN of the foundation model used to generate a response.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * Contains configurations for how to retrieve and return the knowledge base query.
     * </p>
     */
    private KnowledgeBaseRetrievalConfiguration retrievalConfiguration;

    /**
     * <p>
     * Contains configurations for response generation based on the knowwledge base query results.
     * </p>
     * 
     * @param generationConfiguration
     *        Contains configurations for response generation based on the knowwledge base query results.
     */

    public void setGenerationConfiguration(GenerationConfiguration generationConfiguration) {
        this.generationConfiguration = generationConfiguration;
    }

    /**
     * <p>
     * Contains configurations for response generation based on the knowwledge base query results.
     * </p>
     * 
     * @return Contains configurations for response generation based on the knowwledge base query results.
     */

    public GenerationConfiguration getGenerationConfiguration() {
        return this.generationConfiguration;
    }

    /**
     * <p>
     * Contains configurations for response generation based on the knowwledge base query results.
     * </p>
     * 
     * @param generationConfiguration
     *        Contains configurations for response generation based on the knowwledge base query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrieveAndGenerateConfiguration withGenerationConfiguration(GenerationConfiguration generationConfiguration) {
        setGenerationConfiguration(generationConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     * </p>
     * 
     * @return The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base that is queried and the foundation model used for generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrieveAndGenerateConfiguration withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The ARN of the foundation model used to generate a response.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the foundation model used to generate a response.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The ARN of the foundation model used to generate a response.
     * </p>
     * 
     * @return The ARN of the foundation model used to generate a response.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The ARN of the foundation model used to generate a response.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the foundation model used to generate a response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrieveAndGenerateConfiguration withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * Contains configurations for how to retrieve and return the knowledge base query.
     * </p>
     * 
     * @param retrievalConfiguration
     *        Contains configurations for how to retrieve and return the knowledge base query.
     */

    public void setRetrievalConfiguration(KnowledgeBaseRetrievalConfiguration retrievalConfiguration) {
        this.retrievalConfiguration = retrievalConfiguration;
    }

    /**
     * <p>
     * Contains configurations for how to retrieve and return the knowledge base query.
     * </p>
     * 
     * @return Contains configurations for how to retrieve and return the knowledge base query.
     */

    public KnowledgeBaseRetrievalConfiguration getRetrievalConfiguration() {
        return this.retrievalConfiguration;
    }

    /**
     * <p>
     * Contains configurations for how to retrieve and return the knowledge base query.
     * </p>
     * 
     * @param retrievalConfiguration
     *        Contains configurations for how to retrieve and return the knowledge base query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrieveAndGenerateConfiguration withRetrievalConfiguration(KnowledgeBaseRetrievalConfiguration retrievalConfiguration) {
        setRetrievalConfiguration(retrievalConfiguration);
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
        if (getGenerationConfiguration() != null)
            sb.append("GenerationConfiguration: ").append(getGenerationConfiguration()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getRetrievalConfiguration() != null)
            sb.append("RetrievalConfiguration: ").append(getRetrievalConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseRetrieveAndGenerateConfiguration == false)
            return false;
        KnowledgeBaseRetrieveAndGenerateConfiguration other = (KnowledgeBaseRetrieveAndGenerateConfiguration) obj;
        if (other.getGenerationConfiguration() == null ^ this.getGenerationConfiguration() == null)
            return false;
        if (other.getGenerationConfiguration() != null && other.getGenerationConfiguration().equals(this.getGenerationConfiguration()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getRetrievalConfiguration() == null ^ this.getRetrievalConfiguration() == null)
            return false;
        if (other.getRetrievalConfiguration() != null && other.getRetrievalConfiguration().equals(this.getRetrievalConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationConfiguration() == null) ? 0 : getGenerationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getRetrievalConfiguration() == null) ? 0 : getRetrievalConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseRetrieveAndGenerateConfiguration clone() {
        try {
            return (KnowledgeBaseRetrieveAndGenerateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.KnowledgeBaseRetrieveAndGenerateConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
