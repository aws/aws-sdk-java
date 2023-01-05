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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration.
     * </p>
     */
    private Boolean associateDefaultSecurityGroup;
    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     * </p>
     */
    private Long bandwidthThrottling;
    /**
     * <p>
     * Whether to create a Public IP for the Recovery Instance by default.
     * </p>
     */
    private Boolean createPublicIP;
    /**
     * <p>
     * The data plane routing mechanism that will be used for replication.
     * </p>
     */
    private String dataPlaneRouting;
    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     */
    private String defaultLargeStagingDiskType;
    /**
     * <p>
     * The type of EBS encryption to be used during replication.
     * </p>
     */
    private String ebsEncryption;
    /**
     * <p>
     * The ARN of the EBS encryption key to be used during replication.
     * </p>
     */
    private String ebsEncryptionKeyArn;
    /**
     * <p>
     * The name of the Replication Configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Point in time (PIT) policy to manage snapshots taken during replication.
     * </p>
     */
    private java.util.List<PITPolicyRule> pitPolicy;
    /**
     * <p>
     * The configuration of the disks of the Source Server to be replicated.
     * </p>
     */
    private java.util.List<ReplicationConfigurationReplicatedDisk> replicatedDisks;
    /**
     * <p>
     * The instance type to be used for the replication server.
     * </p>
     */
    private String replicationServerInstanceType;
    /**
     * <p>
     * The security group IDs that will be used by the replication server.
     * </p>
     */
    private java.util.List<String> replicationServersSecurityGroupsIDs;
    /**
     * <p>
     * The ID of the Source Server for this Replication Configuration.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * The subnet to be used by the replication staging area.
     * </p>
     */
    private String stagingAreaSubnetId;
    /**
     * <p>
     * A set of tags to be associated with all resources created in the replication staging area: EC2 replication
     * server, EBS volumes, EBS snapshots, etc.
     * </p>
     */
    private java.util.Map<String, String> stagingAreaTags;
    /**
     * <p>
     * Whether to use a dedicated Replication Server in the replication staging area.
     * </p>
     */
    private Boolean useDedicatedReplicationServer;

    /**
     * <p>
     * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Whether to associate the default Elastic Disaster Recovery Security group with the Replication
     *        Configuration.
     */

    public void setAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        this.associateDefaultSecurityGroup = associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration.
     * </p>
     * 
     * @return Whether to associate the default Elastic Disaster Recovery Security group with the Replication
     *         Configuration.
     */

    public Boolean getAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Whether to associate the default Elastic Disaster Recovery Security group with the Replication
     *        Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        setAssociateDefaultSecurityGroup(associateDefaultSecurityGroup);
        return this;
    }

    /**
     * <p>
     * Whether to associate the default Elastic Disaster Recovery Security group with the Replication Configuration.
     * </p>
     * 
     * @return Whether to associate the default Elastic Disaster Recovery Security group with the Replication
     *         Configuration.
     */

    public Boolean isAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     */

    public void setBandwidthThrottling(Long bandwidthThrottling) {
        this.bandwidthThrottling = bandwidthThrottling;
    }

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     * </p>
     * 
     * @return Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     */

    public Long getBandwidthThrottling() {
        return this.bandwidthThrottling;
    }

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Configure bandwidth throttling for the outbound data transfer rate of the Source Server in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withBandwidthThrottling(Long bandwidthThrottling) {
        setBandwidthThrottling(bandwidthThrottling);
        return this;
    }

    /**
     * <p>
     * Whether to create a Public IP for the Recovery Instance by default.
     * </p>
     * 
     * @param createPublicIP
     *        Whether to create a Public IP for the Recovery Instance by default.
     */

    public void setCreatePublicIP(Boolean createPublicIP) {
        this.createPublicIP = createPublicIP;
    }

    /**
     * <p>
     * Whether to create a Public IP for the Recovery Instance by default.
     * </p>
     * 
     * @return Whether to create a Public IP for the Recovery Instance by default.
     */

    public Boolean getCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Whether to create a Public IP for the Recovery Instance by default.
     * </p>
     * 
     * @param createPublicIP
     *        Whether to create a Public IP for the Recovery Instance by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withCreatePublicIP(Boolean createPublicIP) {
        setCreatePublicIP(createPublicIP);
        return this;
    }

    /**
     * <p>
     * Whether to create a Public IP for the Recovery Instance by default.
     * </p>
     * 
     * @return Whether to create a Public IP for the Recovery Instance by default.
     */

    public Boolean isCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * The data plane routing mechanism that will be used for replication.
     * </p>
     * 
     * @param dataPlaneRouting
     *        The data plane routing mechanism that will be used for replication.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public void setDataPlaneRouting(String dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting;
    }

    /**
     * <p>
     * The data plane routing mechanism that will be used for replication.
     * </p>
     * 
     * @return The data plane routing mechanism that will be used for replication.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public String getDataPlaneRouting() {
        return this.dataPlaneRouting;
    }

    /**
     * <p>
     * The data plane routing mechanism that will be used for replication.
     * </p>
     * 
     * @param dataPlaneRouting
     *        The data plane routing mechanism that will be used for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public UpdateReplicationConfigurationRequest withDataPlaneRouting(String dataPlaneRouting) {
        setDataPlaneRouting(dataPlaneRouting);
        return this;
    }

    /**
     * <p>
     * The data plane routing mechanism that will be used for replication.
     * </p>
     * 
     * @param dataPlaneRouting
     *        The data plane routing mechanism that will be used for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public UpdateReplicationConfigurationRequest withDataPlaneRouting(ReplicationConfigurationDataPlaneRouting dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting.toString();
        return this;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        The Staging Disk EBS volume type to be used during replication.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public void setDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @return The Staging Disk EBS volume type to be used during replication.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public String getDefaultLargeStagingDiskType() {
        return this.defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        The Staging Disk EBS volume type to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public UpdateReplicationConfigurationRequest withDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        setDefaultLargeStagingDiskType(defaultLargeStagingDiskType);
        return this;
    }

    /**
     * <p>
     * The Staging Disk EBS volume type to be used during replication.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        The Staging Disk EBS volume type to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public UpdateReplicationConfigurationRequest withDefaultLargeStagingDiskType(ReplicationConfigurationDefaultLargeStagingDiskType defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * The type of EBS encryption to be used during replication.
     * </p>
     * 
     * @param ebsEncryption
     *        The type of EBS encryption to be used during replication.
     * @see ReplicationConfigurationEbsEncryption
     */

    public void setEbsEncryption(String ebsEncryption) {
        this.ebsEncryption = ebsEncryption;
    }

    /**
     * <p>
     * The type of EBS encryption to be used during replication.
     * </p>
     * 
     * @return The type of EBS encryption to be used during replication.
     * @see ReplicationConfigurationEbsEncryption
     */

    public String getEbsEncryption() {
        return this.ebsEncryption;
    }

    /**
     * <p>
     * The type of EBS encryption to be used during replication.
     * </p>
     * 
     * @param ebsEncryption
     *        The type of EBS encryption to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public UpdateReplicationConfigurationRequest withEbsEncryption(String ebsEncryption) {
        setEbsEncryption(ebsEncryption);
        return this;
    }

    /**
     * <p>
     * The type of EBS encryption to be used during replication.
     * </p>
     * 
     * @param ebsEncryption
     *        The type of EBS encryption to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public UpdateReplicationConfigurationRequest withEbsEncryption(ReplicationConfigurationEbsEncryption ebsEncryption) {
        this.ebsEncryption = ebsEncryption.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the EBS encryption key to be used during replication.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        The ARN of the EBS encryption key to be used during replication.
     */

    public void setEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        this.ebsEncryptionKeyArn = ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * The ARN of the EBS encryption key to be used during replication.
     * </p>
     * 
     * @return The ARN of the EBS encryption key to be used during replication.
     */

    public String getEbsEncryptionKeyArn() {
        return this.ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * The ARN of the EBS encryption key to be used during replication.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        The ARN of the EBS encryption key to be used during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        setEbsEncryptionKeyArn(ebsEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the Replication Configuration.
     * </p>
     * 
     * @param name
     *        The name of the Replication Configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Replication Configuration.
     * </p>
     * 
     * @return The name of the Replication Configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Replication Configuration.
     * </p>
     * 
     * @param name
     *        The name of the Replication Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Point in time (PIT) policy to manage snapshots taken during replication.
     * </p>
     * 
     * @return The Point in time (PIT) policy to manage snapshots taken during replication.
     */

    public java.util.List<PITPolicyRule> getPitPolicy() {
        return pitPolicy;
    }

    /**
     * <p>
     * The Point in time (PIT) policy to manage snapshots taken during replication.
     * </p>
     * 
     * @param pitPolicy
     *        The Point in time (PIT) policy to manage snapshots taken during replication.
     */

    public void setPitPolicy(java.util.Collection<PITPolicyRule> pitPolicy) {
        if (pitPolicy == null) {
            this.pitPolicy = null;
            return;
        }

        this.pitPolicy = new java.util.ArrayList<PITPolicyRule>(pitPolicy);
    }

    /**
     * <p>
     * The Point in time (PIT) policy to manage snapshots taken during replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPitPolicy(java.util.Collection)} or {@link #withPitPolicy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pitPolicy
     *        The Point in time (PIT) policy to manage snapshots taken during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withPitPolicy(PITPolicyRule... pitPolicy) {
        if (this.pitPolicy == null) {
            setPitPolicy(new java.util.ArrayList<PITPolicyRule>(pitPolicy.length));
        }
        for (PITPolicyRule ele : pitPolicy) {
            this.pitPolicy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Point in time (PIT) policy to manage snapshots taken during replication.
     * </p>
     * 
     * @param pitPolicy
     *        The Point in time (PIT) policy to manage snapshots taken during replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withPitPolicy(java.util.Collection<PITPolicyRule> pitPolicy) {
        setPitPolicy(pitPolicy);
        return this;
    }

    /**
     * <p>
     * The configuration of the disks of the Source Server to be replicated.
     * </p>
     * 
     * @return The configuration of the disks of the Source Server to be replicated.
     */

    public java.util.List<ReplicationConfigurationReplicatedDisk> getReplicatedDisks() {
        return replicatedDisks;
    }

    /**
     * <p>
     * The configuration of the disks of the Source Server to be replicated.
     * </p>
     * 
     * @param replicatedDisks
     *        The configuration of the disks of the Source Server to be replicated.
     */

    public void setReplicatedDisks(java.util.Collection<ReplicationConfigurationReplicatedDisk> replicatedDisks) {
        if (replicatedDisks == null) {
            this.replicatedDisks = null;
            return;
        }

        this.replicatedDisks = new java.util.ArrayList<ReplicationConfigurationReplicatedDisk>(replicatedDisks);
    }

    /**
     * <p>
     * The configuration of the disks of the Source Server to be replicated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatedDisks(java.util.Collection)} or {@link #withReplicatedDisks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicatedDisks
     *        The configuration of the disks of the Source Server to be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicatedDisks(ReplicationConfigurationReplicatedDisk... replicatedDisks) {
        if (this.replicatedDisks == null) {
            setReplicatedDisks(new java.util.ArrayList<ReplicationConfigurationReplicatedDisk>(replicatedDisks.length));
        }
        for (ReplicationConfigurationReplicatedDisk ele : replicatedDisks) {
            this.replicatedDisks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of the disks of the Source Server to be replicated.
     * </p>
     * 
     * @param replicatedDisks
     *        The configuration of the disks of the Source Server to be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicatedDisks(java.util.Collection<ReplicationConfigurationReplicatedDisk> replicatedDisks) {
        setReplicatedDisks(replicatedDisks);
        return this;
    }

    /**
     * <p>
     * The instance type to be used for the replication server.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        The instance type to be used for the replication server.
     */

    public void setReplicationServerInstanceType(String replicationServerInstanceType) {
        this.replicationServerInstanceType = replicationServerInstanceType;
    }

    /**
     * <p>
     * The instance type to be used for the replication server.
     * </p>
     * 
     * @return The instance type to be used for the replication server.
     */

    public String getReplicationServerInstanceType() {
        return this.replicationServerInstanceType;
    }

    /**
     * <p>
     * The instance type to be used for the replication server.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        The instance type to be used for the replication server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicationServerInstanceType(String replicationServerInstanceType) {
        setReplicationServerInstanceType(replicationServerInstanceType);
        return this;
    }

    /**
     * <p>
     * The security group IDs that will be used by the replication server.
     * </p>
     * 
     * @return The security group IDs that will be used by the replication server.
     */

    public java.util.List<String> getReplicationServersSecurityGroupsIDs() {
        return replicationServersSecurityGroupsIDs;
    }

    /**
     * <p>
     * The security group IDs that will be used by the replication server.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        The security group IDs that will be used by the replication server.
     */

    public void setReplicationServersSecurityGroupsIDs(java.util.Collection<String> replicationServersSecurityGroupsIDs) {
        if (replicationServersSecurityGroupsIDs == null) {
            this.replicationServersSecurityGroupsIDs = null;
            return;
        }

        this.replicationServersSecurityGroupsIDs = new java.util.ArrayList<String>(replicationServersSecurityGroupsIDs);
    }

    /**
     * <p>
     * The security group IDs that will be used by the replication server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationServersSecurityGroupsIDs(java.util.Collection)} or
     * {@link #withReplicationServersSecurityGroupsIDs(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        The security group IDs that will be used by the replication server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicationServersSecurityGroupsIDs(String... replicationServersSecurityGroupsIDs) {
        if (this.replicationServersSecurityGroupsIDs == null) {
            setReplicationServersSecurityGroupsIDs(new java.util.ArrayList<String>(replicationServersSecurityGroupsIDs.length));
        }
        for (String ele : replicationServersSecurityGroupsIDs) {
            this.replicationServersSecurityGroupsIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs that will be used by the replication server.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        The security group IDs that will be used by the replication server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicationServersSecurityGroupsIDs(java.util.Collection<String> replicationServersSecurityGroupsIDs) {
        setReplicationServersSecurityGroupsIDs(replicationServersSecurityGroupsIDs);
        return this;
    }

    /**
     * <p>
     * The ID of the Source Server for this Replication Configuration.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server for this Replication Configuration.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server for this Replication Configuration.
     * </p>
     * 
     * @return The ID of the Source Server for this Replication Configuration.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server for this Replication Configuration.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server for this Replication Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * The subnet to be used by the replication staging area.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        The subnet to be used by the replication staging area.
     */

    public void setStagingAreaSubnetId(String stagingAreaSubnetId) {
        this.stagingAreaSubnetId = stagingAreaSubnetId;
    }

    /**
     * <p>
     * The subnet to be used by the replication staging area.
     * </p>
     * 
     * @return The subnet to be used by the replication staging area.
     */

    public String getStagingAreaSubnetId() {
        return this.stagingAreaSubnetId;
    }

    /**
     * <p>
     * The subnet to be used by the replication staging area.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        The subnet to be used by the replication staging area.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withStagingAreaSubnetId(String stagingAreaSubnetId) {
        setStagingAreaSubnetId(stagingAreaSubnetId);
        return this;
    }

    /**
     * <p>
     * A set of tags to be associated with all resources created in the replication staging area: EC2 replication
     * server, EBS volumes, EBS snapshots, etc.
     * </p>
     * 
     * @return A set of tags to be associated with all resources created in the replication staging area: EC2
     *         replication server, EBS volumes, EBS snapshots, etc.
     */

    public java.util.Map<String, String> getStagingAreaTags() {
        return stagingAreaTags;
    }

    /**
     * <p>
     * A set of tags to be associated with all resources created in the replication staging area: EC2 replication
     * server, EBS volumes, EBS snapshots, etc.
     * </p>
     * 
     * @param stagingAreaTags
     *        A set of tags to be associated with all resources created in the replication staging area: EC2 replication
     *        server, EBS volumes, EBS snapshots, etc.
     */

    public void setStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        this.stagingAreaTags = stagingAreaTags;
    }

    /**
     * <p>
     * A set of tags to be associated with all resources created in the replication staging area: EC2 replication
     * server, EBS volumes, EBS snapshots, etc.
     * </p>
     * 
     * @param stagingAreaTags
     *        A set of tags to be associated with all resources created in the replication staging area: EC2 replication
     *        server, EBS volumes, EBS snapshots, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        setStagingAreaTags(stagingAreaTags);
        return this;
    }

    /**
     * Add a single StagingAreaTags entry
     *
     * @see UpdateReplicationConfigurationRequest#withStagingAreaTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest addStagingAreaTagsEntry(String key, String value) {
        if (null == this.stagingAreaTags) {
            this.stagingAreaTags = new java.util.HashMap<String, String>();
        }
        if (this.stagingAreaTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.stagingAreaTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StagingAreaTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest clearStagingAreaTagsEntries() {
        this.stagingAreaTags = null;
        return this;
    }

    /**
     * <p>
     * Whether to use a dedicated Replication Server in the replication staging area.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Whether to use a dedicated Replication Server in the replication staging area.
     */

    public void setUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        this.useDedicatedReplicationServer = useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Whether to use a dedicated Replication Server in the replication staging area.
     * </p>
     * 
     * @return Whether to use a dedicated Replication Server in the replication staging area.
     */

    public Boolean getUseDedicatedReplicationServer() {
        return this.useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Whether to use a dedicated Replication Server in the replication staging area.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Whether to use a dedicated Replication Server in the replication staging area.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        setUseDedicatedReplicationServer(useDedicatedReplicationServer);
        return this;
    }

    /**
     * <p>
     * Whether to use a dedicated Replication Server in the replication staging area.
     * </p>
     * 
     * @return Whether to use a dedicated Replication Server in the replication staging area.
     */

    public Boolean isUseDedicatedReplicationServer() {
        return this.useDedicatedReplicationServer;
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
        if (getAssociateDefaultSecurityGroup() != null)
            sb.append("AssociateDefaultSecurityGroup: ").append(getAssociateDefaultSecurityGroup()).append(",");
        if (getBandwidthThrottling() != null)
            sb.append("BandwidthThrottling: ").append(getBandwidthThrottling()).append(",");
        if (getCreatePublicIP() != null)
            sb.append("CreatePublicIP: ").append(getCreatePublicIP()).append(",");
        if (getDataPlaneRouting() != null)
            sb.append("DataPlaneRouting: ").append(getDataPlaneRouting()).append(",");
        if (getDefaultLargeStagingDiskType() != null)
            sb.append("DefaultLargeStagingDiskType: ").append(getDefaultLargeStagingDiskType()).append(",");
        if (getEbsEncryption() != null)
            sb.append("EbsEncryption: ").append(getEbsEncryption()).append(",");
        if (getEbsEncryptionKeyArn() != null)
            sb.append("EbsEncryptionKeyArn: ").append(getEbsEncryptionKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPitPolicy() != null)
            sb.append("PitPolicy: ").append(getPitPolicy()).append(",");
        if (getReplicatedDisks() != null)
            sb.append("ReplicatedDisks: ").append(getReplicatedDisks()).append(",");
        if (getReplicationServerInstanceType() != null)
            sb.append("ReplicationServerInstanceType: ").append(getReplicationServerInstanceType()).append(",");
        if (getReplicationServersSecurityGroupsIDs() != null)
            sb.append("ReplicationServersSecurityGroupsIDs: ").append(getReplicationServersSecurityGroupsIDs()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getStagingAreaSubnetId() != null)
            sb.append("StagingAreaSubnetId: ").append(getStagingAreaSubnetId()).append(",");
        if (getStagingAreaTags() != null)
            sb.append("StagingAreaTags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUseDedicatedReplicationServer() != null)
            sb.append("UseDedicatedReplicationServer: ").append(getUseDedicatedReplicationServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReplicationConfigurationRequest == false)
            return false;
        UpdateReplicationConfigurationRequest other = (UpdateReplicationConfigurationRequest) obj;
        if (other.getAssociateDefaultSecurityGroup() == null ^ this.getAssociateDefaultSecurityGroup() == null)
            return false;
        if (other.getAssociateDefaultSecurityGroup() != null
                && other.getAssociateDefaultSecurityGroup().equals(this.getAssociateDefaultSecurityGroup()) == false)
            return false;
        if (other.getBandwidthThrottling() == null ^ this.getBandwidthThrottling() == null)
            return false;
        if (other.getBandwidthThrottling() != null && other.getBandwidthThrottling().equals(this.getBandwidthThrottling()) == false)
            return false;
        if (other.getCreatePublicIP() == null ^ this.getCreatePublicIP() == null)
            return false;
        if (other.getCreatePublicIP() != null && other.getCreatePublicIP().equals(this.getCreatePublicIP()) == false)
            return false;
        if (other.getDataPlaneRouting() == null ^ this.getDataPlaneRouting() == null)
            return false;
        if (other.getDataPlaneRouting() != null && other.getDataPlaneRouting().equals(this.getDataPlaneRouting()) == false)
            return false;
        if (other.getDefaultLargeStagingDiskType() == null ^ this.getDefaultLargeStagingDiskType() == null)
            return false;
        if (other.getDefaultLargeStagingDiskType() != null && other.getDefaultLargeStagingDiskType().equals(this.getDefaultLargeStagingDiskType()) == false)
            return false;
        if (other.getEbsEncryption() == null ^ this.getEbsEncryption() == null)
            return false;
        if (other.getEbsEncryption() != null && other.getEbsEncryption().equals(this.getEbsEncryption()) == false)
            return false;
        if (other.getEbsEncryptionKeyArn() == null ^ this.getEbsEncryptionKeyArn() == null)
            return false;
        if (other.getEbsEncryptionKeyArn() != null && other.getEbsEncryptionKeyArn().equals(this.getEbsEncryptionKeyArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPitPolicy() == null ^ this.getPitPolicy() == null)
            return false;
        if (other.getPitPolicy() != null && other.getPitPolicy().equals(this.getPitPolicy()) == false)
            return false;
        if (other.getReplicatedDisks() == null ^ this.getReplicatedDisks() == null)
            return false;
        if (other.getReplicatedDisks() != null && other.getReplicatedDisks().equals(this.getReplicatedDisks()) == false)
            return false;
        if (other.getReplicationServerInstanceType() == null ^ this.getReplicationServerInstanceType() == null)
            return false;
        if (other.getReplicationServerInstanceType() != null
                && other.getReplicationServerInstanceType().equals(this.getReplicationServerInstanceType()) == false)
            return false;
        if (other.getReplicationServersSecurityGroupsIDs() == null ^ this.getReplicationServersSecurityGroupsIDs() == null)
            return false;
        if (other.getReplicationServersSecurityGroupsIDs() != null
                && other.getReplicationServersSecurityGroupsIDs().equals(this.getReplicationServersSecurityGroupsIDs()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        if (other.getStagingAreaSubnetId() == null ^ this.getStagingAreaSubnetId() == null)
            return false;
        if (other.getStagingAreaSubnetId() != null && other.getStagingAreaSubnetId().equals(this.getStagingAreaSubnetId()) == false)
            return false;
        if (other.getStagingAreaTags() == null ^ this.getStagingAreaTags() == null)
            return false;
        if (other.getStagingAreaTags() != null && other.getStagingAreaTags().equals(this.getStagingAreaTags()) == false)
            return false;
        if (other.getUseDedicatedReplicationServer() == null ^ this.getUseDedicatedReplicationServer() == null)
            return false;
        if (other.getUseDedicatedReplicationServer() != null
                && other.getUseDedicatedReplicationServer().equals(this.getUseDedicatedReplicationServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociateDefaultSecurityGroup() == null) ? 0 : getAssociateDefaultSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getBandwidthThrottling() == null) ? 0 : getBandwidthThrottling().hashCode());
        hashCode = prime * hashCode + ((getCreatePublicIP() == null) ? 0 : getCreatePublicIP().hashCode());
        hashCode = prime * hashCode + ((getDataPlaneRouting() == null) ? 0 : getDataPlaneRouting().hashCode());
        hashCode = prime * hashCode + ((getDefaultLargeStagingDiskType() == null) ? 0 : getDefaultLargeStagingDiskType().hashCode());
        hashCode = prime * hashCode + ((getEbsEncryption() == null) ? 0 : getEbsEncryption().hashCode());
        hashCode = prime * hashCode + ((getEbsEncryptionKeyArn() == null) ? 0 : getEbsEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPitPolicy() == null) ? 0 : getPitPolicy().hashCode());
        hashCode = prime * hashCode + ((getReplicatedDisks() == null) ? 0 : getReplicatedDisks().hashCode());
        hashCode = prime * hashCode + ((getReplicationServerInstanceType() == null) ? 0 : getReplicationServerInstanceType().hashCode());
        hashCode = prime * hashCode + ((getReplicationServersSecurityGroupsIDs() == null) ? 0 : getReplicationServersSecurityGroupsIDs().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getStagingAreaSubnetId() == null) ? 0 : getStagingAreaSubnetId().hashCode());
        hashCode = prime * hashCode + ((getStagingAreaTags() == null) ? 0 : getStagingAreaTags().hashCode());
        hashCode = prime * hashCode + ((getUseDedicatedReplicationServer() == null) ? 0 : getUseDedicatedReplicationServer().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationConfigurationRequest clone() {
        return (UpdateReplicationConfigurationRequest) super.clone();
    }

}
