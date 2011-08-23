/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about a Cache Cluster.
 * </p>
 */
public class CacheCluster {

    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     */
    private String cacheClusterId;

    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     */
    private String cacheNodeType;

    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     */
    private String engine;

    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     */
    private String engineVersion;

    /**
     * Specifies the current state of this Cache Cluster.
     */
    private String cacheClusterStatus;

    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     */
    private Integer numCacheNodes;

    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     */
    private String preferredAvailabilityZone;

    /**
     * Provides the date and time the Cache Cluster was created.
     */
    private java.util.Date cacheClusterCreateTime;

    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * Specifies the notification details the Cache Cluster contains.
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     */
    private java.util.List<CacheSecurityGroupMembership> cacheSecurityGroups;

    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     */
    private CacheParameterGroupStatus cacheParameterGroup;

    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     */
    private java.util.List<CacheNode> cacheNodes;

    /**
     * Indicates that minor version patches are applied automatically.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     *
     * @return Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     *
     * @param cacheClusterId Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }
    
    
    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     *
     * @return Specifies the name of the compute and memory capacity node type for
     *         the Cache Cluster.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     *
     * @param cacheNodeType Specifies the name of the compute and memory capacity node type for
     *         the Cache Cluster.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType Specifies the name of the compute and memory capacity node type for
     *         the Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }
    
    
    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     *
     * @return Provides the name of the cache engine to be used for this Cache
     *         Cluster.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     *
     * @param engine Provides the name of the cache engine to be used for this Cache
     *         Cluster.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Provides the name of the cache engine to be used for this Cache
     *         Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     *
     * @return Provides the cache engine version of the cache engine to be used for
     *         this Cache Cluster.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     *
     * @param engineVersion Provides the cache engine version of the cache engine to be used for
     *         this Cache Cluster.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Provides the cache engine version of the cache engine to be used for
     *         this Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * Specifies the current state of this Cache Cluster.
     *
     * @return Specifies the current state of this Cache Cluster.
     */
    public String getCacheClusterStatus() {
        return cacheClusterStatus;
    }
    
