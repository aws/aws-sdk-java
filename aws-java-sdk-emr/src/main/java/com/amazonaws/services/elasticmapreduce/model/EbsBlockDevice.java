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
 * Configuration of requested EBS block device associated with the instance group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/EbsBlockDevice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsBlockDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume
     * attached to an EC2 instance in the cluster.
     * </p>
     */
    private VolumeSpecification volumeSpecification;
    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     */
    private String device;

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume
     * attached to an EC2 instance in the cluster.
     * </p>
     * 
     * @param volumeSpecification
     *        EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS
     *        volume attached to an EC2 instance in the cluster.
     */

    public void setVolumeSpecification(VolumeSpecification volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
    }

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume
     * attached to an EC2 instance in the cluster.
     * </p>
     * 
     * @return EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS
     *         volume attached to an EC2 instance in the cluster.
     */

    public VolumeSpecification getVolumeSpecification() {
        return this.volumeSpecification;
    }

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume
     * attached to an EC2 instance in the cluster.
     * </p>
     * 
     * @param volumeSpecification
     *        EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS
     *        volume attached to an EC2 instance in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withVolumeSpecification(VolumeSpecification volumeSpecification) {
        setVolumeSpecification(volumeSpecification);
        return this;
    }

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

    public EbsBlockDevice withDevice(String device) {
        setDevice(device);
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
        if (getVolumeSpecification() != null)
            sb.append("VolumeSpecification: ").append(getVolumeSpecification()).append(",");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDevice == false)
            return false;
        EbsBlockDevice other = (EbsBlockDevice) obj;
        if (other.getVolumeSpecification() == null ^ this.getVolumeSpecification() == null)
            return false;
        if (other.getVolumeSpecification() != null && other.getVolumeSpecification().equals(this.getVolumeSpecification()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeSpecification() == null) ? 0 : getVolumeSpecification().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return hashCode;
    }

    @Override
    public EbsBlockDevice clone() {
        try {
            return (EbsBlockDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.EbsBlockDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
