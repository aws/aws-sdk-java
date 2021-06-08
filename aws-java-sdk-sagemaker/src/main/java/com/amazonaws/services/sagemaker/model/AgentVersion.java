/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Edge Manager agent version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AgentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Version of the agent.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The number of Edge Manager agents.
     * </p>
     */
    private Long agentCount;

    /**
     * <p>
     * Version of the agent.
     * </p>
     * 
     * @param version
     *        Version of the agent.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version of the agent.
     * </p>
     * 
     * @return Version of the agent.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version of the agent.
     * </p>
     * 
     * @param version
     *        Version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The number of Edge Manager agents.
     * </p>
     * 
     * @param agentCount
     *        The number of Edge Manager agents.
     */

    public void setAgentCount(Long agentCount) {
        this.agentCount = agentCount;
    }

    /**
     * <p>
     * The number of Edge Manager agents.
     * </p>
     * 
     * @return The number of Edge Manager agents.
     */

    public Long getAgentCount() {
        return this.agentCount;
    }

    /**
     * <p>
     * The number of Edge Manager agents.
     * </p>
     * 
     * @param agentCount
     *        The number of Edge Manager agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withAgentCount(Long agentCount) {
        setAgentCount(agentCount);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getAgentCount() != null)
            sb.append("AgentCount: ").append(getAgentCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentVersion == false)
            return false;
        AgentVersion other = (AgentVersion) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getAgentCount() == null ^ this.getAgentCount() == null)
            return false;
        if (other.getAgentCount() != null && other.getAgentCount().equals(this.getAgentCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getAgentCount() == null) ? 0 : getAgentCount().hashCode());
        return hashCode;
    }

    @Override
    public AgentVersion clone() {
        try {
            return (AgentVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AgentVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
