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
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_RequestSyntax"
 * >RetrieveAndGenerate request</a> – in the <code>retrieveAndGenerateConfiguration</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveAndGenerateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     */
    private ExternalSourcesRetrieveAndGenerateConfiguration externalSourcesConfiguration;
    /**
     * <p>
     * Contains details about the resource being queried.
     * </p>
     */
    private KnowledgeBaseRetrieveAndGenerateConfiguration knowledgeBaseConfiguration;
    /**
     * <p>
     * The type of resource that is queried by the request.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @param externalSourcesConfiguration
     *        The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     */

    public void setExternalSourcesConfiguration(ExternalSourcesRetrieveAndGenerateConfiguration externalSourcesConfiguration) {
        this.externalSourcesConfiguration = externalSourcesConfiguration;
    }

    /**
     * <p>
     * The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @return The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     */

    public ExternalSourcesRetrieveAndGenerateConfiguration getExternalSourcesConfiguration() {
        return this.externalSourcesConfiguration;
    }

    /**
     * <p>
     * The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @param externalSourcesConfiguration
     *        The configuration used with the external source wrapper object in the retrieveAndGenerate function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateConfiguration withExternalSourcesConfiguration(ExternalSourcesRetrieveAndGenerateConfiguration externalSourcesConfiguration) {
        setExternalSourcesConfiguration(externalSourcesConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains details about the resource being queried.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Contains details about the resource being queried.
     */

    public void setKnowledgeBaseConfiguration(KnowledgeBaseRetrieveAndGenerateConfiguration knowledgeBaseConfiguration) {
        this.knowledgeBaseConfiguration = knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the resource being queried.
     * </p>
     * 
     * @return Contains details about the resource being queried.
     */

    public KnowledgeBaseRetrieveAndGenerateConfiguration getKnowledgeBaseConfiguration() {
        return this.knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the resource being queried.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Contains details about the resource being queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateConfiguration withKnowledgeBaseConfiguration(KnowledgeBaseRetrieveAndGenerateConfiguration knowledgeBaseConfiguration) {
        setKnowledgeBaseConfiguration(knowledgeBaseConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of resource that is queried by the request.
     * </p>
     * 
     * @param type
     *        The type of resource that is queried by the request.
     * @see RetrieveAndGenerateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource that is queried by the request.
     * </p>
     * 
     * @return The type of resource that is queried by the request.
     * @see RetrieveAndGenerateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource that is queried by the request.
     * </p>
     * 
     * @param type
     *        The type of resource that is queried by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieveAndGenerateType
     */

    public RetrieveAndGenerateConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of resource that is queried by the request.
     * </p>
     * 
     * @param type
     *        The type of resource that is queried by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieveAndGenerateType
     */

    public RetrieveAndGenerateConfiguration withType(RetrieveAndGenerateType type) {
        this.type = type.toString();
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
        if (getExternalSourcesConfiguration() != null)
            sb.append("ExternalSourcesConfiguration: ").append(getExternalSourcesConfiguration()).append(",");
        if (getKnowledgeBaseConfiguration() != null)
            sb.append("KnowledgeBaseConfiguration: ").append(getKnowledgeBaseConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveAndGenerateConfiguration == false)
            return false;
        RetrieveAndGenerateConfiguration other = (RetrieveAndGenerateConfiguration) obj;
        if (other.getExternalSourcesConfiguration() == null ^ this.getExternalSourcesConfiguration() == null)
            return false;
        if (other.getExternalSourcesConfiguration() != null && other.getExternalSourcesConfiguration().equals(this.getExternalSourcesConfiguration()) == false)
            return false;
        if (other.getKnowledgeBaseConfiguration() == null ^ this.getKnowledgeBaseConfiguration() == null)
            return false;
        if (other.getKnowledgeBaseConfiguration() != null && other.getKnowledgeBaseConfiguration().equals(this.getKnowledgeBaseConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalSourcesConfiguration() == null) ? 0 : getExternalSourcesConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseConfiguration() == null) ? 0 : getKnowledgeBaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveAndGenerateConfiguration clone() {
        try {
            return (RetrieveAndGenerateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.RetrieveAndGenerateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
