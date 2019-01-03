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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon EBS volume. This data type maps directly to the Amazon EC2 <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/EbsBlockDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsBlockDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The snapshot ID.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD)
     * volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold HDD,and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default
     * volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Whether the volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The snapshot ID.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID.
     * </p>
     * 
     * @return The snapshot ID.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot ID.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume supports. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiB. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     * 
     * @return The volume size, in GiB. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The volume size, in GiB. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * </p>
     * 
     * @param volumeSize
     *        The volume size, in GiB. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD)
     * volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold HDD,and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default
     * volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS
     *        (SSD) volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold
     *        HDD,and <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     *        attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the
     *        default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD)
     * volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold HDD,and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default
     * volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * </p>
     * 
     * @return The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned
     *         IOPS (SSD) volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code>
     *         for Cold HDD,and <code>standard</code> for Magnetic volumes.</p>
     *         <p>
     *         If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     *         attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the
     *         default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD)
     * volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold HDD,and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default
     * volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS
     *        (SSD) volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold
     *        HDD,and <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     *        attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the
     *        default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD)
     * volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold HDD,and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default
     * volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS
     *        (SSD) volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold
     *        HDD,and <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     *        attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the
     *        default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS (SSD)
     * volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold HDD,and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default
     * volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for Provisioned IOPS
     *        (SSD) volumes, <code>st1</code> for Throughput Optimized hard disk drives (HDD), <code>sc1</code> for Cold
     *        HDD,and <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        If you specify the <code>io1</code> volume type, you must also specify a value for the <code>Iops</code>
     *        attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the
     *        default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Whether the volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Whether the volume is deleted on instance termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Whether the volume is deleted on instance termination.
     * </p>
     * 
     * @return Whether the volume is deleted on instance termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Whether the volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Whether the volume is deleted on instance termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Whether the volume is deleted on instance termination.
     * </p>
     * 
     * @return Whether the volume is deleted on instance termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination());
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
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
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
        com.amazonaws.services.opsworks.model.transform.EbsBlockDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
