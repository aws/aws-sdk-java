/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Consists of a primary cluster that accepts writes and an associated secondary cluster that resides in a different AWS
 * region. The secondary cluster accepts only reads. The primary cluster automatically replicates updates to the
 * secondary cluster.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <b>GlobalReplicationGroupId</b> represents the name of the Global Datastore, which is what you use to associate a
 * secondary cluster.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/GlobalReplicationGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalReplicationGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupDescription;
    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     */
    private String status;
    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The Elasticache engine. For preview, it is Redis only.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GlobalReplicationGroupMember> members;
    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     */
    private Boolean clusterEnabled;
    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GlobalNodeGroup> globalNodeGroups;
    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean authTokenEnabled;
    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot modify the value of
     * <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a cluster
     * you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     * </p>
     */
    private Boolean transitEncryptionEnabled;
    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is created. To
     * enable encryption at rest on a replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     */
    private Boolean atRestEncryptionEnabled;

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global Datastore
     */

    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * 
     * @return The name of the Global Datastore
     */

    public String getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupDescription
     *        The optional description of the Global Datastore
     */

    public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    }

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     * 
     * @return The optional description of the Global Datastore
     */

    public String getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription;
    }

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupDescription
     *        The optional description of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        setGlobalReplicationGroupDescription(globalReplicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     * 
     * @param status
     *        The status of the Global Datastore
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     * 
     * @return The status of the Global Datastore
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     * 
     * @param status
     *        The status of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type of the Global Datastore
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     * 
     * @return The cache node type of the Global Datastore
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The Elasticache engine. For preview, it is Redis only.
     * </p>
     * 
     * @param engine
     *        The Elasticache engine. For preview, it is Redis only.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine. For preview, it is Redis only.
     * </p>
     * 
     * @return The Elasticache engine. For preview, it is Redis only.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The Elasticache engine. For preview, it is Redis only.
     * </p>
     * 
     * @param engine
     *        The Elasticache engine. For preview, it is Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     * </p>
     * 
     * @param engineVersion
     *        The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     * </p>
     * 
     * @return The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     * </p>
     * 
     * @param engineVersion
     *        The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     * 
     * @return The replication groups that comprise the Global Datastore.
     */

    public java.util.List<GlobalReplicationGroupMember> getMembers() {
        if (members == null) {
            members = new com.amazonaws.internal.SdkInternalList<GlobalReplicationGroupMember>();
        }
        return members;
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     * 
     * @param members
     *        The replication groups that comprise the Global Datastore.
     */

    public void setMembers(java.util.Collection<GlobalReplicationGroupMember> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new com.amazonaws.internal.SdkInternalList<GlobalReplicationGroupMember>(members);
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        The replication groups that comprise the Global Datastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withMembers(GlobalReplicationGroupMember... members) {
        if (this.members == null) {
            setMembers(new com.amazonaws.internal.SdkInternalList<GlobalReplicationGroupMember>(members.length));
        }
        for (GlobalReplicationGroupMember ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     * 
     * @param members
     *        The replication groups that comprise the Global Datastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withMembers(java.util.Collection<GlobalReplicationGroupMember> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     * 
     * @param clusterEnabled
     *        A flag that indicates whether the Global Datastore is cluster enabled.
     */

    public void setClusterEnabled(Boolean clusterEnabled) {
        this.clusterEnabled = clusterEnabled;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     * 
     * @return A flag that indicates whether the Global Datastore is cluster enabled.
     */

    public Boolean getClusterEnabled() {
        return this.clusterEnabled;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     * 
     * @param clusterEnabled
     *        A flag that indicates whether the Global Datastore is cluster enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withClusterEnabled(Boolean clusterEnabled) {
        setClusterEnabled(clusterEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     * 
     * @return A flag that indicates whether the Global Datastore is cluster enabled.
     */

    public Boolean isClusterEnabled() {
        return this.clusterEnabled;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * 
     * @return Indicates the slot configuration and global identifier for each slice group.
     */

    public java.util.List<GlobalNodeGroup> getGlobalNodeGroups() {
        if (globalNodeGroups == null) {
            globalNodeGroups = new com.amazonaws.internal.SdkInternalList<GlobalNodeGroup>();
        }
        return globalNodeGroups;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * 
     * @param globalNodeGroups
     *        Indicates the slot configuration and global identifier for each slice group.
     */

    public void setGlobalNodeGroups(java.util.Collection<GlobalNodeGroup> globalNodeGroups) {
        if (globalNodeGroups == null) {
            this.globalNodeGroups = null;
            return;
        }

        this.globalNodeGroups = new com.amazonaws.internal.SdkInternalList<GlobalNodeGroup>(globalNodeGroups);
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalNodeGroups(java.util.Collection)} or {@link #withGlobalNodeGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param globalNodeGroups
     *        Indicates the slot configuration and global identifier for each slice group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withGlobalNodeGroups(GlobalNodeGroup... globalNodeGroups) {
        if (this.globalNodeGroups == null) {
            setGlobalNodeGroups(new com.amazonaws.internal.SdkInternalList<GlobalNodeGroup>(globalNodeGroups.length));
        }
        for (GlobalNodeGroup ele : globalNodeGroups) {
            this.globalNodeGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * 
     * @param globalNodeGroups
     *        Indicates the slot configuration and global identifier for each slice group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withGlobalNodeGroups(java.util.Collection<GlobalNodeGroup> globalNodeGroups) {
        setGlobalNodeGroups(globalNodeGroups);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param authTokenEnabled
     *        A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAuthTokenEnabled() {
        return this.authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param authTokenEnabled
     *        A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withAuthTokenEnabled(Boolean authTokenEnabled) {
        setAuthTokenEnabled(authTokenEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A flag that enables using an <code>AuthToken</code> (password) when issuing Redis commands.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAuthTokenEnabled() {
        return this.authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot modify the value of
     * <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a cluster
     * you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        A flag that enables in-transit encryption when set to true. You cannot modify the value of
     *        <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a
     *        cluster you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     */

    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot modify the value of
     * <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a cluster
     * you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     * </p>
     * 
     * @return A flag that enables in-transit encryption when set to true. You cannot modify the value of
     *         <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a
     *         cluster you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     */

    public Boolean getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot modify the value of
     * <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a cluster
     * you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        A flag that enables in-transit encryption when set to true. You cannot modify the value of
     *        <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a
     *        cluster you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        setTransitEncryptionEnabled(transitEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot modify the value of
     * <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a cluster
     * you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     * </p>
     * 
     * @return A flag that enables in-transit encryption when set to true. You cannot modify the value of
     *         <code>TransitEncryptionEnabled</code> after the cluster is created. To enable in-transit encryption on a
     *         cluster you must set <code>TransitEncryptionEnabled</code> to true when you create a cluster.
     */

    public Boolean isTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is created. To
     * enable encryption at rest on a replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        A flag that enables encryption at rest when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is
     *        created. To enable encryption at rest on a replication group you must set
     *        <code>AtRestEncryptionEnabled</code> to <code>true</code> when you create the replication group.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code>, <code>4.x</code> or later.
     */

    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is created. To
     * enable encryption at rest on a replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * 
     * @return A flag that enables encryption at rest when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is
     *         created. To enable encryption at rest on a replication group you must set
     *         <code>AtRestEncryptionEnabled</code> to <code>true</code> when you create the replication group.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code>, <code>4.x</code> or later.
     */

    public Boolean getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is created. To
     * enable encryption at rest on a replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        A flag that enables encryption at rest when set to <code>true</code>.</p>
     *        <p>
     *        You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is
     *        created. To enable encryption at rest on a replication group you must set
     *        <code>AtRestEncryptionEnabled</code> to <code>true</code> when you create the replication group.
     *        </p>
     *        <p>
     *        <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *        <code>3.2.6</code>, <code>4.x</code> or later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalReplicationGroup withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        setAtRestEncryptionEnabled(atRestEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is created. To
     * enable encryption at rest on a replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     * <code>3.2.6</code>, <code>4.x</code> or later.
     * </p>
     * 
     * @return A flag that enables encryption at rest when set to <code>true</code>.</p>
     *         <p>
     *         You cannot modify the value of <code>AtRestEncryptionEnabled</code> after the replication group is
     *         created. To enable encryption at rest on a replication group you must set
     *         <code>AtRestEncryptionEnabled</code> to <code>true</code> when you create the replication group.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group in an Amazon VPC using redis version
     *         <code>3.2.6</code>, <code>4.x</code> or later.
     */

    public Boolean isAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: ").append(getGlobalReplicationGroupId()).append(",");
        if (getGlobalReplicationGroupDescription() != null)
            sb.append("GlobalReplicationGroupDescription: ").append(getGlobalReplicationGroupDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
        if (getClusterEnabled() != null)
            sb.append("ClusterEnabled: ").append(getClusterEnabled()).append(",");
        if (getGlobalNodeGroups() != null)
            sb.append("GlobalNodeGroups: ").append(getGlobalNodeGroups()).append(",");
        if (getAuthTokenEnabled() != null)
            sb.append("AuthTokenEnabled: ").append(getAuthTokenEnabled()).append(",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: ").append(getTransitEncryptionEnabled()).append(",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: ").append(getAtRestEncryptionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalReplicationGroup == false)
            return false;
        GlobalReplicationGroup other = (GlobalReplicationGroup) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getGlobalReplicationGroupDescription() == null ^ this.getGlobalReplicationGroupDescription() == null)
            return false;
        if (other.getGlobalReplicationGroupDescription() != null
                && other.getGlobalReplicationGroupDescription().equals(this.getGlobalReplicationGroupDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getClusterEnabled() == null ^ this.getClusterEnabled() == null)
            return false;
        if (other.getClusterEnabled() != null && other.getClusterEnabled().equals(this.getClusterEnabled()) == false)
            return false;
        if (other.getGlobalNodeGroups() == null ^ this.getGlobalNodeGroups() == null)
            return false;
        if (other.getGlobalNodeGroups() != null && other.getGlobalNodeGroups().equals(this.getGlobalNodeGroups()) == false)
            return false;
        if (other.getAuthTokenEnabled() == null ^ this.getAuthTokenEnabled() == null)
            return false;
        if (other.getAuthTokenEnabled() != null && other.getAuthTokenEnabled().equals(this.getAuthTokenEnabled()) == false)
            return false;
        if (other.getTransitEncryptionEnabled() == null ^ this.getTransitEncryptionEnabled() == null)
            return false;
        if (other.getTransitEncryptionEnabled() != null && other.getTransitEncryptionEnabled().equals(this.getTransitEncryptionEnabled()) == false)
            return false;
        if (other.getAtRestEncryptionEnabled() == null ^ this.getAtRestEncryptionEnabled() == null)
            return false;
        if (other.getAtRestEncryptionEnabled() != null && other.getAtRestEncryptionEnabled().equals(this.getAtRestEncryptionEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getGlobalReplicationGroupDescription() == null) ? 0 : getGlobalReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getClusterEnabled() == null) ? 0 : getClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getGlobalNodeGroups() == null) ? 0 : getGlobalNodeGroups().hashCode());
        hashCode = prime * hashCode + ((getAuthTokenEnabled() == null) ? 0 : getAuthTokenEnabled().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public GlobalReplicationGroup clone() {
        try {
            return (GlobalReplicationGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
