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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     */
    private String agentAliasId;
    /**
     * <p>
     * Specifies a new name for the alias.
     * </p>
     */
    private String agentAliasName;
    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Specifies a new description for the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     */
    private java.util.List<AgentAliasRoutingConfigurationListItem> routingConfiguration;

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of the alias.
     */

    public void setAgentAliasId(String agentAliasId) {
        this.agentAliasId = agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @return The unique identifier of the alias.
     */

    public String getAgentAliasId() {
        return this.agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentAliasRequest withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
        return this;
    }

    /**
     * <p>
     * Specifies a new name for the alias.
     * </p>
     * 
     * @param agentAliasName
     *        Specifies a new name for the alias.
     */

    public void setAgentAliasName(String agentAliasName) {
        this.agentAliasName = agentAliasName;
    }

    /**
     * <p>
     * Specifies a new name for the alias.
     * </p>
     * 
     * @return Specifies a new name for the alias.
     */

    public String getAgentAliasName() {
        return this.agentAliasName;
    }

    /**
     * <p>
     * Specifies a new name for the alias.
     * </p>
     * 
     * @param agentAliasName
     *        Specifies a new name for the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentAliasRequest withAgentAliasName(String agentAliasName) {
        setAgentAliasName(agentAliasName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @return The unique identifier of the agent.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentAliasRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Specifies a new description for the alias.
     * </p>
     * 
     * @param description
     *        Specifies a new description for the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies a new description for the alias.
     * </p>
     * 
     * @return Specifies a new description for the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies a new description for the alias.
     * </p>
     * 
     * @param description
     *        Specifies a new description for the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     * 
     * @return Contains details about the routing configuration of the alias.
     */

    public java.util.List<AgentAliasRoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the routing configuration of the alias.
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
     * Contains details about the routing configuration of the alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the routing configuration of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentAliasRequest withRoutingConfiguration(AgentAliasRoutingConfigurationListItem... routingConfiguration) {
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
     * Contains details about the routing configuration of the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the routing configuration of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentAliasRequest withRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentAliasRequest == false)
            return false;
        UpdateAgentAliasRequest other = (UpdateAgentAliasRequest) obj;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
            return false;
        if (other.getAgentAliasName() == null ^ this.getAgentAliasName() == null)
            return false;
        if (other.getAgentAliasName() != null && other.getAgentAliasName().equals(this.getAgentAliasName()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentAliasId() == null) ? 0 : getAgentAliasId().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasName() == null) ? 0 : getAgentAliasName().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentAliasRequest clone() {
        return (UpdateAgentAliasRequest) super.clone();
    }

}
