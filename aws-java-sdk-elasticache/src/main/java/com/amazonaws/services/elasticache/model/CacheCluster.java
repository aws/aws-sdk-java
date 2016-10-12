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
 * Contains all of the attributes of a specific cache cluster.
 * </p>
 */
public class CacheCluster implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a cache
     * cluster.
     * </p>
     */
    private String cacheClusterId;

    private Endpoint configurationEndpoint;
    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache client library.
     * </p>
     */
    private String clientDownloadLandingPage;
    /**
     * <p>
     * The name of the compute and memory capacity node type for the cache cluster.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the cache engine that is used in this cache cluster.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The current state of this cache cluster, one of the following values: <code>available</code>,
     * <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     * <code>snapshotting</code>.
     * </p>
     */
    private String cacheClusterStatus;
    /**
     * <p>
     * The number of cache nodes in the cache cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     */
    private Integer numCacheNodes;
    /**
     * <p>
     * The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes are
     * located in different Availability Zones.
     * </p>
     */
    private String preferredAvailabilityZone;
    /**
     * <p>
     * The date and time when the cache cluster was created.
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

    private PendingModifiedValues pendingModifiedValues;

    private NotificationConfiguration notificationConfiguration;
    /**
     * <p>
     * A list of cache security group elements, composed of name and status sub-elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheSecurityGroupMembership> cacheSecurityGroups;

    private CacheParameterGroupStatus cacheParameterGroup;
    /**
     * <p>
     * The name of the cache subnet group associated with the cache cluster.
     * </p>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * A list of cache nodes that are members of the cache cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheNode> cacheNodes;
    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * A list of VPC Security Groups associated with the cache cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupMembership> securityGroups;
    /**
     * <p>
     * The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is not
     * associated with any replication group.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     */
    private String snapshotWindow;

    /**
     * <p>
     * The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a cache
     * cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a cache
     *        cluster.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a cache
     * cluster.
     * </p>
     * 
     * @return The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a
     *         cache cluster.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a cache
     * cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied identifier of the cache cluster. This identifier is a unique key that identifies a cache
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * @param configurationEndpoint
     */

    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }

    /**
     * @return
     */

    public Endpoint getConfigurationEndpoint() {
        return this.configurationEndpoint;
    }

    /**
     * @param configurationEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withConfigurationEndpoint(Endpoint configurationEndpoint) {
        setConfigurationEndpoint(configurationEndpoint);
        return this;
    }

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache client library.
     * </p>
     * 
     * @param clientDownloadLandingPage
     *        The URL of the web page where you can download the latest ElastiCache client library.
     */

    public void setClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
    }

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache client library.
     * </p>
     * 
     * @return The URL of the web page where you can download the latest ElastiCache client library.
     */

    public String getClientDownloadLandingPage() {
        return this.clientDownloadLandingPage;
    }

    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache client library.
     * </p>
     * 
     * @param clientDownloadLandingPage
     *        The URL of the web page where you can download the latest ElastiCache client library.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withClientDownloadLandingPage(String clientDownloadLandingPage) {
        setClientDownloadLandingPage(clientDownloadLandingPage);
        return this;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the cache cluster.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The name of the compute and memory capacity node type for the cache cluster.</p>
     *        <p>
     *        Valid node types are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *        <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>,
     *        <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized: <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
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
     *        Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances.
     *        Backup/restore is supported on Redis (cluster mode enabled) T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see <a
     *        href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *        either <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the cache cluster.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @return The name of the compute and memory capacity node type for the cache cluster.</p>
     *         <p>
     *         Valid node types are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *         <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>,
     *         <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>,
     *         <code>cache.m4.10xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>,
     *         <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized: <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
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
     *         Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances.
     *         Backup/restore is supported on Redis (cluster mode enabled) T2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a complete listing of node types and specifications, see <a
     *         href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *         either <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The name of the compute and memory capacity node type for the cache cluster.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The name of the compute and memory capacity node type for the cache cluster.</p>
     *        <p>
     *        Valid node types are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *        <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>,
     *        <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized: <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
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
     *        Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances.
     *        Backup/restore is supported on Redis (cluster mode enabled) T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see <a
     *        href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *        either <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache cluster.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache
     *        cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache cluster.
     * </p>
     * 
     * @return The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache
     *         cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache cluster.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cache
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cache cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the cache engine that is used in this cache cluster.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cache cluster.
     * </p>
     * 
     * @return The version of the cache engine that is used in this cache cluster.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cache cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the cache engine that is used in this cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The current state of this cache cluster, one of the following values: <code>available</code>,
     * <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     * <code>snapshotting</code>.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The current state of this cache cluster, one of the following values: <code>available</code>,
     *        <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     *        <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     *        <code>snapshotting</code>.
     */

    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }

    /**
     * <p>
     * The current state of this cache cluster, one of the following values: <code>available</code>,
     * <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     * <code>snapshotting</code>.
     * </p>
     * 
     * @return The current state of this cache cluster, one of the following values: <code>available</code>,
     *         <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     *         <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     *         <code>snapshotting</code>.
     */

    public String getCacheClusterStatus() {
        return this.cacheClusterStatus;
    }

    /**
     * <p>
     * The current state of this cache cluster, one of the following values: <code>available</code>,
     * <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     * <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     * <code>snapshotting</code>.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The current state of this cache cluster, one of the following values: <code>available</code>,
     *        <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     *        <code>modifying</code>, <code>rebooting cache cluster nodes</code>, <code>restore-failed</code>, or
     *        <code>snapshotting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheClusterStatus(String cacheClusterStatus) {
        setCacheClusterStatus(cacheClusterStatus);
        return this;
    }

    /**
     * <p>
     * The number of cache nodes in the cache cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The number of cache nodes in the cache cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     */

    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the cache cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @return The number of cache nodes in the cache cluster.</p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20.
     */

    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the cache cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The number of cache nodes in the cache cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withNumCacheNodes(Integer numCacheNodes) {
        setNumCacheNodes(numCacheNodes);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes are
     * located in different Availability Zones.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes
     *        are located in different Availability Zones.
     */

    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes are
     * located in different Availability Zones.
     * </p>
     * 
     * @return The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes
     *         are located in different Availability Zones.
     */

    public String getPreferredAvailabilityZone() {
        return this.preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes are
     * located in different Availability Zones.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the cache cluster is located or "Multiple" if the cache nodes
     *        are located in different Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        setPreferredAvailabilityZone(preferredAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time when the cache cluster was created.
     * </p>
     * 
     * @param cacheClusterCreateTime
     *        The date and time when the cache cluster was created.
     */

    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache cluster was created.
     * </p>
     * 
     * @return The date and time when the cache cluster was created.
     */

    public java.util.Date getCacheClusterCreateTime() {
        return this.cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache cluster was created.
     * </p>
     * 
     * @param cacheClusterCreateTime
     *        The date and time when the cache cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
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

    public CacheCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * @param pendingModifiedValues
     */

    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * @return
     */

    public PendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * @param pendingModifiedValues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * @param notificationConfiguration
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * @return
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * @param notificationConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status sub-elements.
     * </p>
     * 
     * @return A list of cache security group elements, composed of name and status sub-elements.
     */

    public java.util.List<CacheSecurityGroupMembership> getCacheSecurityGroups() {
        if (cacheSecurityGroups == null) {
            cacheSecurityGroups = new com.amazonaws.internal.SdkInternalList<CacheSecurityGroupMembership>();
        }
        return cacheSecurityGroups;
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status sub-elements.
     * </p>
     * 
     * @param cacheSecurityGroups
     *        A list of cache security group elements, composed of name and status sub-elements.
     */

    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
            return;
        }

        this.cacheSecurityGroups = new com.amazonaws.internal.SdkInternalList<CacheSecurityGroupMembership>(cacheSecurityGroups);
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status sub-elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheSecurityGroups(java.util.Collection)} or {@link #withCacheSecurityGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheSecurityGroups
     *        A list of cache security group elements, composed of name and status sub-elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheSecurityGroups(CacheSecurityGroupMembership... cacheSecurityGroups) {
        if (this.cacheSecurityGroups == null) {
            setCacheSecurityGroups(new com.amazonaws.internal.SdkInternalList<CacheSecurityGroupMembership>(cacheSecurityGroups.length));
        }
        for (CacheSecurityGroupMembership ele : cacheSecurityGroups) {
            this.cacheSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security group elements, composed of name and status sub-elements.
     * </p>
     * 
     * @param cacheSecurityGroups
     *        A list of cache security group elements, composed of name and status sub-elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        setCacheSecurityGroups(cacheSecurityGroups);
        return this;
    }

    /**
     * @param cacheParameterGroup
     */

    public void setCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }

    /**
     * @return
     */

    public CacheParameterGroupStatus getCacheParameterGroup() {
        return this.cacheParameterGroup;
    }

    /**
     * @param cacheParameterGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        setCacheParameterGroup(cacheParameterGroup);
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cache cluster.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group associated with the cache cluster.
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cache cluster.
     * </p>
     * 
     * @return The name of the cache subnet group associated with the cache cluster.
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cache cluster.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group associated with the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cache cluster.
     * </p>
     * 
     * @return A list of cache nodes that are members of the cache cluster.
     */

    public java.util.List<CacheNode> getCacheNodes() {
        if (cacheNodes == null) {
            cacheNodes = new com.amazonaws.internal.SdkInternalList<CacheNode>();
        }
        return cacheNodes;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cache cluster.
     * </p>
     * 
     * @param cacheNodes
     *        A list of cache nodes that are members of the cache cluster.
     */

    public void setCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        if (cacheNodes == null) {
            this.cacheNodes = null;
            return;
        }

        this.cacheNodes = new com.amazonaws.internal.SdkInternalList<CacheNode>(cacheNodes);
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cache cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodes(java.util.Collection)} or {@link #withCacheNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cacheNodes
     *        A list of cache nodes that are members of the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheNodes(CacheNode... cacheNodes) {
        if (this.cacheNodes == null) {
            setCacheNodes(new com.amazonaws.internal.SdkInternalList<CacheNode>(cacheNodes.length));
        }
        for (CacheNode ele : cacheNodes) {
            this.cacheNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cache cluster.
     * </p>
     * 
     * @param cacheNodes
     *        A list of cache nodes that are members of the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        setCacheNodes(cacheNodes);
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

    public CacheCluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
     * A list of VPC Security Groups associated with the cache cluster.
     * </p>
     * 
     * @return A list of VPC Security Groups associated with the cache cluster.
     */

    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<SecurityGroupMembership>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cache cluster.
     * </p>
     * 
     * @param securityGroups
     *        A list of VPC Security Groups associated with the cache cluster.
     */

    public void setSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<SecurityGroupMembership>(securityGroups);
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cache cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of VPC Security Groups associated with the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withSecurityGroups(SecurityGroupMembership... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<SecurityGroupMembership>(securityGroups.length));
        }
        for (SecurityGroupMembership ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cache cluster.
     * </p>
     * 
     * @param securityGroups
     *        A list of VPC Security Groups associated with the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is not
     * associated with any replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is
     *        not associated with any replication group.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is not
     * associated with any replication group.
     * </p>
     * 
     * @return The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is
     *         not associated with any replication group.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is not
     * associated with any replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The replication group to which this cache cluster belongs. If this field is empty, the cache cluster is
     *        not associated with any replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
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
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     *        For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *        retained for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
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
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @return The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     *         For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *         retained for 5 days before being deleted.</p> <important>
     *         <p>
     *         If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
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
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     *        For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *        retained for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache
     *        cluster.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * 
     * @return The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache
     *         cluster.</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cache
     *        cluster.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withSnapshotWindow(String snapshotWindow) {
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getConfigurationEndpoint() != null)
            sb.append("ConfigurationEndpoint: " + getConfigurationEndpoint() + ",");
        if (getClientDownloadLandingPage() != null)
            sb.append("ClientDownloadLandingPage: " + getClientDownloadLandingPage() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheClusterStatus() != null)
            sb.append("CacheClusterStatus: " + getCacheClusterStatus() + ",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCacheClusterCreateTime() != null)
            sb.append("CacheClusterCreateTime: " + getCacheClusterCreateTime() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration() + ",");
        if (getCacheSecurityGroups() != null)
            sb.append("CacheSecurityGroups: " + getCacheSecurityGroups() + ",");
        if (getCacheParameterGroup() != null)
            sb.append("CacheParameterGroup: " + getCacheParameterGroup() + ",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheNodes() != null)
            sb.append("CacheNodes: " + getCacheNodes() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
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

        if (obj instanceof CacheCluster == false)
            return false;
        CacheCluster other = (CacheCluster) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null)
            return false;
        if (other.getConfigurationEndpoint() != null && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false)
            return false;
        if (other.getClientDownloadLandingPage() == null ^ this.getClientDownloadLandingPage() == null)
            return false;
        if (other.getClientDownloadLandingPage() != null && other.getClientDownloadLandingPage().equals(this.getClientDownloadLandingPage()) == false)
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
        if (other.getCacheClusterStatus() == null ^ this.getCacheClusterStatus() == null)
            return false;
        if (other.getCacheClusterStatus() != null && other.getCacheClusterStatus().equals(this.getCacheClusterStatus()) == false)
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
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        if (other.getCacheSecurityGroups() == null ^ this.getCacheSecurityGroups() == null)
            return false;
        if (other.getCacheSecurityGroups() != null && other.getCacheSecurityGroups().equals(this.getCacheSecurityGroups()) == false)
            return false;
        if (other.getCacheParameterGroup() == null ^ this.getCacheParameterGroup() == null)
            return false;
        if (other.getCacheParameterGroup() != null && other.getCacheParameterGroup().equals(this.getCacheParameterGroup()) == false)
            return false;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheNodes() == null ^ this.getCacheNodes() == null)
            return false;
        if (other.getCacheNodes() != null && other.getCacheNodes().equals(this.getCacheNodes()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
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

        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationEndpoint() == null) ? 0 : getConfigurationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClientDownloadLandingPage() == null) ? 0 : getClientDownloadLandingPage().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterStatus() == null) ? 0 : getCacheClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterCreateTime() == null) ? 0 : getCacheClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCacheSecurityGroups() == null) ? 0 : getCacheSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroup() == null) ? 0 : getCacheParameterGroup().hashCode());
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheNodes() == null) ? 0 : getCacheNodes().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        return hashCode;
    }

    @Override
    public CacheCluster clone() {
        try {
            return (CacheCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
