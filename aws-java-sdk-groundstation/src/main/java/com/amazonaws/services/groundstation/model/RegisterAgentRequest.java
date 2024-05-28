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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/RegisterAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed information about the agent being registered.
     * </p>
     */
    private AgentDetails agentDetails;
    /**
     * <p>
     * Data for associating an agent with the capabilities it is managing.
     * </p>
     */
    private DiscoveryData discoveryData;

    /**
     * <p>
     * Detailed information about the agent being registered.
     * </p>
     * 
     * @param agentDetails
     *        Detailed information about the agent being registered.
     */

    public void setAgentDetails(AgentDetails agentDetails) {
        this.agentDetails = agentDetails;
    }

    /**
     * <p>
     * Detailed information about the agent being registered.
     * </p>
     * 
     * @return Detailed information about the agent being registered.
     */

    public AgentDetails getAgentDetails() {
        return this.agentDetails;
    }

    /**
     * <p>
     * Detailed information about the agent being registered.
     * </p>
     * 
     * @param agentDetails
     *        Detailed information about the agent being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAgentRequest withAgentDetails(AgentDetails agentDetails) {
        setAgentDetails(agentDetails);
        return this;
    }

    /**
     * <p>
     * Data for associating an agent with the capabilities it is managing.
     * </p>
     * 
     * @param discoveryData
     *        Data for associating an agent with the capabilities it is managing.
     */

    public void setDiscoveryData(DiscoveryData discoveryData) {
        this.discoveryData = discoveryData;
    }

    /**
     * <p>
     * Data for associating an agent with the capabilities it is managing.
     * </p>
     * 
     * @return Data for associating an agent with the capabilities it is managing.
     */

    public DiscoveryData getDiscoveryData() {
        return this.discoveryData;
    }

    /**
     * <p>
     * Data for associating an agent with the capabilities it is managing.
     * </p>
     * 
     * @param discoveryData
     *        Data for associating an agent with the capabilities it is managing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAgentRequest withDiscoveryData(DiscoveryData discoveryData) {
        setDiscoveryData(discoveryData);
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
        if (getAgentDetails() != null)
            sb.append("AgentDetails: ").append(getAgentDetails()).append(",");
        if (getDiscoveryData() != null)
            sb.append("DiscoveryData: ").append(getDiscoveryData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterAgentRequest == false)
            return false;
        RegisterAgentRequest other = (RegisterAgentRequest) obj;
        if (other.getAgentDetails() == null ^ this.getAgentDetails() == null)
            return false;
        if (other.getAgentDetails() != null && other.getAgentDetails().equals(this.getAgentDetails()) == false)
            return false;
        if (other.getDiscoveryData() == null ^ this.getDiscoveryData() == null)
            return false;
        if (other.getDiscoveryData() != null && other.getDiscoveryData().equals(this.getDiscoveryData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentDetails() == null) ? 0 : getAgentDetails().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryData() == null) ? 0 : getDiscoveryData().hashCode());
        return hashCode;
    }

    @Override
    public RegisterAgentRequest clone() {
        return (RegisterAgentRequest) super.clone();
    }

}
