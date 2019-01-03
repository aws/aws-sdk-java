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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseReplicaCount" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecreaseReplicaCountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the replication group from which you want to remove replica nodes.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled)
     * replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode
     * enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
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
     * If Multi-AZ with Automatic Failover is not enabled: 0
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
     * A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster mode
     * enabled) replication group. The <code>ConfigureShard</code> has three members: <code>NewReplicaCount</code>,
     * <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigureShard> replicaConfiguration;
    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group (shard).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replicasToRemove;
    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the number of
     * replica nodes is decreased during the next maintenance window.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The id of the replication group from which you want to remove replica nodes.
     * </p>
     * 
     * @param replicationGroupId
     *        The id of the replication group from which you want to remove replica nodes.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The id of the replication group from which you want to remove replica nodes.
     * </p>
     * 
     * @return The id of the replication group from which you want to remove replica nodes.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The id of the replication group from which you want to remove replica nodes.
     * </p>
     * 
     * @param replicationGroupId
     *        The id of the replication group from which you want to remove replica nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicaCountRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled)
     * replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode
     * enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
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
     * If Multi-AZ with Automatic Failover is not enabled: 0
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
     *        The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode
     *        disabled) replication groups, this is the number of replica nodes in the replication group. For Redis
     *        (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication
     *        group's node groups.</p>
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
     *        If Multi-AZ with Automatic Failover is not enabled: 0
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
     * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled)
     * replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode
     * enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
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
     * If Multi-AZ with Automatic Failover is not enabled: 0
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
     * @return The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode
     *         disabled) replication groups, this is the number of replica nodes in the replication group. For Redis
     *         (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication
     *         group's node groups.</p>
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
     *         If Multi-AZ with Automatic Failover is not enabled: 0
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
     * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled)
     * replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode
     * enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
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
     * If Multi-AZ with Automatic Failover is not enabled: 0
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
     *        The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode
     *        disabled) replication groups, this is the number of replica nodes in the replication group. For Redis
     *        (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication
     *        group's node groups.</p>
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
     *        If Multi-AZ with Automatic Failover is not enabled: 0
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

    public DecreaseReplicaCountRequest withNewReplicaCount(Integer newReplicaCount) {
        setNewReplicaCount(newReplicaCount);
        return this;
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster mode
     * enabled) replication group. The <code>ConfigureShard</code> has three members: <code>NewReplicaCount</code>,
     * <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * </p>
     * 
     * @return A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis
     *         (cluster mode enabled) replication group. The <code>ConfigureShard</code> has three members:
     *         <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     */

    public java.util.List<ConfigureShard> getReplicaConfiguration() {
        if (replicaConfiguration == null) {
            replicaConfiguration = new com.amazonaws.internal.SdkInternalList<ConfigureShard>();
        }
        return replicaConfiguration;
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster mode
     * enabled) replication group. The <code>ConfigureShard</code> has three members: <code>NewReplicaCount</code>,
     * <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * </p>
     * 
     * @param replicaConfiguration
     *        A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster
     *        mode enabled) replication group. The <code>ConfigureShard</code> has three members:
     *        <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     */

    public void setReplicaConfiguration(java.util.Collection<ConfigureShard> replicaConfiguration) {
        if (replicaConfiguration == null) {
            this.replicaConfiguration = null;
            return;
        }

        this.replicaConfiguration = new com.amazonaws.internal.SdkInternalList<ConfigureShard>(replicaConfiguration);
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster mode
     * enabled) replication group. The <code>ConfigureShard</code> has three members: <code>NewReplicaCount</code>,
     * <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaConfiguration(java.util.Collection)} or {@link #withReplicaConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicaConfiguration
     *        A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster
     *        mode enabled) replication group. The <code>ConfigureShard</code> has three members:
     *        <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicaCountRequest withReplicaConfiguration(ConfigureShard... replicaConfiguration) {
        if (this.replicaConfiguration == null) {
            setReplicaConfiguration(new com.amazonaws.internal.SdkInternalList<ConfigureShard>(replicaConfiguration.length));
        }
        for (ConfigureShard ele : replicaConfiguration) {
            this.replicaConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster mode
     * enabled) replication group. The <code>ConfigureShard</code> has three members: <code>NewReplicaCount</code>,
     * <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * </p>
     * 
     * @param replicaConfiguration
     *        A list of <code>ConfigureShard</code> objects that can be used to configure each shard in a Redis (cluster
     *        mode enabled) replication group. The <code>ConfigureShard</code> has three members:
     *        <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and <code>PreferredAvailabilityZones</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicaCountRequest withReplicaConfiguration(java.util.Collection<ConfigureShard> replicaConfiguration) {
        setReplicaConfiguration(replicaConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group (shard).
     * </p>
     * 
     * @return A list of the node ids to remove from the replication group or node group (shard).
     */

    public java.util.List<String> getReplicasToRemove() {
        if (replicasToRemove == null) {
            replicasToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replicasToRemove;
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group (shard).
     * </p>
     * 
     * @param replicasToRemove
     *        A list of the node ids to remove from the replication group or node group (shard).
     */

    public void setReplicasToRemove(java.util.Collection<String> replicasToRemove) {
        if (replicasToRemove == null) {
            this.replicasToRemove = null;
            return;
        }

        this.replicasToRemove = new com.amazonaws.internal.SdkInternalList<String>(replicasToRemove);
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group (shard).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicasToRemove(java.util.Collection)} or {@link #withReplicasToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicasToRemove
     *        A list of the node ids to remove from the replication group or node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicaCountRequest withReplicasToRemove(String... replicasToRemove) {
        if (this.replicasToRemove == null) {
            setReplicasToRemove(new com.amazonaws.internal.SdkInternalList<String>(replicasToRemove.length));
        }
        for (String ele : replicasToRemove) {
            this.replicasToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group (shard).
     * </p>
     * 
     * @param replicasToRemove
     *        A list of the node ids to remove from the replication group or node group (shard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicaCountRequest withReplicasToRemove(java.util.Collection<String> replicasToRemove) {
        setReplicasToRemove(replicasToRemove);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the number of
     * replica nodes is decreased during the next maintenance window.
     * </p>
     * 
     * @param applyImmediately
     *        If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the
     *        number of replica nodes is decreased during the next maintenance window.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the number of
     * replica nodes is decreased during the next maintenance window.
     * </p>
     * 
     * @return If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the
     *         number of replica nodes is decreased during the next maintenance window.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the number of
     * replica nodes is decreased during the next maintenance window.
     * </p>
     * 
     * @param applyImmediately
     *        If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the
     *        number of replica nodes is decreased during the next maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseReplicaCountRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the number of
     * replica nodes is decreased during the next maintenance window.
     * </p>
     * 
     * @return If <code>True</code>, the number of replica nodes is decreased immediately. If <code>False</code>, the
     *         number of replica nodes is decreased during the next maintenance window.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getNewReplicaCount() != null)
            sb.append("NewReplicaCount: ").append(getNewReplicaCount()).append(",");
        if (getReplicaConfiguration() != null)
            sb.append("ReplicaConfiguration: ").append(getReplicaConfiguration()).append(",");
        if (getReplicasToRemove() != null)
            sb.append("ReplicasToRemove: ").append(getReplicasToRemove()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecreaseReplicaCountRequest == false)
            return false;
        DecreaseReplicaCountRequest other = (DecreaseReplicaCountRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getNewReplicaCount() == null ^ this.getNewReplicaCount() == null)
            return false;
        if (other.getNewReplicaCount() != null && other.getNewReplicaCount().equals(this.getNewReplicaCount()) == false)
            return false;
        if (other.getReplicaConfiguration() == null ^ this.getReplicaConfiguration() == null)
            return false;
        if (other.getReplicaConfiguration() != null && other.getReplicaConfiguration().equals(this.getReplicaConfiguration()) == false)
            return false;
        if (other.getReplicasToRemove() == null ^ this.getReplicasToRemove() == null)
            return false;
        if (other.getReplicasToRemove() != null && other.getReplicasToRemove().equals(this.getReplicasToRemove()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getNewReplicaCount() == null) ? 0 : getNewReplicaCount().hashCode());
        hashCode = prime * hashCode + ((getReplicaConfiguration() == null) ? 0 : getReplicaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getReplicasToRemove() == null) ? 0 : getReplicasToRemove().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public DecreaseReplicaCountRequest clone() {
        return (DecreaseReplicaCountRequest) super.clone();
    }

}
