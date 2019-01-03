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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * EBS block device that's attached to an EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/EbsVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     */
    private String device;
    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     * 
     * @param device
     *        The device name that is exposed to the instance, such as /dev/sdh.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     * 
     * @return The device name that is exposed to the instance, such as /dev/sdh.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     * 
     * @param device
     *        The device name that is exposed to the instance, such as /dev/sdh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolume withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     * 
     * @param volumeId
     *        The volume identifier of the EBS volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     * 
     * @return The volume identifier of the EBS volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     * 
     * @param volumeId
     *        The volume identifier of the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
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
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsVolume == false)
            return false;
        EbsVolume other = (EbsVolume) obj;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public EbsVolume clone() {
        try {
            return (EbsVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.EbsVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
