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
 * Contains the response to a <code>DescribeAgentVersions</code> request.
 * </p>
 */
public class DescribeAgentVersionsResult implements Serializable, Cloneable {

    /**
     * The agent versions for the specified stack or configuration manager.
     * Note that this value is the complete version number, not the
     * abbreviated number used by the console.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AgentVersion> agentVersions;

    /**
     * The agent versions for the specified stack or configuration manager.
     * Note that this value is the complete version number, not the
     * abbreviated number used by the console.
     *
     * @return The agent versions for the specified stack or configuration manager.
     *         Note that this value is the complete version number, not the
     *         abbreviated number used by the console.
     */
    public java.util.List<AgentVersion> getAgentVersions() {
        if (agentVersions == null) {
              agentVersions = new com.amazonaws.internal.ListWithAutoConstructFlag<AgentVersion>();
              agentVersions.setAutoConstruct(true);
        }
        return agentVersions;
    }
    
    /**
     * The agent versions for the specified stack or configuration manager.
     * Note that this value is the complete version number, not the
     * abbreviated number used by the console.
     *
     * @param agentVersions The agent versions for the specified stack or configuration manager.
     *         Note that this value is the complete version number, not the
     *         abbreviated number used by the console.
     */
    public void setAgentVersions(java.util.Collection<AgentVersion> agentVersions) {
        if (agentVersions == null) {
            this.agentVersions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AgentVersion> agentVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AgentVersion>(agentVersions.size());
        agentVersionsCopy.addAll(agentVersions);
        this.agentVersions = agentVersionsCopy;
    }
    
    /**
     * The agent versions for the specified stack or configuration manager.
     * Note that this value is the complete version number, not the
     * abbreviated number used by the console.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAgentVersions(java.util.Collection)} or {@link
     * #withAgentVersions(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentVersions The agent versions for the specified stack or configuration manager.
     *         Note that this value is the complete version number, not the
     *         abbreviated number used by the console.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAgentVersionsResult withAgentVersions(AgentVersion... agentVersions) {
        if (getAgentVersions() == null) setAgentVersions(new java.util.ArrayList<AgentVersion>(agentVersions.length));
        for (AgentVersion value : agentVersions) {
            getAgentVersions().add(value);
        }
        return this;
    }
    
    /**
     * The agent versions for the specified stack or configuration manager.
     * Note that this value is the complete version number, not the
     * abbreviated number used by the console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentVersions The agent versions for the specified stack or configuration manager.
     *         Note that this value is the complete version number, not the
     *         abbreviated number used by the console.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAgentVersionsResult withAgentVersions(java.util.Collection<AgentVersion> agentVersions) {
        if (agentVersions == null) {
            this.agentVersions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AgentVersion> agentVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AgentVersion>(agentVersions.size());
            agentVersionsCopy.addAll(agentVersions);
            this.agentVersions = agentVersionsCopy;
        }

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
        if (getAgentVersions() != null) sb.append("AgentVersions: " + getAgentVersions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAgentVersions() == null) ? 0 : getAgentVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAgentVersionsResult == false) return false;
        DescribeAgentVersionsResult other = (DescribeAgentVersionsResult)obj;
        
        if (other.getAgentVersions() == null ^ this.getAgentVersions() == null) return false;
        if (other.getAgentVersions() != null && other.getAgentVersions().equals(this.getAgentVersions()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAgentVersionsResult clone() {
        try {
            return (DescribeAgentVersionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    