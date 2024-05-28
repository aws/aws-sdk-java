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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAgentKnowledgeBaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agent with which you want to associate the knowledge base.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent with which you want to associate the knowledge base.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * A description of what the agent should use the knowledge base for.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the knowledge base to associate with the agent.
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
     * The unique identifier of the agent with which you want to associate the knowledge base.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent with which you want to associate the knowledge base.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent with which you want to associate the knowledge base.
     * </p>
     * 
     * @return The unique identifier of the agent with which you want to associate the knowledge base.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent with which you want to associate the knowledge base.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent with which you want to associate the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAgentKnowledgeBaseRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent with which you want to associate the knowledge base.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent with which you want to associate the knowledge base.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent with which you want to associate the knowledge base.
     * </p>
     * 
     * @return The version of the agent with which you want to associate the knowledge base.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent with which you want to associate the knowledge base.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent with which you want to associate the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAgentKnowledgeBaseRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * A description of what the agent should use the knowledge base for.
     * </p>
     * 
     * @param description
     *        A description of what the agent should use the knowledge base for.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of what the agent should use the knowledge base for.
     * </p>
     * 
     * @return A description of what the agent should use the knowledge base for.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of what the agent should use the knowledge base for.
     * </p>
     * 
     * @param description
     *        A description of what the agent should use the knowledge base for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAgentKnowledgeBaseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to associate with the agent.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to associate with the agent.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to associate with the agent.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to associate with the agent.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to associate with the agent.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to associate with the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAgentKnowledgeBaseRequest withKnowledgeBaseId(String knowledgeBaseId) {
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

    public AssociateAgentKnowledgeBaseRequest withKnowledgeBaseState(String knowledgeBaseState) {
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

    public AssociateAgentKnowledgeBaseRequest withKnowledgeBaseState(KnowledgeBaseState knowledgeBaseState) {
        this.knowledgeBaseState = knowledgeBaseState.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getKnowledgeBaseState() != null)
            sb.append("KnowledgeBaseState: ").append(getKnowledgeBaseState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAgentKnowledgeBaseRequest == false)
            return false;
        AssociateAgentKnowledgeBaseRequest other = (AssociateAgentKnowledgeBaseRequest) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseState() == null) ? 0 : getKnowledgeBaseState().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAgentKnowledgeBaseRequest clone() {
        return (AssociateAgentKnowledgeBaseRequest) super.clone();
    }

}
