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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the version of the agent.
     * </p>
     */
    private AgentVersion agentVersion;

    /**
     * <p>
     * Contains details about the version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        Contains details about the version of the agent.
     */

    public void setAgentVersion(AgentVersion agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * Contains details about the version of the agent.
     * </p>
     * 
     * @return Contains details about the version of the agent.
     */

    public AgentVersion getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * Contains details about the version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        Contains details about the version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentVersionResult withAgentVersion(AgentVersion agentVersion) {
        setAgentVersion(agentVersion);
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
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAgentVersionResult == false)
            return false;
        GetAgentVersionResult other = (GetAgentVersionResult) obj;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentVersionResult clone() {
        try {
            return (GetAgentVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
