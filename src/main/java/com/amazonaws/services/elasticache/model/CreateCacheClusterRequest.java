/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createCacheCluster(CreateCacheClusterRequest) CreateCacheCluster operation}.
 * <p>
 * Creates a new Cache Cluster.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createCacheCluster(CreateCacheClusterRequest)
 */
public class CreateCacheClusterRequest extends AmazonWebServiceRequest {

    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     */
    private String cacheClusterId;

    /**
     * The number of Cache Nodes the Cache Cluster should have.
     */
    private Integer numCacheNodes;

    /**
     * The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     * values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     * cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     */
    private String cacheNodeType;

    /**
     * The name of the cache engine to be used for this Cache Cluster.
     * <note>Currently, <i>memcached</i> is the only cache engine supported
     * by the service.</note>
     */
    private String engine;

    /**
     * The version of the cache engine to be used for this cluster.
     */
    private String engineVersion;

    /**
     * The name of the cache parameter group to associate with this Cache
     * cluster. If this argument is omitted, the default CacheParameterGroup
     * for the specified engine will be used.
     */
    private String cacheParameterGroupName;

    /**
     * A list of Cache Security Group Names to associate with this Cache
     * Cluster.
     */
    private java.util.List<String> cacheSecurityGroupNames;

    /**
     * The EC2 Availability Zone that the Cache Cluster will be created in.
     * <p> In normal use, all CacheNodes belonging to a CacheCluster are
     * placed in the preferred availability zone. In rare circumstances, some
     * of the CacheNodes might temporarily be in a different availability
     * zone. <p> Default: System chosen (random) availability zone.
     */
    private String preferredAvailabilityZone;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     */
    private String preferredMaintenanceWindow;

