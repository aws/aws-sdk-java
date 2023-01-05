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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a launch configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingLaunchConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingLaunchConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * Specifies the block devices for the instance.
     * </p>
     */
    private java.util.List<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails> blockDeviceMappings;
    /**
     * <p>
     * The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     * </p>
     */
    private String classicLinkVpcId;
    /**
     * <p>
     * The identifiers of one or more security groups for the VPC that is specified in <code>ClassicLinkVPCId</code>.
     * </p>
     */
    private java.util.List<String> classicLinkVpcSecurityGroups;
    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * Whether the launch configuration is optimized for Amazon EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The name or the ARN of the instance profile associated with the IAM role for the instance. The instance profile
     * contains the IAM role.
     * </p>
     */
    private String iamInstanceProfile;
    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * Indicates the type of monitoring for instances in the group.
     * </p>
     */
    private AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails instanceMonitoring;
    /**
     * <p>
     * The instance type for the instances.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The identifier of the kernel associated with the AMI.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     */
    private String placementTenancy;
    /**
     * <p>
     * The identifier of the RAM disk associated with the AMI.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The security groups to assign to the instances in the Auto Scaling group.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The metadata options for the instances.
     * </p>
     */
    private AwsAutoScalingLaunchConfigurationMetadataOptions metadataOptions;

    /**
     * <p>
     * For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     *        instances.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * 
     * @return For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     *         instances.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * 
     * @return For Auto Scaling groups that run in a VPC, specifies whether to assign a public IP address to the group's
     *         instances.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Specifies the block devices for the instance.
     * </p>
     * 
     * @return Specifies the block devices for the instance.
     */

    public java.util.List<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Specifies the block devices for the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Specifies the block devices for the instance.
     */

    public void setBlockDeviceMappings(java.util.Collection<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails>(blockDeviceMappings);
    }

    /**
     * <p>
     * Specifies the block devices for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Specifies the block devices for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withBlockDeviceMappings(AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new java.util.ArrayList<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails>(blockDeviceMappings.length));
        }
        for (AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the block devices for the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Specifies the block devices for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withBlockDeviceMappings(
            java.util.Collection<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     * </p>
     * 
     * @param classicLinkVpcId
     *        The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     */

    public void setClassicLinkVpcId(String classicLinkVpcId) {
        this.classicLinkVpcId = classicLinkVpcId;
    }

    /**
     * <p>
     * The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     * </p>
     * 
     * @return The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     */

    public String getClassicLinkVpcId() {
        return this.classicLinkVpcId;
    }

    /**
     * <p>
     * The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     * </p>
     * 
     * @param classicLinkVpcId
     *        The identifier of a ClassicLink-enabled VPC that EC2-Classic instances are linked to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withClassicLinkVpcId(String classicLinkVpcId) {
        setClassicLinkVpcId(classicLinkVpcId);
        return this;
    }

    /**
     * <p>
     * The identifiers of one or more security groups for the VPC that is specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * 
     * @return The identifiers of one or more security groups for the VPC that is specified in
     *         <code>ClassicLinkVPCId</code>.
     */

    public java.util.List<String> getClassicLinkVpcSecurityGroups() {
        return classicLinkVpcSecurityGroups;
    }

    /**
     * <p>
     * The identifiers of one or more security groups for the VPC that is specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * 
     * @param classicLinkVpcSecurityGroups
     *        The identifiers of one or more security groups for the VPC that is specified in
     *        <code>ClassicLinkVPCId</code>.
     */

    public void setClassicLinkVpcSecurityGroups(java.util.Collection<String> classicLinkVpcSecurityGroups) {
        if (classicLinkVpcSecurityGroups == null) {
            this.classicLinkVpcSecurityGroups = null;
            return;
        }

        this.classicLinkVpcSecurityGroups = new java.util.ArrayList<String>(classicLinkVpcSecurityGroups);
    }

    /**
     * <p>
     * The identifiers of one or more security groups for the VPC that is specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassicLinkVpcSecurityGroups(java.util.Collection)} or
     * {@link #withClassicLinkVpcSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param classicLinkVpcSecurityGroups
     *        The identifiers of one or more security groups for the VPC that is specified in
     *        <code>ClassicLinkVPCId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withClassicLinkVpcSecurityGroups(String... classicLinkVpcSecurityGroups) {
        if (this.classicLinkVpcSecurityGroups == null) {
            setClassicLinkVpcSecurityGroups(new java.util.ArrayList<String>(classicLinkVpcSecurityGroups.length));
        }
        for (String ele : classicLinkVpcSecurityGroups) {
            this.classicLinkVpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of one or more security groups for the VPC that is specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * 
     * @param classicLinkVpcSecurityGroups
     *        The identifiers of one or more security groups for the VPC that is specified in
     *        <code>ClassicLinkVPCId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withClassicLinkVpcSecurityGroups(java.util.Collection<String> classicLinkVpcSecurityGroups) {
        setClassicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdTime
     *        The creation date and time for the launch configuration.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The creation date and time for the launch configuration.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdTime
     *        The creation date and time for the launch configuration.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Whether the launch configuration is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        Whether the launch configuration is optimized for Amazon EBS I/O.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Whether the launch configuration is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @return Whether the launch configuration is optimized for Amazon EBS I/O.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Whether the launch configuration is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        Whether the launch configuration is optimized for Amazon EBS I/O.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Whether the launch configuration is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @return Whether the launch configuration is optimized for Amazon EBS I/O.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The name or the ARN of the instance profile associated with the IAM role for the instance. The instance profile
     * contains the IAM role.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or the ARN of the instance profile associated with the IAM role for the instance. The instance
     *        profile contains the IAM role.
     */

    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The name or the ARN of the instance profile associated with the IAM role for the instance. The instance profile
     * contains the IAM role.
     * </p>
     * 
     * @return The name or the ARN of the instance profile associated with the IAM role for the instance. The instance
     *         profile contains the IAM role.
     */

    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The name or the ARN of the instance profile associated with the IAM role for the instance. The instance profile
     * contains the IAM role.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or the ARN of the instance profile associated with the IAM role for the instance. The instance
     *        profile contains the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withIamInstanceProfile(String iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     * </p>
     * 
     * @param imageId
     *        The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     * </p>
     * 
     * @return The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     * </p>
     * 
     * @param imageId
     *        The identifier of the Amazon Machine Image (AMI) that is used to launch EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * Indicates the type of monitoring for instances in the group.
     * </p>
     * 
     * @param instanceMonitoring
     *        Indicates the type of monitoring for instances in the group.
     */

    public void setInstanceMonitoring(AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }

    /**
     * <p>
     * Indicates the type of monitoring for instances in the group.
     * </p>
     * 
     * @return Indicates the type of monitoring for instances in the group.
     */

    public AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails getInstanceMonitoring() {
        return this.instanceMonitoring;
    }

    /**
     * <p>
     * Indicates the type of monitoring for instances in the group.
     * </p>
     * 
     * @param instanceMonitoring
     *        Indicates the type of monitoring for instances in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withInstanceMonitoring(AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails instanceMonitoring) {
        setInstanceMonitoring(instanceMonitoring);
        return this;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the instances.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * 
     * @return The instance type for the instances.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The identifier of the kernel associated with the AMI.
     * </p>
     * 
     * @param kernelId
     *        The identifier of the kernel associated with the AMI.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The identifier of the kernel associated with the AMI.
     * </p>
     * 
     * @return The identifier of the kernel associated with the AMI.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The identifier of the kernel associated with the AMI.
     * </p>
     * 
     * @param kernelId
     *        The identifier of the kernel associated with the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @return The name of the key pair.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @return The name of the launch configuration.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated,
     *        single-tenant hardware and can only be launched into a VPC.
     */

    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * 
     * @return The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated,
     *         single-tenant hardware and can only be launched into a VPC.
     */

    public String getPlacementTenancy() {
        return this.placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated,
     *        single-tenant hardware and can only be launched into a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withPlacementTenancy(String placementTenancy) {
        setPlacementTenancy(placementTenancy);
        return this;
    }

    /**
     * <p>
     * The identifier of the RAM disk associated with the AMI.
     * </p>
     * 
     * @param ramdiskId
     *        The identifier of the RAM disk associated with the AMI.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The identifier of the RAM disk associated with the AMI.
     * </p>
     * 
     * @return The identifier of the RAM disk associated with the AMI.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The identifier of the RAM disk associated with the AMI.
     * </p>
     * 
     * @param ramdiskId
     *        The identifier of the RAM disk associated with the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * 
     * @return The security groups to assign to the instances in the Auto Scaling group.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * 
     * @param securityGroups
     *        The security groups to assign to the instances in the Auto Scaling group.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups to assign to the instances in the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * 
     * @param securityGroups
     *        The security groups to assign to the instances in the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     * </p>
     * 
     * @return The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance that is launched to fulfill the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     * </p>
     * 
     * @return The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the launched EC2 instances. Must be base64-encoded text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The metadata options for the instances.
     * </p>
     * 
     * @param metadataOptions
     *        The metadata options for the instances.
     */

    public void setMetadataOptions(AwsAutoScalingLaunchConfigurationMetadataOptions metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instances.
     * </p>
     * 
     * @return The metadata options for the instances.
     */

    public AwsAutoScalingLaunchConfigurationMetadataOptions getMetadataOptions() {
        return this.metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instances.
     * </p>
     * 
     * @param metadataOptions
     *        The metadata options for the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationDetails withMetadataOptions(AwsAutoScalingLaunchConfigurationMetadataOptions metadataOptions) {
        setMetadataOptions(metadataOptions);
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
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getClassicLinkVpcId() != null)
            sb.append("ClassicLinkVpcId: ").append(getClassicLinkVpcId()).append(",");
        if (getClassicLinkVpcSecurityGroups() != null)
            sb.append("ClassicLinkVpcSecurityGroups: ").append(getClassicLinkVpcSecurityGroups()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceMonitoring() != null)
            sb.append("InstanceMonitoring: ").append(getInstanceMonitoring()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: ").append(getLaunchConfigurationName()).append(",");
        if (getPlacementTenancy() != null)
            sb.append("PlacementTenancy: ").append(getPlacementTenancy()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getMetadataOptions() != null)
            sb.append("MetadataOptions: ").append(getMetadataOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAutoScalingLaunchConfigurationDetails == false)
            return false;
        AwsAutoScalingLaunchConfigurationDetails other = (AwsAutoScalingLaunchConfigurationDetails) obj;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getClassicLinkVpcId() == null ^ this.getClassicLinkVpcId() == null)
            return false;
        if (other.getClassicLinkVpcId() != null && other.getClassicLinkVpcId().equals(this.getClassicLinkVpcId()) == false)
            return false;
        if (other.getClassicLinkVpcSecurityGroups() == null ^ this.getClassicLinkVpcSecurityGroups() == null)
            return false;
        if (other.getClassicLinkVpcSecurityGroups() != null && other.getClassicLinkVpcSecurityGroups().equals(this.getClassicLinkVpcSecurityGroups()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceMonitoring() == null ^ this.getInstanceMonitoring() == null)
            return false;
        if (other.getInstanceMonitoring() != null && other.getInstanceMonitoring().equals(this.getInstanceMonitoring()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getPlacementTenancy() == null ^ this.getPlacementTenancy() == null)
            return false;
        if (other.getPlacementTenancy() != null && other.getPlacementTenancy().equals(this.getPlacementTenancy()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getMetadataOptions() == null ^ this.getMetadataOptions() == null)
            return false;
        if (other.getMetadataOptions() != null && other.getMetadataOptions().equals(this.getMetadataOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getClassicLinkVpcId() == null) ? 0 : getClassicLinkVpcId().hashCode());
        hashCode = prime * hashCode + ((getClassicLinkVpcSecurityGroups() == null) ? 0 : getClassicLinkVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceMonitoring() == null) ? 0 : getInstanceMonitoring().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getPlacementTenancy() == null) ? 0 : getPlacementTenancy().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getMetadataOptions() == null) ? 0 : getMetadataOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsAutoScalingLaunchConfigurationDetails clone() {
        try {
            return (AwsAutoScalingLaunchConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingLaunchConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
