/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all of the attributes of a specific cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/Cluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the cluster
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the cluster. For example, Available, Updating, Creating.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A group of settings that are currently being applied.
     * </p>
     */
    private ClusterPendingUpdates pendingUpdates;
    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     */
    private Integer numberOfShards;
    /**
     * <p>
     * A list of shards that are members of the cluster.
     * </p>
     */
    private java.util.List<Shard> shards;
    /**
     * <p>
     * Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * </p>
     */
    private String availabilityMode;
    /**
     * <p>
     * The cluster's configuration endpoint
     * </p>
     */
    private Endpoint clusterEndpoint;
    /**
     * <p>
     * The cluster's node type
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The Redis engine patch version used by the cluster
     * </p>
     */
    private String enginePatchVersion;
    /**
     * <p>
     * The name of the parameter group used by the cluster
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     * </p>
     */
    private String parameterGroupStatus;
    /**
     * <p>
     * A list of security groups used by the cluster
     * </p>
     */
    private java.util.List<SecurityGroupMembership> securityGroups;
    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     */
    private String subnetGroupName;
    /**
     * <p>
     * A flag to indicate if In-transit encryption is enabled
     * </p>
     */
    private Boolean tLSEnabled;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The SNS topic must be in Active status to receive notifications
     * </p>
     */
    private String snsTopicStatus;
    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     */
    private String maintenanceWindow;
    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example:
     * 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * The name of the Access Control List associated with this cluster.
     * </p>
     */
    private String aCLName;
    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     */
    private String dataTiering;

    /**
     * <p>
     * The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     * 
     * @param name
     *        The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     * 
     * @return The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     * </p>
     * 
     * @param name
     *        The user-supplied name of the cluster. This identifier is a unique key that identifies a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the cluster
     * </p>
     * 
     * @param description
     *        A description of the cluster
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the cluster
     * </p>
     * 
     * @return A description of the cluster
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the cluster
     * </p>
     * 
     * @param description
     *        A description of the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the cluster. For example, Available, Updating, Creating.
     * </p>
     * 
     * @param status
     *        The status of the cluster. For example, Available, Updating, Creating.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the cluster. For example, Available, Updating, Creating.
     * </p>
     * 
     * @return The status of the cluster. For example, Available, Updating, Creating.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the cluster. For example, Available, Updating, Creating.
     * </p>
     * 
     * @param status
     *        The status of the cluster. For example, Available, Updating, Creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A group of settings that are currently being applied.
     * </p>
     * 
     * @param pendingUpdates
     *        A group of settings that are currently being applied.
     */

    public void setPendingUpdates(ClusterPendingUpdates pendingUpdates) {
        this.pendingUpdates = pendingUpdates;
    }

    /**
     * <p>
     * A group of settings that are currently being applied.
     * </p>
     * 
     * @return A group of settings that are currently being applied.
     */

    public ClusterPendingUpdates getPendingUpdates() {
        return this.pendingUpdates;
    }

    /**
     * <p>
     * A group of settings that are currently being applied.
     * </p>
     * 
     * @param pendingUpdates
     *        A group of settings that are currently being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPendingUpdates(ClusterPendingUpdates pendingUpdates) {
        setPendingUpdates(pendingUpdates);
        return this;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @param numberOfShards
     *        The number of shards in the cluster
     */

    public void setNumberOfShards(Integer numberOfShards) {
        this.numberOfShards = numberOfShards;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @return The number of shards in the cluster
     */

    public Integer getNumberOfShards() {
        return this.numberOfShards;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @param numberOfShards
     *        The number of shards in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNumberOfShards(Integer numberOfShards) {
        setNumberOfShards(numberOfShards);
        return this;
    }

    /**
     * <p>
     * A list of shards that are members of the cluster.
     * </p>
     * 
     * @return A list of shards that are members of the cluster.
     */

    public java.util.List<Shard> getShards() {
        return shards;
    }

    /**
     * <p>
     * A list of shards that are members of the cluster.
     * </p>
     * 
     * @param shards
     *        A list of shards that are members of the cluster.
     */

    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new java.util.ArrayList<Shard>(shards);
    }

    /**
     * <p>
     * A list of shards that are members of the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShards(java.util.Collection)} or {@link #withShards(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param shards
     *        A list of shards that are members of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withShards(Shard... shards) {
        if (this.shards == null) {
            setShards(new java.util.ArrayList<Shard>(shards.length));
        }
        for (Shard ele : shards) {
            this.shards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of shards that are members of the cluster.
     * </p>
     * 
     * @param shards
     *        A list of shards that are members of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withShards(java.util.Collection<Shard> shards) {
        setShards(shards);
        return this;
    }

    /**
     * <p>
     * Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * </p>
     * 
     * @param availabilityMode
     *        Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * @see AZStatus
     */

    public void setAvailabilityMode(String availabilityMode) {
        this.availabilityMode = availabilityMode;
    }

    /**
     * <p>
     * Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * </p>
     * 
     * @return Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * @see AZStatus
     */

    public String getAvailabilityMode() {
        return this.availabilityMode;
    }

    /**
     * <p>
     * Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * </p>
     * 
     * @param availabilityMode
     *        Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AZStatus
     */

    public Cluster withAvailabilityMode(String availabilityMode) {
        setAvailabilityMode(availabilityMode);
        return this;
    }

    /**
     * <p>
     * Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * </p>
     * 
     * @param availabilityMode
     *        Indicates if the cluster has a Multi-AZ configuration (multiaz) or not (singleaz).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AZStatus
     */

    public Cluster withAvailabilityMode(AZStatus availabilityMode) {
        this.availabilityMode = availabilityMode.toString();
        return this;
    }

    /**
     * <p>
     * The cluster's configuration endpoint
     * </p>
     * 
     * @param clusterEndpoint
     *        The cluster's configuration endpoint
     */

    public void setClusterEndpoint(Endpoint clusterEndpoint) {
        this.clusterEndpoint = clusterEndpoint;
    }

    /**
     * <p>
     * The cluster's configuration endpoint
     * </p>
     * 
     * @return The cluster's configuration endpoint
     */

    public Endpoint getClusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * <p>
     * The cluster's configuration endpoint
     * </p>
     * 
     * @param clusterEndpoint
     *        The cluster's configuration endpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterEndpoint(Endpoint clusterEndpoint) {
        setClusterEndpoint(clusterEndpoint);
        return this;
    }

    /**
     * <p>
     * The cluster's node type
     * </p>
     * 
     * @param nodeType
     *        The cluster's node type
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The cluster's node type
     * </p>
     * 
     * @return The cluster's node type
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The cluster's node type
     * </p>
     * 
     * @param nodeType
     *        The cluster's node type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     * 
     * @param engineVersion
     *        The Redis engine version used by the cluster
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     * 
     * @return The Redis engine version used by the cluster
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     * 
     * @param engineVersion
     *        The Redis engine version used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The Redis engine patch version used by the cluster
     * </p>
     * 
     * @param enginePatchVersion
     *        The Redis engine patch version used by the cluster
     */

    public void setEnginePatchVersion(String enginePatchVersion) {
        this.enginePatchVersion = enginePatchVersion;
    }

    /**
     * <p>
     * The Redis engine patch version used by the cluster
     * </p>
     * 
     * @return The Redis engine patch version used by the cluster
     */

    public String getEnginePatchVersion() {
        return this.enginePatchVersion;
    }

    /**
     * <p>
     * The Redis engine patch version used by the cluster
     * </p>
     * 
     * @param enginePatchVersion
     *        The Redis engine patch version used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withEnginePatchVersion(String enginePatchVersion) {
        setEnginePatchVersion(enginePatchVersion);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group used by the cluster
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group used by the cluster
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group used by the cluster
     * </p>
     * 
     * @return The name of the parameter group used by the cluster
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group used by the cluster
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     */

    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     * </p>
     * 
     * @return The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     */

    public String getParameterGroupStatus() {
        return this.parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group used by the cluster, for example 'active' or 'applying'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withParameterGroupStatus(String parameterGroupStatus) {
        setParameterGroupStatus(parameterGroupStatus);
        return this;
    }

    /**
     * <p>
     * A list of security groups used by the cluster
     * </p>
     * 
     * @return A list of security groups used by the cluster
     */

    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of security groups used by the cluster
     * </p>
     * 
     * @param securityGroups
     *        A list of security groups used by the cluster
     */

    public void setSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroupMembership>(securityGroups);
    }

    /**
     * <p>
     * A list of security groups used by the cluster
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of security groups used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSecurityGroups(SecurityGroupMembership... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<SecurityGroupMembership>(securityGroups.length));
        }
        for (SecurityGroupMembership ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security groups used by the cluster
     * </p>
     * 
     * @param securityGroups
     *        A list of security groups used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     * 
     * @param subnetGroupName
     *        The name of the subnet group used by the cluster
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     * 
     * @return The name of the subnet group used by the cluster
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     * 
     * @param subnetGroupName
     *        The name of the subnet group used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * A flag to indicate if In-transit encryption is enabled
     * </p>
     * 
     * @param tLSEnabled
     *        A flag to indicate if In-transit encryption is enabled
     */

    public void setTLSEnabled(Boolean tLSEnabled) {
        this.tLSEnabled = tLSEnabled;
    }

    /**
     * <p>
     * A flag to indicate if In-transit encryption is enabled
     * </p>
     * 
     * @return A flag to indicate if In-transit encryption is enabled
     */

    public Boolean getTLSEnabled() {
        return this.tLSEnabled;
    }

    /**
     * <p>
     * A flag to indicate if In-transit encryption is enabled
     * </p>
     * 
     * @param tLSEnabled
     *        A flag to indicate if In-transit encryption is enabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTLSEnabled(Boolean tLSEnabled) {
        setTLSEnabled(tLSEnabled);
        return this;
    }

    /**
     * <p>
     * A flag to indicate if In-transit encryption is enabled
     * </p>
     * 
     * @return A flag to indicate if In-transit encryption is enabled
     */

    public Boolean isTLSEnabled() {
        return this.tLSEnabled;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the cluster
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the cluster
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the cluster.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS notification topic
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS notification topic
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS notification topic
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The SNS topic must be in Active status to receive notifications
     * </p>
     * 
     * @param snsTopicStatus
     *        The SNS topic must be in Active status to receive notifications
     */

    public void setSnsTopicStatus(String snsTopicStatus) {
        this.snsTopicStatus = snsTopicStatus;
    }

    /**
     * <p>
     * The SNS topic must be in Active status to receive notifications
     * </p>
     * 
     * @return The SNS topic must be in Active status to receive notifications
     */

    public String getSnsTopicStatus() {
        return this.snsTopicStatus;
    }

    /**
     * <p>
     * The SNS topic must be in Active status to receive notifications
     * </p>
     * 
     * @param snsTopicStatus
     *        The SNS topic must be in Active status to receive notifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSnsTopicStatus(String snsTopicStatus) {
        setSnsTopicStatus(snsTopicStatus);
        return this;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if
     *        you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being
     *        deleted.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @return The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if
     *         you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being
     *         deleted.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if
     *        you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * 
     * @param maintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period.
     */

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * 
     * @return Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as
     *         a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *         minute period.
     */

    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * 
     * @param maintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withMaintenanceWindow(String maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example:
     * 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example:
     *        05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time
     *        range.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example:
     * 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     * 
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.
     *         Example: 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate
     *         time range.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example:
     * 05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example:
     *        05:00-09:00 If you do not specify this parameter, MemoryDB automatically chooses an appropriate time
     *        range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * The name of the Access Control List associated with this cluster.
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List associated with this cluster.
     */

    public void setACLName(String aCLName) {
        this.aCLName = aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List associated with this cluster.
     * </p>
     * 
     * @return The name of the Access Control List associated with this cluster.
     */

    public String getACLName() {
        return this.aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List associated with this cluster.
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List associated with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withACLName(String aCLName) {
        setACLName(aCLName);
        return this;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @return When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @return When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @see DataTieringStatus
     */

    public void setDataTiering(String dataTiering) {
        this.dataTiering = dataTiering;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @return Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This
     *         parameter must be set when using r6gd nodes. For more information, see <a
     *         href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @see DataTieringStatus
     */

    public String getDataTiering() {
        return this.dataTiering;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataTieringStatus
     */

    public Cluster withDataTiering(String dataTiering) {
        setDataTiering(dataTiering);
        return this;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataTieringStatus
     */

    public Cluster withDataTiering(DataTieringStatus dataTiering) {
        this.dataTiering = dataTiering.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPendingUpdates() != null)
            sb.append("PendingUpdates: ").append(getPendingUpdates()).append(",");
        if (getNumberOfShards() != null)
            sb.append("NumberOfShards: ").append(getNumberOfShards()).append(",");
        if (getShards() != null)
            sb.append("Shards: ").append(getShards()).append(",");
        if (getAvailabilityMode() != null)
            sb.append("AvailabilityMode: ").append(getAvailabilityMode()).append(",");
        if (getClusterEndpoint() != null)
            sb.append("ClusterEndpoint: ").append(getClusterEndpoint()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEnginePatchVersion() != null)
            sb.append("EnginePatchVersion: ").append(getEnginePatchVersion()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getParameterGroupStatus() != null)
            sb.append("ParameterGroupStatus: ").append(getParameterGroupStatus()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getTLSEnabled() != null)
            sb.append("TLSEnabled: ").append(getTLSEnabled()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSnsTopicStatus() != null)
            sb.append("SnsTopicStatus: ").append(getSnsTopicStatus()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getACLName() != null)
            sb.append("ACLName: ").append(getACLName()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getDataTiering() != null)
            sb.append("DataTiering: ").append(getDataTiering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPendingUpdates() == null ^ this.getPendingUpdates() == null)
            return false;
        if (other.getPendingUpdates() != null && other.getPendingUpdates().equals(this.getPendingUpdates()) == false)
            return false;
        if (other.getNumberOfShards() == null ^ this.getNumberOfShards() == null)
            return false;
        if (other.getNumberOfShards() != null && other.getNumberOfShards().equals(this.getNumberOfShards()) == false)
            return false;
        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false)
            return false;
        if (other.getAvailabilityMode() == null ^ this.getAvailabilityMode() == null)
            return false;
        if (other.getAvailabilityMode() != null && other.getAvailabilityMode().equals(this.getAvailabilityMode()) == false)
            return false;
        if (other.getClusterEndpoint() == null ^ this.getClusterEndpoint() == null)
            return false;
        if (other.getClusterEndpoint() != null && other.getClusterEndpoint().equals(this.getClusterEndpoint()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEnginePatchVersion() == null ^ this.getEnginePatchVersion() == null)
            return false;
        if (other.getEnginePatchVersion() != null && other.getEnginePatchVersion().equals(this.getEnginePatchVersion()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterGroupStatus() == null ^ this.getParameterGroupStatus() == null)
            return false;
        if (other.getParameterGroupStatus() != null && other.getParameterGroupStatus().equals(this.getParameterGroupStatus()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getTLSEnabled() == null ^ this.getTLSEnabled() == null)
            return false;
        if (other.getTLSEnabled() != null && other.getTLSEnabled().equals(this.getTLSEnabled()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsTopicStatus() == null ^ this.getSnsTopicStatus() == null)
            return false;
        if (other.getSnsTopicStatus() != null && other.getSnsTopicStatus().equals(this.getSnsTopicStatus()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getACLName() == null ^ this.getACLName() == null)
            return false;
        if (other.getACLName() != null && other.getACLName().equals(this.getACLName()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getDataTiering() == null ^ this.getDataTiering() == null)
            return false;
        if (other.getDataTiering() != null && other.getDataTiering().equals(this.getDataTiering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPendingUpdates() == null) ? 0 : getPendingUpdates().hashCode());
        hashCode = prime * hashCode + ((getNumberOfShards() == null) ? 0 : getNumberOfShards().hashCode());
        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityMode() == null) ? 0 : getAvailabilityMode().hashCode());
        hashCode = prime * hashCode + ((getClusterEndpoint() == null) ? 0 : getClusterEndpoint().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEnginePatchVersion() == null) ? 0 : getEnginePatchVersion().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupStatus() == null) ? 0 : getParameterGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getTLSEnabled() == null) ? 0 : getTLSEnabled().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicStatus() == null) ? 0 : getSnsTopicStatus().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getACLName() == null) ? 0 : getACLName().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getDataTiering() == null) ? 0 : getDataTiering().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
