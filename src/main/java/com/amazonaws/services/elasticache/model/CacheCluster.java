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


/**
 * <p>
 * Contains all of the attributes of a specific cache cluster.
 * </p>
 */
public class CacheCluster implements Serializable {

    /**
     * The user-supplied identifier of the cache cluster. This is a unique
     * key that identifies a cache cluster.
     */
    private String cacheClusterId;

    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     */
    private Endpoint configurationEndpoint;

    /**
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     */
    private String clientDownloadLandingPage;

    /**
     * The name of the compute and memory capacity node type for the cache
     * cluster.
     */
    private String cacheNodeType;

    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     * used for this cache cluster.
     */
    private String engine;

    /**
     * The version of the cache engine version that is used in this cache
     * cluster.
     */
    private String engineVersion;

    /**
     * The current state of this cache cluster - <i>creating</i>,
     * <i>available</i>, etc.
     */
    private String cacheClusterStatus;

    /**
     * The number of cache nodes in the cache cluster.
     */
    private Integer numCacheNodes;

    /**
     * The name of the Availability Zone in which the cache cluster is
     * located.
     */
    private String preferredAvailabilityZone;

    /**
     * The date and time the cache cluster was created.
     */
    private java.util.Date cacheClusterCreateTime;

    /**
     * The time range (in UTC) during which weekly system maintenance can
     * occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * A group of settings that will be applied to the cache cluster in the
     * future, or that are currently being applied.
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon
     * Simple Notification Service (SNS).
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership> cacheSecurityGroups;

    /**
     * The status of the cache parameter group.
     */
    private CacheParameterGroupStatus cacheParameterGroup;

    /**
     * The name of the cache subnet group associated with the cache cluster.
     */
    private String cacheSubnetGroupName;

    /**
     * A list of cache nodes that are members of the cache cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode> cacheNodes;

    /**
     * If <code>true</code>, then minor version patches are applied
     * automatically; if <code>false</code>, then automatic minor version
     * patches are disabled.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * A list of VPC Security Groups associated with the cache cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership> securityGroups;

    /**
     * The replication group to which this cache cluster belongs. If this
     * field is empty, the cache cluster is not associated with any
     * replication group.
     */
    private String replicationGroupId;

