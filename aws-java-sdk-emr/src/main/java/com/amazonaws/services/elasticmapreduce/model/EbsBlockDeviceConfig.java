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
 * Configuration of requested EBS block device associated with the instance group with count of volumes that will be
 * associated to every instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/EbsBlockDeviceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsBlockDeviceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume
     * attached to an EC2 instance in the cluster.
     * </p>
     */
    private VolumeSpecification volumeSpecification;
    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the
     * instance group
     * </p>
     */
    private Integer volumesPerInstance;

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

    public EbsBlockDeviceConfig withVolumeSpecification(VolumeSpecification volumeSpecification) {
        setVolumeSpecification(volumeSpecification);
        return this;
    }

    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the
     * instance group
     * </p>
     * 
     * @param volumesPerInstance
     *        Number of EBS volumes with a specific volume configuration that will be associated with every instance in
     *        the instance group
     */

    public void setVolumesPerInstance(Integer volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
    }

    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the
     * instance group
     * </p>
     * 
     * @return Number of EBS volumes with a specific volume configuration that will be associated with every instance in
     *         the instance group
     */

    public Integer getVolumesPerInstance() {
        return this.volumesPerInstance;
    }

    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the
     * instance group
     * </p>
     * 
     * @param volumesPerInstance
     *        Number of EBS volumes with a specific volume configuration that will be associated with every instance in
     *        the instance group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDeviceConfig withVolumesPerInstance(Integer volumesPerInstance) {
        setVolumesPerInstance(volumesPerInstance);
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
        if (getVolumesPerInstance() != null)
            sb.append("VolumesPerInstance: ").append(getVolumesPerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDeviceConfig == false)
            return false;
        EbsBlockDeviceConfig other = (EbsBlockDeviceConfig) obj;
        if (other.getVolumeSpecification() == null ^ this.getVolumeSpecification() == null)
            return false;
        if (other.getVolumeSpecification() != null && other.getVolumeSpecification().equals(this.getVolumeSpecification()) == false)
            return false;
        if (other.getVolumesPerInstance() == null ^ this.getVolumesPerInstance() == null)
            return false;
        if (other.getVolumesPerInstance() != null && other.getVolumesPerInstance().equals(this.getVolumesPerInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeSpecification() == null) ? 0 : getVolumeSpecification().hashCode());
        hashCode = prime * hashCode + ((getVolumesPerInstance() == null) ? 0 : getVolumesPerInstance().hashCode());
        return hashCode;
    }

    @Override
    public EbsBlockDeviceConfig clone() {
        try {
            return (EbsBlockDeviceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.EbsBlockDeviceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
