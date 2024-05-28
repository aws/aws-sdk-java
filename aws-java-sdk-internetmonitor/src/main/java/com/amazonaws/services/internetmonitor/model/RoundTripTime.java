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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Round-trip time (RTT) is how long it takes for a request from the user to return a response to the user. Amazon
 * CloudWatch Internet Monitor calculates RTT at different percentiles: p50, p90, and p95.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/RoundTripTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoundTripTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * RTT at the 50th percentile (p50).
     * </p>
     */
    private Double p50;
    /**
     * <p>
     * RTT at the 90th percentile (p90).
     * </p>
     */
    private Double p90;
    /**
     * <p>
     * RTT at the 95th percentile (p95).
     * </p>
     */
    private Double p95;

    /**
     * <p>
     * RTT at the 50th percentile (p50).
     * </p>
     * 
     * @param p50
     *        RTT at the 50th percentile (p50).
     */

    public void setP50(Double p50) {
        this.p50 = p50;
    }

    /**
     * <p>
     * RTT at the 50th percentile (p50).
     * </p>
     * 
     * @return RTT at the 50th percentile (p50).
     */

    public Double getP50() {
        return this.p50;
    }

    /**
     * <p>
     * RTT at the 50th percentile (p50).
     * </p>
     * 
     * @param p50
     *        RTT at the 50th percentile (p50).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoundTripTime withP50(Double p50) {
        setP50(p50);
        return this;
    }

    /**
     * <p>
     * RTT at the 90th percentile (p90).
     * </p>
     * 
     * @param p90
     *        RTT at the 90th percentile (p90).
     */

    public void setP90(Double p90) {
        this.p90 = p90;
    }

    /**
     * <p>
     * RTT at the 90th percentile (p90).
     * </p>
     * 
     * @return RTT at the 90th percentile (p90).
     */

    public Double getP90() {
        return this.p90;
    }

    /**
     * <p>
     * RTT at the 90th percentile (p90).
     * </p>
     * 
     * @param p90
     *        RTT at the 90th percentile (p90).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoundTripTime withP90(Double p90) {
        setP90(p90);
        return this;
    }

    /**
     * <p>
     * RTT at the 95th percentile (p95).
     * </p>
     * 
     * @param p95
     *        RTT at the 95th percentile (p95).
     */

    public void setP95(Double p95) {
        this.p95 = p95;
    }

    /**
     * <p>
     * RTT at the 95th percentile (p95).
     * </p>
     * 
     * @return RTT at the 95th percentile (p95).
     */

    public Double getP95() {
        return this.p95;
    }

    /**
     * <p>
     * RTT at the 95th percentile (p95).
     * </p>
     * 
     * @param p95
     *        RTT at the 95th percentile (p95).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoundTripTime withP95(Double p95) {
        setP95(p95);
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
        if (getP50() != null)
            sb.append("P50: ").append(getP50()).append(",");
        if (getP90() != null)
            sb.append("P90: ").append(getP90()).append(",");
        if (getP95() != null)
            sb.append("P95: ").append(getP95());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoundTripTime == false)
            return false;
        RoundTripTime other = (RoundTripTime) obj;
        if (other.getP50() == null ^ this.getP50() == null)
            return false;
        if (other.getP50() != null && other.getP50().equals(this.getP50()) == false)
            return false;
        if (other.getP90() == null ^ this.getP90() == null)
            return false;
        if (other.getP90() != null && other.getP90().equals(this.getP90()) == false)
            return false;
        if (other.getP95() == null ^ this.getP95() == null)
            return false;
        if (other.getP95() != null && other.getP95().equals(this.getP95()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getP50() == null) ? 0 : getP50().hashCode());
        hashCode = prime * hashCode + ((getP90() == null) ? 0 : getP90().hashCode());
        hashCode = prime * hashCode + ((getP95() == null) ? 0 : getP95().hashCode());
        return hashCode;
    }

    @Override
    public RoundTripTime clone() {
        try {
            return (RoundTripTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.RoundTripTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
