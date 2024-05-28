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
 * The performance data that DataSync Discovery collects about an on-premises storage system resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/MaxP95Performance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaxP95Performance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     */
    private Double iopsRead;
    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     */
    private Double iopsWrite;
    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     */
    private Double iopsOther;
    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     */
    private Double iopsTotal;
    /**
     * <p>
     * Peak throughput related to read operations.
     * </p>
     */
    private Double throughputRead;
    /**
     * <p>
     * Peak throughput related to write operations.
     * </p>
     */
    private Double throughputWrite;
    /**
     * <p>
     * Peak throughput unrelated to read and write operations.
     * </p>
     */
    private Double throughputOther;
    /**
     * <p>
     * Peak total throughput on your on-premises storage system resource.
     * </p>
     */
    private Double throughputTotal;
    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     */
    private Double latencyRead;
    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     */
    private Double latencyWrite;
    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     */
    private Double latencyOther;

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     * 
     * @param iopsRead
     *        Peak IOPS related to read operations.
     */

    public void setIopsRead(Double iopsRead) {
        this.iopsRead = iopsRead;
    }

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     * 
     * @return Peak IOPS related to read operations.
     */

    public Double getIopsRead() {
        return this.iopsRead;
    }

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     * 
     * @param iopsRead
     *        Peak IOPS related to read operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withIopsRead(Double iopsRead) {
        setIopsRead(iopsRead);
        return this;
    }

    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     * 
     * @param iopsWrite
     *        Peak IOPS related to write operations.
     */

    public void setIopsWrite(Double iopsWrite) {
        this.iopsWrite = iopsWrite;
    }

    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     * 
     * @return Peak IOPS related to write operations.
     */

    public Double getIopsWrite() {
        return this.iopsWrite;
    }

    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     * 
     * @param iopsWrite
     *        Peak IOPS related to write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withIopsWrite(Double iopsWrite) {
        setIopsWrite(iopsWrite);
        return this;
    }

    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     * 
     * @param iopsOther
     *        Peak IOPS unrelated to read and write operations.
     */

    public void setIopsOther(Double iopsOther) {
        this.iopsOther = iopsOther;
    }

    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     * 
     * @return Peak IOPS unrelated to read and write operations.
     */

    public Double getIopsOther() {
        return this.iopsOther;
    }

    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     * 
     * @param iopsOther
     *        Peak IOPS unrelated to read and write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withIopsOther(Double iopsOther) {
        setIopsOther(iopsOther);
        return this;
    }

    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     * 
     * @param iopsTotal
     *        Peak total IOPS on your on-premises storage system resource.
     */

    public void setIopsTotal(Double iopsTotal) {
        this.iopsTotal = iopsTotal;
    }

    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     * 
     * @return Peak total IOPS on your on-premises storage system resource.
     */

    public Double getIopsTotal() {
        return this.iopsTotal;
    }

    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     * 
     * @param iopsTotal
     *        Peak total IOPS on your on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withIopsTotal(Double iopsTotal) {
        setIopsTotal(iopsTotal);
        return this;
    }

    /**
     * <p>
     * Peak throughput related to read operations.
     * </p>
     * 
     * @param throughputRead
     *        Peak throughput related to read operations.
     */

    public void setThroughputRead(Double throughputRead) {
        this.throughputRead = throughputRead;
    }

    /**
     * <p>
     * Peak throughput related to read operations.
     * </p>
     * 
     * @return Peak throughput related to read operations.
     */

    public Double getThroughputRead() {
        return this.throughputRead;
    }

    /**
     * <p>
     * Peak throughput related to read operations.
     * </p>
     * 
     * @param throughputRead
     *        Peak throughput related to read operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withThroughputRead(Double throughputRead) {
        setThroughputRead(throughputRead);
        return this;
    }

    /**
     * <p>
     * Peak throughput related to write operations.
     * </p>
     * 
     * @param throughputWrite
     *        Peak throughput related to write operations.
     */

    public void setThroughputWrite(Double throughputWrite) {
        this.throughputWrite = throughputWrite;
    }

    /**
     * <p>
     * Peak throughput related to write operations.
     * </p>
     * 
     * @return Peak throughput related to write operations.
     */

    public Double getThroughputWrite() {
        return this.throughputWrite;
    }

    /**
     * <p>
     * Peak throughput related to write operations.
     * </p>
     * 
     * @param throughputWrite
     *        Peak throughput related to write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withThroughputWrite(Double throughputWrite) {
        setThroughputWrite(throughputWrite);
        return this;
    }

    /**
     * <p>
     * Peak throughput unrelated to read and write operations.
     * </p>
     * 
     * @param throughputOther
     *        Peak throughput unrelated to read and write operations.
     */

    public void setThroughputOther(Double throughputOther) {
        this.throughputOther = throughputOther;
    }

    /**
     * <p>
     * Peak throughput unrelated to read and write operations.
     * </p>
     * 
     * @return Peak throughput unrelated to read and write operations.
     */

    public Double getThroughputOther() {
        return this.throughputOther;
    }

    /**
     * <p>
     * Peak throughput unrelated to read and write operations.
     * </p>
     * 
     * @param throughputOther
     *        Peak throughput unrelated to read and write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withThroughputOther(Double throughputOther) {
        setThroughputOther(throughputOther);
        return this;
    }

    /**
     * <p>
     * Peak total throughput on your on-premises storage system resource.
     * </p>
     * 
     * @param throughputTotal
     *        Peak total throughput on your on-premises storage system resource.
     */

    public void setThroughputTotal(Double throughputTotal) {
        this.throughputTotal = throughputTotal;
    }

    /**
     * <p>
     * Peak total throughput on your on-premises storage system resource.
     * </p>
     * 
     * @return Peak total throughput on your on-premises storage system resource.
     */

    public Double getThroughputTotal() {
        return this.throughputTotal;
    }

    /**
     * <p>
     * Peak total throughput on your on-premises storage system resource.
     * </p>
     * 
     * @param throughputTotal
     *        Peak total throughput on your on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withThroughputTotal(Double throughputTotal) {
        setThroughputTotal(throughputTotal);
        return this;
    }

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     * 
     * @param latencyRead
     *        Peak latency for read operations.
     */

    public void setLatencyRead(Double latencyRead) {
        this.latencyRead = latencyRead;
    }

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     * 
     * @return Peak latency for read operations.
     */

    public Double getLatencyRead() {
        return this.latencyRead;
    }

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     * 
     * @param latencyRead
     *        Peak latency for read operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withLatencyRead(Double latencyRead) {
        setLatencyRead(latencyRead);
        return this;
    }

    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     * 
     * @param latencyWrite
     *        Peak latency for write operations.
     */

    public void setLatencyWrite(Double latencyWrite) {
        this.latencyWrite = latencyWrite;
    }

    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     * 
     * @return Peak latency for write operations.
     */

    public Double getLatencyWrite() {
        return this.latencyWrite;
    }

    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     * 
     * @param latencyWrite
     *        Peak latency for write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withLatencyWrite(Double latencyWrite) {
        setLatencyWrite(latencyWrite);
        return this;
    }

    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     * 
     * @param latencyOther
     *        Peak latency for operations unrelated to read and write operations.
     */

    public void setLatencyOther(Double latencyOther) {
        this.latencyOther = latencyOther;
    }

    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     * 
     * @return Peak latency for operations unrelated to read and write operations.
     */

    public Double getLatencyOther() {
        return this.latencyOther;
    }

    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     * 
     * @param latencyOther
     *        Peak latency for operations unrelated to read and write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxP95Performance withLatencyOther(Double latencyOther) {
        setLatencyOther(latencyOther);
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
        if (getIopsRead() != null)
            sb.append("IopsRead: ").append(getIopsRead()).append(",");
        if (getIopsWrite() != null)
            sb.append("IopsWrite: ").append(getIopsWrite()).append(",");
        if (getIopsOther() != null)
            sb.append("IopsOther: ").append(getIopsOther()).append(",");
        if (getIopsTotal() != null)
            sb.append("IopsTotal: ").append(getIopsTotal()).append(",");
        if (getThroughputRead() != null)
            sb.append("ThroughputRead: ").append(getThroughputRead()).append(",");
        if (getThroughputWrite() != null)
            sb.append("ThroughputWrite: ").append(getThroughputWrite()).append(",");
        if (getThroughputOther() != null)
            sb.append("ThroughputOther: ").append(getThroughputOther()).append(",");
        if (getThroughputTotal() != null)
            sb.append("ThroughputTotal: ").append(getThroughputTotal()).append(",");
        if (getLatencyRead() != null)
            sb.append("LatencyRead: ").append(getLatencyRead()).append(",");
        if (getLatencyWrite() != null)
            sb.append("LatencyWrite: ").append(getLatencyWrite()).append(",");
        if (getLatencyOther() != null)
            sb.append("LatencyOther: ").append(getLatencyOther());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaxP95Performance == false)
            return false;
        MaxP95Performance other = (MaxP95Performance) obj;
        if (other.getIopsRead() == null ^ this.getIopsRead() == null)
            return false;
        if (other.getIopsRead() != null && other.getIopsRead().equals(this.getIopsRead()) == false)
            return false;
        if (other.getIopsWrite() == null ^ this.getIopsWrite() == null)
            return false;
        if (other.getIopsWrite() != null && other.getIopsWrite().equals(this.getIopsWrite()) == false)
            return false;
        if (other.getIopsOther() == null ^ this.getIopsOther() == null)
            return false;
        if (other.getIopsOther() != null && other.getIopsOther().equals(this.getIopsOther()) == false)
            return false;
        if (other.getIopsTotal() == null ^ this.getIopsTotal() == null)
            return false;
        if (other.getIopsTotal() != null && other.getIopsTotal().equals(this.getIopsTotal()) == false)
            return false;
        if (other.getThroughputRead() == null ^ this.getThroughputRead() == null)
            return false;
        if (other.getThroughputRead() != null && other.getThroughputRead().equals(this.getThroughputRead()) == false)
            return false;
        if (other.getThroughputWrite() == null ^ this.getThroughputWrite() == null)
            return false;
        if (other.getThroughputWrite() != null && other.getThroughputWrite().equals(this.getThroughputWrite()) == false)
            return false;
        if (other.getThroughputOther() == null ^ this.getThroughputOther() == null)
            return false;
        if (other.getThroughputOther() != null && other.getThroughputOther().equals(this.getThroughputOther()) == false)
            return false;
        if (other.getThroughputTotal() == null ^ this.getThroughputTotal() == null)
            return false;
        if (other.getThroughputTotal() != null && other.getThroughputTotal().equals(this.getThroughputTotal()) == false)
            return false;
        if (other.getLatencyRead() == null ^ this.getLatencyRead() == null)
            return false;
        if (other.getLatencyRead() != null && other.getLatencyRead().equals(this.getLatencyRead()) == false)
            return false;
        if (other.getLatencyWrite() == null ^ this.getLatencyWrite() == null)
            return false;
        if (other.getLatencyWrite() != null && other.getLatencyWrite().equals(this.getLatencyWrite()) == false)
            return false;
        if (other.getLatencyOther() == null ^ this.getLatencyOther() == null)
            return false;
        if (other.getLatencyOther() != null && other.getLatencyOther().equals(this.getLatencyOther()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIopsRead() == null) ? 0 : getIopsRead().hashCode());
        hashCode = prime * hashCode + ((getIopsWrite() == null) ? 0 : getIopsWrite().hashCode());
        hashCode = prime * hashCode + ((getIopsOther() == null) ? 0 : getIopsOther().hashCode());
        hashCode = prime * hashCode + ((getIopsTotal() == null) ? 0 : getIopsTotal().hashCode());
        hashCode = prime * hashCode + ((getThroughputRead() == null) ? 0 : getThroughputRead().hashCode());
        hashCode = prime * hashCode + ((getThroughputWrite() == null) ? 0 : getThroughputWrite().hashCode());
        hashCode = prime * hashCode + ((getThroughputOther() == null) ? 0 : getThroughputOther().hashCode());
        hashCode = prime * hashCode + ((getThroughputTotal() == null) ? 0 : getThroughputTotal().hashCode());
        hashCode = prime * hashCode + ((getLatencyRead() == null) ? 0 : getLatencyRead().hashCode());
        hashCode = prime * hashCode + ((getLatencyWrite() == null) ? 0 : getLatencyWrite().hashCode());
        hashCode = prime * hashCode + ((getLatencyOther() == null) ? 0 : getLatencyOther().hashCode());
        return hashCode;
    }

    @Override
    public MaxP95Performance clone() {
        try {
            return (MaxP95Performance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.MaxP95PerformanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
