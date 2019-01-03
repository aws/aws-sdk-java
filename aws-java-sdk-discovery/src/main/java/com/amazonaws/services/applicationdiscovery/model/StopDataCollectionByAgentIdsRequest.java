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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDataCollectionByAgentIdsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the agents or connectors from which to stop collecting data.
     * </p>
     */
    private java.util.List<String> agentIds;

    /**
     * <p>
     * The IDs of the agents or connectors from which to stop collecting data.
     * </p>
     * 
     * @return The IDs of the agents or connectors from which to stop collecting data.
     */

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    /**
     * <p>
     * The IDs of the agents or connectors from which to stop collecting data.
     * </p>
     * 
     * @param agentIds
     *        The IDs of the agents or connectors from which to stop collecting data.
     */

    public void setAgentIds(java.util.Collection<String> agentIds) {
        if (agentIds == null) {
            this.agentIds = null;
            return;
        }

        this.agentIds = new java.util.ArrayList<String>(agentIds);
    }

    /**
     * <p>
     * The IDs of the agents or connectors from which to stop collecting data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentIds(java.util.Collection)} or {@link #withAgentIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param agentIds
     *        The IDs of the agents or connectors from which to stop collecting data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataCollectionByAgentIdsRequest withAgentIds(String... agentIds) {
        if (this.agentIds == null) {
            setAgentIds(new java.util.ArrayList<String>(agentIds.length));
        }
        for (String ele : agentIds) {
            this.agentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the agents or connectors from which to stop collecting data.
     * </p>
     * 
     * @param agentIds
     *        The IDs of the agents or connectors from which to stop collecting data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataCollectionByAgentIdsRequest withAgentIds(java.util.Collection<String> agentIds) {
        setAgentIds(agentIds);
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
        if (getAgentIds() != null)
            sb.append("AgentIds: ").append(getAgentIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDataCollectionByAgentIdsRequest == false)
            return false;
        StopDataCollectionByAgentIdsRequest other = (StopDataCollectionByAgentIdsRequest) obj;
        if (other.getAgentIds() == null ^ this.getAgentIds() == null)
            return false;
        if (other.getAgentIds() != null && other.getAgentIds().equals(this.getAgentIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentIds() == null) ? 0 : getAgentIds().hashCode());
        return hashCode;
    }

    @Override
    public StopDataCollectionByAgentIdsRequest clone() {
        return (StopDataCollectionByAgentIdsRequest) super.clone();
    }

}
