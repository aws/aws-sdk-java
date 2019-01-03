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
 * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume
 * attached to an EC2 instance in the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/VolumeSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the
     * minimum value is 10.
     * </p>
     */
    private Integer sizeInGB;

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     * 
     * @param volumeType
     *        The volume type. Volume types supported are gp2, io1, standard.
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     * 
     * @return The volume type. Volume types supported are gp2, io1, standard.
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     * 
     * @param volumeType
     *        The volume type. Volume types supported are gp2, io1, standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeSpecification withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume supports.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeSpecification withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the
     * minimum value is 10.
     * </p>
     * 
     * @param sizeInGB
     *        The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is
     *        EBS-optimized, the minimum value is 10.
     */

    public void setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the
     * minimum value is 10.
     * </p>
     * 
     * @return The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is
     *         EBS-optimized, the minimum value is 10.
     */

    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the
     * minimum value is 10.
     * </p>
     * 
     * @param sizeInGB
     *        The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is
     *        EBS-optimized, the minimum value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeSpecification withSizeInGB(Integer sizeInGB) {
        setSizeInGB(sizeInGB);
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
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getSizeInGB() != null)
            sb.append("SizeInGB: ").append(getSizeInGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeSpecification == false)
            return false;
        VolumeSpecification other = (VolumeSpecification) obj;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSizeInGB() == null ^ this.getSizeInGB() == null)
            return false;
        if (other.getSizeInGB() != null && other.getSizeInGB().equals(this.getSizeInGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSizeInGB() == null) ? 0 : getSizeInGB().hashCode());
        return hashCode;
    }

    @Override
    public VolumeSpecification clone() {
        try {
            return (VolumeSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.VolumeSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
