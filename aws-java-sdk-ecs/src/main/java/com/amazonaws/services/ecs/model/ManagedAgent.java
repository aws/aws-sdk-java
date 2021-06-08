/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the managed agent status for the container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ManagedAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedAgent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix timestamp for when the managed agent was last started.
     * </p>
     */
    private java.util.Date lastStartedAt;
    /**
     * <p>
     * The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     * <code>ExecuteCommandAgent</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The reason for why the managed agent is in the state it is in.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The last known status of the managed agent.
     * </p>
     */
    private String lastStatus;

    /**
     * <p>
     * The Unix timestamp for when the managed agent was last started.
     * </p>
     * 
     * @param lastStartedAt
     *        The Unix timestamp for when the managed agent was last started.
     */

    public void setLastStartedAt(java.util.Date lastStartedAt) {
        this.lastStartedAt = lastStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the managed agent was last started.
     * </p>
     * 
     * @return The Unix timestamp for when the managed agent was last started.
     */

    public java.util.Date getLastStartedAt() {
        return this.lastStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the managed agent was last started.
     * </p>
     * 
     * @param lastStartedAt
     *        The Unix timestamp for when the managed agent was last started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAgent withLastStartedAt(java.util.Date lastStartedAt) {
        setLastStartedAt(lastStartedAt);
        return this;
    }

    /**
     * <p>
     * The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     * <code>ExecuteCommandAgent</code>.
     * </p>
     * 
     * @param name
     *        The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     *        <code>ExecuteCommandAgent</code>.
     * @see ManagedAgentName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     * <code>ExecuteCommandAgent</code>.
     * </p>
     * 
     * @return The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     *         <code>ExecuteCommandAgent</code>.
     * @see ManagedAgentName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     * <code>ExecuteCommandAgent</code>.
     * </p>
     * 
     * @param name
     *        The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     *        <code>ExecuteCommandAgent</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedAgentName
     */

    public ManagedAgent withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     * <code>ExecuteCommandAgent</code>.
     * </p>
     * 
     * @param name
     *        The name of the managed agent. When the execute command feature is enabled, the managed agent name is
     *        <code>ExecuteCommandAgent</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedAgentName
     */

    public ManagedAgent withName(ManagedAgentName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The reason for why the managed agent is in the state it is in.
     * </p>
     * 
     * @param reason
     *        The reason for why the managed agent is in the state it is in.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for why the managed agent is in the state it is in.
     * </p>
     * 
     * @return The reason for why the managed agent is in the state it is in.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for why the managed agent is in the state it is in.
     * </p>
     * 
     * @param reason
     *        The reason for why the managed agent is in the state it is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAgent withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The last known status of the managed agent.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the managed agent.
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the managed agent.
     * </p>
     * 
     * @return The last known status of the managed agent.
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The last known status of the managed agent.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the managed agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAgent withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
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
        if (getLastStartedAt() != null)
            sb.append("LastStartedAt: ").append(getLastStartedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedAgent == false)
            return false;
        ManagedAgent other = (ManagedAgent) obj;
        if (other.getLastStartedAt() == null ^ this.getLastStartedAt() == null)
            return false;
        if (other.getLastStartedAt() != null && other.getLastStartedAt().equals(this.getLastStartedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastStartedAt() == null) ? 0 : getLastStartedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        return hashCode;
    }

    @Override
    public ManagedAgent clone() {
        try {
            return (ManagedAgent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ManagedAgentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
