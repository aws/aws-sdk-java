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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metric data point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/MetricDatapoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatapoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The average.
     * </p>
     */
    private Double average;
    /**
     * <p>
     * The maximum.
     * </p>
     */
    private Double maximum;
    /**
     * <p>
     * The minimum.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * The sample count.
     * </p>
     */
    private Double sampleCount;
    /**
     * <p>
     * The sum.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The unit.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The average.
     * </p>
     * 
     * @param average
     *        The average.
     */

    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average.
     * </p>
     * 
     * @return The average.
     */

    public Double getAverage() {
        return this.average;
    }

    /**
     * <p>
     * The average.
     * </p>
     * 
     * @param average
     *        The average.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatapoint withAverage(Double average) {
        setAverage(average);
        return this;
    }

    /**
     * <p>
     * The maximum.
     * </p>
     * 
     * @param maximum
     *        The maximum.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum.
     * </p>
     * 
     * @return The maximum.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum.
     * </p>
     * 
     * @param maximum
     *        The maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatapoint withMaximum(Double maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The minimum.
     * </p>
     * 
     * @param minimum
     *        The minimum.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum.
     * </p>
     * 
     * @return The minimum.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum.
     * </p>
     * 
     * @param minimum
     *        The minimum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatapoint withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The sample count.
     * </p>
     * 
     * @param sampleCount
     *        The sample count.
     */

    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * The sample count.
     * </p>
     * 
     * @return The sample count.
     */

    public Double getSampleCount() {
        return this.sampleCount;
    }

    /**
     * <p>
     * The sample count.
     * </p>
     * 
     * @param sampleCount
     *        The sample count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatapoint withSampleCount(Double sampleCount) {
        setSampleCount(sampleCount);
        return this;
    }

    /**
     * <p>
     * The sum.
     * </p>
     * 
     * @param sum
     *        The sum.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum.
     * </p>
     * 
     * @return The sum.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum.
     * </p>
     * 
     * @param sum
     *        The sum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatapoint withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param timestamp
     *        The timestamp (e.g., <code>1479816991.349</code>).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @return The timestamp (e.g., <code>1479816991.349</code>).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param timestamp
     *        The timestamp (e.g., <code>1479816991.349</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatapoint withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @see MetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @return The unit.
     * @see MetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public MetricDatapoint withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @see MetricUnit
     */

    public void setUnit(MetricUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public MetricDatapoint withUnit(MetricUnit unit) {
        this.unit = unit.toString();
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
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getSampleCount() != null)
            sb.append("SampleCount: ").append(getSampleCount()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDatapoint == false)
            return false;
        MetricDatapoint other = (MetricDatapoint) obj;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getSampleCount() == null ^ this.getSampleCount() == null)
            return false;
        if (other.getSampleCount() != null && other.getSampleCount().equals(this.getSampleCount()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public MetricDatapoint clone() {
        try {
            return (MetricDatapoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.MetricDatapointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
