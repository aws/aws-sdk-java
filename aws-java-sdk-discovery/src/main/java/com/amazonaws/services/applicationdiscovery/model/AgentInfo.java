/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about agents or connectors associated with the user’s AWS account. Information includes agent or
 * connector IDs, IP addresses, media access control (MAC) addresses, agent or connector health, hostname where the
 * agent or connector resides, and agent version for each agent.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The agent or connector ID.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     * </p>
     */
    private String hostName;
    /**
     * <p>
     * Network details about the host where the agent or connector resides.
     * </p>
     */
    private java.util.List<AgentNetworkInfo> agentNetworkInfoList;
    /**
     * <p>
     * The ID of the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * The agent or connector version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The health of the agent or connector.
     * </p>
     */
    private String health;
    /**
     * <p>
     * Time since agent or connector health was reported.
     * </p>
     */
    private String lastHealthPingTime;
    /**
     * <p>
     * Status of the collection process for an agent or connector.
     * </p>
     */
    private String collectionStatus;
    /**
     * <p>
     * Type of agent.
     * </p>
     */
    private String agentType;
    /**
     * <p>
     * Agent's first registration timestamp in UTC.
     * </p>
     */
    private String registeredTime;

    /**
     * <p>
     * The agent or connector ID.
     * </p>
     * 
     * @param agentId
     *        The agent or connector ID.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The agent or connector ID.
     * </p>
     * 
     * @return The agent or connector ID.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The agent or connector ID.
     * </p>
     * 
     * @param agentId
     *        The agent or connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     * </p>
     * 
     * @param hostName
     *        The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     * </p>
     * 
     * @return The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p>
     * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     * </p>
     * 
     * @param hostName
     *        The name of the host where the agent or connector resides. The host can be a server or virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p>
     * Network details about the host where the agent or connector resides.
     * </p>
     * 
     * @return Network details about the host where the agent or connector resides.
     */

    public java.util.List<AgentNetworkInfo> getAgentNetworkInfoList() {
        return agentNetworkInfoList;
    }

    /**
     * <p>
     * Network details about the host where the agent or connector resides.
     * </p>
     * 
     * @param agentNetworkInfoList
     *        Network details about the host where the agent or connector resides.
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
     * Network details about the host where the agent or connector resides.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentNetworkInfoList(java.util.Collection)} or {@link #withAgentNetworkInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param agentNetworkInfoList
     *        Network details about the host where the agent or connector resides.
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
     * Network details about the host where the agent or connector resides.
     * </p>
     * 
     * @param agentNetworkInfoList
     *        Network details about the host where the agent or connector resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentNetworkInfoList(java.util.Collection<AgentNetworkInfo> agentNetworkInfoList) {
        setAgentNetworkInfoList(agentNetworkInfoList);
        return this;
    }

    /**
     * <p>
     * The ID of the connector.
     * </p>
     * 
     * @param connectorId
     *        The ID of the connector.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * The ID of the connector.
     * </p>
     * 
     * @return The ID of the connector.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * The ID of the connector.
     * </p>
     * 
     * @param connectorId
     *        The ID of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * The agent or connector version.
     * </p>
     * 
     * @param version
     *        The agent or connector version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The agent or connector version.
     * </p>
     * 
     * @return The agent or connector version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The agent or connector version.
     * </p>
     * 
     * @param version
     *        The agent or connector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The health of the agent or connector.
     * </p>
     * 
     * @param health
     *        The health of the agent or connector.
     * @see AgentStatus
     */

    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * The health of the agent or connector.
     * </p>
     * 
     * @return The health of the agent or connector.
     * @see AgentStatus
     */

    public String getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The health of the agent or connector.
     * </p>
     * 
     * @param health
     *        The health of the agent or connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentInfo withHealth(String health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The health of the agent or connector.
     * </p>
     * 
     * @param health
     *        The health of the agent or connector.
     * @see AgentStatus
     */

    public void setHealth(AgentStatus health) {
        withHealth(health);
    }

    /**
     * <p>
     * The health of the agent or connector.
     * </p>
     * 
     * @param health
     *        The health of the agent or connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentInfo withHealth(AgentStatus health) {
        this.health = health.toString();
        return this;
    }

    /**
     * <p>
     * Time since agent or connector health was reported.
     * </p>
     * 
     * @param lastHealthPingTime
     *        Time since agent or connector health was reported.
     */

    public void setLastHealthPingTime(String lastHealthPingTime) {
        this.lastHealthPingTime = lastHealthPingTime;
    }

    /**
     * <p>
     * Time since agent or connector health was reported.
     * </p>
     * 
     * @return Time since agent or connector health was reported.
     */

    public String getLastHealthPingTime() {
        return this.lastHealthPingTime;
    }

    /**
     * <p>
     * Time since agent or connector health was reported.
     * </p>
     * 
     * @param lastHealthPingTime
     *        Time since agent or connector health was reported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withLastHealthPingTime(String lastHealthPingTime) {
        setLastHealthPingTime(lastHealthPingTime);
        return this;
    }

    /**
     * <p>
     * Status of the collection process for an agent or connector.
     * </p>
     * 
     * @param collectionStatus
     *        Status of the collection process for an agent or connector.
     */

    public void setCollectionStatus(String collectionStatus) {
        this.collectionStatus = collectionStatus;
    }

    /**
     * <p>
     * Status of the collection process for an agent or connector.
     * </p>
     * 
     * @return Status of the collection process for an agent or connector.
     */

    public String getCollectionStatus() {
        return this.collectionStatus;
    }

    /**
     * <p>
     * Status of the collection process for an agent or connector.
     * </p>
     * 
     * @param collectionStatus
     *        Status of the collection process for an agent or connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withCollectionStatus(String collectionStatus) {
        setCollectionStatus(collectionStatus);
        return this;
    }

    /**
     * <p>
     * Type of agent.
     * </p>
     * 
     * @param agentType
     *        Type of agent.
     */

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    /**
     * <p>
     * Type of agent.
     * </p>
     * 
     * @return Type of agent.
     */

    public String getAgentType() {
        return this.agentType;
    }

    /**
     * <p>
     * Type of agent.
     * </p>
     * 
     * @param agentType
     *        Type of agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentType(String agentType) {
        setAgentType(agentType);
        return this;
    }

    /**
     * <p>
     * Agent's first registration timestamp in UTC.
     * </p>
     * 
     * @param registeredTime
     *        Agent's first registration timestamp in UTC.
     */

    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
    }

    /**
     * <p>
     * Agent's first registration timestamp in UTC.
     * </p>
     * 
     * @return Agent's first registration timestamp in UTC.
     */

    public String getRegisteredTime() {
        return this.registeredTime;
    }

    /**
     * <p>
     * Agent's first registration timestamp in UTC.
     * </p>
     * 
     * @param registeredTime
     *        Agent's first registration timestamp in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withRegisteredTime(String registeredTime) {
        setRegisteredTime(registeredTime);
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
        if (getHostName() != null)
            sb.append("HostName: ").append(getHostName()).append(",");
        if (getAgentNetworkInfoList() != null)
            sb.append("AgentNetworkInfoList: ").append(getAgentNetworkInfoList()).append(",");
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth()).append(",");
        if (getLastHealthPingTime() != null)
            sb.append("LastHealthPingTime: ").append(getLastHealthPingTime()).append(",");
        if (getCollectionStatus() != null)
            sb.append("CollectionStatus: ").append(getCollectionStatus()).append(",");
        if (getAgentType() != null)
            sb.append("AgentType: ").append(getAgentType()).append(",");
        if (getRegisteredTime() != null)
            sb.append("RegisteredTime: ").append(getRegisteredTime());
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
        if (other.getLastHealthPingTime() == null ^ this.getLastHealthPingTime() == null)
            return false;
        if (other.getLastHealthPingTime() != null && other.getLastHealthPingTime().equals(this.getLastHealthPingTime()) == false)
            return false;
        if (other.getCollectionStatus() == null ^ this.getCollectionStatus() == null)
            return false;
        if (other.getCollectionStatus() != null && other.getCollectionStatus().equals(this.getCollectionStatus()) == false)
            return false;
        if (other.getAgentType() == null ^ this.getAgentType() == null)
            return false;
        if (other.getAgentType() != null && other.getAgentType().equals(this.getAgentType()) == false)
            return false;
        if (other.getRegisteredTime() == null ^ this.getRegisteredTime() == null)
            return false;
        if (other.getRegisteredTime() != null && other.getRegisteredTime().equals(this.getRegisteredTime()) == false)
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
        hashCode = prime * hashCode + ((getLastHealthPingTime() == null) ? 0 : getLastHealthPingTime().hashCode());
        hashCode = prime * hashCode + ((getCollectionStatus() == null) ? 0 : getCollectionStatus().hashCode());
        hashCode = prime * hashCode + ((getAgentType() == null) ? 0 : getAgentType().hashCode());
        hashCode = prime * hashCode + ((getRegisteredTime() == null) ? 0 : getRegisteredTime().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.AgentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
