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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentActionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the action group for which to get information.
     * </p>
     */
    private String actionGroupId;
    /**
     * <p>
     * The unique identifier of the agent that the action group belongs to.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent that the action group belongs to.
     * </p>
     */
    private String agentVersion;

    /**
     * <p>
     * The unique identifier of the action group for which to get information.
     * </p>
     * 
     * @param actionGroupId
     *        The unique identifier of the action group for which to get information.
     */

    public void setActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
    }

    /**
     * <p>
     * The unique identifier of the action group for which to get information.
     * </p>
     * 
     * @return The unique identifier of the action group for which to get information.
     */

    public String getActionGroupId() {
        return this.actionGroupId;
    }

    /**
     * <p>
     * The unique identifier of the action group for which to get information.
     * </p>
     * 
     * @param actionGroupId
     *        The unique identifier of the action group for which to get information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentActionGroupRequest withActionGroupId(String actionGroupId) {
        setActionGroupId(actionGroupId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent that the action group belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the action group belongs to.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the action group belongs to.
     * </p>
     * 
     * @return The unique identifier of the agent that the action group belongs to.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the action group belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the action group belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentActionGroupRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent that the action group belongs to.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent that the action group belongs to.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent that the action group belongs to.
     * </p>
     * 
     * @return The version of the agent that the action group belongs to.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent that the action group belongs to.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent that the action group belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentActionGroupRequest withAgentVersion(String agentVersion) {
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
        if (getActionGroupId() != null)
            sb.append("ActionGroupId: ").append(getActionGroupId()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
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

        if (obj instanceof GetAgentActionGroupRequest == false)
            return false;
        GetAgentActionGroupRequest other = (GetAgentActionGroupRequest) obj;
        if (other.getActionGroupId() == null ^ this.getActionGroupId() == null)
            return false;
        if (other.getActionGroupId() != null && other.getActionGroupId().equals(this.getActionGroupId()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getActionGroupId() == null) ? 0 : getActionGroupId().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentActionGroupRequest clone() {
        return (GetAgentActionGroupRequest) super.clone();
    }

}
