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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateReplicationConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to associate the default Application Migration Service Security group with the Replication Settings
     * template.
     * </p>
     */
    private Boolean associateDefaultSecurityGroup;
    /**
     * <p>
     * Request to configure bandwidth throttling during Replication Settings template creation.
     * </p>
     */
    private Long bandwidthThrottling;
    /**
     * <p>
     * Request to create Public IP during Replication Settings template creation.
     * </p>
     */
    private Boolean createPublicIP;
    /**
     * <p>
     * Request to configure data plane routing during Replication Settings template creation.
     * </p>
     */
    private String dataPlaneRouting;
    /**
     * <p>
     * Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template creation.
     * </p>
     */
    private String defaultLargeStagingDiskType;
    /**
     * <p>
     * Request to configure EBS enryption during Replication Settings template creation.
     * </p>
     */
    private String ebsEncryption;
    /**
     * <p>
     * Request to configure an EBS enryption key during Replication Settings template creation.
     * </p>
     */
    private String ebsEncryptionKeyArn;
    /**
     * <p>
     * Request to configure the Replication Server instance type during Replication Settings template creation.
     * </p>
     */
    private String replicationServerInstanceType;
    /**
     * <p>
     * Request to configure the Replication Server Secuirity group ID during Replication Settings template creation.
     * </p>
     */
    private java.util.List<String> replicationServersSecurityGroupsIDs;
    /**
     * <p>
     * Request to configure the Staging Area subnet ID during Replication Settings template creation.
     * </p>
     */
    private String stagingAreaSubnetId;
    /**
     * <p>
     * Request to configure Staiging Area tags during Replication Settings template creation.
     * </p>
     */
    private java.util.Map<String, String> stagingAreaTags;
    /**
     * <p>
     * Request to configure tags during Replication Settings template creation.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Request to use Dedicated Replication Servers during Replication Settings template creation.
     * </p>
     */
    private Boolean useDedicatedReplicationServer;

    /**
     * <p>
     * Request to associate the default Application Migration Service Security group with the Replication Settings
     * template.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Request to associate the default Application Migration Service Security group with the Replication
     *        Settings template.
     */

    public void setAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        this.associateDefaultSecurityGroup = associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Request to associate the default Application Migration Service Security group with the Replication Settings
     * template.
     * </p>
     * 
     * @return Request to associate the default Application Migration Service Security group with the Replication
     *         Settings template.
     */

    public Boolean getAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Request to associate the default Application Migration Service Security group with the Replication Settings
     * template.
     * </p>
     * 
     * @param associateDefaultSecurityGroup
     *        Request to associate the default Application Migration Service Security group with the Replication
     *        Settings template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withAssociateDefaultSecurityGroup(Boolean associateDefaultSecurityGroup) {
        setAssociateDefaultSecurityGroup(associateDefaultSecurityGroup);
        return this;
    }

    /**
     * <p>
     * Request to associate the default Application Migration Service Security group with the Replication Settings
     * template.
     * </p>
     * 
     * @return Request to associate the default Application Migration Service Security group with the Replication
     *         Settings template.
     */

    public Boolean isAssociateDefaultSecurityGroup() {
        return this.associateDefaultSecurityGroup;
    }

    /**
     * <p>
     * Request to configure bandwidth throttling during Replication Settings template creation.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Request to configure bandwidth throttling during Replication Settings template creation.
     */

    public void setBandwidthThrottling(Long bandwidthThrottling) {
        this.bandwidthThrottling = bandwidthThrottling;
    }

    /**
     * <p>
     * Request to configure bandwidth throttling during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure bandwidth throttling during Replication Settings template creation.
     */

    public Long getBandwidthThrottling() {
        return this.bandwidthThrottling;
    }

    /**
     * <p>
     * Request to configure bandwidth throttling during Replication Settings template creation.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Request to configure bandwidth throttling during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withBandwidthThrottling(Long bandwidthThrottling) {
        setBandwidthThrottling(bandwidthThrottling);
        return this;
    }

    /**
     * <p>
     * Request to create Public IP during Replication Settings template creation.
     * </p>
     * 
     * @param createPublicIP
     *        Request to create Public IP during Replication Settings template creation.
     */

    public void setCreatePublicIP(Boolean createPublicIP) {
        this.createPublicIP = createPublicIP;
    }

    /**
     * <p>
     * Request to create Public IP during Replication Settings template creation.
     * </p>
     * 
     * @return Request to create Public IP during Replication Settings template creation.
     */

    public Boolean getCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Request to create Public IP during Replication Settings template creation.
     * </p>
     * 
     * @param createPublicIP
     *        Request to create Public IP during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withCreatePublicIP(Boolean createPublicIP) {
        setCreatePublicIP(createPublicIP);
        return this;
    }

    /**
     * <p>
     * Request to create Public IP during Replication Settings template creation.
     * </p>
     * 
     * @return Request to create Public IP during Replication Settings template creation.
     */

    public Boolean isCreatePublicIP() {
        return this.createPublicIP;
    }

    /**
     * <p>
     * Request to configure data plane routing during Replication Settings template creation.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Request to configure data plane routing during Replication Settings template creation.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public void setDataPlaneRouting(String dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting;
    }

    /**
     * <p>
     * Request to configure data plane routing during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure data plane routing during Replication Settings template creation.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public String getDataPlaneRouting() {
        return this.dataPlaneRouting;
    }

    /**
     * <p>
     * Request to configure data plane routing during Replication Settings template creation.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Request to configure data plane routing during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public CreateReplicationConfigurationTemplateRequest withDataPlaneRouting(String dataPlaneRouting) {
        setDataPlaneRouting(dataPlaneRouting);
        return this;
    }

    /**
     * <p>
     * Request to configure data plane routing during Replication Settings template creation.
     * </p>
     * 
     * @param dataPlaneRouting
     *        Request to configure data plane routing during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDataPlaneRouting
     */

    public CreateReplicationConfigurationTemplateRequest withDataPlaneRouting(ReplicationConfigurationDataPlaneRouting dataPlaneRouting) {
        this.dataPlaneRouting = dataPlaneRouting.toString();
        return this;
    }

    /**
     * <p>
     * Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template creation.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template
     *        creation.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public void setDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template
     *         creation.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public String getDefaultLargeStagingDiskType() {
        return this.defaultLargeStagingDiskType;
    }

    /**
     * <p>
     * Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template creation.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template
     *        creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public CreateReplicationConfigurationTemplateRequest withDefaultLargeStagingDiskType(String defaultLargeStagingDiskType) {
        setDefaultLargeStagingDiskType(defaultLargeStagingDiskType);
        return this;
    }

    /**
     * <p>
     * Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template creation.
     * </p>
     * 
     * @param defaultLargeStagingDiskType
     *        Request to configure the Staging Disk EBS volume type to "gp2" during Replication Settings template
     *        creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationDefaultLargeStagingDiskType
     */

    public CreateReplicationConfigurationTemplateRequest withDefaultLargeStagingDiskType(
            ReplicationConfigurationDefaultLargeStagingDiskType defaultLargeStagingDiskType) {
        this.defaultLargeStagingDiskType = defaultLargeStagingDiskType.toString();
        return this;
    }

    /**
     * <p>
     * Request to configure EBS enryption during Replication Settings template creation.
     * </p>
     * 
     * @param ebsEncryption
     *        Request to configure EBS enryption during Replication Settings template creation.
     * @see ReplicationConfigurationEbsEncryption
     */

    public void setEbsEncryption(String ebsEncryption) {
        this.ebsEncryption = ebsEncryption;
    }

    /**
     * <p>
     * Request to configure EBS enryption during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure EBS enryption during Replication Settings template creation.
     * @see ReplicationConfigurationEbsEncryption
     */

    public String getEbsEncryption() {
        return this.ebsEncryption;
    }

    /**
     * <p>
     * Request to configure EBS enryption during Replication Settings template creation.
     * </p>
     * 
     * @param ebsEncryption
     *        Request to configure EBS enryption during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public CreateReplicationConfigurationTemplateRequest withEbsEncryption(String ebsEncryption) {
        setEbsEncryption(ebsEncryption);
        return this;
    }

    /**
     * <p>
     * Request to configure EBS enryption during Replication Settings template creation.
     * </p>
     * 
     * @param ebsEncryption
     *        Request to configure EBS enryption during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationConfigurationEbsEncryption
     */

    public CreateReplicationConfigurationTemplateRequest withEbsEncryption(ReplicationConfigurationEbsEncryption ebsEncryption) {
        this.ebsEncryption = ebsEncryption.toString();
        return this;
    }

    /**
     * <p>
     * Request to configure an EBS enryption key during Replication Settings template creation.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Request to configure an EBS enryption key during Replication Settings template creation.
     */

    public void setEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        this.ebsEncryptionKeyArn = ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Request to configure an EBS enryption key during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure an EBS enryption key during Replication Settings template creation.
     */

    public String getEbsEncryptionKeyArn() {
        return this.ebsEncryptionKeyArn;
    }

    /**
     * <p>
     * Request to configure an EBS enryption key during Replication Settings template creation.
     * </p>
     * 
     * @param ebsEncryptionKeyArn
     *        Request to configure an EBS enryption key during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withEbsEncryptionKeyArn(String ebsEncryptionKeyArn) {
        setEbsEncryptionKeyArn(ebsEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * Request to configure the Replication Server instance type during Replication Settings template creation.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Request to configure the Replication Server instance type during Replication Settings template creation.
     */

    public void setReplicationServerInstanceType(String replicationServerInstanceType) {
        this.replicationServerInstanceType = replicationServerInstanceType;
    }

    /**
     * <p>
     * Request to configure the Replication Server instance type during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure the Replication Server instance type during Replication Settings template creation.
     */

    public String getReplicationServerInstanceType() {
        return this.replicationServerInstanceType;
    }

    /**
     * <p>
     * Request to configure the Replication Server instance type during Replication Settings template creation.
     * </p>
     * 
     * @param replicationServerInstanceType
     *        Request to configure the Replication Server instance type during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withReplicationServerInstanceType(String replicationServerInstanceType) {
        setReplicationServerInstanceType(replicationServerInstanceType);
        return this;
    }

    /**
     * <p>
     * Request to configure the Replication Server Secuirity group ID during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure the Replication Server Secuirity group ID during Replication Settings template
     *         creation.
     */

    public java.util.List<String> getReplicationServersSecurityGroupsIDs() {
        return replicationServersSecurityGroupsIDs;
    }

    /**
     * <p>
     * Request to configure the Replication Server Secuirity group ID during Replication Settings template creation.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Request to configure the Replication Server Secuirity group ID during Replication Settings template
     *        creation.
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
     * Request to configure the Replication Server Secuirity group ID during Replication Settings template creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationServersSecurityGroupsIDs(java.util.Collection)} or
     * {@link #withReplicationServersSecurityGroupsIDs(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Request to configure the Replication Server Secuirity group ID during Replication Settings template
     *        creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withReplicationServersSecurityGroupsIDs(String... replicationServersSecurityGroupsIDs) {
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
     * Request to configure the Replication Server Secuirity group ID during Replication Settings template creation.
     * </p>
     * 
     * @param replicationServersSecurityGroupsIDs
     *        Request to configure the Replication Server Secuirity group ID during Replication Settings template
     *        creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withReplicationServersSecurityGroupsIDs(
            java.util.Collection<String> replicationServersSecurityGroupsIDs) {
        setReplicationServersSecurityGroupsIDs(replicationServersSecurityGroupsIDs);
        return this;
    }

    /**
     * <p>
     * Request to configure the Staging Area subnet ID during Replication Settings template creation.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Request to configure the Staging Area subnet ID during Replication Settings template creation.
     */

    public void setStagingAreaSubnetId(String stagingAreaSubnetId) {
        this.stagingAreaSubnetId = stagingAreaSubnetId;
    }

    /**
     * <p>
     * Request to configure the Staging Area subnet ID during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure the Staging Area subnet ID during Replication Settings template creation.
     */

    public String getStagingAreaSubnetId() {
        return this.stagingAreaSubnetId;
    }

    /**
     * <p>
     * Request to configure the Staging Area subnet ID during Replication Settings template creation.
     * </p>
     * 
     * @param stagingAreaSubnetId
     *        Request to configure the Staging Area subnet ID during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withStagingAreaSubnetId(String stagingAreaSubnetId) {
        setStagingAreaSubnetId(stagingAreaSubnetId);
        return this;
    }

    /**
     * <p>
     * Request to configure Staiging Area tags during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure Staiging Area tags during Replication Settings template creation.
     */

    public java.util.Map<String, String> getStagingAreaTags() {
        return stagingAreaTags;
    }

    /**
     * <p>
     * Request to configure Staiging Area tags during Replication Settings template creation.
     * </p>
     * 
     * @param stagingAreaTags
     *        Request to configure Staiging Area tags during Replication Settings template creation.
     */

    public void setStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        this.stagingAreaTags = stagingAreaTags;
    }

    /**
     * <p>
     * Request to configure Staiging Area tags during Replication Settings template creation.
     * </p>
     * 
     * @param stagingAreaTags
     *        Request to configure Staiging Area tags during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withStagingAreaTags(java.util.Map<String, String> stagingAreaTags) {
        setStagingAreaTags(stagingAreaTags);
        return this;
    }

    /**
     * Add a single StagingAreaTags entry
     *
     * @see CreateReplicationConfigurationTemplateRequest#withStagingAreaTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest addStagingAreaTagsEntry(String key, String value) {
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

    public CreateReplicationConfigurationTemplateRequest clearStagingAreaTagsEntries() {
        this.stagingAreaTags = null;
        return this;
    }

    /**
     * <p>
     * Request to configure tags during Replication Settings template creation.
     * </p>
     * 
     * @return Request to configure tags during Replication Settings template creation.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Request to configure tags during Replication Settings template creation.
     * </p>
     * 
     * @param tags
     *        Request to configure tags during Replication Settings template creation.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Request to configure tags during Replication Settings template creation.
     * </p>
     * 
     * @param tags
     *        Request to configure tags during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateReplicationConfigurationTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateReplicationConfigurationTemplateRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Request to use Dedicated Replication Servers during Replication Settings template creation.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Request to use Dedicated Replication Servers during Replication Settings template creation.
     */

    public void setUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        this.useDedicatedReplicationServer = useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Request to use Dedicated Replication Servers during Replication Settings template creation.
     * </p>
     * 
     * @return Request to use Dedicated Replication Servers during Replication Settings template creation.
     */

    public Boolean getUseDedicatedReplicationServer() {
        return this.useDedicatedReplicationServer;
    }

    /**
     * <p>
     * Request to use Dedicated Replication Servers during Replication Settings template creation.
     * </p>
     * 
     * @param useDedicatedReplicationServer
     *        Request to use Dedicated Replication Servers during Replication Settings template creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationTemplateRequest withUseDedicatedReplicationServer(Boolean useDedicatedReplicationServer) {
        setUseDedicatedReplicationServer(useDedicatedReplicationServer);
        return this;
    }

    /**
     * <p>
     * Request to use Dedicated Replication Servers during Replication Settings template creation.
     * </p>
     * 
     * @return Request to use Dedicated Replication Servers during Replication Settings template creation.
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

        if (obj instanceof CreateReplicationConfigurationTemplateRequest == false)
            return false;
        CreateReplicationConfigurationTemplateRequest other = (CreateReplicationConfigurationTemplateRequest) obj;
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

        hashCode = prime * hashCode + ((getAssociateDefaultSecurityGroup() == null) ? 0 : getAssociateDefaultSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getBandwidthThrottling() == null) ? 0 : getBandwidthThrottling().hashCode());
        hashCode = prime * hashCode + ((getCreatePublicIP() == null) ? 0 : getCreatePublicIP().hashCode());
        hashCode = prime * hashCode + ((getDataPlaneRouting() == null) ? 0 : getDataPlaneRouting().hashCode());
        hashCode = prime * hashCode + ((getDefaultLargeStagingDiskType() == null) ? 0 : getDefaultLargeStagingDiskType().hashCode());
        hashCode = prime * hashCode + ((getEbsEncryption() == null) ? 0 : getEbsEncryption().hashCode());
        hashCode = prime * hashCode + ((getEbsEncryptionKeyArn() == null) ? 0 : getEbsEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationServerInstanceType() == null) ? 0 : getReplicationServerInstanceType().hashCode());
        hashCode = prime * hashCode + ((getReplicationServersSecurityGroupsIDs() == null) ? 0 : getReplicationServersSecurityGroupsIDs().hashCode());
        hashCode = prime * hashCode + ((getStagingAreaSubnetId() == null) ? 0 : getStagingAreaSubnetId().hashCode());
        hashCode = prime * hashCode + ((getStagingAreaTags() == null) ? 0 : getStagingAreaTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUseDedicatedReplicationServer() == null) ? 0 : getUseDedicatedReplicationServer().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationConfigurationTemplateRequest clone() {
        return (CreateReplicationConfigurationTemplateRequest) super.clone();
    }

}
