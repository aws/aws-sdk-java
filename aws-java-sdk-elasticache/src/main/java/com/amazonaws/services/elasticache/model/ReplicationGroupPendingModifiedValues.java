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
 * The settings to be applied to the Redis replication group, either immediately or during the next maintenance window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ReplicationGroupPendingModifiedValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationGroupPendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     */
    private String primaryClusterId;
    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 and T2 cache node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     */
    private String automaticFailoverStatus;
    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     */
    private ReshardingStatus resharding;

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     * 
     * @param primaryClusterId
     *        The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or
     *        during the next maintenance window.
     */

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     * 
     * @return The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified),
     *         or during the next maintenance window.
     */

    public String getPrimaryClusterId() {
        return this.primaryClusterId;
    }

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or during
     * the next maintenance window.
     * </p>
     * 
     * @param primaryClusterId
     *        The primary cluster ID that is applied immediately (if <code>--apply-immediately</code> was specified), or
     *        during the next maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withPrimaryClusterId(String primaryClusterId) {
        setPrimaryClusterId(primaryClusterId);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 and T2 cache node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of Multi-AZ with automatic failover for this Redis replication group.</p>
     *        <p>
     *        Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
     *        </p>
     *        </li>
     * @see PendingAutomaticFailoverStatus
     */

    public void setAutomaticFailoverStatus(String automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 and T2 cache node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of Multi-AZ with automatic failover for this Redis replication group.</p>
     *         <p>
     *         Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis versions earlier than 2.8.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled): T1 and T2 cache node types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): T1 node types.
     *         </p>
     *         </li>
     * @see PendingAutomaticFailoverStatus
     */

    public String getAutomaticFailoverStatus() {
        return this.automaticFailoverStatus;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 and T2 cache node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of Multi-AZ with automatic failover for this Redis replication group.</p>
     *        <p>
     *        Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PendingAutomaticFailoverStatus
     */

    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(String automaticFailoverStatus) {
        setAutomaticFailoverStatus(automaticFailoverStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 and T2 cache node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of Multi-AZ with automatic failover for this Redis replication group.</p>
     *        <p>
     *        Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
     *        </p>
     *        </li>
     * @see PendingAutomaticFailoverStatus
     */

    public void setAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        withAutomaticFailoverStatus(automaticFailoverStatus);
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 and T2 cache node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param automaticFailoverStatus
     *        Indicates the status of Multi-AZ with automatic failover for this Redis replication group.</p>
     *        <p>
     *        Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PendingAutomaticFailoverStatus
     */

    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @param resharding
     *        The status of an online resharding operation.
     */

    public void setResharding(ReshardingStatus resharding) {
        this.resharding = resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @return The status of an online resharding operation.
     */

    public ReshardingStatus getResharding() {
        return this.resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @param resharding
     *        The status of an online resharding operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupPendingModifiedValues withResharding(ReshardingStatus resharding) {
        setResharding(resharding);
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
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: ").append(getPrimaryClusterId()).append(",");
        if (getAutomaticFailoverStatus() != null)
            sb.append("AutomaticFailoverStatus: ").append(getAutomaticFailoverStatus()).append(",");
        if (getResharding() != null)
            sb.append("Resharding: ").append(getResharding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationGroupPendingModifiedValues == false)
            return false;
        ReplicationGroupPendingModifiedValues other = (ReplicationGroupPendingModifiedValues) obj;
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverStatus() == null ^ this.getAutomaticFailoverStatus() == null)
            return false;
        if (other.getAutomaticFailoverStatus() != null && other.getAutomaticFailoverStatus().equals(this.getAutomaticFailoverStatus()) == false)
            return false;
        if (other.getResharding() == null ^ this.getResharding() == null)
            return false;
        if (other.getResharding() != null && other.getResharding().equals(this.getResharding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailoverStatus() == null) ? 0 : getAutomaticFailoverStatus().hashCode());
        hashCode = prime * hashCode + ((getResharding() == null) ? 0 : getResharding().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationGroupPendingModifiedValues clone() {
        try {
            return (ReplicationGroupPendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
