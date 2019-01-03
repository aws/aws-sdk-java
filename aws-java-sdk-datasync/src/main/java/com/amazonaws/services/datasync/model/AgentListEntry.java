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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single entry in a list of agents. <code>AgentListEntry</code> returns an array that contains a list of
 * agents when the <a>ListAgents</a> operation is called.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AgentListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     */
    private String agentArn;
    /**
     * <p>
     * The name of the agent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the agent.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentListEntry withAgentArn(String agentArn) {
        setAgentArn(agentArn);
        return this;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @param name
     *        The name of the agent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @return The name of the agent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @param name
     *        The name of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentListEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the agent.
     * </p>
     * 
     * @param status
     *        The status of the agent.
     * @see AgentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the agent.
     * </p>
     * 
     * @return The status of the agent.
     * @see AgentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the agent.
     * </p>
     * 
     * @param status
     *        The status of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentListEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the agent.
     * </p>
     * 
     * @param status
     *        The status of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AgentListEntry withStatus(AgentStatus status) {
        this.status = status.toString();
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
            sb.append("Status: ").append(getStatus());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentArn() == null) ? 0 : getAgentArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
