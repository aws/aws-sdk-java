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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the agent or data collector to be deleted along with the optional configurations for error
 * handling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAgent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the agent or data collector to delete.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     * HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it to be
     * re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the agent or data collector to delete.
     * </p>
     * 
     * @param agentId
     *        The ID of the agent or data collector to delete.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The ID of the agent or data collector to delete.
     * </p>
     * 
     * @return The ID of the agent or data collector to delete.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The ID of the agent or data collector to delete.
     * </p>
     * 
     * @param agentId
     *        The ID of the agent or data collector to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgent withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     * HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it to be
     * re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     * </p>
     * 
     * @param force
     *        Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     *        HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it
     *        to be re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     * HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it to be
     * re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     * </p>
     * 
     * @return Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     *         HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it
     *         to be re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     * HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it to be
     * re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     * </p>
     * 
     * @param force
     *        Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     *        HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it
     *        to be re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgent withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     * HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it to be
     * re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     * </p>
     * 
     * @return Optional flag used to force delete an agent or data collector. It is needed to delete any agent in
     *         HEALTHY/UNHEALTHY/RUNNING status. Note that deleting an agent that is actively reporting health causes it
     *         to be re-registered with a different agent ID after data collector re-connects with Amazon Web Services.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAgent == false)
            return false;
        DeleteAgent other = (DeleteAgent) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAgent clone() {
        try {
            return (DeleteAgent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.DeleteAgentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
