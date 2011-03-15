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
 * The BlockDeviceMappingItemType data type.
 * </p>
 */
public class BlockDeviceMapping {

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
        sb.append("VirtualName: " + virtualName + ", ");
        sb.append("DeviceName: " + deviceName + ", ");
        sb.append("Ebs: " + ebs + ", ");
        sb.append("NoDevice: " + noDevice + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    