    /**
     * The port number on which each of the Cache Nodes will accept
     * connections.
     */
    private Integer port;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note> The
     * Amazon SNS topic owner must be the same as the Cache Cluster owner.
     * </note>
     */
    private String notificationTopicArn;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Cache Cluster during the maintenance window. <p>Default:
     * <code>true</code>
     */
    private Boolean autoMinorVersionUpgrade;

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
     * @param cacheClusterId The Cache Cluster identifier. This parameter is
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 20 alphanumeric characters or hyphens.</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mycachecluster</code>
     * @param numCacheNodes The number of Cache Nodes the Cache Cluster
     * should have.
     * @param cacheNodeType The compute and memory capacity of nodes in a
     * Cache Cluster. <p>Valid values: <code>cache.m1.large | cache.m1.xlarge
     * | cache.m2.xlarge | cache.m2.2xlarge | cache.m2.4xlarge |
     * cache.c1.xlarge </code>
     * @param engine The name of the cache engine to be used for this Cache
     * Cluster. <note>Currently, <i>memcached</i> is the only cache engine
     * supported by the service.</note>
     * @param cacheSecurityGroupNames A list of Cache Security Group Names to
     * associate with this Cache Cluster.
     */
    public CreateCacheClusterRequest(String cacheClusterId, Integer numCacheNodes, String cacheNodeType, String engine, java.util.List<String> cacheSecurityGroupNames) {
        this.cacheClusterId = cacheClusterId;
        this.numCacheNodes = numCacheNodes;
        this.cacheNodeType = cacheNodeType;
        this.engine = engine;
        this.cacheSecurityGroupNames = cacheSecurityGroupNames;
    }

    
    
    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     *
     * @return The Cache Cluster identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     *
     * @param cacheClusterId The Cache Cluster identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The Cache Cluster identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>mycachecluster</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }
    
    
    /**
     * The number of Cache Nodes the Cache Cluster should have.
     *
     * @return The number of Cache Nodes the Cache Cluster should have.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The number of Cache Nodes the Cache Cluster should have.
     *
     * @param numCacheNodes The number of Cache Nodes the Cache Cluster should have.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The number of Cache Nodes the Cache Cluster should have.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The number of Cache Nodes the Cache Cluster should have.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }
    
    
    /**
     * The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     * values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     * cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     *
     * @return The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     *         values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     *         cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     * values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     * cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     *
     * @param cacheNodeType The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     *         values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     *         cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     * values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     * cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The compute and memory capacity of nodes in a Cache Cluster. <p>Valid
     *         values: <code>cache.m1.large | cache.m1.xlarge | cache.m2.xlarge |
     *         cache.m2.2xlarge | cache.m2.4xlarge | cache.c1.xlarge </code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }
    
    
    /**
     * The name of the cache engine to be used for this Cache Cluster.
     * <note>Currently, <i>memcached</i> is the only cache engine supported
     * by the service.</note>
     *
     * @return The name of the cache engine to be used for this Cache Cluster.
     *         <note>Currently, <i>memcached</i> is the only cache engine supported
     *         by the service.</note>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the cache engine to be used for this Cache Cluster.
     * <note>Currently, <i>memcached</i> is the only cache engine supported
     * by the service.</note>
     *
     * @param engine The name of the cache engine to be used for this Cache Cluster.
     *         <note>Currently, <i>memcached</i> is the only cache engine supported
     *         by the service.</note>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the cache engine to be used for this Cache Cluster.
     * <note>Currently, <i>memcached</i> is the only cache engine supported
     * by the service.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the cache engine to be used for this Cache Cluster.
     *         <note>Currently, <i>memcached</i> is the only cache engine supported
     *         by the service.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * The version of the cache engine to be used for this cluster.
     *
     * @return The version of the cache engine to be used for this cluster.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version of the cache engine to be used for this cluster.
     *
     * @param engineVersion The version of the cache engine to be used for this cluster.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version of the cache engine to be used for this cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version of the cache engine to be used for this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * The name of the cache parameter group to associate with this Cache
     * cluster. If this argument is omitted, the default CacheParameterGroup
     * for the specified engine will be used.
     *
     * @return The name of the cache parameter group to associate with this Cache
     *         cluster. If this argument is omitted, the default CacheParameterGroup
     *         for the specified engine will be used.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to associate with this Cache
     * cluster. If this argument is omitted, the default CacheParameterGroup
     * for the specified engine will be used.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to associate with this Cache
     *         cluster. If this argument is omitted, the default CacheParameterGroup
     *         for the specified engine will be used.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to associate with this Cache
     * cluster. If this argument is omitted, the default CacheParameterGroup
     * for the specified engine will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to associate with this Cache
     *         cluster. If this argument is omitted, the default CacheParameterGroup
     *         for the specified engine will be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * A list of Cache Security Group Names to associate with this Cache
     * Cluster.
     *
     * @return A list of Cache Security Group Names to associate with this Cache
     *         Cluster.
     */
    public java.util.List<String> getCacheSecurityGroupNames() {
        
        if (cacheSecurityGroupNames == null) {
            cacheSecurityGroupNames = new java.util.ArrayList<String>();
        }
        return cacheSecurityGroupNames;
    }
    
    /**
     * A list of Cache Security Group Names to associate with this Cache
     * Cluster.
     *
     * @param cacheSecurityGroupNames A list of Cache Security Group Names to associate with this Cache
     *         Cluster.
     */
    public void setCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
            return;
        }

        java.util.List<String> cacheSecurityGroupNamesCopy = new java.util.ArrayList<String>(cacheSecurityGroupNames.size());
        cacheSecurityGroupNamesCopy.addAll(cacheSecurityGroupNames);
        this.cacheSecurityGroupNames = cacheSecurityGroupNamesCopy;
    }
    
    /**
     * A list of Cache Security Group Names to associate with this Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of Cache Security Group Names to associate with this Cache
     *         Cluster.
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
     * A list of Cache Security Group Names to associate with this Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupNames A list of Cache Security Group Names to associate with this Cache
     *         Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withCacheSecurityGroupNames(java.util.Collection<String> cacheSecurityGroupNames) {
        if (cacheSecurityGroupNames == null) {
            this.cacheSecurityGroupNames = null;
        } else {
            java.util.List<String> cacheSecurityGroupNamesCopy = new java.util.ArrayList<String>(cacheSecurityGroupNames.size());
            cacheSecurityGroupNamesCopy.addAll(cacheSecurityGroupNames);
            this.cacheSecurityGroupNames = cacheSecurityGroupNamesCopy;
        }

        return this;
    }
    
    /**
     * The EC2 Availability Zone that the Cache Cluster will be created in.
     * <p> In normal use, all CacheNodes belonging to a CacheCluster are
     * placed in the preferred availability zone. In rare circumstances, some
     * of the CacheNodes might temporarily be in a different availability
     * zone. <p> Default: System chosen (random) availability zone.
     *
     * @return The EC2 Availability Zone that the Cache Cluster will be created in.
     *         <p> In normal use, all CacheNodes belonging to a CacheCluster are
     *         placed in the preferred availability zone. In rare circumstances, some
     *         of the CacheNodes might temporarily be in a different availability
     *         zone. <p> Default: System chosen (random) availability zone.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the Cache Cluster will be created in.
     * <p> In normal use, all CacheNodes belonging to a CacheCluster are
     * placed in the preferred availability zone. In rare circumstances, some
     * of the CacheNodes might temporarily be in a different availability
     * zone. <p> Default: System chosen (random) availability zone.
     *
     * @param preferredAvailabilityZone The EC2 Availability Zone that the Cache Cluster will be created in.
     *         <p> In normal use, all CacheNodes belonging to a CacheCluster are
     *         placed in the preferred availability zone. In rare circumstances, some
     *         of the CacheNodes might temporarily be in a different availability
     *         zone. <p> Default: System chosen (random) availability zone.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the Cache Cluster will be created in.
     * <p> In normal use, all CacheNodes belonging to a CacheCluster are
     * placed in the preferred availability zone. In rare circumstances, some
     * of the CacheNodes might temporarily be in a different availability
     * zone. <p> Default: System chosen (random) availability zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone The EC2 Availability Zone that the Cache Cluster will be created in.
     *         <p> In normal use, all CacheNodes belonging to a CacheCluster are
     *         placed in the preferred availability zone. In rare circumstances, some
     *         of the CacheNodes might temporarily be in a different availability
     *         zone. <p> Default: System chosen (random) availability zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }
    
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur. <p> Example: <code>sun:05:00-sun:09:00</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }
    
    
    /**
     * The port number on which each of the Cache Nodes will accept
     * connections.
     *
     * @return The port number on which each of the Cache Nodes will accept
     *         connections.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which each of the Cache Nodes will accept
     * connections.
     *
     * @param port The port number on which each of the Cache Nodes will accept
     *         connections.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which each of the Cache Nodes will accept
     * connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which each of the Cache Nodes will accept
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
     * Service (SNS) topic to which notifications will be sent. <note> The
     * Amazon SNS topic owner must be the same as the Cache Cluster owner.
     * </note>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent. <note> The
     *         Amazon SNS topic owner must be the same as the Cache Cluster owner.
     *         </note>
     */
    public String getNotificationTopicArn() {
        return notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note> The
     * Amazon SNS topic owner must be the same as the Cache Cluster owner.
     * </note>
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent. <note> The
     *         Amazon SNS topic owner must be the same as the Cache Cluster owner.
     *         </note>
     */
    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications will be sent. <note> The
     * Amazon SNS topic owner must be the same as the Cache Cluster owner.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic to which notifications will be sent. <note> The
     *         Amazon SNS topic owner must be the same as the Cache Cluster owner.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }
    
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Cache Cluster during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Cache Cluster during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Cache Cluster during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Cache Cluster during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Cache Cluster during the maintenance window. <p>Default:
     * <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Cache Cluster during the maintenance window. <p>Default:
     *         <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Cache Cluster during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Cache Cluster during the maintenance window. <p>Default:
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
        if (cacheClusterId != null) sb.append("CacheClusterId: " + cacheClusterId + ", ");
        if (numCacheNodes != null) sb.append("NumCacheNodes: " + numCacheNodes + ", ");
        if (cacheNodeType != null) sb.append("CacheNodeType: " + cacheNodeType + ", ");
        if (engine != null) sb.append("Engine: " + engine + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (cacheParameterGroupName != null) sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        if (cacheSecurityGroupNames != null) sb.append("CacheSecurityGroupNames: " + cacheSecurityGroupNames + ", ");
        if (preferredAvailabilityZone != null) sb.append("PreferredAvailabilityZone: " + preferredAvailabilityZone + ", ");
        if (preferredMaintenanceWindow != null) sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        if (port != null) sb.append("Port: " + port + ", ");
        if (notificationTopicArn != null) sb.append("NotificationTopicArn: " + notificationTopicArn + ", ");
        if (autoMinorVersionUpgrade != null) sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroupNames() == null) ? 0 : getCacheSecurityGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
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
        if (other.getCacheSecurityGroupNames() == null ^ this.getCacheSecurityGroupNames() == null) return false;
        if (other.getCacheSecurityGroupNames() != null && other.getCacheSecurityGroupNames().equals(this.getCacheSecurityGroupNames()) == false) return false; 
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null) return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null) return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        return true;
    }
    
}
    