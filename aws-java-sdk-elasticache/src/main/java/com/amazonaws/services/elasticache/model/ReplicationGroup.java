/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains all of the attributes of a specific Redis replication group.
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
     * The current state of this replication group - <code>creating</code>, <code>available</code>, etc.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     */
    private ReplicationGroupPendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> memberClusters;
    /**
     * <p>
     * A single element list with information about the nodes in the replication group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeGroup> nodeGroups;
    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the replication group.
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
     * Redis (cluster mode disabled):T1 and T2 cache node types.
     * </p>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String automaticFailover;
    /**
     * <p>
     * The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     */
    private Endpoint configurationEndpoint;
    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <p>
     * <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     */
    private String snapshotWindow;

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
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withDescription(String description) {
        setDescription(description);
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

    public ReplicationGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A group of settings to be applied to the replication group, either immediately or during the next
     *        maintenance window.
     */

    public void setPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     * 
     * @return A group of settings to be applied to the replication group, either immediately or during the next
     *         maintenance window.
     */

    public ReplicationGroupPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A group of settings to be applied to the replication group, either immediately or during the next maintenance
     * window.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A group of settings to be applied to the replication group, either immediately or during the next
     *        maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * 
     * @return The names of all the cache clusters that are part of this replication group.
     */

    public java.util.List<String> getMemberClusters() {
        if (memberClusters == null) {
            memberClusters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return memberClusters;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this replication group.
     */

    public void setMemberClusters(java.util.Collection<String> memberClusters) {
        if (memberClusters == null) {
            this.memberClusters = null;
            return;
        }

        this.memberClusters = new com.amazonaws.internal.SdkInternalList<String>(memberClusters);
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberClusters(java.util.Collection)} or {@link #withMemberClusters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withMemberClusters(String... memberClusters) {
        if (this.memberClusters == null) {
            setMemberClusters(new com.amazonaws.internal.SdkInternalList<String>(memberClusters.length));
        }
        for (String ele : memberClusters) {
            this.memberClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of all the cache clusters that are part of this replication group.
     * </p>
     * 
     * @param memberClusters
     *        The names of all the cache clusters that are part of this replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withMemberClusters(java.util.Collection<String> memberClusters) {
        setMemberClusters(memberClusters);
        return this;
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication group.
     * </p>
     * 
     * @return A single element list with information about the nodes in the replication group.
     */

    public java.util.List<NodeGroup> getNodeGroups() {
        if (nodeGroups == null) {
            nodeGroups = new com.amazonaws.internal.SdkInternalList<NodeGroup>();
        }
        return nodeGroups;
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication group.
     * </p>
     * 
     * @param nodeGroups
     *        A single element list with information about the nodes in the replication group.
     */

    public void setNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        if (nodeGroups == null) {
            this.nodeGroups = null;
            return;
        }

        this.nodeGroups = new com.amazonaws.internal.SdkInternalList<NodeGroup>(nodeGroups);
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroups(java.util.Collection)} or {@link #withNodeGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodeGroups
     *        A single element list with information about the nodes in the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withNodeGroups(NodeGroup... nodeGroups) {
        if (this.nodeGroups == null) {
            setNodeGroups(new com.amazonaws.internal.SdkInternalList<NodeGroup>(nodeGroups.length));
        }
        for (NodeGroup ele : nodeGroups) {
            this.nodeGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single element list with information about the nodes in the replication group.
     * </p>
     * 
     * @param nodeGroups
     *        A single element list with information about the nodes in the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        setNodeGroups(nodeGroups);
        return this;
    }

    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cache cluster ID that is used as the daily snapshot source for the replication group.
     */

    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     * 
     * @return The cache cluster ID that is used as the daily snapshot source for the replication group.
     */

    public String getSnapshottingClusterId() {
        return this.snapshottingClusterId;
    }

    /**
     * <p>
     * The cache cluster ID that is used as the daily snapshot source for the replication group.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cache cluster ID that is used as the daily snapshot source for the replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withSnapshottingClusterId(String snapshottingClusterId) {
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
     * Redis (cluster mode disabled):T1 and T2 cache node types.
     * </p>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p> <note>
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
     *        Redis (cluster mode disabled):T1 and T2 cache node types.
     *        </p>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
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
     * Redis (cluster mode disabled):T1 and T2 cache node types.
     * </p>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Indicates the status of Multi-AZ for this replication group.</p> <note>
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
     *         Redis (cluster mode disabled):T1 and T2 cache node types.
     *         </p>
     *         <p>
     *         Redis (cluster mode enabled): T1 node types.
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
     * Redis (cluster mode disabled):T1 and T2 cache node types.
     * </p>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p> <note>
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
     *        Redis (cluster mode disabled):T1 and T2 cache node types.
     *        </p>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * Redis (cluster mode disabled):T1 and T2 cache node types.
     * </p>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p> <note>
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
     *        Redis (cluster mode disabled):T1 and T2 cache node types.
     *        </p>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
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
     * Redis (cluster mode disabled):T1 and T2 cache node types.
     * </p>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param automaticFailover
     *        Indicates the status of Multi-AZ for this replication group.</p> <note>
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
     *        Redis (cluster mode disabled):T1 and T2 cache node types.
     *        </p>
     *        <p>
     *        Redis (cluster mode enabled): T1 node types.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomaticFailoverStatus
     */

    public ReplicationGroup withAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        setAutomaticFailover(automaticFailover);
        return this;
    }

    /**
     * <p>
     * The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     * 
     * @param configurationEndpoint
     *        The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     *        replication group.
     */

    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     * 
     * @return The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     *         replication group.
     */

    public Endpoint getConfigurationEndpoint() {
        return this.configurationEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     * replication group.
     * </p>
     * 
     * @param configurationEndpoint
     *        The configuration endpoint for this replicaiton group. Use the configuration endpoint to connect to this
     *        replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withConfigurationEndpoint(Endpoint configurationEndpoint) {
        setConfigurationEndpoint(configurationEndpoint);
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     *        For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *        retained for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     *        </p>
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @return The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     *         For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *         retained for 5 days before being deleted.</p> <important>
     *         <p>
     *         If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     *         </p>
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     *        For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *        retained for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of <code>SnapshotRetentionLimit</code> is set to zero (0), backups are turned off.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <p>
     * <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group
     *        (shard).</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     *        </p>
     *        <p>
     *        <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <p>
     * <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * 
     * @return The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group
     *         (shard).</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     *         <p>
     *         If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     *         </p>
     *         <p>
     *         <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * <p>
     * <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group
     *        (shard).</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     *        </p>
     *        <p>
     *        <b>Note:</b> This parameter is only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroup withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getMemberClusters() != null)
            sb.append("MemberClusters: " + getMemberClusters() + ",");
        if (getNodeGroups() != null)
            sb.append("NodeGroups: " + getNodeGroups() + ",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: " + getSnapshottingClusterId() + ",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: " + getAutomaticFailover() + ",");
        if (getConfigurationEndpoint() != null)
            sb.append("ConfigurationEndpoint: " + getConfigurationEndpoint() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: " + getSnapshotWindow());
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
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getMemberClusters() == null ^ this.getMemberClusters() == null)
            return false;
        if (other.getMemberClusters() != null && other.getMemberClusters().equals(this.getMemberClusters()) == false)
            return false;
        if (other.getNodeGroups() == null ^ this.getNodeGroups() == null)
            return false;
        if (other.getNodeGroups() != null && other.getNodeGroups().equals(this.getNodeGroups()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null && other.getSnapshottingClusterId().equals(this.getSnapshottingClusterId()) == false)
            return false;
        if (other.getAutomaticFailover() == null ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null && other.getAutomaticFailover().equals(this.getAutomaticFailover()) == false)
            return false;
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null)
            return false;
        if (other.getConfigurationEndpoint() != null && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getMemberClusters() == null) ? 0 : getMemberClusters().hashCode());
        hashCode = prime * hashCode + ((getNodeGroups() == null) ? 0 : getNodeGroups().hashCode());
        hashCode = prime * hashCode + ((getSnapshottingClusterId() == null) ? 0 : getSnapshottingClusterId().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailover() == null) ? 0 : getAutomaticFailover().hashCode());
        hashCode = prime * hashCode + ((getConfigurationEndpoint() == null) ? 0 : getConfigurationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationGroup clone() {
        try {
            return (ReplicationGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
