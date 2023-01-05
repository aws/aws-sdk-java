/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the agent who accepted the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AgentInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     */
    private java.util.Date connectedToAgentTimestamp;

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * 
     * @param id
     *        The identifier of the agent who accepted the contact.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * 
     * @return The identifier of the agent who accepted the contact.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * 
     * @param id
     *        The identifier of the agent who accepted the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * 
     * @param connectedToAgentTimestamp
     *        The timestamp when the contact was connected to the agent.
     */

    public void setConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * 
     * @return The timestamp when the contact was connected to the agent.
     */

    public java.util.Date getConnectedToAgentTimestamp() {
        return this.connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * 
     * @param connectedToAgentTimestamp
     *        The timestamp when the contact was connected to the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        setConnectedToAgentTimestamp(connectedToAgentTimestamp);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getConnectedToAgentTimestamp() != null)
            sb.append("ConnectedToAgentTimestamp: ").append(getConnectedToAgentTimestamp());
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConnectedToAgentTimestamp() == null ^ this.getConnectedToAgentTimestamp() == null)
            return false;
        if (other.getConnectedToAgentTimestamp() != null && other.getConnectedToAgentTimestamp().equals(this.getConnectedToAgentTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConnectedToAgentTimestamp() == null) ? 0 : getConnectedToAgentTimestamp().hashCode());
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
        com.amazonaws.services.connect.model.transform.AgentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
