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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentActionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the action group.
     * </p>
     */
    private AgentActionGroup agentActionGroup;

    /**
     * <p>
     * Contains details about the action group.
     * </p>
     * 
     * @param agentActionGroup
     *        Contains details about the action group.
     */

    public void setAgentActionGroup(AgentActionGroup agentActionGroup) {
        this.agentActionGroup = agentActionGroup;
    }

    /**
     * <p>
     * Contains details about the action group.
     * </p>
     * 
     * @return Contains details about the action group.
     */

    public AgentActionGroup getAgentActionGroup() {
        return this.agentActionGroup;
    }

    /**
     * <p>
     * Contains details about the action group.
     * </p>
     * 
     * @param agentActionGroup
     *        Contains details about the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentActionGroupResult withAgentActionGroup(AgentActionGroup agentActionGroup) {
        setAgentActionGroup(agentActionGroup);
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
        if (getAgentActionGroup() != null)
            sb.append("AgentActionGroup: ").append(getAgentActionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAgentActionGroupResult == false)
            return false;
        GetAgentActionGroupResult other = (GetAgentActionGroupResult) obj;
        if (other.getAgentActionGroup() == null ^ this.getAgentActionGroup() == null)
            return false;
        if (other.getAgentActionGroup() != null && other.getAgentActionGroup().equals(this.getAgentActionGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentActionGroup() == null) ? 0 : getAgentActionGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentActionGroupResult clone() {
        try {
            return (GetAgentActionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
