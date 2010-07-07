/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents an attribute of an Amazon EC2 instance.
 * </p>
 */
public class InstanceAttribute {

    /**
     * The ID of the associated instance.
     */
    private String instanceId;

    /**
     * The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     */
    private String instanceType;

    /**
     * The kernel ID of the associated instance.
     */
    private String kernelId;

    /**
     * The ramdisk ID of the associated instance.
     */
    private String ramdiskId;

    /**
     * MIME, Base64-encoded user data.
     */
    private String userData;

    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     */
    private Boolean disableApiTermination;

    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * The root device name (e.g., /dev/sda1).
     */
    private String rootDeviceName;

    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * The ID of the associated instance.
     *
     * @return The ID of the associated instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the associated instance.
     *
     * @param instanceId The ID of the associated instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     *
     * @return The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     *
     * @param instanceType The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type (e.g., m1.small, c1.medium, m2.2xlarge, and so on).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The kernel ID of the associated instance.
     *
     * @return The kernel ID of the associated instance.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The kernel ID of the associated instance.
     *
     * @param kernelId The kernel ID of the associated instance.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The kernel ID of the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The kernel ID of the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }
    
    
    /**
     * The ramdisk ID of the associated instance.
     *
     * @return The ramdisk ID of the associated instance.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ramdisk ID of the associated instance.
     *
     * @param ramdiskId The ramdisk ID of the associated instance.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ramdisk ID of the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ramdisk ID of the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }
    
    
    /**
     * MIME, Base64-encoded user data.
     *
     * @return MIME, Base64-encoded user data.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * MIME, Base64-encoded user data.
     *
     * @param userData MIME, Base64-encoded user data.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * MIME, Base64-encoded user data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData MIME, Base64-encoded user data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withUserData(String userData) {
        this.userData = userData;
        return this;
    }
    
    
    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     *
     * @return Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     *
     * @param disableApiTermination Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }
    
    
    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     *
     * @return Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     *
     * @return Whether this instance's Amazon EBS volumes are deleted when the
     *         instance is shut down.
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     *
     * @param instanceInitiatedShutdownBehavior Whether this instance's Amazon EBS volumes are deleted when the
     *         instance is shut down.
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInitiatedShutdownBehavior Whether this instance's Amazon EBS volumes are deleted when the
     *         instance is shut down.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }
    
    
    /**
     * The root device name (e.g., /dev/sda1).
     *
     * @return The root device name (e.g., /dev/sda1).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (e.g., /dev/sda1).
     *
     * @param rootDeviceName The root device name (e.g., /dev/sda1).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (e.g., /dev/sda1).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (e.g., /dev/sda1).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }
    
    
    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     *
     * @return How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     *
     * @param blockDeviceMappings How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
     */
    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        java.util.List<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        for (InstanceBlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceAttribute withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        java.util.List<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;

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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("KernelId: " + kernelId + ", ");
        sb.append("RamdiskId: " + ramdiskId + ", ");
        sb.append("UserData: " + userData + ", ");
        sb.append("DisableApiTermination: " + disableApiTermination + ", ");
        sb.append("InstanceInitiatedShutdownBehavior: " + instanceInitiatedShutdownBehavior + ", ");
        sb.append("RootDeviceName: " + rootDeviceName + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    