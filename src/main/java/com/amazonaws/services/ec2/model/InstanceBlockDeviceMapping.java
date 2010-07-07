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
 * Describes how block devices are mapped on an Amazon EC2 instance.
 * </p>
 */
public class InstanceBlockDeviceMapping {

    /**
     * The device name (e.g., /dev/sdh) at which the block device is exposed
     * on the instance.
     */
    private String deviceName;

    /**
     * The optional EBS device mapped to the specified device name.
     */
    private EbsInstanceBlockDevice ebs;

    /**
     * The device name (e.g., /dev/sdh) at which the block device is exposed
     * on the instance.
     *
     * @return The device name (e.g., /dev/sdh) at which the block device is exposed
     *         on the instance.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The device name (e.g., /dev/sdh) at which the block device is exposed
     * on the instance.
     *
     * @param deviceName The device name (e.g., /dev/sdh) at which the block device is exposed
     *         on the instance.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The device name (e.g., /dev/sdh) at which the block device is exposed
     * on the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The device name (e.g., /dev/sdh) at which the block device is exposed
     *         on the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceBlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    
    
    /**
     * The optional EBS device mapped to the specified device name.
     *
     * @return The optional EBS device mapped to the specified device name.
     */
    public EbsInstanceBlockDevice getEbs() {
        return ebs;
    }
    
    /**
     * The optional EBS device mapped to the specified device name.
     *
     * @param ebs The optional EBS device mapped to the specified device name.
     */
    public void setEbs(EbsInstanceBlockDevice ebs) {
        this.ebs = ebs;
    }
    
    /**
     * The optional EBS device mapped to the specified device name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs The optional EBS device mapped to the specified device name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceBlockDeviceMapping withEbs(EbsInstanceBlockDevice ebs) {
        this.ebs = ebs;
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
        sb.append("DeviceName: " + deviceName + ", ");
        sb.append("Ebs: " + ebs + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    