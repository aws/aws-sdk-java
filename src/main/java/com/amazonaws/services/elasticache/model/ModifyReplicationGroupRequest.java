/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <i>ModifyReplicationGroup</i> operation modifies the settings for a replication group.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#modifyReplicationGroup(ModifyReplicationGroupRequest)
 */
public class ModifyReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable {

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
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication
     * groups containing cache clusters running outside of an Amazon Virtual
     * Private Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheSecurityGroupNames;

    /**
     * Specifies the VPC Security Groups associated with the cache clusters
     * in the replication group. <p>This parameter can be used only with
     * replication groups containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * The weekly time range (in UTC) during which replication group system
     * maintenance can occur. Note that system maintenance may result in an
     * outage. This change is made immediately. If you are moving this window
     * to the current time, there must be at least 120 minutes between the
     * current time and end of the window to ensure that pending changes are
     * applied.
     */
    private String preferredMaintenanceWindow;

    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the
     * replication group owner. </note>
     */
    private String notificationTopicArn;

    /**
     * The name of the cache parameter group to apply to all of the cache
     * nodes in this replication group. This change is asynchronously applied
     * as soon as possible for parameters when the <i>ApplyImmediately</i>
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
     * The upgraded version of the cache engine to be run on the nodes in the
     * replication group..
     */
    private String engineVersion;

