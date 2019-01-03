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
 * Describes the launch specification for an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The Base64-encoded user data for the instance.
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
     * One or more block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
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
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security
     * group IDs using the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfaces;
    /**
     * <p>
     * The placement information for the instance.
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
     * The ID of the subnet in which to launch the instance.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> allSecurityGroups;

    private Boolean monitoringEnabled;
    /**
     * <p>
     * One or more security group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;

    /**
     * <p>
     * The Base64-encoded user data for the instance.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data for the instance.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data for the instance.
     * </p>
     * 
     * @return The Base64-encoded user data for the instance.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded user data for the instance.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withUserData(String userData) {
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

    public LaunchSpecification withAddressingType(String addressingType) {
        setAddressingType(addressingType);
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

    public LaunchSpecification withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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

    public LaunchSpecification withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
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
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *         to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *         optimization isn't available with all instance types. Additional usage charges apply when using an EBS
     *         Optimized instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an EBS
     *        Optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *         to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *         optimization isn't available with all instance types. Additional usage charges apply when using an EBS
     *         Optimized instance.</p>
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

    public LaunchSpecification withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
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

    public LaunchSpecification withImageId(String imageId) {
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

    public LaunchSpecification withInstanceType(String instanceType) {
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

    public LaunchSpecification withInstanceType(InstanceType instanceType) {
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

    public LaunchSpecification withKernelId(String kernelId) {
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

    public LaunchSpecification withKeyName(String keyName) {
        setKeyName(keyName);
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

    public LaunchSpecification withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
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

    public LaunchSpecification withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The placement information for the instance.
     * </p>
     * 
     * @param placement
     *        The placement information for the instance.
     */

    public void setPlacement(SpotPlacement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement information for the instance.
     * </p>
     * 
     * @return The placement information for the instance.
     */

    public SpotPlacement getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement information for the instance.
     * </p>
     * 
     * @param placement
     *        The placement information for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withPlacement(SpotPlacement placement) {
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

    public LaunchSpecification withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instance.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instance.
     * </p>
     * 
     * @return The ID of the subnet in which to launch the instance.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withSubnetId(String subnetId) {
        setSubnetId(subnetId);
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

    public java.util.List<GroupIdentifier> getAllSecurityGroups() {
        if (allSecurityGroups == null) {
            allSecurityGroups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return allSecurityGroups;
    }

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * 
     * @param allSecurityGroups
     *        One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *        groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *        groups.
     */

    public void setAllSecurityGroups(java.util.Collection<GroupIdentifier> allSecurityGroups) {
        if (allSecurityGroups == null) {
            this.allSecurityGroups = null;
            return;
        }

        this.allSecurityGroups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(allSecurityGroups);
    }

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllSecurityGroups(java.util.Collection)} or {@link #withAllSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allSecurityGroups
     *        One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *        groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *        groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withAllSecurityGroups(GroupIdentifier... allSecurityGroups) {
        if (this.allSecurityGroups == null) {
            setAllSecurityGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(allSecurityGroups.length));
        }
        for (GroupIdentifier ele : allSecurityGroups) {
            this.allSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups.
     * When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     * </p>
     * 
     * @param allSecurityGroups
     *        One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security
     *        groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security
     *        groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withAllSecurityGroups(java.util.Collection<GroupIdentifier> allSecurityGroups) {
        setAllSecurityGroups(allSecurityGroups);
        return this;
    }

    /**
     * @param monitoringEnabled
     */

    public void setMonitoringEnabled(Boolean monitoringEnabled) {
        this.monitoringEnabled = monitoringEnabled;
    }

    /**
     * @return
     */

    public Boolean getMonitoringEnabled() {
        return this.monitoringEnabled;
    }

    /**
     * @param monitoringEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withMonitoringEnabled(Boolean monitoringEnabled) {
        setMonitoringEnabled(monitoringEnabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isMonitoringEnabled() {
        return this.monitoringEnabled;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @return One or more security group names.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @param securityGroups
     *        One or more security group names.
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
     * One or more security group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        One or more security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withSecurityGroups(String... securityGroups) {
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
     * One or more security group names.
     * </p>
     * 
     * @param securityGroups
     *        One or more security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchSpecification withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
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
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getAllSecurityGroups() != null)
            sb.append("AllSecurityGroups: ").append(getAllSecurityGroups()).append(",");
        if (getMonitoringEnabled() != null)
            sb.append("MonitoringEnabled: ").append(getMonitoringEnabled()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchSpecification == false)
            return false;
        LaunchSpecification other = (LaunchSpecification) obj;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
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
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getAllSecurityGroups() == null ^ this.getAllSecurityGroups() == null)
            return false;
        if (other.getAllSecurityGroups() != null && other.getAllSecurityGroups().equals(this.getAllSecurityGroups()) == false)
            return false;
        if (other.getMonitoringEnabled() == null ^ this.getMonitoringEnabled() == null)
            return false;
        if (other.getMonitoringEnabled() != null && other.getMonitoringEnabled().equals(this.getMonitoringEnabled()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getAddressingType() == null) ? 0 : getAddressingType().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getAllSecurityGroups() == null) ? 0 : getAllSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getMonitoringEnabled() == null) ? 0 : getMonitoringEnabled().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public LaunchSpecification clone() {
        try {
            return (LaunchSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
