/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>CreateReplicationGroup</i> action.
 * </p>
 */
public class CreateReplicationGroupRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String replicationGroupId;
    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     */
    private String replicationGroupDescription;
    /**
     * <p>
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have a
     * status of <i>available</i>.
     * </p>
     * <p>
     * This parameter is not required if <i>NumCacheClusters</i> is specified.
     * </p>
     */
    private String primaryClusterId;
    /**
     * <p>
     * Specifies whether a read-only replica will be automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * If <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups is not supported on:
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
    private Boolean automaticFailoverEnabled;
    /**
     * <p>
     * The number of cache clusters this replication group will initially have.
     * </p>
     * <p>
     * If <i>Multi-AZ</i> is <code>enabled</code>, the value of this parameter
     * must be at least 2.
     * </p>
     * <p>
     * The maximum permitted value for <i>NumCacheClusters</i> is 6 (primary
     * plus 5 replicas). If you need to exceed this limit, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     * >http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     * </p>
     */
    private Integer numCacheClusters;
    /**
     * <p>
     * A list of EC2 availability zones in which the replication group's cache
     * clusters will be created. The order of the availability zones in the list
     * is not important.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate cache clusters in availability zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of availability zones listed must equal the value of
     * <i>NumCacheClusters</i>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen availability zones.
     * </p>
     * <p>
     * Example: One Redis cache cluster in each of three availability zones.
     * </p>
     * <p>
     * <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> preferredCacheClusterAZs;
    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group.
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
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
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
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The name of the cache engine to be used for the cache clusters in this
     * replication group.
     * </p>
     * <p>
     * Default: redis
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the cache engine to be used for the cache clusters
     * in this replication group. To view the supported cache engine versions,
     * use the <i>DescribeCacheEngineVersions</i> action.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing cache
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNames;
    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (VPC).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3.
     * The snapshot file will be used to populate the node group. The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotArns;
    /**
     * <p>
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     */
    private String snapshotName;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The port number on which each member of the replication group will accept
     * connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cache cluster owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;
    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of your node group.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     */
    private String snapshotWindow;

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationGroupId
     *        The replication group identifier. This parameter is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 20 alphanumeric characters or
     *        hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive
     *        hyphens.
     *        </p>
     *        </li>
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The replication group identifier. This parameter is stored as a
     *         lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A name must contain from 1 to 20 alphanumeric characters or
     *         hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A name cannot end with a hyphen or contain two consecutive
     *         hyphens.
     *         </p>
     *         </li>
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The replication group identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationGroupId
     *        The replication group identifier. This parameter is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 20 alphanumeric characters or
     *        hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive
     *        hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withReplicationGroupId(
            String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A user-created description for the replication group.
     */

    public void setReplicationGroupDescription(
            String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     * 
     * @return A user-created description for the replication group.
     */

    public String getReplicationGroupDescription() {
        return this.replicationGroupDescription;
    }

    /**
     * <p>
     * A user-created description for the replication group.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A user-created description for the replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withReplicationGroupDescription(
            String replicationGroupDescription) {
        setReplicationGroupDescription(replicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have a
     * status of <i>available</i>.
     * </p>
     * <p>
     * This parameter is not required if <i>NumCacheClusters</i> is specified.
     * </p>
     * 
     * @param primaryClusterId
     *        The identifier of the cache cluster that will serve as the primary
     *        for this replication group. This cache cluster must already exist
     *        and have a status of <i>available</i>.</p>
     *        <p>
     *        This parameter is not required if <i>NumCacheClusters</i> is
     *        specified.
     */

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have a
     * status of <i>available</i>.
     * </p>
     * <p>
     * This parameter is not required if <i>NumCacheClusters</i> is specified.
     * </p>
     * 
     * @return The identifier of the cache cluster that will serve as the
     *         primary for this replication group. This cache cluster must
     *         already exist and have a status of <i>available</i>.</p>
     *         <p>
     *         This parameter is not required if <i>NumCacheClusters</i> is
     *         specified.
     */

    public String getPrimaryClusterId() {
        return this.primaryClusterId;
    }

    /**
     * <p>
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have a
     * status of <i>available</i>.
     * </p>
     * <p>
     * This parameter is not required if <i>NumCacheClusters</i> is specified.
     * </p>
     * 
     * @param primaryClusterId
     *        The identifier of the cache cluster that will serve as the primary
     *        for this replication group. This cache cluster must already exist
     *        and have a status of <i>available</i>.</p>
     *        <p>
     *        This parameter is not required if <i>NumCacheClusters</i> is
     *        specified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withPrimaryClusterId(
            String primaryClusterId) {
        setPrimaryClusterId(primaryClusterId);
        return this;
    }

    /**
     * <p>
     * Specifies whether a read-only replica will be automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * If <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups is not supported on:
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
     * @param automaticFailoverEnabled
     *        Specifies whether a read-only replica will be automatically
     *        promoted to read/write primary if the existing primary fails.</p>
     *        <p>
     *        If <code>true</code>, Multi-AZ is enabled for this replication
     *        group. If <code>false</code>, Multi-AZ is disabled for this
     *        replication group.
     *        </p>
     *        <p>
     *        Default: false
     *        </p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups is not supported on:
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
     */

    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    /**
     * <p>
     * Specifies whether a read-only replica will be automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * If <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups is not supported on:
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
     * @return Specifies whether a read-only replica will be automatically
     *         promoted to read/write primary if the existing primary fails.</p>
     *         <p>
     *         If <code>true</code>, Multi-AZ is enabled for this replication
     *         group. If <code>false</code>, Multi-AZ is disabled for this
     *         replication group.
     *         </p>
     *         <p>
     *         Default: false
     *         </p>
     *         <note>
     *         <p>
     *         ElastiCache Multi-AZ replication groups is not supported on:
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
     */

    public Boolean getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * Specifies whether a read-only replica will be automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * If <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups is not supported on:
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
     * @param automaticFailoverEnabled
     *        Specifies whether a read-only replica will be automatically
     *        promoted to read/write primary if the existing primary fails.</p>
     *        <p>
     *        If <code>true</code>, Multi-AZ is enabled for this replication
     *        group. If <code>false</code>, Multi-AZ is disabled for this
     *        replication group.
     *        </p>
     *        <p>
     *        Default: false
     *        </p>
     *        <note>
     *        <p>
     *        ElastiCache Multi-AZ replication groups is not supported on:
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
     */

    public CreateReplicationGroupRequest withAutomaticFailoverEnabled(
            Boolean automaticFailoverEnabled) {
        setAutomaticFailoverEnabled(automaticFailoverEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether a read-only replica will be automatically promoted to
     * read/write primary if the existing primary fails.
     * </p>
     * <p>
     * If <code>true</code>, Multi-AZ is enabled for this replication group. If
     * <code>false</code>, Multi-AZ is disabled for this replication group.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <note>
     * <p>
     * ElastiCache Multi-AZ replication groups is not supported on:
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
     * @return Specifies whether a read-only replica will be automatically
     *         promoted to read/write primary if the existing primary fails.</p>
     *         <p>
     *         If <code>true</code>, Multi-AZ is enabled for this replication
     *         group. If <code>false</code>, Multi-AZ is disabled for this
     *         replication group.
     *         </p>
     *         <p>
     *         Default: false
     *         </p>
     *         <note>
     *         <p>
     *         ElastiCache Multi-AZ replication groups is not supported on:
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
     */

    public Boolean isAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * The number of cache clusters this replication group will initially have.
     * </p>
     * <p>
     * If <i>Multi-AZ</i> is <code>enabled</code>, the value of this parameter
     * must be at least 2.
     * </p>
     * <p>
     * The maximum permitted value for <i>NumCacheClusters</i> is 6 (primary
     * plus 5 replicas). If you need to exceed this limit, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     * >http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     * </p>
     * 
     * @param numCacheClusters
     *        The number of cache clusters this replication group will initially
     *        have.</p>
     *        <p>
     *        If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     *        parameter must be at least 2.
     *        </p>
     *        <p>
     *        The maximum permitted value for <i>NumCacheClusters</i> is 6
     *        (primary plus 5 replicas). If you need to exceed this limit,
     *        please fill out the ElastiCache Limit Increase Request form at <a
     *        href=
     *        "http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     *        >http
     *        ://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     */

    public void setNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
    }

    /**
     * <p>
     * The number of cache clusters this replication group will initially have.
     * </p>
     * <p>
     * If <i>Multi-AZ</i> is <code>enabled</code>, the value of this parameter
     * must be at least 2.
     * </p>
     * <p>
     * The maximum permitted value for <i>NumCacheClusters</i> is 6 (primary
     * plus 5 replicas). If you need to exceed this limit, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     * >http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     * </p>
     * 
     * @return The number of cache clusters this replication group will
     *         initially have.</p>
     *         <p>
     *         If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     *         parameter must be at least 2.
     *         </p>
     *         <p>
     *         The maximum permitted value for <i>NumCacheClusters</i> is 6
     *         (primary plus 5 replicas). If you need to exceed this limit,
     *         please fill out the ElastiCache Limit Increase Request form at <a
     *         href=
     *         "http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     *         >http://aws.amazon.com/contact-us/elasticache-node-limit-request<
     *         /a>.
     */

    public Integer getNumCacheClusters() {
        return this.numCacheClusters;
    }

    /**
     * <p>
     * The number of cache clusters this replication group will initially have.
     * </p>
     * <p>
     * If <i>Multi-AZ</i> is <code>enabled</code>, the value of this parameter
     * must be at least 2.
     * </p>
     * <p>
     * The maximum permitted value for <i>NumCacheClusters</i> is 6 (primary
     * plus 5 replicas). If you need to exceed this limit, please fill out the
     * ElastiCache Limit Increase Request form at <a
     * href="http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     * >http://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     * </p>
     * 
     * @param numCacheClusters
     *        The number of cache clusters this replication group will initially
     *        have.</p>
     *        <p>
     *        If <i>Multi-AZ</i> is <code>enabled</code>, the value of this
     *        parameter must be at least 2.
     *        </p>
     *        <p>
     *        The maximum permitted value for <i>NumCacheClusters</i> is 6
     *        (primary plus 5 replicas). If you need to exceed this limit,
     *        please fill out the ElastiCache Limit Increase Request form at <a
     *        href=
     *        "http://aws.amazon.com/contact-us/elasticache-node-limit-request"
     *        >http
     *        ://aws.amazon.com/contact-us/elasticache-node-limit-request</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withNumCacheClusters(
            Integer numCacheClusters) {
        setNumCacheClusters(numCacheClusters);
        return this;
    }

    /**
     * <p>
     * A list of EC2 availability zones in which the replication group's cache
     * clusters will be created. The order of the availability zones in the list
     * is not important.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate cache clusters in availability zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of availability zones listed must equal the value of
     * <i>NumCacheClusters</i>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen availability zones.
     * </p>
     * <p>
     * Example: One Redis cache cluster in each of three availability zones.
     * </p>
     * <p>
     * <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * </p>
     * 
     * @return A list of EC2 availability zones in which the replication group's
     *         cache clusters will be created. The order of the availability
     *         zones in the list is not important.</p> <note>
     *         <p>
     *         If you are creating your replication group in an Amazon VPC
     *         (recommended), you can only locate cache clusters in availability
     *         zones associated with the subnets in the selected subnet group.
     *         </p>
     *         <p>
     *         The number of availability zones listed must equal the value of
     *         <i>NumCacheClusters</i>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: system chosen availability zones.
     *         </p>
     *         <p>
     *         Example: One Redis cache cluster in each of three availability
     *         zones.
     *         </p>
     *         <p>
     *         <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     */

    public java.util.List<String> getPreferredCacheClusterAZs() {
        if (preferredCacheClusterAZs == null) {
            preferredCacheClusterAZs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return preferredCacheClusterAZs;
    }

    /**
     * <p>
     * A list of EC2 availability zones in which the replication group's cache
     * clusters will be created. The order of the availability zones in the list
     * is not important.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate cache clusters in availability zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of availability zones listed must equal the value of
     * <i>NumCacheClusters</i>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen availability zones.
     * </p>
     * <p>
     * Example: One Redis cache cluster in each of three availability zones.
     * </p>
     * <p>
     * <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * </p>
     * 
     * @param preferredCacheClusterAZs
     *        A list of EC2 availability zones in which the replication group's
     *        cache clusters will be created. The order of the availability
     *        zones in the list is not important.</p> <note>
     *        <p>
     *        If you are creating your replication group in an Amazon VPC
     *        (recommended), you can only locate cache clusters in availability
     *        zones associated with the subnets in the selected subnet group.
     *        </p>
     *        <p>
     *        The number of availability zones listed must equal the value of
     *        <i>NumCacheClusters</i>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: system chosen availability zones.
     *        </p>
     *        <p>
     *        Example: One Redis cache cluster in each of three availability
     *        zones.
     *        </p>
     *        <p>
     *        <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     */

    public void setPreferredCacheClusterAZs(
            java.util.Collection<String> preferredCacheClusterAZs) {
        if (preferredCacheClusterAZs == null) {
            this.preferredCacheClusterAZs = null;
            return;
        }

        this.preferredCacheClusterAZs = new com.amazonaws.internal.SdkInternalList<String>(
                preferredCacheClusterAZs);
    }

    /**
     * <p>
     * A list of EC2 availability zones in which the replication group's cache
     * clusters will be created. The order of the availability zones in the list
     * is not important.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate cache clusters in availability zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of availability zones listed must equal the value of
     * <i>NumCacheClusters</i>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen availability zones.
     * </p>
     * <p>
     * Example: One Redis cache cluster in each of three availability zones.
     * </p>
     * <p>
     * <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPreferredCacheClusterAZs(java.util.Collection)} or
     * {@link #withPreferredCacheClusterAZs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param preferredCacheClusterAZs
     *        A list of EC2 availability zones in which the replication group's
     *        cache clusters will be created. The order of the availability
     *        zones in the list is not important.</p> <note>
     *        <p>
     *        If you are creating your replication group in an Amazon VPC
     *        (recommended), you can only locate cache clusters in availability
     *        zones associated with the subnets in the selected subnet group.
     *        </p>
     *        <p>
     *        The number of availability zones listed must equal the value of
     *        <i>NumCacheClusters</i>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: system chosen availability zones.
     *        </p>
     *        <p>
     *        Example: One Redis cache cluster in each of three availability
     *        zones.
     *        </p>
     *        <p>
     *        <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withPreferredCacheClusterAZs(
            String... preferredCacheClusterAZs) {
        if (this.preferredCacheClusterAZs == null) {
            setPreferredCacheClusterAZs(new com.amazonaws.internal.SdkInternalList<String>(
                    preferredCacheClusterAZs.length));
        }
        for (String ele : preferredCacheClusterAZs) {
            this.preferredCacheClusterAZs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 availability zones in which the replication group's cache
     * clusters will be created. The order of the availability zones in the list
     * is not important.
     * </p>
     * <note>
     * <p>
     * If you are creating your replication group in an Amazon VPC
     * (recommended), you can only locate cache clusters in availability zones
     * associated with the subnets in the selected subnet group.
     * </p>
     * <p>
     * The number of availability zones listed must equal the value of
     * <i>NumCacheClusters</i>.
     * </p>
     * </note>
     * <p>
     * Default: system chosen availability zones.
     * </p>
     * <p>
     * Example: One Redis cache cluster in each of three availability zones.
     * </p>
     * <p>
     * <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * </p>
     * 
     * @param preferredCacheClusterAZs
     *        A list of EC2 availability zones in which the replication group's
     *        cache clusters will be created. The order of the availability
     *        zones in the list is not important.</p> <note>
     *        <p>
     *        If you are creating your replication group in an Amazon VPC
     *        (recommended), you can only locate cache clusters in availability
     *        zones associated with the subnets in the selected subnet group.
     *        </p>
     *        <p>
     *        The number of availability zones listed must equal the value of
     *        <i>NumCacheClusters</i>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: system chosen availability zones.
     *        </p>
     *        <p>
     *        Example: One Redis cache cluster in each of three availability
     *        zones.
     *        </p>
     *        <p>
     *        <code>PreferredAvailabilityZones.member.1=us-west-2a PreferredAvailabilityZones.member.2=us-west-2c PreferredAvailabilityZones.member.3=us-west-2c</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withPreferredCacheClusterAZs(
            java.util.Collection<String> preferredCacheClusterAZs) {
        setPreferredCacheClusterAZs(preferredCacheClusterAZs);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group.
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
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
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
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The compute and memory capacity of the nodes in the node
     *        group.</p>
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
     *        Current generation: <code>cache.t2.micro</code>,
     *        <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *        <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>,
     *        <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
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
     *        Current generation: <code>cache.r3.large</code>,
     *        <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *        <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>,
     *        <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     *        All t2 instances are created in an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis backup/restore is not supported for t2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for
     *        t1 or t2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of cache node types and specifications, see
     *        <a href="http://aws.amazon.com/elasticache/details">Amazon
     *        ElastiCache Product Features and Details</a> and <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group.
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
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
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
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @return The compute and memory capacity of the nodes in the node
     *         group.</p>
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
     *         Current generation: <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *         <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.t1.micro</code>,
     *         <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
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
     *         Current generation: <code>cache.r3.large</code>,
     *         <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *         <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.m2.xlarge</code>,
     *         <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     *         All t2 instances are created in an Amazon Virtual Private Cloud
     *         (VPC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis backup/restore is not supported for t2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Append-only files (AOF) functionality is not supported for
     *         t1 or t2 instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a complete listing of cache node types and specifications,
     *         see <a href="http://aws.amazon.com/elasticache/details">Amazon
     *         ElastiCache Product Features and Details</a> and <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Memcached</a> or <a
     *         href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the node group.
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
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
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
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The compute and memory capacity of the nodes in the node
     *        group.</p>
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
     *        Current generation: <code>cache.t2.micro</code>,
     *        <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *        <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>,
     *        <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
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
     *        Current generation: <code>cache.r3.large</code>,
     *        <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *        <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>,
     *        <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
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
     *        All t2 instances are created in an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis backup/restore is not supported for t2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for
     *        t1 or t2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of cache node types and specifications, see
     *        <a href="http://aws.amazon.com/elasticache/details">Amazon
     *        ElastiCache Product Features and Details</a> and <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The name of the cache engine to be used for the cache clusters in this
     * replication group.
     * </p>
     * <p>
     * Default: redis
     * </p>
     * 
     * @param engine
     *        The name of the cache engine to be used for the cache clusters in
     *        this replication group.</p>
     *        <p>
     *        Default: redis
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for the cache clusters in this
     * replication group.
     * </p>
     * <p>
     * Default: redis
     * </p>
     * 
     * @return The name of the cache engine to be used for the cache clusters in
     *         this replication group.</p>
     *         <p>
     *         Default: redis
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for the cache clusters in this
     * replication group.
     * </p>
     * <p>
     * Default: redis
     * </p>
     * 
     * @param engine
     *        The name of the cache engine to be used for the cache clusters in
     *        this replication group.</p>
     *        <p>
     *        Default: redis
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for the cache clusters
     * in this replication group. To view the supported cache engine versions,
     * use the <i>DescribeCacheEngineVersions</i> action.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing cache
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the cache engine to be used for the cache
     *        clusters in this replication group. To view the supported cache
     *        engine versions, use the <i>DescribeCacheEngineVersions</i>
     *        action.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache
     *        User Guide</i>, but you cannot downgrade to an earlier engine
     *        version. If you want to use an earlier engine version, you must
     *        delete the existing cache cluster or replication group and create
     *        it anew with the earlier engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for the cache clusters
     * in this replication group. To view the supported cache engine versions,
     * use the <i>DescribeCacheEngineVersions</i> action.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing cache
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     * 
     * @return The version number of the cache engine to be used for the cache
     *         clusters in this replication group. To view the supported cache
     *         engine versions, use the <i>DescribeCacheEngineVersions</i>
     *         action.</p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache
     *         User Guide</i>, but you cannot downgrade to an earlier engine
     *         version. If you want to use an earlier engine version, you must
     *         delete the existing cache cluster or replication group and create
     *         it anew with the earlier engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine to be used for the cache clusters
     * in this replication group. To view the supported cache engine versions,
     * use the <i>DescribeCacheEngineVersions</i> action.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     * >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache User
     * Guide</i>, but you cannot downgrade to an earlier engine version. If you
     * want to use an earlier engine version, you must delete the existing cache
     * cluster or replication group and create it anew with the earlier engine
     * version.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the cache engine to be used for the cache
     *        clusters in this replication group. To view the supported cache
     *        engine versions, use the <i>DescribeCacheEngineVersions</i>
     *        action.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see
     *        <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>) in the <i>ElastiCache
     *        User Guide</i>, but you cannot downgrade to an earlier engine
     *        version. If you want to use an earlier engine version, you must
     *        delete the existing cache cluster or replication group and create
     *        it anew with the earlier engine version.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the parameter group to associate with this replication
     *        group. If this argument is omitted, the default cache parameter
     *        group for the specified engine is used.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * 
     * @return The name of the parameter group to associate with this
     *         replication group. If this argument is omitted, the default cache
     *         parameter group for the specified engine is used.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to associate with this replication group.
     * If this argument is omitted, the default cache parameter group for the
     * specified engine is used.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the parameter group to associate with this replication
     *        group. If this argument is omitted, the default cache parameter
     *        group for the specified engine is used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withCacheParameterGroupName(
            String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group to be used for the replication
     *        group.
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * 
     * @return The name of the cache subnet group to be used for the replication
     *         group.
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group to be used for the replication group.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group to be used for the replication
     *        group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withCacheSubnetGroupName(
            String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     * 
     * @return A list of cache security group names to associate with this
     *         replication group.
     */

    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
            cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to associate with this
     *        replication group.
     */

    public void setCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }

        this.cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>(
                cacheSecurityGroupNames);
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to associate with this
     *        replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withCacheSecurityGroupNames(
            String... cacheSecurityGroupNames) {
        if (this.cacheSecurityGroupNames == null) {
            setCacheSecurityGroupNames(new com.amazonaws.internal.SdkInternalList<String>(
                    cacheSecurityGroupNames.length));
        }
        for (String ele : cacheSecurityGroupNames) {
            this.cacheSecurityGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to associate with this replication
     * group.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to associate with this
     *        replication group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withCacheSecurityGroupNames(
            java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (VPC).
     * </p>
     * 
     * @return One or more Amazon VPC security groups associated with this
     *         replication group.</p>
     *         <p>
     *         Use this parameter only when you are creating a replication group
     *         in an Amazon Virtual Private Cloud (VPC).
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        One or more Amazon VPC security groups associated with this
     *        replication group.</p>
     *        <p>
     *        Use this parameter only when you are creating a replication group
     *        in an Amazon Virtual Private Cloud (VPC).
     */

    public void setSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(
                securityGroupIds);
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or
     * {@link #withSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more Amazon VPC security groups associated with this
     *        replication group.</p>
     *        <p>
     *        Use this parameter only when you are creating a replication group
     *        in an Amazon Virtual Private Cloud (VPC).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSecurityGroupIds(
            String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(
                    securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Amazon VPC security groups associated with this replication
     * group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a replication group in an
     * Amazon Virtual Private Cloud (VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        One or more Amazon VPC security groups associated with this
     *        replication group.</p>
     *        <p>
     *        Use this parameter only when you are creating a replication group
     *        in an Amazon Virtual Private Cloud (VPC).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     * 
     * @return A list of cost allocation tags to be added to this resource. A
     *         tag is a key-value pair. A tag key must be accompanied by a tag
     *         value.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     * 
     * @param tags
     *        A list of cost allocation tags to be added to this resource. A tag
     *        is a key-value pair. A tag key must be accompanied by a tag value.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of cost allocation tags to be added to this resource. A tag
     *        is a key-value pair. A tag key must be accompanied by a tag value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     * 
     * @param tags
     *        A list of cost allocation tags to be added to this resource. A tag
     *        is a key-value pair. A tag key must be accompanied by a tag value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3.
     * The snapshot file will be used to populate the node group. The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * 
     * @return A single-element string list containing an Amazon Resource Name
     *         (ARN) that uniquely identifies a Redis RDB snapshot file stored
     *         in Amazon S3. The snapshot file will be used to populate the node
     *         group. The Amazon S3 object name in the ARN cannot contain any
     *         commas.</p> <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter
     *         is <code>redis</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Example of an Amazon S3 ARN:
     *         <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */

    public java.util.List<String> getSnapshotArns() {
        if (snapshotArns == null) {
            snapshotArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotArns;
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3.
     * The snapshot file will be used to populate the node group. The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * 
     * @param snapshotArns
     *        A single-element string list containing an Amazon Resource Name
     *        (ARN) that uniquely identifies a Redis RDB snapshot file stored in
     *        Amazon S3. The snapshot file will be used to populate the node
     *        group. The Amazon S3 object name in the ARN cannot contain any
     *        commas.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Example of an Amazon S3 ARN:
     *        <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     */

    public void setSnapshotArns(java.util.Collection<String> snapshotArns) {
        if (snapshotArns == null) {
            this.snapshotArns = null;
            return;
        }

        this.snapshotArns = new com.amazonaws.internal.SdkInternalList<String>(
                snapshotArns);
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3.
     * The snapshot file will be used to populate the node group. The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSnapshotArns(java.util.Collection)} or
     * {@link #withSnapshotArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param snapshotArns
     *        A single-element string list containing an Amazon Resource Name
     *        (ARN) that uniquely identifies a Redis RDB snapshot file stored in
     *        Amazon S3. The snapshot file will be used to populate the node
     *        group. The Amazon S3 object name in the ARN cannot contain any
     *        commas.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Example of an Amazon S3 ARN:
     *        <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSnapshotArns(
            String... snapshotArns) {
        if (this.snapshotArns == null) {
            setSnapshotArns(new com.amazonaws.internal.SdkInternalList<String>(
                    snapshotArns.length));
        }
        for (String ele : snapshotArns) {
            this.snapshotArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3.
     * The snapshot file will be used to populate the node group. The Amazon S3
     * object name in the ARN cannot contain any commas.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Example of an Amazon S3 ARN:
     * <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * </p>
     * 
     * @param snapshotArns
     *        A single-element string list containing an Amazon Resource Name
     *        (ARN) that uniquely identifies a Redis RDB snapshot file stored in
     *        Amazon S3. The snapshot file will be used to populate the node
     *        group. The Amazon S3 object name in the ARN cannot contain any
     *        commas.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Example of an Amazon S3 ARN:
     *        <code>arn:aws:s3:::my_bucket/snapshot1.rdb</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSnapshotArns(
            java.util.Collection<String> snapshotArns) {
        setSnapshotArns(snapshotArns);
        return this;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotName
     *        The name of a snapshot from which to restore data into the new
     *        node group. The snapshot status changes to <code>restoring</code>
     *        while the new node group is being created.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * 
     * @return The name of a snapshot from which to restore data into the new
     *         node group. The snapshot status changes to <code>restoring</code>
     *         while the new node group is being created.</p> <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter
     *         is <code>redis</code>.
     *         </p>
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new node
     * group. The snapshot status changes to <code>restoring</code> while the
     * new node group is being created.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotName
     *        The name of a snapshot from which to restore data into the new
     *        node group. The snapshot status changes to <code>restoring</code>
     *        while the new node group is being created.</p> <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the
     *        cache cluster is performed. It is specified as a range in the
     *        format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *        maintenance window is a 60 minute period. Valid values for
     *        <code>ddd</code> are:</p>
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
     *        Example: <code>sun:05:00-sun:09:00</code>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * 
     * @return Specifies the weekly time range during which maintenance on the
     *         cache cluster is performed. It is specified as a range in the
     *         format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *         maintenance window is a 60 minute period. Valid values for
     *         <code>ddd</code> are:</p>
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
     *         Example: <code>sun:05:00-sun:09:00</code>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cache
     * cluster is performed. It is specified as a range in the format
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window
     * is a 60 minute period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the
     *        cache cluster is performed. It is specified as a range in the
     *        format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
     *        maintenance window is a 60 minute period. Valid values for
     *        <code>ddd</code> are:</p>
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
     *        Example: <code>sun:05:00-sun:09:00</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The port number on which each member of the replication group will accept
     * connections.
     * </p>
     * 
     * @param port
     *        The port number on which each member of the replication group will
     *        accept connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which each member of the replication group will accept
     * connections.
     * </p>
     * 
     * @return The port number on which each member of the replication group
     *         will accept connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which each member of the replication group will accept
     * connections.
     * </p>
     * 
     * @param port
     *        The port number on which each member of the replication group will
     *        accept connections.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cache cluster owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *        Service (SNS) topic to which notifications will be sent.</p>
     *        <note>
     *        <p>
     *        The Amazon SNS topic owner must be the same as the cache cluster
     *        owner.
     *        </p>
     */

    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cache cluster owner.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent.</p>
     *         <note>
     *         <p>
     *         The Amazon SNS topic owner must be the same as the cache cluster
     *         owner.
     *         </p>
     */

    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be the same as the cache cluster owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *        Service (SNS) topic to which notifications will be sent.</p>
     *        <note>
     *        <p>
     *        The Amazon SNS topic owner must be the same as the cache cluster
     *        owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withNotificationTopicArn(
            String notificationTopicArn) {
        setNotificationTopicArn(notificationTopicArn);
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
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
     * The number of days for which ElastiCache will retain automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache will retain automatic
     *        snapshots before deleting them. For example, if you set
     *        <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     *        taken today will be retained for 5 days before being deleted.</p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0 (i.e., automatic backups are disabled for this cache
     *        cluster).
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     * 
     * @return The number of days for which ElastiCache will retain automatic
     *         snapshots before deleting them. For example, if you set
     *         <code>SnapshotRetentionLimit</code> to 5, then a snapshot that
     *         was taken today will be retained for 5 days before being
     *         deleted.</p> <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter
     *         is <code>redis</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: 0 (i.e., automatic backups are disabled for this cache
     *         cluster).
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache will retain automatic snapshots
     * before deleting them. For example, if you set
     * <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * <p>
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache will retain automatic
     *        snapshots before deleting them. For example, if you set
     *        <code>SnapshotRetentionLimit</code> to 5, then a snapshot that was
     *        taken today will be retained for 5 days before being deleted.</p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: 0 (i.e., automatic backups are disabled for this cache
     *        cluster).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSnapshotRetentionLimit(
            Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of your node group.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache will begin
     *        taking a daily snapshot of your node group.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, then ElastiCache will
     *        automatically choose an appropriate time range.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of your node group.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * 
     * @return The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your node group.</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     *         <p>
     *         If you do not specify this parameter, then ElastiCache will
     *         automatically choose an appropriate time range.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is only valid if the <code>Engine</code> parameter
     *         is <code>redis</code>.
     *         </p>
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache will begin taking
     * a daily snapshot of your node group.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, then ElastiCache will automatically
     * choose an appropriate time range.
     * </p>
     * <note>
     * <p>
     * This parameter is only valid if the <code>Engine</code> parameter is
     * <code>redis</code>.
     * </p>
     * </note>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache will begin
     *        taking a daily snapshot of your node group.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, then ElastiCache will
     *        automatically choose an appropriate time range.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is only valid if the <code>Engine</code> parameter
     *        is <code>redis</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationGroupRequest withSnapshotWindow(
            String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
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
        if (getReplicationGroupDescription() != null)
            sb.append("ReplicationGroupDescription: "
                    + getReplicationGroupDescription() + ",");
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: "
                    + getAutomaticFailoverEnabled() + ",");
        if (getNumCacheClusters() != null)
            sb.append("NumCacheClusters: " + getNumCacheClusters() + ",");
        if (getPreferredCacheClusterAZs() != null)
            sb.append("PreferredCacheClusterAZs: "
                    + getPreferredCacheClusterAZs() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: "
                    + getCacheParameterGroupName() + ",");
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName()
                    + ",");
        if (getCacheSecurityGroupNames() != null)
            sb.append("CacheSecurityGroupNames: "
                    + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSnapshotArns() != null)
            sb.append("SnapshotArns: " + getSnapshotArns() + ",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: "
                    + getPreferredMaintenanceWindow() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: " + getNotificationTopicArn()
                    + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: "
                    + getAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit()
                    + ",");
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

        if (obj instanceof CreateReplicationGroupRequest == false)
            return false;
        CreateReplicationGroupRequest other = (CreateReplicationGroupRequest) obj;
        if (other.getReplicationGroupId() == null
                ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(
                        this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupDescription() == null
                ^ this.getReplicationGroupDescription() == null)
            return false;
        if (other.getReplicationGroupDescription() != null
                && other.getReplicationGroupDescription().equals(
                        this.getReplicationGroupDescription()) == false)
            return false;
        if (other.getPrimaryClusterId() == null
                ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null
                && other.getPrimaryClusterId().equals(
                        this.getPrimaryClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverEnabled() == null
                ^ this.getAutomaticFailoverEnabled() == null)
            return false;
        if (other.getAutomaticFailoverEnabled() != null
                && other.getAutomaticFailoverEnabled().equals(
                        this.getAutomaticFailoverEnabled()) == false)
            return false;
        if (other.getNumCacheClusters() == null
                ^ this.getNumCacheClusters() == null)
            return false;
        if (other.getNumCacheClusters() != null
                && other.getNumCacheClusters().equals(
                        this.getNumCacheClusters()) == false)
            return false;
        if (other.getPreferredCacheClusterAZs() == null
                ^ this.getPreferredCacheClusterAZs() == null)
            return false;
        if (other.getPreferredCacheClusterAZs() != null
                && other.getPreferredCacheClusterAZs().equals(
                        this.getPreferredCacheClusterAZs()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null
                && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null
                ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(
                        this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupName() == null
                ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null
                && other.getCacheSubnetGroupName().equals(
                        this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheSecurityGroupNames() == null
                ^ this.getCacheSecurityGroupNames() == null)
            return false;
        if (other.getCacheSecurityGroupNames() != null
                && other.getCacheSecurityGroupNames().equals(
                        this.getCacheSecurityGroupNames()) == false)
            return false;
        if (other.getSecurityGroupIds() == null
                ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(
                        this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSnapshotArns() == null ^ this.getSnapshotArns() == null)
            return false;
        if (other.getSnapshotArns() != null
                && other.getSnapshotArns().equals(this.getSnapshotArns()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null
                && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null
                && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getNotificationTopicArn() == null
                ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null
                && other.getNotificationTopicArn().equals(
                        this.getNotificationTopicArn()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null
                ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(
                        this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null
                ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null
                && other.getSnapshotRetentionLimit().equals(
                        this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null
                ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null
                && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
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
                + ((getReplicationGroupDescription() == null) ? 0
                        : getReplicationGroupDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailoverEnabled() == null) ? 0
                        : getAutomaticFailoverEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumCacheClusters() == null) ? 0 : getNumCacheClusters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredCacheClusterAZs() == null) ? 0
                        : getPreferredCacheClusterAZs().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0
                        : getCacheParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSubnetGroupName() == null) ? 0
                        : getCacheSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupNames() == null) ? 0
                        : getCacheSecurityGroupNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotArns() == null) ? 0 : getSnapshotArns()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotName() == null) ? 0 : getSnapshotName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0
                        : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode
                + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationTopicArn() == null) ? 0
                        : getNotificationTopicArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0
                        : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotRetentionLimit() == null) ? 0
                        : getSnapshotRetentionLimit().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationGroupRequest clone() {
        return (CreateReplicationGroupRequest) super.clone();
    }
}
