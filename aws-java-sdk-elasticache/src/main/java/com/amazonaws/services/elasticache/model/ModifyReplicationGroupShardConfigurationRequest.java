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
 * <p>
 * Represents the input for a <code>ModifyReplicationGroupShardConfiguration</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroupShardConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationGroupShardConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     * configured.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration.
     * </p>
     */
    private Integer nodeGroupCount;
    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is <code>true</code>.
     * </p>
     * <p>
     * Value: true
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the cluster. If the value of
     * <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     * parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     * ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the current
     * number of node groups (shards).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReshardingConfiguration> reshardingConfiguration;
    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code> from the
     * cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> nodeGroupsToRemove;
    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those listed by
     * <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> nodeGroupsToRetain;

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     * configured.
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     *        configured.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     * configured.
     * </p>
     * 
     * @return The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     *         configured.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     * configured.
     * </p>
     * 
     * @param replicationGroupId
     *        The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be
     *        configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration.
     * </p>
     * 
     * @param nodeGroupCount
     *        The number of node groups (shards) that results from the modification of the shard configuration.
     */

    public void setNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration.
     * </p>
     * 
     * @return The number of node groups (shards) that results from the modification of the shard configuration.
     */

    public Integer getNodeGroupCount() {
        return this.nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration.
     * </p>
     * 
     * @param nodeGroupCount
     *        The number of node groups (shards) that results from the modification of the shard configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupCount(Integer nodeGroupCount) {
        setNodeGroupCount(nodeGroupCount);
        return this;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is <code>true</code>.
     * </p>
     * <p>
     * Value: true
     * </p>
     * 
     * @param applyImmediately
     *        Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *        for this parameter is <code>true</code>.</p>
     *        <p>
     *        Value: true
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is <code>true</code>.
     * </p>
     * <p>
     * Value: true
     * </p>
     * 
     * @return Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *         for this parameter is <code>true</code>.</p>
     *         <p>
     *         Value: true
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is <code>true</code>.
     * </p>
     * <p>
     * Value: true
     * </p>
     * 
     * @param applyImmediately
     *        Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *        for this parameter is <code>true</code>.</p>
     *        <p>
     *        Value: true
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is <code>true</code>.
     * </p>
     * <p>
     * Value: true
     * </p>
     * 
     * @return Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *         for this parameter is <code>true</code>.</p>
     *         <p>
     *         Value: true
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the cluster. If the value of
     * <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     * parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     * ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the current
     * number of node groups (shards).
     * </p>
     * 
     * @return Specifies the preferred availability zones for each node group in the cluster. If the value of
     *         <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     *         parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     *         ElastiCache selects availability zones for you.</p>
     *         <p>
     *         You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the
     *         current number of node groups (shards).
     */

    public java.util.List<ReshardingConfiguration> getReshardingConfiguration() {
        if (reshardingConfiguration == null) {
            reshardingConfiguration = new com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>();
        }
        return reshardingConfiguration;
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the cluster. If the value of
     * <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     * parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     * ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the current
     * number of node groups (shards).
     * </p>
     * 
     * @param reshardingConfiguration
     *        Specifies the preferred availability zones for each node group in the cluster. If the value of
     *        <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     *        parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     *        ElastiCache selects availability zones for you.</p>
     *        <p>
     *        You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the
     *        current number of node groups (shards).
     */

    public void setReshardingConfiguration(java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        if (reshardingConfiguration == null) {
            this.reshardingConfiguration = null;
            return;
        }

        this.reshardingConfiguration = new com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>(reshardingConfiguration);
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the cluster. If the value of
     * <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     * parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     * ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the current
     * number of node groups (shards).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReshardingConfiguration(java.util.Collection)} or
     * {@link #withReshardingConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reshardingConfiguration
     *        Specifies the preferred availability zones for each node group in the cluster. If the value of
     *        <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     *        parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     *        ElastiCache selects availability zones for you.</p>
     *        <p>
     *        You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the
     *        current number of node groups (shards).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withReshardingConfiguration(ReshardingConfiguration... reshardingConfiguration) {
        if (this.reshardingConfiguration == null) {
            setReshardingConfiguration(new com.amazonaws.internal.SdkInternalList<ReshardingConfiguration>(reshardingConfiguration.length));
        }
        for (ReshardingConfiguration ele : reshardingConfiguration) {
            this.reshardingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the preferred availability zones for each node group in the cluster. If the value of
     * <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     * parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     * ElastiCache selects availability zones for you.
     * </p>
     * <p>
     * You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the current
     * number of node groups (shards).
     * </p>
     * 
     * @param reshardingConfiguration
     *        Specifies the preferred availability zones for each node group in the cluster. If the value of
     *        <code>NodeGroupCount</code> is greater than the current number of node groups (shards), you can use this
     *        parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter
     *        ElastiCache selects availability zones for you.</p>
     *        <p>
     *        You can specify this parameter only if the value of <code>NodeGroupCount</code> is greater than the
     *        current number of node groups (shards).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withReshardingConfiguration(java.util.Collection<ReshardingConfiguration> reshardingConfiguration) {
        setReshardingConfiguration(reshardingConfiguration);
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code> from the
     * cluster.
     * </p>
     * 
     * @return If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *         <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids
     *         to remove from or retain in the cluster.</p>
     *         <p>
     *         ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code>
     *         from the cluster.
     */

    public java.util.List<String> getNodeGroupsToRemove() {
        if (nodeGroupsToRemove == null) {
            nodeGroupsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return nodeGroupsToRemove;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code> from the
     * cluster.
     * </p>
     * 
     * @param nodeGroupsToRemove
     *        If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *        <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to
     *        remove from or retain in the cluster.</p>
     *        <p>
     *        ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code>
     *        from the cluster.
     */

    public void setNodeGroupsToRemove(java.util.Collection<String> nodeGroupsToRemove) {
        if (nodeGroupsToRemove == null) {
            this.nodeGroupsToRemove = null;
            return;
        }

        this.nodeGroupsToRemove = new com.amazonaws.internal.SdkInternalList<String>(nodeGroupsToRemove);
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code> from the
     * cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroupsToRemove(java.util.Collection)} or {@link #withNodeGroupsToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param nodeGroupsToRemove
     *        If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *        <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to
     *        remove from or retain in the cluster.</p>
     *        <p>
     *        ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code>
     *        from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRemove(String... nodeGroupsToRemove) {
        if (this.nodeGroupsToRemove == null) {
            setNodeGroupsToRemove(new com.amazonaws.internal.SdkInternalList<String>(nodeGroupsToRemove.length));
        }
        for (String ele : nodeGroupsToRemove) {
            this.nodeGroupsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code> from the
     * cluster.
     * </p>
     * 
     * @param nodeGroupsToRemove
     *        If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *        <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to
     *        remove from or retain in the cluster.</p>
     *        <p>
     *        ElastiCache for Redis will attempt to remove all node groups listed by <code>NodeGroupsToRemove</code>
     *        from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRemove(java.util.Collection<String> nodeGroupsToRemove) {
        setNodeGroupsToRemove(nodeGroupsToRemove);
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those listed by
     * <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     * 
     * @return If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *         <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids
     *         to remove from or retain in the cluster.</p>
     *         <p>
     *         ElastiCache for Redis will attempt to remove all node groups except those listed by
     *         <code>NodeGroupsToRetain</code> from the cluster.
     */

    public java.util.List<String> getNodeGroupsToRetain() {
        if (nodeGroupsToRetain == null) {
            nodeGroupsToRetain = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return nodeGroupsToRetain;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those listed by
     * <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     * 
     * @param nodeGroupsToRetain
     *        If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *        <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to
     *        remove from or retain in the cluster.</p>
     *        <p>
     *        ElastiCache for Redis will attempt to remove all node groups except those listed by
     *        <code>NodeGroupsToRetain</code> from the cluster.
     */

    public void setNodeGroupsToRetain(java.util.Collection<String> nodeGroupsToRetain) {
        if (nodeGroupsToRetain == null) {
            this.nodeGroupsToRetain = null;
            return;
        }

        this.nodeGroupsToRetain = new com.amazonaws.internal.SdkInternalList<String>(nodeGroupsToRetain);
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those listed by
     * <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroupsToRetain(java.util.Collection)} or {@link #withNodeGroupsToRetain(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param nodeGroupsToRetain
     *        If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *        <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to
     *        remove from or retain in the cluster.</p>
     *        <p>
     *        ElastiCache for Redis will attempt to remove all node groups except those listed by
     *        <code>NodeGroupsToRetain</code> from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRetain(String... nodeGroupsToRetain) {
        if (this.nodeGroupsToRetain == null) {
            setNodeGroupsToRetain(new com.amazonaws.internal.SdkInternalList<String>(nodeGroupsToRetain.length));
        }
        for (String ele : nodeGroupsToRetain) {
            this.nodeGroupsToRetain.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     * <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to remove
     * from or retain in the cluster.
     * </p>
     * <p>
     * ElastiCache for Redis will attempt to remove all node groups except those listed by
     * <code>NodeGroupsToRetain</code> from the cluster.
     * </p>
     * 
     * @param nodeGroupsToRetain
     *        If the value of <code>NodeGroupCount</code> is less than the current number of node groups (shards), the
     *        <code>NodeGroupsToRemove</code> or <code>NodeGroupsToRetain</code> is a required list of node group ids to
     *        remove from or retain in the cluster.</p>
     *        <p>
     *        ElastiCache for Redis will attempt to remove all node groups except those listed by
     *        <code>NodeGroupsToRetain</code> from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupShardConfigurationRequest withNodeGroupsToRetain(java.util.Collection<String> nodeGroupsToRetain) {
        setNodeGroupsToRetain(nodeGroupsToRetain);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getNodeGroupCount() != null)
            sb.append("NodeGroupCount: ").append(getNodeGroupCount()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getReshardingConfiguration() != null)
            sb.append("ReshardingConfiguration: ").append(getReshardingConfiguration()).append(",");
        if (getNodeGroupsToRemove() != null)
            sb.append("NodeGroupsToRemove: ").append(getNodeGroupsToRemove()).append(",");
        if (getNodeGroupsToRetain() != null)
            sb.append("NodeGroupsToRetain: ").append(getNodeGroupsToRetain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationGroupShardConfigurationRequest == false)
            return false;
        ModifyReplicationGroupShardConfigurationRequest other = (ModifyReplicationGroupShardConfigurationRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupCount() == null ^ this.getNodeGroupCount() == null)
            return false;
        if (other.getNodeGroupCount() != null && other.getNodeGroupCount().equals(this.getNodeGroupCount()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getReshardingConfiguration() == null ^ this.getReshardingConfiguration() == null)
            return false;
        if (other.getReshardingConfiguration() != null && other.getReshardingConfiguration().equals(this.getReshardingConfiguration()) == false)
            return false;
        if (other.getNodeGroupsToRemove() == null ^ this.getNodeGroupsToRemove() == null)
            return false;
        if (other.getNodeGroupsToRemove() != null && other.getNodeGroupsToRemove().equals(this.getNodeGroupsToRemove()) == false)
            return false;
        if (other.getNodeGroupsToRetain() == null ^ this.getNodeGroupsToRetain() == null)
            return false;
        if (other.getNodeGroupsToRetain() != null && other.getNodeGroupsToRetain().equals(this.getNodeGroupsToRetain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupCount() == null) ? 0 : getNodeGroupCount().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getReshardingConfiguration() == null) ? 0 : getReshardingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupsToRemove() == null) ? 0 : getNodeGroupsToRemove().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupsToRetain() == null) ? 0 : getNodeGroupsToRetain().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationGroupShardConfigurationRequest clone() {
        return (ModifyReplicationGroupShardConfigurationRequest) super.clone();
    }

}
