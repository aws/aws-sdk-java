/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The LaunchSpecificationType data type.
 * </p>
 */
public class LaunchSpecification implements Serializable {

    /**
     * The AMI ID.
     */
    private String imageId;

    /**
     * The name of the key pair.
     */
    private String keyName;

    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> allSecurityGroups;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * Optional data, specific to a user's application, to provide in the
     * launch request. All instances that collectively comprise the launch
     * request have access to this data. User data is never returned through
     * API responses.
     */
    private String userData;

    /**
     * Deprecated.
     */
    private String addressingType;

    /**
     * Specifies the instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     */
    private String instanceType;

    /**
     * Defines a placement item.
     */
    private SpotPlacement placement;

    /**
     * Specifies the ID of the kernel to select.
     */
    private String kernelId;

    /**
     * Specifies the ID of the RAM disk to select. Some kernels require
     * additional drivers at launch. Check the kernel requirements for
     * information on whether or not you need to specify a RAM disk and
     * search for the kernel ID.
     */
    private String ramdiskId;

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enables monitoring for the instance.
     */
    private Boolean monitoringEnabled;

    /**
     * Specifies the Amazon VPC subnet ID within which to launch the
     * instance(s) for Amazon Virtual Private Cloud.
     */
    private String subnetId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfaces;

    private IamInstanceProfileSpecification iamInstanceProfile;

    private Boolean ebsOptimized;

    /**
     * The AMI ID.
     *
     * @return The AMI ID.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The AMI ID.
     *
     * @param imageId The AMI ID.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The AMI ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The AMI ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withImageId(String imageId) {
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
    public LaunchSpecification withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Returns the value of the AllSecurityGroups property for this object.
     *
     * @return The value of the AllSecurityGroups property for this object.
     */
    public java.util.List<GroupIdentifier> getAllSecurityGroups() {
        if (allSecurityGroups == null) {
              allSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              allSecurityGroups.setAutoConstruct(true);
        }
        return allSecurityGroups;
    }
    
    /**
     * Sets the value of the AllSecurityGroups property for this object.
     *
     * @param allSecurityGroups The new value for the AllSecurityGroups property for this object.
     */
    public void setAllSecurityGroups(java.util.Collection<GroupIdentifier> allSecurityGroups) {
        if (allSecurityGroups == null) {
            this.allSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> allSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(allSecurityGroups.size());
        allSecurityGroupsCopy.addAll(allSecurityGroups);
        this.allSecurityGroups = allSecurityGroupsCopy;
    }
    
    /**
     * Sets the value of the AllSecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allSecurityGroups The new value for the AllSecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withAllSecurityGroups(GroupIdentifier... allSecurityGroups) {
        if (getAllSecurityGroups() == null) setAllSecurityGroups(new java.util.ArrayList<GroupIdentifier>(allSecurityGroups.length));
        for (GroupIdentifier value : allSecurityGroups) {
            getAllSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AllSecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allSecurityGroups The new value for the AllSecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withAllSecurityGroups(java.util.Collection<GroupIdentifier> allSecurityGroups) {
        if (allSecurityGroups == null) {
            this.allSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> allSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(allSecurityGroups.size());
            allSecurityGroupsCopy.addAll(allSecurityGroups);
            this.allSecurityGroups = allSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the SecurityGroups property for this object.
     *
     * @return The value of the SecurityGroups property for this object.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * Optional data, specific to a user's application, to provide in the
     * launch request. All instances that collectively comprise the launch
     * request have access to this data. User data is never returned through
     * API responses.
     *
     * @return Optional data, specific to a user's application, to provide in the
     *         launch request. All instances that collectively comprise the launch
     *         request have access to this data. User data is never returned through
     *         API responses.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * Optional data, specific to a user's application, to provide in the
     * launch request. All instances that collectively comprise the launch
     * request have access to this data. User data is never returned through
     * API responses.
     *
     * @param userData Optional data, specific to a user's application, to provide in the
     *         launch request. All instances that collectively comprise the launch
     *         request have access to this data. User data is never returned through
     *         API responses.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * Optional data, specific to a user's application, to provide in the
     * launch request. All instances that collectively comprise the launch
     * request have access to this data. User data is never returned through
     * API responses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData Optional data, specific to a user's application, to provide in the
     *         launch request. All instances that collectively comprise the launch
     *         request have access to this data. User data is never returned through
     *         API responses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public String getAddressingType() {
        return addressingType;
    }
    
    /**
     * Deprecated.
     *
     * @param addressingType Deprecated.
     */
    public void setAddressingType(String addressingType) {
        this.addressingType = addressingType;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addressingType Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withAddressingType(String addressingType) {
        this.addressingType = addressingType;
        return this;
    }

    /**
     * Specifies the instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @return Specifies the instance type.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Specifies the instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Specifies the instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceType
     */
    public LaunchSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Specifies the instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * Specifies the instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceType
     */
    public LaunchSpecification withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * Defines a placement item.
     *
     * @return Defines a placement item.
     */
    public SpotPlacement getPlacement() {
        return placement;
    }
    
    /**
     * Defines a placement item.
     *
     * @param placement Defines a placement item.
     */
    public void setPlacement(SpotPlacement placement) {
        this.placement = placement;
    }
    
    /**
     * Defines a placement item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement Defines a placement item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withPlacement(SpotPlacement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * Specifies the ID of the kernel to select.
     *
     * @return Specifies the ID of the kernel to select.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * Specifies the ID of the kernel to select.
     *
     * @param kernelId Specifies the ID of the kernel to select.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * Specifies the ID of the kernel to select.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId Specifies the ID of the kernel to select.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * Specifies the ID of the RAM disk to select. Some kernels require
     * additional drivers at launch. Check the kernel requirements for
     * information on whether or not you need to specify a RAM disk and
     * search for the kernel ID.
     *
     * @return Specifies the ID of the RAM disk to select. Some kernels require
     *         additional drivers at launch. Check the kernel requirements for
     *         information on whether or not you need to specify a RAM disk and
     *         search for the kernel ID.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * Specifies the ID of the RAM disk to select. Some kernels require
     * additional drivers at launch. Check the kernel requirements for
     * information on whether or not you need to specify a RAM disk and
     * search for the kernel ID.
     *
     * @param ramdiskId Specifies the ID of the RAM disk to select. Some kernels require
     *         additional drivers at launch. Check the kernel requirements for
     *         information on whether or not you need to specify a RAM disk and
     *         search for the kernel ID.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * Specifies the ID of the RAM disk to select. Some kernels require
     * additional drivers at launch. Check the kernel requirements for
     * information on whether or not you need to specify a RAM disk and
     * search for the kernel ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId Specifies the ID of the RAM disk to select. Some kernels require
     *         additional drivers at launch. Check the kernel requirements for
     *         information on whether or not you need to specify a RAM disk and
     *         search for the kernel ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     *
     * @return Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * Enables monitoring for the instance.
     *
     * @return Enables monitoring for the instance.
     */
    public Boolean isMonitoringEnabled() {
        return monitoringEnabled;
    }
    
    /**
     * Enables monitoring for the instance.
     *
     * @param monitoringEnabled Enables monitoring for the instance.
     */
    public void setMonitoringEnabled(Boolean monitoringEnabled) {
        this.monitoringEnabled = monitoringEnabled;
    }
    
    /**
     * Enables monitoring for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoringEnabled Enables monitoring for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withMonitoringEnabled(Boolean monitoringEnabled) {
        this.monitoringEnabled = monitoringEnabled;
        return this;
    }

    /**
     * Enables monitoring for the instance.
     *
     * @return Enables monitoring for the instance.
     */
    public Boolean getMonitoringEnabled() {
        return monitoringEnabled;
    }

    /**
     * Specifies the Amazon VPC subnet ID within which to launch the
     * instance(s) for Amazon Virtual Private Cloud.
     *
     * @return Specifies the Amazon VPC subnet ID within which to launch the
     *         instance(s) for Amazon Virtual Private Cloud.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Specifies the Amazon VPC subnet ID within which to launch the
     * instance(s) for Amazon Virtual Private Cloud.
     *
     * @param subnetId Specifies the Amazon VPC subnet ID within which to launch the
     *         instance(s) for Amazon Virtual Private Cloud.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Specifies the Amazon VPC subnet ID within which to launch the
     * instance(s) for Amazon Virtual Private Cloud.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId Specifies the Amazon VPC subnet ID within which to launch the
     *         instance(s) for Amazon Virtual Private Cloud.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Returns the value of the NetworkInterfaces property for this object.
     *
     * @return The value of the NetworkInterfaces property for this object.
     */
    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
              networkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>();
              networkInterfaces.setAutoConstruct(true);
        }
        return networkInterfaces;
    }
    
