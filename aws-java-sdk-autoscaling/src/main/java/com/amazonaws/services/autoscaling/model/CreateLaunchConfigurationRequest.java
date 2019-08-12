/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateLaunchConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the launch configuration. This name must be unique per Region per account.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the key pair. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * [EC2-VPC] Specify the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2 Security
     * Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This parameter can only be used if you are launching EC2-Classic instances.
     * </p>
     */
    private String classicLinkVPCId;
    /**
     * <p>
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> classicLinkVPCSecurityGroups;
    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes
     * from the instance, except for the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override any other instance attributes, specify
     * them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a Launch
     * Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     * <code>InstanceType</code>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Specifies the instance type of the EC2 instance.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
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
     * The ID of the RAM disk to select.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance. You can specify virtual devices and
     * EBS volumes. For more information, see <a
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
     * The default value is <code>true</code> (enabled).
     * </p>
     * <important>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </important>
     */
    private InstanceMonitoring instanceMonitoring;
    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot market price. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has been met,
     * regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     * </p>
     * <note>
     * <p>
     * When you change your Spot price by creating a new launch configuration, running instances will continue to run as
     * long as the Spot price for those running instances is higher than the current Spot market price.
     * </p>
     * </note>
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
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional
     * fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public
     * IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto Scaling group
     * receives a unique public IP address. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code> when you
     * create your group.
     * </p>
     * <note>
     * <p>
     * If the instance is launched into a default subnet, the default is to assign a public IP address, unless you
     * disabled the option to assign a public IP address on the subnet. If the instance is launched into a nondefault
     * subnet, the default is not to assign a public IP address, unless you enabled the option to assign a public IP
     * address on the subnet.
     * </p>
     * </note>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set
     * to <code>default</code>), you must set the value of this parameter to <code>dedicated</code>.
     * </p>
     * <p>
     * If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     * <code>VPCZoneIdentifier</code> when you create your group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     */
    private String placementTenancy;

    /**
     * <p>
     * The name of the launch configuration. This name must be unique per Region per account.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. This name must be unique per Region per account.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. This name must be unique per Region per account.
     * </p>
     * 
     * @return The name of the launch configuration. This name must be unique per Region per account.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. This name must be unique per Region per account.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. This name must be unique per Region per account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) that was assigned during registration. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding an AMI</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        If you do not specify <code>InstanceId</code>, you must specify <code>ImageId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the key pair. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The name of the key pair. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * </p>
     * <p>
     * [EC2-VPC] Specify the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2 Security
     * Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *         <p>
     *         [EC2-VPC] Specify the security group IDs. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *         Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         [EC2-Classic] Specify either the security group names or the security group IDs. For more information,
     *         see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2
     *         Security Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
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
     * [EC2-VPC] Specify the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2 Security
     * Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param securityGroups
     *        A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *        <p>
     *        [EC2-VPC] Specify the security group IDs. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *        Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2
     *        Security Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
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
     * [EC2-VPC] Specify the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2 Security
     * Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
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
     *        [EC2-VPC] Specify the security group IDs. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *        Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2
     *        Security Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withSecurityGroups(String... securityGroups) {
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
     * [EC2-VPC] Specify the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2 Security
     * Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param securityGroups
     *        A list that contains the security groups to assign to the instances in the Auto Scaling group.</p>
     *        <p>
     *        [EC2-VPC] Specify the security group IDs. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for
     *        Your VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        [EC2-Classic] Specify either the security group names or the security group IDs. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon EC2
     *        Security Groups</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This parameter can only be used if you are launching EC2-Classic instances.
     * </p>
     * 
     * @param classicLinkVPCId
     *        The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        This parameter can only be used if you are launching EC2-Classic instances.
     */

    public void setClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This parameter can only be used if you are launching EC2-Classic instances.
     * </p>
     * 
     * @return The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *         <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *         EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *         <p>
     *         This parameter can only be used if you are launching EC2-Classic instances.
     */

    public String getClassicLinkVPCId() {
        return this.classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * This parameter can only be used if you are launching EC2-Classic instances.
     * </p>
     * 
     * @param classicLinkVPCId
     *        The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        This parameter can only be used if you are launching EC2-Classic instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withClassicLinkVPCId(String classicLinkVPCId) {
        setClassicLinkVPCId(classicLinkVPCId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * </p>
     * 
     * @return The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information,
     *         see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *         EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *         <p>
     *         If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     */

    public java.util.List<String> getClassicLinkVPCSecurityGroups() {
        if (classicLinkVPCSecurityGroups == null) {
            classicLinkVPCSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return classicLinkVPCSecurityGroups;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
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
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassicLinkVPCSecurityGroups(java.util.Collection)} or
     * {@link #withClassicLinkVPCSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withClassicLinkVPCSecurityGroups(String... classicLinkVPCSecurityGroups) {
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
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i> and <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking EC2-Classic
     * Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the specified ClassicLink-enabled VPC. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i> and <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-ClassicLink">Linking
     *        EC2-Classic Instances to a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If you specify the <code>ClassicLinkVPCId</code> parameter, you must specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withClassicLinkVPCSecurityGroups(java.util.Collection<String> classicLinkVPCSecurityGroups) {
        setClassicLinkVPCSecurityGroups(classicLinkVPCSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the launched EC2 instances. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata
     *        and User Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The Base64-encoded user data to make available to the launched EC2 instances. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     *         Metadata and User Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the launched EC2 instances. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata and User
     * Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the launched EC2 instances. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance Metadata
     *        and User Data</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes
     * from the instance, except for the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override any other instance attributes, specify
     * them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a Launch
     * Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to use to create the launch configuration. The new launch configuration derives
     *        attributes from the instance, except for the block device mapping.</p>
     *        <p>
     *        To create a launch configuration with a block device mapping or override any other instance attributes,
     *        specify them as part of the same request.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a
     *        Launch Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     *        <code>InstanceType</code>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes
     * from the instance, except for the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override any other instance attributes, specify
     * them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a Launch
     * Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     * <code>InstanceType</code>.
     * </p>
     * 
     * @return The ID of the instance to use to create the launch configuration. The new launch configuration derives
     *         attributes from the instance, except for the block device mapping.</p>
     *         <p>
     *         To create a launch configuration with a block device mapping or override any other instance attributes,
     *         specify them as part of the same request.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a
     *         Launch Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     *         <p>
     *         If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     *         <code>InstanceType</code>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes
     * from the instance, except for the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override any other instance attributes, specify
     * them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a Launch
     * Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to use to create the launch configuration. The new launch configuration derives
     *        attributes from the instance, except for the block device mapping.</p>
     *        <p>
     *        To create a launch configuration with a block device mapping or override any other instance attributes,
     *        specify them as part of the same request.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-lc-with-instanceID.html">Create a
     *        Launch Configuration Using an EC2 Instance</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        If you do not specify <code>InstanceId</code>, you must specify both <code>ImageId</code> and
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Specifies the instance type of the EC2 instance.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the EC2 instance.</p>
     *        <p>
     *        For information about available instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        >Available Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     *        </p>
     *        <p>
     *        If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type of the EC2 instance.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
     * </p>
     * 
     * @return Specifies the instance type of the EC2 instance.</p>
     *         <p>
     *         For information about available instance types, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *         >Available Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     *         </p>
     *         <p>
     *         If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Specifies the instance type of the EC2 instance.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     * </p>
     * <p>
     * If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the EC2 instance.</p>
     *        <p>
     *        For information about available instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        >Available Instance Types</a> in the <i>Amazon EC2 User Guide for Linux Instances.</i>
     *        </p>
     *        <p>
     *        If you do not specify <code>InstanceId</code>, you must specify <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withInstanceType(String instanceType) {
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

    public CreateLaunchConfigurationRequest withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk to select.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk to select.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk to select.
     * </p>
     * 
     * @return The ID of the RAM disk to select.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk to select.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the instance. You can specify virtual devices and
     * EBS volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return A block device mapping, which specifies the block devices for the instance. You can specify virtual
     *         devices and EBS volumes. For more information, see <a
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
     * A block device mapping, which specifies the block devices for the instance. You can specify virtual devices and
     * EBS volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        A block device mapping, which specifies the block devices for the instance. You can specify virtual
     *        devices and EBS volumes. For more information, see <a
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
     * A block device mapping, which specifies the block devices for the instance. You can specify virtual devices and
     * EBS volumes. For more information, see <a
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
     *        A block device mapping, which specifies the block devices for the instance. You can specify virtual
     *        devices and EBS volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * A block device mapping, which specifies the block devices for the instance. You can specify virtual devices and
     * EBS volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        A block device mapping, which specifies the block devices for the instance. You can specify virtual
     *        devices and EBS volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     * <code>false</code>) monitoring.
     * </p>
     * <p>
     * The default value is <code>true</code> (enabled).
     * </p>
     * <important>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </important>
     * 
     * @param instanceMonitoring
     *        Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     *        <code>false</code>) monitoring. </p>
     *        <p>
     *        The default value is <code>true</code> (enabled).
     *        </p>
     *        <important>
     *        <p>
     *        When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is
     *        charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     *        >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
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
     * The default value is <code>true</code> (enabled).
     * </p>
     * <important>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </important>
     * 
     * @return Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     *         <code>false</code>) monitoring. </p>
     *         <p>
     *         The default value is <code>true</code> (enabled).
     *         </p>
     *         <important>
     *         <p>
     *         When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is
     *         charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     *         >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
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
     * The default value is <code>true</code> (enabled).
     * </p>
     * <important>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     * >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * </important>
     * 
     * @param instanceMonitoring
     *        Controls whether instances in this group are launched with detailed (<code>true</code>) or basic (
     *        <code>false</code>) monitoring. </p>
     *        <p>
     *        The default value is <code>true</code> (enabled).
     *        </p>
     *        <important>
     *        <p>
     *        When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your account is
     *        charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5 minutes. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics"
     *        >Configure Monitoring for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        setInstanceMonitoring(instanceMonitoring);
        return this;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot market price. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has been met,
     * regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     * </p>
     * <note>
     * <p>
     * When you change your Spot price by creating a new launch configuration, running instances will continue to run as
     * long as the Spot price for those running instances is higher than the current Spot market price.
     * </p>
     * </note>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances
     *        are launched when the price you specify exceeds the current Spot market price. For more information, see
     *        <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching
     *        Spot Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has
     *        been met, regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     *        </p>
     *        <note>
     *        <p>
     *        When you change your Spot price by creating a new launch configuration, running instances will continue to
     *        run as long as the Spot price for those running instances is higher than the current Spot market price.
     *        </p>
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot market price. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has been met,
     * regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     * </p>
     * <note>
     * <p>
     * When you change your Spot price by creating a new launch configuration, running instances will continue to run as
     * long as the Spot price for those running instances is higher than the current Spot market price.
     * </p>
     * </note>
     * 
     * @return The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances
     *         are launched when the price you specify exceeds the current Spot market price. For more information, see
     *         <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching
     *         Spot Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *         <p>
     *         If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has
     *         been met, regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     *         </p>
     *         <note>
     *         <p>
     *         When you change your Spot price by creating a new launch configuration, running instances will continue
     *         to run as long as the Spot price for those running instances is higher than the current Spot market
     *         price.
     *         </p>
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are
     * launched when the price you specify exceeds the current Spot market price. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching Spot
     * Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has been met,
     * regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     * </p>
     * <note>
     * <p>
     * When you change your Spot price by creating a new launch configuration, running instances will continue to run as
     * long as the Spot price for those running instances is higher than the current Spot market price.
     * </p>
     * </note>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances
     *        are launched when the price you specify exceeds the current Spot market price. For more information, see
     *        <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-spot-instances.html">Launching
     *        Spot Instances in Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If a Spot price is set, then the Auto Scaling group will only launch instances when the Spot price has
     *        been met, regardless of the setting in the Auto Scaling group's <code>DesiredCapacity</code>.
     *        </p>
     *        <note>
     *        <p>
     *        When you change your Spot price by creating a new launch configuration, running instances will continue to
     *        run as long as the Spot price for those running instances is higher than the current Spot market price.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withSpotPrice(String spotPrice) {
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
     *        instance. The instance profile contains the IAM role. </p>
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
     *         instance. The instance profile contains the IAM role. </p>
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
     *        instance. The instance profile contains the IAM role. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html">IAM Role for Applications
     *        That Run on Amazon EC2 Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withIamInstanceProfile(String iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional
     * fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param ebsOptimized
     *        Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *        <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized
     *        configuration stack to provide optimal I/O performance. This optimization is not available with all
     *        instance types. Additional fees are incurred when you enable EBS optimization for an instance type that is
     *        not EBS-optimized by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        The default value is <code>false</code>.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional
     * fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *         <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal I/O performance. This optimization is not available with all
     *         instance types. Additional fees are incurred when you enable EBS optimization for an instance type that
     *         is not EBS-optimized by default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *         Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional
     * fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param ebsOptimized
     *        Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *        <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized
     *        configuration stack to provide optimal I/O performance. This optimization is not available with all
     *        instance types. Additional fees are incurred when you enable EBS optimization for an instance type that is
     *        not EBS-optimized by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     * <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional
     * fees are incurred when you enable EBS optimization for an instance type that is not EBS-optimized by default. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Specifies whether the launch configuration is optimized for EBS I/O (<code>true</code>) or not (
     *         <code>false</code>). The optimization provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal I/O performance. This optimization is not available with all
     *         instance types. Additional fees are incurred when you enable EBS optimization for an instance type that
     *         is not EBS-optimized by default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *         Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public
     * IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto Scaling group
     * receives a unique public IP address. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code> when you
     * create your group.
     * </p>
     * <note>
     * <p>
     * If the instance is launched into a default subnet, the default is to assign a public IP address, unless you
     * disabled the option to assign a public IP address on the subnet. If the instance is launched into a nondefault
     * subnet, the default is not to assign a public IP address, unless you enabled the option to assign a public IP
     * address on the subnet.
     * </p>
     * </note>
     * 
     * @param associatePublicIpAddress
     *        For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a
     *        public IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto
     *        Scaling group receives a unique public IP address. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *        Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code>
     *        when you create your group.
     *        </p>
     *        <note>
     *        <p>
     *        If the instance is launched into a default subnet, the default is to assign a public IP address, unless
     *        you disabled the option to assign a public IP address on the subnet. If the instance is launched into a
     *        nondefault subnet, the default is not to assign a public IP address, unless you enabled the option to
     *        assign a public IP address on the subnet.
     *        </p>
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public
     * IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto Scaling group
     * receives a unique public IP address. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code> when you
     * create your group.
     * </p>
     * <note>
     * <p>
     * If the instance is launched into a default subnet, the default is to assign a public IP address, unless you
     * disabled the option to assign a public IP address on the subnet. If the instance is launched into a nondefault
     * subnet, the default is not to assign a public IP address, unless you enabled the option to assign a public IP
     * address on the subnet.
     * </p>
     * </note>
     * 
     * @return For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a
     *         public IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto
     *         Scaling group receives a unique public IP address. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *         Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *         <p>
     *         If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code>
     *         when you create your group.
     *         </p>
     *         <note>
     *         <p>
     *         If the instance is launched into a default subnet, the default is to assign a public IP address, unless
     *         you disabled the option to assign a public IP address on the subnet. If the instance is launched into a
     *         nondefault subnet, the default is not to assign a public IP address, unless you enabled the option to
     *         assign a public IP address on the subnet.
     *         </p>
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public
     * IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto Scaling group
     * receives a unique public IP address. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code> when you
     * create your group.
     * </p>
     * <note>
     * <p>
     * If the instance is launched into a default subnet, the default is to assign a public IP address, unless you
     * disabled the option to assign a public IP address on the subnet. If the instance is launched into a nondefault
     * subnet, the default is not to assign a public IP address, unless you enabled the option to assign a public IP
     * address on the subnet.
     * </p>
     * </note>
     * 
     * @param associatePublicIpAddress
     *        For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a
     *        public IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto
     *        Scaling group receives a unique public IP address. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *        Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *        <p>
     *        If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code>
     *        when you create your group.
     *        </p>
     *        <note>
     *        <p>
     *        If the instance is launched into a default subnet, the default is to assign a public IP address, unless
     *        you disabled the option to assign a public IP address on the subnet. If the instance is launched into a
     *        nondefault subnet, the default is not to assign a public IP address, unless you enabled the option to
     *        assign a public IP address on the subnet.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public
     * IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto Scaling group
     * receives a unique public IP address. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling Instances in
     * a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code> when you
     * create your group.
     * </p>
     * <note>
     * <p>
     * If the instance is launched into a default subnet, the default is to assign a public IP address, unless you
     * disabled the option to assign a public IP address on the subnet. If the instance is launched into a nondefault
     * subnet, the default is not to assign a public IP address, unless you enabled the option to assign a public IP
     * address on the subnet.
     * </p>
     * </note>
     * 
     * @return For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a
     *         public IP address to the group's instances. If you specify <code>true</code>, each instance in the Auto
     *         Scaling group receives a unique public IP address. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html">Launching Auto Scaling
     *         Instances in a VPC</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.</p>
     *         <p>
     *         If you specify this parameter, you must specify at least one subnet for <code>VPCZoneIdentifier</code>
     *         when you create your group.
     *         </p>
     *         <note>
     *         <p>
     *         If the instance is launched into a default subnet, the default is to assign a public IP address, unless
     *         you disabled the option to assign a public IP address on the subnet. If the instance is launched into a
     *         nondefault subnet, the default is not to assign a public IP address, unless you enabled the option to
     *         assign a public IP address on the subnet.
     *         </p>
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set
     * to <code>default</code>), you must set the value of this parameter to <code>dedicated</code>.
     * </p>
     * <p>
     * If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     * <code>VPCZoneIdentifier</code> when you create your group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated,
     *        single-tenant hardware and can only be launched into a VPC.</p>
     *        <p>
     *        To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy
     *        attribute set to <code>default</code>), you must set the value of this parameter to <code>dedicated</code>
     *        .
     *        </p>
     *        <p>
     *        If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     *        <code>VPCZoneIdentifier</code> when you create your group.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance
     *        Placement Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>default</code> | <code>dedicated</code>
     */

    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set
     * to <code>default</code>), you must set the value of this parameter to <code>dedicated</code>.
     * </p>
     * <p>
     * If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     * <code>VPCZoneIdentifier</code> when you create your group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     * 
     * @return The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated,
     *         single-tenant hardware and can only be launched into a VPC.</p>
     *         <p>
     *         To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy
     *         attribute set to <code>default</code>), you must set the value of this parameter to
     *         <code>dedicated</code>.
     *         </p>
     *         <p>
     *         If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     *         <code>VPCZoneIdentifier</code> when you create your group.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance
     *         Placement Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     *         <p>
     *         Valid values: <code>default</code> | <code>dedicated</code>
     */

    public String getPlacementTenancy() {
        return this.placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated, single-tenant
     * hardware and can only be launched into a VPC.
     * </p>
     * <p>
     * To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set
     * to <code>default</code>), you must set the value of this parameter to <code>dedicated</code>.
     * </p>
     * <p>
     * If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     * <code>VPCZoneIdentifier</code> when you create your group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance Placement
     * Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance. An instance with <code>dedicated</code> tenancy runs on isolated,
     *        single-tenant hardware and can only be launched into a VPC.</p>
     *        <p>
     *        To launch dedicated instances into a shared tenancy VPC (a VPC with the instance placement tenancy
     *        attribute set to <code>default</code>), you must set the value of this parameter to <code>dedicated</code>
     *        .
     *        </p>
     *        <p>
     *        If you specify <code>PlacementTenancy</code>, you must specify at least one subnet for
     *        <code>VPCZoneIdentifier</code> when you create your group.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html#as-vpc-tenancy">Instance
     *        Placement Tenancy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>default</code> | <code>dedicated</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationRequest withPlacementTenancy(String placementTenancy) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
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

        if (obj instanceof CreateLaunchConfigurationRequest == false)
            return false;
        CreateLaunchConfigurationRequest other = (CreateLaunchConfigurationRequest) obj;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getClassicLinkVPCId() == null) ? 0 : getClassicLinkVPCId().hashCode());
        hashCode = prime * hashCode + ((getClassicLinkVPCSecurityGroups() == null) ? 0 : getClassicLinkVPCSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getInstanceMonitoring() == null) ? 0 : getInstanceMonitoring().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPlacementTenancy() == null) ? 0 : getPlacementTenancy().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchConfigurationRequest clone() {
        return (CreateLaunchConfigurationRequest) super.clone();
    }

}
