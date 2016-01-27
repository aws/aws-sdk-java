/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the launch specification for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesLaunchSpecification implements Serializable, Cloneable {

    /**
     * The ID of the Amazon Machine Image (AMI).
     */
    private String imageId;

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * The IDs of one or more security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * The base64-encoded MIME user data.
     */
    private String userData;

    /**
     * The placement information.
     */
    private ScheduledInstancesPlacement placement;

    /**
     * The ID of the kernel.
     */
    private String kernelId;

    /**
     * The instance type.
     */
    private String instanceType;

    /**
     * The ID of the RAM disk.
     */
    private String ramdiskId;

    /**
     * One or more block device mapping entries.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings;

    /**
     * Enable or disable monitoring for the instances.
     */
    private ScheduledInstancesMonitoring monitoring;

    /**
     * The ID of the subnet in which to launch the instances.
     */
    private String subnetId;

    /**
     * One or more network interfaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesNetworkInterface> networkInterfaces;

    /**
     * The IAM instance profile.
     */
    private ScheduledInstancesIamInstanceProfile iamInstanceProfile;

    /**
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     */
    private Boolean ebsOptimized;

    /**
     * The ID of the Amazon Machine Image (AMI).
     *
     * @return The ID of the Amazon Machine Image (AMI).
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI).
     *
     * @param imageId The ID of the Amazon Machine Image (AMI).
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the Amazon Machine Image (AMI).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The name of the key pair.
     *
     * @return The name of the key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair.
     *
     * @param keyName The name of the key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The IDs of one or more security groups.
     *
     * @return The IDs of one or more security groups.
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * The IDs of one or more security groups.
     *
     * @param securityGroupIds The IDs of one or more security groups.
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
        securityGroupIdsCopy.addAll(securityGroupIds);
        this.securityGroupIds = securityGroupIdsCopy;
    }
    
    /**
     * The IDs of one or more security groups.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds The IDs of one or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of one or more security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds The IDs of one or more security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
            securityGroupIdsCopy.addAll(securityGroupIds);
            this.securityGroupIds = securityGroupIdsCopy;
        }

        return this;
    }

    /**
     * The base64-encoded MIME user data.
     *
     * @return The base64-encoded MIME user data.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The base64-encoded MIME user data.
     *
     * @param userData The base64-encoded MIME user data.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The base64-encoded MIME user data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData The base64-encoded MIME user data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * The placement information.
     *
     * @return The placement information.
     */
    public ScheduledInstancesPlacement getPlacement() {
        return placement;
    }
    
    /**
     * The placement information.
     *
     * @param placement The placement information.
     */
    public void setPlacement(ScheduledInstancesPlacement placement) {
        this.placement = placement;
    }
    
    /**
     * The placement information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The placement information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withPlacement(ScheduledInstancesPlacement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * The ID of the kernel.
     *
     * @return The ID of the kernel.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel.
     *
     * @param kernelId The ID of the kernel.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The ID of the kernel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The instance type.
     *
     * @return The instance type.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type.
     *
     * @param instanceType The instance type.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The ID of the RAM disk.
     *
     * @return The ID of the RAM disk.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk.
     *
     * @param ramdiskId The ID of the RAM disk.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ID of the RAM disk.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * One or more block device mapping entries.
     *
     * @return One or more block device mapping entries.
     */
    public java.util.List<ScheduledInstancesBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesBlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * One or more block device mapping entries.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     */
    public void setBlockDeviceMappings(java.util.Collection<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesBlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesBlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * One or more block device mapping entries.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withBlockDeviceMappings(ScheduledInstancesBlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<ScheduledInstancesBlockDeviceMapping>(blockDeviceMappings.length));
        for (ScheduledInstancesBlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * One or more block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withBlockDeviceMappings(java.util.Collection<ScheduledInstancesBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesBlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesBlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * Enable or disable monitoring for the instances.
     *
     * @return Enable or disable monitoring for the instances.
     */
    public ScheduledInstancesMonitoring getMonitoring() {
        return monitoring;
    }
    
    /**
     * Enable or disable monitoring for the instances.
     *
     * @param monitoring Enable or disable monitoring for the instances.
     */
    public void setMonitoring(ScheduledInstancesMonitoring monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Enable or disable monitoring for the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring Enable or disable monitoring for the instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withMonitoring(ScheduledInstancesMonitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * The ID of the subnet in which to launch the instances.
     *
     * @return The ID of the subnet in which to launch the instances.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet in which to launch the instances.
     *
     * @param subnetId The ID of the subnet in which to launch the instances.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet in which to launch the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet in which to launch the instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * One or more network interfaces.
     *
     * @return One or more network interfaces.
     */
    public java.util.List<ScheduledInstancesNetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
              networkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesNetworkInterface>();
              networkInterfaces.setAutoConstruct(true);
        }
        return networkInterfaces;
    }
    
    /**
     * One or more network interfaces.
     *
     * @param networkInterfaces One or more network interfaces.
     */
    public void setNetworkInterfaces(java.util.Collection<ScheduledInstancesNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesNetworkInterface> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesNetworkInterface>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * One or more network interfaces.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNetworkInterfaces(java.util.Collection)} or
     * {@link #withNetworkInterfaces(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces One or more network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withNetworkInterfaces(ScheduledInstancesNetworkInterface... networkInterfaces) {
        if (getNetworkInterfaces() == null) setNetworkInterfaces(new java.util.ArrayList<ScheduledInstancesNetworkInterface>(networkInterfaces.length));
        for (ScheduledInstancesNetworkInterface value : networkInterfaces) {
            getNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * One or more network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces One or more network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withNetworkInterfaces(java.util.Collection<ScheduledInstancesNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesNetworkInterface> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstancesNetworkInterface>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

        return this;
    }

    /**
     * The IAM instance profile.
     *
     * @return The IAM instance profile.
     */
    public ScheduledInstancesIamInstanceProfile getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * The IAM instance profile.
     *
     * @param iamInstanceProfile The IAM instance profile.
     */
    public void setIamInstanceProfile(ScheduledInstancesIamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * The IAM instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile The IAM instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withIamInstanceProfile(ScheduledInstancesIamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     *
     * @return Indicates whether the instances are optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     *
     * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesLaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Indicates whether the instances are optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     *
     * @return Indicates whether the instances are optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getMonitoring() != null) sb.append("Monitoring: " + getMonitoring() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getNetworkInterfaces() != null) sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstancesLaunchSpecification == false) return false;
        ScheduledInstancesLaunchSpecification other = (ScheduledInstancesLaunchSpecification)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getMonitoring() == null ^ this.getMonitoring() == null) return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null) return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        return true;
    }
    
    @Override
    public ScheduledInstancesLaunchSpecification clone() {
        try {
            return (ScheduledInstancesLaunchSpecification) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    