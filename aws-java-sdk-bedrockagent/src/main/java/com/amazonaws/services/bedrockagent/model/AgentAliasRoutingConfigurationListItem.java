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
 * Contains details about the routing configuration of the alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentAliasRoutingConfigurationListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAliasRoutingConfigurationListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the agent with which the alias is associated.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * Information on the Provisioned Throughput assigned to an agent alias.
     * </p>
     */
    private String provisionedThroughput;

    /**
     * <p>
     * The version of the agent with which the alias is associated.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent with which the alias is associated.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent with which the alias is associated.
     * </p>
     * 
     * @return The version of the agent with which the alias is associated.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent with which the alias is associated.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent with which the alias is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasRoutingConfigurationListItem withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * Information on the Provisioned Throughput assigned to an agent alias.
     * </p>
     * 
     * @param provisionedThroughput
     *        Information on the Provisioned Throughput assigned to an agent alias.
     */

    public void setProvisionedThroughput(String provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Information on the Provisioned Throughput assigned to an agent alias.
     * </p>
     * 
     * @return Information on the Provisioned Throughput assigned to an agent alias.
     */

    public String getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * Information on the Provisioned Throughput assigned to an agent alias.
     * </p>
     * 
     * @param provisionedThroughput
     *        Information on the Provisioned Throughput assigned to an agent alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasRoutingConfigurationListItem withProvisionedThroughput(String provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
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
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentAliasRoutingConfigurationListItem == false)
            return false;
        AgentAliasRoutingConfigurationListItem other = (AgentAliasRoutingConfigurationListItem) obj;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        return hashCode;
    }

    @Override
    public AgentAliasRoutingConfigurationListItem clone() {
        try {
            return (AgentAliasRoutingConfigurationListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentAliasRoutingConfigurationListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
