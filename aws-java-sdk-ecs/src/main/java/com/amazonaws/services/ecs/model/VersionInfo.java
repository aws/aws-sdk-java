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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Docker and Amazon ECS container agent version information about a container instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/VersionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the Amazon ECS container agent.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     * </p>
     */
    private String agentHash;
    /**
     * <p>
     * The Docker version running on the container instance.
     * </p>
     */
    private String dockerVersion;

    /**
     * <p>
     * The version number of the Amazon ECS container agent.
     * </p>
     * 
     * @param agentVersion
     *        The version number of the Amazon ECS container agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version number of the Amazon ECS container agent.
     * </p>
     * 
     * @return The version number of the Amazon ECS container agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version number of the Amazon ECS container agent.
     * </p>
     * 
     * @param agentVersion
     *        The version number of the Amazon ECS container agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionInfo withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     * </p>
     * 
     * @param agentHash
     *        The Git commit hash for the Amazon ECS container agent build on the <a
     *        href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     */

    public void setAgentHash(String agentHash) {
        this.agentHash = agentHash;
    }

    /**
     * <p>
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     * </p>
     * 
     * @return The Git commit hash for the Amazon ECS container agent build on the <a
     *         href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     */

    public String getAgentHash() {
        return this.agentHash;
    }

    /**
     * <p>
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     * </p>
     * 
     * @param agentHash
     *        The Git commit hash for the Amazon ECS container agent build on the <a
     *        href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent </a> GitHub repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionInfo withAgentHash(String agentHash) {
        setAgentHash(agentHash);
        return this;
    }

    /**
     * <p>
     * The Docker version running on the container instance.
     * </p>
     * 
     * @param dockerVersion
     *        The Docker version running on the container instance.
     */

    public void setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
    }

    /**
     * <p>
     * The Docker version running on the container instance.
     * </p>
     * 
     * @return The Docker version running on the container instance.
     */

    public String getDockerVersion() {
        return this.dockerVersion;
    }

    /**
     * <p>
     * The Docker version running on the container instance.
     * </p>
     * 
     * @param dockerVersion
     *        The Docker version running on the container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionInfo withDockerVersion(String dockerVersion) {
        setDockerVersion(dockerVersion);
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
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getAgentHash() != null)
            sb.append("AgentHash: ").append(getAgentHash()).append(",");
        if (getDockerVersion() != null)
            sb.append("DockerVersion: ").append(getDockerVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionInfo == false)
            return false;
        VersionInfo other = (VersionInfo) obj;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getAgentHash() == null ^ this.getAgentHash() == null)
            return false;
        if (other.getAgentHash() != null && other.getAgentHash().equals(this.getAgentHash()) == false)
            return false;
        if (other.getDockerVersion() == null ^ this.getDockerVersion() == null)
            return false;
        if (other.getDockerVersion() != null && other.getDockerVersion().equals(this.getDockerVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getAgentHash() == null) ? 0 : getAgentHash().hashCode());
        hashCode = prime * hashCode + ((getDockerVersion() == null) ? 0 : getDockerVersion().hashCode());
        return hashCode;
    }

    @Override
    public VersionInfo clone() {
        try {
            return (VersionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.VersionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
