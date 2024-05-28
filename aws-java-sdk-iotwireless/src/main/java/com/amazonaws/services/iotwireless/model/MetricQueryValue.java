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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The aggregated values of the metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/MetricQueryValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricQueryValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum of the values of all data points collected during the aggregation period.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The maximum of the values of all the data points collected during the aggregation period.
     * </p>
     */
    private Double max;
    /**
     * <p>
     * The sum of the values of all data points collected during the aggregation period.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The average of the values of all data points collected during the aggregation period.
     * </p>
     */
    private Double avg;
    /**
     * <p>
     * The standard deviation of the values of all data points collected during the aggregation period.
     * </p>
     */
    private Double std;
    /**
     * <p>
     * The 90th percentile of the values of all data points collected during the aggregation period.
     * </p>
     */
    private Double p90;

    /**
     * <p>
     * The minimum of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param min
     *        The minimum of the values of all data points collected during the aggregation period.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @return The minimum of the values of all data points collected during the aggregation period.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param min
     *        The minimum of the values of all data points collected during the aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQueryValue withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The maximum of the values of all the data points collected during the aggregation period.
     * </p>
     * 
     * @param max
     *        The maximum of the values of all the data points collected during the aggregation period.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum of the values of all the data points collected during the aggregation period.
     * </p>
     * 
     * @return The maximum of the values of all the data points collected during the aggregation period.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum of the values of all the data points collected during the aggregation period.
     * </p>
     * 
     * @param max
     *        The maximum of the values of all the data points collected during the aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQueryValue withMax(Double max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The sum of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param sum
     *        The sum of the values of all data points collected during the aggregation period.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @return The sum of the values of all data points collected during the aggregation period.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param sum
     *        The sum of the values of all data points collected during the aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQueryValue withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The average of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param avg
     *        The average of the values of all data points collected during the aggregation period.
     */

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    /**
     * <p>
     * The average of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @return The average of the values of all data points collected during the aggregation period.
     */

    public Double getAvg() {
        return this.avg;
    }

    /**
     * <p>
     * The average of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param avg
     *        The average of the values of all data points collected during the aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQueryValue withAvg(Double avg) {
        setAvg(avg);
        return this;
    }

    /**
     * <p>
     * The standard deviation of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param std
     *        The standard deviation of the values of all data points collected during the aggregation period.
     */

    public void setStd(Double std) {
        this.std = std;
    }

    /**
     * <p>
     * The standard deviation of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @return The standard deviation of the values of all data points collected during the aggregation period.
     */

    public Double getStd() {
        return this.std;
    }

    /**
     * <p>
     * The standard deviation of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param std
     *        The standard deviation of the values of all data points collected during the aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQueryValue withStd(Double std) {
        setStd(std);
        return this;
    }

    /**
     * <p>
     * The 90th percentile of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param p90
     *        The 90th percentile of the values of all data points collected during the aggregation period.
     */

    public void setP90(Double p90) {
        this.p90 = p90;
    }

    /**
     * <p>
     * The 90th percentile of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @return The 90th percentile of the values of all data points collected during the aggregation period.
     */

    public Double getP90() {
        return this.p90;
    }

    /**
     * <p>
     * The 90th percentile of the values of all data points collected during the aggregation period.
     * </p>
     * 
     * @param p90
     *        The 90th percentile of the values of all data points collected during the aggregation period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQueryValue withP90(Double p90) {
        setP90(p90);
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
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getAvg() != null)
            sb.append("Avg: ").append(getAvg()).append(",");
        if (getStd() != null)
            sb.append("Std: ").append(getStd()).append(",");
        if (getP90() != null)
            sb.append("P90: ").append(getP90());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricQueryValue == false)
            return false;
        MetricQueryValue other = (MetricQueryValue) obj;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getAvg() == null ^ this.getAvg() == null)
            return false;
        if (other.getAvg() != null && other.getAvg().equals(this.getAvg()) == false)
            return false;
        if (other.getStd() == null ^ this.getStd() == null)
            return false;
        if (other.getStd() != null && other.getStd().equals(this.getStd()) == false)
            return false;
        if (other.getP90() == null ^ this.getP90() == null)
            return false;
        if (other.getP90() != null && other.getP90().equals(this.getP90()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getAvg() == null) ? 0 : getAvg().hashCode());
        hashCode = prime * hashCode + ((getStd() == null) ? 0 : getStd().hashCode());
        hashCode = prime * hashCode + ((getP90() == null) ? 0 : getP90().hashCode());
        return hashCode;
    }

    @Override
    public MetricQueryValue clone() {
        try {
            return (MetricQueryValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.MetricQueryValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
