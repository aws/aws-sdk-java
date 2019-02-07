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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The information to include in the launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestLaunchTemplateData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestLaunchTemplateData implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String kernelId;
    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile;
    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings;
    /**
     * <p>
     * One or more network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces;
    /**
     * <p>
     * The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     */
    private String keyName;
    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private LaunchTemplatesMonitoringRequest monitoring;
    /**
     * <p>
     * The placement for the instance.
     * </p>
     */
    private LaunchTemplatePlacementRequest placement;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String ramDiskId;
    /**
     * <p>
     * If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API. To
     * change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see <a>CreateTags</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecificationRequest> tagSpecifications;
    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification> elasticGpuSpecifications;
    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators;
    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead. You cannot specify both a security group ID and security name in the same request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     */
    private LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions;
    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     * </p>
     */
    private CreditSpecificationRequest creditSpecification;
    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private LaunchTemplateCpuOptionsRequest cpuOptions;
    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     * Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity Reservation
     * that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     */
    private LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification;
    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites">hibernation
     * prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private LaunchTemplateHibernationOptionsRequest hibernationOptions;
    /**
     * <p>
     * The license configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications;

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param kernelId
     *        The ID of the kernel.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided
     *        Kernels</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @return The ID of the kernel.</p> <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided
     *         Kernels</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param kernelId
     *        The ID of the kernel.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided
     *        Kernels</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *        throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using an EBS-optimized instance.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *         performance. This optimization isn't available with all instance types. Additional usage charges apply
     *         when using an EBS-optimized instance.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *        throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using an EBS-optimized instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *         performance. This optimization isn't available with all instance types. Additional usage charges apply
     *         when using an EBS-optimized instance.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile.
     */

    public void setIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @return The IAM instance profile.
     */

    public LaunchTemplateIamInstanceProfileSpecificationRequest getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * 
     * @return The block device mapping.</p> <important>
     *         <p>
     *         Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *         error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *         snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *         status cannot be changed using this action.
     *         </p>
     */

    public java.util.List<LaunchTemplateBlockDeviceMappingRequest> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMappingRequest>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * 
     * @param blockDeviceMappings
     *        The block device mapping.</p> <important>
     *        <p>
     *        Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *        error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *        snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *        status cannot be changed using this action.
     *        </p>
     */

    public void setBlockDeviceMappings(java.util.Collection<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMappingRequest>(blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping.</p> <important>
     *        <p>
     *        Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *        error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *        snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *        status cannot be changed using this action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withBlockDeviceMappings(LaunchTemplateBlockDeviceMappingRequest... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMappingRequest>(blockDeviceMappings.length));
        }
        for (LaunchTemplateBlockDeviceMappingRequest ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * 
     * @param blockDeviceMappings
     *        The block device mapping.</p> <important>
     *        <p>
     *        Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *        error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *        snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *        status cannot be changed using this action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withBlockDeviceMappings(java.util.Collection<LaunchTemplateBlockDeviceMappingRequest> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @return One or more network interfaces.
     */

    public java.util.List<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     */

    public void setNetworkInterfaces(java.util.Collection<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>(networkInterfaces);
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withNetworkInterfaces(LaunchTemplateInstanceNetworkInterfaceSpecificationRequest... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>(
                    networkInterfaces.length));
        }
        for (LaunchTemplateInstanceNetworkInterfaceSpecificationRequest ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withNetworkInterfaces(java.util.Collection<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     * </p>
     * 
     * @return The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by using <a>DescribeImages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RequestLaunchTemplateData withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RequestLaunchTemplateData withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     * 
     * @param keyName
     *        The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or
     *        <a>ImportKeyPair</a>.</p> <important>
     *        <p>
     *        If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is
     *        configured to allow users another way to log in.
     *        </p>
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     * 
     * @return The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or
     *         <a>ImportKeyPair</a>.</p> <important>
     *         <p>
     *         If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is
     *         configured to allow users another way to log in.
     *         </p>
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     * 
     * @param keyName
     *        The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or
     *        <a>ImportKeyPair</a>.</p> <important>
     *        <p>
     *        If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is
     *        configured to allow users another way to log in.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring for the instance.
     */

    public void setMonitoring(LaunchTemplatesMonitoringRequest monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public LaunchTemplatesMonitoringRequest getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withMonitoring(LaunchTemplatesMonitoringRequest monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @param placement
     *        The placement for the instance.
     */

    public void setPlacement(LaunchTemplatePlacementRequest placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @return The placement for the instance.
     */

    public LaunchTemplatePlacementRequest getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @param placement
     *        The placement for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withPlacement(LaunchTemplatePlacementRequest placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param ramDiskId
     *        The ID of the RAM disk.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided
     *        Kernels</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     */

    public void setRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @return The ID of the RAM disk.</p> <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided
     *         Kernels</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */

    public String getRamDiskId() {
        return this.ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided Kernels</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param ramDiskId
     *        The ID of the RAM disk.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">User Provided
     *        Kernels</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withRamDiskId(String ramDiskId) {
        setRamDiskId(ramDiskId);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API. To
     * change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * 
     * @param disableApiTermination
     *        If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API.
     *        To change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API. To
     * change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * 
     * @return If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API.
     *         To change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API. To
     * change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * 
     * @param disableApiTermination
     *        If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API.
     *        To change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withDisableApiTermination(Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API. To
     * change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * 
     * @return If set to <code>true</code>, you can't terminate the instance using the Amazon EC2 console, CLI, or API.
     *         To change this attribute to <code>false</code> after launch, use <a>ModifyInstanceAttribute</a>.
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @return Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *         operating system command for system shutdown).</p>
     *         <p>
     *         Default: <code>stop</code>
     * @see ShutdownBehavior
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public RequestLaunchTemplateData withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public RequestLaunchTemplateData withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *        Instance at Launch</a> (Linux) and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *        >Adding User Data</a> (Windows).
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     * 
     * @return The Base64-encoded user data to make available to the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *         Instance at Launch</a> (Linux) and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *         >Adding User Data</a> (Windows).
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows).
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *        Instance at Launch</a> (Linux) and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *        >Adding User Data</a> (Windows).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see <a>CreateTags</a>.
     * </p>
     * 
     * @return The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *         specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *         after it has been created, see <a>CreateTags</a>.
     */

    public java.util.List<LaunchTemplateTagSpecificationRequest> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecificationRequest>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see <a>CreateTags</a>.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *        specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *        after it has been created, see <a>CreateTags</a>.
     */

    public void setTagSpecifications(java.util.Collection<LaunchTemplateTagSpecificationRequest> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecificationRequest>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see <a>CreateTags</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *        specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *        after it has been created, see <a>CreateTags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withTagSpecifications(LaunchTemplateTagSpecificationRequest... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecificationRequest>(tagSpecifications.length));
        }
        for (LaunchTemplateTagSpecificationRequest ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see <a>CreateTags</a>.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *        specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *        after it has been created, see <a>CreateTags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withTagSpecifications(java.util.Collection<LaunchTemplateTagSpecificationRequest> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * 
     * @return An elastic GPU to associate with the instance.
     */

    public java.util.List<ElasticGpuSpecification> getElasticGpuSpecifications() {
        if (elasticGpuSpecifications == null) {
            elasticGpuSpecifications = new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>();
        }
        return elasticGpuSpecifications;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * 
     * @param elasticGpuSpecifications
     *        An elastic GPU to associate with the instance.
     */

    public void setElasticGpuSpecifications(java.util.Collection<ElasticGpuSpecification> elasticGpuSpecifications) {
        if (elasticGpuSpecifications == null) {
            this.elasticGpuSpecifications = null;
            return;
        }

        this.elasticGpuSpecifications = new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>(elasticGpuSpecifications);
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticGpuSpecifications(java.util.Collection)} or
     * {@link #withElasticGpuSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticGpuSpecifications
     *        An elastic GPU to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withElasticGpuSpecifications(ElasticGpuSpecification... elasticGpuSpecifications) {
        if (this.elasticGpuSpecifications == null) {
            setElasticGpuSpecifications(new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>(elasticGpuSpecifications.length));
        }
        for (ElasticGpuSpecification ele : elasticGpuSpecifications) {
            this.elasticGpuSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * 
     * @param elasticGpuSpecifications
     *        An elastic GPU to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withElasticGpuSpecifications(java.util.Collection<ElasticGpuSpecification> elasticGpuSpecifications) {
        setElasticGpuSpecifications(elasticGpuSpecifications);
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * 
     * @return The elastic inference accelerator for the instance.
     */

    public java.util.List<LaunchTemplateElasticInferenceAccelerator> getElasticInferenceAccelerators() {
        if (elasticInferenceAccelerators == null) {
            elasticInferenceAccelerators = new com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAccelerator>();
        }
        return elasticInferenceAccelerators;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        The elastic inference accelerator for the instance.
     */

    public void setElasticInferenceAccelerators(java.util.Collection<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators) {
        if (elasticInferenceAccelerators == null) {
            this.elasticInferenceAccelerators = null;
            return;
        }

        this.elasticInferenceAccelerators = new com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAccelerator>(elasticInferenceAccelerators);
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticInferenceAccelerators(java.util.Collection)} or
     * {@link #withElasticInferenceAccelerators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        The elastic inference accelerator for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withElasticInferenceAccelerators(LaunchTemplateElasticInferenceAccelerator... elasticInferenceAccelerators) {
        if (this.elasticInferenceAccelerators == null) {
            setElasticInferenceAccelerators(new com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAccelerator>(
                    elasticInferenceAccelerators.length));
        }
        for (LaunchTemplateElasticInferenceAccelerator ele : elasticInferenceAccelerators) {
            this.elasticInferenceAccelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        The elastic inference accelerator for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withElasticInferenceAccelerators(
            java.util.Collection<LaunchTemplateElasticInferenceAccelerator> elasticInferenceAccelerators) {
        setElasticInferenceAccelerators(elasticInferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @return One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You
     *         cannot specify both a security group ID and security name in the same request.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You
     *        cannot specify both a security group ID and security name in the same request.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You
     *        cannot specify both a security group ID and security name in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>. You
     *        cannot specify both a security group ID and security name in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead. You cannot specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *         group IDs instead. You cannot specify both a security group ID and security name in the same request.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead. You cannot specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *        group IDs instead. You cannot specify both a security group ID and security name in the same request.
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
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead. You cannot specify both a security group ID and security name in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *        group IDs instead. You cannot specify both a security group ID and security name in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withSecurityGroups(String... securityGroups) {
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
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead. You cannot specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *        group IDs instead. You cannot specify both a security group ID and security name in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The market (purchasing) option for the instances.
     */

    public void setInstanceMarketOptions(LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * 
     * @return The market (purchasing) option for the instances.
     */

    public LaunchTemplateInstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The market (purchasing) option for the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withInstanceMarketOptions(LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions) {
        setInstanceMarketOptions(instanceMarketOptions);
        return this;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     * </p>
     * 
     * @param creditSpecification
     *        The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     */

    public void setCreditSpecification(CreditSpecificationRequest creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     * </p>
     * 
     * @return The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     */

    public CreditSpecificationRequest getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     * </p>
     * 
     * @param creditSpecification
     *        The credit option for CPU usage of the instance. Valid for T2 or T3 instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withCreditSpecification(CreditSpecificationRequest creditSpecification) {
        setCreditSpecification(creditSpecification);
        return this;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cpuOptions
     *        The CPU options for the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU
     *        Options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setCpuOptions(LaunchTemplateCpuOptionsRequest cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The CPU options for the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU
     *         Options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public LaunchTemplateCpuOptionsRequest getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cpuOptions
     *        The CPU options for the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU
     *        Options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withCpuOptions(LaunchTemplateCpuOptionsRequest cpuOptions) {
        setCpuOptions(cpuOptions);
        return this;
    }

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     * Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity Reservation
     * that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     * 
     * @param capacityReservationSpecification
     *        The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     *        Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     *        Reservation that has matching attributes (instance type, platform, Availability Zone).
     */

    public void setCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     * Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity Reservation
     * that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     * 
     * @return The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     *         Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     *         Reservation that has matching attributes (instance type, platform, Availability Zone).
     */

    public LaunchTemplateCapacityReservationSpecificationRequest getCapacityReservationSpecification() {
        return this.capacityReservationSpecification;
    }

    /**
     * <p>
     * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     * Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity Reservation
     * that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     * 
     * @param capacityReservationSpecification
     *        The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity
     *        Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     *        Reservation that has matching attributes (instance type, platform, Availability Zone).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification) {
        setCapacityReservationSpecification(capacityReservationSpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites">hibernation
     * prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hibernationOptions
     *        Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance
     *        meets the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     *        >hibernation prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate
     *        Your Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setHibernationOptions(LaunchTemplateHibernationOptionsRequest hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites">hibernation
     * prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance
     *         meets the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     *         >hibernation prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more
     *         information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate
     *         Your Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public LaunchTemplateHibernationOptionsRequest getHibernationOptions() {
        return this.hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites">hibernation
     * prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hibernationOptions
     *        Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance
     *        meets the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     *        >hibernation prerequisites</a>. Hibernation is currently supported only for Amazon Linux. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate
     *        Your Instance</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withHibernationOptions(LaunchTemplateHibernationOptionsRequest hibernationOptions) {
        setHibernationOptions(hibernationOptions);
        return this;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * 
     * @return The license configurations.
     */

    public java.util.List<LaunchTemplateLicenseConfigurationRequest> getLicenseSpecifications() {
        if (licenseSpecifications == null) {
            licenseSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfigurationRequest>();
        }
        return licenseSpecifications;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * 
     * @param licenseSpecifications
     *        The license configurations.
     */

    public void setLicenseSpecifications(java.util.Collection<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfigurationRequest>(licenseSpecifications);
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseSpecifications(java.util.Collection)} or
     * {@link #withLicenseSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseSpecifications
     *        The license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withLicenseSpecifications(LaunchTemplateLicenseConfigurationRequest... licenseSpecifications) {
        if (this.licenseSpecifications == null) {
            setLicenseSpecifications(new com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfigurationRequest>(licenseSpecifications.length));
        }
        for (LaunchTemplateLicenseConfigurationRequest ele : licenseSpecifications) {
            this.licenseSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * 
     * @param licenseSpecifications
     *        The license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestLaunchTemplateData withLicenseSpecifications(java.util.Collection<LaunchTemplateLicenseConfigurationRequest> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
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
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getRamDiskId() != null)
            sb.append("RamDiskId: ").append(getRamDiskId()).append(",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: ").append(getDisableApiTermination()).append(",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: ").append(getInstanceInitiatedShutdownBehavior()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getElasticGpuSpecifications() != null)
            sb.append("ElasticGpuSpecifications: ").append(getElasticGpuSpecifications()).append(",");
        if (getElasticInferenceAccelerators() != null)
            sb.append("ElasticInferenceAccelerators: ").append(getElasticInferenceAccelerators()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getInstanceMarketOptions() != null)
            sb.append("InstanceMarketOptions: ").append(getInstanceMarketOptions()).append(",");
        if (getCreditSpecification() != null)
            sb.append("CreditSpecification: ").append(getCreditSpecification()).append(",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: ").append(getCpuOptions()).append(",");
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: ").append(getCapacityReservationSpecification()).append(",");
        if (getHibernationOptions() != null)
            sb.append("HibernationOptions: ").append(getHibernationOptions()).append(",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: ").append(getLicenseSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestLaunchTemplateData == false)
            return false;
        RequestLaunchTemplateData other = (RequestLaunchTemplateData) obj;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getRamDiskId() == null ^ this.getRamDiskId() == null)
            return false;
        if (other.getRamDiskId() != null && other.getRamDiskId().equals(this.getRamDiskId()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getElasticGpuSpecifications() == null ^ this.getElasticGpuSpecifications() == null)
            return false;
        if (other.getElasticGpuSpecifications() != null && other.getElasticGpuSpecifications().equals(this.getElasticGpuSpecifications()) == false)
            return false;
        if (other.getElasticInferenceAccelerators() == null ^ this.getElasticInferenceAccelerators() == null)
            return false;
        if (other.getElasticInferenceAccelerators() != null && other.getElasticInferenceAccelerators().equals(this.getElasticInferenceAccelerators()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getInstanceMarketOptions() == null ^ this.getInstanceMarketOptions() == null)
            return false;
        if (other.getInstanceMarketOptions() != null && other.getInstanceMarketOptions().equals(this.getInstanceMarketOptions()) == false)
            return false;
        if (other.getCreditSpecification() == null ^ this.getCreditSpecification() == null)
            return false;
        if (other.getCreditSpecification() != null && other.getCreditSpecification().equals(this.getCreditSpecification()) == false)
            return false;
        if (other.getCpuOptions() == null ^ this.getCpuOptions() == null)
            return false;
        if (other.getCpuOptions() != null && other.getCpuOptions().equals(this.getCpuOptions()) == false)
            return false;
        if (other.getCapacityReservationSpecification() == null ^ this.getCapacityReservationSpecification() == null)
            return false;
        if (other.getCapacityReservationSpecification() != null
                && other.getCapacityReservationSpecification().equals(this.getCapacityReservationSpecification()) == false)
            return false;
        if (other.getHibernationOptions() == null ^ this.getHibernationOptions() == null)
            return false;
        if (other.getHibernationOptions() != null && other.getHibernationOptions().equals(this.getHibernationOptions()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamDiskId() == null) ? 0 : getRamDiskId().hashCode());
        hashCode = prime * hashCode + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuSpecifications() == null) ? 0 : getElasticGpuSpecifications().hashCode());
        hashCode = prime * hashCode + ((getElasticInferenceAccelerators() == null) ? 0 : getElasticInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getInstanceMarketOptions() == null) ? 0 : getInstanceMarketOptions().hashCode());
        hashCode = prime * hashCode + ((getCreditSpecification() == null) ? 0 : getCreditSpecification().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationSpecification() == null) ? 0 : getCapacityReservationSpecification().hashCode());
        hashCode = prime * hashCode + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime * hashCode + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public RequestLaunchTemplateData clone() {
        try {
            return (RequestLaunchTemplateData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
