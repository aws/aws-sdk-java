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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary
 * node. All the other nodes are read-only Replica nodes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/NodeGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node
     * group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 15
     * node groups numbered 0001 to 0015.
     * </p>
     */
    private String nodeGroupId;
    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     */
    private Endpoint primaryEndpoint;
    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     */
    private String slots;
    /**
     * <p>
     * A list containing information about individual nodes within the node group (shard).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeGroupMember> nodeGroupMembers;

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node
     * group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 15
     * node groups numbered 0001 to 0015.
     * </p>
     * 
     * @param nodeGroupId
     *        The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only
     *        1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group
     *        contains 1 to 15 node groups numbered 0001 to 0015.
     */

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node
     * group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 15
     * node groups numbered 0001 to 0015.
     * </p>
     * 
     * @return The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains
     *         only 1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group
     *         contains 1 to 15 node groups numbered 0001 to 0015.
     */

    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node
     * group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 15
     * node groups numbered 0001 to 0015.
     * </p>
     * 
     * @param nodeGroupId
     *        The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only
     *        1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group
     *        contains 1 to 15 node groups numbered 0001 to 0015.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroup withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
        return this;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     * </p>
     * 
     * @return The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     * 
     * @param primaryEndpoint
     *        The endpoint of the primary node in this node group (shard).
     */

    public void setPrimaryEndpoint(Endpoint primaryEndpoint) {
        this.primaryEndpoint = primaryEndpoint;
    }

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     * 
     * @return The endpoint of the primary node in this node group (shard).
     */

    public Endpoint getPrimaryEndpoint() {
        return this.primaryEndpoint;
    }

    /**
     * <p>
     * The endpoint of the primary node in this node group (shard).
     * </p>
     * 
     * @param primaryEndpoint
     *        The endpoint of the primary node in this node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroup withPrimaryEndpoint(Endpoint primaryEndpoint) {
        setPrimaryEndpoint(primaryEndpoint);
        return this;
    }

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     * 
     * @param slots
     *        The keyspace for this node group (shard).
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     * 
     * @return The keyspace for this node group (shard).
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * The keyspace for this node group (shard).
     * </p>
     * 
     * @param slots
     *        The keyspace for this node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroup withSlots(String slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node group (shard).
     * </p>
     * 
     * @return A list containing information about individual nodes within the node group (shard).
     */

    public java.util.List<NodeGroupMember> getNodeGroupMembers() {
        if (nodeGroupMembers == null) {
            nodeGroupMembers = new com.amazonaws.internal.SdkInternalList<NodeGroupMember>();
        }
        return nodeGroupMembers;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node group (shard).
     * </p>
     * 
     * @param nodeGroupMembers
     *        A list containing information about individual nodes within the node group (shard).
     */

    public void setNodeGroupMembers(java.util.Collection<NodeGroupMember> nodeGroupMembers) {
        if (nodeGroupMembers == null) {
            this.nodeGroupMembers = null;
            return;
        }

        this.nodeGroupMembers = new com.amazonaws.internal.SdkInternalList<NodeGroupMember>(nodeGroupMembers);
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node group (shard).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroupMembers(java.util.Collection)} or {@link #withNodeGroupMembers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nodeGroupMembers
     *        A list containing information about individual nodes within the node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroup withNodeGroupMembers(NodeGroupMember... nodeGroupMembers) {
        if (this.nodeGroupMembers == null) {
            setNodeGroupMembers(new com.amazonaws.internal.SdkInternalList<NodeGroupMember>(nodeGroupMembers.length));
        }
        for (NodeGroupMember ele : nodeGroupMembers) {
            this.nodeGroupMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the node group (shard).
     * </p>
     * 
     * @param nodeGroupMembers
     *        A list containing information about individual nodes within the node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroup withNodeGroupMembers(java.util.Collection<NodeGroupMember> nodeGroupMembers) {
        setNodeGroupMembers(nodeGroupMembers);
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
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: ").append(getNodeGroupId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPrimaryEndpoint() != null)
            sb.append("PrimaryEndpoint: ").append(getPrimaryEndpoint()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getNodeGroupMembers() != null)
            sb.append("NodeGroupMembers: ").append(getNodeGroupMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroup == false)
            return false;
        NodeGroup other = (NodeGroup) obj;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPrimaryEndpoint() == null ^ this.getPrimaryEndpoint() == null)
            return false;
        if (other.getPrimaryEndpoint() != null && other.getPrimaryEndpoint().equals(this.getPrimaryEndpoint()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getNodeGroupMembers() == null ^ this.getNodeGroupMembers() == null)
            return false;
        if (other.getNodeGroupMembers() != null && other.getNodeGroupMembers().equals(this.getNodeGroupMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPrimaryEndpoint() == null) ? 0 : getPrimaryEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupMembers() == null) ? 0 : getNodeGroupMembers().hashCode());
        return hashCode;
    }

    @Override
    public NodeGroup clone() {
        try {
            return (NodeGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
