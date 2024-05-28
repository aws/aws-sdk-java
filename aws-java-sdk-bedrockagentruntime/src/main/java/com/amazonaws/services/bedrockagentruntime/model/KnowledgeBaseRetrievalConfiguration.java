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
 * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Retrieve.html#API_agent-runtime_Retrieve_RequestSyntax"
 * >Retrieve request</a> – in the <code>retrievalConfiguration</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_RequestSyntax"
 * >RetrieveAndGenerate request</a> – in the <code>retrievalConfiguration</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/KnowledgeBaseRetrievalConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseRetrievalConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details about how the results from the vector search should be returned. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     */
    private KnowledgeBaseVectorSearchConfiguration vectorSearchConfiguration;

    /**
     * <p>
     * Contains details about how the results from the vector search should be returned. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @param vectorSearchConfiguration
     *        Contains details about how the results from the vector search should be returned. For more information,
     *        see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query
     *        configurations</a>.
     */

    public void setVectorSearchConfiguration(KnowledgeBaseVectorSearchConfiguration vectorSearchConfiguration) {
        this.vectorSearchConfiguration = vectorSearchConfiguration;
    }

    /**
     * <p>
     * Contains details about how the results from the vector search should be returned. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @return Contains details about how the results from the vector search should be returned. For more information,
     *         see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query
     *         configurations</a>.
     */

    public KnowledgeBaseVectorSearchConfiguration getVectorSearchConfiguration() {
        return this.vectorSearchConfiguration;
    }

    /**
     * <p>
     * Contains details about how the results from the vector search should be returned. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @param vectorSearchConfiguration
     *        Contains details about how the results from the vector search should be returned. For more information,
     *        see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query
     *        configurations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrievalConfiguration withVectorSearchConfiguration(KnowledgeBaseVectorSearchConfiguration vectorSearchConfiguration) {
        setVectorSearchConfiguration(vectorSearchConfiguration);
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
        if (getVectorSearchConfiguration() != null)
            sb.append("VectorSearchConfiguration: ").append(getVectorSearchConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseRetrievalConfiguration == false)
            return false;
        KnowledgeBaseRetrievalConfiguration other = (KnowledgeBaseRetrievalConfiguration) obj;
        if (other.getVectorSearchConfiguration() == null ^ this.getVectorSearchConfiguration() == null)
            return false;
        if (other.getVectorSearchConfiguration() != null && other.getVectorSearchConfiguration().equals(this.getVectorSearchConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorSearchConfiguration() == null) ? 0 : getVectorSearchConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseRetrievalConfiguration clone() {
        try {
            return (KnowledgeBaseRetrievalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.KnowledgeBaseRetrievalConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
