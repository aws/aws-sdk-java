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
 * Describes a block device mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateBlockDeviceMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateBlockDeviceMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The virtual device name (ephemeralN).
     * </p>
     */
    private String virtualName;
    /**
     * <p>
     * Information about the block device for an EBS volume.
     * </p>
     */
    private LaunchTemplateEbsBlockDevice ebs;
    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of the AMI.
     * </p>
     */
    private String noDevice;

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param deviceName
     *        The device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @return The device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param deviceName
     *        The device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateBlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The virtual device name (ephemeralN).
     * </p>
     * 
     * @param virtualName
     *        The virtual device name (ephemeralN).
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The virtual device name (ephemeralN).
     * </p>
     * 
     * @return The virtual device name (ephemeralN).
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The virtual device name (ephemeralN).
     * </p>
     * 
     * @param virtualName
     *        The virtual device name (ephemeralN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateBlockDeviceMapping withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * <p>
     * Information about the block device for an EBS volume.
     * </p>
     * 
     * @param ebs
     *        Information about the block device for an EBS volume.
     */

    public void setEbs(LaunchTemplateEbsBlockDevice ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Information about the block device for an EBS volume.
     * </p>
     * 
     * @return Information about the block device for an EBS volume.
     */

    public LaunchTemplateEbsBlockDevice getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Information about the block device for an EBS volume.
     * </p>
     * 
     * @param ebs
     *        Information about the block device for an EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateBlockDeviceMapping withEbs(LaunchTemplateEbsBlockDevice ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of the AMI.
     * </p>
     * 
     * @param noDevice
     *        Suppresses the specified device included in the block device mapping of the AMI.
     */

    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of the AMI.
     * </p>
     * 
     * @return Suppresses the specified device included in the block device mapping of the AMI.
     */

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of the AMI.
     * </p>
     * 
     * @param noDevice
     *        Suppresses the specified device included in the block device mapping of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateBlockDeviceMapping withNoDevice(String noDevice) {
        setNoDevice(noDevice);
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
        if (getVirtualName() != null)
            sb.append("VirtualName: ").append(getVirtualName()).append(",");
        if (getEbs() != null)
            sb.append("Ebs: ").append(getEbs()).append(",");
        if (getNoDevice() != null)
            sb.append("NoDevice: ").append(getNoDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateBlockDeviceMapping == false)
            return false;
        LaunchTemplateBlockDeviceMapping other = (LaunchTemplateBlockDeviceMapping) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateBlockDeviceMapping clone() {
        try {
            return (LaunchTemplateBlockDeviceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
