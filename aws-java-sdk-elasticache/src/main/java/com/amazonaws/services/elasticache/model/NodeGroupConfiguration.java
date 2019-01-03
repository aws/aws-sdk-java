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
 * Node group (shard) configuration options. Each node group (shard) configuration has the following: <code>Slots</code>, <code>PrimaryAvailabilityZone</code>, <code>ReplicaAvailabilityZones</code>, <code>ReplicaCount</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/NodeGroupConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     */
    private String nodeGroupId;
    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     */
    private String slots;
    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     */
    private Integer replicaCount;
    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard) is launched.
     * </p>
     */
    private String primaryAvailabilityZone;
    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must
     * match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replicaAvailabilityZones;

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     * 
     * @param nodeGroupId
     *        The 4-digit id for the node group these configuration values apply to.
     */

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     * 
     * @return The 4-digit id for the node group these configuration values apply to.
     */

    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group these configuration values apply to.
     * </p>
     * 
     * @param nodeGroupId
     *        The 4-digit id for the node group these configuration values apply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupConfiguration withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
        return this;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     * 
     * @param slots
     *        A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The
     *        string is in the format <code>startkey-endkey</code>.</p>
     *        <p>
     *        Example: <code>"0-3999"</code>
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     * 
     * @return A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The
     *         string is in the format <code>startkey-endkey</code>.</p>
     *         <p>
     *         Example: <code>"0-3999"</code>
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format <code>startkey-endkey</code>.
     * </p>
     * <p>
     * Example: <code>"0-3999"</code>
     * </p>
     * 
     * @param slots
     *        A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The
     *        string is in the format <code>startkey-endkey</code>.</p>
     *        <p>
     *        Example: <code>"0-3999"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupConfiguration withSlots(String slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     * 
     * @param replicaCount
     *        The number of read replica nodes in this node group (shard).
     */

    public void setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     * 
     * @return The number of read replica nodes in this node group (shard).
     */

    public Integer getReplicaCount() {
        return this.replicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes in this node group (shard).
     * </p>
     * 
     * @param replicaCount
     *        The number of read replica nodes in this node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupConfiguration withReplicaCount(Integer replicaCount) {
        setReplicaCount(replicaCount);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard) is launched.
     * </p>
     * 
     * @param primaryAvailabilityZone
     *        The Availability Zone where the primary node of this node group (shard) is launched.
     */

    public void setPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard) is launched.
     * </p>
     * 
     * @return The Availability Zone where the primary node of this node group (shard) is launched.
     */

    public String getPrimaryAvailabilityZone() {
        return this.primaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the primary node of this node group (shard) is launched.
     * </p>
     * 
     * @param primaryAvailabilityZone
     *        The Availability Zone where the primary node of this node group (shard) is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupConfiguration withPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        setPrimaryAvailabilityZone(primaryAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must
     * match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not specified.
     * </p>
     * 
     * @return A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this
     *         list must match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     *         specified.
     */

    public java.util.List<String> getReplicaAvailabilityZones() {
        if (replicaAvailabilityZones == null) {
            replicaAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replicaAvailabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must
     * match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not specified.
     * </p>
     * 
     * @param replicaAvailabilityZones
     *        A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this
     *        list must match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     *        specified.
     */

    public void setReplicaAvailabilityZones(java.util.Collection<String> replicaAvailabilityZones) {
        if (replicaAvailabilityZones == null) {
            this.replicaAvailabilityZones = null;
            return;
        }

        this.replicaAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>(replicaAvailabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must
     * match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaAvailabilityZones(java.util.Collection)} or
     * {@link #withReplicaAvailabilityZones(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicaAvailabilityZones
     *        A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this
     *        list must match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupConfiguration withReplicaAvailabilityZones(String... replicaAvailabilityZones) {
        if (this.replicaAvailabilityZones == null) {
            setReplicaAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(replicaAvailabilityZones.length));
        }
        for (String ele : replicaAvailabilityZones) {
            this.replicaAvailabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must
     * match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not specified.
     * </p>
     * 
     * @param replicaAvailabilityZones
     *        A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this
     *        list must match the value of <code>ReplicaCount</code> or <code>ReplicasPerNodeGroup</code> if not
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupConfiguration withReplicaAvailabilityZones(java.util.Collection<String> replicaAvailabilityZones) {
        setReplicaAvailabilityZones(replicaAvailabilityZones);
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
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getReplicaCount() != null)
            sb.append("ReplicaCount: ").append(getReplicaCount()).append(",");
        if (getPrimaryAvailabilityZone() != null)
            sb.append("PrimaryAvailabilityZone: ").append(getPrimaryAvailabilityZone()).append(",");
        if (getReplicaAvailabilityZones() != null)
            sb.append("ReplicaAvailabilityZones: ").append(getReplicaAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupConfiguration == false)
            return false;
        NodeGroupConfiguration other = (NodeGroupConfiguration) obj;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getReplicaCount() == null ^ this.getReplicaCount() == null)
            return false;
        if (other.getReplicaCount() != null && other.getReplicaCount().equals(this.getReplicaCount()) == false)
            return false;
        if (other.getPrimaryAvailabilityZone() == null ^ this.getPrimaryAvailabilityZone() == null)
            return false;
        if (other.getPrimaryAvailabilityZone() != null && other.getPrimaryAvailabilityZone().equals(this.getPrimaryAvailabilityZone()) == false)
            return false;
        if (other.getReplicaAvailabilityZones() == null ^ this.getReplicaAvailabilityZones() == null)
            return false;
        if (other.getReplicaAvailabilityZones() != null && other.getReplicaAvailabilityZones().equals(this.getReplicaAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getReplicaCount() == null) ? 0 : getReplicaCount().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAvailabilityZone() == null) ? 0 : getPrimaryAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getReplicaAvailabilityZones() == null) ? 0 : getReplicaAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public NodeGroupConfiguration clone() {
        try {
            return (NodeGroupConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