    /**
     * The user-supplied identifier of the cache cluster. This is a unique
     * key that identifies a cache cluster.
     *
     * @return The user-supplied identifier of the cache cluster. This is a unique
     *         key that identifies a cache cluster.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The user-supplied identifier of the cache cluster. This is a unique
     * key that identifies a cache cluster.
     *
     * @param cacheClusterId The user-supplied identifier of the cache cluster. This is a unique
     *         key that identifies a cache cluster.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The user-supplied identifier of the cache cluster. This is a unique
     * key that identifies a cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The user-supplied identifier of the cache cluster. This is a unique
     *         key that identifies a cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     *
     * @return Represents the information required for client programs to connect to
     *         a cache node.
     */
    public Endpoint getConfigurationEndpoint() {
        return configurationEndpoint;
    }
    
    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     *
     * @param configurationEndpoint Represents the information required for client programs to connect to
     *         a cache node.
     */
    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }
    
    /**
     * Represents the information required for client programs to connect to
     * a cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationEndpoint Represents the information required for client programs to connect to
     *         a cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
        return this;
    }

    /**
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     *
     * @return The URL of the web page where you can download the latest ElastiCache
     *         client library.
     */
    public String getClientDownloadLandingPage() {
        return clientDownloadLandingPage;
    }
    
    /**
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     *
     * @param clientDownloadLandingPage The URL of the web page where you can download the latest ElastiCache
     *         client library.
     */
    public void setClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
    }
    
    /**
     * The URL of the web page where you can download the latest ElastiCache
     * client library.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientDownloadLandingPage The URL of the web page where you can download the latest ElastiCache
     *         client library.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
        return this;
    }

    /**
     * The name of the compute and memory capacity node type for the cache
     * cluster.
     *
     * @return The name of the compute and memory capacity node type for the cache
     *         cluster.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The name of the compute and memory capacity node type for the cache
     * cluster.
     *
     * @param cacheNodeType The name of the compute and memory capacity node type for the cache
     *         cluster.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The name of the compute and memory capacity node type for the cache
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The name of the compute and memory capacity node type for the cache
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     * used for this cache cluster.
     *
     * @return The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     *         used for this cache cluster.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     * used for this cache cluster.
     *
     * @param engine The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     *         used for this cache cluster.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     * used for this cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the cache engine (<i>memcached</i> or <i>redis</i>) to be
     *         used for this cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version of the cache engine version that is used in this cache
     * cluster.
     *
     * @return The version of the cache engine version that is used in this cache
     *         cluster.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version of the cache engine version that is used in this cache
     * cluster.
     *
     * @param engineVersion The version of the cache engine version that is used in this cache
     *         cluster.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version of the cache engine version that is used in this cache
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version of the cache engine version that is used in this cache
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The current state of this cache cluster - <i>creating</i>,
     * <i>available</i>, etc.
     *
     * @return The current state of this cache cluster - <i>creating</i>,
     *         <i>available</i>, etc.
     */
    public String getCacheClusterStatus() {
        return cacheClusterStatus;
    }
    
    /**
     * The current state of this cache cluster - <i>creating</i>,
     * <i>available</i>, etc.
     *
     * @param cacheClusterStatus The current state of this cache cluster - <i>creating</i>,
     *         <i>available</i>, etc.
     */
    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }
    
    /**
     * The current state of this cache cluster - <i>creating</i>,
     * <i>available</i>, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterStatus The current state of this cache cluster - <i>creating</i>,
     *         <i>available</i>, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
        return this;
    }

    /**
     * The number of cache nodes in the cache cluster.
     *
     * @return The number of cache nodes in the cache cluster.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The number of cache nodes in the cache cluster.
     *
     * @param numCacheNodes The number of cache nodes in the cache cluster.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The number of cache nodes in the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The number of cache nodes in the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * The name of the Availability Zone in which the cache cluster is
     * located.
     *
     * @return The name of the Availability Zone in which the cache cluster is
     *         located.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the cache cluster is
     * located.
     *
     * @param preferredAvailabilityZone The name of the Availability Zone in which the cache cluster is
     *         located.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the cache cluster is
     * located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone The name of the Availability Zone in which the cache cluster is
     *         located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * The date and time the cache cluster was created.
     *
     * @return The date and time the cache cluster was created.
     */
    public java.util.Date getCacheClusterCreateTime() {
        return cacheClusterCreateTime;
    }
    
    /**
     * The date and time the cache cluster was created.
     *
     * @param cacheClusterCreateTime The date and time the cache cluster was created.
     */
    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }
    
    /**
     * The date and time the cache cluster was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterCreateTime The date and time the cache cluster was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
        return this;
    }

    /**
     * The time range (in UTC) during which weekly system maintenance can
     * occur.
     *
     * @return The time range (in UTC) during which weekly system maintenance can
     *         occur.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The time range (in UTC) during which weekly system maintenance can
     * occur.
     *
     * @param preferredMaintenanceWindow The time range (in UTC) during which weekly system maintenance can
     *         occur.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The time range (in UTC) during which weekly system maintenance can
     * occur.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The time range (in UTC) during which weekly system maintenance can
     *         occur.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * A group of settings that will be applied to the cache cluster in the
     * future, or that are currently being applied.
     *
     * @return A group of settings that will be applied to the cache cluster in the
     *         future, or that are currently being applied.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * A group of settings that will be applied to the cache cluster in the
     * future, or that are currently being applied.
     *
     * @param pendingModifiedValues A group of settings that will be applied to the cache cluster in the
     *         future, or that are currently being applied.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * A group of settings that will be applied to the cache cluster in the
     * future, or that are currently being applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues A group of settings that will be applied to the cache cluster in the
     *         future, or that are currently being applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon
     * Simple Notification Service (SNS).
     *
     * @return Describes a notification topic and its status. Notification topics are
     *         used for publishing ElastiCache events to subscribers using Amazon
     *         Simple Notification Service (SNS).
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }
    
    /**
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon
     * Simple Notification Service (SNS).
     *
     * @param notificationConfiguration Describes a notification topic and its status. Notification topics are
     *         used for publishing ElastiCache events to subscribers using Amazon
     *         Simple Notification Service (SNS).
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }
    
    /**
     * Describes a notification topic and its status. Notification topics are
     * used for publishing ElastiCache events to subscribers using Amazon
     * Simple Notification Service (SNS).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfiguration Describes a notification topic and its status. Notification topics are
     *         used for publishing ElastiCache events to subscribers using Amazon
     *         Simple Notification Service (SNS).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    /**
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     *
     * @return A list of cache security group elements, composed of name and status
     *         sub-elements.
     */
    public java.util.List<CacheSecurityGroupMembership> getCacheSecurityGroups() {
        if (cacheSecurityGroups == null) {
              cacheSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership>();
              cacheSecurityGroups.setAutoConstruct(true);
        }
        return cacheSecurityGroups;
    }
    
    /**
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     *
     * @param cacheSecurityGroups A list of cache security group elements, composed of name and status
     *         sub-elements.
     */
    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership> cacheSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership>(cacheSecurityGroups.size());
        cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;
    }
    
    /**
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups A list of cache security group elements, composed of name and status
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheSecurityGroups(CacheSecurityGroupMembership... cacheSecurityGroups) {
        if (getCacheSecurityGroups() == null) setCacheSecurityGroups(new java.util.ArrayList<CacheSecurityGroupMembership>(cacheSecurityGroups.length));
        for (CacheSecurityGroupMembership value : cacheSecurityGroups) {
            getCacheSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache security group elements, composed of name and status
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups A list of cache security group elements, composed of name and status
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership> cacheSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership>(cacheSecurityGroups.size());
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
            this.cacheSecurityGroups = cacheSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * The status of the cache parameter group.
     *
     * @return The status of the cache parameter group.
     */
    public CacheParameterGroupStatus getCacheParameterGroup() {
        return cacheParameterGroup;
    }
    
    /**
     * The status of the cache parameter group.
     *
     * @param cacheParameterGroup The status of the cache parameter group.
     */
    public void setCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }
    
    /**
     * The status of the cache parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroup The status of the cache parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
        return this;
    }

    /**
     * The name of the cache subnet group associated with the cache cluster.
     *
     * @return The name of the cache subnet group associated with the cache cluster.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group associated with the cache cluster.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group associated with the cache cluster.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group associated with the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group associated with the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * A list of cache nodes that are members of the cache cluster.
     *
     * @return A list of cache nodes that are members of the cache cluster.
     */
    public java.util.List<CacheNode> getCacheNodes() {
        if (cacheNodes == null) {
              cacheNodes = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode>();
              cacheNodes.setAutoConstruct(true);
        }
        return cacheNodes;
    }
    
    /**
     * A list of cache nodes that are members of the cache cluster.
     *
     * @param cacheNodes A list of cache nodes that are members of the cache cluster.
     */
    public void setCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        if (cacheNodes == null) {
            this.cacheNodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode> cacheNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode>(cacheNodes.size());
        cacheNodesCopy.addAll(cacheNodes);
        this.cacheNodes = cacheNodesCopy;
    }
    
    /**
     * A list of cache nodes that are members of the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodes A list of cache nodes that are members of the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheNodes(CacheNode... cacheNodes) {
        if (getCacheNodes() == null) setCacheNodes(new java.util.ArrayList<CacheNode>(cacheNodes.length));
        for (CacheNode value : cacheNodes) {
            getCacheNodes().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache nodes that are members of the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodes A list of cache nodes that are members of the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        if (cacheNodes == null) {
            this.cacheNodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode> cacheNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode>(cacheNodes.size());
            cacheNodesCopy.addAll(cacheNodes);
            this.cacheNodes = cacheNodesCopy;
        }

        return this;
    }

    /**
     * If <code>true</code>, then minor version patches are applied
     * automatically; if <code>false</code>, then automatic minor version
     * patches are disabled.
     *
     * @return If <code>true</code>, then minor version patches are applied
     *         automatically; if <code>false</code>, then automatic minor version
     *         patches are disabled.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, then minor version patches are applied
     * automatically; if <code>false</code>, then automatic minor version
     * patches are disabled.
     *
     * @param autoMinorVersionUpgrade If <code>true</code>, then minor version patches are applied
     *         automatically; if <code>false</code>, then automatic minor version
     *         patches are disabled.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, then minor version patches are applied
     * automatically; if <code>false</code>, then automatic minor version
     * patches are disabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade If <code>true</code>, then minor version patches are applied
     *         automatically; if <code>false</code>, then automatic minor version
     *         patches are disabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * If <code>true</code>, then minor version patches are applied
     * automatically; if <code>false</code>, then automatic minor version
     * patches are disabled.
     *
     * @return If <code>true</code>, then minor version patches are applied
     *         automatically; if <code>false</code>, then automatic minor version
     *         patches are disabled.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * A list of VPC Security Groups associated with the cache cluster.
     *
     * @return A list of VPC Security Groups associated with the cache cluster.
     */
    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * A list of VPC Security Groups associated with the cache cluster.
     *
     * @param securityGroups A list of VPC Security Groups associated with the cache cluster.
     */
    public void setSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * A list of VPC Security Groups associated with the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of VPC Security Groups associated with the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withSecurityGroups(SecurityGroupMembership... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<SecurityGroupMembership>(securityGroups.length));
        for (SecurityGroupMembership value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of VPC Security Groups associated with the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of VPC Security Groups associated with the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * The replication group to which this cache cluster belongs. If this
     * field is empty, the cache cluster is not associated with any
     * replication group.
     *
     * @return The replication group to which this cache cluster belongs. If this
     *         field is empty, the cache cluster is not associated with any
     *         replication group.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The replication group to which this cache cluster belongs. If this
     * field is empty, the cache cluster is not associated with any
     * replication group.
     *
     * @param replicationGroupId The replication group to which this cache cluster belongs. If this
     *         field is empty, the cache cluster is not associated with any
     *         replication group.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The replication group to which this cache cluster belongs. If this
     * field is empty, the cache cluster is not associated with any
     * replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The replication group to which this cache cluster belongs. If this
     *         field is empty, the cache cluster is not associated with any
     *         replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
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
        if (getConfigurationEndpoint() != null) sb.append("ConfigurationEndpoint: " + getConfigurationEndpoint() + ",");
        if (getClientDownloadLandingPage() != null) sb.append("ClientDownloadLandingPage: " + getClientDownloadLandingPage() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheClusterStatus() != null) sb.append("CacheClusterStatus: " + getCacheClusterStatus() + ",");
        if (getNumCacheNodes() != null) sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getPreferredAvailabilityZone() != null) sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCacheClusterCreateTime() != null) sb.append("CacheClusterCreateTime: " + getCacheClusterCreateTime() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null) sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getNotificationConfiguration() != null) sb.append("NotificationConfiguration: " + getNotificationConfiguration() + ",");
        if (getCacheSecurityGroups() != null) sb.append("CacheSecurityGroups: " + getCacheSecurityGroups() + ",");
        if (getCacheParameterGroup() != null) sb.append("CacheParameterGroup: " + getCacheParameterGroup() + ",");
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheNodes() != null) sb.append("CacheNodes: " + getCacheNodes() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheCluster == false) return false;
        CacheCluster other = (CacheCluster)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null) return false;
        if (other.getConfigurationEndpoint() != null && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false) return false; 
        if (other.getClientDownloadLandingPage() == null ^ this.getClientDownloadLandingPage() == null) return false;
        if (other.getClientDownloadLandingPage() != null && other.getClientDownloadLandingPage().equals(this.getClientDownloadLandingPage()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getCacheClusterStatus() == null ^ this.getCacheClusterStatus() == null) return false;
        if (other.getCacheClusterStatus() != null && other.getCacheClusterStatus().equals(this.getCacheClusterStatus()) == false) return false; 
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null) return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false) return false; 
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null) return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false) return false; 
        if (other.getCacheClusterCreateTime() == null ^ this.getCacheClusterCreateTime() == null) return false;
        if (other.getCacheClusterCreateTime() != null && other.getCacheClusterCreateTime().equals(this.getCacheClusterCreateTime()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null) return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false) return false; 
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null) return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false) return false; 
        if (other.getCacheSecurityGroups() == null ^ this.getCacheSecurityGroups() == null) return false;
        if (other.getCacheSecurityGroups() != null && other.getCacheSecurityGroups().equals(this.getCacheSecurityGroups()) == false) return false; 
        if (other.getCacheParameterGroup() == null ^ this.getCacheParameterGroup() == null) return false;
        if (other.getCacheParameterGroup() != null && other.getCacheParameterGroup().equals(this.getCacheParameterGroup()) == false) return false; 
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getCacheNodes() == null ^ this.getCacheNodes() == null) return false;
        if (other.getCacheNodes() != null && other.getCacheNodes().equals(this.getCacheNodes()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        return true;
    }
    
}
    