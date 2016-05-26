/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * Contains all of the attributes of a specific replication group.
 * </p>
 */
public class ReplicationGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The description of the replication group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     */
    private ReplicationGroupPendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> memberClusters;
    /**
     * <p>
     * A single element list with information about the nodes in the replication
     * group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeGroup> nodeGroups;
    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     */
    private String snapshottingClusterId;
    /**
     * <p>
     * Indicates the status of Multi-AZ for this replication group.
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String automaticFailover;

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier for the replication group.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * 
     * @return The identifier for the replication group.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier for the replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The description of the replication group.
     * </p>
     * 
     * @param description
     *        The description of the replication group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the replication group.
     * </p>
     * 
     * @return The description of the replication group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the replication group.
     * </p>
     * 
     * @param description
     *        The description of the replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - <i>creating</i>,
     *        <i>available</i>, etc.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     * </p>
     * 
     * @return The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - <i>creating</i>,
     *        <i>available</i>, etc.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A group of settings to be applied to the replication group, either
     *        immediately or during the next maintenance window.
     */

    public void setPendingModifiedValues(
            ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     * 
     * @return A group of settings to be applied to the replication group,
     *         either immediately or during the next maintenance window.
     */

    public ReplicationGroupPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A group of settings to be applied to the replication group, either
     *        immediately or during the next maintenance window.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withPendingModifiedValues(
            ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     * 
     * @return The names of all the cache clusters that are part of this
     *         replication group.
     */

    public java.util.List<String> getMemberClusters() {
        if (memberClusters == null) {
            memberClusters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return memberClusters;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this
     *        replication group.
     */

    public void setMemberClusters(java.util.Collection<String> memberClusters) {
        if (memberClusters == null) {
            this.memberClusters = null;
            return;
        }

        this.memberClusters = new com.amazonaws.internal.SdkInternalList<String>(
                memberClusters);
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMemberClusters(java.util.Collection)} or
     * {@link #withMemberClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this
     *        replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withMemberClusters(String... memberClusters) {
        if (this.memberClusters == null) {
            setMemberClusters(new com.amazonaws.internal.SdkInternalList<String>(
                    memberClusters.length));
        }
        for (String ele : memberClusters) {
            this.memberClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication
     * group.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this
     *        replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withMemberClusters(
            java.util.Collection<String> memberClusters) {
        setMemberClusters(memberClusters);
        return this;
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication
     * group.
     * </p>
     * 
     * @return A single element list with information about the nodes in the
     *         replication group.
     */

    public java.util.List<NodeGroup> getNodeGroups() {
        if (nodeGroups == null) {
            nodeGroups = new com.amazonaws.internal.SdkInternalList<NodeGroup>();
        }
        return nodeGroups;
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication
     * group.
     * </p>
     * 
     * @param nodeGroups
     *        A single element list with information about the nodes in the
     *        replication group.
     */

    public void setNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        if (nodeGroups == null) {
            this.nodeGroups = null;
            return;
        }

        this.nodeGroups = new com.amazonaws.internal.SdkInternalList<NodeGroup>(
                nodeGroups);
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNodeGroups(java.util.Collection)} or
     * {@link #withNodeGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodeGroups
     *        A single element list with information about the nodes in the
     *        replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withNodeGroups(NodeGroup... nodeGroups) {
        if (this.nodeGroups == null) {
            setNodeGroups(new com.amazonaws.internal.SdkInternalList<NodeGroup>(
                    nodeGroups.length));
        }
        for (NodeGroup ele : nodeGroups) {
            this.nodeGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication
     * group.
     * </p>
     * 
     * @param nodeGroups
     *        A single element list with information about the nodes in the
     *        replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withNodeGroups(
            java.util.Collection<NodeGroup> nodeGroups) {
        setNodeGroups(nodeGroups);
        return this;
    }

    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cache cluster ID that is used as the daily snapshot source for
     *        the replication group.
     */

    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     * 
     * @return The cache cluster ID that is used as the daily snapshot source
     *         for the replication group.
     */

    public String getSnapshottingClusterId() {
        return this.snapshottingClusterId;
    }

    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the
     * replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cache cluster ID that is used as the daily snapshot source for
     *        the replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationGroup withSnapshottingClusterId(
            String snapshottingClusterId) {
        setSnapshottingClusterId(snapshottingClusterId);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ for this replication group.
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups are not supported on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        </ul>
     * @see AutomaticFailoverStatus
     */

    public void setAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ for this replication group.
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Indicates the status of Multi-AZ for this replication group.</p>
     *         <note>
     *         <p>
     *         ElastiCache Multi-AZ replication groups are not supported on:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis versions earlier than 2.8.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         T1 and T2 cache node types.
     *         </p>
     *         </li>
     *         </ul>
     * @see AutomaticFailoverStatus
     */

    public String getAutomaticFailover() {
        return this.automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ for this replication group.
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups are not supported on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AutomaticFailoverStatus
     */

    public ReplicationGroup withAutomaticFailover(String automaticFailover) {
        setAutomaticFailover(automaticFailover);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ for this replication group.
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups are not supported on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        </ul>
     * @see AutomaticFailoverStatus
     */

    public void setAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ for this replication group.
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups are not supported on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * T1 and T2 cache node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups are not supported on:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Redis versions earlier than 2.8.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        T1 and T2 cache node types.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AutomaticFailoverStatus
     */

    public ReplicationGroup withAutomaticFailover(
            AutomaticFailoverStatus automaticFailover) {
        setAutomaticFailover(automaticFailover);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues()
                    + ",");
        if (getMemberClusters() != null)
            sb.append("MemberClusters: " + getMemberClusters() + ",");
        if (getNodeGroups() != null)
            sb.append("NodeGroups: " + getNodeGroups() + ",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: " + getSnapshottingClusterId()
                    + ",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: " + getAutomaticFailover());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationGroup == false)
            return false;
        ReplicationGroup other = (ReplicationGroup) obj;
        if (other.getReplicationGroupId() == null
                ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(
                        this.getReplicationGroupId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPendingModifiedValues() == null
                ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(
                        this.getPendingModifiedValues()) == false)
            return false;
        if (other.getMemberClusters() == null
                ^ this.getMemberClusters() == null)
            return false;
        if (other.getMemberClusters() != null
                && other.getMemberClusters().equals(this.getMemberClusters()) == false)
            return false;
        if (other.getNodeGroups() == null ^ this.getNodeGroups() == null)
            return false;
        if (other.getNodeGroups() != null
                && other.getNodeGroups().equals(this.getNodeGroups()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null
                ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null
                && other.getSnapshottingClusterId().equals(
                        this.getSnapshottingClusterId()) == false)
            return false;
        if (other.getAutomaticFailover() == null
                ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null
                && other.getAutomaticFailover().equals(
                        this.getAutomaticFailover()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationGroupId() == null) ? 0
                        : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0
                        : getPendingModifiedValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getMemberClusters() == null) ? 0 : getMemberClusters()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroups() == null) ? 0 : getNodeGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshottingClusterId() == null) ? 0
                        : getSnapshottingClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailover() == null) ? 0
                        : getAutomaticFailover().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationGroup clone() {
        try {
            return (ReplicationGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
