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
 * Contains details about a knowledge base that is associated with an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentKnowledgeBase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentKnowledgeBase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the agent with which the knowledge base is associated.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent with which the knowledge base is associated.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the association between the agent and the knowledge base.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the association between the agent and the knowledge base.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * Specifies whether to use the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     */
    private String knowledgeBaseState;
    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique identifier of the agent with which the knowledge base is associated.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent with which the knowledge base is associated.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent with which the knowledge base is associated.
     * </p>
     * 
     * @return The unique identifier of the agent with which the knowledge base is associated.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent with which the knowledge base is associated.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent with which the knowledge base is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBase withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent with which the knowledge base is associated.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent with which the knowledge base is associated.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent with which the knowledge base is associated.
     * </p>
     * 
     * @return The version of the agent with which the knowledge base is associated.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent with which the knowledge base is associated.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent with which the knowledge base is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBase withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the association between the agent and the knowledge base was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was created.
     * </p>
     * 
     * @return The time at which the association between the agent and the knowledge base was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the association between the agent and the knowledge base was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBase withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the association between the agent and the knowledge base.
     * </p>
     * 
     * @param description
     *        The description of the association between the agent and the knowledge base.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the association between the agent and the knowledge base.
     * </p>
     * 
     * @return The description of the association between the agent and the knowledge base.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the association between the agent and the knowledge base.
     * </p>
     * 
     * @param description
     *        The description of the association between the agent and the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBase withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the association between the agent and the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the association between the agent and the knowledge base.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the association between the agent and the knowledge base.
     * </p>
     * 
     * @return The unique identifier of the association between the agent and the knowledge base.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the association between the agent and the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the association between the agent and the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBase withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param knowledgeBaseState
     *        Specifies whether to use the knowledge base or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @see KnowledgeBaseState
     */

    public void setKnowledgeBaseState(String knowledgeBaseState) {
        this.knowledgeBaseState = knowledgeBaseState;
    }

    /**
     * <p>
     * Specifies whether to use the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @return Specifies whether to use the knowledge base or not when sending an <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *         >InvokeAgent</a> request.
     * @see KnowledgeBaseState
     */

    public String getKnowledgeBaseState() {
        return this.knowledgeBaseState;
    }

    /**
     * <p>
     * Specifies whether to use the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param knowledgeBaseState
     *        Specifies whether to use the knowledge base or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseState
     */

    public AgentKnowledgeBase withKnowledgeBaseState(String knowledgeBaseState) {
        setKnowledgeBaseState(knowledgeBaseState);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param knowledgeBaseState
     *        Specifies whether to use the knowledge base or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseState
     */

    public AgentKnowledgeBase withKnowledgeBaseState(KnowledgeBaseState knowledgeBaseState) {
        this.knowledgeBaseState = knowledgeBaseState.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the association between the agent and the knowledge base was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was last updated.
     * </p>
     * 
     * @return The time at which the association between the agent and the knowledge base was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the association between the agent and the knowledge base was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the association between the agent and the knowledge base was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBase withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getKnowledgeBaseState() != null)
            sb.append("KnowledgeBaseState: ").append(getKnowledgeBaseState()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentKnowledgeBase == false)
            return false;
        AgentKnowledgeBase other = (AgentKnowledgeBase) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getKnowledgeBaseState() == null ^ this.getKnowledgeBaseState() == null)
            return false;
        if (other.getKnowledgeBaseState() != null && other.getKnowledgeBaseState().equals(this.getKnowledgeBaseState()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseState() == null) ? 0 : getKnowledgeBaseState().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AgentKnowledgeBase clone() {
        try {
            return (AgentKnowledgeBase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentKnowledgeBaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
