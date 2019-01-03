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
 * Describes the launch specification for a Scheduled Instance.
 * </p>
 * <p>
 * If you are launching the Scheduled Instance in EC2-VPC, you must specify the ID of the subnet. You can specify the
 * subnet using either <code>SubnetId</code> or <code>NetworkInterface</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstancesLaunchSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstancesLaunchSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
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
    private ScheduledInstancesIamInstanceProfile iamInstanceProfile;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
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
    private ScheduledInstancesMonitoring monitoring;
    /**
     * <p>
     * One or more network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface> networkInterfaces;
    /**
     * <p>
     * The placement information.
     * </p>
     */
    private ScheduledInstancesPlacement placement;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     */
    private String userData;

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @return One or more block device mapping entries.
     */

    public java.util.List<ScheduledInstancesBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping>();
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

    public void setBlockDeviceMappings(java.util.Collection<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping>(blockDeviceMappings);
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

    public ScheduledInstancesLaunchSpecification withBlockDeviceMappings(ScheduledInstancesBlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (ScheduledInstancesBlockDeviceMapping ele : blockDeviceMappings) {
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

    public ScheduledInstancesLaunchSpecification withBlockDeviceMappings(java.util.Collection<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an
     *        EBS-optimized instance.</p>
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
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional usage charges apply when using an
     *         EBS-optimized instance.</p>
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
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an
     *        EBS-optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesLaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated
     *         throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional usage charges apply when using an
     *         EBS-optimized instance.</p>
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

    public void setIamInstanceProfile(ScheduledInstancesIamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @return The IAM instance profile.
     */

    public ScheduledInstancesIamInstanceProfile getIamInstanceProfile() {
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

    public ScheduledInstancesLaunchSpecification withIamInstanceProfile(ScheduledInstancesIamInstanceProfile iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI).
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI).
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesLaunchSpecification withImageId(String imageId) {
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
     */

    public ScheduledInstancesLaunchSpecification withInstanceType(String instanceType) {
        setInstanceType(instanceType);
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

    public ScheduledInstancesLaunchSpecification withKernelId(String kernelId) {
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

    public ScheduledInstancesLaunchSpecification withKeyName(String keyName) {
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

    public void setMonitoring(ScheduledInstancesMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * Enable or disable monitoring for the instances.
     * </p>
     * 
     * @return Enable or disable monitoring for the instances.
     */

    public ScheduledInstancesMonitoring getMonitoring() {
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

    public ScheduledInstancesLaunchSpecification withMonitoring(ScheduledInstancesMonitoring monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @return One or more network interfaces.
     */

    public java.util.List<ScheduledInstancesNetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface>();
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

    public void setNetworkInterfaces(java.util.Collection<ScheduledInstancesNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface>(networkInterfaces);
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

    public ScheduledInstancesLaunchSpecification withNetworkInterfaces(ScheduledInstancesNetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface>(networkInterfaces.length));
        }
        for (ScheduledInstancesNetworkInterface ele : networkInterfaces) {
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

    public ScheduledInstancesLaunchSpecification withNetworkInterfaces(java.util.Collection<ScheduledInstancesNetworkInterface> networkInterfaces) {
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

    public void setPlacement(ScheduledInstancesPlacement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement information.
     * </p>
     * 
     * @return The placement information.
     */

    public ScheduledInstancesPlacement getPlacement() {
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

    public ScheduledInstancesLaunchSpecification withPlacement(ScheduledInstancesPlacement placement) {
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

    public ScheduledInstancesLaunchSpecification withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @return The IDs of one or more security groups.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of one or more security groups.
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
     * The IDs of one or more security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of one or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesLaunchSpecification withSecurityGroupIds(String... securityGroupIds) {
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
     * The IDs of one or more security groups.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of one or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesLaunchSpecification withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instances.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * 
     * @return The ID of the subnet in which to launch the instances.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesLaunchSpecification withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     * 
     * @param userData
     *        The base64-encoded MIME user data.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     * 
     * @return The base64-encoded MIME user data.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The base64-encoded MIME user data.
     * </p>
     * 
     * @param userData
     *        The base64-encoded MIME user data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesLaunchSpecification withUserData(String userData) {
        setUserData(userData);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstancesLaunchSpecification == false)
            return false;
        ScheduledInstancesLaunchSpecification other = (ScheduledInstancesLaunchSpecification) obj;
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
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstancesLaunchSpecification clone() {
        try {
            return (ScheduledInstancesLaunchSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
