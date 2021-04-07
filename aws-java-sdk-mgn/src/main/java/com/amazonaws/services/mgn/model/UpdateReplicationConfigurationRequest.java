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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Update replication configuration associate default Application Migration Service Security group request.
     * </p>
     */
    private Boolean associateDefaultSecurityGroup;
    /**
     * <p>
     * Update replication configuration bandwidth throttling request.
     * </p>
     */
    private Long bandwidthThrottling;
    /**
     * <p>
     * Update replication configuration create Public IP request.
     * </p>
     */
    private Boolean createPublicIP;
    /**
     * <p>
     * Update replication configuration data plane routing request.
     * </p>
     */
    private String dataPlaneRouting;
    /**
     * <p>
     * Update replication configuration use default large Staging Disk type request.
     * </p>
     */
    private String defaultLargeStagingDiskType;
    /**
     * <p>
     * Update replication configuration EBS encryption request.
     * </p>
     */
    private String ebsEncryption;
    /**
     * <p>
     * Update replication configuration EBS encryption key ARN request.
     * </p>
     */
    private String ebsEncryptionKeyArn;
    /**
     * <p>
     * Update replication configuration name request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Update replication configuration replicated disks request.
     * </p>
     */
    private java.util.List<ReplicationConfigurationReplicatedDisk> replicatedDisks;
    /**
     * <p>
     * Update replication configuration Replication Server instance type request.
     * </p>
     */
    private String replicationServerInstanceType;
    /**
     * <p>
     * Update replication configuration Replication Server Security Groups IDs request.
     * </p>
     */
    private java.util.List<String> replicationServersSecurityGroupsIDs;
    /**
     * <p>
     * Update replication configuration Source Server ID request.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Update replication configuration Staging Area subnet request.
     * </p>
     */
    private String stagingAreaSubnetId;
    /**
     * <p>
     * Update replication configuration Staging Area Tags request.
     * </p>
     */
    private java.util.Map<String, String> stagingAreaTags;
    /**
     * <p>
     * Update replication configuration use dedicated Replication Server request.
     * </p>
     */
    private Boolean useDedicatedReplicationServer;

    /**
     * <p>
     * Update replication configuration associate default Application Migration Service Security group request.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Update replication configuration associate default Application Migration Service Security group request.
     */

    public void setAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        this.associateDefaultSecurityGroup = associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Update replication configuration associate default Application Migration Service Security group request.
     * </p>
     * 
     * @return Update replication configuration associate default Application Migration Service Security group request.
     */

    public Boolean getAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Update replication configuration associate default Application Migration Service Security group request.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Update replication configuration associate default Application Migration Service Security group request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        setAssociateDefaultSecurityGroup(associateDefaultSecurityGroup);
        return this;
    }

    /**
     * <p>
     * Update replication configuration associate default Application Migration Service Security group request.
     * </p>
     * 
     * @return Update replication configuration associate default Application Migration Service Security group request.
     */

    public Boolean isAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Update replication configuration bandwidth throttling request.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Update replication configuration bandwidth throttling request.
     */

    public void setBandwidthThrottling(Long bandwidthThrottling) {
        this.bandwidthThrottling = bandwidthThrottling;
    }

    /**
     * <p>
     * Update replication configuration bandwidth throttling request.
     * </p>
     * 
     * @return Update replication configuration bandwidth throttling request.
     */

    public Long getBandwidthThrottling() {
        return this.bandwidthThrottling;
    }

    /**
     * <p>
     * Update replication configuration bandwidth throttling request.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Update replication configuration bandwidth throttling request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withBandwidthThrottling(Long bandwidthThrottling) {
        setBandwidthThrottling(bandwidthThrottling);
        return this;
    }

    /**
     * <p>
     * Update replication configuration create Public IP request.
     * </p>
     * 
     * @param createPublicIP
     *        Update replication configuration create Public IP request.
     */

    public void setCreatePublicIP(Boolean createPublicIP) {
        this.createPublicIP = createPublicIP;
    }

    /**
     * <p>
     * Update replication configuration create Public IP request.
     * </p>
     * 
     * @return Update replication configuration create Public IP request.
     */

    public Boolean getCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Update replication configuration create Public IP request.
     * </p>
     * 
     * @param createPublicIP
     *        Update replication configuration create Public IP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withCreatePublicIP(Boolean createPublicIP) {
        setCreatePublicIP(createPublicIP);
        return this;
    }

    /**
     * <p>
     * Update replication configuration create Public IP request.
     * </p>
     * 
     * @return Update replication configuration create Public IP request.
     */

    public Boolean isCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Update replication configuration data plane routing request.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Update replication configuration data plane routing request.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public void setDataPlaneRouting(String dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting;
    }

    /**
     * <p>
     * Update replication configuration data plane routing request.
     * </p>
     * 
     * @return Update replication configuration data plane routing request.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public String getDataPlaneRouting() {
        return this.dataPlaneRouting;
    }

    /**
     * <p>
     * Update replication configuration data plane routing request.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Update replication configuration data plane routing request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public UpdateReplicationConfigurationRequest withDataPlaneRouting(String dataPlaneRouting) {
        setDataPlaneRouting(dataPlaneRouting);
        return this;
    }

    /**
     * <p>
     * Update replication configuration data plane routing request.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Update replication configuration data plane routing request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public UpdateReplicationConfigurationRequest withDataPlaneRouting(ReplicationConfigurationDataPlaneRouting dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting.toString();
        return this;
    }

    /**
     * <p>
     * Update replication configuration use default large Staging Disk type request.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Update replication configuration use default large Staging Disk type request.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public void setDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Update replication configuration use default large Staging Disk type request.
     * </p>
     * 
     * @return Update replication configuration use default large Staging Disk type request.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public String getDefaultLargeStagingDiskType() {
        return this.defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Update replication configuration use default large Staging Disk type request.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Update replication configuration use default large Staging Disk type request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public UpdateReplicationConfigurationRequest withDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        setDefaultLargeStagingDiskType(defaultLargeStagingDiskType);
        return this;
    }

    /**
     * <p>
     * Update replication configuration use default large Staging Disk type request.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Update replication configuration use default large Staging Disk type request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public UpdateReplicationConfigurationRequest withDefaultLargeStagingDiskType(ReplicationConfigurationDefaultLargeStagingDiskType defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption request.
     * </p>
     * 
     * @param ebsEncryption
     *        Update replication configuration EBS encryption request.
     * @see ReplicationConfigurationEbsEncryption
     */

    public void setEbsEncryption(String ebsEncryption) {
        this.ebsEncryption = ebsEncryption;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption request.
     * </p>
     * 
     * @return Update replication configuration EBS encryption request.
     * @see ReplicationConfigurationEbsEncryption
     */

    public String getEbsEncryption() {
        return this.ebsEncryption;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption request.
     * </p>
     * 
     * @param ebsEncryption
     *        Update replication configuration EBS encryption request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public UpdateReplicationConfigurationRequest withEbsEncryption(String ebsEncryption) {
        setEbsEncryption(ebsEncryption);
        return this;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption request.
     * </p>
     * 
     * @param ebsEncryption
     *        Update replication configuration EBS encryption request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public UpdateReplicationConfigurationRequest withEbsEncryption(ReplicationConfigurationEbsEncryption ebsEncryption) {
        this.ebsEncryption = ebsEncryption.toString();
        return this;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption key ARN request.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Update replication configuration EBS encryption key ARN request.
     */

    public void setEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        this.ebsEncryptionKeyArn = ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption key ARN request.
     * </p>
     * 
     * @return Update replication configuration EBS encryption key ARN request.
     */

    public String getEbsEncryptionKeyArn() {
        return this.ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Update replication configuration EBS encryption key ARN request.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Update replication configuration EBS encryption key ARN request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        setEbsEncryptionKeyArn(ebsEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * Update replication configuration name request.
     * </p>
     * 
     * @param name
     *        Update replication configuration name request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Update replication configuration name request.
     * </p>
     * 
     * @return Update replication configuration name request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Update replication configuration name request.
     * </p>
     * 
     * @param name
     *        Update replication configuration name request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Update replication configuration replicated disks request.
     * </p>
     * 
     * @return Update replication configuration replicated disks request.
     */

    public java.util.List<ReplicationConfigurationReplicatedDisk> getReplicatedDisks() {
        return replicatedDisks;
    }

    /**
     * <p>
     * Update replication configuration replicated disks request.
     * </p>
     * 
     * @param replicatedDisks
     *        Update replication configuration replicated disks request.
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
     * Update replication configuration replicated disks request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatedDisks(java.util.Collection)} or {@link #withReplicatedDisks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicatedDisks
     *        Update replication configuration replicated disks request.
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
     * Update replication configuration replicated disks request.
     * </p>
     * 
     * @param replicatedDisks
     *        Update replication configuration replicated disks request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicatedDisks(java.util.Collection<ReplicationConfigurationReplicatedDisk> replicatedDisks) {
        setReplicatedDisks(replicatedDisks);
        return this;
    }

    /**
     * <p>
     * Update replication configuration Replication Server instance type request.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Update replication configuration Replication Server instance type request.
     */

    public void setReplicationServerInstanceType(String replicationServerInstanceType) {
        this.replicationServerInstanceType = replicationServerInstanceType;
    }

    /**
     * <p>
     * Update replication configuration Replication Server instance type request.
     * </p>
     * 
     * @return Update replication configuration Replication Server instance type request.
     */

    public String getReplicationServerInstanceType() {
        return this.replicationServerInstanceType;
    }

    /**
     * <p>
     * Update replication configuration Replication Server instance type request.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Update replication configuration Replication Server instance type request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicationServerInstanceType(String replicationServerInstanceType) {
        setReplicationServerInstanceType(replicationServerInstanceType);
        return this;
    }

    /**
     * <p>
     * Update replication configuration Replication Server Security Groups IDs request.
     * </p>
     * 
     * @return Update replication configuration Replication Server Security Groups IDs request.
     */

    public java.util.List<String> getReplicationServersSecurityGroupsIDs() {
        return replicationServersSecurityGroupsIDs;
    }

    /**
     * <p>
     * Update replication configuration Replication Server Security Groups IDs request.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Update replication configuration Replication Server Security Groups IDs request.
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
     * Update replication configuration Replication Server Security Groups IDs request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationServersSecurityGroupsIDs(java.util.Collection)} or
     * {@link #withReplicationServersSecurityGroupsIDs(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Update replication configuration Replication Server Security Groups IDs request.
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
     * Update replication configuration Replication Server Security Groups IDs request.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Update replication configuration Replication Server Security Groups IDs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withReplicationServersSecurityGroupsIDs(java.util.Collection<String> replicationServersSecurityGroupsIDs) {
        setReplicationServersSecurityGroupsIDs(replicationServersSecurityGroupsIDs);
        return this;
    }

    /**
     * <p>
     * Update replication configuration Source Server ID request.
     * </p>
     * 
     * @param sourceServerID
     *        Update replication configuration Source Server ID request.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Update replication configuration Source Server ID request.
     * </p>
     * 
     * @return Update replication configuration Source Server ID request.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Update replication configuration Source Server ID request.
     * </p>
     * 
     * @param sourceServerID
     *        Update replication configuration Source Server ID request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Update replication configuration Staging Area subnet request.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Update replication configuration Staging Area subnet request.
     */

    public void setStagingAreaSubnetId(String stagingAreaSubnetId) {
        this.stagingAreaSubnetId = stagingAreaSubnetId;
    }

    /**
     * <p>
     * Update replication configuration Staging Area subnet request.
     * </p>
     * 
     * @return Update replication configuration Staging Area subnet request.
     */

    public String getStagingAreaSubnetId() {
        return this.stagingAreaSubnetId;
    }

    /**
     * <p>
     * Update replication configuration Staging Area subnet request.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Update replication configuration Staging Area subnet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withStagingAreaSubnetId(String stagingAreaSubnetId) {
        setStagingAreaSubnetId(stagingAreaSubnetId);
        return this;
    }

    /**
     * <p>
     * Update replication configuration Staging Area Tags request.
     * </p>
     * 
     * @return Update replication configuration Staging Area Tags request.
     */

    public java.util.Map<String, String> getStagingAreaTags() {
        return stagingAreaTags;
    }

    /**
     * <p>
     * Update replication configuration Staging Area Tags request.
     * </p>
     * 
     * @param stagingAreaTags
     *        Update replication configuration Staging Area Tags request.
     */

    public void setStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        this.stagingAreaTags = stagingAreaTags;
    }

    /**
     * <p>
     * Update replication configuration Staging Area Tags request.
     * </p>
     * 
     * @param stagingAreaTags
     *        Update replication configuration Staging Area Tags request.
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
     * Update replication configuration use dedicated Replication Server request.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Update replication configuration use dedicated Replication Server request.
     */

    public void setUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        this.useDedicatedReplicationServer = useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Update replication configuration use dedicated Replication Server request.
     * </p>
     * 
     * @return Update replication configuration use dedicated Replication Server request.
     */

    public Boolean getUseDedicatedReplicationServer() {
        return this.useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Update replication configuration use dedicated Replication Server request.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Update replication configuration use dedicated Replication Server request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationConfigurationRequest withUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        setUseDedicatedReplicationServer(useDedicatedReplicationServer);
        return this;
    }

    /**
     * <p>
     * Update replication configuration use dedicated Replication Server request.
     * </p>
     * 
     * @return Update replication configuration use dedicated Replication Server request.
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
    public UpdateReplicationConfigurationRequest clone() {
        return (UpdateReplicationConfigurationRequest) super.clone();
    }

}
