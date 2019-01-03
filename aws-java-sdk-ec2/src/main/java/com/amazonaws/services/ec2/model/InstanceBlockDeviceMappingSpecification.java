/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a block device mapping entry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceBlockDeviceMappingSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceBlockDeviceMappingSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     * </p>
     */
    private EbsInstanceBlockDeviceSpecification ebs;
    /**
     * <p>
     * suppress the specified device included in the block device mapping.
     * </p>
     */
    private String noDevice;
    /**
     * <p>
     * The virtual device name.
     * </p>
     */
    private String virtualName;

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @param deviceName
     *        The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @return The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @param deviceName
     *        The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMappingSpecification withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters used to automatically set up EBS volumes when the instance is launched.
     */

    public void setEbs(EbsInstanceBlockDeviceSpecification ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     * </p>
     * 
     * @return Parameters used to automatically set up EBS volumes when the instance is launched.
     */

    public EbsInstanceBlockDeviceSpecification getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters used to automatically set up EBS volumes when the instance is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMappingSpecification withEbs(EbsInstanceBlockDeviceSpecification ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * suppress the specified device included in the block device mapping.
     * </p>
     * 
     * @param noDevice
     *        suppress the specified device included in the block device mapping.
     */

    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * suppress the specified device included in the block device mapping.
     * </p>
     * 
     * @return suppress the specified device included in the block device mapping.
     */

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * suppress the specified device included in the block device mapping.
     * </p>
     * 
     * @param noDevice
     *        suppress the specified device included in the block device mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMappingSpecification withNoDevice(String noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * The virtual device name.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The virtual device name.
     * </p>
     * 
     * @return The virtual device name.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The virtual device name.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMappingSpecification withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getEbs() != null)
            sb.append("Ebs: ").append(getEbs()).append(",");
        if (getNoDevice() != null)
            sb.append("NoDevice: ").append(getNoDevice()).append(",");
        if (getVirtualName() != null)
            sb.append("VirtualName: ").append(getVirtualName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceBlockDeviceMappingSpecification == false)
            return false;
        InstanceBlockDeviceMappingSpecification other = (InstanceBlockDeviceMappingSpecification) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        return hashCode;
    }

    @Override
    public InstanceBlockDeviceMappingSpecification clone() {
        try {
            return (InstanceBlockDeviceMappingSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
