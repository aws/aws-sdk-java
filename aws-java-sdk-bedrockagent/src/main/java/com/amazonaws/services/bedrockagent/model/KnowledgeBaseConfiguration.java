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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the embeddings configuration of the knowledge base.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/KnowledgeBaseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of data that the data source is converted into for the knowledge base.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Contains details about the embeddings model that'sused to convert the data source.
     * </p>
     */
    private VectorKnowledgeBaseConfiguration vectorKnowledgeBaseConfiguration;

    /**
     * <p>
     * The type of data that the data source is converted into for the knowledge base.
     * </p>
     * 
     * @param type
     *        The type of data that the data source is converted into for the knowledge base.
     * @see KnowledgeBaseType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data that the data source is converted into for the knowledge base.
     * </p>
     * 
     * @return The type of data that the data source is converted into for the knowledge base.
     * @see KnowledgeBaseType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data that the data source is converted into for the knowledge base.
     * </p>
     * 
     * @param type
     *        The type of data that the data source is converted into for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseType
     */

    public KnowledgeBaseConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data that the data source is converted into for the knowledge base.
     * </p>
     * 
     * @param type
     *        The type of data that the data source is converted into for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseType
     */

    public KnowledgeBaseConfiguration withType(KnowledgeBaseType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Contains details about the embeddings model that'sused to convert the data source.
     * </p>
     * 
     * @param vectorKnowledgeBaseConfiguration
     *        Contains details about the embeddings model that'sused to convert the data source.
     */

    public void setVectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfiguration vectorKnowledgeBaseConfiguration) {
        this.vectorKnowledgeBaseConfiguration = vectorKnowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the embeddings model that'sused to convert the data source.
     * </p>
     * 
     * @return Contains details about the embeddings model that'sused to convert the data source.
     */

    public VectorKnowledgeBaseConfiguration getVectorKnowledgeBaseConfiguration() {
        return this.vectorKnowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the embeddings model that'sused to convert the data source.
     * </p>
     * 
     * @param vectorKnowledgeBaseConfiguration
     *        Contains details about the embeddings model that'sused to convert the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseConfiguration withVectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfiguration vectorKnowledgeBaseConfiguration) {
        setVectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVectorKnowledgeBaseConfiguration() != null)
            sb.append("VectorKnowledgeBaseConfiguration: ").append(getVectorKnowledgeBaseConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseConfiguration == false)
            return false;
        KnowledgeBaseConfiguration other = (KnowledgeBaseConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVectorKnowledgeBaseConfiguration() == null ^ this.getVectorKnowledgeBaseConfiguration() == null)
            return false;
        if (other.getVectorKnowledgeBaseConfiguration() != null
                && other.getVectorKnowledgeBaseConfiguration().equals(this.getVectorKnowledgeBaseConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVectorKnowledgeBaseConfiguration() == null) ? 0 : getVectorKnowledgeBaseConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseConfiguration clone() {
        try {
            return (KnowledgeBaseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.KnowledgeBaseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
