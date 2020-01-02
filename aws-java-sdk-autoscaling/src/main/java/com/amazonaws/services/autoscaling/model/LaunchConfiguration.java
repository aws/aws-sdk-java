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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LaunchConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     */
    private String launchConfigurationARN;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String classicLinkVPCId;
    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> classicLinkVPCSecurityGroups;
    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     * <code>false</code>) monitoring.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private InstanceMonitoring instanceMonitoring;
    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot price.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance.
     * The instance profile contains the IAM role.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM
     * Role for Applications That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String iamInstanceProfile;
    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     * <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String placementTenancy;

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

    public LaunchConfiguration withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationARN
     *        The Amazon Resource Name (ARN) of the launch configuration.
     */

    public void setLaunchConfigurationARN(String launchConfigurationARN) {
        this.launchConfigurationARN = launchConfigurationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the launch configuration.
     */

    public String getLaunchConfigurationARN() {
        return this.launchConfigurationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationARN
     *        The Amazon Resource Name (ARN) of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withLaunchConfigurationARN(String launchConfigurationARN) {
        setLaunchConfigurationARN(launchConfigurationARN);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     *         <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The name of the key pair.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *         Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param securityGroups
     *        A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *        Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *        Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param securityGroups
     *        A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *        Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCId
     *        The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *         <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *         EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getClassicLinkVPCId() {
        return this.classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCId
     *        The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withClassicLinkVPCId(String classicLinkVPCId) {
        setClassicLinkVPCId(classicLinkVPCId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *         <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *         EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public java.util.List<String> getClassicLinkVPCSecurityGroups() {
        if (classicLinkVPCSecurityGroups == null) {
            classicLinkVPCSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return classicLinkVPCSecurityGroups;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setClassicLinkVPCSecurityGroups(java.util.Collection<String> classicLinkVPCSecurityGroups) {
        if (classicLinkVPCSecurityGroups == null) {
            this.classicLinkVPCSecurityGroups = null;
            return;
        }

        this.classicLinkVPCSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(classicLinkVPCSecurityGroups);
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassicLinkVPCSecurityGroups(java.util.Collection)} or
     * {@link #withClassicLinkVPCSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withClassicLinkVPCSecurityGroups(String... classicLinkVPCSecurityGroups) {
        if (this.classicLinkVPCSecurityGroups == null) {
            setClassicLinkVPCSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(classicLinkVPCSecurityGroups.length));
        }
        for (String ele : classicLinkVPCSecurityGroups) {
            this.classicLinkVPCSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the VPC specified in <code>ClassicLinkVPCId</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withClassicLinkVPCSecurityGroups(java.util.Collection<String> classicLinkVPCSecurityGroups) {
        setClassicLinkVPCSecurityGroups(classicLinkVPCSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the launched EC2 instances.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata
     *        and User Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The Base64-encoded user data to make available to the launched EC2 instances.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata
     *         and User Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the launched EC2 instances.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata
     *        and User Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * 
     * @param instanceType
     *        The instance type for the instances.</p>
     *        <p>
     *        For information about available instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        >Available Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * 
     * @return The instance type for the instances.</p>
     *         <p>
     *         For information about available instance types, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *         >Available Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * 
     * @param instanceType
     *        The instance type for the instances.</p>
     *        <p>
     *        For information about available instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        >Available Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel associated with the AMI.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * 
     * @return The ID of the kernel associated with the AMI.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel associated with the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk associated with the AMI.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * 
     * @return The ID of the RAM disk associated with the AMI.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk associated with the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return A block device mapping, which specifies the block devices for the instance.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        A block device mapping, which specifies the block devices for the instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        A block device mapping, which specifies the block devices for the instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (BlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        A block device mapping, which specifies the block devices for the instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     * <code>false</code>) monitoring.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param instanceMonitoring
     *        Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     *        <code>false</code>) monitoring.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     *        >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     * <code>false</code>) monitoring.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     *         <code>false</code>) monitoring.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     *         >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public InstanceMonitoring getInstanceMonitoring() {
        return this.instanceMonitoring;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     * <code>false</code>) monitoring.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param instanceMonitoring
     *        Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     *        <code>false</code>) monitoring.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     *        >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        setInstanceMonitoring(instanceMonitoring);
        return this;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot price.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances
     *        are launched when the price you specify exceeds the current Spot price.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     *        Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot price.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances
     *         are launched when the price you specify exceeds the current Spot price.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching
     *         Spot Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot price.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances
     *        are launched when the price you specify exceeds the current Spot price.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     *        Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance.
     * The instance profile contains the IAM role.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM
     * Role for Applications That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the
     *        instance. The instance profile contains the IAM role.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM Role for Applications
     *        That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance.
     * The instance profile contains the IAM role.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM
     * Role for Applications That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the
     *         instance. The instance profile contains the IAM role.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM Role for Applications
     *         That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance.
     * The instance profile contains the IAM role.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM
     * Role for Applications That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the
     *        instance. The instance profile contains the IAM role.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM Role for Applications
     *        That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withIamInstanceProfile(String iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * 
     * @param createdTime
     *        The creation date and time for the launch configuration.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * 
     * @return The creation date and time for the launch configuration.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * 
     * @param createdTime
     *        The creation date and time for the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ebsOptimized
     *        Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *        <code>false</code>).</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *         <code>false</code>).</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *         Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ebsOptimized
     *        Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *        <code>false</code>).</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *         <code>false</code>).</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *         Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the
     *        group's instances.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *        Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the
     *         group's instances.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *         Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the
     *        group's instances.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *        Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the group's
     * instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return For Auto Scaling groups that are running in a VPC, specifies whether to assign a public IP address to the
     *         group's instances.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *         Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     * <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     *        <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a
     *        VPC.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance
     *        Placement Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     * <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     *         <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a
     *         VPC.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance
     *         Placement Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getPlacementTenancy() {
        return this.placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     * <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance, either <code>default</code> or <code>dedicated</code>. An instance with
     *        <code>dedicated</code> tenancy runs on isolated, single-tenant hardware and can only be launched into a
     *        VPC.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance
     *        Placement Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfiguration withPlacementTenancy(String placementTenancy) {
        setPlacementTenancy(placementTenancy);
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
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: ").append(getLaunchConfigurationName()).append(",");
        if (getLaunchConfigurationARN() != null)
            sb.append("LaunchConfigurationARN: ").append(getLaunchConfigurationARN()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getClassicLinkVPCId() != null)
            sb.append("ClassicLinkVPCId: ").append(getClassicLinkVPCId()).append(",");
        if (getClassicLinkVPCSecurityGroups() != null)
            sb.append("ClassicLinkVPCSecurityGroups: ").append(getClassicLinkVPCSecurityGroups()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getInstanceMonitoring() != null)
            sb.append("InstanceMonitoring: ").append(getInstanceMonitoring()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress()).append(",");
        if (getPlacementTenancy() != null)
            sb.append("PlacementTenancy: ").append(getPlacementTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchConfiguration == false)
            return false;
        LaunchConfiguration other = (LaunchConfiguration) obj;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getLaunchConfigurationARN() == null ^ this.getLaunchConfigurationARN() == null)
            return false;
        if (other.getLaunchConfigurationARN() != null && other.getLaunchConfigurationARN().equals(this.getLaunchConfigurationARN()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getClassicLinkVPCId() == null ^ this.getClassicLinkVPCId() == null)
            return false;
        if (other.getClassicLinkVPCId() != null && other.getClassicLinkVPCId().equals(this.getClassicLinkVPCId()) == false)
            return false;
        if (other.getClassicLinkVPCSecurityGroups() == null ^ this.getClassicLinkVPCSecurityGroups() == null)
            return false;
        if (other.getClassicLinkVPCSecurityGroups() != null && other.getClassicLinkVPCSecurityGroups().equals(this.getClassicLinkVPCSecurityGroups()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getInstanceMonitoring() == null ^ this.getInstanceMonitoring() == null)
            return false;
        if (other.getInstanceMonitoring() != null && other.getInstanceMonitoring().equals(this.getInstanceMonitoring()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getPlacementTenancy() == null ^ this.getPlacementTenancy() == null)
            return false;
        if (other.getPlacementTenancy() != null && other.getPlacementTenancy().equals(this.getPlacementTenancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationARN() == null) ? 0 : getLaunchConfigurationARN().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getClassicLinkVPCId() == null) ? 0 : getClassicLinkVPCId().hashCode());
        hashCode = prime * hashCode + ((getClassicLinkVPCSecurityGroups() == null) ? 0 : getClassicLinkVPCSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getInstanceMonitoring() == null) ? 0 : getInstanceMonitoring().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPlacementTenancy() == null) ? 0 : getPlacementTenancy().hashCode());
        return hashCode;
    }

    @Override
    public LaunchConfiguration clone() {
        try {
            return (LaunchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
