/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DecreaseNodeGroupsInGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecreaseNodeGroupsInGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration
     * </p>
     */
    private Integer nodeGroupCount;
    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds to
     * remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     * GlobalNodeGroupsToRemove from the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> globalNodeGroupsToRemove;
    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds to
     * retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     * GlobalNodeGroupsToRetain from the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> globalNodeGroupsToRetain;
    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is true.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global datastore
     */

    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @return The name of the Global datastore
     */

    public String getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration
     * </p>
     * 
     * @param nodeGroupCount
     *        The number of node groups (shards) that results from the modification of the shard configuration
     */

    public void setNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration
     * </p>
     * 
     * @return The number of node groups (shards) that results from the modification of the shard configuration
     */

    public Integer getNodeGroupCount() {
        return this.nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups (shards) that results from the modification of the shard configuration
     * </p>
     * 
     * @param nodeGroupCount
     *        The number of node groups (shards) that results from the modification of the shard configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withNodeGroupCount(Integer nodeGroupCount) {
        setNodeGroupCount(nodeGroupCount);
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds to
     * remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     * GlobalNodeGroupsToRemove from the cluster.
     * </p>
     * 
     * @return If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *         NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds
     *         to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     *         GlobalNodeGroupsToRemove from the cluster.
     */

    public java.util.List<String> getGlobalNodeGroupsToRemove() {
        if (globalNodeGroupsToRemove == null) {
            globalNodeGroupsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return globalNodeGroupsToRemove;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds to
     * remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     * GlobalNodeGroupsToRemove from the cluster.
     * </p>
     * 
     * @param globalNodeGroupsToRemove
     *        If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *        NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds
     *        to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     *        GlobalNodeGroupsToRemove from the cluster.
     */

    public void setGlobalNodeGroupsToRemove(java.util.Collection<String> globalNodeGroupsToRemove) {
        if (globalNodeGroupsToRemove == null) {
            this.globalNodeGroupsToRemove = null;
            return;
        }

        this.globalNodeGroupsToRemove = new com.amazonaws.internal.SdkInternalList<String>(globalNodeGroupsToRemove);
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds to
     * remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     * GlobalNodeGroupsToRemove from the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalNodeGroupsToRemove(java.util.Collection)} or
     * {@link #withGlobalNodeGroupsToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalNodeGroupsToRemove
     *        If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *        NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds
     *        to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     *        GlobalNodeGroupsToRemove from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRemove(String... globalNodeGroupsToRemove) {
        if (this.globalNodeGroupsToRemove == null) {
            setGlobalNodeGroupsToRemove(new com.amazonaws.internal.SdkInternalList<String>(globalNodeGroupsToRemove.length));
        }
        for (String ele : globalNodeGroupsToRemove) {
            this.globalNodeGroupsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds to
     * remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     * GlobalNodeGroupsToRemove from the cluster.
     * </p>
     * 
     * @param globalNodeGroupsToRemove
     *        If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *        NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRemove is a list of NodeGroupIds
     *        to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by
     *        GlobalNodeGroupsToRemove from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRemove(java.util.Collection<String> globalNodeGroupsToRemove) {
        setGlobalNodeGroupsToRemove(globalNodeGroupsToRemove);
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds to
     * retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     * GlobalNodeGroupsToRetain from the cluster.
     * </p>
     * 
     * @return If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *         NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds
     *         to retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     *         GlobalNodeGroupsToRetain from the cluster.
     */

    public java.util.List<String> getGlobalNodeGroupsToRetain() {
        if (globalNodeGroupsToRetain == null) {
            globalNodeGroupsToRetain = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return globalNodeGroupsToRetain;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds to
     * retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     * GlobalNodeGroupsToRetain from the cluster.
     * </p>
     * 
     * @param globalNodeGroupsToRetain
     *        If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *        NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds
     *        to retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     *        GlobalNodeGroupsToRetain from the cluster.
     */

    public void setGlobalNodeGroupsToRetain(java.util.Collection<String> globalNodeGroupsToRetain) {
        if (globalNodeGroupsToRetain == null) {
            this.globalNodeGroupsToRetain = null;
            return;
        }

        this.globalNodeGroupsToRetain = new com.amazonaws.internal.SdkInternalList<String>(globalNodeGroupsToRetain);
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds to
     * retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     * GlobalNodeGroupsToRetain from the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalNodeGroupsToRetain(java.util.Collection)} or
     * {@link #withGlobalNodeGroupsToRetain(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalNodeGroupsToRetain
     *        If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *        NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds
     *        to retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     *        GlobalNodeGroupsToRetain from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRetain(String... globalNodeGroupsToRetain) {
        if (this.globalNodeGroupsToRetain == null) {
            setGlobalNodeGroupsToRetain(new com.amazonaws.internal.SdkInternalList<String>(globalNodeGroupsToRetain.length));
        }
        for (String ele : globalNodeGroupsToRetain) {
            this.globalNodeGroupsToRetain.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     * NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds to
     * retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     * GlobalNodeGroupsToRetain from the cluster.
     * </p>
     * 
     * @param globalNodeGroupsToRetain
     *        If the value of NodeGroupCount is less than the current number of node groups (shards), then either
     *        NodeGroupsToRemove or NodeGroupsToRetain is required. GlobalNodeGroupsToRetain is a list of NodeGroupIds
     *        to retain from the cluster. ElastiCache for Redis will attempt to retain all node groups listed by
     *        GlobalNodeGroupsToRetain from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalNodeGroupsToRetain(java.util.Collection<String> globalNodeGroupsToRetain) {
        setGlobalNodeGroupsToRetain(globalNodeGroupsToRetain);
        return this;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is true.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *        for this parameter is true.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is true.
     * </p>
     * 
     * @return Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *         for this parameter is true.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is true.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *        for this parameter is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecreaseNodeGroupsInGlobalReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for
     * this parameter is true.
     * </p>
     * 
     * @return Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value
     *         for this parameter is true.
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: ").append(getGlobalReplicationGroupId()).append(",");
        if (getNodeGroupCount() != null)
            sb.append("NodeGroupCount: ").append(getNodeGroupCount()).append(",");
        if (getGlobalNodeGroupsToRemove() != null)
            sb.append("GlobalNodeGroupsToRemove: ").append(getGlobalNodeGroupsToRemove()).append(",");
        if (getGlobalNodeGroupsToRetain() != null)
            sb.append("GlobalNodeGroupsToRetain: ").append(getGlobalNodeGroupsToRetain()).append(",");
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

        if (obj instanceof DecreaseNodeGroupsInGlobalReplicationGroupRequest == false)
            return false;
        DecreaseNodeGroupsInGlobalReplicationGroupRequest other = (DecreaseNodeGroupsInGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupCount() == null ^ this.getNodeGroupCount() == null)
            return false;
        if (other.getNodeGroupCount() != null && other.getNodeGroupCount().equals(this.getNodeGroupCount()) == false)
            return false;
        if (other.getGlobalNodeGroupsToRemove() == null ^ this.getGlobalNodeGroupsToRemove() == null)
            return false;
        if (other.getGlobalNodeGroupsToRemove() != null && other.getGlobalNodeGroupsToRemove().equals(this.getGlobalNodeGroupsToRemove()) == false)
            return false;
        if (other.getGlobalNodeGroupsToRetain() == null ^ this.getGlobalNodeGroupsToRetain() == null)
            return false;
        if (other.getGlobalNodeGroupsToRetain() != null && other.getGlobalNodeGroupsToRetain().equals(this.getGlobalNodeGroupsToRetain()) == false)
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

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupCount() == null) ? 0 : getNodeGroupCount().hashCode());
        hashCode = prime * hashCode + ((getGlobalNodeGroupsToRemove() == null) ? 0 : getGlobalNodeGroupsToRemove().hashCode());
        hashCode = prime * hashCode + ((getGlobalNodeGroupsToRetain() == null) ? 0 : getGlobalNodeGroupsToRetain().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public DecreaseNodeGroupsInGlobalReplicationGroupRequest clone() {
        return (DecreaseNodeGroupsInGlobalReplicationGroupRequest) super.clone();
    }

}