    /**
     * Determines whether minor engine upgrades will be applied automatically
     * to all of the cache nodes in the replication group during the
     * maintenance window. A value of <code>true</code> allows these upgrades
     * to occur; <code>false</code> disables automatic upgrades.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * If this parameter is specified, ElastiCache will promote each of the
     * nodes in the specified cache cluster to the primary role. The nodes of
     * all other clusters in the replication group will be read replicas.
     */
    private String primaryClusterId;

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
     * A list of cache security group names to authorize for the clusters in
     * this replication group. This change is asynchronously applied as soon
     * as possible. <p>This parameter can be used only with replication
     * groups containing cache clusters running outside of an Amazon Virtual
     * Private Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     *
     * @return A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication
     *         groups containing cache clusters running outside of an Amazon Virtual
     *         Private Cloud (VPC). <p>Constraints: Must contain no more than 255
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
     * as possible. <p>This parameter can be used only with replication
     * groups containing cache clusters running outside of an Amazon Virtual
     * Private Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication
     *         groups containing cache clusters running outside of an Amazon Virtual
     *         Private Cloud (VPC). <p>Constraints: Must contain no more than 255
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
     * as possible. <p>This parameter can be used only with replication
     * groups containing cache clusters running outside of an Amazon Virtual
     * Private Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication
     *         groups containing cache clusters running outside of an Amazon Virtual
     *         Private Cloud (VPC). <p>Constraints: Must contain no more than 255
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
     * as possible. <p>This parameter can be used only with replication
     * groups containing cache clusters running outside of an Amazon Virtual
     * Private Cloud (VPC). <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of cache security group names to authorize for the clusters in
     *         this replication group. This change is asynchronously applied as soon
     *         as possible. <p>This parameter can be used only with replication
     *         groups containing cache clusters running outside of an Amazon Virtual
     *         Private Cloud (VPC). <p>Constraints: Must contain no more than 255
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
     * replication groups containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     *
     * @return Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication groups containing cache clusters running in an Amazon
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
     * replication groups containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication groups containing cache clusters running in an Amazon
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
     * replication groups containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication groups containing cache clusters running in an Amazon
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
     * replication groups containing cache clusters running in an Amazon
     * Virtual Private Cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds Specifies the VPC Security Groups associated with the cache clusters
     *         in the replication group. <p>This parameter can be used only with
     *         replication groups containing cache clusters running in an Amazon
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
     * The weekly time range (in UTC) during which replication group system
     * maintenance can occur. Note that system maintenance may result in an
     * outage. This change is made immediately. If you are moving this window
     * to the current time, there must be at least 120 minutes between the
     * current time and end of the window to ensure that pending changes are
     * applied.
     *
     * @return The weekly time range (in UTC) during which replication group system
     *         maintenance can occur. Note that system maintenance may result in an
     *         outage. This change is made immediately. If you are moving this window
     *         to the current time, there must be at least 120 minutes between the
     *         current time and end of the window to ensure that pending changes are
     *         applied.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which replication group system
     * maintenance can occur. Note that system maintenance may result in an
     * outage. This change is made immediately. If you are moving this window
     * to the current time, there must be at least 120 minutes between the
     * current time and end of the window to ensure that pending changes are
     * applied.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which replication group system
     *         maintenance can occur. Note that system maintenance may result in an
     *         outage. This change is made immediately. If you are moving this window
     *         to the current time, there must be at least 120 minutes between the
     *         current time and end of the window to ensure that pending changes are
     *         applied.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which replication group system
     * maintenance can occur. Note that system maintenance may result in an
     * outage. This change is made immediately. If you are moving this window
     * to the current time, there must be at least 120 minutes between the
     * current time and end of the window to ensure that pending changes are
     * applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which replication group system
     *         maintenance can occur. Note that system maintenance may result in an
     *         outage. This change is made immediately. If you are moving this window
     *         to the current time, there must be at least 120 minutes between the
     *         current time and end of the window to ensure that pending changes are
     *         applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReplicationGroupRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the
     * replication group owner. </note>
     *
     * @return The Amazon Resource Name (ARN) of the SNS topic to which notifications
     *         will be sent. <note> The SNS topic owner must be same as the
     *         replication group owner. </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the
     * replication group owner. </note>
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the SNS topic to which notifications
     *         will be sent. <note> The SNS topic owner must be same as the
     *         replication group owner. </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the
     * replication group owner. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the SNS topic to which notifications
     *         will be sent. <note> The SNS topic owner must be same as the
     *         replication group owner. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReplicationGroupRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * The name of the cache parameter group to apply to all of the cache
     * nodes in this replication group. This change is asynchronously applied
     * as soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     *
     * @return The name of the cache parameter group to apply to all of the cache
     *         nodes in this replication group. This change is asynchronously applied
     *         as soon as possible for parameters when the <i>ApplyImmediately</i>
     *         parameter is specified as <i>true</i> for this request.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to apply to all of the cache
     * nodes in this replication group. This change is asynchronously applied
     * as soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to apply to all of the cache
     *         nodes in this replication group. This change is asynchronously applied
     *         as soon as possible for parameters when the <i>ApplyImmediately</i>
     *         parameter is specified as <i>true</i> for this request.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to apply to all of the cache
     * nodes in this replication group. This change is asynchronously applied
     * as soon as possible for parameters when the <i>ApplyImmediately</i>
     * parameter is specified as <i>true</i> for this request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to apply to all of the cache
     *         nodes in this replication group. This change is asynchronously applied
     *         as soon as possible for parameters when the <i>ApplyImmediately</i>
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
     * The upgraded version of the cache engine to be run on the nodes in the
     * replication group..
     *
     * @return The upgraded version of the cache engine to be run on the nodes in the
     *         replication group..
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the nodes in the
     * replication group..
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the nodes in the
     *         replication group..
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the nodes in the
     * replication group..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the nodes in the
     *         replication group..
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReplicationGroupRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Determines whether minor engine upgrades will be applied automatically
     * to all of the cache nodes in the replication group during the
     * maintenance window. A value of <code>true</code> allows these upgrades
     * to occur; <code>false</code> disables automatic upgrades.
     *
     * @return Determines whether minor engine upgrades will be applied automatically
     *         to all of the cache nodes in the replication group during the
     *         maintenance window. A value of <code>true</code> allows these upgrades
     *         to occur; <code>false</code> disables automatic upgrades.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Determines whether minor engine upgrades will be applied automatically
     * to all of the cache nodes in the replication group during the
     * maintenance window. A value of <code>true</code> allows these upgrades
     * to occur; <code>false</code> disables automatic upgrades.
     *
     * @param autoMinorVersionUpgrade Determines whether minor engine upgrades will be applied automatically
     *         to all of the cache nodes in the replication group during the
     *         maintenance window. A value of <code>true</code> allows these upgrades
     *         to occur; <code>false</code> disables automatic upgrades.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Determines whether minor engine upgrades will be applied automatically
     * to all of the cache nodes in the replication group during the
     * maintenance window. A value of <code>true</code> allows these upgrades
     * to occur; <code>false</code> disables automatic upgrades.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Determines whether minor engine upgrades will be applied automatically
     *         to all of the cache nodes in the replication group during the
     *         maintenance window. A value of <code>true</code> allows these upgrades
     *         to occur; <code>false</code> disables automatic upgrades.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReplicationGroupRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Determines whether minor engine upgrades will be applied automatically
     * to all of the cache nodes in the replication group during the
     * maintenance window. A value of <code>true</code> allows these upgrades
     * to occur; <code>false</code> disables automatic upgrades.
     *
     * @return Determines whether minor engine upgrades will be applied automatically
     *         to all of the cache nodes in the replication group during the
     *         maintenance window. A value of <code>true</code> allows these upgrades
     *         to occur; <code>false</code> disables automatic upgrades.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * If this parameter is specified, ElastiCache will promote each of the
     * nodes in the specified cache cluster to the primary role. The nodes of
     * all other clusters in the replication group will be read replicas.
     *
     * @return If this parameter is specified, ElastiCache will promote each of the
     *         nodes in the specified cache cluster to the primary role. The nodes of
     *         all other clusters in the replication group will be read replicas.
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }
    
    /**
     * If this parameter is specified, ElastiCache will promote each of the
     * nodes in the specified cache cluster to the primary role. The nodes of
     * all other clusters in the replication group will be read replicas.
     *
     * @param primaryClusterId If this parameter is specified, ElastiCache will promote each of the
     *         nodes in the specified cache cluster to the primary role. The nodes of
     *         all other clusters in the replication group will be read replicas.
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }
    
    /**
     * If this parameter is specified, ElastiCache will promote each of the
     * nodes in the specified cache cluster to the primary role. The nodes of
     * all other clusters in the replication group will be read replicas.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primaryClusterId If this parameter is specified, ElastiCache will promote each of the
     *         nodes in the specified cache cluster to the primary role. The nodes of
     *         all other clusters in the replication group will be read replicas.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
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
        if (getCacheSecurityGroupNames() != null) sb.append("CacheSecurityGroupNames: " + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getNotificationTopicArn() != null) sb.append("NotificationTopicArn: " + getNotificationTopicArn() + ",");
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getNotificationTopicStatus() != null) sb.append("NotificationTopicStatus: " + getNotificationTopicStatus() + ",");
        if (isApplyImmediately() != null) sb.append("ApplyImmediately: " + isApplyImmediately() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getPrimaryClusterId() != null) sb.append("PrimaryClusterId: " + getPrimaryClusterId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupDescription() == null) ? 0 : getReplicationGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicStatus() == null) ? 0 : getNotificationTopicStatus().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode()); 
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
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null) return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false) return false; 
        return true;
    }
    
}
    