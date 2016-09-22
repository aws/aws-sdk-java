/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the launch specification for one or more Spot instances.
 * </p>
 */
public class SpotFleetLaunchSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> securityGroups;
    /**
     * <p>
     * The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     * Base64-encoded text.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * Deprecated.
     * </p>
     */
    private String addressingType;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The placement information.
     * </p>
     */
    private SpotPlacement placement;
    /**
     * <p>
     * The ID of the kernel.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     */
    private SpotFleetMonitoring monitoring;
    /**
     * <p>
     * The ID of the subnet in which to launch the instances. To specify multiple subnets, separate them using commas;
     * for example, "subnet-a61dafcf, subnet-65ea5f08".
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * One or more network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfaces;
    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private IamInstanceProfileSpecification iamInstanceProfile;
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
     * The bid price per unit hour for the specified instance type. If this value is not specified, the default is the
     * Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot bid price by
     * the value of <code>WeightedCapacity</code>.
     * </p>
     */
    private String spotPrice;

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
     * The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     * Base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     *        Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     *        Base64-encoded text.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     * Base64-encoded text.
     * </p>
     * 
     * @return The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     *         Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     *         Base64-encoded text.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     * Base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instances. If you are using an AWS SDK or command line tool,
     *        Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide
     *        Base64-encoded text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withUserData(String userData) {
        setUserData(userData);
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
        this.instanceType = instanceType.toString();
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
        setInstanceType(instanceType);
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
     * One or more block device mapping entries.
     * </p>
     * 
     * @return One or more block device mapping entries.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
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
     * One or more block device mapping entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
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
     * One or more block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
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
     * One or more network interfaces.
     * </p>
     * 
     * @return One or more network interfaces.
     */

    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>();
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

    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>(networkInterfaces);
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
     * One or more network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
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
     * The bid price per unit hour for the specified instance type. If this value is not specified, the default is the
     * Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot bid price by
     * the value of <code>WeightedCapacity</code>.
     * </p>
     * 
     * @param spotPrice
     *        The bid price per unit hour for the specified instance type. If this value is not specified, the default
     *        is the Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot
     *        bid price by the value of <code>WeightedCapacity</code>.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The bid price per unit hour for the specified instance type. If this value is not specified, the default is the
     * Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot bid price by
     * the value of <code>WeightedCapacity</code>.
     * </p>
     * 
     * @return The bid price per unit hour for the specified instance type. If this value is not specified, the default
     *         is the Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot
     *         bid price by the value of <code>WeightedCapacity</code>.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The bid price per unit hour for the specified instance type. If this value is not specified, the default is the
     * Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot bid price by
     * the value of <code>WeightedCapacity</code>.
     * </p>
     * 
     * @param spotPrice
     *        The bid price per unit hour for the specified instance type. If this value is not specified, the default
     *        is the Spot bid price specified for the fleet. To determine the bid price per unit hour, divide the Spot
     *        bid price by the value of <code>WeightedCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetLaunchSpecification withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getAddressingType() != null)
            sb.append("AddressingType: " + getAddressingType() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: " + getWeightedCapacity() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice());
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
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getAddressingType() == null ^ this.getAddressingType() == null)
            return false;
        if (other.getAddressingType() != null && other.getAddressingType().equals(this.getAddressingType()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
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
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getAddressingType() == null) ? 0 : getAddressingType().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
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
