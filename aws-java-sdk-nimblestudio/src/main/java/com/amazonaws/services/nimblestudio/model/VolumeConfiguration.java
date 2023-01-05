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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Custom volume configuration for the root volumes that are attached to streaming sessions.
 * </p>
 * <p>
 * This parameter is only allowed when <code>sessionPersistenceMode</code> is <code>ACTIVATED</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/VolumeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of I/O operations per second for the root volume that is attached to streaming session.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The size of the root volume that is attached to the streaming session. The root volume size is measured in GiBs.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The throughput to provision for the root volume that is attached to the streaming session. The throughput is
     * measured in MiB/s.
     * </p>
     */
    private Integer throughput;

    /**
     * <p>
     * The number of I/O operations per second for the root volume that is attached to streaming session.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second for the root volume that is attached to streaming session.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second for the root volume that is attached to streaming session.
     * </p>
     * 
     * @return The number of I/O operations per second for the root volume that is attached to streaming session.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second for the root volume that is attached to streaming session.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second for the root volume that is attached to streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The size of the root volume that is attached to the streaming session. The root volume size is measured in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the root volume that is attached to the streaming session. The root volume size is measured in
     *        GiBs.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the root volume that is attached to the streaming session. The root volume size is measured in GiBs.
     * </p>
     * 
     * @return The size of the root volume that is attached to the streaming session. The root volume size is measured
     *         in GiBs.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the root volume that is attached to the streaming session. The root volume size is measured in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the root volume that is attached to the streaming session. The root volume size is measured in
     *        GiBs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The throughput to provision for the root volume that is attached to the streaming session. The throughput is
     * measured in MiB/s.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for the root volume that is attached to the streaming session. The throughput
     *        is measured in MiB/s.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput to provision for the root volume that is attached to the streaming session. The throughput is
     * measured in MiB/s.
     * </p>
     * 
     * @return The throughput to provision for the root volume that is attached to the streaming session. The throughput
     *         is measured in MiB/s.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput to provision for the root volume that is attached to the streaming session. The throughput is
     * measured in MiB/s.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for the root volume that is attached to the streaming session. The throughput
     *        is measured in MiB/s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeConfiguration withThroughput(Integer throughput) {
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
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
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

        if (obj instanceof VolumeConfiguration == false)
            return false;
        VolumeConfiguration other = (VolumeConfiguration) obj;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
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

        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
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
        com.amazonaws.services.nimblestudio.model.transform.VolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
