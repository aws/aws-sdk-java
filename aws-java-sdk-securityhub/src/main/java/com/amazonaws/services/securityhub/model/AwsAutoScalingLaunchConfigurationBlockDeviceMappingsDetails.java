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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A block device for the instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or <code>xvdh</code>.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     * </p>
     */
    private AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails ebs;
    /**
     * <p>
     * Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     * </p>
     */
    private Boolean noDevice;
    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     */
    private String virtualName;

    /**
     * <p>
     * The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or <code>xvdh</code>.
     * </p>
     * 
     * @param deviceName
     *        The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or
     *        <code>xvdh</code>.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or <code>xvdh</code>.
     * </p>
     * 
     * @return The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or
     *         <code>xvdh</code>.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or <code>xvdh</code>.
     * </p>
     * 
     * @param deviceName
     *        The device name that is exposed to the EC2 instance. For example, <code>/dev/sdh</code> or
     *        <code>xvdh</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     */

    public void setEbs(AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     * </p>
     * 
     * @return Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails withEbs(AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     * </p>
     * 
     * @param noDevice
     *        Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image
     *        (AMI).</p>
     *        <p>
     *        If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     */

    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     * </p>
     * 
     * @return Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image
     *         (AMI).</p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     */

    public Boolean getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     * </p>
     * 
     * @param noDevice
     *        Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image
     *        (AMI).</p>
     *        <p>
     *        If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails withNoDevice(Boolean noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     * </p>
     * 
     * @return Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image
     *         (AMI).</p>
     *         <p>
     *         If <code>NoDevice</code> is <code>true</code>, then you cannot specify <code>Ebs</code>.&gt;
     */

    public Boolean isNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @param virtualName
     *        The name of the virtual device (for example, <code>ephemeral0</code>).</p>
     *        <p>
     *        You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @return The name of the virtual device (for example, <code>ephemeral0</code>).</p>
     *         <p>
     *         You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * <p>
     * You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * </p>
     * 
     * @param virtualName
     *        The name of the virtual device (for example, <code>ephemeral0</code>).</p>
     *        <p>
     *        You can provide either <code>VirtualName</code> or <code>Ebs</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails withVirtualName(String virtualName) {
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

        if (obj instanceof AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails == false)
            return false;
        AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails other = (AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails) obj;
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
    public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails clone() {
        try {
            return (AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
