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
 * Specifies how an instance's block devices should be mapped on a running instance.
 * </p>
 */
public class InstanceBlockDeviceMappingSpecification implements Serializable {

    /**
     * The device name (e.g., <code>/dev/sdh</code>) at which the block
     * device is exposed on the instance.
     */
    private String deviceName;

    /**
     * The EBS instance block device specification describing the EBS block
     * device to map to the specified device name on a running instance.
     */
    private EbsInstanceBlockDeviceSpecification ebs;

    /**
     * The virtual device name.
     */
    private String virtualName;

    /**
     * When set to the empty string, specifies that the device name in this
     * object should not be mapped to any real device.
     */
    private String noDevice;

    /**
     * The device name (e.g., <code>/dev/sdh</code>) at which the block
     * device is exposed on the instance.
     *
     * @return The device name (e.g., <code>/dev/sdh</code>) at which the block
     *         device is exposed on the instance.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The device name (e.g., <code>/dev/sdh</code>) at which the block
     * device is exposed on the instance.
     *
     * @param deviceName The device name (e.g., <code>/dev/sdh</code>) at which the block
     *         device is exposed on the instance.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The device name (e.g., <code>/dev/sdh</code>) at which the block
     * device is exposed on the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The device name (e.g., <code>/dev/sdh</code>) at which the block
     *         device is exposed on the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceBlockDeviceMappingSpecification withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * The EBS instance block device specification describing the EBS block
     * device to map to the specified device name on a running instance.
     *
     * @return The EBS instance block device specification describing the EBS block
     *         device to map to the specified device name on a running instance.
     */
    public EbsInstanceBlockDeviceSpecification getEbs() {
        return ebs;
    }
    
    /**
     * The EBS instance block device specification describing the EBS block
     * device to map to the specified device name on a running instance.
     *
     * @param ebs The EBS instance block device specification describing the EBS block
     *         device to map to the specified device name on a running instance.
     */
    public void setEbs(EbsInstanceBlockDeviceSpecification ebs) {
        this.ebs = ebs;
    }
    
    /**
     * The EBS instance block device specification describing the EBS block
     * device to map to the specified device name on a running instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs The EBS instance block device specification describing the EBS block
     *         device to map to the specified device name on a running instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceBlockDeviceMappingSpecification withEbs(EbsInstanceBlockDeviceSpecification ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * The virtual device name.
     *
     * @return The virtual device name.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * The virtual device name.
     *
     * @param virtualName The virtual device name.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * The virtual device name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualName The virtual device name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceBlockDeviceMappingSpecification withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * When set to the empty string, specifies that the device name in this
     * object should not be mapped to any real device.
     *
     * @return When set to the empty string, specifies that the device name in this
     *         object should not be mapped to any real device.
     */
    public String getNoDevice() {
        return noDevice;
    }
    
    /**
     * When set to the empty string, specifies that the device name in this
     * object should not be mapped to any real device.
     *
     * @param noDevice When set to the empty string, specifies that the device name in this
     *         object should not be mapped to any real device.
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }
    
    /**
     * When set to the empty string, specifies that the device name in this
     * object should not be mapped to any real device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noDevice When set to the empty string, specifies that the device name in this
     *         object should not be mapped to any real device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceBlockDeviceMappingSpecification withNoDevice(String noDevice) {
        this.noDevice = noDevice;
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
        if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
        if (getEbs() != null) sb.append("Ebs: " + getEbs() + ",");
        if (getVirtualName() != null) sb.append("VirtualName: " + getVirtualName() + ",");
        if (getNoDevice() != null) sb.append("NoDevice: " + getNoDevice() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode()); 
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceBlockDeviceMappingSpecification == false) return false;
        InstanceBlockDeviceMappingSpecification other = (InstanceBlockDeviceMappingSpecification)obj;
        
        if (other.getDeviceName() == null ^ this.getDeviceName() == null) return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false) return false; 
        if (other.getEbs() == null ^ this.getEbs() == null) return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false) return false; 
        if (other.getVirtualName() == null ^ this.getVirtualName() == null) return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false) return false; 
        if (other.getNoDevice() == null ^ this.getNoDevice() == null) return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false) return false; 
        return true;
    }
    
}
    