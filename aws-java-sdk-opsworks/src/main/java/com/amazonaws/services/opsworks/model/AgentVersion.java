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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an agent version.
 * </p>
 */
public class AgentVersion implements Serializable, Cloneable {

    /**
     * The agent version.
     */
    private String version;

    /**
     * The configuration manager.
     */
    private StackConfigurationManager configurationManager;

    /**
     * The agent version.
     *
     * @return The agent version.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The agent version.
     *
     * @param version The agent version.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The agent version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version The agent version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AgentVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * The configuration manager.
     *
     * @return The configuration manager.
     */
    public StackConfigurationManager getConfigurationManager() {
        return configurationManager;
    }
    
    /**
     * The configuration manager.
     *
     * @param configurationManager The configuration manager.
     */
    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }
    
    /**
     * The configuration manager.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationManager The configuration manager.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AgentVersion withConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
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
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getConfigurationManager() != null) sb.append("ConfigurationManager: " + getConfigurationManager() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationManager() == null) ? 0 : getConfigurationManager().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AgentVersion == false) return false;
        AgentVersion other = (AgentVersion)obj;
        
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null) return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false) return false; 
        return true;
    }
    
    @Override
    public AgentVersion clone() {
        try {
            return (AgentVersion) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    