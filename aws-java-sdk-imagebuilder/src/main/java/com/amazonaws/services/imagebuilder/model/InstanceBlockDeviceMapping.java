/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines block device mappings for the instance used to configure your image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/InstanceBlockDeviceMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceBlockDeviceMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     */
    private EbsInstanceBlockDeviceSpecification ebs;
    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     */
    private String virtualName;
    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     */
    private String noDevice;

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * 
     * @param deviceName
     *        The device to which these mappings apply.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * 
     * @return The device to which these mappings apply.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * 
     * @param deviceName
     *        The device to which these mappings apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     * 
     * @param ebs
     *        Use to manage Amazon EBS-specific configuration for this mapping.
     */

    public void setEbs(EbsInstanceBlockDeviceSpecification ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     * 
     * @return Use to manage Amazon EBS-specific configuration for this mapping.
     */

    public EbsInstanceBlockDeviceSpecification getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     * 
     * @param ebs
     *        Use to manage Amazon EBS-specific configuration for this mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMapping withEbs(EbsInstanceBlockDeviceSpecification ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * 
     * @param virtualName
     *        Use to manage instance ephemeral devices.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * 
     * @return Use to manage instance ephemeral devices.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * 
     * @param virtualName
     *        Use to manage instance ephemeral devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMapping withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * 
     * @param noDevice
     *        Use to remove a mapping from the parent image.
     */

    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * 
     * @return Use to remove a mapping from the parent image.
     */

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * 
     * @param noDevice
     *        Use to remove a mapping from the parent image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMapping withNoDevice(String noDevice) {
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
        if (getEbs() != null)
            sb.append("Ebs: ").append(getEbs()).append(",");
        if (getVirtualName() != null)
            sb.append("VirtualName: ").append(getVirtualName()).append(",");
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

        if (obj instanceof InstanceBlockDeviceMapping == false)
            return false;
        InstanceBlockDeviceMapping other = (InstanceBlockDeviceMapping) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false)
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
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        return hashCode;
    }

    @Override
    public InstanceBlockDeviceMapping clone() {
        try {
            return (InstanceBlockDeviceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.InstanceBlockDeviceMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
