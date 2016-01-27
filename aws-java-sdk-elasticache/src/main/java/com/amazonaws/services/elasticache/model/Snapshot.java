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
 * Represents a copy of an entire cache cluster as of the time when the
 * snapshot was taken.
 * </p>
 */
public class Snapshot implements Serializable, Cloneable {

    /**
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated; for a manual snapshot, this is the user-provided
     * name.
     */
    private String snapshotName;

    /**
     * The user-supplied identifier of the source cache cluster.
     */
    private String cacheClusterId;

    /**
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code>
     * | <code>deleting</code>.
     */
    private String snapshotStatus;

    /**
     * Indicates whether the snapshot is from an automatic backup
     * (<code>automated</code>) or was created manually
     * (<code>manual</code>).
     */
    private String snapshotSource;

    /**
     * The name of the compute and memory capacity node type for the source
     * cache cluster. <p>Valid node types are as follows: <ul> <li>General
     * purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     * <li>Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     * </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     * <li>Memory optimized <ul> <li>Current generation:
     * <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     * <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     * <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     * <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     * <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     * <ul> <li>All t2 instances are created in an Amazon Virtual Private
     * Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     * instances.</li> <li>Redis Append-only files (AOF) functionality is not
     * supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     * of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     * Node Type-Specific Parameters for Memcached</a> or <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     * Node Type-Specific Parameters for Redis</a>.
     */
    private String cacheNodeType;

    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     * by the source cache cluster.
     */
    private String engine;

    /**
     * The version of the cache engine version that is used by the source
     * cache cluster.
     */
    private String engineVersion;

    /**
     * The number of cache nodes in the source cache cluster. <p>For clusters
     * running Redis, this value must be 1. For clusters running Memcached,
     * this value must be between 1 and 20.
     */
    private Integer numCacheNodes;

    /**
     * The name of the Availability Zone in which the source cache cluster is
     * located.
     */
    private String preferredAvailabilityZone;

    /**
     * The date and time when the source cache cluster was created.
     */
    private java.util.Date cacheClusterCreateTime;

    /**
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     * window is a 60 minute period. Valid values for <code>ddd</code> are:
     * <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     * <li><code>tue</code></li> <li><code>wed</code></li>
     * <li><code>thu</code></li> <li><code>fri</code></li>
     * <li><code>sat</code></li> </ul> <p>Example:
     * <code>sun:05:00-sun:09:00</code>
     */
    private String preferredMaintenanceWindow;

    /**
     * The Amazon Resource Name (ARN) for the topic used by the source cache
     * cluster for publishing notifications.
     */
    private String topicArn;

    /**
     * The port number used by each cache nodes in the source cache cluster.
     */
    private Integer port;

    /**
     * The cache parameter group that is associated with the source cache
     * cluster.
     */
    private String cacheParameterGroupName;

    /**
     * The name of the cache subnet group associated with the source cache
     * cluster.
     */
    private String cacheSubnetGroupName;

    /**
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     * subnet group for the source cache cluster.
     */
    private String vpcId;

    /**
     * This parameter is currently disabled.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * For an automatic snapshot, the number of days for which ElastiCache
     * will retain the snapshot before deleting it. <p>For manual snapshots,
     * this field reflects the <i>SnapshotRetentionLimit</i> for the source
     * cache cluster when the snapshot was created. This field is otherwise
     * ignored: Manual snapshots do not expire, and can only be deleted using
     * the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     * of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */
    private Integer snapshotRetentionLimit;

    /**
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cache cluster.
     */
    private String snapshotWindow;

    /**
     * A list of the cache nodes in the source cache cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NodeSnapshot> nodeSnapshots;

    /**
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated; for a manual snapshot, this is the user-provided
     * name.
     *
     * @return The name of a snapshot. For an automatic snapshot, the name is
     *         system-generated; for a manual snapshot, this is the user-provided
     *         name.
     */
    public String getSnapshotName() {
        return snapshotName;
    }
    
