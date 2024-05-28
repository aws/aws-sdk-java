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
 * Contains details about a version of an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the agent to which the version belongs.
     * </p>
     */
    private String agentName;
    /**
     * <p>
     * The status of the agent to which the version belongs.
     * </p>
     */
    private String agentStatus;
    /**
     * <p>
     * The version of the agent.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The time at which the version was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the version of the agent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The details of the guardrails configuration in the agent version summary.
     * </p>
     */
    private GuardrailConfiguration guardrailConfiguration;
    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The name of the agent to which the version belongs.
     * </p>
     * 
     * @param agentName
     *        The name of the agent to which the version belongs.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * The name of the agent to which the version belongs.
     * </p>
     * 
     * @return The name of the agent to which the version belongs.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * The name of the agent to which the version belongs.
     * </p>
     * 
     * @param agentName
     *        The name of the agent to which the version belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersionSummary withAgentName(String agentName) {
        setAgentName(agentName);
        return this;
    }

    /**
     * <p>
     * The status of the agent to which the version belongs.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent to which the version belongs.
     * @see AgentStatus
     */

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The status of the agent to which the version belongs.
     * </p>
     * 
     * @return The status of the agent to which the version belongs.
     * @see AgentStatus
     */

    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * <p>
     * The status of the agent to which the version belongs.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent to which the version belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentVersionSummary withAgentStatus(String agentStatus) {
        setAgentStatus(agentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the agent to which the version belongs.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent to which the version belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentVersionSummary withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @return The version of the agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersionSummary withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The time at which the version was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the version was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the version was created.
     * </p>
     * 
     * @return The time at which the version was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the version was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersionSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the version of the agent.
     * </p>
     * 
     * @param description
     *        The description of the version of the agent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the version of the agent.
     * </p>
     * 
     * @return The description of the version of the agent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the version of the agent.
     * </p>
     * 
     * @param description
     *        The description of the version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The details of the guardrails configuration in the agent version summary.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The details of the guardrails configuration in the agent version summary.
     */

    public void setGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        this.guardrailConfiguration = guardrailConfiguration;
    }

    /**
     * <p>
     * The details of the guardrails configuration in the agent version summary.
     * </p>
     * 
     * @return The details of the guardrails configuration in the agent version summary.
     */

    public GuardrailConfiguration getGuardrailConfiguration() {
        return this.guardrailConfiguration;
    }

    /**
     * <p>
     * The details of the guardrails configuration in the agent version summary.
     * </p>
     * 
     * @param guardrailConfiguration
     *        The details of the guardrails configuration in the agent version summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersionSummary withGuardrailConfiguration(GuardrailConfiguration guardrailConfiguration) {
        setGuardrailConfiguration(guardrailConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the version was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     * 
     * @return The time at which the version was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the version was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the version was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersionSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
        if (getAgentStatus() != null)
            sb.append("AgentStatus: ").append(getAgentStatus()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGuardrailConfiguration() != null)
            sb.append("GuardrailConfiguration: ").append(getGuardrailConfiguration()).append(",");
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

        if (obj instanceof AgentVersionSummary == false)
            return false;
        AgentVersionSummary other = (AgentVersionSummary) obj;
        if (other.getAgentName() == null ^ this.getAgentName() == null)
            return false;
        if (other.getAgentName() != null && other.getAgentName().equals(this.getAgentName()) == false)
            return false;
        if (other.getAgentStatus() == null ^ this.getAgentStatus() == null)
            return false;
        if (other.getAgentStatus() != null && other.getAgentStatus().equals(this.getAgentStatus()) == false)
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
        if (other.getGuardrailConfiguration() == null ^ this.getGuardrailConfiguration() == null)
            return false;
        if (other.getGuardrailConfiguration() != null && other.getGuardrailConfiguration().equals(this.getGuardrailConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getAgentStatus() == null) ? 0 : getAgentStatus().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGuardrailConfiguration() == null) ? 0 : getGuardrailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AgentVersionSummary clone() {
        try {
            return (AgentVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