    /**
     * Specifies the current state of this Cache Cluster.
     *
     * @param cacheClusterStatus Specifies the current state of this Cache Cluster.
     */
    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }
    
    /**
     * Specifies the current state of this Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterStatus Specifies the current state of this Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
        return this;
    }
    
    
    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     *
     * @return Specifies the number of Cache Nodes the Cache Cluster contains.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     *
     * @param numCacheNodes Specifies the number of Cache Nodes the Cache Cluster contains.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes Specifies the number of Cache Nodes the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }
    
    
    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     *
     * @return Specifies the name of the Availability Zone the Cache Cluster is
     *         located in.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     *
     * @param preferredAvailabilityZone Specifies the name of the Availability Zone the Cache Cluster is
     *         located in.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone Specifies the name of the Availability Zone the Cache Cluster is
     *         located in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }
    
    
    /**
     * Provides the date and time the Cache Cluster was created.
     *
     * @return Provides the date and time the Cache Cluster was created.
     */
    public java.util.Date getCacheClusterCreateTime() {
        return cacheClusterCreateTime;
    }
    
    /**
     * Provides the date and time the Cache Cluster was created.
     *
     * @param cacheClusterCreateTime Provides the date and time the Cache Cluster was created.
     */
    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }
    
    /**
     * Provides the date and time the Cache Cluster was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterCreateTime Provides the date and time the Cache Cluster was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
        return this;
    }
    
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     *
     * @return Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }
    
    
    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     *
     * @return Specifies that changes to the Cache Cluster are pending. This element
     *         is only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     *
     * @param pendingModifiedValues Specifies that changes to the Cache Cluster are pending. This element
     *         is only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues Specifies that changes to the Cache Cluster are pending. This element
     *         is only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }
    
    
    /**
     * Specifies the notification details the Cache Cluster contains.
     *
     * @return Specifies the notification details the Cache Cluster contains.
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }
    
    /**
     * Specifies the notification details the Cache Cluster contains.
     *
     * @param notificationConfiguration Specifies the notification details the Cache Cluster contains.
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }
    
    /**
     * Specifies the notification details the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfiguration Specifies the notification details the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }
    
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     *
     * @return Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     */
    public java.util.List<CacheSecurityGroupMembership> getCacheSecurityGroups() {
        
        if (cacheSecurityGroups == null) {
            cacheSecurityGroups = new java.util.ArrayList<CacheSecurityGroupMembership>();
        }
        return cacheSecurityGroups;
    }
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     *
     * @param cacheSecurityGroups Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     */
    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        java.util.List<CacheSecurityGroupMembership> cacheSecurityGroupsCopy = new java.util.ArrayList<CacheSecurityGroupMembership>();
        if (cacheSecurityGroups != null) {
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        }
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;
    }
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheSecurityGroups(CacheSecurityGroupMembership... cacheSecurityGroups) {
        if (getCacheSecurityGroups() == null) setCacheSecurityGroups(new java.util.ArrayList<CacheSecurityGroupMembership>());
        for (CacheSecurityGroupMembership value : cacheSecurityGroups) {
            getCacheSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        java.util.List<CacheSecurityGroupMembership> cacheSecurityGroupsCopy = new java.util.ArrayList<CacheSecurityGroupMembership>();
        if (cacheSecurityGroups != null) {
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        }
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;

        return this;
    }
    
    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     *
     * @return Provides the status of the Cache Parameter Group assigned to the Cache
     *         Cluster.
     */
    public CacheParameterGroupStatus getCacheParameterGroup() {
        return cacheParameterGroup;
    }
    
    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     *
     * @param cacheParameterGroup Provides the status of the Cache Parameter Group assigned to the Cache
     *         Cluster.
     */
    public void setCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }
    
    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroup Provides the status of the Cache Parameter Group assigned to the Cache
     *         Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
        return this;
    }
    
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @return Specifies the list of Cache Nodes the Cache Cluster contains.
     */
    public java.util.List<CacheNode> getCacheNodes() {
        
        if (cacheNodes == null) {
            cacheNodes = new java.util.ArrayList<CacheNode>();
        }
        return cacheNodes;
    }
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @param cacheNodes Specifies the list of Cache Nodes the Cache Cluster contains.
     */
    public void setCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        java.util.List<CacheNode> cacheNodesCopy = new java.util.ArrayList<CacheNode>();
        if (cacheNodes != null) {
            cacheNodesCopy.addAll(cacheNodes);
        }
        this.cacheNodes = cacheNodesCopy;
    }
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodes Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheNodes(CacheNode... cacheNodes) {
        if (getCacheNodes() == null) setCacheNodes(new java.util.ArrayList<CacheNode>());
        for (CacheNode value : cacheNodes) {
            getCacheNodes().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodes Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        java.util.List<CacheNode> cacheNodesCopy = new java.util.ArrayList<CacheNode>();
        if (cacheNodes != null) {
            cacheNodesCopy.addAll(cacheNodes);
        }
        this.cacheNodes = cacheNodesCopy;

        return this;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @return Indicates that minor version patches are applied automatically.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheCluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @return Indicates that minor version patches are applied automatically.
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
        sb.append("CacheClusterId: " + cacheClusterId + ", ");
        sb.append("CacheNodeType: " + cacheNodeType + ", ");
        sb.append("Engine: " + engine + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("CacheClusterStatus: " + cacheClusterStatus + ", ");
        sb.append("NumCacheNodes: " + numCacheNodes + ", ");
        sb.append("PreferredAvailabilityZone: " + preferredAvailabilityZone + ", ");
        sb.append("CacheClusterCreateTime: " + cacheClusterCreateTime + ", ");
        sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        sb.append("PendingModifiedValues: " + pendingModifiedValues + ", ");
        sb.append("NotificationConfiguration: " + notificationConfiguration + ", ");
        sb.append("CacheSecurityGroups: " + cacheSecurityGroups + ", ");
        sb.append("CacheParameterGroup: " + cacheParameterGroup + ", ");
        sb.append("CacheNodes: " + cacheNodes + ", ");
        sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    