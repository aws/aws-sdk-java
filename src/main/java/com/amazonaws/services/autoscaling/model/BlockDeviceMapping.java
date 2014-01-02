/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>BlockDeviceMapping</code> data type.
 * </p>
 */
public class BlockDeviceMapping implements Serializable {

    /**
     * The virtual name associated with the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String virtualName;

    /**
     * The name of the device within Amazon EC2 (for example, /dev/sdh or
     * xvdh).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String deviceName;

    /**
     * The Elastic Block Storage volume information.
     */
    private Ebs ebs;

    /**
     * Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     * to <code>true</code> for the root device, the instance might fail the
     * EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.</note>
     */
    private Boolean noDevice;

    /**
     * The virtual name associated with the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The virtual name associated with the device.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * The virtual name associated with the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param virtualName The virtual name associated with the device.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * The virtual name associated with the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param virtualName The virtual name associated with the device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * The name of the device within Amazon EC2 (for example, /dev/sdh or
     * xvdh).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the device within Amazon EC2 (for example, /dev/sdh or
     *         xvdh).
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The name of the device within Amazon EC2 (for example, /dev/sdh or
     * xvdh).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param deviceName The name of the device within Amazon EC2 (for example, /dev/sdh or
     *         xvdh).
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The name of the device within Amazon EC2 (for example, /dev/sdh or
     * xvdh).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param deviceName The name of the device within Amazon EC2 (for example, /dev/sdh or
     *         xvdh).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * The Elastic Block Storage volume information.
     *
     * @return The Elastic Block Storage volume information.
     */
    public Ebs getEbs() {
        return ebs;
    }
    
    /**
     * The Elastic Block Storage volume information.
     *
     * @param ebs The Elastic Block Storage volume information.
     */
    public void setEbs(Ebs ebs) {
        this.ebs = ebs;
    }
    
    /**
     * The Elastic Block Storage volume information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs The Elastic Block Storage volume information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withEbs(Ebs ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     * to <code>true</code> for the root device, the instance might fail the
     * EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.</note>
     *
     * @return Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     *         to <code>true</code> for the root device, the instance might fail the
     *         EC2 health check. Auto Scaling launches a replacement instance if the
     *         instance fails the health check.</note>
     */
    public Boolean isNoDevice() {
        return noDevice;
    }
    
    /**
     * Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     * to <code>true</code> for the root device, the instance might fail the
     * EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.</note>
     *
     * @param noDevice Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     *         to <code>true</code> for the root device, the instance might fail the
     *         EC2 health check. Auto Scaling launches a replacement instance if the
     *         instance fails the health check.</note>
     */
    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }
    
    /**
     * Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     * to <code>true</code> for the root device, the instance might fail the
     * EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noDevice Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     *         to <code>true</code> for the root device, the instance might fail the
     *         EC2 health check. Auto Scaling launches a replacement instance if the
     *         instance fails the health check.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BlockDeviceMapping withNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
        return this;
    }

    /**
     * Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     * to <code>true</code> for the root device, the instance might fail the
     * EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.</note>
     *
     * @return Suppresses the device mapping. <note>If <code>NoDevice</code> is set
     *         to <code>true</code> for the root device, the instance might fail the
     *         EC2 health check. Auto Scaling launches a replacement instance if the
     *         instance fails the health check.</note>
     */
    public Boolean getNoDevice() {
        return noDevice;
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
        if (isNoDevice() != null) sb.append("NoDevice: " + isNoDevice() );
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
        hashCode = prime * hashCode + ((isNoDevice() == null) ? 0 : isNoDevice().hashCode()); 
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
        if (other.isNoDevice() == null ^ this.isNoDevice() == null) return false;
        if (other.isNoDevice() != null && other.isNoDevice().equals(this.isNoDevice()) == false) return false; 
        return true;
    }
    
}
    