    /**
     * Sets the value of the NetworkInterfaces property for this object.
     *
     * @param networkInterfaces The new value for the NetworkInterfaces property for this object.
     */
    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * Sets the value of the NetworkInterfaces property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces The new value for the NetworkInterfaces property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (getNetworkInterfaces() == null) setNetworkInterfaces(new java.util.ArrayList<InstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        for (InstanceNetworkInterfaceSpecification value : networkInterfaces) {
            getNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the NetworkInterfaces property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces The new value for the NetworkInterfaces property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the IamInstanceProfile property for this object.
     *
     * @return The value of the IamInstanceProfile property for this object.
     */
    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * Sets the value of the IamInstanceProfile property for this object.
     *
     * @param iamInstanceProfile The new value for the IamInstanceProfile property for this object.
     */
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * Sets the value of the IamInstanceProfile property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile The new value for the IamInstanceProfile property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Returns the value of the EbsOptimized property for this object.
     *
     * @return The value of the EbsOptimized property for this object.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Sets the value of the EbsOptimized property for this object.
     *
     * @param ebsOptimized The new value for the EbsOptimized property for this object.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Sets the value of the EbsOptimized property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized The new value for the EbsOptimized property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Returns the value of the EbsOptimized property for this object.
     *
     * @return The value of the EbsOptimized property for this object.
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
        if (getAllSecurityGroups() != null) sb.append("AllSecurityGroups: " + getAllSecurityGroups() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getAddressingType() != null) sb.append("AddressingType: " + getAddressingType() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (isMonitoringEnabled() != null) sb.append("MonitoringEnabled: " + isMonitoringEnabled() + ",");
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
        hashCode = prime * hashCode + ((getAllSecurityGroups() == null) ? 0 : getAllSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getAddressingType() == null) ? 0 : getAddressingType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((isMonitoringEnabled() == null) ? 0 : isMonitoringEnabled().hashCode()); 
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

        if (obj instanceof LaunchSpecification == false) return false;
        LaunchSpecification other = (LaunchSpecification)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getAllSecurityGroups() == null ^ this.getAllSecurityGroups() == null) return false;
        if (other.getAllSecurityGroups() != null && other.getAllSecurityGroups().equals(this.getAllSecurityGroups()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getAddressingType() == null ^ this.getAddressingType() == null) return false;
        if (other.getAddressingType() != null && other.getAddressingType().equals(this.getAddressingType()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.isMonitoringEnabled() == null ^ this.isMonitoringEnabled() == null) return false;
        if (other.isMonitoringEnabled() != null && other.isMonitoringEnabled().equals(this.isMonitoringEnabled()) == false) return false; 
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
    
}
    