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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RunInstancesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RunInstancesRequest> {

    /**
     * <p>
     * The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because
     * only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its
     * encryption status is used for the volume encryption status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an instance
     * and must be specified here or in a launch template.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6
     * addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6
     * addresses in the same request. You can specify this option if you've specified a minimum number of instances to
     * launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     */
    private Integer ipv6AddressCount;
    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You
     * cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot
     * specify this option if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> ipv6Addresses;
    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String kernelId;
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
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     */
    private Integer maxCount;
    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     */
    private Integer minCount;
    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private Boolean monitoring;
    /**
     * <p>
     * The placement for the instance.
     * </p>
     */
    private Placement placement;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String ramdiskId;
    /**
     * <p>
     * The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for you, and
     * you can load the text from a file. Otherwise, you must provide base64-encoded text.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String additionalInfo;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     * <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private IamInstanceProfileSpecification iamInstanceProfile;
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
     * The network interfaces.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfaces;
    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't specify this option if you've specified the
     * option to designate a private IP address as the primary IP address in a network interface specification. You
     * cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification> elasticGpuSpecification;
    /**
     * <p>
     * An elastic inference accelerator.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticInferenceAccelerator> elasticInferenceAccelerators;
    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see <a>CreateTags</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that you specify in <a>RunInstances</a>
     * override the same parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     * <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     * </p>
     */
    private InstanceMarketOptionsRequest instanceMarketOptions;
    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>. To change this attribute after launch, use <a>ModifyInstanceCreditSpecification</a>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
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
    private CpuOptionsRequest cpuOptions;
    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's
     * Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     */
    private CapacityReservationSpecification capacityReservationSpecification;
    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private HibernationOptionsRequest hibernationOptions;
    /**
     * <p>
     * The license configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LicenseConfigurationRequest> licenseSpecifications;

    /**
     * Default constructor for RunInstancesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RunInstancesRequest() {
    }

    /**
     * Constructs a new RunInstancesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an
     *        instance and must be specified here or in a launch template.
     * @param minCount
     *        The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2
     *        can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     * @param maxCount
     *        The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the
     *        target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *        <code>MinCount</code>.
     *        </p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 FAQ.
     */
    public RunInstancesRequest(String imageId, Integer minCount, Integer maxCount) {
        setImageId(imageId);
        setMinCount(minCount);
        setMaxCount(maxCount);
    }

    /**
     * <p>
     * The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because
     * only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its
     * encryption status is used for the volume encryption status.
     * </p>
     * 
     * @return The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     *         because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is
     *         not blank and its encryption status is used for the volume encryption status.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because
     * only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its
     * encryption status is used for the volume encryption status.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     *        because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is
     *        not blank and its encryption status is used for the volume encryption status.
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
     * The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because
     * only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its
     * encryption status is used for the volume encryption status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     *        because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is
     *        not blank and its encryption status is used for the volume encryption status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because
     * only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its
     * encryption status is used for the volume encryption status.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     *        because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is
     *        not blank and its encryption status is used for the volume encryption status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an instance
     * and must be specified here or in a launch template.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an
     *        instance and must be specified here or in a launch template.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an instance
     * and must be specified here or in a launch template.
     * </p>
     * 
     * @return The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an
     *         instance and must be specified here or in a launch template.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an instance
     * and must be specified here or in a launch template.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by calling <a>DescribeImages</a>. An AMI is required to launch an
     *        instance and must be specified here or in a launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
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
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @return The instance type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Default: <code>m1.small</code>
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
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RunInstancesRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RunInstancesRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6
     * addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6
     * addresses in the same request. You can specify this option if you've specified a minimum number of instances to
     * launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param ipv6AddressCount
     *        [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses
     *        the IPv6 addresses from the range of your subnet. You cannot specify this option and the option to assign
     *        specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum
     *        number of instances to launch.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     */

    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6
     * addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6
     * addresses in the same request. You can specify this option if you've specified a minimum number of instances to
     * launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @return [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses
     *         the IPv6 addresses from the range of your subnet. You cannot specify this option and the option to assign
     *         specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum
     *         number of instances to launch.</p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     */

    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * <p>
     * [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6
     * addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6
     * addresses in the same request. You can specify this option if you've specified a minimum number of instances to
     * launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param ipv6AddressCount
     *        [EC2-VPC] A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses
     *        the IPv6 addresses from the range of your subnet. You cannot specify this option and the option to assign
     *        specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum
     *        number of instances to launch.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withIpv6AddressCount(Integer ipv6AddressCount) {
        setIpv6AddressCount(ipv6AddressCount);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You
     * cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot
     * specify this option if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @return [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network
     *         interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same
     *         request. You cannot specify this option if you've specified a minimum number of instances to launch.</p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     */

    public java.util.List<InstanceIpv6Address> getIpv6Addresses() {
        if (ipv6Addresses == null) {
            ipv6Addresses = new com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>();
        }
        return ipv6Addresses;
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You
     * cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot
     * specify this option if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param ipv6Addresses
     *        [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface.
     *        You cannot specify this option and the option to assign a number of IPv6 addresses in the same request.
     *        You cannot specify this option if you've specified a minimum number of instances to launch.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     */

    public void setIpv6Addresses(java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>(ipv6Addresses);
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You
     * cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot
     * specify this option if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Addresses(java.util.Collection)} or {@link #withIpv6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv6Addresses
     *        [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface.
     *        You cannot specify this option and the option to assign a number of IPv6 addresses in the same request.
     *        You cannot specify this option if you've specified a minimum number of instances to launch.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withIpv6Addresses(InstanceIpv6Address... ipv6Addresses) {
        if (this.ipv6Addresses == null) {
            setIpv6Addresses(new com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>(ipv6Addresses.length));
        }
        for (InstanceIpv6Address ele : ipv6Addresses) {
            this.ipv6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You
     * cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot
     * specify this option if you've specified a minimum number of instances to launch.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param ipv6Addresses
     *        [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface.
     *        You cannot specify this option and the option to assign a number of IPv6 addresses in the same request.
     *        You cannot specify this option if you've specified a minimum number of instances to launch.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withIpv6Addresses(java.util.Collection<InstanceIpv6Address> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param kernelId
     *        The ID of the kernel.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @return The ID of the kernel.</p> <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param kernelId
     *        The ID of the kernel.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withKernelId(String kernelId) {
        setKernelId(kernelId);
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

    public RunInstancesRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the
     *        target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *        <code>MinCount</code>.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 FAQ.
     */

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * 
     * @return The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in
     *         the target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *         <code>MinCount</code>.</p>
     *         <p>
     *         Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can
     *         I run in Amazon EC2</a> in the Amazon EC2 FAQ.
     */

    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the
     *        target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *        <code>MinCount</code>.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withMaxCount(Integer maxCount) {
        setMaxCount(maxCount);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     * 
     * @param minCount
     *        The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2
     *        can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     */

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     * 
     * @return The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon
     *         EC2 can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *         <p>
     *         Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can
     *         I run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     */

    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     * 
     * @param minCount
     *        The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2
     *        can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withMinCount(Integer minCount) {
        setMinCount(minCount);
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

    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public Boolean getMonitoring() {
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

    public RunInstancesRequest withMonitoring(Boolean monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public Boolean isMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @param placement
     *        The placement for the instance.
     */

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @return The placement for the instance.
     */

    public Placement getPlacement() {
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

    public RunInstancesRequest withPlacement(Placement placement) {
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @return The ID of the RAM disk.</p> <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @return The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *         <p>
     *         Default: Amazon EC2 uses the default security group.
     *         </p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     *        </p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
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
     * The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     *        </p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     *        </p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security
     *         group IDs instead.</p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     *         </p>
     *         <p>
     *         Default: Amazon EC2 uses the default security group.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security
     *        group IDs instead.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     *        </p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
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
     * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security
     *        group IDs instead.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     *        </p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroups(String... securityGroups) {
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
     * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security
     *        group IDs instead.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     *        </p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet to launch the instance into.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the subnet to launch the instance into.</p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet to launch the instance into.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for you, and
     * you can load the text from a file. Otherwise, you must provide base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *        Instance at Launch</a> (Linux) and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *        >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for
     *        you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for you, and
     * you can load the text from a file. Otherwise, you must provide base64-encoded text.
     * </p>
     * 
     * @return The user data to make available to the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *         Instance at Launch</a> (Linux) and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *         >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for
     *         you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for you, and
     * you can load the text from a file. Otherwise, you must provide base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *        Instance at Launch</a> (Linux) and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *        >Adding User Data</a> (Windows). If you are using a command line tool, base64-encoding is performed for
     *        you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Maximum 64 ASCII characters
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraints: Maximum 64 ASCII characters
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Maximum 64 ASCII characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     * <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param disableApiTermination
     *        If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *        console, CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     *        <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code>
     *        to <code>terminate</code>, you can terminate the instance by running the shutdown command from the
     *        instance.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     * <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *         console, CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch,
     *         use <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance
     *         by running the shutdown command from the instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     * <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param disableApiTermination
     *        If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *        console, CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     *        <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code>
     *        to <code>terminate</code>, you can terminate the instance by running the shutdown command from the
     *        instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withDisableApiTermination(Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch, use
     * <a>ModifyInstanceAttribute</a>. Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *         console, CLI, or API; otherwise, you can. To change this attribute to <code>false</code> after launch,
     *         use <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance
     *         by running the shutdown command from the instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized
     * instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *        throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using an EBS-optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
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
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *         performance. This optimization isn't available with all instance types. Additional usage charges apply
     *         when using an EBS-optimized instance.</p>
     *         <p>
     *         Default: <code>false</code>
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
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *        throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using an EBS-optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withEbsOptimized(Boolean ebsOptimized) {
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
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     *         performance. This optimization isn't available with all instance types. Additional usage charges apply
     *         when using an EBS-optimized instance.</p>
     *         <p>
     *         Default: <code>false</code>
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

    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @return The IAM instance profile.
     */

    public IamInstanceProfileSpecification getIamInstanceProfile() {
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

    public RunInstancesRequest withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
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

    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
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
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        withInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
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

    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @return The network interfaces.</p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     */

    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     */

    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>(networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        }
        for (InstanceNetworkInterfaceSpecification ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces.</p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't specify this option if you've specified the
     * option to designate a private IP address as the primary IP address in a network interface specification. You
     * cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the
     *        subnet.</p>
     *        <p>
     *        Only one private IP address can be designated as primary. You can't specify this option if you've
     *        specified the option to designate a private IP address as the primary IP address in a network interface
     *        specification. You cannot specify this option if you're launching more than one instance in the request.
     *        </p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't specify this option if you've specified the
     * option to designate a private IP address as the primary IP address in a network interface specification. You
     * cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @return [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the
     *         subnet.</p>
     *         <p>
     *         Only one private IP address can be designated as primary. You can't specify this option if you've
     *         specified the option to designate a private IP address as the primary IP address in a network interface
     *         specification. You cannot specify this option if you're launching more than one instance in the request.
     *         </p>
     *         <p>
     *         You cannot specify this option and the network interfaces option in the same request.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. You can't specify this option if you've specified the
     * option to designate a private IP address as the primary IP address in a network interface specification. You
     * cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * You cannot specify this option and the network interfaces option in the same request.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the
     *        subnet.</p>
     *        <p>
     *        Only one private IP address can be designated as primary. You can't specify this option if you've
     *        specified the option to designate a private IP address as the primary IP address in a network interface
     *        specification. You cannot specify this option if you're launching more than one instance in the request.
     *        </p>
     *        <p>
     *        You cannot specify this option and the network interfaces option in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * 
     * @return An elastic GPU to associate with the instance.
     */

    public java.util.List<ElasticGpuSpecification> getElasticGpuSpecification() {
        if (elasticGpuSpecification == null) {
            elasticGpuSpecification = new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>();
        }
        return elasticGpuSpecification;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * 
     * @param elasticGpuSpecification
     *        An elastic GPU to associate with the instance.
     */

    public void setElasticGpuSpecification(java.util.Collection<ElasticGpuSpecification> elasticGpuSpecification) {
        if (elasticGpuSpecification == null) {
            this.elasticGpuSpecification = null;
            return;
        }

        this.elasticGpuSpecification = new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>(elasticGpuSpecification);
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticGpuSpecification(java.util.Collection)} or
     * {@link #withElasticGpuSpecification(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticGpuSpecification
     *        An elastic GPU to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withElasticGpuSpecification(ElasticGpuSpecification... elasticGpuSpecification) {
        if (this.elasticGpuSpecification == null) {
            setElasticGpuSpecification(new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>(elasticGpuSpecification.length));
        }
        for (ElasticGpuSpecification ele : elasticGpuSpecification) {
            this.elasticGpuSpecification.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An elastic GPU to associate with the instance.
     * </p>
     * 
     * @param elasticGpuSpecification
     *        An elastic GPU to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withElasticGpuSpecification(java.util.Collection<ElasticGpuSpecification> elasticGpuSpecification) {
        setElasticGpuSpecification(elasticGpuSpecification);
        return this;
    }

    /**
     * <p>
     * An elastic inference accelerator.
     * </p>
     * 
     * @return An elastic inference accelerator.
     */

    public java.util.List<ElasticInferenceAccelerator> getElasticInferenceAccelerators() {
        if (elasticInferenceAccelerators == null) {
            elasticInferenceAccelerators = new com.amazonaws.internal.SdkInternalList<ElasticInferenceAccelerator>();
        }
        return elasticInferenceAccelerators;
    }

    /**
     * <p>
     * An elastic inference accelerator.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        An elastic inference accelerator.
     */

    public void setElasticInferenceAccelerators(java.util.Collection<ElasticInferenceAccelerator> elasticInferenceAccelerators) {
        if (elasticInferenceAccelerators == null) {
            this.elasticInferenceAccelerators = null;
            return;
        }

        this.elasticInferenceAccelerators = new com.amazonaws.internal.SdkInternalList<ElasticInferenceAccelerator>(elasticInferenceAccelerators);
    }

    /**
     * <p>
     * An elastic inference accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticInferenceAccelerators(java.util.Collection)} or
     * {@link #withElasticInferenceAccelerators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        An elastic inference accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withElasticInferenceAccelerators(ElasticInferenceAccelerator... elasticInferenceAccelerators) {
        if (this.elasticInferenceAccelerators == null) {
            setElasticInferenceAccelerators(new com.amazonaws.internal.SdkInternalList<ElasticInferenceAccelerator>(elasticInferenceAccelerators.length));
        }
        for (ElasticInferenceAccelerator ele : elasticInferenceAccelerators) {
            this.elasticInferenceAccelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An elastic inference accelerator.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        An elastic inference accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withElasticInferenceAccelerators(java.util.Collection<ElasticInferenceAccelerator> elasticInferenceAccelerators) {
        setElasticInferenceAccelerators(elasticInferenceAccelerators);
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

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
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

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
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

    public RunInstancesRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
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

    public RunInstancesRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that you specify in <a>RunInstances</a>
     * override the same parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use to launch the instances. Any parameters that you specify in <a>RunInstances</a>
     *        override the same parameters in the launch template. You can specify either the name or ID of a launch
     *        template, but not both.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that you specify in <a>RunInstances</a>
     * override the same parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     * </p>
     * 
     * @return The launch template to use to launch the instances. Any parameters that you specify in
     *         <a>RunInstances</a> override the same parameters in the launch template. You can specify either the name
     *         or ID of a launch template, but not both.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template to use to launch the instances. Any parameters that you specify in <a>RunInstances</a>
     * override the same parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use to launch the instances. Any parameters that you specify in <a>RunInstances</a>
     *        override the same parameters in the launch template. You can specify either the name or ID of a launch
     *        template, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     * <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The market (purchasing) option for the instances.</p>
     *        <p>
     *        For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     *        <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     */

    public void setInstanceMarketOptions(InstanceMarketOptionsRequest instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     * <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     * </p>
     * 
     * @return The market (purchasing) option for the instances.</p>
     *         <p>
     *         For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     *         <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     */

    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * <p>
     * For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     * <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The market (purchasing) option for the instances.</p>
     *        <p>
     *        For <a>RunInstances</a>, persistent Spot Instance requests are only supported when
     *        <b>InstanceInterruptionBehavior</b> is set to either <code>hibernate</code> or <code>stop</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withInstanceMarketOptions(InstanceMarketOptionsRequest instanceMarketOptions) {
        setInstanceMarketOptions(instanceMarketOptions);
        return this;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>. To change this attribute after launch, use <a>ModifyInstanceCreditSpecification</a>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
     * </p>
     * 
     * @param creditSpecification
     *        The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     *        <code>unlimited</code>. To change this attribute after launch, use
     *        <a>ModifyInstanceCreditSpecification</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
     */

    public void setCreditSpecification(CreditSpecificationRequest creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>. To change this attribute after launch, use <a>ModifyInstanceCreditSpecification</a>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
     * </p>
     * 
     * @return The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     *         <code>unlimited</code>. To change this attribute after launch, use
     *         <a>ModifyInstanceCreditSpecification</a>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *         Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
     */

    public CreditSpecificationRequest getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     * <code>unlimited</code>. To change this attribute after launch, use <a>ModifyInstanceCreditSpecification</a>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
     * </p>
     * 
     * @param creditSpecification
     *        The credit option for CPU usage of the instance. Valid values are <code>standard</code> and
     *        <code>unlimited</code>. To change this attribute after launch, use
     *        <a>ModifyInstanceCreditSpecification</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        Performance Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>standard</code> (T2 instances) or <code>unlimited</code> (T3 instances)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withCreditSpecification(CreditSpecificationRequest creditSpecification) {
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

    public void setCpuOptions(CpuOptionsRequest cpuOptions) {
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

    public CpuOptionsRequest getCpuOptions() {
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

    public RunInstancesRequest withCpuOptions(CpuOptionsRequest cpuOptions) {
        setCpuOptions(cpuOptions);
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's
     * Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Information about the Capacity Reservation targeting option. If you do not specify this parameter, the
     *        instance's Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any
     *        open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
     */

    public void setCapacityReservationSpecification(CapacityReservationSpecification capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's
     * Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     * 
     * @return Information about the Capacity Reservation targeting option. If you do not specify this parameter, the
     *         instance's Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any
     *         open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
     */

    public CapacityReservationSpecification getCapacityReservationSpecification() {
        return this.capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's
     * Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any open Capacity
     * Reservation that has matching attributes (instance type, platform, Availability Zone).
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Information about the Capacity Reservation targeting option. If you do not specify this parameter, the
     *        instance's Capacity Reservation preference defaults to <code>open</code>, which enables it to run in any
     *        open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withCapacityReservationSpecification(CapacityReservationSpecification capacityReservationSpecification) {
        setCapacityReservationSpecification(capacityReservationSpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hibernationOptions
     *        Indicates whether an instance is enabled for hibernation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setHibernationOptions(HibernationOptionsRequest hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether an instance is enabled for hibernation. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public HibernationOptionsRequest getHibernationOptions() {
        return this.hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is enabled for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hibernationOptions
     *        Indicates whether an instance is enabled for hibernation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withHibernationOptions(HibernationOptionsRequest hibernationOptions) {
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

    public java.util.List<LicenseConfigurationRequest> getLicenseSpecifications() {
        if (licenseSpecifications == null) {
            licenseSpecifications = new com.amazonaws.internal.SdkInternalList<LicenseConfigurationRequest>();
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

    public void setLicenseSpecifications(java.util.Collection<LicenseConfigurationRequest> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new com.amazonaws.internal.SdkInternalList<LicenseConfigurationRequest>(licenseSpecifications);
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

    public RunInstancesRequest withLicenseSpecifications(LicenseConfigurationRequest... licenseSpecifications) {
        if (this.licenseSpecifications == null) {
            setLicenseSpecifications(new com.amazonaws.internal.SdkInternalList<LicenseConfigurationRequest>(licenseSpecifications.length));
        }
        for (LicenseConfigurationRequest ele : licenseSpecifications) {
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

    public RunInstancesRequest withLicenseSpecifications(java.util.Collection<LicenseConfigurationRequest> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RunInstancesRequest> getDryRunRequest() {
        Request<RunInstancesRequest> request = new RunInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: ").append(getIpv6AddressCount()).append(",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: ").append(getIpv6Addresses()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getMaxCount() != null)
            sb.append("MaxCount: ").append(getMaxCount()).append(",");
        if (getMinCount() != null)
            sb.append("MinCount: ").append(getMinCount()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: ").append(getDisableApiTermination()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: ").append(getInstanceInitiatedShutdownBehavior()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getElasticGpuSpecification() != null)
            sb.append("ElasticGpuSpecification: ").append(getElasticGpuSpecification()).append(",");
        if (getElasticInferenceAccelerators() != null)
            sb.append("ElasticInferenceAccelerators: ").append(getElasticInferenceAccelerators()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
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

        if (obj instanceof RunInstancesRequest == false)
            return false;
        RunInstancesRequest other = (RunInstancesRequest) obj;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getIpv6AddressCount() == null ^ this.getIpv6AddressCount() == null)
            return false;
        if (other.getIpv6AddressCount() != null && other.getIpv6AddressCount().equals(this.getIpv6AddressCount()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getMinCount() == null ^ this.getMinCount() == null)
            return false;
        if (other.getMinCount() != null && other.getMinCount().equals(this.getMinCount()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getElasticGpuSpecification() == null ^ this.getElasticGpuSpecification() == null)
            return false;
        if (other.getElasticGpuSpecification() != null && other.getElasticGpuSpecification().equals(this.getElasticGpuSpecification()) == false)
            return false;
        if (other.getElasticInferenceAccelerators() == null ^ this.getElasticInferenceAccelerators() == null)
            return false;
        if (other.getElasticInferenceAccelerators() != null && other.getElasticInferenceAccelerators().equals(this.getElasticInferenceAccelerators()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
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

        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
        hashCode = prime * hashCode + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode + ((getMinCount() == null) ? 0 : getMinCount().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuSpecification() == null) ? 0 : getElasticGpuSpecification().hashCode());
        hashCode = prime * hashCode + ((getElasticInferenceAccelerators() == null) ? 0 : getElasticInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getInstanceMarketOptions() == null) ? 0 : getInstanceMarketOptions().hashCode());
        hashCode = prime * hashCode + ((getCreditSpecification() == null) ? 0 : getCreditSpecification().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationSpecification() == null) ? 0 : getCapacityReservationSpecification().hashCode());
        hashCode = prime * hashCode + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime * hashCode + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public RunInstancesRequest clone() {
        return (RunInstancesRequest) super.clone();
    }
}
