/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The LaunchSpecificationType data type.
 * </p>
 */
public class LaunchSpecification {

    /**
     * The AMI ID.
     */
    private String imageId;

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * 
     */
    private java.util.List<GroupIdentifier> allSecurityGroups;

    /**
     * 
     */
    private java.util.List<String> securityGroups;

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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cg1.4xlarge
     */
    private String instanceType;

    /**
     * Defines a placement item.
     */
    private Placement placement;

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
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enables monitoring for the instance.
     */
    private Boolean monitoringEnabled;

    /**
     * Specifies the Amazon VPC subnet ID within which to launch the
     * instance(s) for Amazon Virtual Private Cloud.
     */
    private String subnetId;

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
     * 
     *
     * @return 
     */
    public java.util.List<GroupIdentifier> getAllSecurityGroups() {
        if (allSecurityGroups == null) {
            allSecurityGroups = new java.util.ArrayList<GroupIdentifier>();
        }
        return allSecurityGroups;
    }
    
    /**
     * 
     *
     * @param allSecurityGroups 
     */
    public void setAllSecurityGroups(java.util.Collection<GroupIdentifier> allSecurityGroups) {
        java.util.List<GroupIdentifier> allSecurityGroupsCopy = new java.util.ArrayList<GroupIdentifier>();
        if (allSecurityGroups != null) {
            allSecurityGroupsCopy.addAll(allSecurityGroups);
        }
        this.allSecurityGroups = allSecurityGroupsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allSecurityGroups 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchSpecification withAllSecurityGroups(GroupIdentifier... allSecurityGroups) {
        for (GroupIdentifier value : allSecurityGroups) {
            getAllSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allSecurityGroups 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchSpecification withAllSecurityGroups(java.util.Collection<GroupIdentifier> allSecurityGroups) {
        java.util.List<GroupIdentifier> allSecurityGroupsCopy = new java.util.ArrayList<GroupIdentifier>();
        if (allSecurityGroups != null) {
            allSecurityGroupsCopy.addAll(allSecurityGroups);
        }
        this.allSecurityGroups = allSecurityGroupsCopy;

        return this;
    }
    
    /**
     * 
     *
     * @return 
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * 
     *
     * @param securityGroups 
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchSpecification withSecurityGroups(String... securityGroups) {
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchSpecification withSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;

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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cg1.4xlarge
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
     * Defines a placement item.
     *
     * @return Defines a placement item.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * Defines a placement item.
     *
     * @param placement Defines a placement item.
     */
    public void setPlacement(Placement placement) {
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
    public LaunchSpecification withPlacement(Placement placement) {
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
            blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();
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
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
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
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;

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
        sb.append("ImageId: " + imageId + ", ");
        sb.append("KeyName: " + keyName + ", ");
        sb.append("AllSecurityGroups: " + allSecurityGroups + ", ");
        sb.append("SecurityGroups: " + securityGroups + ", ");
        sb.append("UserData: " + userData + ", ");
        sb.append("AddressingType: " + addressingType + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("Placement: " + placement + ", ");
        sb.append("KernelId: " + kernelId + ", ");
        sb.append("RamdiskId: " + ramdiskId + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("MonitoringEnabled: " + monitoringEnabled + ", ");
        sb.append("SubnetId: " + subnetId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    