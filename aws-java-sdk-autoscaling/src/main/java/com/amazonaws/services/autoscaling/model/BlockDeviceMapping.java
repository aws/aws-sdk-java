/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     */
    private String virtualName;
    /**
     * <p>
     * The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming
     * on Linux Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     */
    private Ebs ebs;
    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     * </p>
     */
    private Boolean noDevice;

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @param virtualName
     *        The name of the virtual device (for example, <code>ephemeral0</code>).</p>
     *        <p>
     *        You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @return The name of the virtual device (for example, <code>ephemeral0</code>).</p>
     *         <p>
     *         You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @param virtualName
     *        The name of the virtual device (for example, <code>ephemeral0</code>).</p>
     *        <p>
     *        You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming
     * on Linux Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param deviceName
     *        The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming on Linux
     *        Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming
     * on Linux Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming on Linux
     *         Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming
     * on Linux Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param deviceName
     *        The device name exposed to the EC2 instance (for example, <code>/dev/sdh</code> or <code>xvdh</code>). For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html">Device Naming on Linux
     *        Instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @param ebs
     *        Parameters used to automatically set up EBS volumes when an instance is launched.</p>
     *        <p>
     *        You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     */

    public void setEbs(Ebs ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @return Parameters used to automatically set up EBS volumes when an instance is launched.</p>
     *         <p>
     *         You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     */

    public Ebs getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * </p>
     * <p>
     * You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @param ebs
     *        Parameters used to automatically set up EBS volumes when an instance is launched.</p>
     *        <p>
     *        You can specify either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withEbs(Ebs ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     * </p>
     * 
     * @param noDevice
     *        Setting this value to <code>true</code> suppresses the specified device included in the block device
     *        mapping of the AMI.</p>
     *        <p>
     *        If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *        check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     *        </p>
     *        <p>
     *        If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     */

    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     * </p>
     * 
     * @return Setting this value to <code>true</code> suppresses the specified device included in the block device
     *         mapping of the AMI.</p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *         check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     *         </p>
     *         <p>
     *         If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     */

    public Boolean getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     * </p>
     * 
     * @param noDevice
     *        Setting this value to <code>true</code> suppresses the specified device included in the block device
     *        mapping of the AMI.</p>
     *        <p>
     *        If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *        check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     *        </p>
     *        <p>
     *        If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withNoDevice(Boolean noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * Setting this value to <code>true</code> suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     * </p>
     * <p>
     * If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
     * </p>
     * 
     * @return Setting this value to <code>true</code> suppresses the specified device included in the block device
     *         mapping of the AMI.</p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code> for the root device, instances might fail the EC2 health
     *         check. In that case, Amazon EC2 Auto Scaling launches replacement instances.
     *         </p>
     *         <p>
     *         If you specify <code>NoDevice</code>, you cannot specify <code>Ebs</code>.
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
