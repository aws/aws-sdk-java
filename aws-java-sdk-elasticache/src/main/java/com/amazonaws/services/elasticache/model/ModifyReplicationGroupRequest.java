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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ModifyReplicationGroups</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyReplicationGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * A description for the replication group. Maximum length is 255 characters.
     * </p>
     */
    private String replicationGroupDescription;
    /**
     * <p>
     * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified
     * cluster in the specified replication group to the primary role. The nodes of all other clusters in the
     * replication group are read replicas.
     * </p>
     */
    private String primaryClusterId;
    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set
     * for Redis (cluster mode enabled) replication groups.
     * </p>
     */
    private String snapshottingClusterId;
    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
    private Boolean automaticFailoverEnabled;
    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in this replication group. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual
     * Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheSecurityGroupNames;
    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private
     * Cloud (Amazon VPC).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
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
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;
    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is
     * asynchronously applied as soon as possible for parameters when the <code>ApplyImmediately</code> parameter is
     * specified as <code>true</code> for this request.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the
     * status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     */
    private String notificationTopicStatus;
    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this request and any pending modifications to be
     * applied, asynchronously and as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance reboot,
     * or the next failure reboot, whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting a
     * Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing replication group and create it anew with the earlier engine
     * version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * This parameter is currently disabled.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard)
     * specified by <code>SnapshottingClusterId</code>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     */
    @Deprecated
    private String nodeGroupId;

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier of the replication group to modify.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * 
     * @return The identifier of the replication group to modify.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The identifier of the replication group to modify.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier of the replication group to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255 characters.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A description for the replication group. Maximum length is 255 characters.
     */

    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255 characters.
     * </p>
     * 
     * @return A description for the replication group. Maximum length is 255 characters.
     */

    public String getReplicationGroupDescription() {
        return this.replicationGroupDescription;
    }

    /**
     * <p>
     * A description for the replication group. Maximum length is 255 characters.
     * </p>
     * 
     * @param replicationGroupDescription
     *        A description for the replication group. Maximum length is 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withReplicationGroupDescription(String replicationGroupDescription) {
        setReplicationGroupDescription(replicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified
     * cluster in the specified replication group to the primary role. The nodes of all other clusters in the
     * replication group are read replicas.
     * </p>
     * 
     * @param primaryClusterId
     *        For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the
     *        specified cluster in the specified replication group to the primary role. The nodes of all other clusters
     *        in the replication group are read replicas.
     */

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified
     * cluster in the specified replication group to the primary role. The nodes of all other clusters in the
     * replication group are read replicas.
     * </p>
     * 
     * @return For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the
     *         specified cluster in the specified replication group to the primary role. The nodes of all other clusters
     *         in the replication group are read replicas.
     */

    public String getPrimaryClusterId() {
        return this.primaryClusterId;
    }

    /**
     * <p>
     * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified
     * cluster in the specified replication group to the primary role. The nodes of all other clusters in the
     * replication group are read replicas.
     * </p>
     * 
     * @param primaryClusterId
     *        For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the
     *        specified cluster in the specified replication group to the primary role. The nodes of all other clusters
     *        in the replication group are read replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        setPrimaryClusterId(primaryClusterId);
        return this;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set
     * for Redis (cluster mode enabled) replication groups.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot
     *        be set for Redis (cluster mode enabled) replication groups.
     */

    public void setSnapshottingClusterId(String snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set
     * for Redis (cluster mode enabled) replication groups.
     * </p>
     * 
     * @return The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot
     *         be set for Redis (cluster mode enabled) replication groups.
     */

    public String getSnapshottingClusterId() {
        return this.snapshottingClusterId;
    }

    /**
     * <p>
     * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set
     * for Redis (cluster mode enabled) replication groups.
     * </p>
     * 
     * @param snapshottingClusterId
     *        The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot
     *        be set for Redis (cluster mode enabled) replication groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withSnapshottingClusterId(String snapshottingClusterId) {
        setSnapshottingClusterId(snapshottingClusterId);
        return this;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     * @param automaticFailoverEnabled
     *        Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *        encounters a failure.</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
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
     */

    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     * @return Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *         encounters a failure.</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
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
     */

    public Boolean getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     * @param automaticFailoverEnabled
     *        Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *        encounters a failure.</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
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
     */

    public ModifyReplicationGroupRequest withAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        setAutomaticFailoverEnabled(automaticFailoverEnabled);
        return this;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
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
     * @return Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *         encounters a failure.</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
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
     */

    public Boolean isAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in this replication group. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual
     * Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * </p>
     * 
     * @return A list of cache security group names to authorize for the clusters in this replication group. This change
     *         is asynchronously applied as soon as possible.</p>
     *         <p>
     *         This parameter can be used only with replication group containing clusters running outside of an Amazon
     *         Virtual Private Cloud (Amazon VPC).
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     */

    public java.util.List<String> getCacheSecurityGroupNames() {
        if (cacheSecurityGroupNames == null) {
            cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheSecurityGroupNames;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in this replication group. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual
     * Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to authorize for the clusters in this replication group. This change
     *        is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This parameter can be used only with replication group containing clusters running outside of an Amazon
     *        Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     */

    public void setCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }

        this.cacheSecurityGroupNames = new com.amazonaws.internal.SdkInternalList<String>(cacheSecurityGroupNames);
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in this replication group. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual
     * Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheSecurityGroupNames(java.util.Collection)} or
     * {@link #withCacheSecurityGroupNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to authorize for the clusters in this replication group. This change
     *        is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This parameter can be used only with replication group containing clusters running outside of an Amazon
     *        Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(String... cacheSecurityGroupNames) {
        if (this.cacheSecurityGroupNames == null) {
            setCacheSecurityGroupNames(new com.amazonaws.internal.SdkInternalList<String>(cacheSecurityGroupNames.length));
        }
        for (String ele : cacheSecurityGroupNames) {
            this.cacheSecurityGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security group names to authorize for the clusters in this replication group. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual
     * Private Cloud (Amazon VPC).
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * </p>
     * 
     * @param cacheSecurityGroupNames
     *        A list of cache security group names to authorize for the clusters in this replication group. This change
     *        is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This parameter can be used only with replication group containing clusters running outside of an Amazon
     *        Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters. Must not be <code>Default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        setCacheSecurityGroupNames(cacheSecurityGroupNames);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private
     * Cloud (Amazon VPC).
     * </p>
     * 
     * @return Specifies the VPC Security Groups associated with the clusters in the replication group.</p>
     *         <p>
     *         This parameter can be used only with replication group containing clusters running in an Amazon Virtual
     *         Private Cloud (Amazon VPC).
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private
     * Cloud (Amazon VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the VPC Security Groups associated with the clusters in the replication group.</p>
     *        <p>
     *        This parameter can be used only with replication group containing clusters running in an Amazon Virtual
     *        Private Cloud (Amazon VPC).
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private
     * Cloud (Amazon VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the VPC Security Groups associated with the clusters in the replication group.</p>
     *        <p>
     *        This parameter can be used only with replication group containing clusters running in an Amazon Virtual
     *        Private Cloud (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the VPC Security Groups associated with the clusters in the replication group.
     * </p>
     * <p>
     * This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private
     * Cloud (Amazon VPC).
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the VPC Security Groups associated with the clusters in the replication group.</p>
     *        <p>
     *        This parameter can be used only with replication group containing clusters running in an Amazon Virtual
     *        Private Cloud (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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

    public ModifyReplicationGroupRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be same as the replication group owner.
     *        </p>
     */

    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.</p> <note>
     *         <p>
     *         The Amazon SNS topic owner must be same as the replication group owner.
     *         </p>
     */

    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the replication group owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be same as the replication group owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withNotificationTopicArn(String notificationTopicArn) {
        setNotificationTopicArn(notificationTopicArn);
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is
     * asynchronously applied as soon as possible for parameters when the <code>ApplyImmediately</code> parameter is
     * specified as <code>true</code> for this request.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to apply to all of the clusters in this replication group. This
     *        change is asynchronously applied as soon as possible for parameters when the <code>ApplyImmediately</code>
     *        parameter is specified as <code>true</code> for this request.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is
     * asynchronously applied as soon as possible for parameters when the <code>ApplyImmediately</code> parameter is
     * specified as <code>true</code> for this request.
     * </p>
     * 
     * @return The name of the cache parameter group to apply to all of the clusters in this replication group. This
     *         change is asynchronously applied as soon as possible for parameters when the
     *         <code>ApplyImmediately</code> parameter is specified as <code>true</code> for this request.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is
     * asynchronously applied as soon as possible for parameters when the <code>ApplyImmediately</code> parameter is
     * specified as <code>true</code> for this request.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to apply to all of the clusters in this replication group. This
     *        change is asynchronously applied as soon as possible for parameters when the <code>ApplyImmediately</code>
     *        parameter is specified as <code>true</code> for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the
     * status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * 
     * @param notificationTopicStatus
     *        The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if
     *        the status is <code>active</code>.</p>
     *        <p>
     *        Valid values: <code>active</code> | <code>inactive</code>
     */

    public void setNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the
     * status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * 
     * @return The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if
     *         the status is <code>active</code>.</p>
     *         <p>
     *         Valid values: <code>active</code> | <code>inactive</code>
     */

    public String getNotificationTopicStatus() {
        return this.notificationTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the
     * status is <code>active</code>.
     * </p>
     * <p>
     * Valid values: <code>active</code> | <code>inactive</code>
     * </p>
     * 
     * @param notificationTopicStatus
     *        The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if
     *        the status is <code>active</code>.</p>
     *        <p>
     *        Valid values: <code>active</code> | <code>inactive</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withNotificationTopicStatus(String notificationTopicStatus) {
        setNotificationTopicStatus(notificationTopicStatus);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this request and any pending modifications to be
     * applied, asynchronously and as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance reboot,
     * or the next failure reboot, whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        If <code>true</code>, this parameter causes the modifications in this request and any pending
     *        modifications to be applied, asynchronously and as soon as possible, regardless of the
     *        <code>PreferredMaintenanceWindow</code> setting for the replication group.</p>
     *        <p>
     *        If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance
     *        reboot, or the next failure reboot, whichever occurs first.
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this request and any pending modifications to be
     * applied, asynchronously and as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance reboot,
     * or the next failure reboot, whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If <code>true</code>, this parameter causes the modifications in this request and any pending
     *         modifications to be applied, asynchronously and as soon as possible, regardless of the
     *         <code>PreferredMaintenanceWindow</code> setting for the replication group.</p>
     *         <p>
     *         If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance
     *         reboot, or the next failure reboot, whichever occurs first.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this request and any pending modifications to be
     * applied, asynchronously and as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance reboot,
     * or the next failure reboot, whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        If <code>true</code>, this parameter causes the modifications in this request and any pending
     *        modifications to be applied, asynchronously and as soon as possible, regardless of the
     *        <code>PreferredMaintenanceWindow</code> setting for the replication group.</p>
     *        <p>
     *        If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance
     *        reboot, or the next failure reboot, whichever occurs first.
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this parameter causes the modifications in this request and any pending modifications to be
     * applied, asynchronously and as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the replication group.
     * </p>
     * <p>
     * If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance reboot,
     * or the next failure reboot, whichever occurs first.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If <code>true</code>, this parameter causes the modifications in this request and any pending
     *         modifications to be applied, asynchronously and as soon as possible, regardless of the
     *         <code>PreferredMaintenanceWindow</code> setting for the replication group.</p>
     *         <p>
     *         If <code>false</code>, changes to the nodes in the replication group are applied on the next maintenance
     *         reboot, or the next failure reboot, whichever occurs first.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting a
     * Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing replication group and create it anew with the earlier engine
     * version.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the cache engine to be run on the clusters in the replication group.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you
     *        want to use an earlier engine version, you must delete the existing replication group and create it anew
     *        with the earlier engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting a
     * Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing replication group and create it anew with the earlier engine
     * version.
     * </p>
     * 
     * @return The upgraded version of the cache engine to be run on the clusters in the replication group.</p>
     *         <p>
     *         <b>Important:</b> You can upgrade to a newer engine version (see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *         >Selecting a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you
     *         want to use an earlier engine version, you must delete the existing replication group and create it anew
     *         with the earlier engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the replication group.
     * </p>
     * <p>
     * <b>Important:</b> You can upgrade to a newer engine version (see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement">Selecting a
     * Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you want to use an
     * earlier engine version, you must delete the existing replication group and create it anew with the earlier engine
     * version.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the cache engine to be run on the clusters in the replication group.</p>
     *        <p>
     *        <b>Important:</b> You can upgrade to a newer engine version (see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement"
     *        >Selecting a Cache Engine and Version</a>), but you cannot downgrade to an earlier engine version. If you
     *        want to use an earlier engine version, you must delete the existing replication group and create it anew
     *        with the earlier engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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

    public ModifyReplicationGroupRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
     * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting
     *        them. For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *        retained for 5 days before being deleted.</p>
     *        <p>
     *        <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * 
     * @return The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting
     *         them. For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today
     *         is retained for 5 days before being deleted.</p>
     *         <p>
     *         <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For
     * example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is retained for 5
     * days before being deleted.
     * </p>
     * <p>
     * <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting
     *        them. For example, if you set <code>SnapshotRetentionLimit</code> to 5, a snapshot that was taken today is
     *        retained for 5 days before being deleted.</p>
     *        <p>
     *        <b>Important</b> If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard)
     * specified by <code>SnapshottingClusterId</code>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group
     *        (shard) specified by <code>SnapshottingClusterId</code>.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard)
     * specified by <code>SnapshottingClusterId</code>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * 
     * @return The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group
     *         (shard) specified by <code>SnapshottingClusterId</code>.</p>
     *         <p>
     *         Example: <code>05:00-09:00</code>
     *         </p>
     *         <p>
     *         If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard)
     * specified by <code>SnapshottingClusterId</code>.
     * </p>
     * <p>
     * Example: <code>05:00-09:00</code>
     * </p>
     * <p>
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group
     *        (shard) specified by <code>SnapshottingClusterId</code>.</p>
     *        <p>
     *        Example: <code>05:00-09:00</code>
     *        </p>
     *        <p>
     *        If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     * 
     * @param cacheNodeType
     *        A valid cache node type that you want to scale this replication group to.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     * 
     * @return A valid cache node type that you want to scale this replication group to.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this replication group to.
     * </p>
     * 
     * @param cacheNodeType
     *        A valid cache node type that you want to scale this replication group to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     * 
     * @param nodeGroupId
     *        Deprecated. This parameter is not used.
     */
    @Deprecated
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     * 
     * @return Deprecated. This parameter is not used.
     */
    @Deprecated
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * Deprecated. This parameter is not used.
     * </p>
     * 
     * @param nodeGroupId
     *        Deprecated. This parameter is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ModifyReplicationGroupRequest withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getReplicationGroupDescription() != null)
            sb.append("ReplicationGroupDescription: ").append(getReplicationGroupDescription()).append(",");
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: ").append(getPrimaryClusterId()).append(",");
        if (getSnapshottingClusterId() != null)
            sb.append("SnapshottingClusterId: ").append(getSnapshottingClusterId()).append(",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: ").append(getAutomaticFailoverEnabled()).append(",");
        if (getCacheSecurityGroupNames() != null)
            sb.append("CacheSecurityGroupNames: ").append(getCacheSecurityGroupNames()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: ").append(getNotificationTopicArn()).append(",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getNotificationTopicStatus() != null)
            sb.append("NotificationTopicStatus: ").append(getNotificationTopicStatus()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: ").append(getNodeGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationGroupRequest == false)
            return false;
        ModifyReplicationGroupRequest other = (ModifyReplicationGroupRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupDescription() == null ^ this.getReplicationGroupDescription() == null)
            return false;
        if (other.getReplicationGroupDescription() != null && other.getReplicationGroupDescription().equals(this.getReplicationGroupDescription()) == false)
            return false;
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false)
            return false;
        if (other.getSnapshottingClusterId() == null ^ this.getSnapshottingClusterId() == null)
            return false;
        if (other.getSnapshottingClusterId() != null && other.getSnapshottingClusterId().equals(this.getSnapshottingClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverEnabled() == null ^ this.getAutomaticFailoverEnabled() == null)
            return false;
        if (other.getAutomaticFailoverEnabled() != null && other.getAutomaticFailoverEnabled().equals(this.getAutomaticFailoverEnabled()) == false)
            return false;
        if (other.getCacheSecurityGroupNames() == null ^ this.getCacheSecurityGroupNames() == null)
            return false;
        if (other.getCacheSecurityGroupNames() != null && other.getCacheSecurityGroupNames().equals(this.getCacheSecurityGroupNames()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getNotificationTopicStatus() == null ^ this.getNotificationTopicStatus() == null)
            return false;
        if (other.getNotificationTopicStatus() != null && other.getNotificationTopicStatus().equals(this.getNotificationTopicStatus()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
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
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getReplicationGroupDescription() == null) ? 0 : getReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode());
        hashCode = prime * hashCode + ((getSnapshottingClusterId() == null) ? 0 : getSnapshottingClusterId().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailoverEnabled() == null) ? 0 : getAutomaticFailoverEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getNotificationTopicStatus() == null) ? 0 : getNotificationTopicStatus().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationGroupRequest clone() {
        return (ModifyReplicationGroupRequest) super.clone();
    }

}
