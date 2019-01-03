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
 * Describes the launch specification for one or more Spot Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotFleetLaunchSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotFleetLaunchSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> securityGroups;
    /**
     * <p>
     * Deprecated.
     * </p>
     */
    private String addressingType;
    /**
     * <p>
     * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     * because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
     * and its encryption status is used for the volume encryption status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
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
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the kernel.
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
     * Enable or disable monitoring for the instances.
     * </p>
     */
    private SpotFleetMonitoring monitoring;
    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security
     * group IDs using the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfaces;
    /**
     * <p>
     * The placement information.
     * </p>
     */
    private SpotPlacement placement;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not specified,
     * the default is the Spot price specified for the fleet. To determine the Spot price per unit hour, divide the Spot
     * price by the value of <code>WeightedCapacity</code>.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using commas;
     * for example, "subnet-a61dafcf, subnet-65ea5f08".
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The Base64-encoded user data to make available to the instances.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The number of units provided by the specified instance type. These are the same units that you chose to set the
     * target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or I/O).
     * </p>
     * <p>
     * If the target capacity divided by this value is not a whole number, we round the number of instances to the next
     * whole number. If this value is not specified, the default is 1.
     * </p>
     */
    private Double weightedCapacity;
    /**
     * <p>
     * The tags to apply during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SpotFleetTagSpecification> tagSpecifications;

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * 
     * @return One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *         groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *         groups.
     */

    public java.util.List<GroupIdentifier> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *        groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *        groups.
     */

    public void setSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(securityGroups);
    }

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *        groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *        groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withSecurityGroups(GroupIdentifier... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(securityGroups.length));
        }
        for (GroupIdentifier ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *        groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *        groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param addressingType
     *        Deprecated.
     */

    public void setAddressingType(String addressingType) {
        this.addressingType = addressingType;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @return Deprecated.
     */

    public String getAddressingType() {
        return this.addressingType;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param addressingType
     *        Deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withAddressingType(String addressingType) {
        setAddressingType(addressingType);
        return this;
    }

    /**
     * <p>
     * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     * because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
     * and its encryption status is used for the volume encryption status.
     * </p>
     * 
     * @return One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
     *         This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
     *         it is not blank and its encryption status is used for the volume encryption status.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     * because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
     * and its encryption status is used for the volume encryption status.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
     *        This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
     *        it is not blank and its encryption status is used for the volume encryption status.
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
     * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     * because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
     * and its encryption status is used for the volume encryption status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
     *        This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
     *        it is not blank and its encryption status is used for the volume encryption status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is
     * because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
     * and its encryption status is used for the volume encryption status.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
     *        This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
     *        it is not blank and its encryption status is used for the volume encryption status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an EBS
     *        Optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional usage charges apply when using an
     *         EBS Optimized instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an EBS
     *        Optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional usage charges apply when using an
     *         EBS Optimized instance.</p>
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

    public SpotFleetLaunchSpecification withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public SpotFleetLaunchSpecification withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public SpotFleetLaunchSpecification withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @return The ID of the kernel.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withKernelId(String kernelId) {
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

    public SpotFleetLaunchSpecification withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     * 
     * @param monitoring
     *        Enable or disable monitoring for the instances.
     */

    public void setMonitoring(SpotFleetMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     * 
     * @return Enable or disable monitoring for the instances.
     */

    public SpotFleetMonitoring getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     * 
     * @param monitoring
     *        Enable or disable monitoring for the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withMonitoring(SpotFleetMonitoring monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security
     * group IDs using the network interface.
     * </p>
     * 
     * @return One or more network interfaces. If you specify a network interface, you must specify subnet IDs and
     *         security group IDs using the network interface.
     */

    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security
     * group IDs using the network interface.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces. If you specify a network interface, you must specify subnet IDs and
     *        security group IDs using the network interface.
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
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security
     * group IDs using the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces. If you specify a network interface, you must specify subnet IDs and
     *        security group IDs using the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
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
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security
     * group IDs using the network interface.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces. If you specify a network interface, you must specify subnet IDs and
     *        security group IDs using the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     * 
     * @param placement
     *        The placement information.
     */

    public void setPlacement(SpotPlacement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     * 
     * @return The placement information.
     */

    public SpotPlacement getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     * 
     * @param placement
     *        The placement information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withPlacement(SpotPlacement placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @return The ID of the RAM disk.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not specified,
     * the default is the Spot price specified for the fleet. To determine the Spot price per unit hour, divide the Spot
     * price by the value of <code>WeightedCapacity</code>.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not
     *        specified, the default is the Spot price specified for the fleet. To determine the Spot price per unit
     *        hour, divide the Spot price by the value of <code>WeightedCapacity</code>.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not specified,
     * the default is the Spot price specified for the fleet. To determine the Spot price per unit hour, divide the Spot
     * price by the value of <code>WeightedCapacity</code>.
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not
     *         specified, the default is the Spot price specified for the fleet. To determine the Spot price per unit
     *         hour, divide the Spot price by the value of <code>WeightedCapacity</code>.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not specified,
     * the default is the Spot price specified for the fleet. To determine the Spot price per unit hour, divide the Spot
     * price by the value of <code>WeightedCapacity</code>.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not
     *        specified, the default is the Spot price specified for the fleet. To determine the Spot price per unit
     *        hour, divide the Spot price by the value of <code>WeightedCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using commas;
     * for example, "subnet-a61dafcf, subnet-65ea5f08".
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using
     *        commas; for example, "subnet-a61dafcf, subnet-65ea5f08".
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using commas;
     * for example, "subnet-a61dafcf, subnet-65ea5f08".
     * </p>
     * 
     * @return The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using
     *         commas; for example, "subnet-a61dafcf, subnet-65ea5f08".
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using commas;
     * for example, "subnet-a61dafcf, subnet-65ea5f08".
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using
     *        commas; for example, "subnet-a61dafcf, subnet-65ea5f08".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instances.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the instances.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instances.
     * </p>
     * 
     * @return The Base64-encoded user data to make available to the instances.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instances.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The number of units provided by the specified instance type. These are the same units that you chose to set the
     * target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or I/O).
     * </p>
     * <p>
     * If the target capacity divided by this value is not a whole number, we round the number of instances to the next
     * whole number. If this value is not specified, the default is 1.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units provided by the specified instance type. These are the same units that you chose to
     *        set the target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or
     *        I/O).</p>
     *        <p>
     *        If the target capacity divided by this value is not a whole number, we round the number of instances to
     *        the next whole number. If this value is not specified, the default is 1.
     */

    public void setWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of units provided by the specified instance type. These are the same units that you chose to set the
     * target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or I/O).
     * </p>
     * <p>
     * If the target capacity divided by this value is not a whole number, we round the number of instances to the next
     * whole number. If this value is not specified, the default is 1.
     * </p>
     * 
     * @return The number of units provided by the specified instance type. These are the same units that you chose to
     *         set the target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or
     *         I/O).</p>
     *         <p>
     *         If the target capacity divided by this value is not a whole number, we round the number of instances to
     *         the next whole number. If this value is not specified, the default is 1.
     */

    public Double getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of units provided by the specified instance type. These are the same units that you chose to set the
     * target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or I/O).
     * </p>
     * <p>
     * If the target capacity divided by this value is not a whole number, we round the number of instances to the next
     * whole number. If this value is not specified, the default is 1.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units provided by the specified instance type. These are the same units that you chose to
     *        set the target capacity in terms (instances or a performance characteristic such as vCPUs, memory, or
     *        I/O).</p>
     *        <p>
     *        If the target capacity divided by this value is not a whole number, we round the number of instances to
     *        the next whole number. If this value is not specified, the default is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withWeightedCapacity(Double weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
        return this;
    }

    /**
     * <p>
     * The tags to apply during creation.
     * </p>
     * 
     * @return The tags to apply during creation.
     */

    public java.util.List<SpotFleetTagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<SpotFleetTagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply during creation.
     */

    public void setTagSpecifications(java.util.Collection<SpotFleetTagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<SpotFleetTagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withTagSpecifications(SpotFleetTagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<SpotFleetTagSpecification>(tagSpecifications.length));
        }
        for (SpotFleetTagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withTagSpecifications(java.util.Collection<SpotFleetTagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getAddressingType() != null)
            sb.append("AddressingType: ").append(getAddressingType()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: ").append(getWeightedCapacity()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotFleetLaunchSpecification == false)
            return false;
        SpotFleetLaunchSpecification other = (SpotFleetLaunchSpecification) obj;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getAddressingType() == null ^ this.getAddressingType() == null)
            return false;
        if (other.getAddressingType() != null && other.getAddressingType().equals(this.getAddressingType()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
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
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getAddressingType() == null) ? 0 : getAddressingType().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public SpotFleetLaunchSpecification clone() {
        try {
            return (SpotFleetLaunchSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
