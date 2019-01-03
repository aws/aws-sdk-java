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
 * Represents a copy of an entire Redis cluster as of the time when the snapshot was taken.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/Snapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is
     * the user-provided name.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * A description of the source replication group.
     * </p>
     */
    private String replicationGroupDescription;
    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> | <code>restoring</code>
     * | <code>copying</code> | <code>deleting</code>.
     * </p>
     */
    private String snapshotStatus;
    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created manually (
     * <code>manual</code>).
     * </p>
     */
    private String snapshotSource;
    /**
     * <p>
     * The name of the compute and memory capacity node type for the source cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>
     * </p>
     * </li>
     * </ul>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the cache engine version that is used by the source cluster.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     */
    private Integer numCacheNodes;
    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     */
    private String preferredAvailabilityZone;
    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     */
    private java.util.Date cacheClusterCreateTime;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted
     * using the <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups
     * (shards) in the snapshot and in the restored replication group must be the same.
     * </p>
     */
    private Integer numNodeGroups;
    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.
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
    private String automaticFailover;
    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeSnapshot> nodeSnapshots;

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is
     * the user-provided name.
     * </p>
     * 
     * @param snapshotName
     *        The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot,
     *        this is the user-provided name.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is
     * the user-provided name.
     * </p>
     * 
     * @return The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot,
     *         this is the user-provided name.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is
     * the user-provided name.
     * </p>
     * 
     * @param snapshotName
     *        The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot,
     *        this is the user-provided name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The unique identifier of the source replication group.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     * 
     * @return The unique identifier of the source replication group.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The unique identifier of the source replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The unique identifier of the source replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A description of the source replication group.
     */

    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     * 
     * @return A description of the source replication group.
     */

    public String getReplicationGroupDescription() {
        return this.replicationGroupDescription;
    }

    /**
     * <p>
     * A description of the source replication group.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A description of the source replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withReplicationGroupDescription(String replicationGroupDescription) {
        setReplicationGroupDescription(replicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied identifier of the source cluster.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     * 
     * @return The user-supplied identifier of the source cluster.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the source cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied identifier of the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> | <code>restoring</code>
     * | <code>copying</code> | <code>deleting</code>.
     * </p>
     * 
     * @param snapshotStatus
     *        The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> |
     *        <code>restoring</code> | <code>copying</code> | <code>deleting</code>.
     */

    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> | <code>restoring</code>
     * | <code>copying</code> | <code>deleting</code>.
     * </p>
     * 
     * @return The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> |
     *         <code>restoring</code> | <code>copying</code> | <code>deleting</code>.
     */

    public String getSnapshotStatus() {
        return this.snapshotStatus;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> | <code>restoring</code>
     * | <code>copying</code> | <code>deleting</code>.
     * </p>
     * 
     * @param snapshotStatus
     *        The status of the snapshot. Valid values: <code>creating</code> | <code>available</code> |
     *        <code>restoring</code> | <code>copying</code> | <code>deleting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotStatus(String snapshotStatus) {
        setSnapshotStatus(snapshotStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created manually (
     * <code>manual</code>).
     * </p>
     * 
     * @param snapshotSource
     *        Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created
     *        manually (<code>manual</code>).
     */

    public void setSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created manually (
     * <code>manual</code>).
     * </p>
     * 
     * @return Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created
     *         manually (<code>manual</code>).
     */

    public String getSnapshotSource() {
        return this.snapshotSource;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created manually (
     * <code>manual</code>).
     * </p>
     * 
     * @param snapshotSource
     *        Indicates whether the snapshot is from an automatic backup (<code>automated</code>) or was created
     *        manually (<code>manual</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotSource(String snapshotSource) {
        setSnapshotSource(snapshotSource);
        return this;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheNodeType
     *        The name of the compute and memory capacity node type for the source cluster.</p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        <p>
     *        <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *        <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *        <code>cache.r4.16xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>
     *        </p>
     *        </li>
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the compute and memory capacity node type for the source cluster.</p>
     *         <p>
     *         The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *         provide more memory and computational power at lower cost when compared to their equivalent previous
     *         generation counterparts.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *         <code>cache.t2.medium</code>
     *         </p>
     *         <p>
     *         <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *         </p>
     *         <p>
     *         <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *         <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>T1 node types:</b> <code>cache.t1.micro</code>
     *         </p>
     *         <p>
     *         <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         <p>
     *         <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *         <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *         <code>cache.r4.16xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Notes:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a complete listing of node types and specifications, see:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Memcached</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Redis</a>
     *         </p>
     *         </li>
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the source cluster.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * <p>
     * <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>, <code>cache.r4.2xlarge</code>,
     * <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>, <code>cache.r4.16xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheNodeType
     *        The name of the compute and memory capacity node type for the source cluster.</p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        <p>
     *        <b>R4 node types;</b> <code>cache.r4.large</code>, <code>cache.r4.xlarge</code>,
     *        <code>cache.r4.2xlarge</code>, <code>cache.r4.4xlarge</code>, <code>cache.r4.8xlarge</code>,
     *        <code>cache.r4.16xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/ParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     * </p>
     * 
     * @return The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine (<code>memcached</code> or <code>redis</code>) used by the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the cache engine version that is used by the source cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the cache engine version that is used by the source cluster.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine version that is used by the source cluster.
     * </p>
     * 
     * @return The version of the cache engine version that is used by the source cluster.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine version that is used by the source cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the cache engine version that is used by the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The number of cache nodes in the source cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     */

    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @return The number of cache nodes in the source cluster.</p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20.
     */

    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the source cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The number of cache nodes in the source cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNumCacheNodes(Integer numCacheNodes) {
        setNumCacheNodes(numCacheNodes);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the source cluster is located.
     */

    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     * 
     * @return The name of the Availability Zone in which the source cluster is located.
     */

    public String getPreferredAvailabilityZone() {
        return this.preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the source cluster is located.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the source cluster is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        setPreferredAvailabilityZone(preferredAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     * 
     * @param cacheClusterCreateTime
     *        The date and time when the source cluster was created.
     */

    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     * 
     * @return The date and time when the source cluster was created.
     */

    public java.util.Date getCacheClusterCreateTime() {
        return this.cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the source cluster was created.
     * </p>
     * 
     * @param cacheClusterCreateTime
     *        The date and time when the source cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        setCacheClusterCreateTime(cacheClusterCreateTime);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period.</p>
     *        <p>
     *        Valid values for <code>ddd</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sun</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>wed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>thu</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sat</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>sun:23:00-mon:01:30</code>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * 
     * @return Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as
     *         a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *         minute period.</p>
     *         <p>
     *         Valid values for <code>ddd</code> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sun</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tue</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>wed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>thu</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sat</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>sun:23:00-mon:01:30</code>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period.</p>
     *        <p>
     *        Valid values for <code>ddd</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sun</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>wed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>thu</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sat</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>sun:23:00-mon:01:30</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     * 
     * @param port
     *        The port number used by each cache nodes in the source cluster.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     * 
     * @return The port number used by each cache nodes in the source cluster.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number used by each cache nodes in the source cluster.
     * </p>
     * 
     * @param port
     *        The port number used by each cache nodes in the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The cache parameter group that is associated with the source cluster.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     * 
     * @return The cache parameter group that is associated with the source cluster.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The cache parameter group that is associated with the source cluster.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The cache parameter group that is associated with the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group associated with the source cluster.
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     * 
     * @return The name of the cache subnet group associated with the source cluster.
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the source cluster.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group associated with the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     * </p>
     * 
     * @param vpcId
     *        The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     * </p>
     * 
     * @return The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     * </p>
     * 
     * @param vpcId
     *        The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        This parameter is currently disabled.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @return This parameter is currently disabled.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        This parameter is currently disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     * 
     * @return This parameter is currently disabled.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted
     * using the <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting
     *        it.</p>
     *        <p>
     *        For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster
     *        when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can
     *        only be deleted using the <code>DeleteSnapshot</code> operation.
     *        </p>
     *        <p>
     *        <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted
     * using the <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * 
     * @return For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting
     *         it.</p>
     *         <p>
     *         For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster
     *         when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can
     *         only be deleted using the <code>DeleteSnapshot</code> operation.
     *         </p>
     *         <p>
     *         <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it.
     * </p>
     * <p>
     * For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster when the
     * snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted
     * using the <code>DeleteSnapshot</code> operation.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting
     *        it.</p>
     *        <p>
     *        For manual snapshots, this field reflects the <code>SnapshotRetentionLimit</code> for the source cluster
     *        when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can
     *        only be deleted using the <code>DeleteSnapshot</code> operation.
     *        </p>
     *        <p>
     *        <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     * </p>
     * 
     * @return The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range during which ElastiCache takes daily snapshots of the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups
     * (shards) in the snapshot and in the restored replication group must be the same.
     * </p>
     * 
     * @param numNodeGroups
     *        The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node
     *        groups (shards) in the snapshot and in the restored replication group must be the same.
     */

    public void setNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
    }

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups
     * (shards) in the snapshot and in the restored replication group must be the same.
     * </p>
     * 
     * @return The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node
     *         groups (shards) in the snapshot and in the restored replication group must be the same.
     */

    public Integer getNumNodeGroups() {
        return this.numNodeGroups;
    }

    /**
     * <p>
     * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups
     * (shards) in the snapshot and in the restored replication group must be the same.
     * </p>
     * 
     * @param numNodeGroups
     *        The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node
     *        groups (shards) in the snapshot and in the restored replication group must be the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNumNodeGroups(Integer numNodeGroups) {
        setNumNodeGroups(numNodeGroups);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.
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
     * @param automaticFailover
     *        Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.</p>
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
     * @see AutomaticFailoverStatus
     */

    public void setAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.
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
     * @return Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.</p>
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
     * @see AutomaticFailoverStatus
     */

    public String getAutomaticFailover() {
        return this.automaticFailover;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.
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
     * @param automaticFailover
     *        Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.</p>
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
     * @see AutomaticFailoverStatus
     */

    public Snapshot withAutomaticFailover(String automaticFailover) {
        setAutomaticFailover(automaticFailover);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.
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
     * @param automaticFailover
     *        Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.</p>
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
     * @see AutomaticFailoverStatus
     */

    public void setAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        withAutomaticFailover(automaticFailover);
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.
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
     * @param automaticFailover
     *        Indicates the status of Multi-AZ with automatic failover for the source Redis replication group.</p>
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
     * @see AutomaticFailoverStatus
     */

    public Snapshot withAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
        return this;
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     * 
     * @return A list of the cache nodes in the source cluster.
     */

    public java.util.List<NodeSnapshot> getNodeSnapshots() {
        if (nodeSnapshots == null) {
            nodeSnapshots = new com.amazonaws.internal.SdkInternalList<NodeSnapshot>();
        }
        return nodeSnapshots;
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     * 
     * @param nodeSnapshots
     *        A list of the cache nodes in the source cluster.
     */

    public void setNodeSnapshots(java.util.Collection<NodeSnapshot> nodeSnapshots) {
        if (nodeSnapshots == null) {
            this.nodeSnapshots = null;
            return;
        }

        this.nodeSnapshots = new com.amazonaws.internal.SdkInternalList<NodeSnapshot>(nodeSnapshots);
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeSnapshots(java.util.Collection)} or {@link #withNodeSnapshots(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodeSnapshots
     *        A list of the cache nodes in the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNodeSnapshots(NodeSnapshot... nodeSnapshots) {
        if (this.nodeSnapshots == null) {
            setNodeSnapshots(new com.amazonaws.internal.SdkInternalList<NodeSnapshot>(nodeSnapshots.length));
        }
        for (NodeSnapshot ele : nodeSnapshots) {
            this.nodeSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the cache nodes in the source cluster.
     * </p>
     * 
     * @param nodeSnapshots
     *        A list of the cache nodes in the source cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNodeSnapshots(java.util.Collection<NodeSnapshot> nodeSnapshots) {
        setNodeSnapshots(nodeSnapshots);
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
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getReplicationGroupDescription() != null)
            sb.append("ReplicationGroupDescription: ").append(getReplicationGroupDescription()).append(",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getSnapshotStatus() != null)
            sb.append("SnapshotStatus: ").append(getSnapshotStatus()).append(",");
        if (getSnapshotSource() != null)
            sb.append("SnapshotSource: ").append(getSnapshotSource()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: ").append(getNumCacheNodes()).append(",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: ").append(getPreferredAvailabilityZone()).append(",");
        if (getCacheClusterCreateTime() != null)
            sb.append("CacheClusterCreateTime: ").append(getCacheClusterCreateTime()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: ").append(getCacheSubnetGroupName()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getNumNodeGroups() != null)
            sb.append("NumNodeGroups: ").append(getNumNodeGroups()).append(",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: ").append(getAutomaticFailover()).append(",");
        if (getNodeSnapshots() != null)
            sb.append("NodeSnapshots: ").append(getNodeSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupDescription() == null ^ this.getReplicationGroupDescription() == null)
            return false;
        if (other.getReplicationGroupDescription() != null && other.getReplicationGroupDescription().equals(this.getReplicationGroupDescription()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotStatus() == null ^ this.getSnapshotStatus() == null)
            return false;
        if (other.getSnapshotStatus() != null && other.getSnapshotStatus().equals(this.getSnapshotStatus()) == false)
            return false;
        if (other.getSnapshotSource() == null ^ this.getSnapshotSource() == null)
            return false;
        if (other.getSnapshotSource() != null && other.getSnapshotSource().equals(this.getSnapshotSource()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null)
            return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false)
            return false;
        if (other.getCacheClusterCreateTime() == null ^ this.getCacheClusterCreateTime() == null)
            return false;
        if (other.getCacheClusterCreateTime() != null && other.getCacheClusterCreateTime().equals(this.getCacheClusterCreateTime()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getNumNodeGroups() == null ^ this.getNumNodeGroups() == null)
            return false;
        if (other.getNumNodeGroups() != null && other.getNumNodeGroups().equals(this.getNumNodeGroups()) == false)
            return false;
        if (other.getAutomaticFailover() == null ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null && other.getAutomaticFailover().equals(this.getAutomaticFailover()) == false)
            return false;
        if (other.getNodeSnapshots() == null ^ this.getNodeSnapshots() == null)
            return false;
        if (other.getNodeSnapshots() != null && other.getNodeSnapshots().equals(this.getNodeSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupDescription() == null) ? 0 : getReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotStatus() == null) ? 0 : getSnapshotStatus().hashCode());
        hashCode = prime * hashCode + ((getSnapshotSource() == null) ? 0 : getSnapshotSource().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterCreateTime() == null) ? 0 : getCacheClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getNumNodeGroups() == null) ? 0 : getNumNodeGroups().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailover() == null) ? 0 : getAutomaticFailover().hashCode());
        hashCode = prime * hashCode + ((getNodeSnapshots() == null) ? 0 : getNodeSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
