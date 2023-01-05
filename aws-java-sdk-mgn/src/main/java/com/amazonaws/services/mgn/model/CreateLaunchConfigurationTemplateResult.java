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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateLaunchConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchConfigurationTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Associate public Ip address.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * Launch configuration template boot mode.
     * </p>
     */
    private String bootMode;
    /**
     * <p>
     * Copy private Ip.
     * </p>
     */
    private Boolean copyPrivateIp;
    /**
     * <p>
     * Copy tags.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * EC2 launch template ID.
     * </p>
     */
    private String ec2LaunchTemplateID;
    /**
     * <p>
     * Enable map auto tagging.
     * </p>
     */
    private Boolean enableMapAutoTagging;
    /**
     * <p>
     * Large volume config.
     * </p>
     */
    private LaunchTemplateDiskConf largeVolumeConf;
    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     */
    private String launchConfigurationTemplateID;
    /**
     * <p>
     * Launch disposition.
     * </p>
     */
    private String launchDisposition;

    private Licensing licensing;
    /**
     * <p>
     * Launch configuration template map auto tagging MPE ID.
     * </p>
     */
    private String mapAutoTaggingMpeID;
    /**
     * <p>
     * Post Launch Actions of the Launch Configuration Template.
     * </p>
     */
    private PostLaunchActions postLaunchActions;
    /**
     * <p>
     * Small volume config.
     * </p>
     */
    private LaunchTemplateDiskConf smallVolumeConf;
    /**
     * <p>
     * Small volume maximum size.
     * </p>
     */
    private Long smallVolumeMaxSize;
    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     */
    private String targetInstanceTypeRightSizingMethod;

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     * 
     * @param arn
     *        ARN of the Launch Configuration Template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     * 
     * @return ARN of the Launch Configuration Template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     * 
     * @param arn
     *        ARN of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Associate public Ip address.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Associate public Ip address.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Associate public Ip address.
     * </p>
     * 
     * @return Associate public Ip address.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Associate public Ip address.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Associate public Ip address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Associate public Ip address.
     * </p>
     * 
     * @return Associate public Ip address.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Launch configuration template boot mode.
     * </p>
     * 
     * @param bootMode
     *        Launch configuration template boot mode.
     * @see BootMode
     */

    public void setBootMode(String bootMode) {
        this.bootMode = bootMode;
    }

    /**
     * <p>
     * Launch configuration template boot mode.
     * </p>
     * 
     * @return Launch configuration template boot mode.
     * @see BootMode
     */

    public String getBootMode() {
        return this.bootMode;
    }

    /**
     * <p>
     * Launch configuration template boot mode.
     * </p>
     * 
     * @param bootMode
     *        Launch configuration template boot mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BootMode
     */

    public CreateLaunchConfigurationTemplateResult withBootMode(String bootMode) {
        setBootMode(bootMode);
        return this;
    }

    /**
     * <p>
     * Launch configuration template boot mode.
     * </p>
     * 
     * @param bootMode
     *        Launch configuration template boot mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BootMode
     */

    public CreateLaunchConfigurationTemplateResult withBootMode(BootMode bootMode) {
        this.bootMode = bootMode.toString();
        return this;
    }

    /**
     * <p>
     * Copy private Ip.
     * </p>
     * 
     * @param copyPrivateIp
     *        Copy private Ip.
     */

    public void setCopyPrivateIp(Boolean copyPrivateIp) {
        this.copyPrivateIp = copyPrivateIp;
    }

    /**
     * <p>
     * Copy private Ip.
     * </p>
     * 
     * @return Copy private Ip.
     */

    public Boolean getCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Copy private Ip.
     * </p>
     * 
     * @param copyPrivateIp
     *        Copy private Ip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withCopyPrivateIp(Boolean copyPrivateIp) {
        setCopyPrivateIp(copyPrivateIp);
        return this;
    }

    /**
     * <p>
     * Copy private Ip.
     * </p>
     * 
     * @return Copy private Ip.
     */

    public Boolean isCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @param copyTags
     *        Copy tags.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @return Copy tags.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @param copyTags
     *        Copy tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @return Copy tags.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * EC2 launch template ID.
     * </p>
     * 
     * @param ec2LaunchTemplateID
     *        EC2 launch template ID.
     */

    public void setEc2LaunchTemplateID(String ec2LaunchTemplateID) {
        this.ec2LaunchTemplateID = ec2LaunchTemplateID;
    }

    /**
     * <p>
     * EC2 launch template ID.
     * </p>
     * 
     * @return EC2 launch template ID.
     */

    public String getEc2LaunchTemplateID() {
        return this.ec2LaunchTemplateID;
    }

    /**
     * <p>
     * EC2 launch template ID.
     * </p>
     * 
     * @param ec2LaunchTemplateID
     *        EC2 launch template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withEc2LaunchTemplateID(String ec2LaunchTemplateID) {
        setEc2LaunchTemplateID(ec2LaunchTemplateID);
        return this;
    }

    /**
     * <p>
     * Enable map auto tagging.
     * </p>
     * 
     * @param enableMapAutoTagging
     *        Enable map auto tagging.
     */

    public void setEnableMapAutoTagging(Boolean enableMapAutoTagging) {
        this.enableMapAutoTagging = enableMapAutoTagging;
    }

    /**
     * <p>
     * Enable map auto tagging.
     * </p>
     * 
     * @return Enable map auto tagging.
     */

    public Boolean getEnableMapAutoTagging() {
        return this.enableMapAutoTagging;
    }

    /**
     * <p>
     * Enable map auto tagging.
     * </p>
     * 
     * @param enableMapAutoTagging
     *        Enable map auto tagging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withEnableMapAutoTagging(Boolean enableMapAutoTagging) {
        setEnableMapAutoTagging(enableMapAutoTagging);
        return this;
    }

    /**
     * <p>
     * Enable map auto tagging.
     * </p>
     * 
     * @return Enable map auto tagging.
     */

    public Boolean isEnableMapAutoTagging() {
        return this.enableMapAutoTagging;
    }

    /**
     * <p>
     * Large volume config.
     * </p>
     * 
     * @param largeVolumeConf
     *        Large volume config.
     */

    public void setLargeVolumeConf(LaunchTemplateDiskConf largeVolumeConf) {
        this.largeVolumeConf = largeVolumeConf;
    }

    /**
     * <p>
     * Large volume config.
     * </p>
     * 
     * @return Large volume config.
     */

    public LaunchTemplateDiskConf getLargeVolumeConf() {
        return this.largeVolumeConf;
    }

    /**
     * <p>
     * Large volume config.
     * </p>
     * 
     * @param largeVolumeConf
     *        Large volume config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withLargeVolumeConf(LaunchTemplateDiskConf largeVolumeConf) {
        setLargeVolumeConf(largeVolumeConf);
        return this;
    }

    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        ID of the Launch Configuration Template.
     */

    public void setLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        this.launchConfigurationTemplateID = launchConfigurationTemplateID;
    }

    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     * 
     * @return ID of the Launch Configuration Template.
     */

    public String getLaunchConfigurationTemplateID() {
        return this.launchConfigurationTemplateID;
    }

    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        ID of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        setLaunchConfigurationTemplateID(launchConfigurationTemplateID);
        return this;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @param launchDisposition
     *        Launch disposition.
     * @see LaunchDisposition
     */

    public void setLaunchDisposition(String launchDisposition) {
        this.launchDisposition = launchDisposition;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @return Launch disposition.
     * @see LaunchDisposition
     */

    public String getLaunchDisposition() {
        return this.launchDisposition;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @param launchDisposition
     *        Launch disposition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public CreateLaunchConfigurationTemplateResult withLaunchDisposition(String launchDisposition) {
        setLaunchDisposition(launchDisposition);
        return this;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @param launchDisposition
     *        Launch disposition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public CreateLaunchConfigurationTemplateResult withLaunchDisposition(LaunchDisposition launchDisposition) {
        this.launchDisposition = launchDisposition.toString();
        return this;
    }

    /**
     * @param licensing
     */

    public void setLicensing(Licensing licensing) {
        this.licensing = licensing;
    }

    /**
     * @return
     */

    public Licensing getLicensing() {
        return this.licensing;
    }

    /**
     * @param licensing
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withLicensing(Licensing licensing) {
        setLicensing(licensing);
        return this;
    }

    /**
     * <p>
     * Launch configuration template map auto tagging MPE ID.
     * </p>
     * 
     * @param mapAutoTaggingMpeID
     *        Launch configuration template map auto tagging MPE ID.
     */

    public void setMapAutoTaggingMpeID(String mapAutoTaggingMpeID) {
        this.mapAutoTaggingMpeID = mapAutoTaggingMpeID;
    }

    /**
     * <p>
     * Launch configuration template map auto tagging MPE ID.
     * </p>
     * 
     * @return Launch configuration template map auto tagging MPE ID.
     */

    public String getMapAutoTaggingMpeID() {
        return this.mapAutoTaggingMpeID;
    }

    /**
     * <p>
     * Launch configuration template map auto tagging MPE ID.
     * </p>
     * 
     * @param mapAutoTaggingMpeID
     *        Launch configuration template map auto tagging MPE ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withMapAutoTaggingMpeID(String mapAutoTaggingMpeID) {
        setMapAutoTaggingMpeID(mapAutoTaggingMpeID);
        return this;
    }

    /**
     * <p>
     * Post Launch Actions of the Launch Configuration Template.
     * </p>
     * 
     * @param postLaunchActions
     *        Post Launch Actions of the Launch Configuration Template.
     */

    public void setPostLaunchActions(PostLaunchActions postLaunchActions) {
        this.postLaunchActions = postLaunchActions;
    }

    /**
     * <p>
     * Post Launch Actions of the Launch Configuration Template.
     * </p>
     * 
     * @return Post Launch Actions of the Launch Configuration Template.
     */

    public PostLaunchActions getPostLaunchActions() {
        return this.postLaunchActions;
    }

    /**
     * <p>
     * Post Launch Actions of the Launch Configuration Template.
     * </p>
     * 
     * @param postLaunchActions
     *        Post Launch Actions of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withPostLaunchActions(PostLaunchActions postLaunchActions) {
        setPostLaunchActions(postLaunchActions);
        return this;
    }

    /**
     * <p>
     * Small volume config.
     * </p>
     * 
     * @param smallVolumeConf
     *        Small volume config.
     */

    public void setSmallVolumeConf(LaunchTemplateDiskConf smallVolumeConf) {
        this.smallVolumeConf = smallVolumeConf;
    }

    /**
     * <p>
     * Small volume config.
     * </p>
     * 
     * @return Small volume config.
     */

    public LaunchTemplateDiskConf getSmallVolumeConf() {
        return this.smallVolumeConf;
    }

    /**
     * <p>
     * Small volume config.
     * </p>
     * 
     * @param smallVolumeConf
     *        Small volume config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withSmallVolumeConf(LaunchTemplateDiskConf smallVolumeConf) {
        setSmallVolumeConf(smallVolumeConf);
        return this;
    }

    /**
     * <p>
     * Small volume maximum size.
     * </p>
     * 
     * @param smallVolumeMaxSize
     *        Small volume maximum size.
     */

    public void setSmallVolumeMaxSize(Long smallVolumeMaxSize) {
        this.smallVolumeMaxSize = smallVolumeMaxSize;
    }

    /**
     * <p>
     * Small volume maximum size.
     * </p>
     * 
     * @return Small volume maximum size.
     */

    public Long getSmallVolumeMaxSize() {
        return this.smallVolumeMaxSize;
    }

    /**
     * <p>
     * Small volume maximum size.
     * </p>
     * 
     * @param smallVolumeMaxSize
     *        Small volume maximum size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withSmallVolumeMaxSize(Long smallVolumeMaxSize) {
        setSmallVolumeMaxSize(smallVolumeMaxSize);
        return this;
    }

    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     * 
     * @return Tags of the Launch Configuration Template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     * 
     * @param tags
     *        Tags of the Launch Configuration Template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     * 
     * @param tags
     *        Tags of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLaunchConfigurationTemplateResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateResult addTagsEntry(String key, String value) {
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

    public CreateLaunchConfigurationTemplateResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Target instance type right-sizing method.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public void setTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @return Target instance type right-sizing method.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public String getTargetInstanceTypeRightSizingMethod() {
        return this.targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Target instance type right-sizing method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public CreateLaunchConfigurationTemplateResult withTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        setTargetInstanceTypeRightSizingMethod(targetInstanceTypeRightSizingMethod);
        return this;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Target instance type right-sizing method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public CreateLaunchConfigurationTemplateResult withTargetInstanceTypeRightSizingMethod(
            TargetInstanceTypeRightSizingMethod targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress()).append(",");
        if (getBootMode() != null)
            sb.append("BootMode: ").append(getBootMode()).append(",");
        if (getCopyPrivateIp() != null)
            sb.append("CopyPrivateIp: ").append(getCopyPrivateIp()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getEc2LaunchTemplateID() != null)
            sb.append("Ec2LaunchTemplateID: ").append(getEc2LaunchTemplateID()).append(",");
        if (getEnableMapAutoTagging() != null)
            sb.append("EnableMapAutoTagging: ").append(getEnableMapAutoTagging()).append(",");
        if (getLargeVolumeConf() != null)
            sb.append("LargeVolumeConf: ").append(getLargeVolumeConf()).append(",");
        if (getLaunchConfigurationTemplateID() != null)
            sb.append("LaunchConfigurationTemplateID: ").append(getLaunchConfigurationTemplateID()).append(",");
        if (getLaunchDisposition() != null)
            sb.append("LaunchDisposition: ").append(getLaunchDisposition()).append(",");
        if (getLicensing() != null)
            sb.append("Licensing: ").append(getLicensing()).append(",");
        if (getMapAutoTaggingMpeID() != null)
            sb.append("MapAutoTaggingMpeID: ").append(getMapAutoTaggingMpeID()).append(",");
        if (getPostLaunchActions() != null)
            sb.append("PostLaunchActions: ").append(getPostLaunchActions()).append(",");
        if (getSmallVolumeConf() != null)
            sb.append("SmallVolumeConf: ").append(getSmallVolumeConf()).append(",");
        if (getSmallVolumeMaxSize() != null)
            sb.append("SmallVolumeMaxSize: ").append(getSmallVolumeMaxSize()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTargetInstanceTypeRightSizingMethod() != null)
            sb.append("TargetInstanceTypeRightSizingMethod: ").append(getTargetInstanceTypeRightSizingMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchConfigurationTemplateResult == false)
            return false;
        CreateLaunchConfigurationTemplateResult other = (CreateLaunchConfigurationTemplateResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getBootMode() == null ^ this.getBootMode() == null)
            return false;
        if (other.getBootMode() != null && other.getBootMode().equals(this.getBootMode()) == false)
            return false;
        if (other.getCopyPrivateIp() == null ^ this.getCopyPrivateIp() == null)
            return false;
        if (other.getCopyPrivateIp() != null && other.getCopyPrivateIp().equals(this.getCopyPrivateIp()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getEc2LaunchTemplateID() == null ^ this.getEc2LaunchTemplateID() == null)
            return false;
        if (other.getEc2LaunchTemplateID() != null && other.getEc2LaunchTemplateID().equals(this.getEc2LaunchTemplateID()) == false)
            return false;
        if (other.getEnableMapAutoTagging() == null ^ this.getEnableMapAutoTagging() == null)
            return false;
        if (other.getEnableMapAutoTagging() != null && other.getEnableMapAutoTagging().equals(this.getEnableMapAutoTagging()) == false)
            return false;
        if (other.getLargeVolumeConf() == null ^ this.getLargeVolumeConf() == null)
            return false;
        if (other.getLargeVolumeConf() != null && other.getLargeVolumeConf().equals(this.getLargeVolumeConf()) == false)
            return false;
        if (other.getLaunchConfigurationTemplateID() == null ^ this.getLaunchConfigurationTemplateID() == null)
            return false;
        if (other.getLaunchConfigurationTemplateID() != null
                && other.getLaunchConfigurationTemplateID().equals(this.getLaunchConfigurationTemplateID()) == false)
            return false;
        if (other.getLaunchDisposition() == null ^ this.getLaunchDisposition() == null)
            return false;
        if (other.getLaunchDisposition() != null && other.getLaunchDisposition().equals(this.getLaunchDisposition()) == false)
            return false;
        if (other.getLicensing() == null ^ this.getLicensing() == null)
            return false;
        if (other.getLicensing() != null && other.getLicensing().equals(this.getLicensing()) == false)
            return false;
        if (other.getMapAutoTaggingMpeID() == null ^ this.getMapAutoTaggingMpeID() == null)
            return false;
        if (other.getMapAutoTaggingMpeID() != null && other.getMapAutoTaggingMpeID().equals(this.getMapAutoTaggingMpeID()) == false)
            return false;
        if (other.getPostLaunchActions() == null ^ this.getPostLaunchActions() == null)
            return false;
        if (other.getPostLaunchActions() != null && other.getPostLaunchActions().equals(this.getPostLaunchActions()) == false)
            return false;
        if (other.getSmallVolumeConf() == null ^ this.getSmallVolumeConf() == null)
            return false;
        if (other.getSmallVolumeConf() != null && other.getSmallVolumeConf().equals(this.getSmallVolumeConf()) == false)
            return false;
        if (other.getSmallVolumeMaxSize() == null ^ this.getSmallVolumeMaxSize() == null)
            return false;
        if (other.getSmallVolumeMaxSize() != null && other.getSmallVolumeMaxSize().equals(this.getSmallVolumeMaxSize()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetInstanceTypeRightSizingMethod() == null ^ this.getTargetInstanceTypeRightSizingMethod() == null)
            return false;
        if (other.getTargetInstanceTypeRightSizingMethod() != null
                && other.getTargetInstanceTypeRightSizingMethod().equals(this.getTargetInstanceTypeRightSizingMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getBootMode() == null) ? 0 : getBootMode().hashCode());
        hashCode = prime * hashCode + ((getCopyPrivateIp() == null) ? 0 : getCopyPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getEc2LaunchTemplateID() == null) ? 0 : getEc2LaunchTemplateID().hashCode());
        hashCode = prime * hashCode + ((getEnableMapAutoTagging() == null) ? 0 : getEnableMapAutoTagging().hashCode());
        hashCode = prime * hashCode + ((getLargeVolumeConf() == null) ? 0 : getLargeVolumeConf().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationTemplateID() == null) ? 0 : getLaunchConfigurationTemplateID().hashCode());
        hashCode = prime * hashCode + ((getLaunchDisposition() == null) ? 0 : getLaunchDisposition().hashCode());
        hashCode = prime * hashCode + ((getLicensing() == null) ? 0 : getLicensing().hashCode());
        hashCode = prime * hashCode + ((getMapAutoTaggingMpeID() == null) ? 0 : getMapAutoTaggingMpeID().hashCode());
        hashCode = prime * hashCode + ((getPostLaunchActions() == null) ? 0 : getPostLaunchActions().hashCode());
        hashCode = prime * hashCode + ((getSmallVolumeConf() == null) ? 0 : getSmallVolumeConf().hashCode());
        hashCode = prime * hashCode + ((getSmallVolumeMaxSize() == null) ? 0 : getSmallVolumeMaxSize().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetInstanceTypeRightSizingMethod() == null) ? 0 : getTargetInstanceTypeRightSizingMethod().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchConfigurationTemplateResult clone() {
        try {
            return (CreateLaunchConfigurationTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
