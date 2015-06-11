/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class VersionInfo implements Serializable, Cloneable {

    /**
     * The version number of the Amazon ECS container agent.
     */
    private String agentVersion;

    /**
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     * </a> GitHub repository.
     */
    private String agentHash;

    /**
     * The Docker version running on the container instance.
     */
    private String dockerVersion;

    /**
     * The version number of the Amazon ECS container agent.
     *
     * @return The version number of the Amazon ECS container agent.
     */
    public String getAgentVersion() {
        return agentVersion;
    }
    
    /**
     * The version number of the Amazon ECS container agent.
     *
     * @param agentVersion The version number of the Amazon ECS container agent.
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }
    
    /**
     * The version number of the Amazon ECS container agent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentVersion The version number of the Amazon ECS container agent.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VersionInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     * </a> GitHub repository.
     *
     * @return The Git commit hash for the Amazon ECS container agent build on the <a
     *         href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     *         </a> GitHub repository.
     */
    public String getAgentHash() {
        return agentHash;
    }
    
    /**
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     * </a> GitHub repository.
     *
     * @param agentHash The Git commit hash for the Amazon ECS container agent build on the <a
     *         href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     *         </a> GitHub repository.
     */
    public void setAgentHash(String agentHash) {
        this.agentHash = agentHash;
    }
    
    /**
     * The Git commit hash for the Amazon ECS container agent build on the <a
     * href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     * </a> GitHub repository.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentHash The Git commit hash for the Amazon ECS container agent build on the <a
     *         href="https://github.com/aws/amazon-ecs-agent/commits/master">amazon-ecs-agent
     *         </a> GitHub repository.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VersionInfo withAgentHash(String agentHash) {
        this.agentHash = agentHash;
        return this;
    }

    /**
     * The Docker version running on the container instance.
     *
     * @return The Docker version running on the container instance.
     */
    public String getDockerVersion() {
        return dockerVersion;
    }
    
    /**
     * The Docker version running on the container instance.
     *
     * @param dockerVersion The Docker version running on the container instance.
     */
    public void setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
    }
    
    /**
     * The Docker version running on the container instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dockerVersion The Docker version running on the container instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VersionInfo withDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAgentVersion() != null) sb.append("AgentVersion: " + getAgentVersion() + ",");
        if (getAgentHash() != null) sb.append("AgentHash: " + getAgentHash() + ",");
        if (getDockerVersion() != null) sb.append("DockerVersion: " + getDockerVersion() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VersionInfo == false) return false;
        VersionInfo other = (VersionInfo)obj;
        
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null) return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false) return false; 
        if (other.getAgentHash() == null ^ this.getAgentHash() == null) return false;
        if (other.getAgentHash() != null && other.getAgentHash().equals(this.getAgentHash()) == false) return false; 
        if (other.getDockerVersion() == null ^ this.getDockerVersion() == null) return false;
        if (other.getDockerVersion() != null && other.getDockerVersion().equals(this.getDockerVersion()) == false) return false; 
        return true;
    }
    
    @Override
    public VersionInfo clone() {
        try {
            return (VersionInfo) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    