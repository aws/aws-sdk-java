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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ReplicationConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationConfigurationTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Replication Configuration template ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Replication Configuration template associate default Application Migration Service Security group.
     * </p>
     */
    private Boolean associateDefaultSecurityGroup;
    /**
     * <p>
     * Replication Configuration template bandwidth throtting.
     * </p>
     */
    private Long bandwidthThrottling;
    /**
     * <p>
     * Replication Configuration template create Public IP.
     * </p>
     */
    private Boolean createPublicIP;
    /**
     * <p>
     * Replication Configuration template data plane routing.
     * </p>
     */
    private String dataPlaneRouting;
    /**
     * <p>
     * Replication Configuration template use dedault large Staging Disk type.
     * </p>
     */
    private String defaultLargeStagingDiskType;
    /**
     * <p>
     * Replication Configuration template EBS encryption.
     * </p>
     */
    private String ebsEncryption;
    /**
     * <p>
     * Replication Configuration template EBS encryption key ARN.
     * </p>
     */
    private String ebsEncryptionKeyArn;
    /**
     * <p>
     * Replication Configuration template template ID.
     * </p>
     */
    private String replicationConfigurationTemplateID;
    /**
     * <p>
     * Replication Configuration template server instance type.
     * </p>
     */
    private String replicationServerInstanceType;
    /**
     * <p>
     * Replication Configuration template server Security Groups IDs.
     * </p>
     */
    private java.util.List<String> replicationServersSecurityGroupsIDs;
    /**
     * <p>
     * Replication Configuration template Staging Area subnet ID.
     * </p>
     */
    private String stagingAreaSubnetId;
    /**
     * <p>
     * Replication Configuration template Staging Area Tags.
     * </p>
     */
    private java.util.Map<String, String> stagingAreaTags;
    /**
     * <p>
     * Replication Configuration template Tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Replication Configuration template use Dedicated Replication Server.
     * </p>
     */
    private Boolean useDedicatedReplicationServer;

    /**
     * <p>
     * Replication Configuration template ARN.
     * </p>
     * 
     * @param arn
     *        Replication Configuration template ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Replication Configuration template ARN.
     * </p>
     * 
     * @return Replication Configuration template ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Replication Configuration template ARN.
     * </p>
     * 
     * @param arn
     *        Replication Configuration template ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template associate default Application Migration Service Security group.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Replication Configuration template associate default Application Migration Service Security group.
     */

    public void setAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        this.associateDefaultSecurityGroup = associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Replication Configuration template associate default Application Migration Service Security group.
     * </p>
     * 
     * @return Replication Configuration template associate default Application Migration Service Security group.
     */

    public Boolean getAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Replication Configuration template associate default Application Migration Service Security group.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Replication Configuration template associate default Application Migration Service Security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        setAssociateDefaultSecurityGroup(associateDefaultSecurityGroup);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template associate default Application Migration Service Security group.
     * </p>
     * 
     * @return Replication Configuration template associate default Application Migration Service Security group.
     */

    public Boolean isAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Replication Configuration template bandwidth throtting.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Replication Configuration template bandwidth throtting.
     */

    public void setBandwidthThrottling(Long bandwidthThrottling) {
        this.bandwidthThrottling = bandwidthThrottling;
    }

    /**
     * <p>
     * Replication Configuration template bandwidth throtting.
     * </p>
     * 
     * @return Replication Configuration template bandwidth throtting.
     */

    public Long getBandwidthThrottling() {
        return this.bandwidthThrottling;
    }

    /**
     * <p>
     * Replication Configuration template bandwidth throtting.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Replication Configuration template bandwidth throtting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withBandwidthThrottling(Long bandwidthThrottling) {
        setBandwidthThrottling(bandwidthThrottling);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template create Public IP.
     * </p>
     * 
     * @param createPublicIP
     *        Replication Configuration template create Public IP.
     */

    public void setCreatePublicIP(Boolean createPublicIP) {
        this.createPublicIP = createPublicIP;
    }

    /**
     * <p>
     * Replication Configuration template create Public IP.
     * </p>
     * 
     * @return Replication Configuration template create Public IP.
     */

    public Boolean getCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Replication Configuration template create Public IP.
     * </p>
     * 
     * @param createPublicIP
     *        Replication Configuration template create Public IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withCreatePublicIP(Boolean createPublicIP) {
        setCreatePublicIP(createPublicIP);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template create Public IP.
     * </p>
     * 
     * @return Replication Configuration template create Public IP.
     */

    public Boolean isCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Replication Configuration template data plane routing.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Replication Configuration template data plane routing.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public void setDataPlaneRouting(String dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting;
    }

    /**
     * <p>
     * Replication Configuration template data plane routing.
     * </p>
     * 
     * @return Replication Configuration template data plane routing.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public String getDataPlaneRouting() {
        return this.dataPlaneRouting;
    }

    /**
     * <p>
     * Replication Configuration template data plane routing.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Replication Configuration template data plane routing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public ReplicationConfigurationTemplate withDataPlaneRouting(String dataPlaneRouting) {
        setDataPlaneRouting(dataPlaneRouting);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template data plane routing.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Replication Configuration template data plane routing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public ReplicationConfigurationTemplate withDataPlaneRouting(ReplicationConfigurationDataPlaneRouting dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting.toString();
        return this;
    }

    /**
     * <p>
     * Replication Configuration template use dedault large Staging Disk type.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Replication Configuration template use dedault large Staging Disk type.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public void setDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Replication Configuration template use dedault large Staging Disk type.
     * </p>
     * 
     * @return Replication Configuration template use dedault large Staging Disk type.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public String getDefaultLargeStagingDiskType() {
        return this.defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Replication Configuration template use dedault large Staging Disk type.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Replication Configuration template use dedault large Staging Disk type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public ReplicationConfigurationTemplate withDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        setDefaultLargeStagingDiskType(defaultLargeStagingDiskType);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template use dedault large Staging Disk type.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Replication Configuration template use dedault large Staging Disk type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public ReplicationConfigurationTemplate withDefaultLargeStagingDiskType(ReplicationConfigurationDefaultLargeStagingDiskType defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption.
     * </p>
     * 
     * @param ebsEncryption
     *        Replication Configuration template EBS encryption.
     * @see ReplicationConfigurationEbsEncryption
     */

    public void setEbsEncryption(String ebsEncryption) {
        this.ebsEncryption = ebsEncryption;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption.
     * </p>
     * 
     * @return Replication Configuration template EBS encryption.
     * @see ReplicationConfigurationEbsEncryption
     */

    public String getEbsEncryption() {
        return this.ebsEncryption;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption.
     * </p>
     * 
     * @param ebsEncryption
     *        Replication Configuration template EBS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public ReplicationConfigurationTemplate withEbsEncryption(String ebsEncryption) {
        setEbsEncryption(ebsEncryption);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption.
     * </p>
     * 
     * @param ebsEncryption
     *        Replication Configuration template EBS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public ReplicationConfigurationTemplate withEbsEncryption(ReplicationConfigurationEbsEncryption ebsEncryption) {
        this.ebsEncryption = ebsEncryption.toString();
        return this;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption key ARN.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Replication Configuration template EBS encryption key ARN.
     */

    public void setEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        this.ebsEncryptionKeyArn = ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption key ARN.
     * </p>
     * 
     * @return Replication Configuration template EBS encryption key ARN.
     */

    public String getEbsEncryptionKeyArn() {
        return this.ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Replication Configuration template EBS encryption key ARN.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Replication Configuration template EBS encryption key ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        setEbsEncryptionKeyArn(ebsEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template template ID.
     * </p>
     * 
     * @param replicationConfigurationTemplateID
     *        Replication Configuration template template ID.
     */

    public void setReplicationConfigurationTemplateID(String replicationConfigurationTemplateID) {
        this.replicationConfigurationTemplateID = replicationConfigurationTemplateID;
    }

    /**
     * <p>
     * Replication Configuration template template ID.
     * </p>
     * 
     * @return Replication Configuration template template ID.
     */

    public String getReplicationConfigurationTemplateID() {
        return this.replicationConfigurationTemplateID;
    }

    /**
     * <p>
     * Replication Configuration template template ID.
     * </p>
     * 
     * @param replicationConfigurationTemplateID
     *        Replication Configuration template template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withReplicationConfigurationTemplateID(String replicationConfigurationTemplateID) {
        setReplicationConfigurationTemplateID(replicationConfigurationTemplateID);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template server instance type.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Replication Configuration template server instance type.
     */

    public void setReplicationServerInstanceType(String replicationServerInstanceType) {
        this.replicationServerInstanceType = replicationServerInstanceType;
    }

    /**
     * <p>
     * Replication Configuration template server instance type.
     * </p>
     * 
     * @return Replication Configuration template server instance type.
     */

    public String getReplicationServerInstanceType() {
        return this.replicationServerInstanceType;
    }

    /**
     * <p>
     * Replication Configuration template server instance type.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Replication Configuration template server instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withReplicationServerInstanceType(String replicationServerInstanceType) {
        setReplicationServerInstanceType(replicationServerInstanceType);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template server Security Groups IDs.
     * </p>
     * 
     * @return Replication Configuration template server Security Groups IDs.
     */

    public java.util.List<String> getReplicationServersSecurityGroupsIDs() {
        return replicationServersSecurityGroupsIDs;
    }

    /**
     * <p>
     * Replication Configuration template server Security Groups IDs.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Replication Configuration template server Security Groups IDs.
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
     * Replication Configuration template server Security Groups IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationServersSecurityGroupsIDs(java.util.Collection)} or
     * {@link #withReplicationServersSecurityGroupsIDs(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Replication Configuration template server Security Groups IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withReplicationServersSecurityGroupsIDs(String... replicationServersSecurityGroupsIDs) {
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
     * Replication Configuration template server Security Groups IDs.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Replication Configuration template server Security Groups IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withReplicationServersSecurityGroupsIDs(java.util.Collection<String> replicationServersSecurityGroupsIDs) {
        setReplicationServersSecurityGroupsIDs(replicationServersSecurityGroupsIDs);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template Staging Area subnet ID.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Replication Configuration template Staging Area subnet ID.
     */

    public void setStagingAreaSubnetId(String stagingAreaSubnetId) {
        this.stagingAreaSubnetId = stagingAreaSubnetId;
    }

    /**
     * <p>
     * Replication Configuration template Staging Area subnet ID.
     * </p>
     * 
     * @return Replication Configuration template Staging Area subnet ID.
     */

    public String getStagingAreaSubnetId() {
        return this.stagingAreaSubnetId;
    }

    /**
     * <p>
     * Replication Configuration template Staging Area subnet ID.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Replication Configuration template Staging Area subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withStagingAreaSubnetId(String stagingAreaSubnetId) {
        setStagingAreaSubnetId(stagingAreaSubnetId);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template Staging Area Tags.
     * </p>
     * 
     * @return Replication Configuration template Staging Area Tags.
     */

    public java.util.Map<String, String> getStagingAreaTags() {
        return stagingAreaTags;
    }

    /**
     * <p>
     * Replication Configuration template Staging Area Tags.
     * </p>
     * 
     * @param stagingAreaTags
     *        Replication Configuration template Staging Area Tags.
     */

    public void setStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        this.stagingAreaTags = stagingAreaTags;
    }

    /**
     * <p>
     * Replication Configuration template Staging Area Tags.
     * </p>
     * 
     * @param stagingAreaTags
     *        Replication Configuration template Staging Area Tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        setStagingAreaTags(stagingAreaTags);
        return this;
    }

    /**
     * Add a single StagingAreaTags entry
     *
     * @see ReplicationConfigurationTemplate#withStagingAreaTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate addStagingAreaTagsEntry(String key, String value) {
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

    public ReplicationConfigurationTemplate clearStagingAreaTagsEntries() {
        this.stagingAreaTags = null;
        return this;
    }

    /**
     * <p>
     * Replication Configuration template Tags.
     * </p>
     * 
     * @return Replication Configuration template Tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Replication Configuration template Tags.
     * </p>
     * 
     * @param tags
     *        Replication Configuration template Tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Replication Configuration template Tags.
     * </p>
     * 
     * @param tags
     *        Replication Configuration template Tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ReplicationConfigurationTemplate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Replication Configuration template use Dedicated Replication Server.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Replication Configuration template use Dedicated Replication Server.
     */

    public void setUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        this.useDedicatedReplicationServer = useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Replication Configuration template use Dedicated Replication Server.
     * </p>
     * 
     * @return Replication Configuration template use Dedicated Replication Server.
     */

    public Boolean getUseDedicatedReplicationServer() {
        return this.useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Replication Configuration template use Dedicated Replication Server.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Replication Configuration template use Dedicated Replication Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationConfigurationTemplate withUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        setUseDedicatedReplicationServer(useDedicatedReplicationServer);
        return this;
    }

    /**
     * <p>
     * Replication Configuration template use Dedicated Replication Server.
     * </p>
     * 
     * @return Replication Configuration template use Dedicated Replication Server.
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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
        if (getReplicationConfigurationTemplateID() != null)
            sb.append("ReplicationConfigurationTemplateID: ").append(getReplicationConfigurationTemplateID()).append(",");
        if (getReplicationServerInstanceType() != null)
            sb.append("ReplicationServerInstanceType: ").append(getReplicationServerInstanceType()).append(",");
        if (getReplicationServersSecurityGroupsIDs() != null)
            sb.append("ReplicationServersSecurityGroupsIDs: ").append(getReplicationServersSecurityGroupsIDs()).append(",");
        if (getStagingAreaSubnetId() != null)
            sb.append("StagingAreaSubnetId: ").append(getStagingAreaSubnetId()).append(",");
        if (getStagingAreaTags() != null)
            sb.append("StagingAreaTags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof ReplicationConfigurationTemplate == false)
            return false;
        ReplicationConfigurationTemplate other = (ReplicationConfigurationTemplate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getReplicationConfigurationTemplateID() == null ^ this.getReplicationConfigurationTemplateID() == null)
            return false;
        if (other.getReplicationConfigurationTemplateID() != null
                && other.getReplicationConfigurationTemplateID().equals(this.getReplicationConfigurationTemplateID()) == false)
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
        if (other.getStagingAreaSubnetId() == null ^ this.getStagingAreaSubnetId() == null)
            return false;
        if (other.getStagingAreaSubnetId() != null && other.getStagingAreaSubnetId().equals(this.getStagingAreaSubnetId()) == false)
            return false;
        if (other.getStagingAreaTags() == null ^ this.getStagingAreaTags() == null)
            return false;
        if (other.getStagingAreaTags() != null && other.getStagingAreaTags().equals(this.getStagingAreaTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAssociateDefaultSecurityGroup() == null) ? 0 : getAssociateDefaultSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getBandwidthThrottling() == null) ? 0 : getBandwidthThrottling().hashCode());
        hashCode = prime * hashCode + ((getCreatePublicIP() == null) ? 0 : getCreatePublicIP().hashCode());
        hashCode = prime * hashCode + ((getDataPlaneRouting() == null) ? 0 : getDataPlaneRouting().hashCode());
        hashCode = prime * hashCode + ((getDefaultLargeStagingDiskType() == null) ? 0 : getDefaultLargeStagingDiskType().hashCode());
        hashCode = prime * hashCode + ((getEbsEncryption() == null) ? 0 : getEbsEncryption().hashCode());
        hashCode = prime * hashCode + ((getEbsEncryptionKeyArn() == null) ? 0 : getEbsEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfigurationTemplateID() == null) ? 0 : getReplicationConfigurationTemplateID().hashCode());
        hashCode = prime * hashCode + ((getReplicationServerInstanceType() == null) ? 0 : getReplicationServerInstanceType().hashCode());
        hashCode = prime * hashCode + ((getReplicationServersSecurityGroupsIDs() == null) ? 0 : getReplicationServersSecurityGroupsIDs().hashCode());
        hashCode = prime * hashCode + ((getStagingAreaSubnetId() == null) ? 0 : getStagingAreaSubnetId().hashCode());
        hashCode = prime * hashCode + ((getStagingAreaTags() == null) ? 0 : getStagingAreaTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUseDedicatedReplicationServer() == null) ? 0 : getUseDedicatedReplicationServer().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationConfigurationTemplate clone() {
        try {
            return (ReplicationConfigurationTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ReplicationConfigurationTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
