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
 * Describes a block device mapping for a Scheduled Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstancesBlockDeviceMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstancesBlockDeviceMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Parameters used to set up EBS volumes automatically when the instance is launched.
     * </p>
     */
    private ScheduledInstancesEbs ebs;
    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of the AMI.
     * </p>
     */
    private String noDevice;
    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0. An
     * instance type with two available instance store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type. After you
     * connect to the instance, you must mount the volume.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the
     * instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device
     * mapping for the AMI.
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

    public ScheduledInstancesBlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Parameters used to set up EBS volumes automatically when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters used to set up EBS volumes automatically when the instance is launched.
     */

    public void setEbs(ScheduledInstancesEbs ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to set up EBS volumes automatically when the instance is launched.
     * </p>
     * 
     * @return Parameters used to set up EBS volumes automatically when the instance is launched.
     */

    public ScheduledInstancesEbs getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Parameters used to set up EBS volumes automatically when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters used to set up EBS volumes automatically when the instance is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesBlockDeviceMapping withEbs(ScheduledInstancesEbs ebs) {
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

    public ScheduledInstancesBlockDeviceMapping withNoDevice(String noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0. An
     * instance type with two available instance store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type. After you
     * connect to the instance, you must mount the volume.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the
     * instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device
     * mapping for the AMI.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0. An
     *        instance type with two available instance store volumes can specify mappings for <code>ephemeral0</code>
     *        and <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type.
     *        After you connect to the instance, you must mount the volume.</p>
     *        <p>
     *        Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the
     *        instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block
     *        device mapping for the AMI.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0. An
     * instance type with two available instance store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type. After you
     * connect to the instance, you must mount the volume.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the
     * instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device
     * mapping for the AMI.
     * </p>
     * 
     * @return The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0.
     *         An instance type with two available instance store volumes can specify mappings for
     *         <code>ephemeral0</code> and <code>ephemeral1</code>. The number of available instance store volumes
     *         depends on the instance type. After you connect to the instance, you must mount the volume.</p>
     *         <p>
     *         Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for
     *         the instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block
     *         device mapping for the AMI.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0. An
     * instance type with two available instance store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type. After you
     * connect to the instance, you must mount the volume.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the
     * instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device
     * mapping for the AMI.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name (<code>ephemeral</code>N). Instance store volumes are numbered starting from 0. An
     *        instance type with two available instance store volumes can specify mappings for <code>ephemeral0</code>
     *        and <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type.
     *        After you connect to the instance, you must mount the volume.</p>
     *        <p>
     *        Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the
     *        instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block
     *        device mapping for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesBlockDeviceMapping withVirtualName(String virtualName) {
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

        if (obj instanceof ScheduledInstancesBlockDeviceMapping == false)
            return false;
        ScheduledInstancesBlockDeviceMapping other = (ScheduledInstancesBlockDeviceMapping) obj;
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
    public ScheduledInstancesBlockDeviceMapping clone() {
        try {
            return (ScheduledInstancesBlockDeviceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
