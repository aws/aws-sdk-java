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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createReplicationGroup(CreateReplicationGroupRequest) CreateReplicationGroup operation}.
 * <p>
 * The <i>CreateReplicationGroup</i> action creates a replication group.
 * A replication group is a collection of cache clusters, where one of
 * the cache clusters is a read/write primary and the others are
 * read-only replicas. Writes to the primary are automatically propagated
 * to the replicas.
 * </p>
 * <p>
 * When you create a replication group, you must specify an existing
 * cache cluster that is in the primary role. When the replication group
 * has been successfully created, you can add one or more read replica
 * replicas to it, up to a total of five read replicas.
 * </p>
 * <p>
 * <b>Note:</b> This action is valid only for Redis.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createReplicationGroup(CreateReplicationGroupRequest)
 */
public class CreateReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     * to 20 alphanumeric characters or hyphens.</li> <li>The first character
     * must be a letter.</li> <li>A name cannot end with a hyphen or contain
     * two consecutive hyphens.</li> </ul>
     */
    private String replicationGroupId;

    /**
     * A user-created description for the replication group.
     */
    private String replicationGroupDescription;

    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>. <p>This parameter is not required if
     * <i>NumCacheClusters</i> is specified.
     */
    private String primaryClusterId;

    /**
     * Specifies whether a read-only replica will be automatically promoted
     * to read/write primary if the existing primary fails. <p>If
     * <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     * not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     * <li>T1 and T2 cache node types.</li> </ul> </note>
     */
    private Boolean automaticFailoverEnabled;

    /**
     * The number of cache clusters this replication group will initially
     * have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     * parameter must be at least 2. <p>The maximum permitted value for
     * <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     * exceed this limit, please fill out the ElastiCache Limit Increase
     * Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     */
    private Integer numCacheClusters;

    /**
     * A list of EC2 availability zones in which the replication group's
     * cache clusters will be created. The order of the availability zones in
     * the list is not important. <note>If you are creating your replication
     * group in an Amazon VPC (recommended), you can only locate cache
     * clusters in availability zones associated with the subnets in the
     * selected subnet group. <p>The number of availability zones listed must
     * equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     * chosen availability zones. <p>Example: One Redis cache cluster in each
     * of three availability zones.
     * PreferredAvailabilityZones.member.1=us-west-2a
     * PreferredAvailabilityZones.member.2=us-west-2c
     * PreferredAvailabilityZones.member.3=us-west-2c
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> preferredCacheClusterAZs;

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
     * The name of the cache engine to be used for the cache clusters in this
     * replication group. <p>Default: redis
     */
    private String engine;

    /**
     * The version number of the cache engine to be used for the cache
     * clusters in this replication group. To view the supported cache engine
     * versions, use the <i>DescribeCacheEngineVersions</i> action.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     */
    private String engineVersion;

    /**
     * The name of the parameter group to associate with this replication
     * group. If this argument is omitted, the default cache parameter group
     * for the specified engine is used.
     */
    private String cacheParameterGroupName;

    /**
     * The name of the cache subnet group to be used for the replication
     * group.
     */
    private String cacheSubnetGroupName;

    /**
     * A list of cache security group names to associate with this
     * replication group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNames;

    /**
     * One or more Amazon VPC security groups associated with this
     * replication group. <p>Use this parameter only when you are creating a
     * replication group in an Amazon Virtual Private Cloud (VPC).
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
     * The port number on which each member of the replication group will
     * accept connections.
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
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     * to 20 alphanumeric characters or hyphens.</li> <li>The first character
     * must be a letter.</li> <li>A name cannot end with a hyphen or contain
     * two consecutive hyphens.</li> </ul>
     *
     * @return The replication group identifier. This parameter is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     *         to 20 alphanumeric characters or hyphens.</li> <li>The first character
     *         must be a letter.</li> <li>A name cannot end with a hyphen or contain
     *         two consecutive hyphens.</li> </ul>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     * to 20 alphanumeric characters or hyphens.</li> <li>The first character
     * must be a letter.</li> <li>A name cannot end with a hyphen or contain
     * two consecutive hyphens.</li> </ul>
     *
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     *         to 20 alphanumeric characters or hyphens.</li> <li>The first character
     *         must be a letter.</li> <li>A name cannot end with a hyphen or contain
     *         two consecutive hyphens.</li> </ul>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     * to 20 alphanumeric characters or hyphens.</li> <li>The first character
     * must be a letter.</li> <li>A name cannot end with a hyphen or contain
     * two consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>A name must contain from 1
     *         to 20 alphanumeric characters or hyphens.</li> <li>The first character
     *         must be a letter.</li> <li>A name cannot end with a hyphen or contain
     *         two consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * A user-created description for the replication group.
     *
     * @return A user-created description for the replication group.
     */
    public String getReplicationGroupDescription() {
        return replicationGroupDescription;
    }
    
    /**
     * A user-created description for the replication group.
     *
     * @param replicationGroupDescription A user-created description for the replication group.
     */
    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }
    
    /**
     * A user-created description for the replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupDescription A user-created description for the replication group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>. <p>This parameter is not required if
     * <i>NumCacheClusters</i> is specified.
     *
     * @return The identifier of the cache cluster that will serve as the primary for
     *         this replication group. This cache cluster must already exist and have
     *         a status of <i>available</i>. <p>This parameter is not required if
     *         <i>NumCacheClusters</i> is specified.
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }
    
    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>. <p>This parameter is not required if
     * <i>NumCacheClusters</i> is specified.
     *
     * @param primaryClusterId The identifier of the cache cluster that will serve as the primary for
     *         this replication group. This cache cluster must already exist and have
     *         a status of <i>available</i>. <p>This parameter is not required if
     *         <i>NumCacheClusters</i> is specified.
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }
    
    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>. <p>This parameter is not required if
     * <i>NumCacheClusters</i> is specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primaryClusterId The identifier of the cache cluster that will serve as the primary for
     *         this replication group. This cache cluster must already exist and have
     *         a status of <i>available</i>. <p>This parameter is not required if
     *         <i>NumCacheClusters</i> is specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * Specifies whether a read-only replica will be automatically promoted
     * to read/write primary if the existing primary fails. <p>If
     * <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     * not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     * <li>T1 and T2 cache node types.</li> </ul> </note>
     *
     * @return Specifies whether a read-only replica will be automatically promoted
     *         to read/write primary if the existing primary fails. <p>If
     *         <code>true</code>, Multi-AZ is enabled for this replication group. If
     *         <code>false</code>, Multi-AZ is disabled for this replication group.
     *         <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     *         not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     *         <li>T1 and T2 cache node types.</li> </ul> </note>
     */
    public Boolean isAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }
    
    /**
     * Specifies whether a read-only replica will be automatically promoted
     * to read/write primary if the existing primary fails. <p>If
     * <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     * not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     * <li>T1 and T2 cache node types.</li> </ul> </note>
     *
     * @param automaticFailoverEnabled Specifies whether a read-only replica will be automatically promoted
     *         to read/write primary if the existing primary fails. <p>If
     *         <code>true</code>, Multi-AZ is enabled for this replication group. If
     *         <code>false</code>, Multi-AZ is disabled for this replication group.
     *         <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     *         not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     *         <li>T1 and T2 cache node types.</li> </ul> </note>
     */
    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }
    
    /**
     * Specifies whether a read-only replica will be automatically promoted
     * to read/write primary if the existing primary fails. <p>If
     * <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     * not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     * <li>T1 and T2 cache node types.</li> </ul> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automaticFailoverEnabled Specifies whether a read-only replica will be automatically promoted
     *         to read/write primary if the existing primary fails. <p>If
     *         <code>true</code>, Multi-AZ is enabled for this replication group. If
     *         <code>false</code>, Multi-AZ is disabled for this replication group.
     *         <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     *         not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     *         <li>T1 and T2 cache node types.</li> </ul> </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
        return this;
    }

    /**
     * Specifies whether a read-only replica will be automatically promoted
     * to read/write primary if the existing primary fails. <p>If
     * <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     * not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     * <li>T1 and T2 cache node types.</li> </ul> </note>
     *
     * @return Specifies whether a read-only replica will be automatically promoted
     *         to read/write primary if the existing primary fails. <p>If
     *         <code>true</code>, Multi-AZ is enabled for this replication group. If
     *         <code>false</code>, Multi-AZ is disabled for this replication group.
     *         <p>Default: false <note><p>ElastiCache Multi-AZ replication groups is
     *         not supported on: <ul> <li>Redis versions earlier than 2.8.6.</li>
     *         <li>T1 and T2 cache node types.</li> </ul> </note>
     */
    public Boolean getAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * The number of cache clusters this replication group will initially
     * have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     * parameter must be at least 2. <p>The maximum permitted value for
     * <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     * exceed this limit, please fill out the ElastiCache Limit Increase
     * Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     *
     * @return The number of cache clusters this replication group will initially
     *         have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     *         parameter must be at least 2. <p>The maximum permitted value for
     *         <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     *         exceed this limit, please fill out the ElastiCache Limit Increase
     *         Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     */
    public Integer getNumCacheClusters() {
        return numCacheClusters;
    }
    
    /**
     * The number of cache clusters this replication group will initially
     * have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     * parameter must be at least 2. <p>The maximum permitted value for
     * <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     * exceed this limit, please fill out the ElastiCache Limit Increase
     * Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     *
     * @param numCacheClusters The number of cache clusters this replication group will initially
     *         have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     *         parameter must be at least 2. <p>The maximum permitted value for
     *         <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     *         exceed this limit, please fill out the ElastiCache Limit Increase
     *         Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     */
    public void setNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
    }
    
    /**
     * The number of cache clusters this replication group will initially
     * have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     * parameter must be at least 2. <p>The maximum permitted value for
     * <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     * exceed this limit, please fill out the ElastiCache Limit Increase
     * Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheClusters The number of cache clusters this replication group will initially
     *         have. <p>If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     *         parameter must be at least 2. <p>The maximum permitted value for
     *         <i>NumCacheClusters</i> is 6 (primary plus 5 replicas). If you need to
     *         exceed this limit, please fill out the ElastiCache Limit Increase
     *         Request form at <a
     *         href="http://aws.amazon.com/contact-us/elasticache-node-limit-request">http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
        return this;
    }

    /**
     * A list of EC2 availability zones in which the replication group's
     * cache clusters will be created. The order of the availability zones in
     * the list is not important. <note>If you are creating your replication
     * group in an Amazon VPC (recommended), you can only locate cache
     * clusters in availability zones associated with the subnets in the
     * selected subnet group. <p>The number of availability zones listed must
     * equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     * chosen availability zones. <p>Example: One Redis cache cluster in each
     * of three availability zones.
     * PreferredAvailabilityZones.member.1=us-west-2a
     * PreferredAvailabilityZones.member.2=us-west-2c
     * PreferredAvailabilityZones.member.3=us-west-2c
     *
     * @return A list of EC2 availability zones in which the replication group's
     *         cache clusters will be created. The order of the availability zones in
     *         the list is not important. <note>If you are creating your replication
     *         group in an Amazon VPC (recommended), you can only locate cache
     *         clusters in availability zones associated with the subnets in the
     *         selected subnet group. <p>The number of availability zones listed must
     *         equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     *         chosen availability zones. <p>Example: One Redis cache cluster in each
     *         of three availability zones.
     *         PreferredAvailabilityZones.member.1=us-west-2a
     *         PreferredAvailabilityZones.member.2=us-west-2c
     *         PreferredAvailabilityZones.member.3=us-west-2c
     */
    public java.util.List<String> getPreferredCacheClusterAZs() {
        if (preferredCacheClusterAZs == null) {
              preferredCacheClusterAZs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              preferredCacheClusterAZs.setAutoConstruct(true);
        }
        return preferredCacheClusterAZs;
    }
    
    /**
     * A list of EC2 availability zones in which the replication group's
     * cache clusters will be created. The order of the availability zones in
     * the list is not important. <note>If you are creating your replication
     * group in an Amazon VPC (recommended), you can only locate cache
     * clusters in availability zones associated with the subnets in the
     * selected subnet group. <p>The number of availability zones listed must
     * equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     * chosen availability zones. <p>Example: One Redis cache cluster in each
     * of three availability zones.
     * PreferredAvailabilityZones.member.1=us-west-2a
     * PreferredAvailabilityZones.member.2=us-west-2c
     * PreferredAvailabilityZones.member.3=us-west-2c
     *
     * @param preferredCacheClusterAZs A list of EC2 availability zones in which the replication group's
     *         cache clusters will be created. The order of the availability zones in
     *         the list is not important. <note>If you are creating your replication
     *         group in an Amazon VPC (recommended), you can only locate cache
     *         clusters in availability zones associated with the subnets in the
     *         selected subnet group. <p>The number of availability zones listed must
     *         equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     *         chosen availability zones. <p>Example: One Redis cache cluster in each
     *         of three availability zones.
     *         PreferredAvailabilityZones.member.1=us-west-2a
     *         PreferredAvailabilityZones.member.2=us-west-2c
     *         PreferredAvailabilityZones.member.3=us-west-2c
     */
    public void setPreferredCacheClusterAZs(java.util.Collection<String> preferredCacheClusterAZs) {
        if (preferredCacheClusterAZs == null) {
            this.preferredCacheClusterAZs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> preferredCacheClusterAZsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(preferredCacheClusterAZs.size());
        preferredCacheClusterAZsCopy.addAll(preferredCacheClusterAZs);
        this.preferredCacheClusterAZs = preferredCacheClusterAZsCopy;
    }
    
    /**
     * A list of EC2 availability zones in which the replication group's
     * cache clusters will be created. The order of the availability zones in
     * the list is not important. <note>If you are creating your replication
     * group in an Amazon VPC (recommended), you can only locate cache
     * clusters in availability zones associated with the subnets in the
     * selected subnet group. <p>The number of availability zones listed must
     * equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     * chosen availability zones. <p>Example: One Redis cache cluster in each
     * of three availability zones.
     * PreferredAvailabilityZones.member.1=us-west-2a
     * PreferredAvailabilityZones.member.2=us-west-2c
     * PreferredAvailabilityZones.member.3=us-west-2c
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPreferredCacheClusterAZs(java.util.Collection)}
     * or {@link #withPreferredCacheClusterAZs(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredCacheClusterAZs A list of EC2 availability zones in which the replication group's
     *         cache clusters will be created. The order of the availability zones in
     *         the list is not important. <note>If you are creating your replication
     *         group in an Amazon VPC (recommended), you can only locate cache
     *         clusters in availability zones associated with the subnets in the
     *         selected subnet group. <p>The number of availability zones listed must
     *         equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     *         chosen availability zones. <p>Example: One Redis cache cluster in each
     *         of three availability zones.
     *         PreferredAvailabilityZones.member.1=us-west-2a
     *         PreferredAvailabilityZones.member.2=us-west-2c
     *         PreferredAvailabilityZones.member.3=us-west-2c
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withPreferredCacheClusterAZs(String... preferredCacheClusterAZs) {
        if (getPreferredCacheClusterAZs() == null) setPreferredCacheClusterAZs(new java.util.ArrayList<String>(preferredCacheClusterAZs.length));
        for (String value : preferredCacheClusterAZs) {
            getPreferredCacheClusterAZs().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 availability zones in which the replication group's
     * cache clusters will be created. The order of the availability zones in
     * the list is not important. <note>If you are creating your replication
     * group in an Amazon VPC (recommended), you can only locate cache
     * clusters in availability zones associated with the subnets in the
     * selected subnet group. <p>The number of availability zones listed must
     * equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     * chosen availability zones. <p>Example: One Redis cache cluster in each
     * of three availability zones.
     * PreferredAvailabilityZones.member.1=us-west-2a
     * PreferredAvailabilityZones.member.2=us-west-2c
     * PreferredAvailabilityZones.member.3=us-west-2c
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredCacheClusterAZs A list of EC2 availability zones in which the replication group's
     *         cache clusters will be created. The order of the availability zones in
     *         the list is not important. <note>If you are creating your replication
     *         group in an Amazon VPC (recommended), you can only locate cache
     *         clusters in availability zones associated with the subnets in the
     *         selected subnet group. <p>The number of availability zones listed must
     *         equal the value of <i>NumCacheClusters</i>.</note> <p>Default: system
     *         chosen availability zones. <p>Example: One Redis cache cluster in each
     *         of three availability zones.
     *         PreferredAvailabilityZones.member.1=us-west-2a
     *         PreferredAvailabilityZones.member.2=us-west-2c
     *         PreferredAvailabilityZones.member.3=us-west-2c
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withPreferredCacheClusterAZs(java.util.Collection<String> preferredCacheClusterAZs) {
        if (preferredCacheClusterAZs == null) {
            this.preferredCacheClusterAZs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> preferredCacheClusterAZsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(preferredCacheClusterAZs.size());
            preferredCacheClusterAZsCopy.addAll(preferredCacheClusterAZs);
            this.preferredCacheClusterAZs = preferredCacheClusterAZsCopy;
        }

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
    public CreateReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The name of the cache engine to be used for the cache clusters in this
     * replication group. <p>Default: redis
     *
     * @return The name of the cache engine to be used for the cache clusters in this
     *         replication group. <p>Default: redis
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the cache engine to be used for the cache clusters in this
     * replication group. <p>Default: redis
     *
     * @param engine The name of the cache engine to be used for the cache clusters in this
     *         replication group. <p>Default: redis
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the cache engine to be used for the cache clusters in this
     * replication group. <p>Default: redis
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the cache engine to be used for the cache clusters in this
     *         replication group. <p>Default: redis
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version number of the cache engine to be used for the cache
     * clusters in this replication group. To view the supported cache engine
     * versions, use the <i>DescribeCacheEngineVersions</i> action.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     *
     * @return The version number of the cache engine to be used for the cache
     *         clusters in this replication group. To view the supported cache engine
     *         versions, use the <i>DescribeCacheEngineVersions</i> action.
     *         <p><b>Important:</b> You can upgrade to a newer engine version (see <a
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
     * The version number of the cache engine to be used for the cache
     * clusters in this replication group. To view the supported cache engine
     * versions, use the <i>DescribeCacheEngineVersions</i> action.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     *
     * @param engineVersion The version number of the cache engine to be used for the cache
     *         clusters in this replication group. To view the supported cache engine
     *         versions, use the <i>DescribeCacheEngineVersions</i> action.
     *         <p><b>Important:</b> You can upgrade to a newer engine version (see <a
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
     * The version number of the cache engine to be used for the cache
     * clusters in this replication group. To view the supported cache engine
     * versions, use the <i>DescribeCacheEngineVersions</i> action.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster or replication group and
     * create it anew with the earlier engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the cache engine to be used for the cache
     *         clusters in this replication group. To view the supported cache engine
     *         versions, use the <i>DescribeCacheEngineVersions</i> action.
     *         <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster or replication group and
     *         create it anew with the earlier engine version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The name of the parameter group to associate with this replication
     * group. If this argument is omitted, the default cache parameter group
     * for the specified engine is used.
     *
     * @return The name of the parameter group to associate with this replication
     *         group. If this argument is omitted, the default cache parameter group
     *         for the specified engine is used.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the parameter group to associate with this replication
     * group. If this argument is omitted, the default cache parameter group
     * for the specified engine is used.
     *
     * @param cacheParameterGroupName The name of the parameter group to associate with this replication
     *         group. If this argument is omitted, the default cache parameter group
     *         for the specified engine is used.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the parameter group to associate with this replication
     * group. If this argument is omitted, the default cache parameter group
     * for the specified engine is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the parameter group to associate with this replication
     *         group. If this argument is omitted, the default cache parameter group
     *         for the specified engine is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The name of the cache subnet group to be used for the replication
     * group.
     *
     * @return The name of the cache subnet group to be used for the replication
     *         group.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group to be used for the replication
     * group.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group to be used for the replication
     *         group.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group to be used for the replication
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group to be used for the replication
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * A list of cache security group names to associate with this
     * replication group.
     *
     * @return A list of cache security group names to associate with this
     *         replication group.
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
              cacheSecurityGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheSecurityGroupNames.setAutoConstruct(true);
        }
        return cacheSecurityGroupNames;
    }
    
    /**
     * A list of cache security group names to associate with this
     * replication group.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     *         replication group.
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
     * A list of cache security group names to associate with this
     * replication group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     *         replication group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
        if (getCacheSecurityGroupNames() == null) setCacheSecurityGroupNames(new java.util.ArrayList<String>(cacheSecurityGroupNames.length));
        for (String value : cacheSecurityGroupNames) {
            getCacheSecurityGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache security group names to associate with this
     * replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     *         replication group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
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
     * One or more Amazon VPC security groups associated with this
     * replication group. <p>Use this parameter only when you are creating a
     * replication group in an Amazon Virtual Private Cloud (VPC).
     *
     * @return One or more Amazon VPC security groups associated with this
     *         replication group. <p>Use this parameter only when you are creating a
     *         replication group in an Amazon Virtual Private Cloud (VPC).
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * One or more Amazon VPC security groups associated with this
     * replication group. <p>Use this parameter only when you are creating a
     * replication group in an Amazon Virtual Private Cloud (VPC).
     *
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     *         replication group. <p>Use this parameter only when you are creating a
     *         replication group in an Amazon Virtual Private Cloud (VPC).
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
     * One or more Amazon VPC security groups associated with this
     * replication group. <p>Use this parameter only when you are creating a
     * replication group in an Amazon Virtual Private Cloud (VPC).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     *         replication group. <p>Use this parameter only when you are creating a
     *         replication group in an Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Amazon VPC security groups associated with this
     * replication group. <p>Use this parameter only when you are creating a
     * replication group in an Amazon Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     *         replication group. <p>Use this parameter only when you are creating a
     *         replication group in an Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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
    public CreateReplicationGroupRequest withTags(Tag... tags) {
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
    public CreateReplicationGroupRequest withTags(java.util.Collection<Tag> tags) {
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
    public CreateReplicationGroupRequest withSnapshotArns(String... snapshotArns) {
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
    public CreateReplicationGroupRequest withSnapshotArns(java.util.Collection<String> snapshotArns) {
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
    public CreateReplicationGroupRequest withSnapshotName(String snapshotName) {
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
    public CreateReplicationGroupRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The port number on which each member of the replication group will
     * accept connections.
     *
     * @return The port number on which each member of the replication group will
     *         accept connections.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which each member of the replication group will
     * accept connections.
     *
     * @param port The port number on which each member of the replication group will
     *         accept connections.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which each member of the replication group will
     * accept connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which each member of the replication group will
     *         accept connections.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReplicationGroupRequest withPort(Integer port) {
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
    public CreateReplicationGroupRequest withNotificationTopicArn(String notificationTopicArn) {
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
    public CreateReplicationGroupRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
    public CreateReplicationGroupRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
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
    public CreateReplicationGroupRequest withSnapshotWindow(String snapshotWindow) {
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
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupDescription() != null) sb.append("ReplicationGroupDescription: " + getReplicationGroupDescription() + ",");
        if (getPrimaryClusterId() != null) sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (isAutomaticFailoverEnabled() != null) sb.append("AutomaticFailoverEnabled: " + isAutomaticFailoverEnabled() + ",");
        if (getNumCacheClusters() != null) sb.append("NumCacheClusters: " + getNumCacheClusters() + ",");
        if (getPreferredCacheClusterAZs() != null) sb.append("PreferredCacheClusterAZs: " + getPreferredCacheClusterAZs() + ",");
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
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupDescription() == null) ? 0 : getReplicationGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode()); 
        hashCode = prime * hashCode + ((isAutomaticFailoverEnabled() == null) ? 0 : isAutomaticFailoverEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getNumCacheClusters() == null) ? 0 : getNumCacheClusters().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredCacheClusterAZs() == null) ? 0 : getPreferredCacheClusterAZs().hashCode()); 
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

        if (obj instanceof CreateReplicationGroupRequest == false) return false;
        CreateReplicationGroupRequest other = (CreateReplicationGroupRequest)obj;
        
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        if (other.getReplicationGroupDescription() == null ^ this.getReplicationGroupDescription() == null) return false;
        if (other.getReplicationGroupDescription() != null && other.getReplicationGroupDescription().equals(this.getReplicationGroupDescription()) == false) return false; 
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null) return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false) return false; 
        if (other.isAutomaticFailoverEnabled() == null ^ this.isAutomaticFailoverEnabled() == null) return false;
        if (other.isAutomaticFailoverEnabled() != null && other.isAutomaticFailoverEnabled().equals(this.isAutomaticFailoverEnabled()) == false) return false; 
        if (other.getNumCacheClusters() == null ^ this.getNumCacheClusters() == null) return false;
        if (other.getNumCacheClusters() != null && other.getNumCacheClusters().equals(this.getNumCacheClusters()) == false) return false; 
        if (other.getPreferredCacheClusterAZs() == null ^ this.getPreferredCacheClusterAZs() == null) return false;
        if (other.getPreferredCacheClusterAZs() != null && other.getPreferredCacheClusterAZs().equals(this.getPreferredCacheClusterAZs()) == false) return false; 
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
    public CreateReplicationGroupRequest clone() {
        
            return (CreateReplicationGroupRequest) super.clone();
    }

}
    