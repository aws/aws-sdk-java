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
 * Block Device Mapping
 */
public class BlockDeviceMapping {
        
    private String virtualName;

    private String deviceName;

    private EbsBlockDevice ebs;

    private String noDevice;

    /**
     * Returns the value of the VirtualName property for this object.
     *
     * @return The value of the VirtualName property for this object.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * Sets the value of the VirtualName property for this object.
     *
     * @param virtualName The new value for the VirtualName property for this object.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * Sets the value of the VirtualName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualName The new value for the VirtualName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }
    
    
    /**
     * Returns the value of the DeviceName property for this object.
     *
     * @return The value of the DeviceName property for this object.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * Sets the value of the DeviceName property for this object.
     *
     * @param deviceName The new value for the DeviceName property for this object.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * Sets the value of the DeviceName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The new value for the DeviceName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    
    
    /**
     * Returns the value of the Ebs property for this object.
     *
     * @return The value of the Ebs property for this object.
     */
    public EbsBlockDevice getEbs() {
        return ebs;
    }
    
    /**
     * Sets the value of the Ebs property for this object.
     *
     * @param ebs The new value for the Ebs property for this object.
     */
    public void setEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
    }
    
    /**
     * Sets the value of the Ebs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs The new value for the Ebs property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
        return this;
    }
    
    
    /**
     * Returns the value of the NoDevice property for this object.
     *
     * @return The value of the NoDevice property for this object.
     */
    public String getNoDevice() {
        return noDevice;
    }
    
    /**
     * Sets the value of the NoDevice property for this object.
     *
     * @param noDevice The new value for the NoDevice property for this object.
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }
    
    /**
     * Sets the value of the NoDevice property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noDevice The new value for the NoDevice property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withNoDevice(String noDevice) {
        this.noDevice = noDevice;
        return this;
    }
    
    
}
    