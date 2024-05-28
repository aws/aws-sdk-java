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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrepareAgentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The status of the <code>DRAFT</code> version and whether it is ready for use.
     * </p>
     */
    private String agentStatus;
    /**
     * <p>
     * The version of the agent.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The time at which the <code>DRAFT</code> version of the agent was last prepared.
     * </p>
     */
    private java.util.Date preparedAt;

    /**
     * <p>
     * The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     * </p>
     * 
     * @return The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent for which the <code>DRAFT</code> version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareAgentResult withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The status of the <code>DRAFT</code> version and whether it is ready for use.
     * </p>
     * 
     * @param agentStatus
     *        The status of the <code>DRAFT</code> version and whether it is ready for use.
     * @see AgentStatus
     */

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The status of the <code>DRAFT</code> version and whether it is ready for use.
     * </p>
     * 
     * @return The status of the <code>DRAFT</code> version and whether it is ready for use.
     * @see AgentStatus
     */

    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * <p>
     * The status of the <code>DRAFT</code> version and whether it is ready for use.
     * </p>
     * 
     * @param agentStatus
     *        The status of the <code>DRAFT</code> version and whether it is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public PrepareAgentResult withAgentStatus(String agentStatus) {
        setAgentStatus(agentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the <code>DRAFT</code> version and whether it is ready for use.
     * </p>
     * 
     * @param agentStatus
     *        The status of the <code>DRAFT</code> version and whether it is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public PrepareAgentResult withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @return The version of the agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareAgentResult withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The time at which the <code>DRAFT</code> version of the agent was last prepared.
     * </p>
     * 
     * @param preparedAt
     *        The time at which the <code>DRAFT</code> version of the agent was last prepared.
     */

    public void setPreparedAt(java.util.Date preparedAt) {
        this.preparedAt = preparedAt;
    }

    /**
     * <p>
     * The time at which the <code>DRAFT</code> version of the agent was last prepared.
     * </p>
     * 
     * @return The time at which the <code>DRAFT</code> version of the agent was last prepared.
     */

    public java.util.Date getPreparedAt() {
        return this.preparedAt;
    }

    /**
     * <p>
     * The time at which the <code>DRAFT</code> version of the agent was last prepared.
     * </p>
     * 
     * @param preparedAt
     *        The time at which the <code>DRAFT</code> version of the agent was last prepared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareAgentResult withPreparedAt(java.util.Date preparedAt) {
        setPreparedAt(preparedAt);
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
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getPreparedAt() != null)
            sb.append("PreparedAt: ").append(getPreparedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrepareAgentResult == false)
            return false;
        PrepareAgentResult other = (PrepareAgentResult) obj;
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
        if (other.getPreparedAt() == null ^ this.getPreparedAt() == null)
            return false;
        if (other.getPreparedAt() != null && other.getPreparedAt().equals(this.getPreparedAt()) == false)
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
        hashCode = prime * hashCode + ((getPreparedAt() == null) ? 0 : getPreparedAt().hashCode());
        return hashCode;
    }

    @Override
    public PrepareAgentResult clone() {
        try {
            return (PrepareAgentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
