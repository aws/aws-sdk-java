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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon Elastic Block Store performance configuration of the current and recommended resource
 * configuration for a recommendation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/BlockStoragePerformanceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockStoragePerformanceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of I/O operations per second.
     * </p>
     */
    private Double iops;
    /**
     * <p>
     * The throughput that the volume supports.
     * </p>
     */
    private Double throughput;

    /**
     * <p>
     * The number of I/O operations per second.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second.
     */

    public void setIops(Double iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second.
     * </p>
     * 
     * @return The number of I/O operations per second.
     */

    public Double getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockStoragePerformanceConfiguration withIops(Double iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The throughput that the volume supports.
     * </p>
     * 
     * @param throughput
     *        The throughput that the volume supports.
     */

    public void setThroughput(Double throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput that the volume supports.
     * </p>
     * 
     * @return The throughput that the volume supports.
     */

    public Double getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput that the volume supports.
     * </p>
     * 
     * @param throughput
     *        The throughput that the volume supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockStoragePerformanceConfiguration withThroughput(Double throughput) {
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

        if (obj instanceof BlockStoragePerformanceConfiguration == false)
            return false;
        BlockStoragePerformanceConfiguration other = (BlockStoragePerformanceConfiguration) obj;
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

        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        return hashCode;
    }

    @Override
    public BlockStoragePerformanceConfiguration clone() {
        try {
            return (BlockStoragePerformanceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.BlockStoragePerformanceConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
