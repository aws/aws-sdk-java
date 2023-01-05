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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EBSOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     * </p>
     */
    private Boolean eBSEnabled;
    /**
     * <p>
     * Specifies the type of EBS volumes attached to data nodes.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Specifies the size (in GiB) of EBS volumes attached to data nodes.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for
     * the <code>gp3</code> and provisioned IOPS EBS volume types.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     * <code>gp3</code> volume type.
     * </p>
     */
    private Integer throughput;

    /**
     * <p>
     * Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     * </p>
     * 
     * @param eBSEnabled
     *        Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     */

    public void setEBSEnabled(Boolean eBSEnabled) {
        this.eBSEnabled = eBSEnabled;
    }

    /**
     * <p>
     * Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     * </p>
     * 
     * @return Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     */

    public Boolean getEBSEnabled() {
        return this.eBSEnabled;
    }

    /**
     * <p>
     * Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     * </p>
     * 
     * @param eBSEnabled
     *        Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withEBSEnabled(Boolean eBSEnabled) {
        setEBSEnabled(eBSEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     * </p>
     * 
     * @return Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
     */

    public Boolean isEBSEnabled() {
        return this.eBSEnabled;
    }

    /**
     * <p>
     * Specifies the type of EBS volumes attached to data nodes.
     * </p>
     * 
     * @param volumeType
     *        Specifies the type of EBS volumes attached to data nodes.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * Specifies the type of EBS volumes attached to data nodes.
     * </p>
     * 
     * @return Specifies the type of EBS volumes attached to data nodes.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * Specifies the type of EBS volumes attached to data nodes.
     * </p>
     * 
     * @param volumeType
     *        Specifies the type of EBS volumes attached to data nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EBSOptions withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of EBS volumes attached to data nodes.
     * </p>
     * 
     * @param volumeType
     *        Specifies the type of EBS volumes attached to data nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EBSOptions withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the size (in GiB) of EBS volumes attached to data nodes.
     * </p>
     * 
     * @param volumeSize
     *        Specifies the size (in GiB) of EBS volumes attached to data nodes.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Specifies the size (in GiB) of EBS volumes attached to data nodes.
     * </p>
     * 
     * @return Specifies the size (in GiB) of EBS volumes attached to data nodes.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * Specifies the size (in GiB) of EBS volumes attached to data nodes.
     * </p>
     * 
     * @param volumeSize
     *        Specifies the size (in GiB) of EBS volumes attached to data nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for
     * the <code>gp3</code> and provisioned IOPS EBS volume types.
     * </p>
     * 
     * @param iops
     *        Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable
     *        only for the <code>gp3</code> and provisioned IOPS EBS volume types.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for
     * the <code>gp3</code> and provisioned IOPS EBS volume types.
     * </p>
     * 
     * @return Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable
     *         only for the <code>gp3</code> and provisioned IOPS EBS volume types.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for
     * the <code>gp3</code> and provisioned IOPS EBS volume types.
     * </p>
     * 
     * @param iops
     *        Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable
     *        only for the <code>gp3</code> and provisioned IOPS EBS volume types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     * <code>gp3</code> volume type.
     * </p>
     * 
     * @param throughput
     *        Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     *        <code>gp3</code> volume type.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     * <code>gp3</code> volume type.
     * </p>
     * 
     * @return Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     *         <code>gp3</code> volume type.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     * <code>gp3</code> volume type.
     * </p>
     * 
     * @param throughput
     *        Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the
     *        <code>gp3</code> volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withThroughput(Integer throughput) {
        setThroughput(throughput);
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
        if (getEBSEnabled() != null)
            sb.append("EBSEnabled: ").append(getEBSEnabled()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSOptions == false)
            return false;
        EBSOptions other = (EBSOptions) obj;
        if (other.getEBSEnabled() == null ^ this.getEBSEnabled() == null)
            return false;
        if (other.getEBSEnabled() != null && other.getEBSEnabled().equals(this.getEBSEnabled()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEBSEnabled() == null) ? 0 : getEBSEnabled().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        return hashCode;
    }

    @Override
    public EBSOptions clone() {
        try {
            return (EBSOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.EBSOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
