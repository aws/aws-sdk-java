/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the EBS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/Ec2EbsVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2EbsVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IOPS per volume.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The EBS volume size in GiB.
     * </p>
     */
    private Integer sizeGiB;
    /**
     * <p>
     * The throughput per volume in MiB.
     * </p>
     */
    private Integer throughputMiB;

    /**
     * <p>
     * The IOPS per volume.
     * </p>
     * 
     * @param iops
     *        The IOPS per volume.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The IOPS per volume.
     * </p>
     * 
     * @return The IOPS per volume.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The IOPS per volume.
     * </p>
     * 
     * @param iops
     *        The IOPS per volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2EbsVolume withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The EBS volume size in GiB.
     * </p>
     * 
     * @param sizeGiB
     *        The EBS volume size in GiB.
     */

    public void setSizeGiB(Integer sizeGiB) {
        this.sizeGiB = sizeGiB;
    }

    /**
     * <p>
     * The EBS volume size in GiB.
     * </p>
     * 
     * @return The EBS volume size in GiB.
     */

    public Integer getSizeGiB() {
        return this.sizeGiB;
    }

    /**
     * <p>
     * The EBS volume size in GiB.
     * </p>
     * 
     * @param sizeGiB
     *        The EBS volume size in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2EbsVolume withSizeGiB(Integer sizeGiB) {
        setSizeGiB(sizeGiB);
        return this;
    }

    /**
     * <p>
     * The throughput per volume in MiB.
     * </p>
     * 
     * @param throughputMiB
     *        The throughput per volume in MiB.
     */

    public void setThroughputMiB(Integer throughputMiB) {
        this.throughputMiB = throughputMiB;
    }

    /**
     * <p>
     * The throughput per volume in MiB.
     * </p>
     * 
     * @return The throughput per volume in MiB.
     */

    public Integer getThroughputMiB() {
        return this.throughputMiB;
    }

    /**
     * <p>
     * The throughput per volume in MiB.
     * </p>
     * 
     * @param throughputMiB
     *        The throughput per volume in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2EbsVolume withThroughputMiB(Integer throughputMiB) {
        setThroughputMiB(throughputMiB);
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
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getSizeGiB() != null)
            sb.append("SizeGiB: ").append(getSizeGiB()).append(",");
        if (getThroughputMiB() != null)
            sb.append("ThroughputMiB: ").append(getThroughputMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2EbsVolume == false)
            return false;
        Ec2EbsVolume other = (Ec2EbsVolume) obj;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSizeGiB() == null ^ this.getSizeGiB() == null)
            return false;
        if (other.getSizeGiB() != null && other.getSizeGiB().equals(this.getSizeGiB()) == false)
            return false;
        if (other.getThroughputMiB() == null ^ this.getThroughputMiB() == null)
            return false;
        if (other.getThroughputMiB() != null && other.getThroughputMiB().equals(this.getThroughputMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSizeGiB() == null) ? 0 : getSizeGiB().hashCode());
        hashCode = prime * hashCode + ((getThroughputMiB() == null) ? 0 : getThroughputMiB().hashCode());
        return hashCode;
    }

    @Override
    public Ec2EbsVolume clone() {
        try {
            return (Ec2EbsVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.Ec2EbsVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
