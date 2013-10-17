/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a single node within a node group.
 * </p>
 */
public class NodeGroupMember implements Serializable {

    /**
     * The ID of the cache cluster to which the node belongs.
     */
    private String cacheClusterId;

    /**
     * The ID of the node within its cache cluster. A node ID is a numeric
     * identifier (0001, 0002, etc.).
     */
    private String cacheNodeId;

    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     */
    private Endpoint readEndpoint;

    /**
     * The name of the Availability Zone in which the node is located.
     */
    private String preferredAvailabilityZone;

    /**
     * The role that is currently assigned to the node - <i>primary</i> or
     * <i>replica</i>.
     */
    private String currentRole;

    /**
     * The ID of the cache cluster to which the node belongs.
     *
     * @return The ID of the cache cluster to which the node belongs.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The ID of the cache cluster to which the node belongs.
     *
     * @param cacheClusterId The ID of the cache cluster to which the node belongs.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The ID of the cache cluster to which the node belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The ID of the cache cluster to which the node belongs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroupMember withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * The ID of the node within its cache cluster. A node ID is a numeric
     * identifier (0001, 0002, etc.).
     *
     * @return The ID of the node within its cache cluster. A node ID is a numeric
     *         identifier (0001, 0002, etc.).
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }
    
    /**
     * The ID of the node within its cache cluster. A node ID is a numeric
     * identifier (0001, 0002, etc.).
     *
     * @param cacheNodeId The ID of the node within its cache cluster. A node ID is a numeric
     *         identifier (0001, 0002, etc.).
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }
    
    /**
     * The ID of the node within its cache cluster. A node ID is a numeric
     * identifier (0001, 0002, etc.).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeId The ID of the node within its cache cluster. A node ID is a numeric
     *         identifier (0001, 0002, etc.).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroupMember withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     *
     * @return Represents the information required for client programs to connect to
     *         a cache node.
     */
    public Endpoint getReadEndpoint() {
        return readEndpoint;
    }
    
    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     *
     * @param readEndpoint Represents the information required for client programs to connect to
     *         a cache node.
     */
    public void setReadEndpoint(Endpoint readEndpoint) {
        this.readEndpoint = readEndpoint;
    }
    
    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readEndpoint Represents the information required for client programs to connect to
     *         a cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroupMember withReadEndpoint(Endpoint readEndpoint) {
        this.readEndpoint = readEndpoint;
        return this;
    }

    /**
     * The name of the Availability Zone in which the node is located.
     *
     * @return The name of the Availability Zone in which the node is located.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the node is located.
     *
     * @param preferredAvailabilityZone The name of the Availability Zone in which the node is located.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the node is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone The name of the Availability Zone in which the node is located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroupMember withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * The role that is currently assigned to the node - <i>primary</i> or
     * <i>replica</i>.
     *
     * @return The role that is currently assigned to the node - <i>primary</i> or
     *         <i>replica</i>.
     */
    public String getCurrentRole() {
        return currentRole;
    }
    
    /**
     * The role that is currently assigned to the node - <i>primary</i> or
     * <i>replica</i>.
     *
     * @param currentRole The role that is currently assigned to the node - <i>primary</i> or
     *         <i>replica</i>.
     */
    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }
    
    /**
     * The role that is currently assigned to the node - <i>primary</i> or
     * <i>replica</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentRole The role that is currently assigned to the node - <i>primary</i> or
     *         <i>replica</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroupMember withCurrentRole(String currentRole) {
        this.currentRole = currentRole;
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getCacheNodeId() != null) sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getReadEndpoint() != null) sb.append("ReadEndpoint: " + getReadEndpoint() + ",");
        if (getPreferredAvailabilityZone() != null) sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCurrentRole() != null) sb.append("CurrentRole: " + getCurrentRole() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getReadEndpoint() == null) ? 0 : getReadEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getCurrentRole() == null) ? 0 : getCurrentRole().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NodeGroupMember == false) return false;
        NodeGroupMember other = (NodeGroupMember)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null) return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false) return false; 
        if (other.getReadEndpoint() == null ^ this.getReadEndpoint() == null) return false;
        if (other.getReadEndpoint() != null && other.getReadEndpoint().equals(this.getReadEndpoint()) == false) return false; 
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null) return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false) return false; 
        if (other.getCurrentRole() == null ^ this.getCurrentRole() == null) return false;
        if (other.getCurrentRole() != null && other.getCurrentRole().equals(this.getCurrentRole()) == false) return false; 
        return true;
    }
    
}
    