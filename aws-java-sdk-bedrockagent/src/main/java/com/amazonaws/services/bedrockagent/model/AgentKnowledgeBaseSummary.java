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
 * Contains details about a knowledge base associated with an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentKnowledgeBaseSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentKnowledgeBaseSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the knowledge base associated with an agent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the knowledge base associated with an agent.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * Specifies whether the agent uses the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     */
    private String knowledgeBaseState;
    /**
     * <p>
     * The time at which the knowledge base associated with an agent was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The description of the knowledge base associated with an agent.
     * </p>
     * 
     * @param description
     *        The description of the knowledge base associated with an agent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the knowledge base associated with an agent.
     * </p>
     * 
     * @return The description of the knowledge base associated with an agent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the knowledge base associated with an agent.
     * </p>
     * 
     * @param description
     *        The description of the knowledge base associated with an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBaseSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base associated with an agent.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base associated with an agent.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base associated with an agent.
     * </p>
     * 
     * @return The unique identifier of the knowledge base associated with an agent.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base associated with an agent.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base associated with an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBaseSummary withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the agent uses the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param knowledgeBaseState
     *        Specifies whether the agent uses the knowledge base or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @see KnowledgeBaseState
     */

    public void setKnowledgeBaseState(String knowledgeBaseState) {
        this.knowledgeBaseState = knowledgeBaseState;
    }

    /**
     * <p>
     * Specifies whether the agent uses the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @return Specifies whether the agent uses the knowledge base or not when sending an <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *         >InvokeAgent</a> request.
     * @see KnowledgeBaseState
     */

    public String getKnowledgeBaseState() {
        return this.knowledgeBaseState;
    }

    /**
     * <p>
     * Specifies whether the agent uses the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param knowledgeBaseState
     *        Specifies whether the agent uses the knowledge base or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseState
     */

    public AgentKnowledgeBaseSummary withKnowledgeBaseState(String knowledgeBaseState) {
        setKnowledgeBaseState(knowledgeBaseState);
        return this;
    }

    /**
     * <p>
     * Specifies whether the agent uses the knowledge base or not when sending an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html">InvokeAgent</a>
     * request.
     * </p>
     * 
     * @param knowledgeBaseState
     *        Specifies whether the agent uses the knowledge base or not when sending an <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html"
     *        >InvokeAgent</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseState
     */

    public AgentKnowledgeBaseSummary withKnowledgeBaseState(KnowledgeBaseState knowledgeBaseState) {
        this.knowledgeBaseState = knowledgeBaseState.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the knowledge base associated with an agent was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the knowledge base associated with an agent was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the knowledge base associated with an agent was last updated.
     * </p>
     * 
     * @return The time at which the knowledge base associated with an agent was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the knowledge base associated with an agent was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the knowledge base associated with an agent was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentKnowledgeBaseSummary withUpdatedAt(java.util.Date updatedAt) {
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

        if (obj instanceof AgentKnowledgeBaseSummary == false)
            return false;
        AgentKnowledgeBaseSummary other = (AgentKnowledgeBaseSummary) obj;
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseState() == null) ? 0 : getKnowledgeBaseState().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AgentKnowledgeBaseSummary clone() {
        try {
            return (AgentKnowledgeBaseSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentKnowledgeBaseSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
