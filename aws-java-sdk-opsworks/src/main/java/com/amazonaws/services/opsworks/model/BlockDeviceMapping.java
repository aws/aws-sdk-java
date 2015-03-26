/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a block device mapping. This data type maps directly to the
 * Amazon EC2
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html"> BlockDeviceMapping </a>
 * data type.
 * </p>
 */
public class BlockDeviceMapping implements Serializable, Cloneable {

    /**
     * The device name that is exposed to the instance, such as
     * <code>/dev/sdh</code>. For the root device, you can use the explicit
     * device name or you can set this parameter to <code>ROOT_DEVICE</code>
     * and AWS OpsWorks will provide the correct device name.
     */
    private String deviceName;

    /**
     * Suppresses the specified device included in the AMI's block device
     * mapping.
     */
    private String noDevice;

    /**
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     */
    private String virtualName;

    /**
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     * EBS volume when the instance is launched.
     */
    private EbsBlockDevice ebs;

    /**
     * The device name that is exposed to the instance, such as
     * <code>/dev/sdh</code>. For the root device, you can use the explicit
     * device name or you can set this parameter to <code>ROOT_DEVICE</code>
     * and AWS OpsWorks will provide the correct device name.
     *
     * @return The device name that is exposed to the instance, such as
     *         <code>/dev/sdh</code>. For the root device, you can use the explicit
     *         device name or you can set this parameter to <code>ROOT_DEVICE</code>
     *         and AWS OpsWorks will provide the correct device name.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The device name that is exposed to the instance, such as
     * <code>/dev/sdh</code>. For the root device, you can use the explicit
     * device name or you can set this parameter to <code>ROOT_DEVICE</code>
     * and AWS OpsWorks will provide the correct device name.
     *
     * @param deviceName The device name that is exposed to the instance, such as
     *         <code>/dev/sdh</code>. For the root device, you can use the explicit
     *         device name or you can set this parameter to <code>ROOT_DEVICE</code>
     *         and AWS OpsWorks will provide the correct device name.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The device name that is exposed to the instance, such as
     * <code>/dev/sdh</code>. For the root device, you can use the explicit
     * device name or you can set this parameter to <code>ROOT_DEVICE</code>
     * and AWS OpsWorks will provide the correct device name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The device name that is exposed to the instance, such as
     *         <code>/dev/sdh</code>. For the root device, you can use the explicit
     *         device name or you can set this parameter to <code>ROOT_DEVICE</code>
     *         and AWS OpsWorks will provide the correct device name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Suppresses the specified device included in the AMI's block device
     * mapping.
     *
     * @return Suppresses the specified device included in the AMI's block device
     *         mapping.
     */
    public String getNoDevice() {
        return noDevice;
    }
    
    /**
     * Suppresses the specified device included in the AMI's block device
     * mapping.
     *
     * @param noDevice Suppresses the specified device included in the AMI's block device
     *         mapping.
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }
    
    /**
     * Suppresses the specified device included in the AMI's block device
     * mapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noDevice Suppresses the specified device included in the AMI's block device
     *         mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BlockDeviceMapping withNoDevice(String noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     *
     * @return The virtual device name. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     *
     * @param virtualName The virtual device name. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualName The virtual device name. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     * EBS volume when the instance is launched.
     *
     * @return An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     *         EBS volume when the instance is launched.
     */
    public EbsBlockDevice getEbs() {
        return ebs;
    }
    
    /**
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     * EBS volume when the instance is launched.
     *
     * @param ebs An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     *         EBS volume when the instance is launched.
     */
    public void setEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
    }
    
    /**
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     * EBS volume when the instance is launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs An <code>EBSBlockDevice</code> that defines how to configure an Amazon
     *         EBS volume when the instance is launched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
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
        if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
        if (getNoDevice() != null) sb.append("NoDevice: " + getNoDevice() + ",");
        if (getVirtualName() != null) sb.append("VirtualName: " + getVirtualName() + ",");
        if (getEbs() != null) sb.append("Ebs: " + getEbs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode()); 
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BlockDeviceMapping == false) return false;
        BlockDeviceMapping other = (BlockDeviceMapping)obj;
        
        if (other.getDeviceName() == null ^ this.getDeviceName() == null) return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false) return false; 
        if (other.getNoDevice() == null ^ this.getNoDevice() == null) return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false) return false; 
        if (other.getVirtualName() == null ^ this.getVirtualName() == null) return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false) return false; 
        if (other.getEbs() == null ^ this.getEbs() == null) return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false) return false; 
        return true;
    }
    
    @Override
    public BlockDeviceMapping clone() {
        try {
            return (BlockDeviceMapping) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    