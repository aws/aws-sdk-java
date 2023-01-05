/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a block device mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BlockDeviceMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockDeviceMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance store volume (virtual device) to attach to an instance at launch. The name must be in
     * the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     * <code>ephemeral0</code>.
     * </p>
     */
    private String virtualName;
    /**
     * <p>
     * The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device naming
     * on Linux instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * To define a block device mapping, set the device name and exactly one of the following properties:
     * <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     * </p>
     * </note>
     */
    private String deviceName;
    /**
     * <p>
     * Information to attach an EBS volume to an instance at launch.
     * </p>
     */
    private Ebs ebs;
    /**
     * <p>
     * Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of the AMI
     * from being mapped to the specified device name at launch.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     */
    private Boolean noDevice;

    /**
     * <p>
     * The name of the instance store volume (virtual device) to attach to an instance at launch. The name must be in
     * the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     * <code>ephemeral0</code>.
     * </p>
     * 
     * @param virtualName
     *        The name of the instance store volume (virtual device) to attach to an instance at launch. The name must
     *        be in the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     *        <code>ephemeral0</code>.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The name of the instance store volume (virtual device) to attach to an instance at launch. The name must be in
     * the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     * <code>ephemeral0</code>.
     * </p>
     * 
     * @return The name of the instance store volume (virtual device) to attach to an instance at launch. The name must
     *         be in the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     *         <code>ephemeral0</code>.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The name of the instance store volume (virtual device) to attach to an instance at launch. The name must be in
     * the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     * <code>ephemeral0</code>.
     * </p>
     * 
     * @param virtualName
     *        The name of the instance store volume (virtual device) to attach to an instance at launch. The name must
     *        be in the form ephemeral<i>X</i> where <i>X</i> is a number starting from zero (0), for example,
     *        <code>ephemeral0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * <p>
     * The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device naming
     * on Linux instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * To define a block device mapping, set the device name and exactly one of the following properties:
     * <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     * </p>
     * </note>
     * 
     * @param deviceName
     *        The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device
     *        naming on Linux instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p> <note>
     *        <p>
     *        To define a block device mapping, set the device name and exactly one of the following properties:
     *        <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     *        </p>
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device naming
     * on Linux instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * To define a block device mapping, set the device name and exactly one of the following properties:
     * <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     * </p>
     * </note>
     * 
     * @return The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device naming on Linux
     *         instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p> <note>
     *         <p>
     *         To define a block device mapping, set the device name and exactly one of the following properties:
     *         <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     *         </p>
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device naming
     * on Linux instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * To define a block device mapping, set the device name and exactly one of the following properties:
     * <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     * </p>
     * </note>
     * 
     * @param deviceName
     *        The device name assigned to the volume (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device
     *        naming on Linux instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p> <note>
     *        <p>
     *        To define a block device mapping, set the device name and exactly one of the following properties:
     *        <code>Ebs</code>, <code>NoDevice</code>, or <code>VirtualName</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Information to attach an EBS volume to an instance at launch.
     * </p>
     * 
     * @param ebs
     *        Information to attach an EBS volume to an instance at launch.
     */

    public void setEbs(Ebs ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Information to attach an EBS volume to an instance at launch.
     * </p>
     * 
     * @return Information to attach an EBS volume to an instance at launch.
     */

    public Ebs getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Information to attach an EBS volume to an instance at launch.
     * </p>
     * 
     * @param ebs
     *        Information to attach an EBS volume to an instance at launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withEbs(Ebs ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of the AMI
     * from being mapped to the specified device name at launch.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * 
     * @param noDevice
     *        Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of
     *        the AMI from being mapped to the specified device name at launch.</p>
     *        <p>
     *        If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *        check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     */

    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of the AMI
     * from being mapped to the specified device name at launch.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * 
     * @return Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of
     *         the AMI from being mapped to the specified device name at launch.</p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *         check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     */

    public Boolean getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of the AMI
     * from being mapped to the specified device name at launch.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * 
     * @param noDevice
     *        Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of
     *        the AMI from being mapped to the specified device name at launch.</p>
     *        <p>
     *        If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *        check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withNoDevice(Boolean noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of the AMI
     * from being mapped to the specified device name at launch.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * 
     * @return Setting this value to <code>true</code> prevents a volume that is included in the block device mapping of
     *         the AMI from being mapped to the specified device name at launch.</p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *         check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     */

    public Boolean isNoDevice() {
        return this.noDevice;
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
        if (getVirtualName() != null)
            sb.append("VirtualName: ").append(getVirtualName()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
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

        if (obj instanceof BlockDeviceMapping == false)
            return false;
        BlockDeviceMapping other = (BlockDeviceMapping) obj;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
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
        return true;
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
    public BlockDeviceMapping clone() {
        try {
            return (BlockDeviceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
