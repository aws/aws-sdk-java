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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAgentVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agent that the version belongs to.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The version of the agent to delete.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     */
    private Boolean skipResourceInUseCheck;

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

    public DeleteAgentVersionRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The version of the agent to delete.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent to delete.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the agent to delete.
     * </p>
     * 
     * @return The version of the agent to delete.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the agent to delete.
     * </p>
     * 
     * @param agentVersion
     *        The version of the agent to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentVersionRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set
     *        it to <code>true</code>, the resource will be deleted even if the resource is in use.
     */

    public void setSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        this.skipResourceInUseCheck = skipResourceInUseCheck;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @return By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you
     *         set it to <code>true</code>, the resource will be deleted even if the resource is in use.
     */

    public Boolean getSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set
     *        it to <code>true</code>, the resource will be deleted even if the resource is in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentVersionRequest withSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        setSkipResourceInUseCheck(skipResourceInUseCheck);
        return this;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @return By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you
     *         set it to <code>true</code>, the resource will be deleted even if the resource is in use.
     */

    public Boolean isSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
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
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getSkipResourceInUseCheck() != null)
            sb.append("SkipResourceInUseCheck: ").append(getSkipResourceInUseCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAgentVersionRequest == false)
            return false;
        DeleteAgentVersionRequest other = (DeleteAgentVersionRequest) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getSkipResourceInUseCheck() == null ^ this.getSkipResourceInUseCheck() == null)
            return false;
        if (other.getSkipResourceInUseCheck() != null && other.getSkipResourceInUseCheck().equals(this.getSkipResourceInUseCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getSkipResourceInUseCheck() == null) ? 0 : getSkipResourceInUseCheck().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAgentVersionRequest clone() {
        return (DeleteAgentVersionRequest) super.clone();
    }

}
