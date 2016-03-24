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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheCluster(ModifyCacheClusterRequest) ModifyCacheCluster operation}.
 * <p>
 * The <i>ModifyCacheCluster</i> action modifies the settings for a cache
 * cluster. You can use this action to change one or more cluster
 * configuration parameters by specifying the parameters and the new
 * values.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheCluster(ModifyCacheClusterRequest)
 */
public class ModifyCacheClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The cache cluster identifier. This value is stored as a lowercase
     * string.
     */
    private String cacheClusterId;

    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <code>NumCacheNodes</code> is greater than the sum of the
     * number of current cache nodes and the number of cache nodes pending
     * creation (which may be zero), then more nodes will be added. If the
     * value is less than the number of existing cache nodes, then nodes will
     * be removed. If the value is equal to the number of current cache
     * nodes, then any pending add or remove requests are canceled. <p>If you
     * are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove. <p>For clusters running Redis, this
     * value must be 1. For clusters running Memcached, this value must be
     * between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     * cache nodes can be applied immediately or as a pending action. See
     * <code>ApplyImmediately</code>.<br/> A pending action to modify the
     * number of cache nodes in a cluster during its maintenance window,
     * whether by adding or removing nodes in accordance with the scale out
     * architecture, is not queued. The customer's latest request to add or
     * remove nodes to the cluster overrides any previous pending actions to
     * modify the number of cache nodes in the cluster. For example, a
     * request to remove 2 nodes would override a previous pending action to
     * remove 3 nodes. Similarly, a request to add 2 nodes would override a
     * previous pending action to remove 3 nodes and vice versa. As Memcached
     * cache nodes may now be provisioned in different Availability Zones
     * with flexible cache node placement, a request to add nodes does not
     * automatically override a previous pending action to add nodes. The
     * customer can modify the previous pending action to add more nodes or
     * explicitly cancel the pending request and retry the new request. To
     * cancel pending actions to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     * the cache cluster.
     */
    private Integer numCacheNodes;

    /**
     * A list of cache node IDs to be removed. A node ID is a numeric
     * identifier (0001, 0002, etc.). This parameter is only valid when
     * <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     * The number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     * active cache nodes, 7 pending cache nodes, and the number of cache
     * nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     * 2 (7 - 5) cache node IDs to remove.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemove;

    /**
     * Specifies whether the new nodes in this Memcached cache cluster are
     * all created in a single Availability Zone or created across multiple
     * Availability Zones. <p>Valid values: <code>single-az</code> |
     * <code>cross-az</code>. <p>This option is only supported for Memcached
     * cache clusters. <note><p>You cannot specify <code>single-az</code> if
     * the Memcached cache cluster already has cache nodes in different
     * Availability Zones. If <code>cross-az</code> is specified, existing
     * Memcached nodes remain in their current Availability Zone. <p>Only
     * newly created nodes will be located in different Availability Zones.
     * For instructions on how to move existing Memcached nodes to different
     * Availability Zones, see the <b>Availability Zone Considerations</b>
     * section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     */
    private String aZMode;

    /**
     * The list of Availability Zones where the new Memcached cache nodes
     * will be created. <p>This parameter is only valid when
     * <i>NumCacheNodes</i> in the request is greater than the sum of the
     * number of active cache nodes and the number of cache nodes pending
     * creation (which may be zero). The number of Availability Zones
     * supplied in this list must match the cache nodes being added in this
     * request. <p>This option is only supported on Memcached clusters.
     * <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     * wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     * and optionally specify two Availability Zones for the two new
     * nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     * pending creation (from the scenario 1 call) and want to add 1 more
     * node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     * optionally specify an Availability Zone for the new node.
     * <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     * Specify <code>NumCacheNodes=3</code> to cancel all pending
     * actions.</li> </ul> <p>The Availability Zone placement of nodes
     * pending creation cannot be modified. If you wish to cancel any nodes
     * pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     * the number of current nodes. <p>If <code>cross-az</code> is specified,
     * existing Memcached nodes remain in their current Availability Zone.
     * Only newly created nodes can be located in different Availability
     * Zones. For guidance on how to move existing Memcached nodes to
     * different Availability Zones, see the <b>Availability Zone
     * Considerations</b> section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     * requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     * <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     * <li>Result: The new delete, pending or immediate, replaces the pending
     * delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     * Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     * pending or immediate, replaces the pending delete.</li> </ul></li>
     * <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     * Delete</li> <li>Result: The new delete, pending or immediate, replaces
     * the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     * Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     * create is added to the pending create. <b>Important:</b><br/>If the
     * new create request is <b>Apply Immediately - Yes</b>, all creates are
     * performed immediately.<br/> If the new create request is <b>Apply
     * Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     * <p>Example:
     * <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> newAvailabilityZones;

    /**
     * A list of cache security group names to authorize on this cache
     * cluster. This change is asynchronously applied as soon as possible.
     * <p>This parameter can be used only with clusters that are created
     * outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be
     * "Default".
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNames;

    /**
     * Specifies the VPC Security Groups associated with the cache cluster.
     * <p>This parameter can be used only with clusters that are created in
     * an Amazon Virtual Private Cloud (VPC).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

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
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the cache cluster owner. </note>
     */
    private String notificationTopicArn;

    /**
     * The name of the cache parameter group to apply to this cache cluster.
     * This change is asynchronously applied as soon as possible for
     * parameters when the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     */
    private String cacheParameterGroupName;

    /**
     * The status of the Amazon SNS notification topic. Notifications are
     * sent only if the status is <i>active</i>. <p>Valid values:
     * <code>active</code> | <code>inactive</code>
     */
    private String notificationTopicStatus;

    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     * <code>false</code>, then changes to the cache cluster are applied on
     * the next maintenance reboot, or the next failure reboot, whichever
     * occurs first. <important>If you perform a
     * <code>ModifyCacheCluster</code> before a pending modification is
     * applied, the pending modification is replaced by the newer
     * modification.</important> <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     */
    private Boolean applyImmediately;

    /**
     * The upgraded version of the cache engine to be run on the cache nodes.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster and create it anew with the
     * earlier engine version.
     */
    private String engineVersion;

    /**
     * This parameter is currently disabled.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * The number of days for which ElastiCache will retain automatic cache
     * cluster snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     */
    private Integer snapshotRetentionLimit;

    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your cache cluster.
     */
    private String snapshotWindow;

    /**
     * A valid cache node type that you want to scale this cache cluster to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     */
    private String cacheNodeType;

    /**
     * Default constructor for a new ModifyCacheClusterRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyCacheClusterRequest() {}
    
    /**
     * Constructs a new ModifyCacheClusterRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheClusterId The cache cluster identifier. This value is
     * stored as a lowercase string.
     */
    public ModifyCacheClusterRequest(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
    }

    /**
     * The cache cluster identifier. This value is stored as a lowercase
     * string.
     *
     * @return The cache cluster identifier. This value is stored as a lowercase
     *         string.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The cache cluster identifier. This value is stored as a lowercase
     * string.
     *
     * @param cacheClusterId The cache cluster identifier. This value is stored as a lowercase
     *         string.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The cache cluster identifier. This value is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The cache cluster identifier. This value is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <code>NumCacheNodes</code> is greater than the sum of the
     * number of current cache nodes and the number of cache nodes pending
     * creation (which may be zero), then more nodes will be added. If the
     * value is less than the number of existing cache nodes, then nodes will
     * be removed. If the value is equal to the number of current cache
     * nodes, then any pending add or remove requests are canceled. <p>If you
     * are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove. <p>For clusters running Redis, this
     * value must be 1. For clusters running Memcached, this value must be
     * between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     * cache nodes can be applied immediately or as a pending action. See
     * <code>ApplyImmediately</code>.<br/> A pending action to modify the
     * number of cache nodes in a cluster during its maintenance window,
     * whether by adding or removing nodes in accordance with the scale out
     * architecture, is not queued. The customer's latest request to add or
     * remove nodes to the cluster overrides any previous pending actions to
     * modify the number of cache nodes in the cluster. For example, a
     * request to remove 2 nodes would override a previous pending action to
     * remove 3 nodes. Similarly, a request to add 2 nodes would override a
     * previous pending action to remove 3 nodes and vice versa. As Memcached
     * cache nodes may now be provisioned in different Availability Zones
     * with flexible cache node placement, a request to add nodes does not
     * automatically override a previous pending action to add nodes. The
     * customer can modify the previous pending action to add more nodes or
     * explicitly cancel the pending request and retry the new request. To
     * cancel pending actions to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     * the cache cluster.
     *
     * @return The number of cache nodes that the cache cluster should have. If the
     *         value for <code>NumCacheNodes</code> is greater than the sum of the
     *         number of current cache nodes and the number of cache nodes pending
     *         creation (which may be zero), then more nodes will be added. If the
     *         value is less than the number of existing cache nodes, then nodes will
     *         be removed. If the value is equal to the number of current cache
     *         nodes, then any pending add or remove requests are canceled. <p>If you
     *         are removing cache nodes, you must use the
     *         <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     *         specific cache nodes to remove. <p>For clusters running Redis, this
     *         value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     *         cache nodes can be applied immediately or as a pending action. See
     *         <code>ApplyImmediately</code>.<br/> A pending action to modify the
     *         number of cache nodes in a cluster during its maintenance window,
     *         whether by adding or removing nodes in accordance with the scale out
     *         architecture, is not queued. The customer's latest request to add or
     *         remove nodes to the cluster overrides any previous pending actions to
     *         modify the number of cache nodes in the cluster. For example, a
     *         request to remove 2 nodes would override a previous pending action to
     *         remove 3 nodes. Similarly, a request to add 2 nodes would override a
     *         previous pending action to remove 3 nodes and vice versa. As Memcached
     *         cache nodes may now be provisioned in different Availability Zones
     *         with flexible cache node placement, a request to add nodes does not
     *         automatically override a previous pending action to add nodes. The
     *         customer can modify the previous pending action to add more nodes or
     *         explicitly cancel the pending request and retry the new request. To
     *         cancel pending actions to modify the number of cache nodes in a
     *         cluster, use the <code>ModifyCacheCluster</code> request and set
     *         <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     *         the cache cluster.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <code>NumCacheNodes</code> is greater than the sum of the
     * number of current cache nodes and the number of cache nodes pending
     * creation (which may be zero), then more nodes will be added. If the
     * value is less than the number of existing cache nodes, then nodes will
     * be removed. If the value is equal to the number of current cache
     * nodes, then any pending add or remove requests are canceled. <p>If you
     * are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove. <p>For clusters running Redis, this
     * value must be 1. For clusters running Memcached, this value must be
     * between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     * cache nodes can be applied immediately or as a pending action. See
     * <code>ApplyImmediately</code>.<br/> A pending action to modify the
     * number of cache nodes in a cluster during its maintenance window,
     * whether by adding or removing nodes in accordance with the scale out
     * architecture, is not queued. The customer's latest request to add or
     * remove nodes to the cluster overrides any previous pending actions to
     * modify the number of cache nodes in the cluster. For example, a
     * request to remove 2 nodes would override a previous pending action to
     * remove 3 nodes. Similarly, a request to add 2 nodes would override a
     * previous pending action to remove 3 nodes and vice versa. As Memcached
     * cache nodes may now be provisioned in different Availability Zones
     * with flexible cache node placement, a request to add nodes does not
     * automatically override a previous pending action to add nodes. The
     * customer can modify the previous pending action to add more nodes or
     * explicitly cancel the pending request and retry the new request. To
     * cancel pending actions to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     * the cache cluster.
     *
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. If the
     *         value for <code>NumCacheNodes</code> is greater than the sum of the
     *         number of current cache nodes and the number of cache nodes pending
     *         creation (which may be zero), then more nodes will be added. If the
     *         value is less than the number of existing cache nodes, then nodes will
     *         be removed. If the value is equal to the number of current cache
     *         nodes, then any pending add or remove requests are canceled. <p>If you
     *         are removing cache nodes, you must use the
     *         <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     *         specific cache nodes to remove. <p>For clusters running Redis, this
     *         value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     *         cache nodes can be applied immediately or as a pending action. See
     *         <code>ApplyImmediately</code>.<br/> A pending action to modify the
     *         number of cache nodes in a cluster during its maintenance window,
     *         whether by adding or removing nodes in accordance with the scale out
     *         architecture, is not queued. The customer's latest request to add or
     *         remove nodes to the cluster overrides any previous pending actions to
     *         modify the number of cache nodes in the cluster. For example, a
     *         request to remove 2 nodes would override a previous pending action to
     *         remove 3 nodes. Similarly, a request to add 2 nodes would override a
     *         previous pending action to remove 3 nodes and vice versa. As Memcached
     *         cache nodes may now be provisioned in different Availability Zones
     *         with flexible cache node placement, a request to add nodes does not
     *         automatically override a previous pending action to add nodes. The
     *         customer can modify the previous pending action to add more nodes or
     *         explicitly cancel the pending request and retry the new request. To
     *         cancel pending actions to modify the number of cache nodes in a
     *         cluster, use the <code>ModifyCacheCluster</code> request and set
     *         <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     *         the cache cluster.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <code>NumCacheNodes</code> is greater than the sum of the
     * number of current cache nodes and the number of cache nodes pending
     * creation (which may be zero), then more nodes will be added. If the
     * value is less than the number of existing cache nodes, then nodes will
     * be removed. If the value is equal to the number of current cache
     * nodes, then any pending add or remove requests are canceled. <p>If you
     * are removing cache nodes, you must use the
     * <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     * specific cache nodes to remove. <p>For clusters running Redis, this
     * value must be 1. For clusters running Memcached, this value must be
     * between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     * cache nodes can be applied immediately or as a pending action. See
     * <code>ApplyImmediately</code>.<br/> A pending action to modify the
     * number of cache nodes in a cluster during its maintenance window,
     * whether by adding or removing nodes in accordance with the scale out
     * architecture, is not queued. The customer's latest request to add or
     * remove nodes to the cluster overrides any previous pending actions to
     * modify the number of cache nodes in the cluster. For example, a
     * request to remove 2 nodes would override a previous pending action to
     * remove 3 nodes. Similarly, a request to add 2 nodes would override a
     * previous pending action to remove 3 nodes and vice versa. As Memcached
     * cache nodes may now be provisioned in different Availability Zones
     * with flexible cache node placement, a request to add nodes does not
     * automatically override a previous pending action to add nodes. The
     * customer can modify the previous pending action to add more nodes or
     * explicitly cancel the pending request and retry the new request. To
     * cancel pending actions to modify the number of cache nodes in a
     * cluster, use the <code>ModifyCacheCluster</code> request and set
     * <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     * the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. If the
     *         value for <code>NumCacheNodes</code> is greater than the sum of the
     *         number of current cache nodes and the number of cache nodes pending
     *         creation (which may be zero), then more nodes will be added. If the
     *         value is less than the number of existing cache nodes, then nodes will
     *         be removed. If the value is equal to the number of current cache
     *         nodes, then any pending add or remove requests are canceled. <p>If you
     *         are removing cache nodes, you must use the
     *         <code>CacheNodeIdsToRemove</code> parameter to provide the IDs of the
     *         specific cache nodes to remove. <p>For clusters running Redis, this
     *         value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20. <p><b>Note:</b><br/>Adding or removing Memcached
     *         cache nodes can be applied immediately or as a pending action. See
     *         <code>ApplyImmediately</code>.<br/> A pending action to modify the
     *         number of cache nodes in a cluster during its maintenance window,
     *         whether by adding or removing nodes in accordance with the scale out
     *         architecture, is not queued. The customer's latest request to add or
     *         remove nodes to the cluster overrides any previous pending actions to
     *         modify the number of cache nodes in the cluster. For example, a
     *         request to remove 2 nodes would override a previous pending action to
     *         remove 3 nodes. Similarly, a request to add 2 nodes would override a
     *         previous pending action to remove 3 nodes and vice versa. As Memcached
     *         cache nodes may now be provisioned in different Availability Zones
     *         with flexible cache node placement, a request to add nodes does not
     *         automatically override a previous pending action to add nodes. The
     *         customer can modify the previous pending action to add more nodes or
     *         explicitly cancel the pending request and retry the new request. To
     *         cancel pending actions to modify the number of cache nodes in a
     *         cluster, use the <code>ModifyCacheCluster</code> request and set
     *         <i>NumCacheNodes</i> equal to the number of cache nodes currently in
     *         the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * A list of cache node IDs to be removed. A node ID is a numeric
     * identifier (0001, 0002, etc.). This parameter is only valid when
     * <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     * The number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     * active cache nodes, 7 pending cache nodes, and the number of cache
     * nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     * 2 (7 - 5) cache node IDs to remove.
     *
     * @return A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     *         The number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         or pending cache nodes, whichever is greater, and the value of
     *         <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     *         active cache nodes, 7 pending cache nodes, and the number of cache
     *         nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     *         2 (7 - 5) cache node IDs to remove.
     */
    public java.util.List<String> getCacheNodeIdsToRemove() {
        if (cacheNodeIdsToRemove == null) {
              cacheNodeIdsToRemove = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheNodeIdsToRemove.setAutoConstruct(true);
        }
        return cacheNodeIdsToRemove;
    }
    
    /**
     * A list of cache node IDs to be removed. A node ID is a numeric
     * identifier (0001, 0002, etc.). This parameter is only valid when
     * <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     * The number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     * active cache nodes, 7 pending cache nodes, and the number of cache
     * nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     * 2 (7 - 5) cache node IDs to remove.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     *         The number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         or pending cache nodes, whichever is greater, and the value of
     *         <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     *         active cache nodes, 7 pending cache nodes, and the number of cache
     *         nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     *         2 (7 - 5) cache node IDs to remove.
     */
    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToRemove.size());
        cacheNodeIdsToRemoveCopy.addAll(cacheNodeIdsToRemove);
        this.cacheNodeIdsToRemove = cacheNodeIdsToRemoveCopy;
    }
    
    /**
     * A list of cache node IDs to be removed. A node ID is a numeric
     * identifier (0001, 0002, etc.). This parameter is only valid when
     * <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     * The number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     * active cache nodes, 7 pending cache nodes, and the number of cache
     * nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     * 2 (7 - 5) cache node IDs to remove.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheNodeIdsToRemove(java.util.Collection)} or
     * {@link #withCacheNodeIdsToRemove(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     *         The number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         or pending cache nodes, whichever is greater, and the value of
     *         <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     *         active cache nodes, 7 pending cache nodes, and the number of cache
     *         nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     *         2 (7 - 5) cache node IDs to remove.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheNodeIdsToRemove(String... cacheNodeIdsToRemove) {
        if (getCacheNodeIdsToRemove() == null) setCacheNodeIdsToRemove(new java.util.ArrayList<String>(cacheNodeIdsToRemove.length));
        for (String value : cacheNodeIdsToRemove) {
            getCacheNodeIdsToRemove().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache node IDs to be removed. A node ID is a numeric
     * identifier (0001, 0002, etc.). This parameter is only valid when
     * <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     * The number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * or pending cache nodes, whichever is greater, and the value of
     * <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     * active cache nodes, 7 pending cache nodes, and the number of cache
     * nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     * 2 (7 - 5) cache node IDs to remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         <i>NumCacheNodes</i> is less than the existing number of cache nodes.
     *         The number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         or pending cache nodes, whichever is greater, and the value of
     *         <i>NumCacheNodes</i> in the request. <p>For example: If you have 3
     *         active cache nodes, 7 pending cache nodes, and the number of cache
     *         nodes in this <code>ModifyCacheCluser</code> call is 5, you must list
     *         2 (7 - 5) cache node IDs to remove.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToRemove.size());
            cacheNodeIdsToRemoveCopy.addAll(cacheNodeIdsToRemove);
            this.cacheNodeIdsToRemove = cacheNodeIdsToRemoveCopy;
        }

        return this;
    }

    /**
     * Specifies whether the new nodes in this Memcached cache cluster are
     * all created in a single Availability Zone or created across multiple
     * Availability Zones. <p>Valid values: <code>single-az</code> |
     * <code>cross-az</code>. <p>This option is only supported for Memcached
     * cache clusters. <note><p>You cannot specify <code>single-az</code> if
     * the Memcached cache cluster already has cache nodes in different
     * Availability Zones. If <code>cross-az</code> is specified, existing
     * Memcached nodes remain in their current Availability Zone. <p>Only
     * newly created nodes will be located in different Availability Zones.
     * For instructions on how to move existing Memcached nodes to different
     * Availability Zones, see the <b>Availability Zone Considerations</b>
     * section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @return Specifies whether the new nodes in this Memcached cache cluster are
     *         all created in a single Availability Zone or created across multiple
     *         Availability Zones. <p>Valid values: <code>single-az</code> |
     *         <code>cross-az</code>. <p>This option is only supported for Memcached
     *         cache clusters. <note><p>You cannot specify <code>single-az</code> if
     *         the Memcached cache cluster already has cache nodes in different
     *         Availability Zones. If <code>cross-az</code> is specified, existing
     *         Memcached nodes remain in their current Availability Zone. <p>Only
     *         newly created nodes will be located in different Availability Zones.
     *         For instructions on how to move existing Memcached nodes to different
     *         Availability Zones, see the <b>Availability Zone Considerations</b>
     *         section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. </note>
     *
     * @see AZMode
     */
    public String getAZMode() {
        return aZMode;
    }
    
    /**
     * Specifies whether the new nodes in this Memcached cache cluster are
     * all created in a single Availability Zone or created across multiple
     * Availability Zones. <p>Valid values: <code>single-az</code> |
     * <code>cross-az</code>. <p>This option is only supported for Memcached
     * cache clusters. <note><p>You cannot specify <code>single-az</code> if
     * the Memcached cache cluster already has cache nodes in different
     * Availability Zones. If <code>cross-az</code> is specified, existing
     * Memcached nodes remain in their current Availability Zone. <p>Only
     * newly created nodes will be located in different Availability Zones.
     * For instructions on how to move existing Memcached nodes to different
     * Availability Zones, see the <b>Availability Zone Considerations</b>
     * section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the new nodes in this Memcached cache cluster are
     *         all created in a single Availability Zone or created across multiple
     *         Availability Zones. <p>Valid values: <code>single-az</code> |
     *         <code>cross-az</code>. <p>This option is only supported for Memcached
     *         cache clusters. <note><p>You cannot specify <code>single-az</code> if
     *         the Memcached cache cluster already has cache nodes in different
     *         Availability Zones. If <code>cross-az</code> is specified, existing
     *         Memcached nodes remain in their current Availability Zone. <p>Only
     *         newly created nodes will be located in different Availability Zones.
     *         For instructions on how to move existing Memcached nodes to different
     *         Availability Zones, see the <b>Availability Zone Considerations</b>
     *         section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. </note>
     *
     * @see AZMode
     */
    public void setAZMode(String aZMode) {
        this.aZMode = aZMode;
    }
    
    /**
     * Specifies whether the new nodes in this Memcached cache cluster are
     * all created in a single Availability Zone or created across multiple
     * Availability Zones. <p>Valid values: <code>single-az</code> |
     * <code>cross-az</code>. <p>This option is only supported for Memcached
     * cache clusters. <note><p>You cannot specify <code>single-az</code> if
     * the Memcached cache cluster already has cache nodes in different
     * Availability Zones. If <code>cross-az</code> is specified, existing
     * Memcached nodes remain in their current Availability Zone. <p>Only
     * newly created nodes will be located in different Availability Zones.
     * For instructions on how to move existing Memcached nodes to different
     * Availability Zones, see the <b>Availability Zone Considerations</b>
     * section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the new nodes in this Memcached cache cluster are
     *         all created in a single Availability Zone or created across multiple
     *         Availability Zones. <p>Valid values: <code>single-az</code> |
     *         <code>cross-az</code>. <p>This option is only supported for Memcached
     *         cache clusters. <note><p>You cannot specify <code>single-az</code> if
     *         the Memcached cache cluster already has cache nodes in different
     *         Availability Zones. If <code>cross-az</code> is specified, existing
     *         Memcached nodes remain in their current Availability Zone. <p>Only
     *         newly created nodes will be located in different Availability Zones.
     *         For instructions on how to move existing Memcached nodes to different
     *         Availability Zones, see the <b>Availability Zone Considerations</b>
     *         section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AZMode
     */
    public ModifyCacheClusterRequest withAZMode(String aZMode) {
        this.aZMode = aZMode;
        return this;
    }

    /**
     * Specifies whether the new nodes in this Memcached cache cluster are
     * all created in a single Availability Zone or created across multiple
     * Availability Zones. <p>Valid values: <code>single-az</code> |
     * <code>cross-az</code>. <p>This option is only supported for Memcached
     * cache clusters. <note><p>You cannot specify <code>single-az</code> if
     * the Memcached cache cluster already has cache nodes in different
     * Availability Zones. If <code>cross-az</code> is specified, existing
     * Memcached nodes remain in their current Availability Zone. <p>Only
     * newly created nodes will be located in different Availability Zones.
     * For instructions on how to move existing Memcached nodes to different
     * Availability Zones, see the <b>Availability Zone Considerations</b>
     * section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the new nodes in this Memcached cache cluster are
     *         all created in a single Availability Zone or created across multiple
     *         Availability Zones. <p>Valid values: <code>single-az</code> |
     *         <code>cross-az</code>. <p>This option is only supported for Memcached
     *         cache clusters. <note><p>You cannot specify <code>single-az</code> if
     *         the Memcached cache cluster already has cache nodes in different
     *         Availability Zones. If <code>cross-az</code> is specified, existing
     *         Memcached nodes remain in their current Availability Zone. <p>Only
     *         newly created nodes will be located in different Availability Zones.
     *         For instructions on how to move existing Memcached nodes to different
     *         Availability Zones, see the <b>Availability Zone Considerations</b>
     *         section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. </note>
     *
     * @see AZMode
     */
    public void setAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
    }
    
    /**
     * Specifies whether the new nodes in this Memcached cache cluster are
     * all created in a single Availability Zone or created across multiple
     * Availability Zones. <p>Valid values: <code>single-az</code> |
     * <code>cross-az</code>. <p>This option is only supported for Memcached
     * cache clusters. <note><p>You cannot specify <code>single-az</code> if
     * the Memcached cache cluster already has cache nodes in different
     * Availability Zones. If <code>cross-az</code> is specified, existing
     * Memcached nodes remain in their current Availability Zone. <p>Only
     * newly created nodes will be located in different Availability Zones.
     * For instructions on how to move existing Memcached nodes to different
     * Availability Zones, see the <b>Availability Zone Considerations</b>
     * section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>single-az, cross-az
     *
     * @param aZMode Specifies whether the new nodes in this Memcached cache cluster are
     *         all created in a single Availability Zone or created across multiple
     *         Availability Zones. <p>Valid values: <code>single-az</code> |
     *         <code>cross-az</code>. <p>This option is only supported for Memcached
     *         cache clusters. <note><p>You cannot specify <code>single-az</code> if
     *         the Memcached cache cluster already has cache nodes in different
     *         Availability Zones. If <code>cross-az</code> is specified, existing
     *         Memcached nodes remain in their current Availability Zone. <p>Only
     *         newly created nodes will be located in different Availability Zones.
     *         For instructions on how to move existing Memcached nodes to different
     *         Availability Zones, see the <b>Availability Zone Considerations</b>
     *         section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AZMode
     */
    public ModifyCacheClusterRequest withAZMode(AZMode aZMode) {
        this.aZMode = aZMode.toString();
        return this;
    }

    /**
     * The list of Availability Zones where the new Memcached cache nodes
     * will be created. <p>This parameter is only valid when
     * <i>NumCacheNodes</i> in the request is greater than the sum of the
     * number of active cache nodes and the number of cache nodes pending
     * creation (which may be zero). The number of Availability Zones
     * supplied in this list must match the cache nodes being added in this
     * request. <p>This option is only supported on Memcached clusters.
     * <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     * wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     * and optionally specify two Availability Zones for the two new
     * nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     * pending creation (from the scenario 1 call) and want to add 1 more
     * node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     * optionally specify an Availability Zone for the new node.
     * <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     * Specify <code>NumCacheNodes=3</code> to cancel all pending
     * actions.</li> </ul> <p>The Availability Zone placement of nodes
     * pending creation cannot be modified. If you wish to cancel any nodes
     * pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     * the number of current nodes. <p>If <code>cross-az</code> is specified,
     * existing Memcached nodes remain in their current Availability Zone.
     * Only newly created nodes can be located in different Availability
     * Zones. For guidance on how to move existing Memcached nodes to
     * different Availability Zones, see the <b>Availability Zone
     * Considerations</b> section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     * requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     * <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     * <li>Result: The new delete, pending or immediate, replaces the pending
     * delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     * Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     * pending or immediate, replaces the pending delete.</li> </ul></li>
     * <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     * Delete</li> <li>Result: The new delete, pending or immediate, replaces
     * the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     * Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     * create is added to the pending create. <b>Important:</b><br/>If the
     * new create request is <b>Apply Immediately - Yes</b>, all creates are
     * performed immediately.<br/> If the new create request is <b>Apply
     * Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     * <p>Example:
     * <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     *
     * @return The list of Availability Zones where the new Memcached cache nodes
     *         will be created. <p>This parameter is only valid when
     *         <i>NumCacheNodes</i> in the request is greater than the sum of the
     *         number of active cache nodes and the number of cache nodes pending
     *         creation (which may be zero). The number of Availability Zones
     *         supplied in this list must match the cache nodes being added in this
     *         request. <p>This option is only supported on Memcached clusters.
     *         <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     *         wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     *         and optionally specify two Availability Zones for the two new
     *         nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     *         pending creation (from the scenario 1 call) and want to add 1 more
     *         node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     *         optionally specify an Availability Zone for the new node.
     *         <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     *         Specify <code>NumCacheNodes=3</code> to cancel all pending
     *         actions.</li> </ul> <p>The Availability Zone placement of nodes
     *         pending creation cannot be modified. If you wish to cancel any nodes
     *         pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *         the number of current nodes. <p>If <code>cross-az</code> is specified,
     *         existing Memcached nodes remain in their current Availability Zone.
     *         Only newly created nodes can be located in different Availability
     *         Zones. For guidance on how to move existing Memcached nodes to
     *         different Availability Zones, see the <b>Availability Zone
     *         Considerations</b> section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     *         requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     *         <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     *         <li>Result: The new delete, pending or immediate, replaces the pending
     *         delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     *         Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     *         pending or immediate, replaces the pending delete.</li> </ul></li>
     *         <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     *         Delete</li> <li>Result: The new delete, pending or immediate, replaces
     *         the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     *         Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     *         create is added to the pending create. <b>Important:</b><br/>If the
     *         new create request is <b>Apply Immediately - Yes</b>, all creates are
     *         performed immediately.<br/> If the new create request is <b>Apply
     *         Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     *         <p>Example:
     *         <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     */
    public java.util.List<String> getNewAvailabilityZones() {
        if (newAvailabilityZones == null) {
              newAvailabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              newAvailabilityZones.setAutoConstruct(true);
        }
        return newAvailabilityZones;
    }
    
    /**
     * The list of Availability Zones where the new Memcached cache nodes
     * will be created. <p>This parameter is only valid when
     * <i>NumCacheNodes</i> in the request is greater than the sum of the
     * number of active cache nodes and the number of cache nodes pending
     * creation (which may be zero). The number of Availability Zones
     * supplied in this list must match the cache nodes being added in this
     * request. <p>This option is only supported on Memcached clusters.
     * <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     * wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     * and optionally specify two Availability Zones for the two new
     * nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     * pending creation (from the scenario 1 call) and want to add 1 more
     * node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     * optionally specify an Availability Zone for the new node.
     * <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     * Specify <code>NumCacheNodes=3</code> to cancel all pending
     * actions.</li> </ul> <p>The Availability Zone placement of nodes
     * pending creation cannot be modified. If you wish to cancel any nodes
     * pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     * the number of current nodes. <p>If <code>cross-az</code> is specified,
     * existing Memcached nodes remain in their current Availability Zone.
     * Only newly created nodes can be located in different Availability
     * Zones. For guidance on how to move existing Memcached nodes to
     * different Availability Zones, see the <b>Availability Zone
     * Considerations</b> section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     * requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     * <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     * <li>Result: The new delete, pending or immediate, replaces the pending
     * delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     * Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     * pending or immediate, replaces the pending delete.</li> </ul></li>
     * <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     * Delete</li> <li>Result: The new delete, pending or immediate, replaces
     * the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     * Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     * create is added to the pending create. <b>Important:</b><br/>If the
     * new create request is <b>Apply Immediately - Yes</b>, all creates are
     * performed immediately.<br/> If the new create request is <b>Apply
     * Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     * <p>Example:
     * <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     *
     * @param newAvailabilityZones The list of Availability Zones where the new Memcached cache nodes
     *         will be created. <p>This parameter is only valid when
     *         <i>NumCacheNodes</i> in the request is greater than the sum of the
     *         number of active cache nodes and the number of cache nodes pending
     *         creation (which may be zero). The number of Availability Zones
     *         supplied in this list must match the cache nodes being added in this
     *         request. <p>This option is only supported on Memcached clusters.
     *         <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     *         wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     *         and optionally specify two Availability Zones for the two new
     *         nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     *         pending creation (from the scenario 1 call) and want to add 1 more
     *         node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     *         optionally specify an Availability Zone for the new node.
     *         <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     *         Specify <code>NumCacheNodes=3</code> to cancel all pending
     *         actions.</li> </ul> <p>The Availability Zone placement of nodes
     *         pending creation cannot be modified. If you wish to cancel any nodes
     *         pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *         the number of current nodes. <p>If <code>cross-az</code> is specified,
     *         existing Memcached nodes remain in their current Availability Zone.
     *         Only newly created nodes can be located in different Availability
     *         Zones. For guidance on how to move existing Memcached nodes to
     *         different Availability Zones, see the <b>Availability Zone
     *         Considerations</b> section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     *         requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     *         <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     *         <li>Result: The new delete, pending or immediate, replaces the pending
     *         delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     *         Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     *         pending or immediate, replaces the pending delete.</li> </ul></li>
     *         <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     *         Delete</li> <li>Result: The new delete, pending or immediate, replaces
     *         the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     *         Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     *         create is added to the pending create. <b>Important:</b><br/>If the
     *         new create request is <b>Apply Immediately - Yes</b>, all creates are
     *         performed immediately.<br/> If the new create request is <b>Apply
     *         Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     *         <p>Example:
     *         <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     */
    public void setNewAvailabilityZones(java.util.Collection<String> newAvailabilityZones) {
        if (newAvailabilityZones == null) {
            this.newAvailabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> newAvailabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(newAvailabilityZones.size());
        newAvailabilityZonesCopy.addAll(newAvailabilityZones);
        this.newAvailabilityZones = newAvailabilityZonesCopy;
    }
    
    /**
     * The list of Availability Zones where the new Memcached cache nodes
     * will be created. <p>This parameter is only valid when
     * <i>NumCacheNodes</i> in the request is greater than the sum of the
     * number of active cache nodes and the number of cache nodes pending
     * creation (which may be zero). The number of Availability Zones
     * supplied in this list must match the cache nodes being added in this
     * request. <p>This option is only supported on Memcached clusters.
     * <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     * wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     * and optionally specify two Availability Zones for the two new
     * nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     * pending creation (from the scenario 1 call) and want to add 1 more
     * node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     * optionally specify an Availability Zone for the new node.
     * <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     * Specify <code>NumCacheNodes=3</code> to cancel all pending
     * actions.</li> </ul> <p>The Availability Zone placement of nodes
     * pending creation cannot be modified. If you wish to cancel any nodes
     * pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     * the number of current nodes. <p>If <code>cross-az</code> is specified,
     * existing Memcached nodes remain in their current Availability Zone.
     * Only newly created nodes can be located in different Availability
     * Zones. For guidance on how to move existing Memcached nodes to
     * different Availability Zones, see the <b>Availability Zone
     * Considerations</b> section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     * requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     * <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     * <li>Result: The new delete, pending or immediate, replaces the pending
     * delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     * Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     * pending or immediate, replaces the pending delete.</li> </ul></li>
     * <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     * Delete</li> <li>Result: The new delete, pending or immediate, replaces
     * the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     * Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     * create is added to the pending create. <b>Important:</b><br/>If the
     * new create request is <b>Apply Immediately - Yes</b>, all creates are
     * performed immediately.<br/> If the new create request is <b>Apply
     * Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     * <p>Example:
     * <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNewAvailabilityZones(java.util.Collection)} or
     * {@link #withNewAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newAvailabilityZones The list of Availability Zones where the new Memcached cache nodes
     *         will be created. <p>This parameter is only valid when
     *         <i>NumCacheNodes</i> in the request is greater than the sum of the
     *         number of active cache nodes and the number of cache nodes pending
     *         creation (which may be zero). The number of Availability Zones
     *         supplied in this list must match the cache nodes being added in this
     *         request. <p>This option is only supported on Memcached clusters.
     *         <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     *         wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     *         and optionally specify two Availability Zones for the two new
     *         nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     *         pending creation (from the scenario 1 call) and want to add 1 more
     *         node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     *         optionally specify an Availability Zone for the new node.
     *         <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     *         Specify <code>NumCacheNodes=3</code> to cancel all pending
     *         actions.</li> </ul> <p>The Availability Zone placement of nodes
     *         pending creation cannot be modified. If you wish to cancel any nodes
     *         pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *         the number of current nodes. <p>If <code>cross-az</code> is specified,
     *         existing Memcached nodes remain in their current Availability Zone.
     *         Only newly created nodes can be located in different Availability
     *         Zones. For guidance on how to move existing Memcached nodes to
     *         different Availability Zones, see the <b>Availability Zone
     *         Considerations</b> section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     *         requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     *         <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     *         <li>Result: The new delete, pending or immediate, replaces the pending
     *         delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     *         Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     *         pending or immediate, replaces the pending delete.</li> </ul></li>
     *         <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     *         Delete</li> <li>Result: The new delete, pending or immediate, replaces
     *         the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     *         Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     *         create is added to the pending create. <b>Important:</b><br/>If the
     *         new create request is <b>Apply Immediately - Yes</b>, all creates are
     *         performed immediately.<br/> If the new create request is <b>Apply
     *         Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     *         <p>Example:
     *         <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withNewAvailabilityZones(String... newAvailabilityZones) {
        if (getNewAvailabilityZones() == null) setNewAvailabilityZones(new java.util.ArrayList<String>(newAvailabilityZones.length));
        for (String value : newAvailabilityZones) {
            getNewAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * The list of Availability Zones where the new Memcached cache nodes
     * will be created. <p>This parameter is only valid when
     * <i>NumCacheNodes</i> in the request is greater than the sum of the
     * number of active cache nodes and the number of cache nodes pending
     * creation (which may be zero). The number of Availability Zones
     * supplied in this list must match the cache nodes being added in this
     * request. <p>This option is only supported on Memcached clusters.
     * <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     * wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     * and optionally specify two Availability Zones for the two new
     * nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     * pending creation (from the scenario 1 call) and want to add 1 more
     * node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     * optionally specify an Availability Zone for the new node.
     * <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     * Specify <code>NumCacheNodes=3</code> to cancel all pending
     * actions.</li> </ul> <p>The Availability Zone placement of nodes
     * pending creation cannot be modified. If you wish to cancel any nodes
     * pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     * the number of current nodes. <p>If <code>cross-az</code> is specified,
     * existing Memcached nodes remain in their current Availability Zone.
     * Only newly created nodes can be located in different Availability
     * Zones. For guidance on how to move existing Memcached nodes to
     * different Availability Zones, see the <b>Availability Zone
     * Considerations</b> section of <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     * Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     * requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     * <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     * <li>Result: The new delete, pending or immediate, replaces the pending
     * delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     * Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     * pending or immediate, replaces the pending delete.</li> </ul></li>
     * <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     * Delete</li> <li>Result: The new delete, pending or immediate, replaces
     * the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     * Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     * create is added to the pending create. <b>Important:</b><br/>If the
     * new create request is <b>Apply Immediately - Yes</b>, all creates are
     * performed immediately.<br/> If the new create request is <b>Apply
     * Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     * <p>Example:
     * <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newAvailabilityZones The list of Availability Zones where the new Memcached cache nodes
     *         will be created. <p>This parameter is only valid when
     *         <i>NumCacheNodes</i> in the request is greater than the sum of the
     *         number of active cache nodes and the number of cache nodes pending
     *         creation (which may be zero). The number of Availability Zones
     *         supplied in this list must match the cache nodes being added in this
     *         request. <p>This option is only supported on Memcached clusters.
     *         <p>Scenarios: <ul> <li><b>Scenario 1:</b> You have 3 active nodes and
     *         wish to add 2 nodes.<br/> Specify <code>NumCacheNodes=5</code> (3 + 2)
     *         and optionally specify two Availability Zones for the two new
     *         nodes.</li> <li><b>Scenario 2:</b> You have 3 active nodes and 2 nodes
     *         pending creation (from the scenario 1 call) and want to add 1 more
     *         node.<br/> Specify <code>NumCacheNodes=6</code> ((3 + 2) + 1)</li> and
     *         optionally specify an Availability Zone for the new node.
     *         <li><b>Scenario 3:</b> You want to cancel all pending actions.<br/>
     *         Specify <code>NumCacheNodes=3</code> to cancel all pending
     *         actions.</li> </ul> <p>The Availability Zone placement of nodes
     *         pending creation cannot be modified. If you wish to cancel any nodes
     *         pending creation, add 0 nodes by setting <code>NumCacheNodes</code> to
     *         the number of current nodes. <p>If <code>cross-az</code> is specified,
     *         existing Memcached nodes remain in their current Availability Zone.
     *         Only newly created nodes can be located in different Availability
     *         Zones. For guidance on how to move existing Memcached nodes to
     *         different Availability Zones, see the <b>Availability Zone
     *         Considerations</b> section of <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheNode.Memcached.html">Cache
     *         Node Considerations for Memcached</a>. <p><b>Impact of new add/remove
     *         requests upon pending requests</b> <ul> <li>Scenario-1 <ul>
     *         <li>Pending Action: Delete</li> <li>New Request: Delete</li>
     *         <li>Result: The new delete, pending or immediate, replaces the pending
     *         delete.</li> </ul></li> <li>Scenario-2 <ul> <li>Pending Action:
     *         Delete</li> <li>New Request: Create</li> <li>Result: The new create,
     *         pending or immediate, replaces the pending delete.</li> </ul></li>
     *         <li>Scenario-3 <ul> <li>Pending Action: Create</li> <li>New Request:
     *         Delete</li> <li>Result: The new delete, pending or immediate, replaces
     *         the pending create.</li> </ul></li> <li>Scenario-4 <ul> <li>Pending
     *         Action: Create</li> <li>New Request: Create</li> <li>Result: The new
     *         create is added to the pending create. <b>Important:</b><br/>If the
     *         new create request is <b>Apply Immediately - Yes</b>, all creates are
     *         performed immediately.<br/> If the new create request is <b>Apply
     *         Immediately - No</b>, all creates are pending.</li> </ul></li> </ul>
     *         <p>Example:
     *         <code>NewAvailabilityZones.member.1=us-west-2a&NewAvailabilityZones.member.2=us-west-2b&NewAvailabilityZones.member.3=us-west-2c</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withNewAvailabilityZones(java.util.Collection<String> newAvailabilityZones) {
        if (newAvailabilityZones == null) {
            this.newAvailabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> newAvailabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(newAvailabilityZones.size());
            newAvailabilityZonesCopy.addAll(newAvailabilityZones);
            this.newAvailabilityZones = newAvailabilityZonesCopy;
        }

        return this;
    }

    /**
     * A list of cache security group names to authorize on this cache
     * cluster. This change is asynchronously applied as soon as possible.
     * <p>This parameter can be used only with clusters that are created
     * outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be
     * "Default".
     *
     * @return A list of cache security group names to authorize on this cache
     *         cluster. This change is asynchronously applied as soon as possible.
     *         <p>This parameter can be used only with clusters that are created
     *         outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters. Must not be
     *         "Default".
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
              cacheSecurityGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheSecurityGroupNames.setAutoConstruct(true);
        }
        return cacheSecurityGroupNames;
    }
    
    /**
     * A list of cache security group names to authorize on this cache
     * cluster. This change is asynchronously applied as soon as possible.
     * <p>This parameter can be used only with clusters that are created
     * outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be
     * "Default".
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize on this cache
     *         cluster. This change is asynchronously applied as soon as possible.
     *         <p>This parameter can be used only with clusters that are created
     *         outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters. Must not be
     *         "Default".
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
     * A list of cache security group names to authorize on this cache
     * cluster. This change is asynchronously applied as soon as possible.
     * <p>This parameter can be used only with clusters that are created
     * outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be
     * "Default".
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize on this cache
     *         cluster. This change is asynchronously applied as soon as possible.
     *         <p>This parameter can be used only with clusters that are created
     *         outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters. Must not be
     *         "Default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
        if (getCacheSecurityGroupNames() == null) setCacheSecurityGroupNames(new java.util.ArrayList<String>(cacheSecurityGroupNames.length));
        for (String value : cacheSecurityGroupNames) {
            getCacheSecurityGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache security group names to authorize on this cache
     * cluster. This change is asynchronously applied as soon as possible.
     * <p>This parameter can be used only with clusters that are created
     * outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be
     * "Default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize on this cache
     *         cluster. This change is asynchronously applied as soon as possible.
     *         <p>This parameter can be used only with clusters that are created
     *         outside of an Amazon Virtual Private Cloud (VPC). <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters. Must not be
     *         "Default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
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
     * Specifies the VPC Security Groups associated with the cache cluster.
     * <p>This parameter can be used only with clusters that are created in
     * an Amazon Virtual Private Cloud (VPC).
     *
     * @return Specifies the VPC Security Groups associated with the cache cluster.
     *         <p>This parameter can be used only with clusters that are created in
     *         an Amazon Virtual Private Cloud (VPC).
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the cache cluster.
     * <p>This parameter can be used only with clusters that are created in
     * an Amazon Virtual Private Cloud (VPC).
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache cluster.
     *         <p>This parameter can be used only with clusters that are created in
     *         an Amazon Virtual Private Cloud (VPC).
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
     * Specifies the VPC Security Groups associated with the cache cluster.
     * <p>This parameter can be used only with clusters that are created in
     * an Amazon Virtual Private Cloud (VPC).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache cluster.
     *         <p>This parameter can be used only with clusters that are created in
     *         an Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the cache cluster.
     * <p>This parameter can be used only with clusters that are created in
     * an Amazon Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache cluster.
     *         <p>This parameter can be used only with clusters that are created in
     *         an Amazon Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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
    public ModifyCacheClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the cache cluster owner. </note>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent. <note>The Amazon SNS topic owner must be
     *         same as the cache cluster owner. </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the cache cluster owner. </note>
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent. <note>The Amazon SNS topic owner must be
     *         same as the cache cluster owner. </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the cache cluster owner. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent. <note>The Amazon SNS topic owner must be
     *         same as the cache cluster owner. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * The name of the cache parameter group to apply to this cache cluster.
     * This change is asynchronously applied as soon as possible for
     * parameters when the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     *
     * @return The name of the cache parameter group to apply to this cache cluster.
     *         This change is asynchronously applied as soon as possible for
     *         parameters when the <i>ApplyImmediately</i> parameter is specified as
     *         <i>true</i> for this request.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to apply to this cache cluster.
     * This change is asynchronously applied as soon as possible for
     * parameters when the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to apply to this cache cluster.
     *         This change is asynchronously applied as soon as possible for
     *         parameters when the <i>ApplyImmediately</i> parameter is specified as
     *         <i>true</i> for this request.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to apply to this cache cluster.
     * This change is asynchronously applied as soon as possible for
     * parameters when the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to apply to this cache cluster.
     *         This change is asynchronously applied as soon as possible for
     *         parameters when the <i>ApplyImmediately</i> parameter is specified as
     *         <i>true</i> for this request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The status of the Amazon SNS notification topic. Notifications are
     * sent only if the status is <i>active</i>. <p>Valid values:
     * <code>active</code> | <code>inactive</code>
     *
     * @return The status of the Amazon SNS notification topic. Notifications are
     *         sent only if the status is <i>active</i>. <p>Valid values:
     *         <code>active</code> | <code>inactive</code>
     */
    public String getNotificationTopicStatus() {
        return notificationTopicStatus;
    }
    
    /**
     * The status of the Amazon SNS notification topic. Notifications are
     * sent only if the status is <i>active</i>. <p>Valid values:
     * <code>active</code> | <code>inactive</code>
     *
     * @param notificationTopicStatus The status of the Amazon SNS notification topic. Notifications are
     *         sent only if the status is <i>active</i>. <p>Valid values:
     *         <code>active</code> | <code>inactive</code>
     */
    public void setNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
    }
    
    /**
     * The status of the Amazon SNS notification topic. Notifications are
     * sent only if the status is <i>active</i>. <p>Valid values:
     * <code>active</code> | <code>inactive</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicStatus The status of the Amazon SNS notification topic. Notifications are
     *         sent only if the status is <i>active</i>. <p>Valid values:
     *         <code>active</code> | <code>inactive</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
        return this;
    }

    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     * <code>false</code>, then changes to the cache cluster are applied on
     * the next maintenance reboot, or the next failure reboot, whichever
     * occurs first. <important>If you perform a
     * <code>ModifyCacheCluster</code> before a pending modification is
     * applied, the pending modification is replaced by the newer
     * modification.</important> <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <important>If you perform a
     *         <code>ModifyCacheCluster</code> before a pending modification is
     *         applied, the pending modification is replaced by the newer
     *         modification.</important> <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     * <code>false</code>, then changes to the cache cluster are applied on
     * the next maintenance reboot, or the next failure reboot, whichever
     * occurs first. <important>If you perform a
     * <code>ModifyCacheCluster</code> before a pending modification is
     * applied, the pending modification is replaced by the newer
     * modification.</important> <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     *
     * @param applyImmediately If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <important>If you perform a
     *         <code>ModifyCacheCluster</code> before a pending modification is
     *         applied, the pending modification is replaced by the newer
     *         modification.</important> <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     * <code>false</code>, then changes to the cache cluster are applied on
     * the next maintenance reboot, or the next failure reboot, whichever
     * occurs first. <important>If you perform a
     * <code>ModifyCacheCluster</code> before a pending modification is
     * applied, the pending modification is replaced by the newer
     * modification.</important> <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <important>If you perform a
     *         <code>ModifyCacheCluster</code> before a pending modification is
     *         applied, the pending modification is replaced by the newer
     *         modification.</important> <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     * <code>false</code>, then changes to the cache cluster are applied on
     * the next maintenance reboot, or the next failure reboot, whichever
     * occurs first. <important>If you perform a
     * <code>ModifyCacheCluster</code> before a pending modification is
     * applied, the pending modification is replaced by the newer
     * modification.</important> <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <important>If you perform a
     *         <code>ModifyCacheCluster</code> before a pending modification is
     *         applied, the pending modification is replaced by the newer
     *         modification.</important> <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * The upgraded version of the cache engine to be run on the cache nodes.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster and create it anew with the
     * earlier engine version.
     *
     * @return The upgraded version of the cache engine to be run on the cache nodes.
     *         <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster and create it anew with the
     *         earlier engine version.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the cache nodes.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster and create it anew with the
     * earlier engine version.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the cache nodes.
     *         <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster and create it anew with the
     *         earlier engine version.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the cache nodes.
     * <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing cache cluster and create it anew with the
     * earlier engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the cache nodes.
     *         <p><b>Important:</b> You can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing cache cluster and create it anew with the
     *         earlier engine version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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
    public ModifyCacheClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
     * The number of days for which ElastiCache will retain automatic cache
     * cluster snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     *
     * @return The number of days for which ElastiCache will retain automatic cache
     *         cluster snapshots before deleting them. For example, if you set
     *         <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *         today will be retained for 5 days before being deleted.
     *         <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     *         to zero (0), backups are turned off.
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }
    
    /**
     * The number of days for which ElastiCache will retain automatic cache
     * cluster snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     *
     * @param snapshotRetentionLimit The number of days for which ElastiCache will retain automatic cache
     *         cluster snapshots before deleting them. For example, if you set
     *         <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *         today will be retained for 5 days before being deleted.
     *         <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     *         to zero (0), backups are turned off.
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }
    
    /**
     * The number of days for which ElastiCache will retain automatic cache
     * cluster snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotRetentionLimit The number of days for which ElastiCache will retain automatic cache
     *         cluster snapshots before deleting them. For example, if you set
     *         <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *         today will be retained for 5 days before being deleted.
     *         <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     *         to zero (0), backups are turned off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your cache cluster.
     *
     * @return The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your cache cluster.
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }
    
    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your cache cluster.
     *
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your cache cluster.
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }
    
    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of your cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of your cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * A valid cache node type that you want to scale this cache cluster to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     *
     * @return A valid cache node type that you want to scale this cache cluster to.
     *         The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * A valid cache node type that you want to scale this cache cluster to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     *
     * @param cacheNodeType A valid cache node type that you want to scale this cache cluster to.
     *         The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * A valid cache node type that you want to scale this cache cluster to.
     * The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType A valid cache node type that you want to scale this cache cluster to.
     *         The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyCacheClusterRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
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
        if (getNumCacheNodes() != null) sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getCacheNodeIdsToRemove() != null) sb.append("CacheNodeIdsToRemove: " + getCacheNodeIdsToRemove() + ",");
        if (getAZMode() != null) sb.append("AZMode: " + getAZMode() + ",");
        if (getNewAvailabilityZones() != null) sb.append("NewAvailabilityZones: " + getNewAvailabilityZones() + ",");
        if (getCacheSecurityGroupNames() != null) sb.append("CacheSecurityGroupNames: " + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getNotificationTopicArn() != null) sb.append("NotificationTopicArn: " + getNotificationTopicArn() + ",");
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getNotificationTopicStatus() != null) sb.append("NotificationTopicStatus: " + getNotificationTopicStatus() + ",");
        if (isApplyImmediately() != null) sb.append("ApplyImmediately: " + isApplyImmediately() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getSnapshotRetentionLimit() != null) sb.append("SnapshotRetentionLimit: " + getSnapshotRetentionLimit() + ",");
        if (getSnapshotWindow() != null) sb.append("SnapshotWindow: " + getSnapshotWindow() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeIdsToRemove() == null) ? 0 : getCacheNodeIdsToRemove().hashCode()); 
        hashCode = prime * hashCode + ((getAZMode() == null) ? 0 : getAZMode().hashCode()); 
        hashCode = prime * hashCode + ((getNewAvailabilityZones() == null) ? 0 : getNewAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicStatus() == null) ? 0 : getNotificationTopicStatus().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyCacheClusterRequest == false) return false;
        ModifyCacheClusterRequest other = (ModifyCacheClusterRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null) return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false) return false; 
        if (other.getCacheNodeIdsToRemove() == null ^ this.getCacheNodeIdsToRemove() == null) return false;
        if (other.getCacheNodeIdsToRemove() != null && other.getCacheNodeIdsToRemove().equals(this.getCacheNodeIdsToRemove()) == false) return false; 
        if (other.getAZMode() == null ^ this.getAZMode() == null) return false;
        if (other.getAZMode() != null && other.getAZMode().equals(this.getAZMode()) == false) return false; 
        if (other.getNewAvailabilityZones() == null ^ this.getNewAvailabilityZones() == null) return false;
        if (other.getNewAvailabilityZones() != null && other.getNewAvailabilityZones().equals(this.getNewAvailabilityZones()) == false) return false; 
        if (other.getCacheSecurityGroupNames() == null ^ this.getCacheSecurityGroupNames() == null) return false;
        if (other.getCacheSecurityGroupNames() != null && other.getCacheSecurityGroupNames().equals(this.getCacheSecurityGroupNames()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null) return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false) return false; 
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getNotificationTopicStatus() == null ^ this.getNotificationTopicStatus() == null) return false;
        if (other.getNotificationTopicStatus() != null && other.getNotificationTopicStatus().equals(this.getNotificationTopicStatus()) == false) return false; 
        if (other.isApplyImmediately() == null ^ this.isApplyImmediately() == null) return false;
        if (other.isApplyImmediately() != null && other.isApplyImmediately().equals(this.isApplyImmediately()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null) return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false) return false; 
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null) return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyCacheClusterRequest clone() {
        
            return (ModifyCacheClusterRequest) super.clone();
    }

}
    