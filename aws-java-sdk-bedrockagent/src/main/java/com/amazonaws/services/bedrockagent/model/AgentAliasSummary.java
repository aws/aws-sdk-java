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
 * Contains details about an alias of an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentAliasSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAliasSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details about
     * </p>
     */
    private String agentAliasId;
    /**
     * <p>
     * The name of the alias.
     * </p>
     */
    private String agentAliasName;
    /**
     * <p>
     * The status of the alias.
     * </p>
     */
    private String agentAliasStatus;
    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains details about the version of the agent with which the alias is associated.
     * </p>
     */
    private java.util.List<AgentAliasRoutingConfigurationListItem> routingConfiguration;
    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * Contains details about
     * </p>
     * 
     * @param agentAliasId
     *        Contains details about
     */

    public void setAgentAliasId(String agentAliasId) {
        this.agentAliasId = agentAliasId;
    }

    /**
     * <p>
     * Contains details about
     * </p>
     * 
     * @return Contains details about
     */

    public String getAgentAliasId() {
        return this.agentAliasId;
    }

    /**
     * <p>
     * Contains details about
     * </p>
     * 
     * @param agentAliasId
     *        Contains details about
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
        return this;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @param agentAliasName
     *        The name of the alias.
     */

    public void setAgentAliasName(String agentAliasName) {
        this.agentAliasName = agentAliasName;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @return The name of the alias.
     */

    public String getAgentAliasName() {
        return this.agentAliasName;
    }

    /**
     * <p>
     * The name of the alias.
     * </p>
     * 
     * @param agentAliasName
     *        The name of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withAgentAliasName(String agentAliasName) {
        setAgentAliasName(agentAliasName);
        return this;
    }

    /**
     * <p>
     * The status of the alias.
     * </p>
     * 
     * @param agentAliasStatus
     *        The status of the alias.
     * @see AgentAliasStatus
     */

    public void setAgentAliasStatus(String agentAliasStatus) {
        this.agentAliasStatus = agentAliasStatus;
    }

    /**
     * <p>
     * The status of the alias.
     * </p>
     * 
     * @return The status of the alias.
     * @see AgentAliasStatus
     */

    public String getAgentAliasStatus() {
        return this.agentAliasStatus;
    }

    /**
     * <p>
     * The status of the alias.
     * </p>
     * 
     * @param agentAliasStatus
     *        The status of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public AgentAliasSummary withAgentAliasStatus(String agentAliasStatus) {
        setAgentAliasStatus(agentAliasStatus);
        return this;
    }

    /**
     * <p>
     * The status of the alias.
     * </p>
     * 
     * @param agentAliasStatus
     *        The status of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public AgentAliasSummary withAgentAliasStatus(AgentAliasStatus agentAliasStatus) {
        this.agentAliasStatus = agentAliasStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the alias of the agent was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     * 
     * @return The time at which the alias of the agent was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the alias of the agent was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the alias.
     * </p>
     * 
     * @param description
     *        The description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the alias.
     * </p>
     * 
     * @return The description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the alias.
     * </p>
     * 
     * @param description
     *        The description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains details about the version of the agent with which the alias is associated.
     * </p>
     * 
     * @return Contains details about the version of the agent with which the alias is associated.
     */

    public java.util.List<AgentAliasRoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * Contains details about the version of the agent with which the alias is associated.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the version of the agent with which the alias is associated.
     */

    public void setRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        if (routingConfiguration == null) {
            this.routingConfiguration = null;
            return;
        }

        this.routingConfiguration = new java.util.ArrayList<AgentAliasRoutingConfigurationListItem>(routingConfiguration);
    }

    /**
     * <p>
     * Contains details about the version of the agent with which the alias is associated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the version of the agent with which the alias is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withRoutingConfiguration(AgentAliasRoutingConfigurationListItem... routingConfiguration) {
        if (this.routingConfiguration == null) {
            setRoutingConfiguration(new java.util.ArrayList<AgentAliasRoutingConfigurationListItem>(routingConfiguration.length));
        }
        for (AgentAliasRoutingConfigurationListItem ele : routingConfiguration) {
            this.routingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details about the version of the agent with which the alias is associated.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the version of the agent with which the alias is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the alias was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     * 
     * @return The time at which the alias was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the alias was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getAgentAliasId() != null)
            sb.append("AgentAliasId: ").append(getAgentAliasId()).append(",");
        if (getAgentAliasName() != null)
            sb.append("AgentAliasName: ").append(getAgentAliasName()).append(",");
        if (getAgentAliasStatus() != null)
            sb.append("AgentAliasStatus: ").append(getAgentAliasStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration()).append(",");
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

        if (obj instanceof AgentAliasSummary == false)
            return false;
        AgentAliasSummary other = (AgentAliasSummary) obj;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
            return false;
        if (other.getAgentAliasName() == null ^ this.getAgentAliasName() == null)
            return false;
        if (other.getAgentAliasName() != null && other.getAgentAliasName().equals(this.getAgentAliasName()) == false)
            return false;
        if (other.getAgentAliasStatus() == null ^ this.getAgentAliasStatus() == null)
            return false;
        if (other.getAgentAliasStatus() != null && other.getAgentAliasStatus().equals(this.getAgentAliasStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getAgentAliasId() == null) ? 0 : getAgentAliasId().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasName() == null) ? 0 : getAgentAliasName().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasStatus() == null) ? 0 : getAgentAliasStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AgentAliasSummary clone() {
        try {
            return (AgentAliasSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentAliasSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
