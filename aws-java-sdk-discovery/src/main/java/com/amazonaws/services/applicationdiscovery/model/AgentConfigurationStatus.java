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
 * Information about agents or connectors that were instructed to start collecting data. Information includes the
 * agent/connector ID, a description of the operation, and whether the agent/connector configuration was updated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentConfigurationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The agent/connector ID.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     * operations. The system has recorded the data collection operation. The agent/connector receives this command the
     * next time it polls for a new command.
     * </p>
     */
    private Boolean operationSucceeded;
    /**
     * <p>
     * A description of the operation performed.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The agent/connector ID.
     * </p>
     * 
     * @param agentId
     *        The agent/connector ID.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The agent/connector ID.
     * </p>
     * 
     * @return The agent/connector ID.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The agent/connector ID.
     * </p>
     * 
     * @param agentId
     *        The agent/connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfigurationStatus withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     * operations. The system has recorded the data collection operation. The agent/connector receives this command the
     * next time it polls for a new command.
     * </p>
     * 
     * @param operationSucceeded
     *        Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     *        operations. The system has recorded the data collection operation. The agent/connector receives this
     *        command the next time it polls for a new command.
     */

    public void setOperationSucceeded(Boolean operationSucceeded) {
        this.operationSucceeded = operationSucceeded;
    }

    /**
     * <p>
     * Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     * operations. The system has recorded the data collection operation. The agent/connector receives this command the
     * next time it polls for a new command.
     * </p>
     * 
     * @return Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     *         operations. The system has recorded the data collection operation. The agent/connector receives this
     *         command the next time it polls for a new command.
     */

    public Boolean getOperationSucceeded() {
        return this.operationSucceeded;
    }

    /**
     * <p>
     * Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     * operations. The system has recorded the data collection operation. The agent/connector receives this command the
     * next time it polls for a new command.
     * </p>
     * 
     * @param operationSucceeded
     *        Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     *        operations. The system has recorded the data collection operation. The agent/connector receives this
     *        command the next time it polls for a new command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfigurationStatus withOperationSucceeded(Boolean operationSucceeded) {
        setOperationSucceeded(operationSucceeded);
        return this;
    }

    /**
     * <p>
     * Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     * operations. The system has recorded the data collection operation. The agent/connector receives this command the
     * next time it polls for a new command.
     * </p>
     * 
     * @return Information about the status of the <code>StartDataCollection</code> and <code>StopDataCollection</code>
     *         operations. The system has recorded the data collection operation. The agent/connector receives this
     *         command the next time it polls for a new command.
     */

    public Boolean isOperationSucceeded() {
        return this.operationSucceeded;
    }

    /**
     * <p>
     * A description of the operation performed.
     * </p>
     * 
     * @param description
     *        A description of the operation performed.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the operation performed.
     * </p>
     * 
     * @return A description of the operation performed.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the operation performed.
     * </p>
     * 
     * @param description
     *        A description of the operation performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfigurationStatus withDescription(String description) {
        setDescription(description);
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
        if (getOperationSucceeded() != null)
            sb.append("OperationSucceeded: ").append(getOperationSucceeded()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentConfigurationStatus == false)
            return false;
        AgentConfigurationStatus other = (AgentConfigurationStatus) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getOperationSucceeded() == null ^ this.getOperationSucceeded() == null)
            return false;
        if (other.getOperationSucceeded() != null && other.getOperationSucceeded().equals(this.getOperationSucceeded()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getOperationSucceeded() == null) ? 0 : getOperationSucceeded().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public AgentConfigurationStatus clone() {
        try {
            return (AgentConfigurationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.AgentConfigurationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
