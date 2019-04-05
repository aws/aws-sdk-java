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
 * Contains all of the attributes of a specific cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CacheCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheCluster implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by
     * an application to connect to any node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     */
    private Endpoint configurationEndpoint;
    /**
     * <p>
     * The URL of the web page where you can download the latest ElastiCache client library.
     * </p>
     */
    private String clientDownloadLandingPage;
    /**
     * <p>
     * The name of the compute and memory capacity node type for the cluster.
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
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The current state of this cluster, one of the following values: <code>available</code>, <code>creating</code>,
     * <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>, <code>modifying</code>,
     * <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     */
    private String cacheClusterStatus;
    /**
     * <p>
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     */
    private Integer numCacheNodes;
    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in
     * different Availability Zones.
     * </p>
     */
    private String preferredAvailabilityZone;
    /**
     * <p>
     * The date and time when the cluster was created.
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
    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;
    /**
     * <p>
     * A list of cache security group elements, composed of name and status sub-elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheSecurityGroupMembership> cacheSecurityGroups;
    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     */
    private CacheParameterGroupStatus cacheParameterGroup;
    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
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
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupMembership> securityGroups;
    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with
     * any replication group.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
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
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean authTokenEnabled;
    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean transitEncryptionEnabled;
    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean atRestEncryptionEnabled;

    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     * 
     * @return The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by
     * an application to connect to any node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     * 
     * @param configurationEndpoint
     *        Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be
     *        used by an application to connect to any node in the cluster. The configuration endpoint will always have
     *        <code>.cfg</code> in it.</p>
     *        <p>
     *        Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     */

    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by
     * an application to connect to any node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     * 
     * @return Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be
     *         used by an application to connect to any node in the cluster. The configuration endpoint will always have
     *         <code>.cfg</code> in it.</p>
     *         <p>
     *         Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     */

    public Endpoint getConfigurationEndpoint() {
        return this.configurationEndpoint;
    }

    /**
     * <p>
     * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by
     * an application to connect to any node in the cluster. The configuration endpoint will always have
     * <code>.cfg</code> in it.
     * </p>
     * <p>
     * Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
     * </p>
     * 
     * @param configurationEndpoint
     *        Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be
     *        used by an application to connect to any node in the cluster. The configuration endpoint will always have
     *        <code>.cfg</code> in it.</p>
     *        <p>
     *        Example: <code>mem-3.9dvc4r<u>.cfg</u>.usw2.cache.amazonaws.com:11211</code>
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
     * The name of the compute and memory capacity node type for the cluster.
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
     *        The name of the compute and memory capacity node type for the cluster.</p>
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
     * The name of the compute and memory capacity node type for the cluster.
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
     * @return The name of the compute and memory capacity node type for the cluster.</p>
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
     * The name of the compute and memory capacity node type for the cluster.
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
     *        The name of the compute and memory capacity node type for the cluster.</p>
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

    public CacheCluster withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     * </p>
     * 
     * @return The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine (<code>memcached</code> or <code>redis</code>) to be used for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the cache engine that is used in this cluster.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     * 
     * @return The version of the cache engine that is used in this cluster.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that is used in this cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the cache engine that is used in this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The current state of this cluster, one of the following values: <code>available</code>, <code>creating</code>,
     * <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>, <code>modifying</code>,
     * <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The current state of this cluster, one of the following values: <code>available</code>,
     *        <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     *        <code>modifying</code>, <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or
     *        <code>snapshotting</code>.
     */

    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }

    /**
     * <p>
     * The current state of this cluster, one of the following values: <code>available</code>, <code>creating</code>,
     * <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>, <code>modifying</code>,
     * <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     * 
     * @return The current state of this cluster, one of the following values: <code>available</code>,
     *         <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     *         <code>modifying</code>, <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or
     *         <code>snapshotting</code>.
     */

    public String getCacheClusterStatus() {
        return this.cacheClusterStatus;
    }

    /**
     * <p>
     * The current state of this cluster, one of the following values: <code>available</code>, <code>creating</code>,
     * <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>, <code>modifying</code>,
     * <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or <code>snapshotting</code>.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The current state of this cluster, one of the following values: <code>available</code>,
     *        <code>creating</code>, <code>deleted</code>, <code>deleting</code>, <code>incompatible-network</code>,
     *        <code>modifying</code>, <code>rebooting cluster nodes</code>, <code>restore-failed</code>, or
     *        <code>snapshotting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheClusterStatus(String cacheClusterStatus) {
        setCacheClusterStatus(cacheClusterStatus);
        return this;
    }

    /**
     * <p>
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The number of cache nodes in the cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     */

    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @return The number of cache nodes in the cluster.</p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20.
     */

    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }

    /**
     * <p>
     * The number of cache nodes in the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The number of cache nodes in the cluster.</p>
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
     * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in
     * different Availability Zones.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are
     *        located in different Availability Zones.
     */

    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in
     * different Availability Zones.
     * </p>
     * 
     * @return The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are
     *         located in different Availability Zones.
     */

    public String getPreferredAvailabilityZone() {
        return this.preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in
     * different Availability Zones.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are
     *        located in different Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        setPreferredAvailabilityZone(preferredAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * 
     * @param cacheClusterCreateTime
     *        The date and time when the cluster was created.
     */

    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * 
     * @return The date and time when the cluster was created.
     */

    public java.util.Date getCacheClusterCreateTime() {
        return this.cacheClusterCreateTime;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * 
     * @param cacheClusterCreateTime
     *        The date and time when the cluster was created.
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
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     * 
     * @param notificationConfiguration
     *        Describes a notification topic and its status. Notification topics are used for publishing ElastiCache
     *        events to subscribers using Amazon Simple Notification Service (SNS).
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     * 
     * @return Describes a notification topic and its status. Notification topics are used for publishing ElastiCache
     *         events to subscribers using Amazon Simple Notification Service (SNS).
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     * 
     * @param notificationConfiguration
     *        Describes a notification topic and its status. Notification topics are used for publishing ElastiCache
     *        events to subscribers using Amazon Simple Notification Service (SNS).
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
     * <p>
     * Status of the cache parameter group.
     * </p>
     * 
     * @param cacheParameterGroup
     *        Status of the cache parameter group.
     */

    public void setCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }

    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     * 
     * @return Status of the cache parameter group.
     */

    public CacheParameterGroupStatus getCacheParameterGroup() {
        return this.cacheParameterGroup;
    }

    /**
     * <p>
     * Status of the cache parameter group.
     * </p>
     * 
     * @param cacheParameterGroup
     *        Status of the cache parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        setCacheParameterGroup(cacheParameterGroup);
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group associated with the cluster.
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     * 
     * @return The name of the cache subnet group associated with the cluster.
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group associated with the cluster.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     * 
     * @return A list of cache nodes that are members of the cluster.
     */

    public java.util.List<CacheNode> getCacheNodes() {
        if (cacheNodes == null) {
            cacheNodes = new com.amazonaws.internal.SdkInternalList<CacheNode>();
        }
        return cacheNodes;
    }

    /**
     * <p>
     * A list of cache nodes that are members of the cluster.
     * </p>
     * 
     * @param cacheNodes
     *        A list of cache nodes that are members of the cluster.
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
     * A list of cache nodes that are members of the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodes(java.util.Collection)} or {@link #withCacheNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cacheNodes
     *        A list of cache nodes that are members of the cluster.
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
     * A list of cache nodes that are members of the cluster.
     * </p>
     * 
     * @param cacheNodes
     *        A list of cache nodes that are members of the cluster.
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
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     * 
     * @return A list of VPC Security Groups associated with the cluster.
     */

    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<SecurityGroupMembership>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     * 
     * @param securityGroups
     *        A list of VPC Security Groups associated with the cluster.
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
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of VPC Security Groups associated with the cluster.
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
     * A list of VPC Security Groups associated with the cluster.
     * </p>
     * 
     * @param securityGroups
     *        A list of VPC Security Groups associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with
     * any replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The replication group to which this cluster belongs. If this field is empty, the cluster is not associated
     *        with any replication group.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with
     * any replication group.
     * </p>
     * 
     * @return The replication group to which this cluster belongs. If this field is empty, the cluster is not
     *         associated with any replication group.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with
     * any replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The replication group to which this cluster belongs. If this field is empty, the cluster is not associated
     *        with any replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For
     *        example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained
     *        for 5 days before being deleted.</p> <important>
     *        <p>
     *        If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     *        </p>
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @return The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For
     *         example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained
     *         for 5 days before being deleted.</p> <important>
     *         <p>
     *         If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     *         </p>
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example,
     * if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5 days
     * before being deleted.
     * </p>
     * <important>
     * <p>
     * If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * </important>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For
     *        example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained
     *        for 5 days before being deleted.</p> <important>
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
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * 
     * @return The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
     *         cluster.</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param authTokenEnabled
     *        A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAuthTokenEnabled() {
        return this.authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param authTokenEnabled
     *        A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withAuthTokenEnabled(Boolean authTokenEnabled) {
        setAuthTokenEnabled(authTokenEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAuthTokenEnabled() {
        return this.authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *        enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code> or <code>4.x</code>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *         enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code> or <code>4.x</code>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *        enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code> or <code>4.x</code>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        setTransitEncryptionEnabled(transitEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To enable
     * in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to <code>true</code> when
     * you create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables in-transit encryption when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>TransitEncryptionEnabled</code> after the cluster is created. To
     *         enable in-transit encryption on a cluster you must set <code>TransitEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code> or <code>4.x</code>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *        enable at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code> or <code>4.x</code>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *         enable at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code> or <code>4.x</code>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *        enable at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *        <code>true</code> when you create a cluster.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code> or <code>4.x</code>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheCluster withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        setAtRestEncryptionEnabled(atRestEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at-rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To enable
     * at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to <code>true</code> when you
     * create a cluster.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code> or <code>4.x</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables encryption at-rest when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the cluster is created. To
     *         enable at-rest encryption on a cluster you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create a cluster.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code> or <code>4.x</code>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getConfigurationEndpoint() != null)
            sb.append("ConfigurationEndpoint: ").append(getConfigurationEndpoint()).append(",");
        if (getClientDownloadLandingPage() != null)
            sb.append("ClientDownloadLandingPage: ").append(getClientDownloadLandingPage()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCacheClusterStatus() != null)
            sb.append("CacheClusterStatus: ").append(getCacheClusterStatus()).append(",");
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: ").append(getNumCacheNodes()).append(",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: ").append(getPreferredAvailabilityZone()).append(",");
        if (getCacheClusterCreateTime() != null)
            sb.append("CacheClusterCreateTime: ").append(getCacheClusterCreateTime()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration()).append(",");
        if (getCacheSecurityGroups() != null)
            sb.append("CacheSecurityGroups: ").append(getCacheSecurityGroups()).append(",");
        if (getCacheParameterGroup() != null)
            sb.append("CacheParameterGroup: ").append(getCacheParameterGroup()).append(",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: ").append(getCacheSubnetGroupName()).append(",");
        if (getCacheNodes() != null)
            sb.append("CacheNodes: ").append(getCacheNodes()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getAuthTokenEnabled() != null)
            sb.append("AuthTokenEnabled: ").append(getAuthTokenEnabled()).append(",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: ").append(getTransitEncryptionEnabled()).append(",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: ").append(getAtRestEncryptionEnabled());
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
        if (other.getAuthTokenEnabled() == null ^ this.getAuthTokenEnabled() == null)
            return false;
        if (other.getAuthTokenEnabled() != null && other.getAuthTokenEnabled().equals(this.getAuthTokenEnabled()) == false)
            return false;
        if (other.getTransitEncryptionEnabled() == null ^ this.getTransitEncryptionEnabled() == null)
            return false;
        if (other.getTransitEncryptionEnabled() != null && other.getTransitEncryptionEnabled().equals(this.getTransitEncryptionEnabled()) == false)
            return false;
        if (other.getAtRestEncryptionEnabled() == null ^ this.getAtRestEncryptionEnabled() == null)
            return false;
        if (other.getAtRestEncryptionEnabled() != null && other.getAtRestEncryptionEnabled().equals(this.getAtRestEncryptionEnabled()) == false)
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
        hashCode = prime * hashCode + ((getAuthTokenEnabled() == null) ? 0 : getAuthTokenEnabled().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled().hashCode());
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
