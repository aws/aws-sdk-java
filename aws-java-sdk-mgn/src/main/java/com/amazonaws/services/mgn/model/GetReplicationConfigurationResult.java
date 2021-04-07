/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReplicationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Replication Configuration associate default Application Migration Service Security Group.
     * </p>
     */
    private Boolean associateDefaultSecurityGroup;
    /**
     * <p>
     * Replication Configuration set bandwidth throttling.
     * </p>
     */
    private Long bandwidthThrottling;
    /**
     * <p>
     * Replication Configuration create Public IP.
     * </p>
     */
    private Boolean createPublicIP;
    /**
     * <p>
     * Replication Configuration data plane routing.
     * </p>
     */
    private String dataPlaneRouting;
    /**
     * <p>
     * Replication Configuration use default large Staging Disks.
     * </p>
     */
    private String defaultLargeStagingDiskType;
    /**
     * <p>
     * Replication Configuration EBS encryption.
     * </p>
     */
    private String ebsEncryption;
    /**
     * <p>
     * Replication Configuration EBS encryption key ARN.
     * </p>
     */
    private String ebsEncryptionKeyArn;
    /**
     * <p>
     * Replication Configuration name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Replication Configuration replicated disks.
     * </p>
     */
    private java.util.List<ReplicationConfigurationReplicatedDisk> replicatedDisks;
    /**
     * <p>
     * Replication Configuration Replication Server instance type.
     * </p>
     */
    private String replicationServerInstanceType;
    /**
     * <p>
     * Replication Configuration Replication Server Security Group IDs.
     * </p>
     */
    private java.util.List<String> replicationServersSecurityGroupsIDs;
    /**
     * <p>
     * Replication Configuration Source Server ID.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Replication Configuration Staging Area subnet ID.
     * </p>
     */
    private String stagingAreaSubnetId;
    /**
     * <p>
     * Replication Configuration Staging Area tags.
     * </p>
     */
    private java.util.Map<String, String> stagingAreaTags;
    /**
     * <p>
     * Replication Configuration use Dedicated Replication Server.
     * </p>
     */
    private Boolean useDedicatedReplicationServer;

    /**
     * <p>
     * Replication Configuration associate default Application Migration Service Security Group.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Replication Configuration associate default Application Migration Service Security Group.
     */

    public void setAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        this.associateDefaultSecurityGroup = associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Replication Configuration associate default Application Migration Service Security Group.
     * </p>
     * 
     * @return Replication Configuration associate default Application Migration Service Security Group.
     */

    public Boolean getAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Replication Configuration associate default Application Migration Service Security Group.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Replication Configuration associate default Application Migration Service Security Group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        setAssociateDefaultSecurityGroup(associateDefaultSecurityGroup);
        return this;
    }

    /**
     * <p>
     * Replication Configuration associate default Application Migration Service Security Group.
     * </p>
     * 
     * @return Replication Configuration associate default Application Migration Service Security Group.
     */

    public Boolean isAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Replication Configuration set bandwidth throttling.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Replication Configuration set bandwidth throttling.
     */

    public void setBandwidthThrottling(Long bandwidthThrottling) {
        this.bandwidthThrottling = bandwidthThrottling;
    }

    /**
     * <p>
     * Replication Configuration set bandwidth throttling.
     * </p>
     * 
     * @return Replication Configuration set bandwidth throttling.
     */

    public Long getBandwidthThrottling() {
        return this.bandwidthThrottling;
    }

    /**
     * <p>
     * Replication Configuration set bandwidth throttling.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Replication Configuration set bandwidth throttling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withBandwidthThrottling(Long bandwidthThrottling) {
        setBandwidthThrottling(bandwidthThrottling);
        return this;
    }

    /**
     * <p>
     * Replication Configuration create Public IP.
     * </p>
     * 
     * @param createPublicIP
     *        Replication Configuration create Public IP.
     */

    public void setCreatePublicIP(Boolean createPublicIP) {
        this.createPublicIP = createPublicIP;
    }

    /**
     * <p>
     * Replication Configuration create Public IP.
     * </p>
     * 
     * @return Replication Configuration create Public IP.
     */

    public Boolean getCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Replication Configuration create Public IP.
     * </p>
     * 
     * @param createPublicIP
     *        Replication Configuration create Public IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withCreatePublicIP(Boolean createPublicIP) {
        setCreatePublicIP(createPublicIP);
        return this;
    }

    /**
     * <p>
     * Replication Configuration create Public IP.
     * </p>
     * 
     * @return Replication Configuration create Public IP.
     */

    public Boolean isCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Replication Configuration data plane routing.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Replication Configuration data plane routing.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public void setDataPlaneRouting(String dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting;
    }

    /**
     * <p>
     * Replication Configuration data plane routing.
     * </p>
     * 
     * @return Replication Configuration data plane routing.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public String getDataPlaneRouting() {
        return this.dataPlaneRouting;
    }

    /**
     * <p>
     * Replication Configuration data plane routing.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Replication Configuration data plane routing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public GetReplicationConfigurationResult withDataPlaneRouting(String dataPlaneRouting) {
        setDataPlaneRouting(dataPlaneRouting);
        return this;
    }

    /**
     * <p>
     * Replication Configuration data plane routing.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Replication Configuration data plane routing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public GetReplicationConfigurationResult withDataPlaneRouting(ReplicationConfigurationDataPlaneRouting dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting.toString();
        return this;
    }

    /**
     * <p>
     * Replication Configuration use default large Staging Disks.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Replication Configuration use default large Staging Disks.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public void setDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Replication Configuration use default large Staging Disks.
     * </p>
     * 
     * @return Replication Configuration use default large Staging Disks.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public String getDefaultLargeStagingDiskType() {
        return this.defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Replication Configuration use default large Staging Disks.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Replication Configuration use default large Staging Disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public GetReplicationConfigurationResult withDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        setDefaultLargeStagingDiskType(defaultLargeStagingDiskType);
        return this;
    }

    /**
     * <p>
     * Replication Configuration use default large Staging Disks.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Replication Configuration use default large Staging Disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public GetReplicationConfigurationResult withDefaultLargeStagingDiskType(ReplicationConfigurationDefaultLargeStagingDiskType defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption.
     * </p>
     * 
     * @param ebsEncryption
     *        Replication Configuration EBS encryption.
     * @see ReplicationConfigurationEbsEncryption
     */

    public void setEbsEncryption(String ebsEncryption) {
        this.ebsEncryption = ebsEncryption;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption.
     * </p>
     * 
     * @return Replication Configuration EBS encryption.
     * @see ReplicationConfigurationEbsEncryption
     */

    public String getEbsEncryption() {
        return this.ebsEncryption;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption.
     * </p>
     * 
     * @param ebsEncryption
     *        Replication Configuration EBS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public GetReplicationConfigurationResult withEbsEncryption(String ebsEncryption) {
        setEbsEncryption(ebsEncryption);
        return this;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption.
     * </p>
     * 
     * @param ebsEncryption
     *        Replication Configuration EBS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public GetReplicationConfigurationResult withEbsEncryption(ReplicationConfigurationEbsEncryption ebsEncryption) {
        this.ebsEncryption = ebsEncryption.toString();
        return this;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption key ARN.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Replication Configuration EBS encryption key ARN.
     */

    public void setEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        this.ebsEncryptionKeyArn = ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption key ARN.
     * </p>
     * 
     * @return Replication Configuration EBS encryption key ARN.
     */

    public String getEbsEncryptionKeyArn() {
        return this.ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Replication Configuration EBS encryption key ARN.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Replication Configuration EBS encryption key ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        setEbsEncryptionKeyArn(ebsEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * Replication Configuration name.
     * </p>
     * 
     * @param name
     *        Replication Configuration name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Replication Configuration name.
     * </p>
     * 
     * @return Replication Configuration name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Replication Configuration name.
     * </p>
     * 
     * @param name
     *        Replication Configuration name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Replication Configuration replicated disks.
     * </p>
     * 
     * @return Replication Configuration replicated disks.
     */

    public java.util.List<ReplicationConfigurationReplicatedDisk> getReplicatedDisks() {
        return replicatedDisks;
    }

    /**
     * <p>
     * Replication Configuration replicated disks.
     * </p>
     * 
     * @param replicatedDisks
     *        Replication Configuration replicated disks.
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
     * Replication Configuration replicated disks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatedDisks(java.util.Collection)} or {@link #withReplicatedDisks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicatedDisks
     *        Replication Configuration replicated disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withReplicatedDisks(ReplicationConfigurationReplicatedDisk... replicatedDisks) {
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
     * Replication Configuration replicated disks.
     * </p>
     * 
     * @param replicatedDisks
     *        Replication Configuration replicated disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withReplicatedDisks(java.util.Collection<ReplicationConfigurationReplicatedDisk> replicatedDisks) {
        setReplicatedDisks(replicatedDisks);
        return this;
    }

    /**
     * <p>
     * Replication Configuration Replication Server instance type.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Replication Configuration Replication Server instance type.
     */

    public void setReplicationServerInstanceType(String replicationServerInstanceType) {
        this.replicationServerInstanceType = replicationServerInstanceType;
    }

    /**
     * <p>
     * Replication Configuration Replication Server instance type.
     * </p>
     * 
     * @return Replication Configuration Replication Server instance type.
     */

    public String getReplicationServerInstanceType() {
        return this.replicationServerInstanceType;
    }

    /**
     * <p>
     * Replication Configuration Replication Server instance type.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Replication Configuration Replication Server instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withReplicationServerInstanceType(String replicationServerInstanceType) {
        setReplicationServerInstanceType(replicationServerInstanceType);
        return this;
    }

    /**
     * <p>
     * Replication Configuration Replication Server Security Group IDs.
     * </p>
     * 
     * @return Replication Configuration Replication Server Security Group IDs.
     */

    public java.util.List<String> getReplicationServersSecurityGroupsIDs() {
        return replicationServersSecurityGroupsIDs;
    }

    /**
     * <p>
     * Replication Configuration Replication Server Security Group IDs.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Replication Configuration Replication Server Security Group IDs.
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
     * Replication Configuration Replication Server Security Group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationServersSecurityGroupsIDs(java.util.Collection)} or
     * {@link #withReplicationServersSecurityGroupsIDs(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Replication Configuration Replication Server Security Group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withReplicationServersSecurityGroupsIDs(String... replicationServersSecurityGroupsIDs) {
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
     * Replication Configuration Replication Server Security Group IDs.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Replication Configuration Replication Server Security Group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withReplicationServersSecurityGroupsIDs(java.util.Collection<String> replicationServersSecurityGroupsIDs) {
        setReplicationServersSecurityGroupsIDs(replicationServersSecurityGroupsIDs);
        return this;
    }

    /**
     * <p>
     * Replication Configuration Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Replication Configuration Source Server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Replication Configuration Source Server ID.
     * </p>
     * 
     * @return Replication Configuration Source Server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Replication Configuration Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Replication Configuration Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Replication Configuration Staging Area subnet ID.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Replication Configuration Staging Area subnet ID.
     */

    public void setStagingAreaSubnetId(String stagingAreaSubnetId) {
        this.stagingAreaSubnetId = stagingAreaSubnetId;
    }

    /**
     * <p>
     * Replication Configuration Staging Area subnet ID.
     * </p>
     * 
     * @return Replication Configuration Staging Area subnet ID.
     */

    public String getStagingAreaSubnetId() {
        return this.stagingAreaSubnetId;
    }

    /**
     * <p>
     * Replication Configuration Staging Area subnet ID.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Replication Configuration Staging Area subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withStagingAreaSubnetId(String stagingAreaSubnetId) {
        setStagingAreaSubnetId(stagingAreaSubnetId);
        return this;
    }

    /**
     * <p>
     * Replication Configuration Staging Area tags.
     * </p>
     * 
     * @return Replication Configuration Staging Area tags.
     */

    public java.util.Map<String, String> getStagingAreaTags() {
        return stagingAreaTags;
    }

    /**
     * <p>
     * Replication Configuration Staging Area tags.
     * </p>
     * 
     * @param stagingAreaTags
     *        Replication Configuration Staging Area tags.
     */

    public void setStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        this.stagingAreaTags = stagingAreaTags;
    }

    /**
     * <p>
     * Replication Configuration Staging Area tags.
     * </p>
     * 
     * @param stagingAreaTags
     *        Replication Configuration Staging Area tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        setStagingAreaTags(stagingAreaTags);
        return this;
    }

    /**
     * Add a single StagingAreaTags entry
     *
     * @see GetReplicationConfigurationResult#withStagingAreaTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult addStagingAreaTagsEntry(String key, String value) {
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

    public GetReplicationConfigurationResult clearStagingAreaTagsEntries() {
        this.stagingAreaTags = null;
        return this;
    }

    /**
     * <p>
     * Replication Configuration use Dedicated Replication Server.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Replication Configuration use Dedicated Replication Server.
     */

    public void setUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        this.useDedicatedReplicationServer = useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Replication Configuration use Dedicated Replication Server.
     * </p>
     * 
     * @return Replication Configuration use Dedicated Replication Server.
     */

    public Boolean getUseDedicatedReplicationServer() {
        return this.useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Replication Configuration use Dedicated Replication Server.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Replication Configuration use Dedicated Replication Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationConfigurationResult withUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        setUseDedicatedReplicationServer(useDedicatedReplicationServer);
        return this;
    }

    /**
     * <p>
     * Replication Configuration use Dedicated Replication Server.
     * </p>
     * 
     * @return Replication Configuration use Dedicated Replication Server.
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

        if (obj instanceof GetReplicationConfigurationResult == false)
            return false;
        GetReplicationConfigurationResult other = (GetReplicationConfigurationResult) obj;
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
    public GetReplicationConfigurationResult clone() {
        try {
            return (GetReplicationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
