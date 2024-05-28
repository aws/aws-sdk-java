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
 * Contains details about the history of the alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentAliasHistoryEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAliasHistoryEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date that the alias stopped being associated to the version in the <code>routingConfiguration</code> object
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Contains details about the version of the agent with which the alias is associated.
     * </p>
     */
    private java.util.List<AgentAliasRoutingConfigurationListItem> routingConfiguration;
    /**
     * <p>
     * The date that the alias began being associated to the version in the <code>routingConfiguration</code> object.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The date that the alias stopped being associated to the version in the <code>routingConfiguration</code> object
     * </p>
     * 
     * @param endDate
     *        The date that the alias stopped being associated to the version in the <code>routingConfiguration</code>
     *        object
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date that the alias stopped being associated to the version in the <code>routingConfiguration</code> object
     * </p>
     * 
     * @return The date that the alias stopped being associated to the version in the <code>routingConfiguration</code>
     *         object
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date that the alias stopped being associated to the version in the <code>routingConfiguration</code> object
     * </p>
     * 
     * @param endDate
     *        The date that the alias stopped being associated to the version in the <code>routingConfiguration</code>
     *        object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasHistoryEvent withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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

    public AgentAliasHistoryEvent withRoutingConfiguration(AgentAliasRoutingConfigurationListItem... routingConfiguration) {
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

    public AgentAliasHistoryEvent withRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * <p>
     * The date that the alias began being associated to the version in the <code>routingConfiguration</code> object.
     * </p>
     * 
     * @param startDate
     *        The date that the alias began being associated to the version in the <code>routingConfiguration</code>
     *        object.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date that the alias began being associated to the version in the <code>routingConfiguration</code> object.
     * </p>
     * 
     * @return The date that the alias began being associated to the version in the <code>routingConfiguration</code>
     *         object.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date that the alias began being associated to the version in the <code>routingConfiguration</code> object.
     * </p>
     * 
     * @param startDate
     *        The date that the alias began being associated to the version in the <code>routingConfiguration</code>
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAliasHistoryEvent withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
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
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentAliasHistoryEvent == false)
            return false;
        AgentAliasHistoryEvent other = (AgentAliasHistoryEvent) obj;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        return hashCode;
    }

    @Override
    public AgentAliasHistoryEvent clone() {
        try {
            return (AgentAliasHistoryEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentAliasHistoryEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
