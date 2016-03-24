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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createCacheCluster(CreateCacheClusterRequest) CreateCacheCluster operation}.
 * <p>
 * The <i>CreateCacheCluster</i> action creates a cache cluster. All
 * nodes in the cache cluster run the same protocol-compliant cache
 * engine software, either Memcached or Redis.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createCacheCluster(CreateCacheClusterRequest)
 */
public class CreateCacheClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The node group identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>The first character must
     * be a letter.</li> <li>A name cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     */
    private String cacheClusterId;

    /**
     * The ID of the replication group to which this cache cluster should
     * belong. If this parameter is specified, the cache cluster will be
     * added to the specified replication group as a read replica; otherwise,
     * the cache cluster will be a standalone primary that is not part of any
     * replication group. <p>If the specified replication group is Multi-AZ
     * enabled and the availability zone is not specified, the cache cluster
     * will be created in availability zones that provide the best spread of
     * read replicas across availability zones. <p><b>Note:</b> This
     * parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     */
    private String replicationGroupId;

    /**
     * Specifies whether the nodes in this Memcached node group are created
     * in a single Availability Zone or created across multiple Availability
     * Zones in the cluster's region. <p>This parameter is only supported for
     * Memcached cache clusters. <p>If the <code>AZMode</code> and
     * <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     * assumes <code>single-az</code> mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     */
    private String aZMode;

    /**
     * The EC2 Availability Zone in which the cache cluster will be created.
     * <p>All nodes belonging to this Memcached cache cluster are placed in
     * the preferred Availability Zone. If you want to create your nodes
     * across multiple Availability Zones, use
     * <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     * Availability Zone.
     */
    private String preferredAvailabilityZone;

    /**
     * A list of the Availability Zones in which cache nodes will be created.
     * The order of the zones in the list is not important. <p>This option is
     * only supported on Memcached. <note> <p>If you are creating your cache
     * cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the
     * selected subnet group. <p>The number of Availability Zones listed must
     * equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     * all the nodes in the same Availability Zone, use
     * <code>PreferredAvailabilityZone</code> instead, or repeat the
     * Availability Zone multiple times in the list. <p>Default: System
     * chosen Availability Zones. <p>Example: One Memcached node in each of
     * three different Availability Zones:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     * <p>Example: All three Memcached nodes in one Availability Zone:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> preferredAvailabilityZones;

    /**
     * The initial number of cache nodes that the cache cluster will have.
     * <p>For clusters running Redis, this value must be 1. For clusters
     * running Memcached, this value must be between 1 and 20. <p>If you need
     * more than 20 nodes for your Memcached cluster, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     */
    private Integer numCacheNodes;

    /**
     * The compute and memory capacity of the nodes in the node group.
     * <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     * <li>Current generation: <code>cache.t2.micro</code>,
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
     * The name of the cache engine to be used for this cache cluster.
     * <p>Valid values for this parameter are: <p><code>memcached</code> |
     * <code>redis</code>
     */
    private String engine;

    /**
     * The version number of the cache engine to be used for this cache
     * cluster. To view the supported cache engine versions, use the
     * <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     * can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     */
    private String engineVersion;

    /**
     * The name of the parameter group to associate with this cache cluster.
     * If this argument is omitted, the default parameter group for the
     * specified engine is used.
     */
    private String cacheParameterGroupName;

    /**
     * The name of the subnet group to be used for the cache cluster. <p>Use
     * this parameter only when you are creating a cache cluster in an Amazon
     * Virtual Private Cloud (VPC).
     */
    private String cacheSubnetGroupName;

    /**
     * A list of security group names to associate with this cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNames;

    /**
     * One or more VPC security groups associated with the cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster in an
     * Amazon Virtual Private Cloud (VPC).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon
     * S3. The snapshot file will be used to populate the node group. The
     * Amazon S3 object name in the ARN cannot contain any commas.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     * Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotArns;

    /**
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created. <p><b>Note:</b> This parameter is
     * only valid if the <code>Engine</code> parameter is <code>redis</code>.
     */
    private String snapshotName;

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
     * The port number on which each of the cache nodes will accept
     * connections.
     */
    private Integer port;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note>The
     * Amazon SNS topic owner must be the same as the cache cluster
     * owner.</note>
     */
    private String notificationTopicArn;

    /**
     * This parameter is currently disabled.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * The number of days for which ElastiCache will retain automatic
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     * taken today will be retained for 5 days before being deleted.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     * (i.e., automatic backups are disabled for this cache cluster).
     */
    private Integer snapshotRetentionLimit;

    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your node group. <p>Example:
     * <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     * ElastiCache will automatically choose an appropriate time range.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>.
     */
    private String snapshotWindow;

    /**
     * Default constructor for a new CreateCacheClusterRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCacheClusterRequest() {}
    
    /**
     * Constructs a new CreateCacheClusterRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheClusterId The node group identifier. This parameter is
     * stored as a lowercase string. <p>Constraints: <ul> <li>A name must
     * contain from 1 to 20 alphanumeric characters or hyphens.</li> <li>The
     * first character must be a letter.</li> <li>A name cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     * @param numCacheNodes The initial number of cache nodes that the cache
     * cluster will have. <p>For clusters running Redis, this value must be
     * 1. For clusters running Memcached, this value must be between 1 and
     * 20. <p>If you need more than 20 nodes for your Memcached cluster,
     * please fill out the ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     * @param cacheNodeType The compute and memory capacity of the nodes in
     * the node group. <p>Valid node types are as follows: <ul> <li>General
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
     * @param engine The name of the cache engine to be used for this cache
     * cluster. <p>Valid values for this parameter are:
     * <p><code>memcached</code> | <code>redis</code>
     * @param cacheSecurityGroupNames A list of security group names to
     * associate with this cache cluster. <p>Use this parameter only when you
     * are creating a cache cluster outside of an Amazon Virtual Private
     * Cloud (VPC).
     */
    public CreateCacheClusterRequest(String cacheClusterId, Integer numCacheNodes, String cacheNodeType, String engine, java.util.List<String> cacheSecurityGroupNames) {
        setCacheClusterId(cacheClusterId);
        setNumCacheNodes(numCacheNodes);
        setCacheNodeType(cacheNodeType);
        setEngine(engine);
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
    }

    /**
     * The node group identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>The first character must
     * be a letter.</li> <li>A name cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @return The node group identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>The first character must
     *         be a letter.</li> <li>A name cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The node group identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>The first character must
     * be a letter.</li> <li>A name cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @param cacheClusterId The node group identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>The first character must
     *         be a letter.</li> <li>A name cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The node group identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>The first character must
     * be a letter.</li> <li>A name cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The node group identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>A name must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>The first character must
     *         be a letter.</li> <li>A name cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * The ID of the replication group to which this cache cluster should
     * belong. If this parameter is specified, the cache cluster will be
     * added to the specified replication group as a read replica; otherwise,
     * the cache cluster will be a standalone primary that is not part of any
     * replication group. <p>If the specified replication group is Multi-AZ
     * enabled and the availability zone is not specified, the cache cluster
     * will be created in availability zones that provide the best spread of
     * read replicas across availability zones. <p><b>Note:</b> This
     * parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     *
     * @return The ID of the replication group to which this cache cluster should
     *         belong. If this parameter is specified, the cache cluster will be
     *         added to the specified replication group as a read replica; otherwise,
     *         the cache cluster will be a standalone primary that is not part of any
     *         replication group. <p>If the specified replication group is Multi-AZ
     *         enabled and the availability zone is not specified, the cache cluster
     *         will be created in availability zones that provide the best spread of
     *         read replicas across availability zones. <p><b>Note:</b> This
     *         parameter is only valid if the <code>Engine</code> parameter is
     *         <code>redis</code>.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The ID of the replication group to which this cache cluster should
     * belong. If this parameter is specified, the cache cluster will be
     * added to the specified replication group as a read replica; otherwise,
     * the cache cluster will be a standalone primary that is not part of any
     * replication group. <p>If the specified replication group is Multi-AZ
     * enabled and the availability zone is not specified, the cache cluster
     * will be created in availability zones that provide the best spread of
     * read replicas across availability zones. <p><b>Note:</b> This
     * parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     *
     * @param replicationGroupId The ID of the replication group to which this cache cluster should
     *         belong. If this parameter is specified, the cache cluster will be
     *         added to the specified replication group as a read replica; otherwise,
     *         the cache cluster will be a standalone primary that is not part of any
     *         replication group. <p>If the specified replication group is Multi-AZ
     *         enabled and the availability zone is not specified, the cache cluster
     *         will be created in availability zones that provide the best spread of
     *         read replicas across availability zones. <p><b>Note:</b> This
     *         parameter is only valid if the <code>Engine</code> parameter is
     *         <code>redis</code>.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The ID of the replication group to which this cache cluster should
     * belong. If this parameter is specified, the cache cluster will be
     * added to the specified replication group as a read replica; otherwise,
     * the cache cluster will be a standalone primary that is not part of any
     * replication group. <p>If the specified replication group is Multi-AZ
     * enabled and the availability zone is not specified, the cache cluster
     * will be created in availability zones that provide the best spread of
     * read replicas across availability zones. <p><b>Note:</b> This
     * parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The ID of the replication group to which this cache cluster should
     *         belong. If this parameter is specified, the cache cluster will be
     *         added to the specified replication group as a read replica; otherwise,
     *         the cache cluster will be a standalone primary that is not part of any
     *         replication group. <p>If the specified replication group is Multi-AZ
     *         enabled and the availability zone is not specified, the cache cluster
     *         will be created in availability zones that provide the best spread of
     *         read replicas across availability zones. <p><b>Note:</b> This
     *         parameter is only valid if the <code>Engine</code> parameter is
     *         <code>redis</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * Specifies whether the nodes in this Memcached node group are created
     * in a single Availability Zone or created across multiple Availability
     * Zones in the cluster's region. <p>This parameter is only supported for
     * Memcached cache clusters. <p>If the <code>AZMode</code> and
     * <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     * assumes <code>single-az</code> mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @return Specifies whether the nodes in this Memcached node group are created
     *         in a single Availability Zone or created across multiple Availability
     *         Zones in the cluster's region. <p>This parameter is only supported for
     *         Memcached cache clusters. <p>If the <code>AZMode</code> and
     *         <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *         assumes <code>single-az</code> mode.
     *
     * @see AZMode
     */
    public String getAZMode() {
        return aZMode;
    }
    
    /**
     * Specifies whether the nodes in this Memcached node group are created
     * in a single Availability Zone or created across multiple Availability
     * Zones in the cluster's region. <p>This parameter is only supported for
     * Memcached cache clusters. <p>If the <code>AZMode</code> and
     * <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     * assumes <code>single-az</code> mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the nodes in this Memcached node group are created
     *         in a single Availability Zone or created across multiple Availability
     *         Zones in the cluster's region. <p>This parameter is only supported for
     *         Memcached cache clusters. <p>If the <code>AZMode</code> and
     *         <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *         assumes <code>single-az</code> mode.
     *
     * @see AZMode
     */
    public void setAZMode(String aZMode) {
        this.aZMode = aZMode;
    }
    
    /**
     * Specifies whether the nodes in this Memcached node group are created
     * in a single Availability Zone or created across multiple Availability
     * Zones in the cluster's region. <p>This parameter is only supported for
     * Memcached cache clusters. <p>If the <code>AZMode</code> and
     * <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     * assumes <code>single-az</code> mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the nodes in this Memcached node group are created
     *         in a single Availability Zone or created across multiple Availability
     *         Zones in the cluster's region. <p>This parameter is only supported for
     *         Memcached cache clusters. <p>If the <code>AZMode</code> and
     *         <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *         assumes <code>single-az</code> mode.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AZMode
     */
    public CreateCacheClusterRequest withAZMode(String aZMode) {
        this.aZMode = aZMode;
        return this;
    }

    /**
     * Specifies whether the nodes in this Memcached node group are created
     * in a single Availability Zone or created across multiple Availability
     * Zones in the cluster's region. <p>This parameter is only supported for
     * Memcached cache clusters. <p>If the <code>AZMode</code> and
     * <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     * assumes <code>single-az</code> mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the nodes in this Memcached node group are created
     *         in a single Availability Zone or created across multiple Availability
     *         Zones in the cluster's region. <p>This parameter is only supported for
     *         Memcached cache clusters. <p>If the <code>AZMode</code> and
     *         <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *         assumes <code>single-az</code> mode.
     *
     * @see AZMode
     */
    public void setAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
    }
    
    /**
     * Specifies whether the nodes in this Memcached node group are created
     * in a single Availability Zone or created across multiple Availability
     * Zones in the cluster's region. <p>This parameter is only supported for
     * Memcached cache clusters. <p>If the <code>AZMode</code> and
     * <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     * assumes <code>single-az</code> mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the nodes in this Memcached node group are created
     *         in a single Availability Zone or created across multiple Availability
     *         Zones in the cluster's region. <p>This parameter is only supported for
     *         Memcached cache clusters. <p>If the <code>AZMode</code> and
     *         <code>PreferredAvailabilityZones</code> are not specified, ElastiCache
     *         assumes <code>single-az</code> mode.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AZMode
     */
    public CreateCacheClusterRequest withAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
        return this;
    }

    /**
     * The EC2 Availability Zone in which the cache cluster will be created.
     * <p>All nodes belonging to this Memcached cache cluster are placed in
     * the preferred Availability Zone. If you want to create your nodes
     * across multiple Availability Zones, use
     * <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     * Availability Zone.
     *
     * @return The EC2 Availability Zone in which the cache cluster will be created.
     *         <p>All nodes belonging to this Memcached cache cluster are placed in
     *         the preferred Availability Zone. If you want to create your nodes
     *         across multiple Availability Zones, use
     *         <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     *         Availability Zone.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * The EC2 Availability Zone in which the cache cluster will be created.
     * <p>All nodes belonging to this Memcached cache cluster are placed in
     * the preferred Availability Zone. If you want to create your nodes
     * across multiple Availability Zones, use
     * <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     * Availability Zone.
     *
     * @param preferredAvailabilityZone The EC2 Availability Zone in which the cache cluster will be created.
     *         <p>All nodes belonging to this Memcached cache cluster are placed in
     *         the preferred Availability Zone. If you want to create your nodes
     *         across multiple Availability Zones, use
     *         <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     *         Availability Zone.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * The EC2 Availability Zone in which the cache cluster will be created.
     * <p>All nodes belonging to this Memcached cache cluster are placed in
     * the preferred Availability Zone. If you want to create your nodes
     * across multiple Availability Zones, use
     * <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     * Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone The EC2 Availability Zone in which the cache cluster will be created.
     *         <p>All nodes belonging to this Memcached cache cluster are placed in
     *         the preferred Availability Zone. If you want to create your nodes
     *         across multiple Availability Zones, use
     *         <code>PreferredAvailabilityZones</code>. <p>Default: System chosen
     *         Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * A list of the Availability Zones in which cache nodes will be created.
     * The order of the zones in the list is not important. <p>This option is
     * only supported on Memcached. <note> <p>If you are creating your cache
     * cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the
     * selected subnet group. <p>The number of Availability Zones listed must
     * equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     * all the nodes in the same Availability Zone, use
     * <code>PreferredAvailabilityZone</code> instead, or repeat the
     * Availability Zone multiple times in the list. <p>Default: System
     * chosen Availability Zones. <p>Example: One Memcached node in each of
     * three different Availability Zones:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     * <p>Example: All three Memcached nodes in one Availability Zone:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     *
     * @return A list of the Availability Zones in which cache nodes will be created.
     *         The order of the zones in the list is not important. <p>This option is
     *         only supported on Memcached. <note> <p>If you are creating your cache
     *         cluster in an Amazon VPC (recommended) you can only locate nodes in
     *         Availability Zones that are associated with the subnets in the
     *         selected subnet group. <p>The number of Availability Zones listed must
     *         equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     *         all the nodes in the same Availability Zone, use
     *         <code>PreferredAvailabilityZone</code> instead, or repeat the
     *         Availability Zone multiple times in the list. <p>Default: System
     *         chosen Availability Zones. <p>Example: One Memcached node in each of
     *         three different Availability Zones:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     *         <p>Example: All three Memcached nodes in one Availability Zone:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     */
    public java.util.List<String> getPreferredAvailabilityZones() {
        if (preferredAvailabilityZones == null) {
              preferredAvailabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              preferredAvailabilityZones.setAutoConstruct(true);
        }
        return preferredAvailabilityZones;
    }
    
    /**
     * A list of the Availability Zones in which cache nodes will be created.
     * The order of the zones in the list is not important. <p>This option is
     * only supported on Memcached. <note> <p>If you are creating your cache
     * cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the
     * selected subnet group. <p>The number of Availability Zones listed must
     * equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     * all the nodes in the same Availability Zone, use
     * <code>PreferredAvailabilityZone</code> instead, or repeat the
     * Availability Zone multiple times in the list. <p>Default: System
     * chosen Availability Zones. <p>Example: One Memcached node in each of
     * three different Availability Zones:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     * <p>Example: All three Memcached nodes in one Availability Zone:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     *
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes will be created.
     *         The order of the zones in the list is not important. <p>This option is
     *         only supported on Memcached. <note> <p>If you are creating your cache
     *         cluster in an Amazon VPC (recommended) you can only locate nodes in
     *         Availability Zones that are associated with the subnets in the
     *         selected subnet group. <p>The number of Availability Zones listed must
     *         equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     *         all the nodes in the same Availability Zone, use
     *         <code>PreferredAvailabilityZone</code> instead, or repeat the
     *         Availability Zone multiple times in the list. <p>Default: System
     *         chosen Availability Zones. <p>Example: One Memcached node in each of
     *         three different Availability Zones:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     *         <p>Example: All three Memcached nodes in one Availability Zone:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     */
    public void setPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        if (preferredAvailabilityZones == null) {
            this.preferredAvailabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> preferredAvailabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(preferredAvailabilityZones.size());
        preferredAvailabilityZonesCopy.addAll(preferredAvailabilityZones);
        this.preferredAvailabilityZones = preferredAvailabilityZonesCopy;
    }
    
    /**
     * A list of the Availability Zones in which cache nodes will be created.
     * The order of the zones in the list is not important. <p>This option is
     * only supported on Memcached. <note> <p>If you are creating your cache
     * cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the
     * selected subnet group. <p>The number of Availability Zones listed must
     * equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     * all the nodes in the same Availability Zone, use
     * <code>PreferredAvailabilityZone</code> instead, or repeat the
     * Availability Zone multiple times in the list. <p>Default: System
     * chosen Availability Zones. <p>Example: One Memcached node in each of
     * three different Availability Zones:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     * <p>Example: All three Memcached nodes in one Availability Zone:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPreferredAvailabilityZones(java.util.Collection)}
     * or {@link #withPreferredAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes will be created.
     *         The order of the zones in the list is not important. <p>This option is
     *         only supported on Memcached. <note> <p>If you are creating your cache
     *         cluster in an Amazon VPC (recommended) you can only locate nodes in
     *         Availability Zones that are associated with the subnets in the
     *         selected subnet group. <p>The number of Availability Zones listed must
     *         equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     *         all the nodes in the same Availability Zone, use
     *         <code>PreferredAvailabilityZone</code> instead, or repeat the
     *         Availability Zone multiple times in the list. <p>Default: System
     *         chosen Availability Zones. <p>Example: One Memcached node in each of
     *         three different Availability Zones:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     *         <p>Example: All three Memcached nodes in one Availability Zone:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withPreferredAvailabilityZones(String... preferredAvailabilityZones) {
        if (getPreferredAvailabilityZones() == null) setPreferredAvailabilityZones(new java.util.ArrayList<String>(preferredAvailabilityZones.length));
        for (String value : preferredAvailabilityZones) {
            getPreferredAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of the Availability Zones in which cache nodes will be created.
     * The order of the zones in the list is not important. <p>This option is
     * only supported on Memcached. <note> <p>If you are creating your cache
     * cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the
     * selected subnet group. <p>The number of Availability Zones listed must
     * equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     * all the nodes in the same Availability Zone, use
     * <code>PreferredAvailabilityZone</code> instead, or repeat the
     * Availability Zone multiple times in the list. <p>Default: System
     * chosen Availability Zones. <p>Example: One Memcached node in each of
     * three different Availability Zones:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     * <p>Example: All three Memcached nodes in one Availability Zone:
     * <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes will be created.
     *         The order of the zones in the list is not important. <p>This option is
     *         only supported on Memcached. <note> <p>If you are creating your cache
     *         cluster in an Amazon VPC (recommended) you can only locate nodes in
     *         Availability Zones that are associated with the subnets in the
     *         selected subnet group. <p>The number of Availability Zones listed must
     *         equal the value of <code>NumCacheNodes</code>. </note> <p>If you want
     *         all the nodes in the same Availability Zone, use
     *         <code>PreferredAvailabilityZone</code> instead, or repeat the
     *         Availability Zone multiple times in the list. <p>Default: System
     *         chosen Availability Zones. <p>Example: One Memcached node in each of
     *         three different Availability Zones:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2b&PreferredAvailabilityZones.member.3=us-west-2c</code>
     *         <p>Example: All three Memcached nodes in one Availability Zone:
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a&PreferredAvailabilityZones.member.2=us-west-2a&PreferredAvailabilityZones.member.3=us-west-2a</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withPreferredAvailabilityZones(java.util.Collection<String> preferredAvailabilityZones) {
        if (preferredAvailabilityZones == null) {
            this.preferredAvailabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> preferredAvailabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(preferredAvailabilityZones.size());
            preferredAvailabilityZonesCopy.addAll(preferredAvailabilityZones);
            this.preferredAvailabilityZones = preferredAvailabilityZonesCopy;
        }

        return this;
    }

    /**
     * The initial number of cache nodes that the cache cluster will have.
     * <p>For clusters running Redis, this value must be 1. For clusters
     * running Memcached, this value must be between 1 and 20. <p>If you need
     * more than 20 nodes for your Memcached cluster, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     *
     * @return The initial number of cache nodes that the cache cluster will have.
     *         <p>For clusters running Redis, this value must be 1. For clusters
     *         running Memcached, this value must be between 1 and 20. <p>If you need
     *         more than 20 nodes for your Memcached cluster, please fill out the
     *         ElastiCache Limit Increase Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The initial number of cache nodes that the cache cluster will have.
     * <p>For clusters running Redis, this value must be 1. For clusters
     * running Memcached, this value must be between 1 and 20. <p>If you need
     * more than 20 nodes for your Memcached cluster, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     *
     * @param numCacheNodes The initial number of cache nodes that the cache cluster will have.
     *         <p>For clusters running Redis, this value must be 1. For clusters
     *         running Memcached, this value must be between 1 and 20. <p>If you need
     *         more than 20 nodes for your Memcached cluster, please fill out the
     *         ElastiCache Limit Increase Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The initial number of cache nodes that the cache cluster will have.
     * <p>For clusters running Redis, this value must be 1. For clusters
     * running Memcached, this value must be between 1 and 20. <p>If you need
     * more than 20 nodes for your Memcached cluster, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The initial number of cache nodes that the cache cluster will have.
     *         <p>For clusters running Redis, this value must be 1. For clusters
     *         running Memcached, this value must be between 1 and 20. <p>If you need
     *         more than 20 nodes for your Memcached cluster, please fill out the
     *         ElastiCache Limit Increase Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request/">http://aws.amazon.com/contact-us/elasticache-node-limit-request/</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * The compute and memory capacity of the nodes in the node group.
     * <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     * <li>Current generation: <code>cache.t2.micro</code>,
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
     * @return The compute and memory capacity of the nodes in the node group.
     *         <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     *         <li>Current generation: <code>cache.t2.micro</code>,
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
     * The compute and memory capacity of the nodes in the node group.
     * <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     * <li>Current generation: <code>cache.t2.micro</code>,
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
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group.
     *         <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     *         <li>Current generation: <code>cache.t2.micro</code>,
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
     * The compute and memory capacity of the nodes in the node group.
     * <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     * <li>Current generation: <code>cache.t2.micro</code>,
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
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group.
     *         <p>Valid node types are as follows: <ul> <li>General purpose: <ul>
     *         <li>Current generation: <code>cache.t2.micro</code>,
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
    public CreateCacheClusterRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The name of the cache engine to be used for this cache cluster.
     * <p>Valid values for this parameter are: <p><code>memcached</code> |
     * <code>redis</code>
     *
     * @return The name of the cache engine to be used for this cache cluster.
     *         <p>Valid values for this parameter are: <p><code>memcached</code> |
     *         <code>redis</code>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the cache engine to be used for this cache cluster.
     * <p>Valid values for this parameter are: <p><code>memcached</code> |
     * <code>redis</code>
     *
     * @param engine The name of the cache engine to be used for this cache cluster.
     *         <p>Valid values for this parameter are: <p><code>memcached</code> |
     *         <code>redis</code>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the cache engine to be used for this cache cluster.
     * <p>Valid values for this parameter are: <p><code>memcached</code> |
     * <code>redis</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the cache engine to be used for this cache cluster.
     *         <p>Valid values for this parameter are: <p><code>memcached</code> |
     *         <code>redis</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version number of the cache engine to be used for this cache
     * cluster. To view the supported cache engine versions, use the
     * <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     * can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     *
     * @return The version number of the cache engine to be used for this cache
     *         cluster. To view the supported cache engine versions, use the
     *         <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     *         can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster or replication group and
     *         create it anew with the earlier engine version.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the cache engine to be used for this cache
     * cluster. To view the supported cache engine versions, use the
     * <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     * can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     *
     * @param engineVersion The version number of the cache engine to be used for this cache
     *         cluster. To view the supported cache engine versions, use the
     *         <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     *         can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster or replication group and
     *         create it anew with the earlier engine version.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the cache engine to be used for this cache
     * cluster. To view the supported cache engine versions, use the
     * <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     * can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the cache engine to be used for this cache
     *         cluster. To view the supported cache engine versions, use the
     *         <i>DescribeCacheEngineVersions</i> action. <p><b>Important:</b> You
     *         can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster or replication group and
     *         create it anew with the earlier engine version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The name of the parameter group to associate with this cache cluster.
     * If this argument is omitted, the default parameter group for the
     * specified engine is used.
     *
     * @return The name of the parameter group to associate with this cache cluster.
     *         If this argument is omitted, the default parameter group for the
     *         specified engine is used.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the parameter group to associate with this cache cluster.
     * If this argument is omitted, the default parameter group for the
     * specified engine is used.
     *
     * @param cacheParameterGroupName The name of the parameter group to associate with this cache cluster.
     *         If this argument is omitted, the default parameter group for the
     *         specified engine is used.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the parameter group to associate with this cache cluster.
     * If this argument is omitted, the default parameter group for the
     * specified engine is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the parameter group to associate with this cache cluster.
     *         If this argument is omitted, the default parameter group for the
     *         specified engine is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The name of the subnet group to be used for the cache cluster. <p>Use
     * this parameter only when you are creating a cache cluster in an Amazon
     * Virtual Private Cloud (VPC).
     *
     * @return The name of the subnet group to be used for the cache cluster. <p>Use
     *         this parameter only when you are creating a cache cluster in an Amazon
     *         Virtual Private Cloud (VPC).
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name of the subnet group to be used for the cache cluster. <p>Use
     * this parameter only when you are creating a cache cluster in an Amazon
     * Virtual Private Cloud (VPC).
     *
     * @param cacheSubnetGroupName The name of the subnet group to be used for the cache cluster. <p>Use
     *         this parameter only when you are creating a cache cluster in an Amazon
     *         Virtual Private Cloud (VPC).
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name of the subnet group to be used for the cache cluster. <p>Use
     * this parameter only when you are creating a cache cluster in an Amazon
     * Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name of the subnet group to be used for the cache cluster. <p>Use
     *         this parameter only when you are creating a cache cluster in an Amazon
     *         Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * A list of security group names to associate with this cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC).
     *
     * @return A list of security group names to associate with this cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster
     *         outside of an Amazon Virtual Private Cloud (VPC).
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
              cacheSecurityGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheSecurityGroupNames.setAutoConstruct(true);
        }
        return cacheSecurityGroupNames;
    }
    
    /**
     * A list of security group names to associate with this cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC).
     *
     * @param cacheSecurityGroupNames A list of security group names to associate with this cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster
     *         outside of an Amazon Virtual Private Cloud (VPC).
     */
    public void setCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheSecurityGroupNames.size());
        cacheSecurityGroupNamesCopy.addAll(cacheSecurityGroupNames);
        this.cacheSecurityGroupNames = cacheSecurityGroupNamesCopy;
    }
    
    /**
     * A list of security group names to associate with this cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of security group names to associate with this cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster
     *         outside of an Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
        if (getCacheSecurityGroupNames() == null) setCacheSecurityGroupNames(new java.util.ArrayList<String>(cacheSecurityGroupNames.length));
        for (String value : cacheSecurityGroupNames) {
            getCacheSecurityGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of security group names to associate with this cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster
     * outside of an Amazon Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of security group names to associate with this cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster
     *         outside of an Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheSecurityGroupNames.size());
            cacheSecurityGroupNamesCopy.addAll(cacheSecurityGroupNames);
            this.cacheSecurityGroupNames = cacheSecurityGroupNamesCopy;
        }

        return this;
    }

    /**
     * One or more VPC security groups associated with the cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster in an
     * Amazon Virtual Private Cloud (VPC).
     *
     * @return One or more VPC security groups associated with the cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster in an
     *         Amazon Virtual Private Cloud (VPC).
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * One or more VPC security groups associated with the cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster in an
     * Amazon Virtual Private Cloud (VPC).
     *
     * @param securityGroupIds One or more VPC security groups associated with the cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster in an
     *         Amazon Virtual Private Cloud (VPC).
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
        securityGroupIdsCopy.addAll(securityGroupIds);
        this.securityGroupIds = securityGroupIdsCopy;
    }
    
    /**
     * One or more VPC security groups associated with the cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster in an
     * Amazon Virtual Private Cloud (VPC).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds One or more VPC security groups associated with the cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster in an
     *         Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more VPC security groups associated with the cache cluster.
     * <p>Use this parameter only when you are creating a cache cluster in an
     * Amazon Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds One or more VPC security groups associated with the cache cluster.
     *         <p>Use this parameter only when you are creating a cache cluster in an
     *         Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
            securityGroupIdsCopy.addAll(securityGroupIds);
            this.securityGroupIds = securityGroupIdsCopy;
        }

        return this;
    }

    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @return A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @param tags A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon
     * S3. The snapshot file will be used to populate the node group. The
     * Amazon S3 object name in the ARN cannot contain any commas.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     * Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *
     * @return A single-element string list containing an Amazon Resource Name (ARN)
     *         that uniquely identifies a Redis RDB snapshot file stored in Amazon
     *         S3. The snapshot file will be used to populate the node group. The
     *         Amazon S3 object name in the ARN cannot contain any commas.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     *         Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */
    public java.util.List<String> getSnapshotArns() {
        if (snapshotArns == null) {
              snapshotArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              snapshotArns.setAutoConstruct(true);
        }
        return snapshotArns;
    }
    
    /**
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon
     * S3. The snapshot file will be used to populate the node group. The
     * Amazon S3 object name in the ARN cannot contain any commas.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     * Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     *         that uniquely identifies a Redis RDB snapshot file stored in Amazon
     *         S3. The snapshot file will be used to populate the node group. The
     *         Amazon S3 object name in the ARN cannot contain any commas.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     *         Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */
    public void setSnapshotArns(java.util.Collection<String> snapshotArns) {
        if (snapshotArns == null) {
            this.snapshotArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotArns.size());
        snapshotArnsCopy.addAll(snapshotArns);
        this.snapshotArns = snapshotArnsCopy;
    }
    
    /**
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon
     * S3. The snapshot file will be used to populate the node group. The
     * Amazon S3 object name in the ARN cannot contain any commas.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     * Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSnapshotArns(java.util.Collection)} or {@link
     * #withSnapshotArns(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     *         that uniquely identifies a Redis RDB snapshot file stored in Amazon
     *         S3. The snapshot file will be used to populate the node group. The
     *         Amazon S3 object name in the ARN cannot contain any commas.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     *         Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSnapshotArns(String... snapshotArns) {
        if (getSnapshotArns() == null) setSnapshotArns(new java.util.ArrayList<String>(snapshotArns.length));
        for (String value : snapshotArns) {
            getSnapshotArns().add(value);
        }
        return this;
    }
    
    /**
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon
     * S3. The snapshot file will be used to populate the node group. The
     * Amazon S3 object name in the ARN cannot contain any commas.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     * Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     *         that uniquely identifies a Redis RDB snapshot file stored in Amazon
     *         S3. The snapshot file will be used to populate the node group. The
     *         Amazon S3 object name in the ARN cannot contain any commas.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Example of an
     *         Amazon S3 ARN: <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSnapshotArns(java.util.Collection<String> snapshotArns) {
        if (snapshotArns == null) {
            this.snapshotArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotArns.size());
            snapshotArnsCopy.addAll(snapshotArns);
            this.snapshotArns = snapshotArnsCopy;
        }

        return this;
    }

    /**
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created. <p><b>Note:</b> This parameter is
     * only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *
     * @return The name of a snapshot from which to restore data into the new node
     *         group. The snapshot status changes to <code>restoring</code> while the
     *         new node group is being created. <p><b>Note:</b> This parameter is
     *         only valid if the <code>Engine</code> parameter is <code>redis</code>.
     */
    public String getSnapshotName() {
        return snapshotName;
    }
    
    /**
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created. <p><b>Note:</b> This parameter is
     * only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *
     * @param snapshotName The name of a snapshot from which to restore data into the new node
     *         group. The snapshot status changes to <code>restoring</code> while the
     *         new node group is being created. <p><b>Note:</b> This parameter is
     *         only valid if the <code>Engine</code> parameter is <code>redis</code>.
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }
    
    /**
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created. <p><b>Note:</b> This parameter is
     * only valid if the <code>Engine</code> parameter is <code>redis</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotName The name of a snapshot from which to restore data into the new node
     *         group. The snapshot status changes to <code>restoring</code> while the
     *         new node group is being created. <p><b>Note:</b> This parameter is
     *         only valid if the <code>Engine</code> parameter is <code>redis</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
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
    public CreateCacheClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The port number on which each of the cache nodes will accept
     * connections.
     *
     * @return The port number on which each of the cache nodes will accept
     *         connections.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which each of the cache nodes will accept
     * connections.
     *
     * @param port The port number on which each of the cache nodes will accept
     *         connections.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which each of the cache nodes will accept
     * connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which each of the cache nodes will accept
     *         connections.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note>The
     * Amazon SNS topic owner must be the same as the cache cluster
     * owner.</note>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent. <note>The
     *         Amazon SNS topic owner must be the same as the cache cluster
     *         owner.</note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note>The
     * Amazon SNS topic owner must be the same as the cache cluster
     * owner.</note>
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent. <note>The
     *         Amazon SNS topic owner must be the same as the cache cluster
     *         owner.</note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note>The
     * Amazon SNS topic owner must be the same as the cache cluster
     * owner.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent. <note>The
     *         Amazon SNS topic owner must be the same as the cache cluster
     *         owner.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
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
    public CreateCacheClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
     * The number of days for which ElastiCache will retain automatic
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     * taken today will be retained for 5 days before being deleted.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     * (i.e., automatic backups are disabled for this cache cluster).
     *
     * @return The number of days for which ElastiCache will retain automatic
     *         snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     *         taken today will be retained for 5 days before being deleted.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     *         (i.e., automatic backups are disabled for this cache cluster).
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }
    
    /**
     * The number of days for which ElastiCache will retain automatic
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     * taken today will be retained for 5 days before being deleted.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     * (i.e., automatic backups are disabled for this cache cluster).
     *
     * @param snapshotRetentionLimit The number of days for which ElastiCache will retain automatic
     *         snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     *         taken today will be retained for 5 days before being deleted.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     *         (i.e., automatic backups are disabled for this cache cluster).
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }
    
    /**
     * The number of days for which ElastiCache will retain automatic
     * snapshots before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     * taken today will be retained for 5 days before being deleted.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     * (i.e., automatic backups are disabled for this cache cluster).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotRetentionLimit The number of days for which ElastiCache will retain automatic
     *         snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     *         taken today will be retained for 5 days before being deleted.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>. <p>Default: 0
     *         (i.e., automatic backups are disabled for this cache cluster).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your node group. <p>Example:
     * <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     * ElastiCache will automatically choose an appropriate time range.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>.
     *
     * @return The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your node group. <p>Example:
     *         <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     *         ElastiCache will automatically choose an appropriate time range.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>.
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }
    
    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your node group. <p>Example:
     * <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     * ElastiCache will automatically choose an appropriate time range.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>.
     *
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your node group. <p>Example:
     *         <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     *         ElastiCache will automatically choose an appropriate time range.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>.
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }
    
    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your node group. <p>Example:
     * <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     * ElastiCache will automatically choose an appropriate time range.
     * <p><b>Note:</b> This parameter is only valid if the
     * <code>Engine</code> parameter is <code>redis</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your node group. <p>Example:
     *         <code>05:00-09:00</code> <p>If you do not specify this parameter, then
     *         ElastiCache will automatically choose an appropriate time range.
     *         <p><b>Note:</b> This parameter is only valid if the
     *         <code>Engine</code> parameter is <code>redis</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCacheClusterRequest withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getAZMode() != null) sb.append("AZMode: " + getAZMode() + ",");
        if (getPreferredAvailabilityZone() != null) sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getPreferredAvailabilityZones() != null) sb.append("PreferredAvailabilityZones: " + getPreferredAvailabilityZones() + ",");
        if (getNumCacheNodes() != null) sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheSecurityGroupNames() != null) sb.append("CacheSecurityGroupNames: " + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getSnapshotArns() != null) sb.append("SnapshotArns: " + getSnapshotArns() + ",");
        if (getSnapshotName() != null) sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getNotificationTopicArn() != null) sb.append("NotificationTopicArn: " + getNotificationTopicArn() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null) sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null) sb.append("SnapshotWindow: " + getSnapshotWindow() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getAZMode() == null) ? 0 : getAZMode().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredAvailabilityZones() == null) ? 0 : getPreferredAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotArns() == null) ? 0 : getSnapshotArns().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateCacheClusterRequest == false) return false;
        CreateCacheClusterRequest other = (CreateCacheClusterRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        if (other.getAZMode() == null ^ this.getAZMode() == null) return false;
        if (other.getAZMode() != null && other.getAZMode().equals(this.getAZMode()) == false) return false; 
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null) return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false) return false; 
        if (other.getPreferredAvailabilityZones() == null ^ this.getPreferredAvailabilityZones() == null) return false;
        if (other.getPreferredAvailabilityZones() != null && other.getPreferredAvailabilityZones().equals(this.getPreferredAvailabilityZones()) == false) return false; 
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null) return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getCacheSecurityGroupNames() == null ^ this.getCacheSecurityGroupNames() == null) return false;
        if (other.getCacheSecurityGroupNames() != null && other.getCacheSecurityGroupNames().equals(this.getCacheSecurityGroupNames()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getSnapshotArns() == null ^ this.getSnapshotArns() == null) return false;
        if (other.getSnapshotArns() != null && other.getSnapshotArns().equals(this.getSnapshotArns()) == false) return false; 
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null) return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null) return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null) return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false) return false; 
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null) return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateCacheClusterRequest clone() {
        
            return (CreateCacheClusterRequest) super.clone();
    }

}
    