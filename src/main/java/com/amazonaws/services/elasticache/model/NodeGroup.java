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
 * Represents a collection of cache nodes in a replication group.
 * </p>
 */
public class NodeGroup implements Serializable {

    /**
     * The identifier for the node group. A replication group contains only
     * one node group; therefore, the node group ID is 0001.
     */
    private String nodeGroupId;

    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     */
    private String status;

    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     */
    private Endpoint primaryEndpoint;

    /**
     * A list containing information about individual nodes within the node
     * group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroupMember> nodeGroupMembers;

    /**
     * The identifier for the node group. A replication group contains only
     * one node group; therefore, the node group ID is 0001.
     *
     * @return The identifier for the node group. A replication group contains only
     *         one node group; therefore, the node group ID is 0001.
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }
    
    /**
     * The identifier for the node group. A replication group contains only
     * one node group; therefore, the node group ID is 0001.
     *
     * @param nodeGroupId The identifier for the node group. A replication group contains only
     *         one node group; therefore, the node group ID is 0001.
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }
    
    /**
     * The identifier for the node group. A replication group contains only
     * one node group; therefore, the node group ID is 0001.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeGroupId The identifier for the node group. A replication group contains only
     *         one node group; therefore, the node group ID is 0001.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroup withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }

    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     *
     * @return The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     *
     * @param status The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     *
     * @return Represents the information required for client programs to connect to
     *         a cache node.
     */
    public Endpoint getPrimaryEndpoint() {
        return primaryEndpoint;
    }
    
    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     *
     * @param primaryEndpoint Represents the information required for client programs to connect to
     *         a cache node.
     */
    public void setPrimaryEndpoint(Endpoint primaryEndpoint) {
        this.primaryEndpoint = primaryEndpoint;
    }
    
    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primaryEndpoint Represents the information required for client programs to connect to
     *         a cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroup withPrimaryEndpoint(Endpoint primaryEndpoint) {
        this.primaryEndpoint = primaryEndpoint;
        return this;
    }

    /**
     * A list containing information about individual nodes within the node
     * group.
     *
     * @return A list containing information about individual nodes within the node
     *         group.
     */
    public java.util.List<NodeGroupMember> getNodeGroupMembers() {
        if (nodeGroupMembers == null) {
              nodeGroupMembers = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroupMember>();
              nodeGroupMembers.setAutoConstruct(true);
        }
        return nodeGroupMembers;
    }
    
    /**
     * A list containing information about individual nodes within the node
     * group.
     *
     * @param nodeGroupMembers A list containing information about individual nodes within the node
     *         group.
     */
    public void setNodeGroupMembers(java.util.Collection<NodeGroupMember> nodeGroupMembers) {
        if (nodeGroupMembers == null) {
            this.nodeGroupMembers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroupMember> nodeGroupMembersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroupMember>(nodeGroupMembers.size());
        nodeGroupMembersCopy.addAll(nodeGroupMembers);
        this.nodeGroupMembers = nodeGroupMembersCopy;
    }
    
    /**
     * A list containing information about individual nodes within the node
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeGroupMembers A list containing information about individual nodes within the node
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroup withNodeGroupMembers(NodeGroupMember... nodeGroupMembers) {
        if (getNodeGroupMembers() == null) setNodeGroupMembers(new java.util.ArrayList<NodeGroupMember>(nodeGroupMembers.length));
        for (NodeGroupMember value : nodeGroupMembers) {
            getNodeGroupMembers().add(value);
        }
        return this;
    }
    
    /**
     * A list containing information about individual nodes within the node
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeGroupMembers A list containing information about individual nodes within the node
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NodeGroup withNodeGroupMembers(java.util.Collection<NodeGroupMember> nodeGroupMembers) {
        if (nodeGroupMembers == null) {
            this.nodeGroupMembers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroupMember> nodeGroupMembersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroupMember>(nodeGroupMembers.size());
            nodeGroupMembersCopy.addAll(nodeGroupMembers);
            this.nodeGroupMembers = nodeGroupMembersCopy;
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
        if (getNodeGroupId() != null) sb.append("NodeGroupId: " + getNodeGroupId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPrimaryEndpoint() != null) sb.append("PrimaryEndpoint: " + getPrimaryEndpoint() + ",");
        if (getNodeGroupMembers() != null) sb.append("NodeGroupMembers: " + getNodeGroupMembers() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPrimaryEndpoint() == null) ? 0 : getPrimaryEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getNodeGroupMembers() == null) ? 0 : getNodeGroupMembers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NodeGroup == false) return false;
        NodeGroup other = (NodeGroup)obj;
        
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null) return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPrimaryEndpoint() == null ^ this.getPrimaryEndpoint() == null) return false;
        if (other.getPrimaryEndpoint() != null && other.getPrimaryEndpoint().equals(this.getPrimaryEndpoint()) == false) return false; 
        if (other.getNodeGroupMembers() == null ^ this.getNodeGroupMembers() == null) return false;
        if (other.getNodeGroupMembers() != null && other.getNodeGroupMembers().equals(this.getNodeGroupMembers()) == false) return false; 
        return true;
    }
    
}
    