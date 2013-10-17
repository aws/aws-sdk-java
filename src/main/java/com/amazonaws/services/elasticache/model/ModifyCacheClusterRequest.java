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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheCluster(ModifyCacheClusterRequest) ModifyCacheCluster operation}.
 * <p>
 * The <i>ModifyCacheCluster</i> operation modifies the settings for a cache cluster. You can use this operation to change one or more cluster
 * configuration parameters by specifying the parameters and the new values.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheCluster(ModifyCacheClusterRequest)
 */
public class ModifyCacheClusterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The cache cluster identifier. This value is stored as a lowercase
     * string.
     */
    private String cacheClusterId;

    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <i>NumCacheNodes</i> is greater than the existing number of
     * cache nodes, then more nodes will be added. If the value is less than
     * the existing number of cache nodes, then cache nodes will be removed.
     * <p>If you are removing cache nodes, you must use the
     * <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     * specific cache nodes to be removed.
     */
    private Integer numCacheNodes;

    /**
     * A list of cache node IDs to be removed. A node ID is a numeric
     * identifier (0001, 0002, etc.). This parameter is only valid when
     * NumCacheNodes is less than the existing number of cache nodes. The
     * number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * and the value of <i>NumCacheNodes</i> in the request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemove;

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
     * The weekly time range (in UTC) during which system maintenance can
     * occur. Note that system maintenance may result in an outage. This
     * change is made immediately. If you are moving this window to the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window to ensure that pending changes are applied.
     */
    private String preferredMaintenanceWindow;

    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the cache
     * cluster owner. </note>
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
     * occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     * <p>Default: <code>false</code>
     */
    private Boolean applyImmediately;

    /**
     * The upgraded version of the cache engine to be run on the cache
     * cluster nodes.
     */
    private String engineVersion;

    /**
     * If <code>true</code>, then minor engine upgrades will be applied
     * automatically to the cache cluster during the maintenance window.
     * <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     * <code>true</code>
     */
    private Boolean autoMinorVersionUpgrade;

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
     * value for <i>NumCacheNodes</i> is greater than the existing number of
     * cache nodes, then more nodes will be added. If the value is less than
     * the existing number of cache nodes, then cache nodes will be removed.
     * <p>If you are removing cache nodes, you must use the
     * <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     * specific cache nodes to be removed.
     *
     * @return The number of cache nodes that the cache cluster should have. If the
     *         value for <i>NumCacheNodes</i> is greater than the existing number of
     *         cache nodes, then more nodes will be added. If the value is less than
     *         the existing number of cache nodes, then cache nodes will be removed.
     *         <p>If you are removing cache nodes, you must use the
     *         <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     *         specific cache nodes to be removed.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <i>NumCacheNodes</i> is greater than the existing number of
     * cache nodes, then more nodes will be added. If the value is less than
     * the existing number of cache nodes, then cache nodes will be removed.
     * <p>If you are removing cache nodes, you must use the
     * <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     * specific cache nodes to be removed.
     *
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. If the
     *         value for <i>NumCacheNodes</i> is greater than the existing number of
     *         cache nodes, then more nodes will be added. If the value is less than
     *         the existing number of cache nodes, then cache nodes will be removed.
     *         <p>If you are removing cache nodes, you must use the
     *         <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     *         specific cache nodes to be removed.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The number of cache nodes that the cache cluster should have. If the
     * value for <i>NumCacheNodes</i> is greater than the existing number of
     * cache nodes, then more nodes will be added. If the value is less than
     * the existing number of cache nodes, then cache nodes will be removed.
     * <p>If you are removing cache nodes, you must use the
     * <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     * specific cache nodes to be removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. If the
     *         value for <i>NumCacheNodes</i> is greater than the existing number of
     *         cache nodes, then more nodes will be added. If the value is less than
     *         the existing number of cache nodes, then cache nodes will be removed.
     *         <p>If you are removing cache nodes, you must use the
     *         <i>CacheNodeIdsToRemove</i> parameter to provide the IDs of the
     *         specific cache nodes to be removed.
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
     * NumCacheNodes is less than the existing number of cache nodes. The
     * number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * and the value of <i>NumCacheNodes</i> in the request.
     *
     * @return A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         NumCacheNodes is less than the existing number of cache nodes. The
     *         number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         and the value of <i>NumCacheNodes</i> in the request.
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
     * NumCacheNodes is less than the existing number of cache nodes. The
     * number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * and the value of <i>NumCacheNodes</i> in the request.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         NumCacheNodes is less than the existing number of cache nodes. The
     *         number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         and the value of <i>NumCacheNodes</i> in the request.
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
     * NumCacheNodes is less than the existing number of cache nodes. The
     * number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * and the value of <i>NumCacheNodes</i> in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         NumCacheNodes is less than the existing number of cache nodes. The
     *         number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         and the value of <i>NumCacheNodes</i> in the request.
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
     * NumCacheNodes is less than the existing number of cache nodes. The
     * number of cache node IDs supplied in this parameter must match the
     * difference between the existing number of cache nodes in the cluster
     * and the value of <i>NumCacheNodes</i> in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs to be removed. A node ID is a numeric
     *         identifier (0001, 0002, etc.). This parameter is only valid when
     *         NumCacheNodes is less than the existing number of cache nodes. The
     *         number of cache node IDs supplied in this parameter must match the
     *         difference between the existing number of cache nodes in the cluster
     *         and the value of <i>NumCacheNodes</i> in the request.
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
     * The weekly time range (in UTC) during which system maintenance can
     * occur. Note that system maintenance may result in an outage. This
     * change is made immediately. If you are moving this window to the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window to ensure that pending changes are applied.
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur. Note that system maintenance may result in an outage. This
     *         change is made immediately. If you are moving this window to the
     *         current time, there must be at least 120 minutes between the current
     *         time and end of the window to ensure that pending changes are applied.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. Note that system maintenance may result in an outage. This
     * change is made immediately. If you are moving this window to the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window to ensure that pending changes are applied.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur. Note that system maintenance may result in an outage. This
     *         change is made immediately. If you are moving this window to the
     *         current time, there must be at least 120 minutes between the current
     *         time and end of the window to ensure that pending changes are applied.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. Note that system maintenance may result in an outage. This
     * change is made immediately. If you are moving this window to the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window to ensure that pending changes are applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur. Note that system maintenance may result in an outage. This
     *         change is made immediately. If you are moving this window to the
     *         current time, there must be at least 120 minutes between the current
     *         time and end of the window to ensure that pending changes are applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyCacheClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the cache
     * cluster owner. </note>
     *
     * @return The Amazon Resource Name (ARN) of the SNS topic to which notifications
     *         will be sent. <note> The SNS topic owner must be same as the cache
     *         cluster owner. </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the cache
     * cluster owner. </note>
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the SNS topic to which notifications
     *         will be sent. <note> The SNS topic owner must be same as the cache
     *         cluster owner. </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic to which notifications
     * will be sent. <note> The SNS topic owner must be same as the cache
     * cluster owner. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the SNS topic to which notifications
     *         will be sent. <note> The SNS topic owner must be same as the cache
     *         cluster owner. </note>
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
     * occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     * <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     *         <p>Default: <code>false</code>
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
     * occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     * <p>Default: <code>false</code>
     *
     * @param applyImmediately If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     *         <p>Default: <code>false</code>
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
     * occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     * <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     *         <p>Default: <code>false</code>
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
     * occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     * <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, this parameter causes the modifications in this
     *         request and any pending modifications to be applied, asynchronously
     *         and as soon as possible, regardless of the
     *         <i>PreferredMaintenanceWindow</i> setting for the cache cluster. <p>If
     *         <code>false</code>, then changes to the cache cluster are applied on
     *         the next maintenance reboot, or the next failure reboot, whichever
     *         occurs first. <p>Valid values: <code>true</code> | <code>false</code>
     *         <p>Default: <code>false</code>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * The upgraded version of the cache engine to be run on the cache
     * cluster nodes.
     *
     * @return The upgraded version of the cache engine to be run on the cache
     *         cluster nodes.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the cache
     * cluster nodes.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the cache
     *         cluster nodes.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The upgraded version of the cache engine to be run on the cache
     * cluster nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The upgraded version of the cache engine to be run on the cache
     *         cluster nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyCacheClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * If <code>true</code>, then minor engine upgrades will be applied
     * automatically to the cache cluster during the maintenance window.
     * <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     * <code>true</code>
     *
     * @return If <code>true</code>, then minor engine upgrades will be applied
     *         automatically to the cache cluster during the maintenance window.
     *         <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     *         <code>true</code>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, then minor engine upgrades will be applied
     * automatically to the cache cluster during the maintenance window.
     * <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     * <code>true</code>
     *
     * @param autoMinorVersionUpgrade If <code>true</code>, then minor engine upgrades will be applied
     *         automatically to the cache cluster during the maintenance window.
     *         <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     *         <code>true</code>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, then minor engine upgrades will be applied
     * automatically to the cache cluster during the maintenance window.
     * <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     * <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade If <code>true</code>, then minor engine upgrades will be applied
     *         automatically to the cache cluster during the maintenance window.
     *         <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     *         <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyCacheClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * If <code>true</code>, then minor engine upgrades will be applied
     * automatically to the cache cluster during the maintenance window.
     * <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     * <code>true</code>
     *
     * @return If <code>true</code>, then minor engine upgrades will be applied
     *         automatically to the cache cluster during the maintenance window.
     *         <p>Valid values: <code>true</code> | <code>false</code> <p>Default:
     *         <code>true</code>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
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
        if (getCacheSecurityGroupNames() != null) sb.append("CacheSecurityGroupNames: " + getCacheSecurityGroupNames() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getNotificationTopicArn() != null) sb.append("NotificationTopicArn: " + getNotificationTopicArn() + ",");
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getNotificationTopicStatus() != null) sb.append("NotificationTopicStatus: " + getNotificationTopicStatus() + ",");
        if (isApplyImmediately() != null) sb.append("ApplyImmediately: " + isApplyImmediately() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() );
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
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicStatus() == null) ? 0 : getNotificationTopicStatus().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
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
        return true;
    }
    
}
    