    /**
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated; for a manual snapshot, this is the user-provided
     * name.
     *
     * @param snapshotName The name of a snapshot. For an automatic snapshot, the name is
     *         system-generated; for a manual snapshot, this is the user-provided
     *         name.
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }
    
    /**
     * The name of a snapshot. For an automatic snapshot, the name is
     * system-generated; for a manual snapshot, this is the user-provided
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotName The name of a snapshot. For an automatic snapshot, the name is
     *         system-generated; for a manual snapshot, this is the user-provided
     *         name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * The user-supplied identifier of the source cache cluster.
     *
     * @return The user-supplied identifier of the source cache cluster.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The user-supplied identifier of the source cache cluster.
     *
     * @param cacheClusterId The user-supplied identifier of the source cache cluster.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The user-supplied identifier of the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The user-supplied identifier of the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code>
     * | <code>deleting</code>.
     *
     * @return The status of the snapshot. Valid values: <code>creating</code> |
     *         <code>available</code> | <code>restoring</code> | <code>copying</code>
     *         | <code>deleting</code>.
     */
    public String getSnapshotStatus() {
        return snapshotStatus;
    }
    
    /**
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code>
     * | <code>deleting</code>.
     *
     * @param snapshotStatus The status of the snapshot. Valid values: <code>creating</code> |
     *         <code>available</code> | <code>restoring</code> | <code>copying</code>
     *         | <code>deleting</code>.
     */
    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }
    
    /**
     * The status of the snapshot. Valid values: <code>creating</code> |
     * <code>available</code> | <code>restoring</code> | <code>copying</code>
     * | <code>deleting</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotStatus The status of the snapshot. Valid values: <code>creating</code> |
     *         <code>available</code> | <code>restoring</code> | <code>copying</code>
     *         | <code>deleting</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    /**
     * Indicates whether the snapshot is from an automatic backup
     * (<code>automated</code>) or was created manually
     * (<code>manual</code>).
     *
     * @return Indicates whether the snapshot is from an automatic backup
     *         (<code>automated</code>) or was created manually
     *         (<code>manual</code>).
     */
    public String getSnapshotSource() {
        return snapshotSource;
    }
    
    /**
     * Indicates whether the snapshot is from an automatic backup
     * (<code>automated</code>) or was created manually
     * (<code>manual</code>).
     *
     * @param snapshotSource Indicates whether the snapshot is from an automatic backup
     *         (<code>automated</code>) or was created manually
     *         (<code>manual</code>).
     */
    public void setSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
    }
    
    /**
     * Indicates whether the snapshot is from an automatic backup
     * (<code>automated</code>) or was created manually
     * (<code>manual</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotSource Indicates whether the snapshot is from an automatic backup
     *         (<code>automated</code>) or was created manually
     *         (<code>manual</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
        return this;
    }

    /**
     * The name of the compute and memory capacity node type for the source
     * cache cluster. <p>Valid node types are as follows: <ul> <li>General
     * purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     * <li>Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     * </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     * <li>Memory optimized <ul> <li>Current generation:
     * <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     * <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     * <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     * <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     * <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     * <ul> <li>All t2 instances are created in an Amazon Virtual Private
     * Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     * instances.</li> <li>Redis Append-only files (AOF) functionality is not
     * supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     * of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     * Node Type-Specific Parameters for Memcached</a> or <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     * Node Type-Specific Parameters for Redis</a>.
     *
     * @return The name of the compute and memory capacity node type for the source
     *         cache cluster. <p>Valid node types are as follows: <ul> <li>General
     *         purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *         <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     *         <li>Previous generation: <code>cache.t1.micro</code>,
     *         <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     *         </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     *         <li>Memory optimized <ul> <li>Current generation:
     *         <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     *         <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     *         <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     *         <ul> <li>All t2 instances are created in an Amazon Virtual Private
     *         Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     *         instances.</li> <li>Redis Append-only files (AOF) functionality is not
     *         supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     *         of cache node types and specifications, see <a
     *         href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     *         Product Features and Details</a> and <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     *         Node Type-Specific Parameters for Memcached</a> or <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     *         Node Type-Specific Parameters for Redis</a>.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The name of the compute and memory capacity node type for the source
     * cache cluster. <p>Valid node types are as follows: <ul> <li>General
     * purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     * <li>Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     * </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     * <li>Memory optimized <ul> <li>Current generation:
     * <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     * <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     * <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     * <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     * <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     * <ul> <li>All t2 instances are created in an Amazon Virtual Private
     * Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     * instances.</li> <li>Redis Append-only files (AOF) functionality is not
     * supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     * of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     * Node Type-Specific Parameters for Memcached</a> or <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     * Node Type-Specific Parameters for Redis</a>.
     *
     * @param cacheNodeType The name of the compute and memory capacity node type for the source
     *         cache cluster. <p>Valid node types are as follows: <ul> <li>General
     *         purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *         <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     *         <li>Previous generation: <code>cache.t1.micro</code>,
     *         <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     *         </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     *         <li>Memory optimized <ul> <li>Current generation:
     *         <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     *         <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     *         <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     *         <ul> <li>All t2 instances are created in an Amazon Virtual Private
     *         Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     *         instances.</li> <li>Redis Append-only files (AOF) functionality is not
     *         supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     *         of cache node types and specifications, see <a
     *         href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     *         Product Features and Details</a> and <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     *         Node Type-Specific Parameters for Memcached</a> or <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     *         Node Type-Specific Parameters for Redis</a>.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The name of the compute and memory capacity node type for the source
     * cache cluster. <p>Valid node types are as follows: <ul> <li>General
     * purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     * <li>Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     * </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     * <li>Memory optimized <ul> <li>Current generation:
     * <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     * <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     * <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     * <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     * <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     * <ul> <li>All t2 instances are created in an Amazon Virtual Private
     * Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     * instances.</li> <li>Redis Append-only files (AOF) functionality is not
     * supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     * of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     * Node Type-Specific Parameters for Memcached</a> or <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     * Node Type-Specific Parameters for Redis</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The name of the compute and memory capacity node type for the source
     *         cache cluster. <p>Valid node types are as follows: <ul> <li>General
     *         purpose: <ul> <li>Current generation: <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *         <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code></li>
     *         <li>Previous generation: <code>cache.t1.micro</code>,
     *         <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code></li>
     *         </ul></li> <li>Compute optimized: <code>cache.c1.xlarge</code></li>
     *         <li>Memory optimized <ul> <li>Current generation:
     *         <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>,
     *         <code>cache.r3.8xlarge</code></li> <li>Previous generation:
     *         <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code></li> </ul></li> </ul> <p><b>Notes:</b>
     *         <ul> <li>All t2 instances are created in an Amazon Virtual Private
     *         Cloud (VPC).</li> <li>Redis backup/restore is not supported for t2
     *         instances.</li> <li>Redis Append-only files (AOF) functionality is not
     *         supported for t1 or t2 instances.</li> </ul> <p>For a complete listing
     *         of cache node types and specifications, see <a
     *         href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     *         Product Features and Details</a> and <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific">Cache
     *         Node Type-Specific Parameters for Memcached</a> or <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific">Cache
     *         Node Type-Specific Parameters for Redis</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     * by the source cache cluster.
     *
     * @return The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     *         by the source cache cluster.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     * by the source cache cluster.
     *
     * @param engine The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     *         by the source cache cluster.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     * by the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the cache engine (<i>memcached</i> or <i>redis</i>) used
     *         by the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version of the cache engine version that is used by the source
     * cache cluster.
     *
     * @return The version of the cache engine version that is used by the source
     *         cache cluster.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version of the cache engine version that is used by the source
     * cache cluster.
     *
     * @param engineVersion The version of the cache engine version that is used by the source
     *         cache cluster.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version of the cache engine version that is used by the source
     * cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version of the cache engine version that is used by the source
     *         cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The number of cache nodes in the source cache cluster. <p>For clusters
     * running Redis, this value must be 1. For clusters running Memcached,
     * this value must be between 1 and 20.
     *
     * @return The number of cache nodes in the source cache cluster. <p>For clusters
     *         running Redis, this value must be 1. For clusters running Memcached,
     *         this value must be between 1 and 20.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The number of cache nodes in the source cache cluster. <p>For clusters
     * running Redis, this value must be 1. For clusters running Memcached,
     * this value must be between 1 and 20.
     *
     * @param numCacheNodes The number of cache nodes in the source cache cluster. <p>For clusters
     *         running Redis, this value must be 1. For clusters running Memcached,
     *         this value must be between 1 and 20.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The number of cache nodes in the source cache cluster. <p>For clusters
     * running Redis, this value must be 1. For clusters running Memcached,
     * this value must be between 1 and 20.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The number of cache nodes in the source cache cluster. <p>For clusters
     *         running Redis, this value must be 1. For clusters running Memcached,
     *         this value must be between 1 and 20.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * The name of the Availability Zone in which the source cache cluster is
     * located.
     *
     * @return The name of the Availability Zone in which the source cache cluster is
     *         located.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the source cache cluster is
     * located.
     *
     * @param preferredAvailabilityZone The name of the Availability Zone in which the source cache cluster is
     *         located.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the source cache cluster is
     * located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone The name of the Availability Zone in which the source cache cluster is
     *         located.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * The date and time when the source cache cluster was created.
     *
     * @return The date and time when the source cache cluster was created.
     */
    public java.util.Date getCacheClusterCreateTime() {
        return cacheClusterCreateTime;
    }
    
    /**
     * The date and time when the source cache cluster was created.
     *
     * @param cacheClusterCreateTime The date and time when the source cache cluster was created.
     */
    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }
    
    /**
     * The date and time when the source cache cluster was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterCreateTime The date and time when the source cache cluster was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
        return this;
    }

    /**
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     * window is a 60 minute period. Valid values for <code>ddd</code> are:
     * <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     * <li><code>tue</code></li> <li><code>wed</code></li>
     * <li><code>thu</code></li> <li><code>fri</code></li>
     * <li><code>sat</code></li> </ul> <p>Example:
     * <code>sun:05:00-sun:09:00</code>
     *
     * @return Specifies the weekly time range during which maintenance on the cache
     *         cluster is performed. It is specified as a range in the format
     *         ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     *         window is a 60 minute period. Valid values for <code>ddd</code> are:
     *         <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     *         <li><code>tue</code></li> <li><code>wed</code></li>
     *         <li><code>thu</code></li> <li><code>fri</code></li>
     *         <li><code>sat</code></li> </ul> <p>Example:
     *         <code>sun:05:00-sun:09:00</code>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     * window is a 60 minute period. Valid values for <code>ddd</code> are:
     * <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     * <li><code>tue</code></li> <li><code>wed</code></li>
     * <li><code>thu</code></li> <li><code>fri</code></li>
     * <li><code>sat</code></li> </ul> <p>Example:
     * <code>sun:05:00-sun:09:00</code>
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on the cache
     *         cluster is performed. It is specified as a range in the format
     *         ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     *         window is a 60 minute period. Valid values for <code>ddd</code> are:
     *         <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     *         <li><code>tue</code></li> <li><code>wed</code></li>
     *         <li><code>thu</code></li> <li><code>fri</code></li>
     *         <li><code>sat</code></li> </ul> <p>Example:
     *         <code>sun:05:00-sun:09:00</code>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     * window is a 60 minute period. Valid values for <code>ddd</code> are:
     * <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     * <li><code>tue</code></li> <li><code>wed</code></li>
     * <li><code>thu</code></li> <li><code>fri</code></li>
     * <li><code>sat</code></li> </ul> <p>Example:
     * <code>sun:05:00-sun:09:00</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on the cache
     *         cluster is performed. It is specified as a range in the format
     *         ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance
     *         window is a 60 minute period. Valid values for <code>ddd</code> are:
     *         <ul> <li><code>sun</code></li> <li><code>mon</code></li>
     *         <li><code>tue</code></li> <li><code>wed</code></li>
     *         <li><code>thu</code></li> <li><code>fri</code></li>
     *         <li><code>sat</code></li> </ul> <p>Example:
     *         <code>sun:05:00-sun:09:00</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) for the topic used by the source cache
     * cluster for publishing notifications.
     *
     * @return The Amazon Resource Name (ARN) for the topic used by the source cache
     *         cluster for publishing notifications.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the topic used by the source cache
     * cluster for publishing notifications.
     *
     * @param topicArn The Amazon Resource Name (ARN) for the topic used by the source cache
     *         cluster for publishing notifications.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) for the topic used by the source cache
     * cluster for publishing notifications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The Amazon Resource Name (ARN) for the topic used by the source cache
     *         cluster for publishing notifications.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * The port number used by each cache nodes in the source cache cluster.
     *
     * @return The port number used by each cache nodes in the source cache cluster.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number used by each cache nodes in the source cache cluster.
     *
     * @param port The port number used by each cache nodes in the source cache cluster.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number used by each cache nodes in the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number used by each cache nodes in the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The cache parameter group that is associated with the source cache
     * cluster.
     *
     * @return The cache parameter group that is associated with the source cache
     *         cluster.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The cache parameter group that is associated with the source cache
     * cluster.
     *
     * @param cacheParameterGroupName The cache parameter group that is associated with the source cache
     *         cluster.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The cache parameter group that is associated with the source cache
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The cache parameter group that is associated with the source cache
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The name of the cache subnet group associated with the source cache
     * cluster.
     *
     * @return The name of the cache subnet group associated with the source cache
     *         cluster.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group associated with the source cache
     * cluster.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group associated with the source cache
     *         cluster.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group associated with the source cache
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group associated with the source cache
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     * subnet group for the source cache cluster.
     *
     * @return The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     *         subnet group for the source cache cluster.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     * subnet group for the source cache cluster.
     *
     * @param vpcId The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     *         subnet group for the source cache cluster.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     * subnet group for the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     *         subnet group for the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This parameter is currently disabled.
     *
     * @return This parameter is currently disabled.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * This parameter is currently disabled.
     *
     * @param autoMinorVersionUpgrade This parameter is currently disabled.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * This parameter is currently disabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade This parameter is currently disabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * This parameter is currently disabled.
     *
     * @return This parameter is currently disabled.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * For an automatic snapshot, the number of days for which ElastiCache
     * will retain the snapshot before deleting it. <p>For manual snapshots,
     * this field reflects the <i>SnapshotRetentionLimit</i> for the source
     * cache cluster when the snapshot was created. This field is otherwise
     * ignored: Manual snapshots do not expire, and can only be deleted using
     * the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     * of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     *
     * @return For an automatic snapshot, the number of days for which ElastiCache
     *         will retain the snapshot before deleting it. <p>For manual snapshots,
     *         this field reflects the <i>SnapshotRetentionLimit</i> for the source
     *         cache cluster when the snapshot was created. This field is otherwise
     *         ignored: Manual snapshots do not expire, and can only be deleted using
     *         the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     *         of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }
    
    /**
     * For an automatic snapshot, the number of days for which ElastiCache
     * will retain the snapshot before deleting it. <p>For manual snapshots,
     * this field reflects the <i>SnapshotRetentionLimit</i> for the source
     * cache cluster when the snapshot was created. This field is otherwise
     * ignored: Manual snapshots do not expire, and can only be deleted using
     * the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     * of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     *
     * @param snapshotRetentionLimit For an automatic snapshot, the number of days for which ElastiCache
     *         will retain the snapshot before deleting it. <p>For manual snapshots,
     *         this field reflects the <i>SnapshotRetentionLimit</i> for the source
     *         cache cluster when the snapshot was created. This field is otherwise
     *         ignored: Manual snapshots do not expire, and can only be deleted using
     *         the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     *         of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }
    
    /**
     * For an automatic snapshot, the number of days for which ElastiCache
     * will retain the snapshot before deleting it. <p>For manual snapshots,
     * this field reflects the <i>SnapshotRetentionLimit</i> for the source
     * cache cluster when the snapshot was created. This field is otherwise
     * ignored: Manual snapshots do not expire, and can only be deleted using
     * the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     * of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotRetentionLimit For an automatic snapshot, the number of days for which ElastiCache
     *         will retain the snapshot before deleting it. <p>For manual snapshots,
     *         this field reflects the <i>SnapshotRetentionLimit</i> for the source
     *         cache cluster when the snapshot was created. This field is otherwise
     *         ignored: Manual snapshots do not expire, and can only be deleted using
     *         the <i>DeleteSnapshot</i> action. <p><b>Important</b><br/>If the value
     *         of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cache cluster.
     *
     * @return The daily time range during which ElastiCache takes daily snapshots of
     *         the source cache cluster.
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }
    
    /**
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cache cluster.
     *
     * @param snapshotWindow The daily time range during which ElastiCache takes daily snapshots of
     *         the source cache cluster.
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }
    
    /**
     * The daily time range during which ElastiCache takes daily snapshots of
     * the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotWindow The daily time range during which ElastiCache takes daily snapshots of
     *         the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * A list of the cache nodes in the source cache cluster.
     *
     * @return A list of the cache nodes in the source cache cluster.
     */
    public java.util.List<NodeSnapshot> getNodeSnapshots() {
        if (nodeSnapshots == null) {
              nodeSnapshots = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeSnapshot>();
              nodeSnapshots.setAutoConstruct(true);
        }
        return nodeSnapshots;
    }
    
    /**
     * A list of the cache nodes in the source cache cluster.
     *
     * @param nodeSnapshots A list of the cache nodes in the source cache cluster.
     */
    public void setNodeSnapshots(java.util.Collection<NodeSnapshot> nodeSnapshots) {
        if (nodeSnapshots == null) {
            this.nodeSnapshots = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NodeSnapshot> nodeSnapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeSnapshot>(nodeSnapshots.size());
        nodeSnapshotsCopy.addAll(nodeSnapshots);
        this.nodeSnapshots = nodeSnapshotsCopy;
    }
    
    /**
     * A list of the cache nodes in the source cache cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNodeSnapshots(java.util.Collection)} or {@link
     * #withNodeSnapshots(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeSnapshots A list of the cache nodes in the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withNodeSnapshots(NodeSnapshot... nodeSnapshots) {
        if (getNodeSnapshots() == null) setNodeSnapshots(new java.util.ArrayList<NodeSnapshot>(nodeSnapshots.length));
        for (NodeSnapshot value : nodeSnapshots) {
            getNodeSnapshots().add(value);
        }
        return this;
    }
    
    /**
     * A list of the cache nodes in the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeSnapshots A list of the cache nodes in the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Snapshot withNodeSnapshots(java.util.Collection<NodeSnapshot> nodeSnapshots) {
        if (nodeSnapshots == null) {
            this.nodeSnapshots = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NodeSnapshot> nodeSnapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeSnapshot>(nodeSnapshots.size());
            nodeSnapshotsCopy.addAll(nodeSnapshots);
            this.nodeSnapshots = nodeSnapshotsCopy;
        }

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
        if (getSnapshotName() != null) sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotStatus() != null) sb.append("SnapshotStatus: " + getSnapshotStatus() + ",");
        if (getSnapshotSource() != null) sb.append("SnapshotSource: " + getSnapshotSource() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getNumCacheNodes() != null) sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getPreferredAvailabilityZone() != null) sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCacheClusterCreateTime() != null) sb.append("CacheClusterCreateTime: " + getCacheClusterCreateTime() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null) sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null) sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getNodeSnapshots() != null) sb.append("NodeSnapshots: " + getNodeSnapshots() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode()); 
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
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode()); 
        hashCode = prime * hashCode + ((getNodeSnapshots() == null) ? 0 : getNodeSnapshots().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Snapshot == false) return false;
        Snapshot other = (Snapshot)obj;
        
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null) return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false) return false; 
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getSnapshotStatus() == null ^ this.getSnapshotStatus() == null) return false;
        if (other.getSnapshotStatus() != null && other.getSnapshotStatus().equals(this.getSnapshotStatus()) == false) return false; 
        if (other.getSnapshotSource() == null ^ this.getSnapshotSource() == null) return false;
        if (other.getSnapshotSource() != null && other.getSnapshotSource().equals(this.getSnapshotSource()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null) return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false) return false; 
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null) return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false) return false; 
        if (other.getCacheClusterCreateTime() == null ^ this.getCacheClusterCreateTime() == null) return false;
        if (other.getCacheClusterCreateTime() != null && other.getCacheClusterCreateTime().equals(this.getCacheClusterCreateTime()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null) return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false) return false; 
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null) return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false) return false; 
        if (other.getNodeSnapshots() == null ^ this.getNodeSnapshots() == null) return false;
        if (other.getNodeSnapshots() != null && other.getNodeSnapshots().equals(this.getNodeSnapshots()) == false) return false; 
        return true;
    }
    
    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    