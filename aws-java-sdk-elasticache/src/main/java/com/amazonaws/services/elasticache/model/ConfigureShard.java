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
 * Node group (shard) configuration options when adding or removing replicas. Each node group (shard) configuration has
 * the following members: NodeGroupId, NewReplicaCount, and PreferredAvailabilityZones.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ConfigureShard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureShard implements Serializable, Cloneable {

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the
     * node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a Shard's Id</a>.
     * </p>
     */
    private String nodeGroupId;
    /**
     * <p>
     * The number of replicas you want in this node group at the end of this operation. The maximum value for
     * <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     */
    private Integer newReplicaCount;
    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the replication
     * group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must equal the value of
     * <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     * <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> preferredAvailabilityZones;

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the
     * node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a Shard's Id</a>.
     * </p>
     * 
     * @param nodeGroupId
     *        The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication
     *        groups, the node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's)
     *        id, see <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a
     *        Shard's Id</a>.
     */

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the
     * node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a Shard's Id</a>.
     * </p>
     * 
     * @return The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication
     *         groups, the node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's)
     *         id, see <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a
     *         Shard's Id</a>.
     */

    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the
     * node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a Shard's Id</a>.
     * </p>
     * 
     * @param nodeGroupId
     *        The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication
     *        groups, the node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's)
     *        id, see <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/shard-find-id.html">Finding a
     *        Shard's Id</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureShard withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
        return this;
    }

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this operation. The maximum value for
     * <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     * 
     * @param newReplicaCount
     *        The number of replicas you want in this node group at the end of this operation. The maximum value for
     *        <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you
     *        are working with.</p>
     *        <p>
     *        The minimum number of replicas in a shard or replication group is:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If Multi-AZ with Automatic Failover is enabled: 1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If Multi-AZ with Automatic Failover is not enable: 0
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node
     *        fails)
     *        </p>
     *        </li>
     */

    public void setNewReplicaCount(Integer newReplicaCount) {
        this.newReplicaCount = newReplicaCount;
    }

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this operation. The maximum value for
     * <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of replicas you want in this node group at the end of this operation. The maximum value for
     *         <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you
     *         are working with.</p>
     *         <p>
     *         The minimum number of replicas in a shard or replication group is:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If Multi-AZ with Automatic Failover is enabled: 1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If Multi-AZ with Automatic Failover is not enable: 0
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary
     *         node fails)
     *         </p>
     *         </li>
     */

    public Integer getNewReplicaCount() {
        return this.newReplicaCount;
    }

    /**
     * <p>
     * The number of replicas you want in this node group at the end of this operation. The maximum value for
     * <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you are
     * working with.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enable: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     * 
     * @param newReplicaCount
     *        The number of replicas you want in this node group at the end of this operation. The maximum value for
     *        <code>NewReplicaCount</code> is 5. The minimum value depends upon the type of Redis replication group you
     *        are working with.</p>
     *        <p>
     *        The minimum number of replicas in a shard or replication group is:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If Multi-AZ with Automatic Failover is enabled: 1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If Multi-AZ with Automatic Failover is not enable: 0
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node
     *        fails)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureShard withNewReplicaCount(Integer newReplicaCount) {
        setNewReplicaCount(newReplicaCount);
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the replication
     * group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must equal the value of
     * <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     * <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     * 
     * @return A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the
     *         replication group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must
     *         equal the value of <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     *         <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for
     *         each of the replicas.
     */

    public java.util.List<String> getPreferredAvailabilityZones() {
        if (preferredAvailabilityZones == null) {
            preferredAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return preferredAvailabilityZones;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the replication
     * group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must equal the value of
     * <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     * <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the
     *        replication group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must
     *        equal the value of <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     *        <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each
     *        of the replicas.
     */

    public void setPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        if (preferredAvailabilityZones == null) {
            this.preferredAvailabilityZones = null;
            return;
        }

        this.preferredAvailabilityZones = new com.amazonaws.internal.SdkInternalList<String>(preferredAvailabilityZones);
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the replication
     * group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must equal the value of
     * <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     * <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredAvailabilityZones(java.util.Collection)} or
     * {@link #withPreferredAvailabilityZones(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the
     *        replication group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must
     *        equal the value of <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     *        <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each
     *        of the replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureShard withPreferredAvailabilityZones(String... preferredAvailabilityZones) {
        if (this.preferredAvailabilityZones == null) {
            setPreferredAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(preferredAvailabilityZones.length));
        }
        for (String ele : preferredAvailabilityZones) {
            this.preferredAvailabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the replication
     * group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must equal the value of
     * <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     * <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each of the
     * replicas.
     * </p>
     * 
     * @param preferredAvailabilityZones
     *        A list of <code>PreferredAvailabilityZone</code> strings that specify which availability zones the
     *        replication group's nodes are to be in. The nummber of <code>PreferredAvailabilityZone</code> values must
     *        equal the value of <code>NewReplicaCount</code> plus 1 to account for the primary node. If this member of
     *        <code>ReplicaConfiguration</code> is omitted, ElastiCache for Redis selects the availability zone for each
     *        of the replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureShard withPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        setPreferredAvailabilityZones(preferredAvailabilityZones);
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
        if (getNewReplicaCount() != null)
            sb.append("NewReplicaCount: ").append(getNewReplicaCount()).append(",");
        if (getPreferredAvailabilityZones() != null)
            sb.append("PreferredAvailabilityZones: ").append(getPreferredAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureShard == false)
            return false;
        ConfigureShard other = (ConfigureShard) obj;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getNewReplicaCount() == null ^ this.getNewReplicaCount() == null)
            return false;
        if (other.getNewReplicaCount() != null && other.getNewReplicaCount().equals(this.getNewReplicaCount()) == false)
            return false;
        if (other.getPreferredAvailabilityZones() == null ^ this.getPreferredAvailabilityZones() == null)
            return false;
        if (other.getPreferredAvailabilityZones() != null && other.getPreferredAvailabilityZones().equals(this.getPreferredAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getNewReplicaCount() == null) ? 0 : getNewReplicaCount().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZones() == null) ? 0 : getPreferredAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public ConfigureShard clone() {
        try {
            return (ConfigureShard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
