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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDataCollectionByAgentIdsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the agents or connector that were instructed to stop collecting data. Information includes the
     * agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was
     * updated.
     * </p>
     */
    private java.util.List<AgentConfigurationStatus> agentsConfigurationStatus;

    /**
     * <p>
     * Information about the agents or connector that were instructed to stop collecting data. Information includes the
     * agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was
     * updated.
     * </p>
     * 
     * @return Information about the agents or connector that were instructed to stop collecting data. Information
     *         includes the agent/connector ID, a description of the operation performed, and whether the
     *         agent/connector configuration was updated.
     */

    public java.util.List<AgentConfigurationStatus> getAgentsConfigurationStatus() {
        return agentsConfigurationStatus;
    }

    /**
     * <p>
     * Information about the agents or connector that were instructed to stop collecting data. Information includes the
     * agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was
     * updated.
     * </p>
     * 
     * @param agentsConfigurationStatus
     *        Information about the agents or connector that were instructed to stop collecting data. Information
     *        includes the agent/connector ID, a description of the operation performed, and whether the agent/connector
     *        configuration was updated.
     */

    public void setAgentsConfigurationStatus(java.util.Collection<AgentConfigurationStatus> agentsConfigurationStatus) {
        if (agentsConfigurationStatus == null) {
            this.agentsConfigurationStatus = null;
            return;
        }

        this.agentsConfigurationStatus = new java.util.ArrayList<AgentConfigurationStatus>(agentsConfigurationStatus);
    }

    /**
     * <p>
     * Information about the agents or connector that were instructed to stop collecting data. Information includes the
     * agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was
     * updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentsConfigurationStatus(java.util.Collection)} or
     * {@link #withAgentsConfigurationStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param agentsConfigurationStatus
     *        Information about the agents or connector that were instructed to stop collecting data. Information
     *        includes the agent/connector ID, a description of the operation performed, and whether the agent/connector
     *        configuration was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataCollectionByAgentIdsResult withAgentsConfigurationStatus(AgentConfigurationStatus... agentsConfigurationStatus) {
        if (this.agentsConfigurationStatus == null) {
            setAgentsConfigurationStatus(new java.util.ArrayList<AgentConfigurationStatus>(agentsConfigurationStatus.length));
        }
        for (AgentConfigurationStatus ele : agentsConfigurationStatus) {
            this.agentsConfigurationStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the agents or connector that were instructed to stop collecting data. Information includes the
     * agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was
     * updated.
     * </p>
     * 
     * @param agentsConfigurationStatus
     *        Information about the agents or connector that were instructed to stop collecting data. Information
     *        includes the agent/connector ID, a description of the operation performed, and whether the agent/connector
     *        configuration was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataCollectionByAgentIdsResult withAgentsConfigurationStatus(java.util.Collection<AgentConfigurationStatus> agentsConfigurationStatus) {
        setAgentsConfigurationStatus(agentsConfigurationStatus);
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
        if (getAgentsConfigurationStatus() != null)
            sb.append("AgentsConfigurationStatus: ").append(getAgentsConfigurationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDataCollectionByAgentIdsResult == false)
            return false;
        StopDataCollectionByAgentIdsResult other = (StopDataCollectionByAgentIdsResult) obj;
        if (other.getAgentsConfigurationStatus() == null ^ this.getAgentsConfigurationStatus() == null)
            return false;
        if (other.getAgentsConfigurationStatus() != null && other.getAgentsConfigurationStatus().equals(this.getAgentsConfigurationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentsConfigurationStatus() == null) ? 0 : getAgentsConfigurationStatus().hashCode());
        return hashCode;
    }

    @Override
    public StopDataCollectionByAgentIdsResult clone() {
        try {
            return (StopDataCollectionByAgentIdsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
