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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * <p>
 * Information about agents associated with the user’s AWS account. Information includes agent IDs, IP addresses, media
 * access control (MAC) addresses, agent health, hostname where the agent resides, and agent version for each agent.
 * </p>
 */
public class AgentInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The agent ID.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The name of the host where the agent resides. The host can be a server or virtual machine.
     * </p>
     */
    private String hostName;
    /**
     * <p>
     * Network details about the host where the agent resides.
     * </p>
     */
    private java.util.List<AgentNetworkInfo> agentNetworkInfoList;
    /**
     * <p>
     * This data type is currently not valid.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * The agent version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The health of the agent.
     * </p>
     */
    private String health;

    /**
     * <p>
     * The agent ID.
     * </p>
     * 
     * @param agentId
     *        The agent ID.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The agent ID.
     * </p>
     * 
     * @return The agent ID.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The agent ID.
     * </p>
     * 
     * @param agentId
     *        The agent ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The name of the host where the agent resides. The host can be a server or virtual machine.
     * </p>
     * 
     * @param hostName
     *        The name of the host where the agent resides. The host can be a server or virtual machine.
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * The name of the host where the agent resides. The host can be a server or virtual machine.
     * </p>
     * 
     * @return The name of the host where the agent resides. The host can be a server or virtual machine.
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p>
     * The name of the host where the agent resides. The host can be a server or virtual machine.
     * </p>
     * 
     * @param hostName
     *        The name of the host where the agent resides. The host can be a server or virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p>
     * Network details about the host where the agent resides.
     * </p>
     * 
     * @return Network details about the host where the agent resides.
     */

    public java.util.List<AgentNetworkInfo> getAgentNetworkInfoList() {
        return agentNetworkInfoList;
    }

    /**
     * <p>
     * Network details about the host where the agent resides.
     * </p>
     * 
     * @param agentNetworkInfoList
     *        Network details about the host where the agent resides.
     */

    public void setAgentNetworkInfoList(java.util.Collection<AgentNetworkInfo> agentNetworkInfoList) {
        if (agentNetworkInfoList == null) {
            this.agentNetworkInfoList = null;
            return;
        }

        this.agentNetworkInfoList = new java.util.ArrayList<AgentNetworkInfo>(agentNetworkInfoList);
    }

    /**
     * <p>
     * Network details about the host where the agent resides.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentNetworkInfoList(java.util.Collection)} or {@link #withAgentNetworkInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param agentNetworkInfoList
     *        Network details about the host where the agent resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentNetworkInfoList(AgentNetworkInfo... agentNetworkInfoList) {
        if (this.agentNetworkInfoList == null) {
            setAgentNetworkInfoList(new java.util.ArrayList<AgentNetworkInfo>(agentNetworkInfoList.length));
        }
        for (AgentNetworkInfo ele : agentNetworkInfoList) {
            this.agentNetworkInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Network details about the host where the agent resides.
     * </p>
     * 
     * @param agentNetworkInfoList
     *        Network details about the host where the agent resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentNetworkInfoList(java.util.Collection<AgentNetworkInfo> agentNetworkInfoList) {
        setAgentNetworkInfoList(agentNetworkInfoList);
        return this;
    }

    /**
     * <p>
     * This data type is currently not valid.
     * </p>
     * 
     * @param connectorId
     *        This data type is currently not valid.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * This data type is currently not valid.
     * </p>
     * 
     * @return This data type is currently not valid.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * This data type is currently not valid.
     * </p>
     * 
     * @param connectorId
     *        This data type is currently not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * The agent version.
     * </p>
     * 
     * @param version
     *        The agent version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The agent version.
     * </p>
     * 
     * @return The agent version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The agent version.
     * </p>
     * 
     * @param version
     *        The agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The health of the agent.
     * </p>
     * 
     * @param health
     *        The health of the agent.
     * @see AgentStatus
     */

    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * The health of the agent.
     * </p>
     * 
     * @return The health of the agent.
     * @see AgentStatus
     */

    public String getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The health of the agent.
     * </p>
     * 
     * @param health
     *        The health of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentInfo withHealth(String health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The health of the agent.
     * </p>
     * 
     * @param health
     *        The health of the agent.
     * @see AgentStatus
     */

    public void setHealth(AgentStatus health) {
        this.health = health.toString();
    }

    /**
     * <p>
     * The health of the agent.
     * </p>
     * 
     * @param health
     *        The health of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentInfo withHealth(AgentStatus health) {
        setHealth(health);
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
        if (getHostName() != null)
            sb.append("HostName: " + getHostName() + ",");
        if (getAgentNetworkInfoList() != null)
            sb.append("AgentNetworkInfoList: " + getAgentNetworkInfoList() + ",");
        if (getConnectorId() != null)
            sb.append("ConnectorId: " + getConnectorId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getHealth() != null)
            sb.append("Health: " + getHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentInfo == false)
            return false;
        AgentInfo other = (AgentInfo) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getAgentNetworkInfoList() == null ^ this.getAgentNetworkInfoList() == null)
            return false;
        if (other.getAgentNetworkInfoList() != null && other.getAgentNetworkInfoList().equals(this.getAgentNetworkInfoList()) == false)
            return false;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getAgentNetworkInfoList() == null) ? 0 : getAgentNetworkInfoList().hashCode());
        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        return hashCode;
    }

    @Override
    public AgentInfo clone() {
        try {
            return (AgentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
