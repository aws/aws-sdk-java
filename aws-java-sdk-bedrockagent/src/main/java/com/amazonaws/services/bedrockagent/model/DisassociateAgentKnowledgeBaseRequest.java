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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateAgentKnowledgeBaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agent from which to disassociate the knowledge base.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent from which to disassociate the knowledge base.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The unique identifier of the knowledge base to disassociate.
     * </p>
     */
    private String knowledgeBaseId;

    /**
     * <p>
     * The unique identifier of the agent from which to disassociate the knowledge base.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent from which to disassociate the knowledge base.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent from which to disassociate the knowledge base.
     * </p>
     * 
     * @return The unique identifier of the agent from which to disassociate the knowledge base.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent from which to disassociate the knowledge base.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent from which to disassociate the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAgentKnowledgeBaseRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent from which to disassociate the knowledge base.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent from which to disassociate the knowledge base.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent from which to disassociate the knowledge base.
     * </p>
     * 
     * @return The version of the agent from which to disassociate the knowledge base.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent from which to disassociate the knowledge base.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent from which to disassociate the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAgentKnowledgeBaseRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to disassociate.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to disassociate.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to disassociate.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to disassociate.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to disassociate.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAgentKnowledgeBaseRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateAgentKnowledgeBaseRequest == false)
            return false;
        DisassociateAgentKnowledgeBaseRequest other = (DisassociateAgentKnowledgeBaseRequest) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateAgentKnowledgeBaseRequest clone() {
        return (DisassociateAgentKnowledgeBaseRequest) super.clone();
    }

}
