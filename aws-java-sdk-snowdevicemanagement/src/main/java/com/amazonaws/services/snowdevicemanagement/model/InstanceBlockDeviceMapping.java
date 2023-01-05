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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of a block device mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/InstanceBlockDeviceMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceBlockDeviceMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The block device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the instance is
     * launched.
     * </p>
     */
    private EbsInstanceBlockDevice ebs;

    /**
     * <p>
     * The block device name.
     * </p>
     * 
     * @param deviceName
     *        The block device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The block device name.
     * </p>
     * 
     * @return The block device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The block device name.
     * </p>
     * 
     * @param deviceName
     *        The block device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the instance is
     * launched.
     * </p>
     * 
     * @param ebs
     *        The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the
     *        instance is launched.
     */

    public void setEbs(EbsInstanceBlockDevice ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the instance is
     * launched.
     * </p>
     * 
     * @return The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the
     *         instance is launched.
     */

    public EbsInstanceBlockDevice getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the instance is
     * launched.
     * </p>
     * 
     * @param ebs
     *        The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the
     *        instance is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceBlockDeviceMapping withEbs(EbsInstanceBlockDevice ebs) {
        setEbs(ebs);
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
            sb.append("Ebs: ").append(getEbs());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
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
        com.amazonaws.services.snowdevicemanagement.model.transform.InstanceBlockDeviceMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
