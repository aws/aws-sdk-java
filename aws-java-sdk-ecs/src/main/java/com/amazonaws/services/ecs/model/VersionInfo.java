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
     * 
     */
    private String agentVersion;

    /**
     * 
     */
    private String agentHash;

    /**
     * 
     */
    private String dockerVersion;

    /**
     * 
     *
     * @return 
     */
    public String getAgentVersion() {
        return agentVersion;
    }
    
    /**
     * 
     *
     * @param agentVersion 
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentVersion 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VersionInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getAgentHash() {
        return agentHash;
    }
    
    /**
     * 
     *
     * @param agentHash 
     */
    public void setAgentHash(String agentHash) {
        this.agentHash = agentHash;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentHash 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VersionInfo withAgentHash(String agentHash) {
        this.agentHash = agentHash;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getDockerVersion() {
        return dockerVersion;
    }
    
    /**
     * 
     *
     * @param dockerVersion 
     */
    public void setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dockerVersion 
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
    