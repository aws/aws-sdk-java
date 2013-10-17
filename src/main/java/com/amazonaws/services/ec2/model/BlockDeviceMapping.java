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
 * The BlockDeviceMappingItemType data type.
 * </p>
 */
public class BlockDeviceMapping implements Serializable {

    /**
     * Specifies the virtual device name.
     */
    private String virtualName;

    /**
     * Specifies the device name (e.g., <code>/dev/sdh</code>).
     */
    private String deviceName;

    /**
     * Specifies parameters used to automatically setup Amazon EBS volumes
     * when the instance is launched.
     */
    private EbsBlockDevice ebs;

    /**
     * Specifies the device name to suppress during instance launch.
     */
    private String noDevice;

    /**
     * Specifies the virtual device name.
     *
     * @return Specifies the virtual device name.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * Specifies the virtual device name.
     *
     * @param virtualName Specifies the virtual device name.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * Specifies the virtual device name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualName Specifies the virtual device name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * Specifies the device name (e.g., <code>/dev/sdh</code>).
     *
     * @return Specifies the device name (e.g., <code>/dev/sdh</code>).
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * Specifies the device name (e.g., <code>/dev/sdh</code>).
     *
     * @param deviceName Specifies the device name (e.g., <code>/dev/sdh</code>).
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * Specifies the device name (e.g., <code>/dev/sdh</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName Specifies the device name (e.g., <code>/dev/sdh</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Specifies parameters used to automatically setup Amazon EBS volumes
     * when the instance is launched.
     *
     * @return Specifies parameters used to automatically setup Amazon EBS volumes
     *         when the instance is launched.
     */
    public EbsBlockDevice getEbs() {
        return ebs;
    }
    
    /**
     * Specifies parameters used to automatically setup Amazon EBS volumes
     * when the instance is launched.
     *
     * @param ebs Specifies parameters used to automatically setup Amazon EBS volumes
     *         when the instance is launched.
     */
    public void setEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
    }
    
    /**
     * Specifies parameters used to automatically setup Amazon EBS volumes
     * when the instance is launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs Specifies parameters used to automatically setup Amazon EBS volumes
     *         when the instance is launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * Specifies the device name to suppress during instance launch.
     *
     * @return Specifies the device name to suppress during instance launch.
     */
    public String getNoDevice() {
        return noDevice;
    }
    
    /**
     * Specifies the device name to suppress during instance launch.
     *
     * @param noDevice Specifies the device name to suppress during instance launch.
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }
    
    /**
     * Specifies the device name to suppress during instance launch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noDevice Specifies the device name to suppress during instance launch.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withNoDevice(String noDevice) {
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
        if (getVirtualName() != null) sb.append("VirtualName: " + getVirtualName() + ",");
        if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
        if (getEbs() != null) sb.append("Ebs: " + getEbs() + ",");
        if (getNoDevice() != null) sb.append("NoDevice: " + getNoDevice() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode()); 
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BlockDeviceMapping == false) return false;
        BlockDeviceMapping other = (BlockDeviceMapping)obj;
        
        if (other.getVirtualName() == null ^ this.getVirtualName() == null) return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false) return false; 
        if (other.getDeviceName() == null ^ this.getDeviceName() == null) return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false) return false; 
        if (other.getEbs() == null ^ this.getEbs() == null) return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false) return false; 
        if (other.getNoDevice() == null ^ this.getNoDevice() == null) return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false) return false; 
        return true;
    }
    
}
    