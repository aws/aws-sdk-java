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
 * Information about a block device mapping for an Amazon Elastic Compute Cloud (Amazon EC2) launch template.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     * </p>
     */
    private AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails ebs;
    /**
     * <p>
     * Omits the device from the block device mapping when an empty string is specified.
     * </p>
     */
    private String noDevice;
    /**
     * <p>
     * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with
     * 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and <code>ephemeral1</code>.
     * The number of available instance store volumes depends on the instance type.
     * </p>
     */
    private String virtualName;

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

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     */

    public void setEbs(AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     * </p>
     * 
     * @return Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        Parameters used to automatically set up Amazon EBS volumes when the instance is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails withEbs(AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Omits the device from the block device mapping when an empty string is specified.
     * </p>
     * 
     * @param noDevice
     *        Omits the device from the block device mapping when an empty string is specified.
     */

    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Omits the device from the block device mapping when an empty string is specified.
     * </p>
     * 
     * @return Omits the device from the block device mapping when an empty string is specified.
     */

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Omits the device from the block device mapping when an empty string is specified.
     * </p>
     * 
     * @param noDevice
     *        Omits the device from the block device mapping when an empty string is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails withNoDevice(String noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with
     * 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and <code>ephemeral1</code>.
     * The number of available instance store volumes depends on the instance type.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance
     *        type with 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and
     *        <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with
     * 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and <code>ephemeral1</code>.
     * The number of available instance store volumes depends on the instance type.
     * </p>
     * 
     * @return The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance
     *         type with 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and
     *         <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with
     * 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and <code>ephemeral1</code>.
     * The number of available instance store volumes depends on the instance type.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance
     *        type with 2 available instance store volumes can specify mappings for <code>ephemeral0</code> and
     *        <code>ephemeral1</code>. The number of available instance store volumes depends on the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails withVirtualName(String virtualName) {
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

        if (obj instanceof AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails == false)
            return false;
        AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails other = (AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails) obj;
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
    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
