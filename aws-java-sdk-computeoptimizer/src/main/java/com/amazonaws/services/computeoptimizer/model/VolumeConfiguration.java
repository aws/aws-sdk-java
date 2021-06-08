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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of an Amazon Elastic Block Store (Amazon EBS) volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/VolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for Provisioned IOPS
     * SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The baseline IOPS of the volume.
     * </p>
     */
    private Integer volumeBaselineIOPS;
    /**
     * <p>
     * The burst IOPS of the volume.
     * </p>
     */
    private Integer volumeBurstIOPS;
    /**
     * <p>
     * The baseline throughput of the volume.
     * </p>
     */
    private Integer volumeBaselineThroughput;
    /**
     * <p>
     * The burst throughput of the volume.
     * </p>
     */
    private Integer volumeBurstThroughput;

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for Provisioned IOPS
     * SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @param volumeType
     *        The volume type.</p>
     *        <p>
     *        This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for Provisioned IOPS
     * SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @return The volume type.</p>
     *         <p>
     *         This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for
     *         Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *         <code>standard</code> for Magnetic volumes.
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for Provisioned IOPS
     * SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or <code>standard</code> for
     * Magnetic volumes.
     * </p>
     * 
     * @param volumeType
     *        The volume type.</p>
     *        <p>
     *        This can be <code>gp2</code> for General Purpose SSD, <code>io1</code> or <code>io2</code> for Provisioned
     *        IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for Cold HDD, or
     *        <code>standard</code> for Magnetic volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @return The size of the volume, in GiB.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The baseline IOPS of the volume.
     * </p>
     * 
     * @param volumeBaselineIOPS
     *        The baseline IOPS of the volume.
     */

    public void setVolumeBaselineIOPS(Integer volumeBaselineIOPS) {
        this.volumeBaselineIOPS = volumeBaselineIOPS;
    }

    /**
     * <p>
     * The baseline IOPS of the volume.
     * </p>
     * 
     * @return The baseline IOPS of the volume.
     */

    public Integer getVolumeBaselineIOPS() {
        return this.volumeBaselineIOPS;
    }

    /**
     * <p>
     * The baseline IOPS of the volume.
     * </p>
     * 
     * @param volumeBaselineIOPS
     *        The baseline IOPS of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeBaselineIOPS(Integer volumeBaselineIOPS) {
        setVolumeBaselineIOPS(volumeBaselineIOPS);
        return this;
    }

    /**
     * <p>
     * The burst IOPS of the volume.
     * </p>
     * 
     * @param volumeBurstIOPS
     *        The burst IOPS of the volume.
     */

    public void setVolumeBurstIOPS(Integer volumeBurstIOPS) {
        this.volumeBurstIOPS = volumeBurstIOPS;
    }

    /**
     * <p>
     * The burst IOPS of the volume.
     * </p>
     * 
     * @return The burst IOPS of the volume.
     */

    public Integer getVolumeBurstIOPS() {
        return this.volumeBurstIOPS;
    }

    /**
     * <p>
     * The burst IOPS of the volume.
     * </p>
     * 
     * @param volumeBurstIOPS
     *        The burst IOPS of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeBurstIOPS(Integer volumeBurstIOPS) {
        setVolumeBurstIOPS(volumeBurstIOPS);
        return this;
    }

    /**
     * <p>
     * The baseline throughput of the volume.
     * </p>
     * 
     * @param volumeBaselineThroughput
     *        The baseline throughput of the volume.
     */

    public void setVolumeBaselineThroughput(Integer volumeBaselineThroughput) {
        this.volumeBaselineThroughput = volumeBaselineThroughput;
    }

    /**
     * <p>
     * The baseline throughput of the volume.
     * </p>
     * 
     * @return The baseline throughput of the volume.
     */

    public Integer getVolumeBaselineThroughput() {
        return this.volumeBaselineThroughput;
    }

    /**
     * <p>
     * The baseline throughput of the volume.
     * </p>
     * 
     * @param volumeBaselineThroughput
     *        The baseline throughput of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeBaselineThroughput(Integer volumeBaselineThroughput) {
        setVolumeBaselineThroughput(volumeBaselineThroughput);
        return this;
    }

    /**
     * <p>
     * The burst throughput of the volume.
     * </p>
     * 
     * @param volumeBurstThroughput
     *        The burst throughput of the volume.
     */

    public void setVolumeBurstThroughput(Integer volumeBurstThroughput) {
        this.volumeBurstThroughput = volumeBurstThroughput;
    }

    /**
     * <p>
     * The burst throughput of the volume.
     * </p>
     * 
     * @return The burst throughput of the volume.
     */

    public Integer getVolumeBurstThroughput() {
        return this.volumeBurstThroughput;
    }

    /**
     * <p>
     * The burst throughput of the volume.
     * </p>
     * 
     * @param volumeBurstThroughput
     *        The burst throughput of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withVolumeBurstThroughput(Integer volumeBurstThroughput) {
        setVolumeBurstThroughput(volumeBurstThroughput);
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
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getVolumeBaselineIOPS() != null)
            sb.append("VolumeBaselineIOPS: ").append(getVolumeBaselineIOPS()).append(",");
        if (getVolumeBurstIOPS() != null)
            sb.append("VolumeBurstIOPS: ").append(getVolumeBurstIOPS()).append(",");
        if (getVolumeBaselineThroughput() != null)
            sb.append("VolumeBaselineThroughput: ").append(getVolumeBaselineThroughput()).append(",");
        if (getVolumeBurstThroughput() != null)
            sb.append("VolumeBurstThroughput: ").append(getVolumeBurstThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeConfiguration == false)
            return false;
        VolumeConfiguration other = (VolumeConfiguration) obj;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeBaselineIOPS() == null ^ this.getVolumeBaselineIOPS() == null)
            return false;
        if (other.getVolumeBaselineIOPS() != null && other.getVolumeBaselineIOPS().equals(this.getVolumeBaselineIOPS()) == false)
            return false;
        if (other.getVolumeBurstIOPS() == null ^ this.getVolumeBurstIOPS() == null)
            return false;
        if (other.getVolumeBurstIOPS() != null && other.getVolumeBurstIOPS().equals(this.getVolumeBurstIOPS()) == false)
            return false;
        if (other.getVolumeBaselineThroughput() == null ^ this.getVolumeBaselineThroughput() == null)
            return false;
        if (other.getVolumeBaselineThroughput() != null && other.getVolumeBaselineThroughput().equals(this.getVolumeBaselineThroughput()) == false)
            return false;
        if (other.getVolumeBurstThroughput() == null ^ this.getVolumeBurstThroughput() == null)
            return false;
        if (other.getVolumeBurstThroughput() != null && other.getVolumeBurstThroughput().equals(this.getVolumeBurstThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeBaselineIOPS() == null) ? 0 : getVolumeBaselineIOPS().hashCode());
        hashCode = prime * hashCode + ((getVolumeBurstIOPS() == null) ? 0 : getVolumeBurstIOPS().hashCode());
        hashCode = prime * hashCode + ((getVolumeBaselineThroughput() == null) ? 0 : getVolumeBaselineThroughput().hashCode());
        hashCode = prime * hashCode + ((getVolumeBurstThroughput() == null) ? 0 : getVolumeBurstThroughput().hashCode());
        return hashCode;
    }

    @Override
    public VolumeConfiguration clone() {
        try {
            return (VolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.VolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
