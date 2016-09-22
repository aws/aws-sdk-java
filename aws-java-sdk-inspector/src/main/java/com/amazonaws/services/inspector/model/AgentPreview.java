/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * Used as a response element in the <a>PreviewAgents</a> action.
 * </p>
 */
public class AgentPreview implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     */
    private String autoScalingGroup;

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        The ID of the EC2 instance where the agent is installed.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @return The ID of the EC2 instance where the agent is installed.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        The ID of the EC2 instance where the agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param autoScalingGroup
     *        The Auto Scaling group for the EC2 instance where the agent is installed.
     */

    public void setAutoScalingGroup(String autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     * 
     * @return The Auto Scaling group for the EC2 instance where the agent is installed.
     */

    public String getAutoScalingGroup() {
        return this.autoScalingGroup;
    }

    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param autoScalingGroup
     *        The Auto Scaling group for the EC2 instance where the agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withAutoScalingGroup(String autoScalingGroup) {
        setAutoScalingGroup(autoScalingGroup);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("AgentId: " + getAgentId() + ",");
        if (getAutoScalingGroup() != null)
            sb.append("AutoScalingGroup: " + getAutoScalingGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentPreview == false)
            return false;
        AgentPreview other = (AgentPreview) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAutoScalingGroup() == null ^ this.getAutoScalingGroup() == null)
            return false;
        if (other.getAutoScalingGroup() != null && other.getAutoScalingGroup().equals(this.getAutoScalingGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroup() == null) ? 0 : getAutoScalingGroup().hashCode());
        return hashCode;
    }

    @Override
    public AgentPreview clone() {
        try {
            return (AgentPreview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
