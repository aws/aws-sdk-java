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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The types of performance data that DataSync Discovery collects about an on-premises storage system resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/P95Metrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class P95Metrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     */
    private IOPS iOPS;
    /**
     * <p>
     * The throughput peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     * peak value during a 1-hour interval.
     * </p>
     */
    private Throughput throughput;
    /**
     * <p>
     * The latency peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     */
    private Latency latency;

    /**
     * <p>
     * The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     * 
     * @param iOPS
     *        The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     *        peak value during a 1-hour interval.
     */

    public void setIOPS(IOPS iOPS) {
        this.iOPS = iOPS;
    }

    /**
     * <p>
     * The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     * 
     * @return The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     *         peak value during a 1-hour interval.
     */

    public IOPS getIOPS() {
        return this.iOPS;
    }

    /**
     * <p>
     * The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     * 
     * @param iOPS
     *        The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     *        peak value during a 1-hour interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public P95Metrics withIOPS(IOPS iOPS) {
        setIOPS(iOPS);
        return this;
    }

    /**
     * <p>
     * The throughput peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     * peak value during a 1-hour interval.
     * </p>
     * 
     * @param throughput
     *        The throughput peaks for an on-premises storage system resource. Each data point represents the 95th
     *        percentile peak value during a 1-hour interval.
     */

    public void setThroughput(Throughput throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     * peak value during a 1-hour interval.
     * </p>
     * 
     * @return The throughput peaks for an on-premises storage system resource. Each data point represents the 95th
     *         percentile peak value during a 1-hour interval.
     */

    public Throughput getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput peaks for an on-premises storage system resource. Each data point represents the 95th percentile
     * peak value during a 1-hour interval.
     * </p>
     * 
     * @param throughput
     *        The throughput peaks for an on-premises storage system resource. Each data point represents the 95th
     *        percentile peak value during a 1-hour interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public P95Metrics withThroughput(Throughput throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * <p>
     * The latency peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     * 
     * @param latency
     *        The latency peaks for an on-premises storage system resource. Each data point represents the 95th
     *        percentile peak value during a 1-hour interval.
     */

    public void setLatency(Latency latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * The latency peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     * 
     * @return The latency peaks for an on-premises storage system resource. Each data point represents the 95th
     *         percentile peak value during a 1-hour interval.
     */

    public Latency getLatency() {
        return this.latency;
    }

    /**
     * <p>
     * The latency peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
     * value during a 1-hour interval.
     * </p>
     * 
     * @param latency
     *        The latency peaks for an on-premises storage system resource. Each data point represents the 95th
     *        percentile peak value during a 1-hour interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public P95Metrics withLatency(Latency latency) {
        setLatency(latency);
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
        if (getIOPS() != null)
            sb.append("IOPS: ").append(getIOPS()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput()).append(",");
        if (getLatency() != null)
            sb.append("Latency: ").append(getLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof P95Metrics == false)
            return false;
        P95Metrics other = (P95Metrics) obj;
        if (other.getIOPS() == null ^ this.getIOPS() == null)
            return false;
        if (other.getIOPS() != null && other.getIOPS().equals(this.getIOPS()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIOPS() == null) ? 0 : getIOPS().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        return hashCode;
    }

    @Override
    public P95Metrics clone() {
        try {
            return (P95Metrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.P95MetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
