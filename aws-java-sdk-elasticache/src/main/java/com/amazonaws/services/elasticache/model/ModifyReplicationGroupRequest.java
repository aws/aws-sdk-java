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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#modifyReplicationGroup(ModifyReplicationGroupRequest) ModifyReplicationGroup operation}.
 * <p>
 * The <i>ModifyReplicationGroup</i> action modifies the settings for a
 * replication group.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#modifyReplicationGroup(ModifyReplicationGroupRequest)
 */
public class ModifyReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the replication group to modify.
     */
    private String replicationGroupId;

    /**
     * A description for the replication group. Maximum length is 255
     * characters.
     */
    private String replicationGroupDescription;

    /**
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The
     * nodes of all other clusters in the replication group will be read
     * replicas.
     */
    private String primaryClusterId;

    /**
     * The cache cluster ID that will be used as the daily snapshot source
     * for the replication group.
     */
    private String snapshottingClusterId;

    /**
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure. <p>Valid values:
     * <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     * replication groups are not supported on: <ul> <li>Redis versions
     * earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     * </note>
     */
    private Boolean automaticFailoverEnabled;

    /**
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication group
     * containing cache clusters running outside of an Amazon Virtual Private
     * Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNames;

    /**
     * Specifies the VPC Security Groups associated with the cache clusters
     * in the replication group. <p>This parameter can be used only with
     * replication group containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
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
     * same as the replication group owner. </note>
     */
    private String notificationTopicArn;

    /**
     * The name of the cache parameter group to apply to all of the clusters
     * in this replication group. This change is asynchronously applied as
     * soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     */
    private String cacheParameterGroupName;

    /**
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * <p>Valid values: <code>active</code> | <code>inactive</code>
     */
    private String notificationTopicStatus;

    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the replication group.
     * <p>If <code>false</code>, then changes to the nodes in the replication
     * group are applied on the next maintenance reboot, or the next failure
     * reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     */
    private Boolean applyImmediately;

    /**
     * The upgraded version of the cache engine to be run on the cache
     * clusters in the replication group. <p><b>Important:</b> You can
     * upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     */
    private String engineVersion;

    /**
     * This parameter is currently disabled.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * The number of days for which ElastiCache will retain automatic node
     * group snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     */
    private Integer snapshotRetentionLimit;

    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     * <p>If you do not specify this parameter, then ElastiCache will
     * automatically choose an appropriate time range.
     */
    private String snapshotWindow;

    /**
     * A valid cache node type that you want to scale this replication group
     * to. The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     */
    private String cacheNodeType;

    /**
     * The identifier of the replication group to modify.
     *
     * @return The identifier of the replication group to modify.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The identifier of the replication group to modify.
     *
     * @param replicationGroupId The identifier of the replication group to modify.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The identifier of the replication group to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The identifier of the replication group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * A description for the replication group. Maximum length is 255
     * characters.
     *
     * @return A description for the replication group. Maximum length is 255
     *         characters.
     */
    public String getReplicationGroupDescription() {
        return replicationGroupDescription;
    }
    
    /**
     * A description for the replication group. Maximum length is 255
     * characters.
     *
     * @param replicationGroupDescription A description for the replication group. Maximum length is 255
     *         characters.
     */
    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }
    
    /**
     * A description for the replication group. Maximum length is 255
     * characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupDescription A description for the replication group. Maximum length is 255
     *         characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The
     * nodes of all other clusters in the replication group will be read
     * replicas.
     *
     * @return If this parameter is specified, ElastiCache will promote the specified
     *         cluster in the specified replication group to the primary role. The
     *         nodes of all other clusters in the replication group will be read
     *         replicas.
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }
    
    /**
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The
     * nodes of all other clusters in the replication group will be read
     * replicas.
     *
     * @param primaryClusterId If this parameter is specified, ElastiCache will promote the specified
     *         cluster in the specified replication group to the primary role. The
     *         nodes of all other clusters in the replication group will be read
     *         replicas.
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }
    
    /**
     * If this parameter is specified, ElastiCache will promote the specified
     * cluster in the specified replication group to the primary role. The
     * nodes of all other clusters in the replication group will be read
     * replicas.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primaryClusterId If this parameter is specified, ElastiCache will promote the specified
     *         cluster in the specified replication group to the primary role. The
     *         nodes of all other clusters in the replication group will be read
     *         replicas.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * The cache cluster ID that will be used as the daily snapshot source
     * for the replication group.
     *
     * @return The cache cluster ID that will be used as the daily snapshot source
     *         for the replication group.
     */
    public String getSnapshottingClusterId() {
        return snapshottingClusterId;
    }
    
    /**
     * The cache cluster ID that will be used as the daily snapshot source
     * for the replication group.
     *
     * @param snapshottingClusterId The cache cluster ID that will be used as the daily snapshot source
     *         for the replication group.
     */
    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }
    
    /**
     * The cache cluster ID that will be used as the daily snapshot source
     * for the replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshottingClusterId The cache cluster ID that will be used as the daily snapshot source
     *         for the replication group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
        return this;
    }

    /**
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure. <p>Valid values:
     * <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     * replication groups are not supported on: <ul> <li>Redis versions
     * earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     * </note>
     *
     * @return Whether a read replica will be automatically promoted to read/write
     *         primary if the existing primary encounters a failure. <p>Valid values:
     *         <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     *         replication groups are not supported on: <ul> <li>Redis versions
     *         earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     *         </note>
     */
    public Boolean isAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }
    
    /**
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure. <p>Valid values:
     * <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     * replication groups are not supported on: <ul> <li>Redis versions
     * earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     * </note>
     *
     * @param automaticFailoverEnabled Whether a read replica will be automatically promoted to read/write
     *         primary if the existing primary encounters a failure. <p>Valid values:
     *         <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     *         replication groups are not supported on: <ul> <li>Redis versions
     *         earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     *         </note>
     */
    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }
    
    /**
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure. <p>Valid values:
     * <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     * replication groups are not supported on: <ul> <li>Redis versions
     * earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automaticFailoverEnabled Whether a read replica will be automatically promoted to read/write
     *         primary if the existing primary encounters a failure. <p>Valid values:
     *         <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     *         replication groups are not supported on: <ul> <li>Redis versions
     *         earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
        return this;
    }

    /**
     * Whether a read replica will be automatically promoted to read/write
     * primary if the existing primary encounters a failure. <p>Valid values:
     * <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     * replication groups are not supported on: <ul> <li>Redis versions
     * earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     * </note>
     *
     * @return Whether a read replica will be automatically promoted to read/write
     *         primary if the existing primary encounters a failure. <p>Valid values:
     *         <code>true</code> | <code>false</code> <note><p>ElastiCache Multi-AZ
     *         replication groups are not supported on: <ul> <li>Redis versions
     *         earlier than 2.8.6.</li> <li>T1 and T2 cache node types.</li> </ul>
     *         </note>
     */
    public Boolean getAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication group
     * containing cache clusters running outside of an Amazon Virtual Private
     * Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     *
     * @return A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication group
     *         containing cache clusters running outside of an Amazon Virtual Private
     *         Cloud (VPC). <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default".
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
              cacheSecurityGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheSecurityGroupNames.setAutoConstruct(true);
        }
        return cacheSecurityGroupNames;
    }
    
    /**
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication group
     * containing cache clusters running outside of an Amazon Virtual Private
     * Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication group
     *         containing cache clusters running outside of an Amazon Virtual Private
     *         Cloud (VPC). <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default".
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
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication group
     * containing cache clusters running outside of an Amazon Virtual Private
     * Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication group
     *         containing cache clusters running outside of an Amazon Virtual Private
     *         Cloud (VPC). <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
        if (getCacheSecurityGroupNames() == null) setCacheSecurityGroupNames(new java.util.ArrayList<String>(cacheSecurityGroupNames.length));
        for (String value : cacheSecurityGroupNames) {
            getCacheSecurityGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication group
     * containing cache clusters running outside of an Amazon Virtual Private
     * Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication group
     *         containing cache clusters running outside of an Amazon Virtual Private
     *         Cloud (VPC). <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
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
     * Specifies the VPC Security Groups associated with the cache clusters
     * in the replication group. <p>This parameter can be used only with
     * replication group containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     *
     * @return Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication group containing cache clusters running in an Amazon
     *         Virtual Private Cloud (VPC).
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the cache clusters
     * in the replication group. <p>This parameter can be used only with
     * replication group containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication group containing cache clusters running in an Amazon
     *         Virtual Private Cloud (VPC).
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
     * Specifies the VPC Security Groups associated with the cache clusters
     * in the replication group. <p>This parameter can be used only with
     * replication group containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication group containing cache clusters running in an Amazon
     *         Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the cache clusters
     * in the replication group. <p>This parameter can be used only with
     * replication group containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication group containing cache clusters running in an Amazon
     *         Virtual Private Cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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
    public ModifyReplicationGroupRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the replication group owner. </note>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent. <note>The Amazon SNS topic owner must be
     *         same as the replication group owner. </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the replication group owner. </note>
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent. <note>The Amazon SNS topic owner must be
     *         same as the replication group owner. </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     * notifications will be sent. <note>The Amazon SNS topic owner must be
     * same as the replication group owner. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which
     *         notifications will be sent. <note>The Amazon SNS topic owner must be
     *         same as the replication group owner. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * The name of the cache parameter group to apply to all of the clusters
     * in this replication group. This change is asynchronously applied as
     * soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     *
     * @return The name of the cache parameter group to apply to all of the clusters
     *         in this replication group. This change is asynchronously applied as
     *         soon as possible for parameters when the <i>ApplyImmediately</i>
     *         parameter is specified as <i>true</i> for this request.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to apply to all of the clusters
     * in this replication group. This change is asynchronously applied as
     * soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to apply to all of the clusters
     *         in this replication group. This change is asynchronously applied as
     *         soon as possible for parameters when the <i>ApplyImmediately</i>
     *         parameter is specified as <i>true</i> for this request.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to apply to all of the clusters
     * in this replication group. This change is asynchronously applied as
     * soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to apply to all of the clusters
     *         in this replication group. This change is asynchronously applied as
     *         soon as possible for parameters when the <i>ApplyImmediately</i>
     *         parameter is specified as <i>true</i> for this request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * <p>Valid values: <code>active</code> | <code>inactive</code>
     *
     * @return The status of the Amazon SNS notification topic for the replication
     *         group. Notifications are sent only if the status is <i>active</i>.
     *         <p>Valid values: <code>active</code> | <code>inactive</code>
     */
    public String getNotificationTopicStatus() {
        return notificationTopicStatus;
    }
    
    /**
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * <p>Valid values: <code>active</code> | <code>inactive</code>
     *
     * @param notificationTopicStatus The status of the Amazon SNS notification topic for the replication
     *         group. Notifications are sent only if the status is <i>active</i>.
     *         <p>Valid values: <code>active</code> | <code>inactive</code>
     */
    public void setNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
    }
    
    /**
     * The status of the Amazon SNS notification topic for the replication
     * group. Notifications are sent only if the status is <i>active</i>.
     * <p>Valid values: <code>active</code> | <code>inactive</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicStatus The status of the Amazon SNS notification topic for the replication
     *         group. Notifications are sent only if the status is <i>active</i>.
     *         <p>Valid values: <code>active</code> | <code>inactive</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
        return this;
    }

    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the replication group.
     * <p>If <code>false</code>, then changes to the nodes in the replication
     * group are applied on the next maintenance reboot, or the next failure
     * reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the replication group.
     *         <p>If <code>false</code>, then changes to the nodes in the replication
     *         group are applied on the next maintenance reboot, or the next failure
     *         reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the replication group.
     * <p>If <code>false</code>, then changes to the nodes in the replication
     * group are applied on the next maintenance reboot, or the next failure
     * reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     *
     * @param applyImmediately If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the replication group.
     *         <p>If <code>false</code>, then changes to the nodes in the replication
     *         group are applied on the next maintenance reboot, or the next failure
     *         reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the replication group.
     * <p>If <code>false</code>, then changes to the nodes in the replication
     * group are applied on the next maintenance reboot, or the next failure
     * reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the replication group.
     *         <p>If <code>false</code>, then changes to the nodes in the replication
     *         group are applied on the next maintenance reboot, or the next failure
     *         reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * If <code>true</code>, this parameter causes the modifications in this
     * request and any pending modifications to be applied, asynchronously
     * and as soon as possible, regardless of the
     * <i>PreferredMaintenanceWindow</i> setting for the replication group.
     * <p>If <code>false</code>, then changes to the nodes in the replication
     * group are applied on the next maintenance reboot, or the next failure
     * reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     * <code>false</code> <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the replication group.
     *         <p>If <code>false</code>, then changes to the nodes in the replication
     *         group are applied on the next maintenance reboot, or the next failure
     *         reboot, whichever occurs first. <p>Valid values: <code>true</code> |
     *         <code>false</code> <p>Default: <code>false</code>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * The upgraded version of the cache engine to be run on the cache
     * clusters in the replication group. <p><b>Important:</b> You can
     * upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     *
     * @return The upgraded version of the cache engine to be run on the cache
     *         clusters in the replication group. <p><b>Important:</b> You can
     *         upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing replication group and create it anew with
     *         the earlier engine version.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the cache
     * clusters in the replication group. <p><b>Important:</b> You can
     * upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the cache
     *         clusters in the replication group. <p><b>Important:</b> You can
     *         upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing replication group and create it anew with
     *         the earlier engine version.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the cache
     * clusters in the replication group. <p><b>Important:</b> You can
     * upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     * a Cache Engine and Version</a>), but you cannot downgrade to an
     * earlier engine version. If you want to use an earlier engine version,
     * you must delete the existing replication group and create it anew with
     * the earlier engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the cache
     *         clusters in the replication group. <p><b>Important:</b> You can
     *         upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/SelectEngine.html#VersionManagement">Selecting
     *         a Cache Engine and Version</a>), but you cannot downgrade to an
     *         earlier engine version. If you want to use an earlier engine version,
     *         you must delete the existing replication group and create it anew with
     *         the earlier engine version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withEngineVersion(String engineVersion) {
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
    public ModifyReplicationGroupRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
     * The number of days for which ElastiCache will retain automatic node
     * group snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     *
     * @return The number of days for which ElastiCache will retain automatic node
     *         group snapshots before deleting them. For example, if you set
     *         <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *         today will be retained for 5 days before being deleted.
     *         <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     *         to zero (0), backups are turned off.
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }
    
    /**
     * The number of days for which ElastiCache will retain automatic node
     * group snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     *
     * @param snapshotRetentionLimit The number of days for which ElastiCache will retain automatic node
     *         group snapshots before deleting them. For example, if you set
     *         <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *         today will be retained for 5 days before being deleted.
     *         <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     *         to zero (0), backups are turned off.
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }
    
    /**
     * The number of days for which ElastiCache will retain automatic node
     * group snapshots before deleting them. For example, if you set
     * <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     * today will be retained for 5 days before being deleted.
     * <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     * to zero (0), backups are turned off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotRetentionLimit The number of days for which ElastiCache will retain automatic node
     *         group snapshots before deleting them. For example, if you set
     *         <i>SnapshotRetentionLimit</i> to 5, then a snapshot that was taken
     *         today will be retained for 5 days before being deleted.
     *         <p><b>Important</b><br/>If the value of SnapshotRetentionLimit is set
     *         to zero (0), backups are turned off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     * <p>If you do not specify this parameter, then ElastiCache will
     * automatically choose an appropriate time range.
     *
     * @return The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of the node group specified by
     *         <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     *         <p>If you do not specify this parameter, then ElastiCache will
     *         automatically choose an appropriate time range.
     */
    public String getSnapshotWindow() {
        return snapshotWindow;
    }
    
    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     * <p>If you do not specify this parameter, then ElastiCache will
     * automatically choose an appropriate time range.
     *
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of the node group specified by
     *         <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     *         <p>If you do not specify this parameter, then ElastiCache will
     *         automatically choose an appropriate time range.
     */
    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }
    
    /**
     * The daily time range (in UTC) during which ElastiCache will begin
     * taking a daily snapshot of the node group specified by
     * <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     * <p>If you do not specify this parameter, then ElastiCache will
     * automatically choose an appropriate time range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache will begin
     *         taking a daily snapshot of the node group specified by
     *         <i>SnapshottingClusterId</i>. <p>Example: <code>05:00-09:00</code>
     *         <p>If you do not specify this parameter, then ElastiCache will
     *         automatically choose an appropriate time range.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * A valid cache node type that you want to scale this replication group
     * to. The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     *
     * @return A valid cache node type that you want to scale this replication group
     *         to. The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * A valid cache node type that you want to scale this replication group
     * to. The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     *
     * @param cacheNodeType A valid cache node type that you want to scale this replication group
     *         to. The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * A valid cache node type that you want to scale this replication group
     * to. The value of this parameter must be one of the
     * <i>ScaleUpModifications</i> values returned by the
     * <code>ListAllowedCacheNodeTypeModification</code> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType A valid cache node type that you want to scale this replication group
     *         to. The value of this parameter must be one of the
     *         <i>ScaleUpModifications</i> values returned by the
     *         <code>ListAllowedCacheNodeTypeModification</code> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
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
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getReplicationGroupDescription() != null) sb.append("ReplicationGroupDescription: " + getReplicationGroupDescription() + ",");
        if (getPrimaryClusterId() != null) sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getSnapshottingClusterId() != null) sb.append("SnapshottingClusterId: " + getSnapshottingClusterId() + ",");
        if (isAutomaticFailoverEnabled() != null) sb.append("AutomaticFailoverEnabled: " + isAutomaticFailoverEnabled() + ",");
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
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupDescription() == null) ? 0 : getReplicationGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshottingClusterId() == null) ? 0 : getSnapshottingClusterId().hashCode()); 
        hashCode = prime * hashCode + ((isAutomaticFailoverEnabled() == null) ? 0 : isAutomaticFailoverEnabled().hashCode()); 
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

        if (obj instanceof ModifyReplicationGroupRequest == false) return false;
        ModifyReplicationGroupRequest other = (ModifyReplicationGroupRequest)obj;
        
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        if (other.getReplicationGroupDescription() == null ^ this.getReplicationGroupDescription() == null) return false;
        if (other.getReplicationGroupDescription() != null && other.getReplicationGroupDescription().equals(this.getReplicationGroupDescription()) == false) return false; 
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null) return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false) return false; 
        if (other.getSnapshottingClusterId() == null ^ this.getSnapshottingClusterId() == null) return false;
        if (other.getSnapshottingClusterId() != null && other.getSnapshottingClusterId().equals(this.getSnapshottingClusterId()) == false) return false; 
        if (other.isAutomaticFailoverEnabled() == null ^ this.isAutomaticFailoverEnabled() == null) return false;
        if (other.isAutomaticFailoverEnabled() != null && other.isAutomaticFailoverEnabled().equals(this.isAutomaticFailoverEnabled()) == false) return false; 
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
    public ModifyReplicationGroupRequest clone() {
        
            return (ModifyReplicationGroupRequest) super.clone();
    }

}
    