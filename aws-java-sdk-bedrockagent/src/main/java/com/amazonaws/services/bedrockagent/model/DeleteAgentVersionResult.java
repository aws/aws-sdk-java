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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAgentVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The status of the agent version.
     * </p>
     */
    private String agentStatus;
    /**
     * <p>
     * The version that was deleted.
     * </p>
     */
    private String agentVersion;

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the version belongs to.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     * 
     * @return The unique identifier of the agent that the version belongs to.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentVersionResult withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The status of the agent version.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent version.
     * @see AgentStatus
     */

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The status of the agent version.
     * </p>
     * 
     * @return The status of the agent version.
     * @see AgentStatus
     */

    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * <p>
     * The status of the agent version.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public DeleteAgentVersionResult withAgentStatus(String agentStatus) {
        setAgentStatus(agentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the agent version.
     * </p>
     * 
     * @param agentStatus
     *        The status of the agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public DeleteAgentVersionResult withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The version that was deleted.
     * </p>
     * 
     * @param agentVersion
     *        The version that was deleted.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version that was deleted.
     * </p>
     * 
     * @return The version that was deleted.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version that was deleted.
     * </p>
     * 
     * @param agentVersion
     *        The version that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentVersionResult withAgentVersion(String agentVersion) {
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAgentStatus() != null)
            sb.append("AgentStatus: ").append(getAgentStatus()).append(",");
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

        if (obj instanceof DeleteAgentVersionResult == false)
            return false;
        DeleteAgentVersionResult other = (DeleteAgentVersionResult) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentStatus() == null ^ this.getAgentStatus() == null)
            return false;
        if (other.getAgentStatus() != null && other.getAgentStatus().equals(this.getAgentStatus()) == false)
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

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentStatus() == null) ? 0 : getAgentStatus().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAgentVersionResult clone() {
        try {
            return (DeleteAgentVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
