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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single entry in a list (or array) of DataSync agents when you call the <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_ListAgents.html">ListAgents</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AgentListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a DataSync agent.
     * </p>
     */
    private String agentArn;
    /**
     * <p>
     * The name of an agent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of an agent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     * longer. This can happen for a few reasons. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     * >What do I do if my agent is offline?</a>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The platform-related details about the agent, such as the version number.
     * </p>
     */
    private Platform platform;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a DataSync agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of a DataSync agent.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a DataSync agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a DataSync agent.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a DataSync agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of a DataSync agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentListEntry withAgentArn(String agentArn) {
        setAgentArn(agentArn);
        return this;
    }

    /**
     * <p>
     * The name of an agent.
     * </p>
     * 
     * @param name
     *        The name of an agent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an agent.
     * </p>
     * 
     * @return The name of an agent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an agent.
     * </p>
     * 
     * @param name
     *        The name of an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentListEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of an agent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     * longer. This can happen for a few reasons. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     * >What do I do if my agent is offline?</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of an agent.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     *        longer. This can happen for a few reasons. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     *        >What do I do if my agent is offline?</a>
     *        </p>
     *        </li>
     * @see AgentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an agent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     * longer. This can happen for a few reasons. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     * >What do I do if my agent is offline?</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of an agent.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes
     *         or longer. This can happen for a few reasons. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     *         >What do I do if my agent is offline?</a>
     *         </p>
     *         </li>
     * @see AgentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an agent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     * longer. This can happen for a few reasons. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     * >What do I do if my agent is offline?</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of an agent.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     *        longer. This can happen for a few reasons. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     *        >What do I do if my agent is offline?</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentListEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an agent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     * longer. This can happen for a few reasons. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     * >What do I do if my agent is offline?</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of an agent.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the status is <code>ONLINE</code>, the agent is configured properly and ready to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the status is <code>OFFLINE</code>, the agent has been out of contact with DataSync for five minutes or
     *        longer. This can happen for a few reasons. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-agents.html#troubleshoot-agent-offline"
     *        >What do I do if my agent is offline?</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentListEntry withStatus(AgentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The platform-related details about the agent, such as the version number.
     * </p>
     * 
     * @param platform
     *        The platform-related details about the agent, such as the version number.
     */

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform-related details about the agent, such as the version number.
     * </p>
     * 
     * @return The platform-related details about the agent, such as the version number.
     */

    public Platform getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform-related details about the agent, such as the version number.
     * </p>
     * 
     * @param platform
     *        The platform-related details about the agent, such as the version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentListEntry withPlatform(Platform platform) {
        setPlatform(platform);
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
        if (getAgentArn() != null)
            sb.append("AgentArn: ").append(getAgentArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentListEntry == false)
            return false;
        AgentListEntry other = (AgentListEntry) obj;
        if (other.getAgentArn() == null ^ this.getAgentArn() == null)
            return false;
        if (other.getAgentArn() != null && other.getAgentArn().equals(this.getAgentArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentArn() == null) ? 0 : getAgentArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public AgentListEntry clone() {
        try {
            return (AgentListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.AgentListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
