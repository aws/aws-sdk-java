/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The settings to be applied to the replication group, either
 * immediately or during the next maintenance window.
 * </p>
 */
public class ReplicationGroupPendingModifiedValues implements Serializable, Cloneable {

    /**
     * The primary cluster ID which will be applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     */
    private String primaryClusterId;

    /**
     * Indicates the status of Multi-AZ for this replication group.
     * <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     * <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     * node types.</li> </ul> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     */
    private String automaticFailoverStatus;

    /**
     * The primary cluster ID which will be applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     *
     * @return The primary cluster ID which will be applied immediately (if
     *         <code>--apply-immediately</code> was specified), or during the next
     *         maintenance window.
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }
    
    /**
     * The primary cluster ID which will be applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     *
     * @param primaryClusterId The primary cluster ID which will be applied immediately (if
     *         <code>--apply-immediately</code> was specified), or during the next
     *         maintenance window.
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }
    
    /**
     * The primary cluster ID which will be applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primaryClusterId The primary cluster ID which will be applied immediately (if
     *         <code>--apply-immediately</code> was specified), or during the next
     *         maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReplicationGroupPendingModifiedValues withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * Indicates the status of Multi-AZ for this replication group.
     * <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     * <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     * node types.</li> </ul> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @return Indicates the status of Multi-AZ for this replication group.
     *         <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     *         <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     *         node types.</li> </ul> </note>
     *
     * @see PendingAutomaticFailoverStatus
     */
    public String getAutomaticFailoverStatus() {
        return automaticFailoverStatus;
    }
    
    /**
     * Indicates the status of Multi-AZ for this replication group.
     * <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     * <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     * node types.</li> </ul> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus Indicates the status of Multi-AZ for this replication group.
     *         <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     *         <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     *         node types.</li> </ul> </note>
     *
     * @see PendingAutomaticFailoverStatus
     */
    public void setAutomaticFailoverStatus(String automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus;
    }
    
    /**
     * Indicates the status of Multi-AZ for this replication group.
     * <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     * <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     * node types.</li> </ul> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus Indicates the status of Multi-AZ for this replication group.
     *         <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     *         <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     *         node types.</li> </ul> </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PendingAutomaticFailoverStatus
     */
    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(String automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus;
        return this;
    }

    /**
     * Indicates the status of Multi-AZ for this replication group.
     * <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     * <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     * node types.</li> </ul> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus Indicates the status of Multi-AZ for this replication group.
     *         <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     *         <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     *         node types.</li> </ul> </note>
     *
     * @see PendingAutomaticFailoverStatus
     */
    public void setAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus.toString();
    }
    
    /**
     * Indicates the status of Multi-AZ for this replication group.
     * <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     * <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     * node types.</li> </ul> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus Indicates the status of Multi-AZ for this replication group.
     *         <note><p>ElastiCache Multi-AZ replication groups are not supported on:
     *         <ul> <li>Redis versions earlier than 2.8.6.</li> <li>T1 and T2 cache
     *         node types.</li> </ul> </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PendingAutomaticFailoverStatus
     */
    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus.toString();
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
        if (getPrimaryClusterId() != null) sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getAutomaticFailoverStatus() != null) sb.append("AutomaticFailoverStatus: " + getAutomaticFailoverStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getAutomaticFailoverStatus() == null) ? 0 : getAutomaticFailoverStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplicationGroupPendingModifiedValues == false) return false;
        ReplicationGroupPendingModifiedValues other = (ReplicationGroupPendingModifiedValues)obj;
        
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null) return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false) return false; 
        if (other.getAutomaticFailoverStatus() == null ^ this.getAutomaticFailoverStatus() == null) return false;
        if (other.getAutomaticFailoverStatus() != null && other.getAutomaticFailoverStatus().equals(this.getAutomaticFailoverStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public ReplicationGroupPendingModifiedValues clone() {
        try {
            return (ReplicationGroupPendingModifiedValues) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    