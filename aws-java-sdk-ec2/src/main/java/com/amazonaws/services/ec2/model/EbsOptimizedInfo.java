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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the optimized EBS performance for supported instance types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EbsOptimizedInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsOptimizedInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     */
    private Integer baselineBandwidthInMbps;
    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     */
    private Double baselineThroughputInMBps;
    /**
     * <p>
     * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     * </p>
     */
    private Integer baselineIops;
    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     */
    private Integer maximumBandwidthInMbps;
    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     */
    private Double maximumThroughputInMBps;
    /**
     * <p>
     * The maximum input/output storage operations per second for an EBS-optimized instance type.
     * </p>
     */
    private Integer maximumIops;

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     * 
     * @param baselineBandwidthInMbps
     *        The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     */

    public void setBaselineBandwidthInMbps(Integer baselineBandwidthInMbps) {
        this.baselineBandwidthInMbps = baselineBandwidthInMbps;
    }

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     * 
     * @return The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     */

    public Integer getBaselineBandwidthInMbps() {
        return this.baselineBandwidthInMbps;
    }

    /**
     * <p>
     * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     * 
     * @param baselineBandwidthInMbps
     *        The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsOptimizedInfo withBaselineBandwidthInMbps(Integer baselineBandwidthInMbps) {
        setBaselineBandwidthInMbps(baselineBandwidthInMbps);
        return this;
    }

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     * 
     * @param baselineThroughputInMBps
     *        The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     */

    public void setBaselineThroughputInMBps(Double baselineThroughputInMBps) {
        this.baselineThroughputInMBps = baselineThroughputInMBps;
    }

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     * 
     * @return The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     */

    public Double getBaselineThroughputInMBps() {
        return this.baselineThroughputInMBps;
    }

    /**
     * <p>
     * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     * 
     * @param baselineThroughputInMBps
     *        The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsOptimizedInfo withBaselineThroughputInMBps(Double baselineThroughputInMBps) {
        setBaselineThroughputInMBps(baselineThroughputInMBps);
        return this;
    }

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     * </p>
     * 
     * @param baselineIops
     *        The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     */

    public void setBaselineIops(Integer baselineIops) {
        this.baselineIops = baselineIops;
    }

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     * </p>
     * 
     * @return The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     */

    public Integer getBaselineIops() {
        return this.baselineIops;
    }

    /**
     * <p>
     * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     * </p>
     * 
     * @param baselineIops
     *        The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsOptimizedInfo withBaselineIops(Integer baselineIops) {
        setBaselineIops(baselineIops);
        return this;
    }

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     * 
     * @param maximumBandwidthInMbps
     *        The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     */

    public void setMaximumBandwidthInMbps(Integer maximumBandwidthInMbps) {
        this.maximumBandwidthInMbps = maximumBandwidthInMbps;
    }

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     * 
     * @return The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     */

    public Integer getMaximumBandwidthInMbps() {
        return this.maximumBandwidthInMbps;
    }

    /**
     * <p>
     * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     * </p>
     * 
     * @param maximumBandwidthInMbps
     *        The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsOptimizedInfo withMaximumBandwidthInMbps(Integer maximumBandwidthInMbps) {
        setMaximumBandwidthInMbps(maximumBandwidthInMbps);
        return this;
    }

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     * 
     * @param maximumThroughputInMBps
     *        The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     */

    public void setMaximumThroughputInMBps(Double maximumThroughputInMBps) {
        this.maximumThroughputInMBps = maximumThroughputInMBps;
    }

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     * 
     * @return The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     */

    public Double getMaximumThroughputInMBps() {
        return this.maximumThroughputInMBps;
    }

    /**
     * <p>
     * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     * </p>
     * 
     * @param maximumThroughputInMBps
     *        The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsOptimizedInfo withMaximumThroughputInMBps(Double maximumThroughputInMBps) {
        setMaximumThroughputInMBps(maximumThroughputInMBps);
        return this;
    }

    /**
     * <p>
     * The maximum input/output storage operations per second for an EBS-optimized instance type.
     * </p>
     * 
     * @param maximumIops
     *        The maximum input/output storage operations per second for an EBS-optimized instance type.
     */

    public void setMaximumIops(Integer maximumIops) {
        this.maximumIops = maximumIops;
    }

    /**
     * <p>
     * The maximum input/output storage operations per second for an EBS-optimized instance type.
     * </p>
     * 
     * @return The maximum input/output storage operations per second for an EBS-optimized instance type.
     */

    public Integer getMaximumIops() {
        return this.maximumIops;
    }

    /**
     * <p>
     * The maximum input/output storage operations per second for an EBS-optimized instance type.
     * </p>
     * 
     * @param maximumIops
     *        The maximum input/output storage operations per second for an EBS-optimized instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsOptimizedInfo withMaximumIops(Integer maximumIops) {
        setMaximumIops(maximumIops);
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
        if (getBaselineBandwidthInMbps() != null)
            sb.append("BaselineBandwidthInMbps: ").append(getBaselineBandwidthInMbps()).append(",");
        if (getBaselineThroughputInMBps() != null)
            sb.append("BaselineThroughputInMBps: ").append(getBaselineThroughputInMBps()).append(",");
        if (getBaselineIops() != null)
            sb.append("BaselineIops: ").append(getBaselineIops()).append(",");
        if (getMaximumBandwidthInMbps() != null)
            sb.append("MaximumBandwidthInMbps: ").append(getMaximumBandwidthInMbps()).append(",");
        if (getMaximumThroughputInMBps() != null)
            sb.append("MaximumThroughputInMBps: ").append(getMaximumThroughputInMBps()).append(",");
        if (getMaximumIops() != null)
            sb.append("MaximumIops: ").append(getMaximumIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsOptimizedInfo == false)
            return false;
        EbsOptimizedInfo other = (EbsOptimizedInfo) obj;
        if (other.getBaselineBandwidthInMbps() == null ^ this.getBaselineBandwidthInMbps() == null)
            return false;
        if (other.getBaselineBandwidthInMbps() != null && other.getBaselineBandwidthInMbps().equals(this.getBaselineBandwidthInMbps()) == false)
            return false;
        if (other.getBaselineThroughputInMBps() == null ^ this.getBaselineThroughputInMBps() == null)
            return false;
        if (other.getBaselineThroughputInMBps() != null && other.getBaselineThroughputInMBps().equals(this.getBaselineThroughputInMBps()) == false)
            return false;
        if (other.getBaselineIops() == null ^ this.getBaselineIops() == null)
            return false;
        if (other.getBaselineIops() != null && other.getBaselineIops().equals(this.getBaselineIops()) == false)
            return false;
        if (other.getMaximumBandwidthInMbps() == null ^ this.getMaximumBandwidthInMbps() == null)
            return false;
        if (other.getMaximumBandwidthInMbps() != null && other.getMaximumBandwidthInMbps().equals(this.getMaximumBandwidthInMbps()) == false)
            return false;
        if (other.getMaximumThroughputInMBps() == null ^ this.getMaximumThroughputInMBps() == null)
            return false;
        if (other.getMaximumThroughputInMBps() != null && other.getMaximumThroughputInMBps().equals(this.getMaximumThroughputInMBps()) == false)
            return false;
        if (other.getMaximumIops() == null ^ this.getMaximumIops() == null)
            return false;
        if (other.getMaximumIops() != null && other.getMaximumIops().equals(this.getMaximumIops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineBandwidthInMbps() == null) ? 0 : getBaselineBandwidthInMbps().hashCode());
        hashCode = prime * hashCode + ((getBaselineThroughputInMBps() == null) ? 0 : getBaselineThroughputInMBps().hashCode());
        hashCode = prime * hashCode + ((getBaselineIops() == null) ? 0 : getBaselineIops().hashCode());
        hashCode = prime * hashCode + ((getMaximumBandwidthInMbps() == null) ? 0 : getMaximumBandwidthInMbps().hashCode());
        hashCode = prime * hashCode + ((getMaximumThroughputInMBps() == null) ? 0 : getMaximumThroughputInMBps().hashCode());
        hashCode = prime * hashCode + ((getMaximumIops() == null) ? 0 : getMaximumIops().hashCode());
        return hashCode;
    }

    @Override
    public EbsOptimizedInfo clone() {
        try {
            return (EbsOptimizedInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
